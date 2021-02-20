package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BootstrapHyperLinkEventMap extends ControlEventMap {
  
  var click: EditClickEventArgs = js.native
}
object BootstrapHyperLinkEventMap {
  
  @scala.inline
  def apply(click: EditClickEventArgs, init: EventArgs): BootstrapHyperLinkEventMap = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapHyperLinkEventMap]
  }
  
  @scala.inline
  implicit class BootstrapHyperLinkEventMapMutableBuilder[Self <: BootstrapHyperLinkEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClick(value: EditClickEventArgs): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
  }
}
