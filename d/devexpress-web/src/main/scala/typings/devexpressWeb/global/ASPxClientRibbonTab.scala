package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A client-side equivalent of the ribbon's RibbonTab object.
  */
@JSGlobal("ASPxClientRibbonTab")
@js.native
open class ASPxClientRibbonTab ()
  extends StObject
     with typings.devexpressWeb.ASPxClientRibbonTab {
  
  /**
    * Returns a value indicating whether a ribbon tab is enabled.
    */
  /* CompleteClass */
  override def GetEnabled(): Boolean = js.native
  
  /**
    * Returns the text displayed in the tab.
    */
  /* CompleteClass */
  override def GetText(): String = js.native
  
  /**
    * Returns a value specifying whether a ribbon tab is displayed.
    */
  /* CompleteClass */
  override def GetVisible(): Boolean = js.native
  
  /**
    * Sets a value specifying whether the tab is enabled.
    * @param enabled true to enable the tab; false to disable it.
    */
  /* CompleteClass */
  override def SetEnabled(enabled: Boolean): Unit = js.native
  
  /**
    * Gets or sets the tab's index within the collection.
    */
  /* CompleteClass */
  var index: Double = js.native
  
  /**
    * Gets the name of the current ribbon tab.
    */
  /* CompleteClass */
  var name: String = js.native
  
  /**
    * Gets the client ribbon object to which the current tab belongs.
    */
  /* CompleteClass */
  var ribbon: typings.devexpressWeb.ASPxClientRibbon = js.native
}
