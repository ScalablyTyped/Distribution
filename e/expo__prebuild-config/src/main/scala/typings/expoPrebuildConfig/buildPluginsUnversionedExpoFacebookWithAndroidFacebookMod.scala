package typings.expoPrebuildConfig

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildPluginsUnversionedExpoFacebookWithAndroidFacebookMod {
  
  @JSImport("@expo/prebuild-config/build/plugins/unversioned/expo-facebook/withAndroidFacebook", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getFacebookAdvertiserIDCollection(config: ExpoConfigFacebook): Boolean | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getFacebookAdvertiserIDCollection")(config.asInstanceOf[js.Any]).asInstanceOf[Boolean | Null]
  
  inline def getFacebookAppId(config: ExpoConfigFacebook): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getFacebookAppId")(config.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def getFacebookAutoInitEnabled(config: ExpoConfigFacebook): Boolean | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getFacebookAutoInitEnabled")(config.asInstanceOf[js.Any]).asInstanceOf[Boolean | Null]
  
  inline def getFacebookAutoLogAppEvents(config: ExpoConfigFacebook): Boolean | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getFacebookAutoLogAppEvents")(config.asInstanceOf[js.Any]).asInstanceOf[Boolean | Null]
  
  inline def getFacebookDisplayName(config: ExpoConfigFacebook): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getFacebookDisplayName")(config.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def getFacebookScheme(config: ExpoConfigFacebook): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getFacebookScheme")(config.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def setFacebookConfig(
    config: ExpoConfigFacebook,
    androidManifest: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AndroidConfig.Manifest.AndroidManifest */ Any
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setFacebookConfig")(config.asInstanceOf[js.Any], androidManifest.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  @JSImport("@expo/prebuild-config/build/plugins/unversioned/expo-facebook/withAndroidFacebook", "withFacebookAppIdString")
  @js.native
  val withFacebookAppIdString: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ConfigPlugin */ Any = js.native
  
  @JSImport("@expo/prebuild-config/build/plugins/unversioned/expo-facebook/withAndroidFacebook", "withFacebookManifest")
  @js.native
  val withFacebookManifest: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ConfigPlugin */ Any = js.native
  
  /* Inlined std.Pick<@expo/config-types.@expo/config-types.ExpoConfig, 'facebookScheme' | 'facebookAdvertiserIDCollectionEnabled' | 'facebookAppId' | 'facebookAutoInitEnabled' | 'facebookAutoLogAppEventsEnabled' | 'facebookDisplayName'> */
  trait ExpoConfigFacebook extends StObject {
    
    var facebookAdvertiserIDCollectionEnabled: js.UndefOr[Boolean] = js.undefined
    
    var facebookAppId: js.UndefOr[String] = js.undefined
    
    var facebookAutoInitEnabled: js.UndefOr[Boolean] = js.undefined
    
    var facebookAutoLogAppEventsEnabled: js.UndefOr[Boolean] = js.undefined
    
    var facebookDisplayName: js.UndefOr[String] = js.undefined
    
    var facebookScheme: js.UndefOr[String] = js.undefined
  }
  object ExpoConfigFacebook {
    
    inline def apply(): ExpoConfigFacebook = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExpoConfigFacebook]
    }
    
    extension [Self <: ExpoConfigFacebook](x: Self) {
      
      inline def setFacebookAdvertiserIDCollectionEnabled(value: Boolean): Self = StObject.set(x, "facebookAdvertiserIDCollectionEnabled", value.asInstanceOf[js.Any])
      
      inline def setFacebookAdvertiserIDCollectionEnabledUndefined: Self = StObject.set(x, "facebookAdvertiserIDCollectionEnabled", js.undefined)
      
      inline def setFacebookAppId(value: String): Self = StObject.set(x, "facebookAppId", value.asInstanceOf[js.Any])
      
      inline def setFacebookAppIdUndefined: Self = StObject.set(x, "facebookAppId", js.undefined)
      
      inline def setFacebookAutoInitEnabled(value: Boolean): Self = StObject.set(x, "facebookAutoInitEnabled", value.asInstanceOf[js.Any])
      
      inline def setFacebookAutoInitEnabledUndefined: Self = StObject.set(x, "facebookAutoInitEnabled", js.undefined)
      
      inline def setFacebookAutoLogAppEventsEnabled(value: Boolean): Self = StObject.set(x, "facebookAutoLogAppEventsEnabled", value.asInstanceOf[js.Any])
      
      inline def setFacebookAutoLogAppEventsEnabledUndefined: Self = StObject.set(x, "facebookAutoLogAppEventsEnabled", js.undefined)
      
      inline def setFacebookDisplayName(value: String): Self = StObject.set(x, "facebookDisplayName", value.asInstanceOf[js.Any])
      
      inline def setFacebookDisplayNameUndefined: Self = StObject.set(x, "facebookDisplayName", js.undefined)
      
      inline def setFacebookScheme(value: String): Self = StObject.set(x, "facebookScheme", value.asInstanceOf[js.Any])
      
      inline def setFacebookSchemeUndefined: Self = StObject.set(x, "facebookScheme", js.undefined)
    }
  }
}
