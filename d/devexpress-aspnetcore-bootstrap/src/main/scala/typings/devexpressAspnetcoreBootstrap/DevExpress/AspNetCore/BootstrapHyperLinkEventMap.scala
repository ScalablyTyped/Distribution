package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BootstrapHyperLinkEventMap
  extends StObject
     with ControlEventMap {
  
  var click: EditClickEventArgs
}
object BootstrapHyperLinkEventMap {
  
  inline def apply(click: EditClickEventArgs, init: EventArgs): BootstrapHyperLinkEventMap = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapHyperLinkEventMap]
  }
  
  extension [Self <: BootstrapHyperLinkEventMap](x: Self) {
    
    inline def setClick(value: EditClickEventArgs): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
  }
}
