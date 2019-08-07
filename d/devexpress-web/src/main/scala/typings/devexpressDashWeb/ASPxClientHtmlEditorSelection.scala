package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A selection in the ASPxHtmlEditor.
  */
@JSGlobal("ASPxClientHtmlEditorSelection")
@js.native
class ASPxClientHtmlEditorSelection () extends js.Object {
  /**
    * Returns an array of the currently selected elements.
    */
  def GetElements(): js.Array[_] = js.native
  /**
    * Returns the HTML markup specifying the currently selected ASPxHtmlEditor content.
    */
  def GetHtml(): String = js.native
  /**
    * Returns a DOM element that relates to the current selection.
    */
  def GetSelectedElement(): js.Any = js.native
  /**
    * Returns the text within the currently selected ASPxHtmlEditor content.
    */
  def GetText(): String = js.native
  /**
    * Sets the new HTML markup in place of the currently selected within ASPxHtmlEditor content.
    * @param html A string value specifying the new HTML markup.
    * @param addToHistory true to add this operation to the history; otherwise, false.
    */
  def SetHtml(html: String, addToHistory: Boolean): Unit = js.native
}

