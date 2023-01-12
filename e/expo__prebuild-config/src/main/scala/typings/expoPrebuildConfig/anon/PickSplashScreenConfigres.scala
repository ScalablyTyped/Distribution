package typings.expoPrebuildConfig.anon

import typings.expoPrebuildConfig.expoPrebuildConfigStrings.contain
import typings.expoPrebuildConfig.expoPrebuildConfigStrings.cover
import typings.expoPrebuildConfig.expoPrebuildConfigStrings.native
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@expo/prebuild-config.@expo/prebuild-config/build/plugins/unversioned/expo-splash-screen/getAndroidSplashConfig.SplashScreenConfig, 'resizeMode'> */
trait PickSplashScreenConfigres extends StObject {
  
  var resizeMode: contain | cover | native
}
object PickSplashScreenConfigres {
  
  inline def apply(resizeMode: contain | cover | native): PickSplashScreenConfigres = {
    val __obj = js.Dynamic.literal(resizeMode = resizeMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickSplashScreenConfigres]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickSplashScreenConfigres] (val x: Self) extends AnyVal {
    
    inline def setResizeMode(value: contain | cover | native): Self = StObject.set(x, "resizeMode", value.asInstanceOf[js.Any])
  }
}
