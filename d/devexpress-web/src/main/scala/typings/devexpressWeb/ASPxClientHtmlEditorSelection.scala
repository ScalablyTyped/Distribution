package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A selection in the ASPxHtmlEditor.
  */
@js.native
trait ASPxClientHtmlEditorSelection extends js.Object {
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
  @scala.inline
  implicit class ASPxClientHtmlEditorSelectionOps[Self <: ASPxClientHtmlEditorSelection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetElements(value: () => js.Array[_]): Self = this.set("GetElements", js.Any.fromFunction0(value))
    @scala.inline
    def setGetHtml(value: () => String): Self = this.set("GetHtml", js.Any.fromFunction0(value))
    @scala.inline
    def setGetSelectedElement(value: () => js.Any): Self = this.set("GetSelectedElement", js.Any.fromFunction0(value))
    @scala.inline
    def setGetText(value: () => String): Self = this.set("GetText", js.Any.fromFunction0(value))
    @scala.inline
    def setSetHtml(value: (String, Boolean) => Unit): Self = this.set("SetHtml", js.Any.fromFunction2(value))
  }
  
}

