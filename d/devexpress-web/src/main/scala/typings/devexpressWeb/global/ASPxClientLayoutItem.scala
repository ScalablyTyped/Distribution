package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A client-side equivalent of the ASPxFormLayout's LayoutItem object.
  */
@JSGlobal("ASPxClientLayoutItem")
@js.native
class ASPxClientLayoutItem ()
  extends StObject
     with typings.devexpressWeb.ASPxClientLayoutItem {
  
  /**
    * Returns the text displayed in the layout item caption.
    */
  /* CompleteClass */
  override def GetCaption(): String = js.native
  
  /**
    * Returns the current layout item's subitem specified by its name. An ASPxClientLayoutItem object that represents the current layout item's subitem with the specified name.
    * @param name A string value specifying the name of the layout item.
    */
  /* CompleteClass */
  override def GetItemByName(name: String): typings.devexpressWeb.ASPxClientLayoutItem = js.native
  
  /**
    * Returns a value specifying whether a layout item is displayed.
    */
  /* CompleteClass */
  override def GetVisible(): Boolean = js.native
  
  /**
    * Specifies the text displayed in the layout item caption.
    * @param caption A string value specifying the item caption.
    */
  /* CompleteClass */
  override def SetCaption(caption: String): Unit = js.native
  
  /**
    * Specifies the layout item's visibility.
    * @param value true, if the layout item is visible; otherwise, false.
    */
  /* CompleteClass */
  override def SetVisible(value: Boolean): Unit = js.native
  
  /**
    * Gets the form layout object to which the current item belongs.
    */
  /* CompleteClass */
  var formLayout: typings.devexpressWeb.ASPxClientFormLayout = js.native
  
  /**
    * Gets the name that uniquely identifies the layout item.
    */
  /* CompleteClass */
  var name: String = js.native
  
  /**
    * Gets the immediate parent layout item to which the current layout item belongs.
    */
  /* CompleteClass */
  var parent: typings.devexpressWeb.ASPxClientLayoutItem = js.native
}
