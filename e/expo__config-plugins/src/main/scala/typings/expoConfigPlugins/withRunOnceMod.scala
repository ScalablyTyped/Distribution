package typings.expoConfigPlugins

import typings.expoConfigPlugins.anon.Plugin
import typings.expoConfigPlugins.pluginTypesMod.ConfigPlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object withRunOnceMod {
  
  @JSImport("@expo/config-plugins/build/plugins/withRunOnce", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createRunOncePlugin[T](plugin: ConfigPlugin[T], name: String): ConfigPlugin[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createRunOncePlugin")(plugin.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[ConfigPlugin[T]]
  inline def createRunOncePlugin[T](plugin: ConfigPlugin[T], name: String, version: String): ConfigPlugin[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createRunOncePlugin")(plugin.asInstanceOf[js.Any], name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[ConfigPlugin[T]]
  
  @JSImport("@expo/config-plugins/build/plugins/withRunOnce", "withRunOnce")
  @js.native
  val withRunOnce: ConfigPlugin[Plugin] = js.native
}
