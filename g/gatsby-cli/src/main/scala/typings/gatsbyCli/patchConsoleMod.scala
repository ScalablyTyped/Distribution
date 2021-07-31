package typings.gatsbyCli

import typings.gatsbyCli.reporterReporterMod.Reporter_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object patchConsoleMod {
  
  @JSImport("gatsby-cli/lib/reporter/patch-console", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def patchConsole(reporter: Reporter_): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("patchConsole")(reporter.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
