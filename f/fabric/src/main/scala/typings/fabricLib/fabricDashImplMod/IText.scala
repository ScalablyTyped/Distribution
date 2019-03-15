package typings
package fabricLib.fabricDashImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- fabricLib.fabricDashImplMod.ITextOptions because var conflicts: aCoords, absolutePositioned, angle, backgroundColor, borderColor, borderDashArray, borderOpacityWhenMoving, borderScaleFactor, cacheProperties, centeredRotation, centeredScaling, charSpacing, clipPath, clipTo, cornerColor, cornerDashArray, cornerSize, cornerStrokeColor, cornerStyle, data, deltaY, dirty, evented, excludeFromExport, fill, fillRule, flipX, flipY, fontFamily, fontSize, fontStyle, fontWeight, globalCompositeOperation, hasBorders, hasControls, hasRotatingPoint, height, hoverCursor, includeDefaultValues, inverted, left, lineHeight, linethrough, lockMovementX, lockMovementY, lockRotation, lockScalingFlip, lockScalingX, lockScalingY, lockSkewingX, lockSkewingY, lockUniScaling, matrixCache, minScaleLimit, moveCursor, name, noScaleCache, oCoords, objectCaching, opacity, originX, originY, overline, ownMatrixCache, padding, paintFirst, perPixelTargetFind, rotatingPointOffset, scaleX, scaleY, selectable, selectionBackgroundColor, shadow, skewX, skewY, stateProperties, statefullCache, stroke, strokeDashArray, strokeDashOffset, strokeLineCap, strokeLineJoin, strokeMiterLimit, strokeUniform, strokeWidth, styles, subscript, superscript, text, textAlign, textBackgroundColor, top, transformMatrix, transparentCorners, `type`, underline, visible, width. Inlined selectionStart, selectionEnd, selectionColor, isEditing, editable, editingBorderColor, cursorWidth, cursorColor, cursorDelay, cursorDuration, caching, inCompositionMode, path, useNative, ctrlKeysMapDown, ctrlKeysMapUp, keysMap */ @JSImport("fabric/fabric-impl", "IText")
@js.native
class IText protected () extends Text {
  /**
  	 * Constructor
  	 * @param text Text string
  	 * @param [options] Options object
  	 */
  def this(text: java.lang.String) = this()
  def this(text: java.lang.String, options: ITextOptions) = this()
  /**
  	 * Indicates whether internal text char widths can be cached
  	 * @type Boolean
  	 */
  var caching: js.UndefOr[scala.Boolean] = js.native
  /**
  	 * For functionalities on keyDown + ctrl || cmd
  	 */
  var ctrlKeysMapDown: js.UndefOr[js.Any] = js.native
  /**
  	 * For functionalities on keyUp + ctrl || cmd
  	 */
  var ctrlKeysMapUp: js.UndefOr[js.Any] = js.native
  /**
  	 * Color of default cursor (when not overwritten by character style)
  	 * @type String
  	 */
  var cursorColor: js.UndefOr[java.lang.String] = js.native
  /**
  	 * Delay between cursor blink (in ms)
  	 * @type Number
  	 */
  var cursorDelay: js.UndefOr[scala.Double] = js.native
  /**
  	 * Duration of cursor fadein (in ms)
  	 * @type Number
  	 */
  var cursorDuration: js.UndefOr[scala.Double] = js.native
  /**
  	 * Width of cursor (in px)
  	 * @type Number
  	 */
  var cursorWidth: js.UndefOr[scala.Double] = js.native
  /**
  	 * Indicates whether a text can be edited
  	 * @type Boolean
  	 */
  var editable: js.UndefOr[scala.Boolean] = js.native
  /**
  	 * Border color of text object while it's in editing mode
  	 * @type String
  	 */
  var editingBorderColor: js.UndefOr[java.lang.String] = js.native
  /**
  	 * Helps determining when the text is in composition, so that the cursor
  	 * rendering is altered.
  	 */
  var inCompositionMode: js.UndefOr[scala.Boolean] = js.native
  /**
  	 * Indicates whether text is in editing mode
  	 * @type Boolean
  	 */
  var isEditing: js.UndefOr[scala.Boolean] = js.native
  /**
  	 * For functionalities on keyDown
  	 * Map a special key to a function of the instance/prototype
  	 * If you need different behaviour for ESC or TAB or arrows, you have to change
  	 * this map setting the name of a function that you build on the fabric.Itext or
  	 * your prototype.
  	 * the map change will affect all Instances unless you need for only some text Instances
  	 * in that case you have to clone this object and assign your Instance.
  	 * this.keysMap = fabric.util.object.clone(this.keysMap);
  	 * The function must be in fabric.Itext.prototype.myFunction And will receive event as args[0]
  	 */
  var keysMap: js.UndefOr[js.Any] = js.native
  var path: js.UndefOr[java.lang.String] = js.native
  /**
  	 * Color of text selection
  	 * @type String
  	 */
  var selectionColor: js.UndefOr[java.lang.String] = js.native
  /**
  	 * Index where text selection ends
  	 * @type Number
  	 */
  var selectionEnd: js.UndefOr[scala.Double] = js.native
  /**
  	 * Index where text selection starts (or where cursor is when there is no selection)
  	 * @type Number
  	 */
  var selectionStart: js.UndefOr[scala.Double] = js.native
  var useNative: js.UndefOr[scala.Boolean] = js.native
  /**
  	 * @private
  	 */
  def _getNewSelectionStartFromOffset(
    mouseOffset: fabricLib.Anon_X,
    prevWidth: scala.Double,
    width: scala.Double,
    index: scala.Double,
    jlen: scala.Double
  ): scala.Double = js.native
  /**
  	 * @private
  	 * @param {CanvasRenderingContext2D} ctx Context to render on
  	 */
  def _render(ctx: stdLib.CanvasRenderingContext2D): scala.Unit = js.native
  /**
  	 * Aborts cursor animation and clears all timeouts
  	 */
  def abortCursorAnimation(): scala.Unit = js.native
  /**
  	 * Prepare and clean the contextTop
  	 */
  def clearContextTop(): scala.Unit = js.native
  def clearContextTop(skipRestore: scala.Boolean): scala.Unit = js.native
  /**
  	 * Copies selected text
  	 */
  def copy(): scala.Unit = js.native
  /**
  	 * Enters editing state
  	 * @return {fabric.IText} thisArg
  	 * @chainable
  	 */
  def enterEditing(): IText = js.native
  /**
  	 * Exits from editing state
  	 * @return {fabric.IText} thisArg
  	 * @chainable
  	 */
  def exitEditing(): IText = js.native
  /**
  	 * Find new selection index representing start of current line according to current selection index
  	 * @param {Number} startFrom Current selection index
  	 * @return {Number} New selection index
  	 */
  def findLineBoundaryLeft(startFrom: scala.Double): scala.Double = js.native
  /**
  	 * Find new selection index representing end of current line according to current selection index
  	 * @param {Number} startFrom Current selection index
  	 * @return {Number} New selection index
  	 */
  def findLineBoundaryRight(startFrom: scala.Double): scala.Double = js.native
  /**
  	 * Find new selection index representing start of current word according to current selection index
  	 * @param {Number} startFrom Surrent selection index
  	 * @return {Number} New selection index
  	 */
  def findWordBoundaryLeft(startFrom: scala.Double): scala.Double = js.native
  /**
  	 * Find new selection index representing end of current word according to current selection index
  	 * @param {Number} startFrom Current selection index
  	 * @return {Number} New selection index
  	 */
  def findWordBoundaryRight(startFrom: scala.Double): scala.Double = js.native
  /**
  	 * convert from fabric to textarea values
  	 */
  def fromGraphemeToStringSelection(start: scala.Double, end: scala.Double, _text: java.lang.String): fabricLib.Anon_SelectionEnd = js.native
  /**
  	 * convert from textarea to grapheme indexes
  	 */
  def fromStringToGraphemeSelection(start: scala.Double, end: scala.Double, text: java.lang.String): fabricLib.Anon_SelectionEnd = js.native
  /**
  	 * High level function to know the color of the cursor.
  	 * the currentChar is the one that precedes the cursor
  	 * Returns color (fill) of char at the current cursor
  	 * @return {String} Character color (fill)
  	 */
  def getCurrentCharColor(): java.lang.String = js.native
  /**
  	 * High level function to know the height of the cursor.
  	 * the currentChar is the one that precedes the cursor
  	 * Returns fontSize of char at the current cursor
  	 * @return {Number} Character font size
  	 */
  def getCurrentCharFontSize(): scala.Double = js.native
  /**
  	 * Gets start offset of a selection
  	 * @param {Event} e Event object
  	 * @param {Boolean} isRight
  	 * @return {Number}
  	 */
  def getDownCursorOffset(e: stdLib.Event): scala.Double = js.native
  def getDownCursorOffset(e: stdLib.Event, isRight: scala.Boolean): scala.Double = js.native
  /**
  	 * Returns selected text
  	 * @return {String}
  	 */
  def getSelectedText(): java.lang.String = js.native
  /**
  	 * Returns index of a character corresponding to where an object was clicked
  	 * @param {Event} e Event object
  	 * @return {Number} Index of a character
  	 */
  def getSelectionStartFromPointer(e: stdLib.Event): scala.Double = js.native
  /**
  	 * @param {Event} e Event object
  	 * @param {Boolean} isRight
  	 * @return {Number}
  	 */
  def getUpCursorOffset(e: stdLib.Event): scala.Double = js.native
  def getUpCursorOffset(e: stdLib.Event, isRight: scala.Boolean): scala.Double = js.native
  /**
  	 * Initializes "added" event handler
  	 */
  def initAddedHandler(): scala.Unit = js.native
  /**
  	 * Initializes all the interactive behavior of IText
  	 */
  def initBehavior(): scala.Unit = js.native
  /**
  	 * Initializes double and triple click event handlers
  	 */
  def initClicks(): scala.Unit = js.native
  /**
  	 * Initializes event handlers related to cursor or selection
  	 */
  def initCursorSelectionHandlers(): scala.Unit = js.native
  /**
  	 * Initializes delayed cursor
  	 */
  def initDelayedCursor(): scala.Unit = js.native
  /**
  	 * Initializes "dbclick" event handler
  	 */
  def initDoubleClickSimulation(): scala.Unit = js.native
  /**
  	 * Initializes hidden textarea (needed to bring up keyboard in iOS)
  	 */
  def initHiddenTextarea(): scala.Unit = js.native
  /**
  	 * Initializes "mousemove" event handler
  	 */
  def initMouseMoveHandler(): scala.Unit = js.native
  /**
  	 * Initializes "mousedown" event handler
  	 */
  def initMousedownHandler(): scala.Unit = js.native
  /**
  	 * Initializes "mouseup" event handler
  	 */
  def initMouseupHandler(): scala.Unit = js.native
  /**
  	 * Inserts style object for a given line/char index
  	 * @param {Number} lineIndex Index of a line
  	 * @param {Number} charIndex Index of a char
  	 * @param {Number} quantity number Style object to insert, if given
  	 * @param {Array} copiedStyle array of style objecs
  	 */
  def insertCharStyleObject(lineIndex: scala.Double, charIndex: scala.Double, quantity: scala.Double, copiedStyle: js.Array[_]): scala.Unit = js.native
  /**
  	 * insert characters at start position, before start position.
  	 * start  equal 1 it means the text get inserted between actual grapheme 0 and 1
  	 * if style array is provided, it must be as the same length of text in graphemes
  	 * if end is provided and is bigger than start, old text is replaced.
  	 * start/end ar per grapheme position in _text array.
  	 *
  	 * @param {String} text text to insert
  	 * @param {Array} style array of style objects
  	 * @param {Number} start
  	 * @param {Number} end default to start + 1
  	 */
  def insertChars(text: java.lang.String, style: js.Array[_], start: scala.Double, end: scala.Double): scala.Unit = js.native
  /**
  	 * Inserts style object(s)
  	 * @param {Array} insertedText Characters at the location where style is inserted
  	 * @param {Number} start cursor index for inserting style
  	 * @param {Array} [copiedStyle] array of style objects to insert.
  	 */
  def insertNewStyleBlock(insertedText: js.Array[_], start: scala.Double): scala.Unit = js.native
  def insertNewStyleBlock(insertedText: js.Array[_], start: scala.Double, copiedStyle: js.Array[_]): scala.Unit = js.native
  /**
  	 * Inserts new style object
  	 * @param {Number} lineIndex Index of a line
  	 * @param {Number} charIndex Index of a char
  	 * @param {Number} qty number of lines to add
  	 * @param {Array} copiedStyle Array of objects styles
  	 */
  def insertNewlineStyleObject(lineIndex: scala.Double, charIndex: scala.Double, qty: scala.Double, copiedStyle: js.Array[_]): scala.Unit = js.native
  /**
  	 * Moves cursor down
  	 * @param {Event} e Event object
  	 */
  def moveCursorDown(e: stdLib.Event): scala.Unit = js.native
  /**
  	 * Moves cursor left
  	 * @param {Event} e Event object
  	 */
  def moveCursorLeft(e: stdLib.Event): scala.Unit = js.native
  /**
  	 * Moves cursor left while keeping selection
  	 * @param {Event} e
  	 */
  def moveCursorLeftWithShift(e: stdLib.Event): scala.Unit = js.native
  /**
  	 * Moves cursor left without keeping selection
  	 * @param {Event} e
  	 */
  def moveCursorLeftWithoutShift(e: stdLib.Event): scala.Unit = js.native
  /**
  	 * Moves cursor right
  	 * @param {Event} e Event object
  	 */
  def moveCursorRight(e: stdLib.Event): scala.Unit = js.native
  /**
  	 * Moves cursor right while keeping selection
  	 * @param {Event} e
  	 */
  def moveCursorRightWithShift(e: stdLib.Event): scala.Unit = js.native
  /**
  	 * Moves cursor right without keeping selection
  	 * @param {Event} e Event object
  	 */
  def moveCursorRightWithoutShift(e: stdLib.Event): scala.Unit = js.native
  /**
  	 * Moves cursor up
  	 * @param {Event} e Event object
  	 */
  def moveCursorUp(e: stdLib.Event): scala.Unit = js.native
  /**
  	 * Moves cursor with shift
  	 * @param {Number} offset
  	 */
  def moveCursorWithShift(offset: scala.Double): scala.Unit = js.native
  /**
  	 * Moves cursor up without shift
  	 * @param {Number} offset
  	 */
  def moveCursorWithoutShift(offset: scala.Double): scala.Unit = js.native
  /**
  	 * Composition end
  	 */
  def onCompositionEnd(): scala.Unit = js.native
  /**
  	 * Composition start
  	 */
  def onCompositionStart(): scala.Unit = js.native
  /**
  	 * Handles onInput event
  	 * @param {Event} e Event object
  	 */
  def onInput(e: stdLib.Event): scala.Unit = js.native
  /**
  	 * Handles keyup event
  	 * @param {Event} e Event object
  	 */
  def onKeyDown(e: stdLib.Event): scala.Unit = js.native
  /**
  	 * Handles keyup event
  	 * We handle KeyUp because ie11 and edge have difficulties copy/pasting
  	 * if a copy/cut event fired, keyup is dismissed
  	 * @param {Event} e Event object
  	 */
  def onKeyUp(e: stdLib.Event): scala.Unit = js.native
  /**
  	 * Pastes text
  	 */
  def paste(): scala.Unit = js.native
  /**
  	 * Removes characters from start/end
  	 * start/end ar per grapheme position in _text array.
  	 *
  	 * @param {Number} start
  	 * @param {Number} end default to start + 1
  	 */
  def removeChars(start: scala.Double, end: scala.Double): scala.Unit = js.native
  /**
  	 * remove and reflow a style block from start to end.
  	 * @param {Number} start linear start position for removal (included in removal)
  	 * @param {Number} end linear end position for removal ( excluded from removal )
  	 */
  def removeStyleFromTo(start: scala.Double, end: scala.Double): scala.Unit = js.native
  /**
  	 * Renders cursor
  	 * @param {Object} boundaries
  	 * @param {CanvasRenderingContext2D} ctx transformed context to draw on
  	 */
  def renderCursor(boundaries: js.Any, ctx: stdLib.CanvasRenderingContext2D): scala.Unit = js.native
  /**
  	 * Renders cursor or selection (depending on what exists)
  	 */
  def renderCursorOrSelection(): scala.Unit = js.native
  /**
  	 * Renders text selection
  	 * @param {Object} boundaries Object with left/top/leftOffset/topOffset
  	 * @param {CanvasRenderingContext2D} ctx transformed context to draw on
  	 */
  def renderSelection(boundaries: js.Any, ctx: stdLib.CanvasRenderingContext2D): scala.Unit = js.native
  /**
  	 * Finds index corresponding to beginning or end of a word
  	 * @param {Number} selectionStart Index of a character
  	 * @param {Number} direction 1 or -1
  	 * @return {Number} Index of the beginning or end of a word
  	 */
  def searchWordBoundary(selectionStart: scala.Double, direction: scala.Double): scala.Double = js.native
  /**
  	 * Selects entire text
  	 * @return {fabric.IText} thisArg
  	 * @chainable
  	 */
  def selectAll(): IText = js.native
  /**
  	 * Selects a line based on the index
  	 * @param {Number} selectionStart Index of a character
  	 * @return {fabric.IText} thisArg
  	 * @chainable
  	 */
  def selectLine(selectionStart: scala.Double): IText = js.native
  /**
  	 * Selects a word based on the index
  	 * @param {Number} selectionStart Index of a character
  	 */
  def selectWord(selectionStart: scala.Double): scala.Unit = js.native
  /**
  	 * Changes cursor location in a text depending on passed pointer (x/y) object
  	 * @param {Event} e Event object
  	 */
  def setCursorByClick(e: stdLib.Event): scala.Unit = js.native
  /**
  	 * Sets selection end (right boundary of a selection)
  	 * @param {Number} index Index to set selection end to
  	 */
  def setSelectionEnd(index: scala.Double): scala.Unit = js.native
  /**
  	 * Sets selection start (left boundary of a selection)
  	 * @param {Number} index Index to set selection start to
  	 */
  def setSelectionStart(index: scala.Double): scala.Unit = js.native
  /**
  	 * Set the selectionStart and selectionEnd according to the ne postion of cursor
  	 * mimic the key - mouse navigation when shift is pressed.
  	 */
  def setSelectionStartEndWithShift(start: scala.Double, end: scala.Double, newSelection: scala.Double): scala.Unit = js.native
  /**
  	 * Shifts line styles up or down
  	 * @param {Number} lineIndex Index of a line
  	 * @param {Number} offset Can any number?
  	 */
  def shiftLineStyles(lineIndex: scala.Double, offset: scala.Double): scala.Unit = js.native
}

/* static members */
@JSImport("fabric/fabric-impl", "IText")
@js.native
object IText extends js.Object {
  /**
  	 * Returns fabric.IText instance from an object representation
  	 * @static
  	 * @memberOf fabric.IText
  	 * @param {Object} object Object to create an instance from
  	 * @param {function} [callback] invoked with new instance as argument
  	 */
  def fromObject(`object`: js.Any): fabricLib.fabricDashImplMod.IText = js.native
  def fromObject(`object`: js.Any, callback: js.Function): fabricLib.fabricDashImplMod.IText = js.native
}

