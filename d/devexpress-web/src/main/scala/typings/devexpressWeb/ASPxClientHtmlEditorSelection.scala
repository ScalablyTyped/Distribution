package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A selection in the ASPxHtmlEditor.
  */
trait ASPxClientHtmlEditorSelection extends StObject {
  
  /**
    * Returns an array of the currently selected elements.
    */
  def GetElements(): js.Array[Any]
  
  /**
    * Returns the HTML markup specifying the currently selected ASPxHtmlEditor content.
    */
  def GetHtml(): String
  
  /**
    * Returns a DOM element that relates to the current selection.
    */
  def GetSelectedElement(): Any
  
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
  
  inline def apply(
    GetElements: () => js.Array[Any],
    GetHtml: () => String,
    GetSelectedElement: () => Any,
    GetText: () => String,
    SetHtml: (String, Boolean) => Unit
  ): ASPxClientHtmlEditorSelection = {
    val __obj = js.Dynamic.literal(GetElements = js.Any.fromFunction0(GetElements), GetHtml = js.Any.fromFunction0(GetHtml), GetSelectedElement = js.Any.fromFunction0(GetSelectedElement), GetText = js.Any.fromFunction0(GetText), SetHtml = js.Any.fromFunction2(SetHtml))
    __obj.asInstanceOf[ASPxClientHtmlEditorSelection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxClientHtmlEditorSelection] (val x: Self) extends AnyVal {
    
    inline def setGetElements(value: () => js.Array[Any]): Self = StObject.set(x, "GetElements", js.Any.fromFunction0(value))
    
    inline def setGetHtml(value: () => String): Self = StObject.set(x, "GetHtml", js.Any.fromFunction0(value))
    
    inline def setGetSelectedElement(value: () => Any): Self = StObject.set(x, "GetSelectedElement", js.Any.fromFunction0(value))
    
    inline def setGetText(value: () => String): Self = StObject.set(x, "GetText", js.Any.fromFunction0(value))
    
    inline def setSetHtml(value: (String, Boolean) => Unit): Self = StObject.set(x, "SetHtml", js.Any.fromFunction2(value))
  }
}
