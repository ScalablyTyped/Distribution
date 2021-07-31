package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccordionGroupEventArgs
  extends StObject
     with EventArgs {
  
  val group: BootstrapAccordionGroup
}
object AccordionGroupEventArgs {
  
  @scala.inline
  def apply(group: BootstrapAccordionGroup, sender: Control): AccordionGroupEventArgs = {
    val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccordionGroupEventArgs]
  }
  
  @scala.inline
  implicit class AccordionGroupEventArgsMutableBuilder[Self <: AccordionGroupEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroup(value: BootstrapAccordionGroup): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
  }
}
