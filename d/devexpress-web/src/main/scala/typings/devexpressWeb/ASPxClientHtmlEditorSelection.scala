package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A selection in the ASPxHtmlEditor.
  */
@js.native
trait ASPxClientHtmlEditorSelection extends StObject {
  
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
  implicit class ASPxClientHtmlEditorSelectionMutableBuilder[Self <: ASPxClientHtmlEditorSelection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetElements(value: () => js.Array[_]): Self = StObject.set(x, "GetElements", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetHtml(value: () => String): Self = StObject.set(x, "GetHtml", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSelectedElement(value: () => js.Any): Self = StObject.set(x, "GetSelectedElement", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetText(value: () => String): Self = StObject.set(x, "GetText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetHtml(value: (String, Boolean) => Unit): Self = StObject.set(x, "SetHtml", js.Any.fromFunction2(value))
  }
}
