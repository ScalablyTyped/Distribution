package typings.gatsbyCli

import org.scalablytyped.runtime.Shortcut
import typings.gatsbyCli.reporterReporterMod.Reporter_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reporterMod extends Shortcut {
  
  @JSImport("gatsby-cli/lib/reporter", JSImport.Default)
  @js.native
  val default: Reporter_ = js.native
  
  type _To = Reporter_
  
  /* This means you don't have to write `default`, but can instead just say `reporterMod.foo` */
  override def _to: Reporter_ = default
}
