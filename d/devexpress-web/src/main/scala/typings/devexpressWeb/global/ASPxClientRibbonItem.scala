package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A client-side equivalent of the ribbon's RibbonItemBase object.
  */
@JSGlobal("ASPxClientRibbonItem")
@js.native
class ASPxClientRibbonItem ()
  extends StObject
     with typings.devexpressWeb.ASPxClientRibbonItem {
  
  /**
    * Returns a value indicating whether a ribbon item is enabled.
    */
  /* CompleteClass */
  override def GetEnabled(): Boolean = js.native
  
  /**
    * Returns the item value.
    */
  /* CompleteClass */
  override def GetValue(): js.Any = js.native
  
  /**
    * Returns a value specifying whether a ribbon item is displayed.
    */
  /* CompleteClass */
  override def GetVisible(): Boolean = js.native
  
  /**
    * Sets a value specifying whether the item is enabled.
    * @param enabled true to enable the item; false to disable it.
    */
  /* CompleteClass */
  override def SetEnabled(enabled: Boolean): Unit = js.native
  
  /**
    * Sets the item value.
    * @param value An  that specifies the item value.
    */
  /* CompleteClass */
  override def SetValue(value: js.Any): Unit = js.native
  
  /**
    * Gets the client group object to which the current item belongs.
    */
  /* CompleteClass */
  var group: typings.devexpressWeb.ASPxClientRibbonGroup = js.native
  
  /**
    * Gets or sets the item's index within the collection.
    */
  /* CompleteClass */
  var index: Double = js.native
  
  /**
    * Gets the name of the current ribbon item.
    */
  /* CompleteClass */
  var name: String = js.native
  
  /**
    * Gets the client ribbon object to which the current item belongs.
    */
  /* CompleteClass */
  var ribbon: typings.devexpressWeb.ASPxClientRibbon = js.native
}
