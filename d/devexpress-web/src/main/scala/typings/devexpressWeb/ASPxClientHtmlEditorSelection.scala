package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A selection in the ASPxHtmlEditor.
  */
trait ASPxClientHtmlEditorSelection extends js.Object {
  /**
    * Returns an array of the currently selected elements.
    */
  def GetElements(): js.Array[_]
  /**
    * Returns the HTML markup specifying the currently selected ASPxHtmlEditor content.
    */
  def GetHtml(): String
  /**
    * Returns a DOM element that relates to the current selection.
    */
  def GetSelectedElement(): js.Any
  /**
    * Returns the text within the currently selected ASPxHtmlEditor content.
    */
  def GetText(): String
  /**
    * Sets the new HTML markup in place of the currently selected within ASPxHtmlEditor content.
    * @param html A string value specifying the new HTML markup.
    * @param addToHistory true to add this operation to the history; otherwise, false.
    */
  def SetHtml(html: String, addToHistory: Boolean): Unit
}

object ASPxClientHtmlEditorSelection {
  @scala.inline
  def apply(
    GetElements: () => js.Array[_],
    GetHtml: () => String,
    GetSelectedElement: () => js.Any,
    GetText: () => String,
    SetHtml: (String, Boolean) => Unit
  ): ASPxClientHtmlEditorSelection = {
    val __obj = js.Dynamic.literal(GetElements = js.Any.fromFunction0(GetElements), GetHtml = js.Any.fromFunction0(GetHtml), GetSelectedElement = js.Any.fromFunction0(GetSelectedElement), GetText = js.Any.fromFunction0(GetText), SetHtml = js.Any.fromFunction2(SetHtml))
    __obj.asInstanceOf[ASPxClientHtmlEditorSelection]
  }
}

