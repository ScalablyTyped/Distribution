package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientScheduler.CellClick event.
  */
@js.native
trait ASPxClientSchedulerCellClickEventArgs extends ASPxClientEventArgs {
  
  /**
    * Gets the HTML element that the event was triggered on.
    */
  var htmlElement: js.Any = js.native
  
  /**
    * Gets the time interval of the time cells related to the event.
    */
  var interval: ASPxClientTimeInterval = js.native
  
  /**
    * Gets the resource identifier associated with the cell related to the event.
    */
  var resource: String = js.native
}
object ASPxClientSchedulerCellClickEventArgs {
  
  @scala.inline
  def apply(htmlElement: js.Any, interval: ASPxClientTimeInterval, resource: String): ASPxClientSchedulerCellClickEventArgs = {
    val __obj = js.Dynamic.literal(htmlElement = htmlElement.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientSchedulerCellClickEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientSchedulerCellClickEventArgsMutableBuilder[Self <: ASPxClientSchedulerCellClickEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHtmlElement(value: js.Any): Self = StObject.set(x, "htmlElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterval(value: ASPxClientTimeInterval): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
  }
}
