package typings.esbuildPluginAlias

import org.scalablytyped.runtime.Shortcut
import typings.esbuild.mod.Plugin
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("esbuild-plugin-alias", JSImport.Default)
  @js.native
  val default: js.Function1[/* opts */ Record[String, String], Plugin] = js.native
  
  type _To = js.Function1[/* opts */ Record[String, String], Plugin]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: js.Function1[/* opts */ Record[String, String], Plugin] = default
}
