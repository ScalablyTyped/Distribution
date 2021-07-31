package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for events related to manipulations on groups.
  */
trait BootstrapClientAccordionGroupEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Gets the group object related to the event.
    */
  var group: BootstrapClientAccordionGroup
}
object BootstrapClientAccordionGroupEventArgs {
  
  @scala.inline
  def apply(group: BootstrapClientAccordionGroup): BootstrapClientAccordionGroupEventArgs = {
    val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapClientAccordionGroupEventArgs]
  }
  
  @scala.inline
  implicit class BootstrapClientAccordionGroupEventArgsMutableBuilder[Self <: BootstrapClientAccordionGroupEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroup(value: BootstrapClientAccordionGroup): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
  }
}
