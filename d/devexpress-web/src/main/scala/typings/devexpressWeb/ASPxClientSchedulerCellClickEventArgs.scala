package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientScheduler.CellClick event.
  */
trait ASPxClientSchedulerCellClickEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Gets the HTML element that the event was triggered on.
    */
  var htmlElement: Any
  
  /**
    * Gets the time interval of the time cells related to the event.
    */
  var interval: ASPxClientTimeInterval
  
  /**
    * Gets the resource identifier associated with the cell related to the event.
    */
  var resource: String
}
object ASPxClientSchedulerCellClickEventArgs {
  
  inline def apply(htmlElement: Any, interval: ASPxClientTimeInterval, resource: String): ASPxClientSchedulerCellClickEventArgs = {
    val __obj = js.Dynamic.literal(htmlElement = htmlElement.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientSchedulerCellClickEventArgs]
  }
  
  extension [Self <: ASPxClientSchedulerCellClickEventArgs](x: Self) {
    
    inline def setHtmlElement(value: Any): Self = StObject.set(x, "htmlElement", value.asInstanceOf[js.Any])
    
    inline def setInterval(value: ASPxClientTimeInterval): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
  }
}
