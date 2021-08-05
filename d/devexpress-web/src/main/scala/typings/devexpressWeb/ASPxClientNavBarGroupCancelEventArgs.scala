package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for cancellable events which concern manipulations on groups.
  */
trait ASPxClientNavBarGroupCancelEventArgs
  extends StObject
     with ASPxClientProcessingModeCancelEventArgs {
  
  /**
    * Gets the group object related to the event.
    */
  var group: ASPxClientNavBarGroup
}
object ASPxClientNavBarGroupCancelEventArgs {
  
  inline def apply(cancel: Boolean, group: ASPxClientNavBarGroup, processOnServer: Boolean): ASPxClientNavBarGroupCancelEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientNavBarGroupCancelEventArgs]
  }
  
  extension [Self <: ASPxClientNavBarGroupCancelEventArgs](x: Self) {
    
    inline def setGroup(value: ASPxClientNavBarGroup): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
  }
}
