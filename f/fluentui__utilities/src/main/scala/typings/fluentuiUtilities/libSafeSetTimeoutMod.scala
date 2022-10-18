package typings.fluentuiUtilities

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSafeSetTimeoutMod {
  
  @JSImport("@fluentui/utilities/lib/safeSetTimeout", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def safeSetTimeout(component: Component[js.Object, js.Object, Any]): js.Function2[/* cb */ js.Function, /* duration */ Double, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("safeSetTimeout")(component.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* cb */ js.Function, /* duration */ Double, Unit]]
}
