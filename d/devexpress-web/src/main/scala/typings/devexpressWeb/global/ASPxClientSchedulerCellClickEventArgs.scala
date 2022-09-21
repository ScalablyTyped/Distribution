package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientScheduler.CellClick event.
  */
@JSGlobal("ASPxClientSchedulerCellClickEventArgs")
@js.native
open class ASPxClientSchedulerCellClickEventArgs ()
  extends StObject
     with typings.devexpressWeb.ASPxClientSchedulerCellClickEventArgs {
  
  /**
    * Gets the HTML element that the event was triggered on.
    */
  /* CompleteClass */
  var htmlElement: Any = js.native
  
  /**
    * Gets the time interval of the time cells related to the event.
    */
  /* CompleteClass */
  var interval: typings.devexpressWeb.ASPxClientTimeInterval = js.native
  
  /**
    * Gets the resource identifier associated with the cell related to the event.
    */
  /* CompleteClass */
  var resource: String = js.native
}
