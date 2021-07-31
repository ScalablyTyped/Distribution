package typings.devexpressWeb

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientScheduler.MoreButtonClicked client-side event.
  */
trait MoreButtonClickedEventArgs
  extends StObject
     with ASPxClientProcessingModeEventArgs {
  
  /**
    * Gets or sets whether an event is handled. If it is handled, default actions are not required.
    */
  var handled: Boolean
  
  /**
    * Gets the time interval of the cell where the button is located.
    */
  var interval: ASPxClientTimeInterval
  
  /**
    * Gets the resource identifier associated with the cell where the button is located.
    */
  var resource: String
  
  /**
    * Gets the Start or End values of the target appointment.
    */
  var targetDateTime: Date
}
object MoreButtonClickedEventArgs {
  
  @scala.inline
  def apply(
    handled: Boolean,
    interval: ASPxClientTimeInterval,
    processOnServer: Boolean,
    resource: String,
    targetDateTime: Date
  ): MoreButtonClickedEventArgs = {
    val __obj = js.Dynamic.literal(handled = handled.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], targetDateTime = targetDateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[MoreButtonClickedEventArgs]
  }
  
  @scala.inline
  implicit class MoreButtonClickedEventArgsMutableBuilder[Self <: MoreButtonClickedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHandled(value: Boolean): Self = StObject.set(x, "handled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterval(value: ASPxClientTimeInterval): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetDateTime(value: Date): Self = StObject.set(x, "targetDateTime", value.asInstanceOf[js.Any])
  }
}
