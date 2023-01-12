package typings.electronNotarize

import typings.electronNotarize.anon.Tool
import typings.electronNotarize.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesMod {
  
  trait LegacyNotarizeApiKeyCredentials
    extends StObject
       with LegacyNotarizeCredentials {
    
    var appleApiIssuer: String
    
    var appleApiKey: String
  }
  object LegacyNotarizeApiKeyCredentials {
    
    inline def apply(appleApiIssuer: String, appleApiKey: String): LegacyNotarizeApiKeyCredentials = {
      val __obj = js.Dynamic.literal(appleApiIssuer = appleApiIssuer.asInstanceOf[js.Any], appleApiKey = appleApiKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[LegacyNotarizeApiKeyCredentials]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LegacyNotarizeApiKeyCredentials] (val x: Self) extends AnyVal {
      
      inline def setAppleApiIssuer(value: String): Self = StObject.set(x, "appleApiIssuer", value.asInstanceOf[js.Any])
      
      inline def setAppleApiKey(value: String): Self = StObject.set(x, "appleApiKey", value.asInstanceOf[js.Any])
    }
  }
  
  trait LegacyNotarizeAppOptions extends StObject {
    
    var appBundleId: String
    
    var appPath: String
  }
  object LegacyNotarizeAppOptions {
    
    inline def apply(appBundleId: String, appPath: String): LegacyNotarizeAppOptions = {
      val __obj = js.Dynamic.literal(appBundleId = appBundleId.asInstanceOf[js.Any], appPath = appPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[LegacyNotarizeAppOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LegacyNotarizeAppOptions] (val x: Self) extends AnyVal {
      
      inline def setAppBundleId(value: String): Self = StObject.set(x, "appBundleId", value.asInstanceOf[js.Any])
      
      inline def setAppPath(value: String): Self = StObject.set(x, "appPath", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.electronNotarize.libTypesMod.LegacyNotarizePasswordCredentials
    - typings.electronNotarize.libTypesMod.LegacyNotarizeApiKeyCredentials
  */
  trait LegacyNotarizeCredentials
    extends StObject
       with NotarizeCredentials
  object LegacyNotarizeCredentials {
    
    inline def LegacyNotarizeApiKeyCredentials(appleApiIssuer: String, appleApiKey: String): typings.electronNotarize.libTypesMod.LegacyNotarizeApiKeyCredentials = {
      val __obj = js.Dynamic.literal(appleApiIssuer = appleApiIssuer.asInstanceOf[js.Any], appleApiKey = appleApiKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.electronNotarize.libTypesMod.LegacyNotarizeApiKeyCredentials]
    }
    
    inline def LegacyNotarizePasswordCredentials(appleId: String, appleIdPassword: String): typings.electronNotarize.libTypesMod.LegacyNotarizePasswordCredentials = {
      val __obj = js.Dynamic.literal(appleId = appleId.asInstanceOf[js.Any], appleIdPassword = appleIdPassword.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.electronNotarize.libTypesMod.LegacyNotarizePasswordCredentials]
    }
  }
  
  trait LegacyNotarizePasswordCredentials
    extends StObject
       with LegacyNotarizeCredentials {
    
    var appleId: String
    
    var appleIdPassword: String
  }
  object LegacyNotarizePasswordCredentials {
    
    inline def apply(appleId: String, appleIdPassword: String): LegacyNotarizePasswordCredentials = {
      val __obj = js.Dynamic.literal(appleId = appleId.asInstanceOf[js.Any], appleIdPassword = appleIdPassword.asInstanceOf[js.Any])
      __obj.asInstanceOf[LegacyNotarizePasswordCredentials]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LegacyNotarizePasswordCredentials] (val x: Self) extends AnyVal {
      
      inline def setAppleId(value: String): Self = StObject.set(x, "appleId", value.asInstanceOf[js.Any])
      
      inline def setAppleIdPassword(value: String): Self = StObject.set(x, "appleIdPassword", value.asInstanceOf[js.Any])
    }
  }
  
  type LegacyNotarizeStartOptions = LegacyNotarizeAppOptions & LegacyNotarizeCredentials & TransporterOptions
  
  type LegacyNotarizeWaitOptions = NotarizeResult & LegacyNotarizeCredentials
  
  /* Rewritten from type alias, can be one of: 
    - typings.electronNotarize.libTypesMod.LegacyNotarizeCredentials
    - typings.electronNotarize.libTypesMod.NotaryToolCredentials
  */
  trait NotarizeCredentials extends StObject
  object NotarizeCredentials {
    
    inline def LegacyNotarizeApiKeyCredentials(appleApiIssuer: String, appleApiKey: String): typings.electronNotarize.libTypesMod.LegacyNotarizeApiKeyCredentials = {
      val __obj = js.Dynamic.literal(appleApiIssuer = appleApiIssuer.asInstanceOf[js.Any], appleApiKey = appleApiKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.electronNotarize.libTypesMod.LegacyNotarizeApiKeyCredentials]
    }
    
    inline def LegacyNotarizePasswordCredentials(appleId: String, appleIdPassword: String): typings.electronNotarize.libTypesMod.LegacyNotarizePasswordCredentials = {
      val __obj = js.Dynamic.literal(appleId = appleId.asInstanceOf[js.Any], appleIdPassword = appleIdPassword.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.electronNotarize.libTypesMod.LegacyNotarizePasswordCredentials]
    }
    
    inline def NotaryToolApiKeyCredentials(appleApiIssuer: String, appleApiKey: String, appleApiKeyId: String): typings.electronNotarize.libTypesMod.NotaryToolApiKeyCredentials = {
      val __obj = js.Dynamic.literal(appleApiIssuer = appleApiIssuer.asInstanceOf[js.Any], appleApiKey = appleApiKey.asInstanceOf[js.Any], appleApiKeyId = appleApiKeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.electronNotarize.libTypesMod.NotaryToolApiKeyCredentials]
    }
    
    inline def NotaryToolKeychainCredentials(keychainProfile: String): typings.electronNotarize.libTypesMod.NotaryToolKeychainCredentials = {
      val __obj = js.Dynamic.literal(keychainProfile = keychainProfile.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.electronNotarize.libTypesMod.NotaryToolKeychainCredentials]
    }
    
    inline def NotaryToolPasswordCredentials(appleId: String, appleIdPassword: String, teamId: String): typings.electronNotarize.libTypesMod.NotaryToolPasswordCredentials = {
      val __obj = js.Dynamic.literal(appleId = appleId.asInstanceOf[js.Any], appleIdPassword = appleIdPassword.asInstanceOf[js.Any], teamId = teamId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.electronNotarize.libTypesMod.NotaryToolPasswordCredentials]
    }
  }
  
  type NotarizeOptions = (Tool & LegacyNotarizeStartOptions) | (`0` & NotaryToolStartOptions)
  
  trait NotarizeResult extends StObject {
    
    var uuid: String
  }
  object NotarizeResult {
    
    inline def apply(uuid: String): NotarizeResult = {
      val __obj = js.Dynamic.literal(uuid = uuid.asInstanceOf[js.Any])
      __obj.asInstanceOf[NotarizeResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NotarizeResult] (val x: Self) extends AnyVal {
      
      inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Pick<@electron/notarize.@electron/notarize/lib/types.LegacyNotarizeAppOptions, 'appPath'> */
  trait NotarizeStapleOptions extends StObject {
    
    var appPath: String
  }
  object NotarizeStapleOptions {
    
    inline def apply(appPath: String): NotarizeStapleOptions = {
      val __obj = js.Dynamic.literal(appPath = appPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[NotarizeStapleOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NotarizeStapleOptions] (val x: Self) extends AnyVal {
      
      inline def setAppPath(value: String): Self = StObject.set(x, "appPath", value.asInstanceOf[js.Any])
    }
  }
  
  trait NotaryToolApiKeyCredentials
    extends StObject
       with NotaryToolCredentials {
    
    var appleApiIssuer: String
    
    var appleApiKey: String
    
    var appleApiKeyId: String
  }
  object NotaryToolApiKeyCredentials {
    
    inline def apply(appleApiIssuer: String, appleApiKey: String, appleApiKeyId: String): NotaryToolApiKeyCredentials = {
      val __obj = js.Dynamic.literal(appleApiIssuer = appleApiIssuer.asInstanceOf[js.Any], appleApiKey = appleApiKey.asInstanceOf[js.Any], appleApiKeyId = appleApiKeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[NotaryToolApiKeyCredentials]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NotaryToolApiKeyCredentials] (val x: Self) extends AnyVal {
      
      inline def setAppleApiIssuer(value: String): Self = StObject.set(x, "appleApiIssuer", value.asInstanceOf[js.Any])
      
      inline def setAppleApiKey(value: String): Self = StObject.set(x, "appleApiKey", value.asInstanceOf[js.Any])
      
      inline def setAppleApiKeyId(value: String): Self = StObject.set(x, "appleApiKeyId", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.electronNotarize.libTypesMod.NotaryToolPasswordCredentials
    - typings.electronNotarize.libTypesMod.NotaryToolApiKeyCredentials
    - typings.electronNotarize.libTypesMod.NotaryToolKeychainCredentials
  */
  trait NotaryToolCredentials
    extends StObject
       with NotarizeCredentials
  object NotaryToolCredentials {
    
    inline def NotaryToolApiKeyCredentials(appleApiIssuer: String, appleApiKey: String, appleApiKeyId: String): typings.electronNotarize.libTypesMod.NotaryToolApiKeyCredentials = {
      val __obj = js.Dynamic.literal(appleApiIssuer = appleApiIssuer.asInstanceOf[js.Any], appleApiKey = appleApiKey.asInstanceOf[js.Any], appleApiKeyId = appleApiKeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.electronNotarize.libTypesMod.NotaryToolApiKeyCredentials]
    }
    
    inline def NotaryToolKeychainCredentials(keychainProfile: String): typings.electronNotarize.libTypesMod.NotaryToolKeychainCredentials = {
      val __obj = js.Dynamic.literal(keychainProfile = keychainProfile.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.electronNotarize.libTypesMod.NotaryToolKeychainCredentials]
    }
    
    inline def NotaryToolPasswordCredentials(appleId: String, appleIdPassword: String, teamId: String): typings.electronNotarize.libTypesMod.NotaryToolPasswordCredentials = {
      val __obj = js.Dynamic.literal(appleId = appleId.asInstanceOf[js.Any], appleIdPassword = appleIdPassword.asInstanceOf[js.Any], teamId = teamId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.electronNotarize.libTypesMod.NotaryToolPasswordCredentials]
    }
  }
  
  trait NotaryToolKeychainCredentials
    extends StObject
       with NotaryToolCredentials {
    
    var keychain: js.UndefOr[String] = js.undefined
    
    var keychainProfile: String
  }
  object NotaryToolKeychainCredentials {
    
    inline def apply(keychainProfile: String): NotaryToolKeychainCredentials = {
      val __obj = js.Dynamic.literal(keychainProfile = keychainProfile.asInstanceOf[js.Any])
      __obj.asInstanceOf[NotaryToolKeychainCredentials]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NotaryToolKeychainCredentials] (val x: Self) extends AnyVal {
      
      inline def setKeychain(value: String): Self = StObject.set(x, "keychain", value.asInstanceOf[js.Any])
      
      inline def setKeychainProfile(value: String): Self = StObject.set(x, "keychainProfile", value.asInstanceOf[js.Any])
      
      inline def setKeychainUndefined: Self = StObject.set(x, "keychain", js.undefined)
    }
  }
  
  trait NotaryToolNotarizeAppOptions extends StObject {
    
    var appPath: String
  }
  object NotaryToolNotarizeAppOptions {
    
    inline def apply(appPath: String): NotaryToolNotarizeAppOptions = {
      val __obj = js.Dynamic.literal(appPath = appPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[NotaryToolNotarizeAppOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NotaryToolNotarizeAppOptions] (val x: Self) extends AnyVal {
      
      inline def setAppPath(value: String): Self = StObject.set(x, "appPath", value.asInstanceOf[js.Any])
    }
  }
  
  trait NotaryToolPasswordCredentials
    extends StObject
       with NotaryToolCredentials {
    
    var appleId: String
    
    var appleIdPassword: String
    
    var teamId: String
  }
  object NotaryToolPasswordCredentials {
    
    inline def apply(appleId: String, appleIdPassword: String, teamId: String): NotaryToolPasswordCredentials = {
      val __obj = js.Dynamic.literal(appleId = appleId.asInstanceOf[js.Any], appleIdPassword = appleIdPassword.asInstanceOf[js.Any], teamId = teamId.asInstanceOf[js.Any])
      __obj.asInstanceOf[NotaryToolPasswordCredentials]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NotaryToolPasswordCredentials] (val x: Self) extends AnyVal {
      
      inline def setAppleId(value: String): Self = StObject.set(x, "appleId", value.asInstanceOf[js.Any])
      
      inline def setAppleIdPassword(value: String): Self = StObject.set(x, "appleIdPassword", value.asInstanceOf[js.Any])
      
      inline def setTeamId(value: String): Self = StObject.set(x, "teamId", value.asInstanceOf[js.Any])
    }
  }
  
  type NotaryToolStartOptions = NotaryToolNotarizeAppOptions & NotaryToolCredentials
  
  trait TransporterOptions extends StObject {
    
    var ascProvider: js.UndefOr[String] = js.undefined
  }
  object TransporterOptions {
    
    inline def apply(): TransporterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransporterOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TransporterOptions] (val x: Self) extends AnyVal {
      
      inline def setAscProvider(value: String): Self = StObject.set(x, "ascProvider", value.asInstanceOf[js.Any])
      
      inline def setAscProviderUndefined: Self = StObject.set(x, "ascProvider", js.undefined)
    }
  }
}
