package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.typeScriptReporterConfigurationMod.TypeScriptReporterConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typeScriptSupportMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/typescript-reporter/TypeScriptSupport", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assertTypeScriptSupport(configuration: TypeScriptReporterConfiguration): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTypeScriptSupport")(configuration.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
