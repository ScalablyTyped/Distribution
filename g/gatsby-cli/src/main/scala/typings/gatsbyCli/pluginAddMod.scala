package typings.gatsbyCli

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginAddMod {
  
  @JSImport("gatsby-cli/lib/plugin-add", "addPlugins")
  @js.native
  def addPlugins(plugins: js.Array[String], pluginOptions: Record[String, Record[String, _]], directory: String): js.Promise[Unit] = js.native
  @JSImport("gatsby-cli/lib/plugin-add", "addPlugins")
  @js.native
  def addPlugins(
    plugins: js.Array[String],
    pluginOptions: Record[String, Record[String, _]],
    directory: String,
    packages: js.Array[String]
  ): js.Promise[Unit] = js.native
}
