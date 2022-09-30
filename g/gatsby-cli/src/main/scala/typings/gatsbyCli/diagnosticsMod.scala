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
  
  inline def createStructuredLoggingDiagnosticsMiddleware(getStore: js.Function0[GatsbyCLIStore]): DiagnosticsMiddleware = ^.asInstanceOf[js.Dynamic].applyDynamic("createStructuredLoggingDiagnosticsMiddleware")(getStore.asInstanceOf[js.Any]).asInstanceOf[DiagnosticsMiddleware]
  
  inline def registerAdditionalDiagnosticOutputHandler(handler: AdditionalDiagnosticsOutputHandler): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerAdditionalDiagnosticOutputHandler")(handler.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  type AdditionalDiagnosticsOutputHandler = js.Function0[String]
  
  type DiagnosticsMiddleware = js.Function1[/* action */ ActionsUnion, Unit]
}
