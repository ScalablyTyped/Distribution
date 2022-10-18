package typings.expoConfigPlugins

import typings.expoConfigPlugins.buildPluginDottypesMod.ModPlatform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildUtilsWarningsMod {
  
  @JSImport("@expo/config-plugins/build/utils/warnings", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addWarningAndroid(property: String, text: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addWarningAndroid")(property.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addWarningAndroid(property: String, text: String, link: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addWarningAndroid")(property.asInstanceOf[js.Any], text.asInstanceOf[js.Any], link.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addWarningForPlatform(platform: ModPlatform, property: String, text: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addWarningForPlatform")(platform.asInstanceOf[js.Any], property.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addWarningForPlatform(platform: ModPlatform, property: String, text: String, link: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addWarningForPlatform")(platform.asInstanceOf[js.Any], property.asInstanceOf[js.Any], text.asInstanceOf[js.Any], link.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addWarningIOS(property: String, text: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addWarningIOS")(property.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addWarningIOS(property: String, text: String, link: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addWarningIOS")(property.asInstanceOf[js.Any], text.asInstanceOf[js.Any], link.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
