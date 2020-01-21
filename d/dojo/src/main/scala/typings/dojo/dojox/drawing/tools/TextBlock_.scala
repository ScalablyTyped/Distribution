package typings.dojo.dojox.drawing.tools

import typings.dojo.dojox.drawing.stencil.Text
import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/drawing/tools/TextBlock.html
  *
  * A tool to create text fields on a canvas.
  * Extends stencil.Text by adding an HTML layer that
  * can be dragged out to a certain size, and accept
  * a text entry. Will wrap text to the width of the
  * html field.
  * When created programmtically, use 'auto' to shrink
  * the width to the size of the text. Use line breaks
  * ( \n ) to create new lines.
  *
  * @param options
  */
@JSGlobal("dojox.drawing.tools.TextBlock")
@js.native
class TextBlock_ protected () extends Text {
  def this(options: js.Any) = this()
  /**
    *
    */
  var draws: Boolean = js.native
  /**
    * Whether the Stencil is selected when the text field
    * is executed or not
    *
    */
  var selectOnExec: Boolean = js.native
  /**
    *
    */
  var setup: js.Object = js.native
  /**
    * If true and there is no text in the data, the TextBlock
    * Is displayed and focused and awaits input.
    *
    */
  var showEmpty: Boolean = js.native
  /**
    * Cleans text. Strings HTML chars and double spaces
    * and optionally removes line breaks.
    *
    * @param txt
    * @param removeBreaks
    */
  def cleanText(txt: String, removeBreaks: Boolean): js.Any = js.native
  /**
    * Internal. Creates the connections to the
    * contenteditable HTML node.
    *
    */
  def connectTextField(): Unit = js.native
  /**
    * Internal. Creates HTML nodes at each corner
    * of the contenteditable div. These nodes are
    * draggable and will resize the div horizontally.
    *
    */
  def createAnchors(): Unit = js.native
  /**
    * Internal. Inserts the contenteditable HTML node
    * into its parent node, and styles it.
    *
    * @param txt
    */
  def createTextField(txt: String): js.Any = js.native
  /**
    * Internal. Destroys HTML anchors.
    *
    */
  def destroyAnchors(): Unit = js.native
  /**
    * Internal?
    * Method used to instantiate the contenteditable HTML node.
    *
    */
  def edit(): Unit = js.native
  /**
    * Internal. Method fired when text is executed,
    * via mouse-click-off, ESC key or Enter key.
    *
    */
  def execText(): Unit = js.native
  /**
    *
    */
  def getSavedCaret(): js.Object = js.native
  /**
    * This gets and stores the caret position
    * in the contentEditable div (conEdit).
    * NOTE: Doesn't work with html nodes inside
    * the div.
    *
    * @param node
    */
  def getSelection(node: js.Any): Unit = js.native
  /**
    * Uses saved caret position to insert text
    * into position and place caret at the end of
    * insertion
    *
    * @param node
    * @param val
    */
  def insertText(node: js.Any, `val`: js.Any): Unit = js.native
  /**
    * Mechanism for measuring text.
    * SVG nor VML have a way of determining the width or
    * height of a block of text. This method creates an
    * HTML text block and those measurements are used for
    * displaying the SVG/VML text.
    *
    * @param str The text to display and measure.
    * @param width If the width is not provided, it will be assumedthat the text is one line and the width will bemeasured and the _lineHeight used for th height.If width is provided, word-wrap is assumed, andline breaks will be inserted into the text at eachpoint where a word wraps in the HTML. The height isthen measured.
    */
  def measureText(str: String, width: Double): js.Object = js.native
  /**
    * Internal, called when caret needs to
    * be moved into position after text is added
    *
    * @param val
    */
  def setSavedCaret(`val`: js.Any): Unit = js.native
  /**
    * Used for placing the cursor during edits and character help.
    * Takes the values: end, beg, start, all or any numerical value
    * (in which case the number will constitute the caret position)
    *
    * @param node
    * @param what
    */
  def setSelection(node: js.Any, what: js.Any): Unit = js.native
  /**
    * Internal. Builds the parent node for the
    * contenteditable HTML node.
    *
    * @param obj
    */
  def showParent(obj: Event_): Unit = js.native
}

