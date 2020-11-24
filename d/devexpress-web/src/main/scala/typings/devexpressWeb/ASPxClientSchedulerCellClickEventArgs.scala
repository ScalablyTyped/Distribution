package typings.devexpressWeb

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
  implicit class ASPxClientSchedulerCellClickEventArgsOps[Self <: ASPxClientSchedulerCellClickEventArgs] (val x: Self) extends AnyVal {
    
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
    def setHtmlElement(value: js.Any): Self = this.set("htmlElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterval(value: ASPxClientTimeInterval): Self = this.set("interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResource(value: String): Self = this.set("resource", value.asInstanceOf[js.Any])
  }
}
