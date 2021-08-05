package typings.gatsbyCli

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginAddMod {
  
  @JSImport("gatsby-cli/lib/plugin-add", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addPlugins(
    plugins: js.Array[String],
    pluginOptions: Record[String, Record[String, js.Any]],
    directory: String
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("addPlugins")(plugins.asInstanceOf[js.Any], pluginOptions.asInstanceOf[js.Any], directory.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def addPlugins(
    plugins: js.Array[String],
    pluginOptions: Record[String, Record[String, js.Any]],
    directory: String,
    packages: js.Array[String]
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("addPlugins")(plugins.asInstanceOf[js.Any], pluginOptions.asInstanceOf[js.Any], directory.asInstanceOf[js.Any], packages.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
