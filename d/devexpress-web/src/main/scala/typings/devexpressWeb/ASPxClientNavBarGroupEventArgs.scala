package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for events which concern manipulations on groups.
  */
trait ASPxClientNavBarGroupEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Gets the group object related to the event.
    */
  var group: ASPxClientNavBarGroup
}
object ASPxClientNavBarGroupEventArgs {
  
  @scala.inline
  def apply(group: ASPxClientNavBarGroup): ASPxClientNavBarGroupEventArgs = {
    val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientNavBarGroupEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientNavBarGroupEventArgsMutableBuilder[Self <: ASPxClientNavBarGroupEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroup(value: ASPxClientNavBarGroup): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
  }
}
