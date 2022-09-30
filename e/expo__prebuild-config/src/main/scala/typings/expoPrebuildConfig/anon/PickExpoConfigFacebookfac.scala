package typings.expoPrebuildConfig.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@expo/prebuild-config.@expo/prebuild-config/build/plugins/unversioned/expo-facebook/withIosFacebook.ExpoConfigFacebook, 'facebookAppId'> */
trait PickExpoConfigFacebookfac extends StObject {
  
  var facebookAppId: js.UndefOr[String] = js.undefined
}
object PickExpoConfigFacebookfac {
  
  inline def apply(): PickExpoConfigFacebookfac = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickExpoConfigFacebookfac]
  }
  
  extension [Self <: PickExpoConfigFacebookfac](x: Self) {
    
    inline def setFacebookAppId(value: String): Self = StObject.set(x, "facebookAppId", value.asInstanceOf[js.Any])
    
    inline def setFacebookAppIdUndefined: Self = StObject.set(x, "facebookAppId", js.undefined)
  }
}
