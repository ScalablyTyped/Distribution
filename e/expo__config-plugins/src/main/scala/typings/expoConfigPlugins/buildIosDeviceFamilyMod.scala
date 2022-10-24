package typings.expoConfigPlugins

import typings.expoConfigPlugins.anon.PickExpoConfigios
import typings.expoConfigPlugins.anon.Project
import typings.expoConfigPlugins.buildPluginDottypesMod.ConfigPlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildIosDeviceFamilyMod {
  
  @JSImport("@expo/config-plugins/build/ios/DeviceFamily", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def formatDeviceFamilies(deviceFamilies: js.Array[Double]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatDeviceFamilies")(deviceFamilies.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getDeviceFamilies(config: PickExpoConfigios): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDeviceFamilies")(config.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def getIsTabletOnly(config: PickExpoConfigios): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("getIsTabletOnly")(config.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def getSupportsTablet(config: PickExpoConfigios): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("getSupportsTablet")(config.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def setDeviceFamily(config: PickExpoConfigios, param1: Project): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setDeviceFamily")(config.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  @JSImport("@expo/config-plugins/build/ios/DeviceFamily", "withDeviceFamily")
  @js.native
  val withDeviceFamily: ConfigPlugin[Unit] = js.native
}
