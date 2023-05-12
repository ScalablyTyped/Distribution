package typings.fabric.fabricImplMod

import typings.fabric.anon.CharHeight
import typings.fabric.anon.SelectionEnd
import typings.fabric.anon.X
import typings.std.CanvasRenderingContext2D
import typings.std.Event
import typings.std.HTMLTextAreaElement
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fabric.fabricImplMod.IObjectOptions because Already inherited
- typings.fabric.fabricImplMod.TextOptions because Already inherited
- typings.fabric.fabricImplMod.ITextOptions because var conflicts: aCoords, absolutePositioned, angle, backgroundColor, borderColor, borderDashArray, borderOpacityWhenMoving, borderScaleFactor, cacheProperties, canvas, centeredRotation, centeredScaling, charSpacing, clipPath, cornerColor, cornerDashArray, cornerSize, cornerStrokeColor, cornerStyle, data, deltaY, direction, dirty, evented, excludeFromExport, fill, fillRule, flipX, flipY, fontFamily, fontSize, fontStyle, fontWeight, globalCompositeOperation, group, hasBorders, hasControls, hasRotatingPoint, height, hoverCursor, includeDefaultValues, inverted, left, lineHeight, linethrough, lockMovementX, lockMovementY, lockRotation, lockScalingFlip, lockScalingX, lockScalingY, lockSkewingX, lockSkewingY, lockUniScaling, matrixCache, minScaleLimit, moveCursor, name, noScaleCache, oCoords, objectCaching, opacity, originX, originY, overline, ownMatrixCache, padding, paintFirst, perPixelTargetFind, rotatingPointOffset, scaleX, scaleY, selectable, selectionBackgroundColor, shadow, skewX, skewY, snapAngle, snapThreshold, stateProperties, statefullCache, stroke, strokeDashArray, strokeDashOffset, strokeLineCap, strokeLineJoin, strokeMiterLimit, strokeUniform, strokeWidth, styles, subscript, superscript, text, textAlign, textBackgroundColor, top, transparentCorners, `type`, underline, visible, width. Inlined selectionStart, selectionEnd, selectionColor, selected, isEditing, editable, editingBorderColor, cursorWidth, cursorColor, cursorDelay, cursorDuration, caching, inCompositionMode, path, useNative, ctrlKeysMapDown, ctrlKeysMapUp, keysMap, hiddenTextarea */ @JSImport("fabric/fabric-impl", "IText")
@js.native
open class IText protected () extends Text {
  /**
    * Constructor
    * @param text Text string
    * @param [options] Options object
    */
  def this(text: String) = this()
  def this(text: String, options: ITextOptions) = this()
  
  /**
    * @return {Object} style contains style for hiddenTextarea
    */
  def _calcTextareaPosition(): CharHeight = js.native
  
  /**
    */
  var _currentCursorOpacity: Double = js.native
  
  /**
    */
  def _getNewSelectionStartFromOffset(mouseOffset: X, prevWidth: Double, width: Double, index: Double, jlen: Double): Double = js.native
  
  /**
    * Default event handler for the basic functionalities needed on _mouseDown
    * can be overridden to do something different.
    * Scope of this implementation is: find the click position, set selectionStart
    * find selectionEnd, initialize the drawing of either cursor or selection area
    * @param {Object} Options (seems to have an event `e` parameter
    */
  def _mouseDownHandler(options: Any): Unit = js.native
  
  /**
    */
  var _reSpace: js.RegExp = js.native
  
  /**
    */
  def _updateTextarea(): Unit = js.native
  
  /**
    * Aborts cursor animation and clears all timeouts
    */
  def abortCursorAnimation(): Unit = js.native
  
  /**
    * Indicates whether internal text char widths can be cached
    */
  var caching: js.UndefOr[Boolean] = js.native
  
  /**
    * Prepare and clean the contextTop
    */
  def clearContextTop(): Unit = js.native
  def clearContextTop(skipRestore: Boolean): Unit = js.native
  
  /**
    * Copies selected text
    */
  def copy(): Unit = js.native
  
  /**
    * For functionalities on keyDown + ctrl || cmd
    */
  var ctrlKeysMapDown: js.UndefOr[Any] = js.native
  
  /**
    * For functionalities on keyUp + ctrl || cmd
    */
  var ctrlKeysMapUp: js.UndefOr[Any] = js.native
  
  /**
    * Color of default cursor (when not overwritten by character style)
    */
  var cursorColor: js.UndefOr[String] = js.native
  
  /**
    * Delay between cursor blink (in ms)
    */
  var cursorDelay: js.UndefOr[Double] = js.native
  
  /**
    * Duration of cursor fadein (in ms)
    */
  var cursorDuration: js.UndefOr[Double] = js.native
  
  /**
    * Width of cursor (in px)
    */
  var cursorWidth: js.UndefOr[Double] = js.native
  
  /**
    * Indicates whether a text can be edited
    */
  var editable: js.UndefOr[Boolean] = js.native
  
  /**
    * Border color of text object while it's in editing mode
    */
  var editingBorderColor: js.UndefOr[String] = js.native
  
  /**
    * Enters editing state
    * @return {fabric.IText} thisArg
    * @chainable
    */
  def enterEditing(): IText = js.native
  def enterEditing(e: MouseEvent): IText = js.native
  
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
  def findLineBoundaryLeft(startFrom: Double): Double = js.native
  
  /**
    * Find new selection index representing end of current line according to current selection index
    * @param {Number} startFrom Current selection index
    * @return {Number} New selection index
    */
  def findLineBoundaryRight(startFrom: Double): Double = js.native
  
  /**
    * Find new selection index representing start of current word according to current selection index
    * @param {Number} startFrom Surrent selection index
    * @return {Number} New selection index
    */
  def findWordBoundaryLeft(startFrom: Double): Double = js.native
  
  /**
    * Find new selection index representing end of current word according to current selection index
    * @param {Number} startFrom Current selection index
    * @return {Number} New selection index
    */
  def findWordBoundaryRight(startFrom: Double): Double = js.native
  
  /**
    * convert from fabric to textarea values
    */
  def fromGraphemeToStringSelection(start: Double, end: Double, _text: String): SelectionEnd = js.native
  
  var fromPaste: Boolean = js.native
  
  /**
    * convert from textarea to grapheme indexes
    */
  def fromStringToGraphemeSelection(start: Double, end: Double, text: String): SelectionEnd = js.native
  
  /**
    * High level function to know the color of the cursor.
    * the currentChar is the one that precedes the cursor
    * Returns color (fill) of char at the current cursor
    * @return {String} Character color (fill)
    */
  def getCurrentCharColor(): String = js.native
  
  /**
    * High level function to know the height of the cursor.
    * the currentChar is the one that precedes the cursor
    * Returns fontSize of char at the current cursor
    * @return {Number} Character font size
    */
  def getCurrentCharFontSize(): Double = js.native
  
  /**
    * Gets start offset of a selection
    * @param {Event} e Event object
    * @param {Boolean} isRight
    * @return {Number}
    */
  def getDownCursorOffset(e: Event): Double = js.native
  def getDownCursorOffset(e: Event, isRight: Boolean): Double = js.native
  
  /**
    * Returns selected text
    * @return {String}
    */
  def getSelectedText(): String = js.native
  
  /**
    * Returns index of a character corresponding to where an object was clicked
    * @param {Event} e Event object
    * @return {Number} Index of a character
    */
  def getSelectionStartFromPointer(e: Event): Double = js.native
  
  /**
    * @param {Event} e Event object
    * @param {Boolean} isRight
    * @return {Number}
    */
  def getUpCursorOffset(e: Event): Double = js.native
  def getUpCursorOffset(e: Event, isRight: Boolean): Double = js.native
  
  /**
    * Exposes underlying hidden text area
    */
  var hiddenTextarea: js.UndefOr[HTMLTextAreaElement] = js.native
  
  /**
    * Helps determining when the text is in composition, so that the cursor
    * rendering is altered.
    */
  var inCompositionMode: js.UndefOr[Boolean] = js.native
  
  /**
    * Initializes "added" event handler
    */
  def initAddedHandler(): Unit = js.native
  
  /**
    * Initializes all the interactive behavior of IText
    */
  def initBehavior(): Unit = js.native
  
  /**
    * Initializes double and triple click event handlers
    */
  def initClicks(): Unit = js.native
  
  /**
    * Initializes event handlers related to cursor or selection
    */
  def initCursorSelectionHandlers(): Unit = js.native
  
  /**
    * Initializes delayed cursor
    */
  def initDelayedCursor(): Unit = js.native
  
  /**
    * Initializes "dbclick" event handler
    */
  def initDoubleClickSimulation(): Unit = js.native
  
  /**
    * Initializes hidden textarea (needed to bring up keyboard in iOS)
    */
  def initHiddenTextarea(): Unit = js.native
  
  /**
    * Initializes "mousemove" event handler
    */
  def initMouseMoveHandler(): Unit = js.native
  
  /**
    * Initializes "mousedown" event handler
    */
  def initMousedownHandler(): Unit = js.native
  
  /**
    * Initializes "mouseup" event handler
    */
  def initMouseupHandler(): Unit = js.native
  
  /**
    * Inserts style object for a given line/char index
    * @param {Number} lineIndex Index of a line
    * @param {Number} charIndex Index of a char
    * @param {Number} quantity number Style object to insert, if given
    * @param {Array} copiedStyle array of style objecs
    */
  def insertCharStyleObject(lineIndex: Double, charIndex: Double, quantity: Double, copiedStyle: js.Array[Any]): Unit = js.native
  
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
  def insertChars(text: String, style: js.Array[Any], start: Double, end: Double): Unit = js.native
  
  /**
    * Inserts style object(s)
    * @param {Array} insertedText Characters at the location where style is inserted
    * @param {Number} start cursor index for inserting style
    * @param {Array} [copiedStyle] array of style objects to insert.
    */
  def insertNewStyleBlock(insertedText: js.Array[Any], start: Double): Unit = js.native
  def insertNewStyleBlock(insertedText: js.Array[Any], start: Double, copiedStyle: js.Array[Any]): Unit = js.native
  
  /**
    * Inserts new style object
    * @param {Number} lineIndex Index of a line
    * @param {Number} charIndex Index of a char
    * @param {Number} qty number of lines to add
    * @param {Array} copiedStyle Array of objects styles
    */
  def insertNewlineStyleObject(lineIndex: Double, charIndex: Double, qty: Double, copiedStyle: js.Array[Any]): Unit = js.native
  
  /**
    * Indicates whether text is in editing mode
    */
  var isEditing: js.UndefOr[Boolean] = js.native
  
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
  var keysMap: js.UndefOr[Any] = js.native
  
  /**
    * Moves cursor down
    * @param {Event} e Event object
    */
  def moveCursorDown(e: Event): Unit = js.native
  
  /**
    * Moves cursor left
    * @param {Event} e Event object
    */
  def moveCursorLeft(e: Event): Unit = js.native
  
  /**
    * Moves cursor left while keeping selection
    * @param {Event} e
    */
  def moveCursorLeftWithShift(e: Event): Unit = js.native
  
  /**
    * Moves cursor left without keeping selection
    * @param {Event} e
    */
  def moveCursorLeftWithoutShift(e: Event): Unit = js.native
  
  /**
    * Moves cursor right
    * @param {Event} e Event object
    */
  def moveCursorRight(e: Event): Unit = js.native
  
  /**
    * Moves cursor right while keeping selection
    * @param {Event} e
    */
  def moveCursorRightWithShift(e: Event): Unit = js.native
  
  /**
    * Moves cursor right without keeping selection
    * @param {Event} e Event object
    */
  def moveCursorRightWithoutShift(e: Event): Unit = js.native
  
  /**
    * Moves cursor up
    * @param {Event} e Event object
    */
  def moveCursorUp(e: Event): Unit = js.native
  
  /**
    * Moves cursor with shift
    * @param {Number} offset
    */
  def moveCursorWithShift(offset: Double): Unit = js.native
  
  /**
    * Moves cursor up without shift
    * @param {Number} offset
    */
  def moveCursorWithoutShift(offset: Double): Unit = js.native
  
  /**
    * Composition end
    */
  def onCompositionEnd(): Unit = js.native
  
  /**
    * Composition start
    */
  def onCompositionStart(): Unit = js.native
  
  /**
    * Handles onInput event
    * @param {Event} e Event object
    */
  def onInput(e: Event): Unit = js.native
  
  /**
    * Handles keyup event
    * @param {Event} e Event object
    */
  def onKeyDown(e: Event): Unit = js.native
  
  /**
    * Handles keyup event
    * We handle KeyUp because ie11 and edge have difficulties copy/pasting
    * if a copy/cut event fired, keyup is dismissed
    * @param {Event} e Event object
    */
  def onKeyUp(e: Event): Unit = js.native
  
  /**
    * Pastes text
    */
  def paste(): Unit = js.native
  
  var path: js.UndefOr[String] = js.native
  
  /**
    * Removes characters from start/end
    * start/end ar per grapheme position in _text array.
    *
    * @param {Number} start
    * @param {Number} end default to start + 1
    */
  def removeChars(start: Double, end: Double): Unit = js.native
  
  /**
    * remove and reflow a style block from start to end.
    * @param {Number} start linear start position for removal (included in removal)
    * @param {Number} end linear end position for removal ( excluded from removal )
    */
  def removeStyleFromTo(start: Double, end: Double): Unit = js.native
  
  /**
    * Renders cursor
    * @param {Object} boundaries
    * @param {CanvasRenderingContext2D} ctx transformed context to draw on
    */
  def renderCursor(boundaries: Any, ctx: CanvasRenderingContext2D): Unit = js.native
  
  /**
    * Renders cursor or selection (depending on what exists)
    */
  def renderCursorOrSelection(): Unit = js.native
  
  /**
    * Renders text selection
    * @param {Object} boundaries Object with left/top/leftOffset/topOffset
    * @param {CanvasRenderingContext2D} ctx transformed context to draw on
    */
  def renderSelection(boundaries: Any, ctx: CanvasRenderingContext2D): Unit = js.native
  
  /**
    * Finds index corresponding to beginning or end of a word
    * @param {Number} selectionStart Index of a character
    * @param {Number} direction 1 or -1
    * @return {Number} Index of the beginning or end of a word
    */
  def searchWordBoundary(selectionStart: Double, direction: Double): Double = js.native
  
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
  def selectLine(selectionStart: Double): IText = js.native
  
  /**
    * Selects a word based on the index
    * @param {Number} selectionStart Index of a character
    */
  def selectWord(selectionStart: Double): Unit = js.native
  
  /**
    * Indicates whether text is selected
    */
  var selected: js.UndefOr[Boolean] = js.native
  
  /**
    * Color of text selection
    */
  var selectionColor: js.UndefOr[String] = js.native
  
  /**
    * Index where text selection ends
    */
  var selectionEnd: js.UndefOr[Double] = js.native
  
  /**
    * Index where text selection starts (or where cursor is when there is no selection)
    */
  var selectionStart: js.UndefOr[Double] = js.native
  
  /**
    * Changes cursor location in a text depending on passed pointer (x/y) object
    * @param {Event} e Event object
    */
  def setCursorByClick(e: Event): Unit = js.native
  
  /**
    * Sets selection end (right boundary of a selection)
    * @param {Number} index Index to set selection end to
    */
  def setSelectionEnd(index: Double): Unit = js.native
  
  /**
    * Sets selection start (left boundary of a selection)
    * @param {Number} index Index to set selection start to
    */
  def setSelectionStart(index: Double): Unit = js.native
  
  /**
    * Set the selectionStart and selectionEnd according to the ne postion of cursor
    * mimic the key - mouse navigation when shift is pressed.
    */
  def setSelectionStartEndWithShift(start: Double, end: Double, newSelection: Double): Unit = js.native
  
  /**
    * Shifts line styles up or down
    * @param {Number} lineIndex Index of a line
    * @param {Number} offset Can any number?
    */
  def shiftLineStyles(lineIndex: Double, offset: Double): Unit = js.native
  
  /**
    */
  def updateFromTextArea(): Unit = js.native
  
  var useNative: js.UndefOr[Boolean] = js.native
}
/* static members */
object IText {
  
  @JSImport("fabric/fabric-impl", "IText")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns fabric.IText instance from an object representation
    * @static
    * @memberOf fabric.IText
    * @param {Object} object Object to create an instance from
    * @param {function} [callback] invoked with new instance as argument
    */
  inline def fromObject(`object`: Any): IText = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[IText]
  inline def fromObject(`object`: Any, callback: js.Function): IText = (^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[IText]
}
