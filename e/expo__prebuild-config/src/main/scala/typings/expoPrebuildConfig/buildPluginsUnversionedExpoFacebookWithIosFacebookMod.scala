package typings.expoPrebuildConfig

import typings.expoPrebuildConfig.anon.PickExpoConfigFacebookfac
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildPluginsUnversionedExpoFacebookWithIosFacebookMod {
  
  @JSImport("@expo/prebuild-config/build/plugins/unversioned/expo-facebook/withIosFacebook", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getFacebookAdvertiserIDCollection(config: ExpoConfigFacebook): Boolean | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getFacebookAdvertiserIDCollection")(config.asInstanceOf[js.Any]).asInstanceOf[Boolean | Null]
  
  inline def getFacebookAppId(config: PickExpoConfigFacebookfac): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getFacebookAppId")(config.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def getFacebookAutoInitEnabled(config: ExpoConfigFacebook): Boolean | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getFacebookAutoInitEnabled")(config.asInstanceOf[js.Any]).asInstanceOf[Boolean | Null]
  
  inline def getFacebookAutoLogAppEvents(config: ExpoConfigFacebook): Boolean | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getFacebookAutoLogAppEvents")(config.asInstanceOf[js.Any]).asInstanceOf[Boolean | Null]
  
  inline def getFacebookDisplayName(config: ExpoConfigFacebook): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getFacebookDisplayName")(config.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def getFacebookScheme(config: ExpoConfigFacebook): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getFacebookScheme")(config.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def setFacebookAdvertiserIDCollectionEnabled(
    config: ExpoConfigFacebook,
    param1: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InfoPlist */ Any
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setFacebookAdvertiserIDCollectionEnabled")(config.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def setFacebookAppId(
    config: PickExpoConfigFacebookfac,
    param1: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InfoPlist */ Any
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setFacebookAppId")(config.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def setFacebookApplicationQuerySchemes(
    config: PickExpoConfigFacebookfac,
    infoPlist: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InfoPlist */ Any
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setFacebookApplicationQuerySchemes")(config.asInstanceOf[js.Any], infoPlist.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def setFacebookAutoInitEnabled(
    config: ExpoConfigFacebook,
    param1: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InfoPlist */ Any
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setFacebookAutoInitEnabled")(config.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def setFacebookAutoLogAppEventsEnabled(
    config: ExpoConfigFacebook,
    param1: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InfoPlist */ Any
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setFacebookAutoLogAppEventsEnabled")(config.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def setFacebookConfig(
    config: ExpoConfigFacebook,
    infoPlist: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InfoPlist */ Any
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setFacebookConfig")(config.asInstanceOf[js.Any], infoPlist.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def setFacebookDisplayName(
    config: ExpoConfigFacebook,
    param1: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InfoPlist */ Any
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setFacebookDisplayName")(config.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def setFacebookScheme(
    config: ExpoConfigFacebook,
    infoPlist: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InfoPlist */ Any
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setFacebookScheme")(config.asInstanceOf[js.Any], infoPlist.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  @JSImport("@expo/prebuild-config/build/plugins/unversioned/expo-facebook/withIosFacebook", "withIosFacebook")
  @js.native
  val withIosFacebook: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ConfigPlugin */ Any = js.native
  
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExpoConfigFacebook] (val x: Self) extends AnyVal {
      
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
