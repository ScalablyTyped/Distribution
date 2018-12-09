package typings
package fabricLib.fabricDashImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(fabricLib.fabricDashImplMod.IITextOptions because Would inherit conflicting mutable fields List(cornerColor, transparentCorners, lockScalingX, shadow, hasControls, backgroundColor, name, includeDefaultValues, hasRotatingPoint, cornerSize, perPixelTargetFind, originX, scaleY, aCoords, lockMovementY, visible, transformMatrix, centeredRotation, angle, evented, stroke, strokeDashArray, data, left, height, centeredScaling, strokeLineCap, hoverCursor, skewX, strokeMiterLimit, lockUniScaling, borderDashArray, selectable, strokeLineJoin, skewY, objectCaching, cornerStrokeColor, flipX, fill, cornerDashArray, rotatingPointOffset, borderScaleFactor, opacity, globalCompositeOperation, padding, `type`, cornerStyle, lockScalingFlip, hasBorders, width, top, lockMovementX, lockRotation, clipTo, strokeWidth, flipY, originY, borderColor, scaleX, lockScalingY, borderOpacityWhenMoving, fillRule, minScaleLimit, path, underline, textDecoration, fontStyle, text, textAlign, fontFamily, lineHeight, overline, fontSize, textBackgroundColor, linethrough, useNative, charSpacing, fontWeight))*/
@JSImport("fabric/fabric-impl", "IText")
@js.native
class IText protected () extends Text {
  /**
  	 * Constructor
  	 * @param text Text string
  	 * @param [options] Options object
  	 */
  def this(text: java.lang.String) = this()
  /**
  	 * Constructor
  	 * @param text Text string
  	 * @param [options] Options object
  	 */
  def this(text: java.lang.String, options: IITextOptions) = this()
  /**
  	 * Aborts cursor animation and clears all timeouts
  	 */
  def abortCursorAnimation(): scala.Unit = js.native
  /**
  	 * Enters editing state
  	 */
  def enterEditing(): IText = js.native
  /**
  	 * Exits from editing state
  	 * @return thisArg
  	 * @chainable
  	 */
  def exitEditing(): IText = js.native
  /**
  	 * Find new selection index representing start of current line according to current selection index
  	 * @param startFrom Current selection index
  	 */
  def findLineBoundaryLeft(startFrom: scala.Double): scala.Double = js.native
  /**
  	 * Find new selection index representing end of current line according to current selection index
  	 * @param startFrom Current selection index
  	 */
  def findLineBoundaryRight(startFrom: scala.Double): scala.Double = js.native
  /**
  	 * Find new selection index representing start of current word according to current selection index
  	 * @param startFrom Surrent selection index
  	 * @return New selection index
  	 */
  def findWordBoundaryLeft(startFrom: scala.Double): scala.Double = js.native
  /**
  	 * Find new selection index representing end of current word according to current selection index
  	 * @param startFrom Current selection index
  	 * @return New selection index
  	 */
  def findWordBoundaryRight(startFrom: scala.Double): scala.Double = js.native
  /**
  	 * Returns 2d representation (lineIndex and charIndex) of cursor (or selection start)
  	 * @param [selectionStart] Optional index. When not given, current selectionStart is used.
  	 */
  def get2DCursorLocation(): scala.Unit = js.native
  /**
  	 * Returns 2d representation (lineIndex and charIndex) of cursor (or selection start)
  	 * @param [selectionStart] Optional index. When not given, current selectionStart is used.
  	 */
  def get2DCursorLocation(selectionStart: scala.Double): scala.Unit = js.native
  /**
  	 * Returns color (fill) of char at the current cursor
  	 * @param lineIndex Line index
  	 * @param charIndex Char index
  	 * @return Character color (fill)
  	 */
  def getCurrentCharColor(lineIndex: scala.Double, charIndex: scala.Double): java.lang.String = js.native
  /**
  	 * Returns fontSize of char at the current cursor
  	 * @param lineIndex Line index
  	 * @param charIndex Char index
  	 * @return Character font size
  	 */
  def getCurrentCharFontSize(lineIndex: scala.Double, charIndex: scala.Double): scala.Double = js.native
  /**
  	 * Returns complete style of char at the current cursor
  	 * @param lineIndex Line index
  	 * @param charIndex Char index
  	 * @return Character style
  	 */
  def getCurrentCharStyle(lineIndex: scala.Double, charIndex: scala.Double): js.Any = js.native
  /**
  	 * Returns number of newlines in selected text
  	 */
  def getNumNewLinesInSelectedText(): scala.Double = js.native
  /**
  	 * Returns selected text
  	 */
  def getSelectedText(): java.lang.String = js.native
  /**
  	 * Gets style of a current selection/cursor (at the start position)
  	 * @param [startIndex] Start index to get styles at
  	 * @param [endIndex] End index to get styles at
  	 * @return styles Style object at a specified (or current) index
  	 */
  def getSelectionStyles(startIndex: scala.Double, endIndex: scala.Double): js.Any = js.native
  /**
  	 * Gets style of a current selection/cursor (at the start position)
  	 * @param [startIndex] Start index to get styles at
  	 * @param [endIndex] End index to get styles at
  	 * @return styles Style object at a specified (or current) index
  	 */
  def getSelectionStyles(startIndex: scala.Double, endIndex: scala.Double, complete: scala.Boolean): js.Any = js.native
  /**
  	 * Initializes "added" event handler
  	 */
  def initAddedHandler(): scala.Unit = js.native
  // functions from itext behavior mixin
  // ------------------------------------------------------------------------------------------------------------------------
  /**
  	 * Initializes all the interactive behavior of IText
  	 */
  def initBehavior(): scala.Unit = js.native
  /**
  	 * Initializes delayed cursor
  	 */
  def initDelayedCursor(restart: scala.Boolean): scala.Unit = js.native
  /**
  	 * Initializes "mousemove" event handler
  	 */
  def initMouseMoveHandler(): scala.Unit = js.native
  def initRemovedHandler(): scala.Unit = js.native
  /**
  	 * Initializes "selected" event handler
  	 */
  def initSelectedHandler(): scala.Unit = js.native
  /**
  	 * Inserts style object for a given line/char index
  	 * @param lineIndex Index of a line
  	 * @param charIndex Index of a char
  	 * @param [style] Style object to insert, if given
  	 */
  def insertCharStyleObject(lineIndex: scala.Double, charIndex: scala.Double, isEndOfLine: scala.Boolean): scala.Unit = js.native
  /**
  	 * Inserts a character where cursor is (replacing selection if one exists)
  	 * @param _chars Characters to insert
  	 */
  def insertChars(_chars: java.lang.String): scala.Unit = js.native
  /**
  	 * Inserts a character where cursor is (replacing selection if one exists)
  	 * @param _chars Characters to insert
  	 */
  def insertChars(_chars: java.lang.String, useCopiedStyle: scala.Boolean): scala.Unit = js.native
  /**
  	 * Inserts new line
  	 */
  def insertNewline(): scala.Unit = js.native
  /**
  	 * Inserts new style object
  	 * @param lineIndex Index of a line
  	 * @param charIndex Index of a char
  	 * @param isEndOfLine True if it's end of line
  	 */
  def insertNewlineStyleObject(lineIndex: scala.Double, charIndex: scala.Double, isEndOfLine: scala.Boolean): scala.Unit = js.native
  /**
  	 * Inserts style object(s)
  	 * @param _chars Characters at the location where style is inserted
  	 * @param isEndOfLine True if it's end of line
  	 * @param [useCopiedStyle] Style to insert
  	 */
  def insertStyleObjects(_chars: java.lang.String, isEndOfLine: scala.Boolean): scala.Unit = js.native
  /**
  	 * Inserts style object(s)
  	 * @param _chars Characters at the location where style is inserted
  	 * @param isEndOfLine True if it's end of line
  	 * @param [useCopiedStyle] Style to insert
  	 */
  def insertStyleObjects(_chars: java.lang.String, isEndOfLine: scala.Boolean, useCopiedStyle: scala.Boolean): scala.Unit = js.native
  /**
       * Returns true if object has no styling or no styling in a line
       * @param {Number} lineIndex , lineIndex is on wrapped lines.
  	 */
  def isEmptyStyles(lineIndex: scala.Double): scala.Boolean = js.native
  /**
  	 * Removes style object
  	 * @param isBeginningOfLine True if cursor is at the beginning of line
  	 * @param [index] Optional index. When not given, current selectionStart is used.
  	 */
  def removeStyleObject(isBeginningOfLine: scala.Boolean): scala.Unit = js.native
  /**
  	 * Removes style object
  	 * @param isBeginningOfLine True if cursor is at the beginning of line
  	 * @param [index] Optional index. When not given, current selectionStart is used.
  	 */
  def removeStyleObject(isBeginningOfLine: scala.Boolean, index: scala.Double): scala.Unit = js.native
  /**
  	 * Renders cursor
  	 */
  def renderCursor(boundaries: js.Any): scala.Unit = js.native
  /**
  	 * Renders cursor or selection (depending on what exists)
  	 */
  def renderCursorOrSelection(): scala.Unit = js.native
  /**
  	 * Renders text selection
  	 * @param chars Array of characters
  	 * @param boundaries Object with left/top/leftOffset/topOffset
  	 */
  def renderSelection(chars: js.Array[java.lang.String], boundaries: js.Any): scala.Unit = js.native
  /**
  	 * Finds index corresponding to beginning or end of a word
  	 * @param selectionStart Index of a character
  	 * @param direction: 1 or -1
  	 */
  def searchWordBoundary(selectionStart: scala.Double, direction: scala.Double): scala.Double = js.native
  /**
  	 * Selects entire text
  	 */
  def selectAll(): scala.Unit = js.native
  /**
  	 * Selects a line based on the index
  	 * @param selectionStart Index of a character
  	 */
  def selectLine(selectionStart: scala.Double): scala.Unit = js.native
  /**
  	 * Selects a word based on the index
  	 * @param selectionStart Index of a character
  	 */
  def selectWord(selectionStart: scala.Double): scala.Unit = js.native
  /**
  	 * Sets selection end (right boundary of a selection)
  	 * @param index Index to set selection end to
  	 */
  def setSelectionEnd(index: scala.Double): scala.Unit = js.native
  /**
  	 * Sets selection start (left boundary of a selection)
  	 * @param index Index to set selection start to
  	 */
  def setSelectionStart(index: scala.Double): scala.Unit = js.native
  /**
  	 * Sets style of a current selection
  	 * @param [styles] Styles object
  	 * @return thisArg
  	 * @chainable
  	 */
  def setSelectionStyles(styles: js.Any): Text = js.native
  /**
  	 * Shifts line styles up or down
  	 * @param lineIndex Index of a line
  	 * @param offset Can be -1 or +1
  	 */
  def shiftLineStyles(lineIndex: scala.Double, offset: scala.Double): scala.Unit = js.native
}

@JSImport("fabric/fabric-impl", "IText")
@js.native
object IText extends js.Object {
  /**
  	 * Returns fabric.IText instance from an object representation
  	 * @param object Object to create an instance from
  	 */
  def fromObject(`object`: js.Any): fabricLib.fabricDashImplMod.IText = js.native
}

