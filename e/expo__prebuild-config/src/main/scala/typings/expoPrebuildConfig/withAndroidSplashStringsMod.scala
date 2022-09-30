package typings.expoPrebuildConfig

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object withAndroidSplashStringsMod {
  
  @JSImport("@expo/prebuild-config/build/plugins/unversioned/expo-splash-screen/withAndroidSplashStrings", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def setSplashStrings(
    strings: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AndroidConfig.Resources.ResourceXML */ Any,
    resizeMode: String,
    statusBarTranslucent: Boolean
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setSplashStrings")(strings.asInstanceOf[js.Any], resizeMode.asInstanceOf[js.Any], statusBarTranslucent.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  @JSImport("@expo/prebuild-config/build/plugins/unversioned/expo-splash-screen/withAndroidSplashStrings", "withAndroidSplashStrings")
  @js.native
  val withAndroidSplashStrings: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ConfigPlugin */ Any = js.native
}
