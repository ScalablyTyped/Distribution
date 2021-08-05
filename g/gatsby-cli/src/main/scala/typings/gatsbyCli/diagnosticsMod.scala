package typings.gatsbyCli

import typings.gatsbyCli.reduxMod.GatsbyCLIStore
import typings.gatsbyCli.typesMod.ActionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object diagnosticsMod {
  
  @JSImport("gatsby-cli/lib/reporter/redux/diagnostics", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createStructuredLoggingDiagnosticsMiddleware(store: GatsbyCLIStore): DiagnosticsMiddleware = ^.asInstanceOf[js.Dynamic].applyDynamic("createStructuredLoggingDiagnosticsMiddleware")(store.asInstanceOf[js.Any]).asInstanceOf[DiagnosticsMiddleware]
  
  type DiagnosticsMiddleware = js.Function1[/* action */ ActionsUnion, Unit]
}
