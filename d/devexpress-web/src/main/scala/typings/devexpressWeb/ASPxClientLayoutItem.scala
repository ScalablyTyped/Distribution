package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A client-side equivalent of the ASPxFormLayout's LayoutItem object.
  */
trait ASPxClientLayoutItem extends StObject {
  
  /**
    * Returns the text displayed in the layout item caption.
    */
  def GetCaption(): String
  
  /**
    * Returns the current layout item's subitem specified by its name. An ASPxClientLayoutItem object that represents the current layout item's subitem with the specified name.
    * @param name A string value specifying the name of the layout item.
    */
  def GetItemByName(name: String): ASPxClientLayoutItem
  
  /**
    * Returns a value specifying whether a layout item is displayed.
    */
  def GetVisible(): Boolean
  
  /**
    * Specifies the text displayed in the layout item caption.
    * @param caption A string value specifying the item caption.
    */
  def SetCaption(caption: String): Unit
  
  /**
    * Specifies the layout item's visibility.
    * @param value true, if the layout item is visible; otherwise, false.
    */
  def SetVisible(value: Boolean): Unit
  
  /**
    * Gets the form layout object to which the current item belongs.
    */
  var formLayout: ASPxClientFormLayout
  
  /**
    * Gets the name that uniquely identifies the layout item.
    */
  var name: String
  
  /**
    * Gets the immediate parent layout item to which the current layout item belongs.
    */
  var parent: ASPxClientLayoutItem
}
object ASPxClientLayoutItem {
  
  inline def apply(
    GetCaption: () => String,
    GetItemByName: String => ASPxClientLayoutItem,
    GetVisible: () => Boolean,
    SetCaption: String => Unit,
    SetVisible: Boolean => Unit,
    formLayout: ASPxClientFormLayout,
    name: String,
    parent: ASPxClientLayoutItem
  ): ASPxClientLayoutItem = {
    val __obj = js.Dynamic.literal(GetCaption = js.Any.fromFunction0(GetCaption), GetItemByName = js.Any.fromFunction1(GetItemByName), GetVisible = js.Any.fromFunction0(GetVisible), SetCaption = js.Any.fromFunction1(SetCaption), SetVisible = js.Any.fromFunction1(SetVisible), formLayout = formLayout.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientLayoutItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxClientLayoutItem] (val x: Self) extends AnyVal {
    
    inline def setFormLayout(value: ASPxClientFormLayout): Self = StObject.set(x, "formLayout", value.asInstanceOf[js.Any])
    
    inline def setGetCaption(value: () => String): Self = StObject.set(x, "GetCaption", js.Any.fromFunction0(value))
    
    inline def setGetItemByName(value: String => ASPxClientLayoutItem): Self = StObject.set(x, "GetItemByName", js.Any.fromFunction1(value))
    
    inline def setGetVisible(value: () => Boolean): Self = StObject.set(x, "GetVisible", js.Any.fromFunction0(value))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setParent(value: ASPxClientLayoutItem): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setSetCaption(value: String => Unit): Self = StObject.set(x, "SetCaption", js.Any.fromFunction1(value))
    
    inline def setSetVisible(value: Boolean => Unit): Self = StObject.set(x, "SetVisible", js.Any.fromFunction1(value))
  }
}
