package typings.electronOsxSign

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("electron-osx-sign", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def flat(opts: FlatOptions, callback: js.Function1[/* error */ js.Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("flat")(opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def flatAsync(opts: FlatOptions): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatAsync")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  
  inline def sign(opts: SignOptions, callback: js.Function1[/* error */ js.Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def signAsync(opts: SignOptions): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("signAsync")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  
  trait BaseSignOptions extends StObject {
    
    var app: String
    
    var identity: js.UndefOr[String] = js.undefined
    
    var keychain: js.UndefOr[String] = js.undefined
    
    var platform: js.UndefOr[String] = js.undefined
  }
  object BaseSignOptions {
    
    inline def apply(app: String): BaseSignOptions = {
      val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseSignOptions]
    }
    
    extension [Self <: BaseSignOptions](x: Self) {
      
      inline def setApp(value: String): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
      
      inline def setIdentity(value: String): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      inline def setIdentityUndefined: Self = StObject.set(x, "identity", js.undefined)
      
      inline def setKeychain(value: String): Self = StObject.set(x, "keychain", value.asInstanceOf[js.Any])
      
      inline def setKeychainUndefined: Self = StObject.set(x, "keychain", js.undefined)
      
      inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    }
  }
  
  trait FlatOptions
    extends StObject
       with BaseSignOptions {
    
    var `identity-validation`: js.UndefOr[Boolean] = js.undefined
    
    var install: js.UndefOr[String] = js.undefined
    
    var pkg: js.UndefOr[String] = js.undefined
    
    var scripts: js.UndefOr[String] = js.undefined
  }
  object FlatOptions {
    
    inline def apply(app: String): FlatOptions = {
      val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any])
      __obj.asInstanceOf[FlatOptions]
    }
    
    extension [Self <: FlatOptions](x: Self) {
      
      inline def `setIdentity-validation`(value: Boolean): Self = StObject.set(x, "identity-validation", value.asInstanceOf[js.Any])
      
      inline def `setIdentity-validationUndefined`: Self = StObject.set(x, "identity-validation", js.undefined)
      
      inline def setInstall(value: String): Self = StObject.set(x, "install", value.asInstanceOf[js.Any])
      
      inline def setInstallUndefined: Self = StObject.set(x, "install", js.undefined)
      
      inline def setPkg(value: String): Self = StObject.set(x, "pkg", value.asInstanceOf[js.Any])
      
      inline def setPkgUndefined: Self = StObject.set(x, "pkg", js.undefined)
      
      inline def setScripts(value: String): Self = StObject.set(x, "scripts", value.asInstanceOf[js.Any])
      
      inline def setScriptsUndefined: Self = StObject.set(x, "scripts", js.undefined)
    }
  }
  
  trait SignOptions
    extends StObject
       with BaseSignOptions {
    
    var binaries: js.UndefOr[js.Array[String]] = js.undefined
    
    var entitlements: js.UndefOr[String] = js.undefined
    
    var `entitlements-inherit`: js.UndefOr[String] = js.undefined
    
    var `entitlements-loginhelper`: js.UndefOr[String] = js.undefined
    
    var entitlementsForFile: js.UndefOr[
        js.Function2[/* file */ String, /* codeSignArgs */ js.Array[String], String | Null]
      ] = js.undefined
    
    var `gatekeeper-assess`: js.UndefOr[Boolean] = js.undefined
    
    var hardenedRuntime: js.UndefOr[Boolean] = js.undefined
    
    var `identity-validation`: js.UndefOr[Boolean] = js.undefined
    
    var ignore: js.UndefOr[String | (js.Function1[/* file */ String, Boolean])] = js.undefined
    
    var `pre-auto-entitlements`: js.UndefOr[Boolean] = js.undefined
    
    var `pre-embed-provisioning-profile`: js.UndefOr[Boolean] = js.undefined
    
    var `provisioning-profile`: js.UndefOr[String] = js.undefined
    
    var requirements: js.UndefOr[String] = js.undefined
    
    var `signature-flags`: js.UndefOr[String | (js.Function1[/* file */ String, js.Array[String]])] = js.undefined
    
    var `signature-size`: js.UndefOr[Double] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
    
    var version: js.UndefOr[String] = js.undefined
  }
  object SignOptions {
    
    inline def apply(app: String): SignOptions = {
      val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any])
      __obj.asInstanceOf[SignOptions]
    }
    
    extension [Self <: SignOptions](x: Self) {
      
      inline def setBinaries(value: js.Array[String]): Self = StObject.set(x, "binaries", value.asInstanceOf[js.Any])
      
      inline def setBinariesUndefined: Self = StObject.set(x, "binaries", js.undefined)
      
      inline def setBinariesVarargs(value: String*): Self = StObject.set(x, "binaries", js.Array(value*))
      
      inline def setEntitlements(value: String): Self = StObject.set(x, "entitlements", value.asInstanceOf[js.Any])
      
      inline def `setEntitlements-inherit`(value: String): Self = StObject.set(x, "entitlements-inherit", value.asInstanceOf[js.Any])
      
      inline def `setEntitlements-inheritUndefined`: Self = StObject.set(x, "entitlements-inherit", js.undefined)
      
      inline def `setEntitlements-loginhelper`(value: String): Self = StObject.set(x, "entitlements-loginhelper", value.asInstanceOf[js.Any])
      
      inline def `setEntitlements-loginhelperUndefined`: Self = StObject.set(x, "entitlements-loginhelper", js.undefined)
      
      inline def setEntitlementsForFile(value: (/* file */ String, /* codeSignArgs */ js.Array[String]) => String | Null): Self = StObject.set(x, "entitlementsForFile", js.Any.fromFunction2(value))
      
      inline def setEntitlementsForFileUndefined: Self = StObject.set(x, "entitlementsForFile", js.undefined)
      
      inline def setEntitlementsUndefined: Self = StObject.set(x, "entitlements", js.undefined)
      
      inline def `setGatekeeper-assess`(value: Boolean): Self = StObject.set(x, "gatekeeper-assess", value.asInstanceOf[js.Any])
      
      inline def `setGatekeeper-assessUndefined`: Self = StObject.set(x, "gatekeeper-assess", js.undefined)
      
      inline def setHardenedRuntime(value: Boolean): Self = StObject.set(x, "hardenedRuntime", value.asInstanceOf[js.Any])
      
      inline def setHardenedRuntimeUndefined: Self = StObject.set(x, "hardenedRuntime", js.undefined)
      
      inline def `setIdentity-validation`(value: Boolean): Self = StObject.set(x, "identity-validation", value.asInstanceOf[js.Any])
      
      inline def `setIdentity-validationUndefined`: Self = StObject.set(x, "identity-validation", js.undefined)
      
      inline def setIgnore(value: String | (js.Function1[/* file */ String, Boolean])): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      inline def setIgnoreFunction1(value: /* file */ String => Boolean): Self = StObject.set(x, "ignore", js.Any.fromFunction1(value))
      
      inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      inline def `setPre-auto-entitlements`(value: Boolean): Self = StObject.set(x, "pre-auto-entitlements", value.asInstanceOf[js.Any])
      
      inline def `setPre-auto-entitlementsUndefined`: Self = StObject.set(x, "pre-auto-entitlements", js.undefined)
      
      inline def `setPre-embed-provisioning-profile`(value: Boolean): Self = StObject.set(x, "pre-embed-provisioning-profile", value.asInstanceOf[js.Any])
      
      inline def `setPre-embed-provisioning-profileUndefined`: Self = StObject.set(x, "pre-embed-provisioning-profile", js.undefined)
      
      inline def `setProvisioning-profile`(value: String): Self = StObject.set(x, "provisioning-profile", value.asInstanceOf[js.Any])
      
      inline def `setProvisioning-profileUndefined`: Self = StObject.set(x, "provisioning-profile", js.undefined)
      
      inline def setRequirements(value: String): Self = StObject.set(x, "requirements", value.asInstanceOf[js.Any])
      
      inline def setRequirementsUndefined: Self = StObject.set(x, "requirements", js.undefined)
      
      inline def `setSignature-flags`(value: String | (js.Function1[/* file */ String, js.Array[String]])): Self = StObject.set(x, "signature-flags", value.asInstanceOf[js.Any])
      
      inline def `setSignature-flagsFunction1`(value: /* file */ String => js.Array[String]): Self = StObject.set(x, "signature-flags", js.Any.fromFunction1(value))
      
      inline def `setSignature-flagsUndefined`: Self = StObject.set(x, "signature-flags", js.undefined)
      
      inline def `setSignature-size`(value: Double): Self = StObject.set(x, "signature-size", value.asInstanceOf[js.Any])
      
      inline def `setSignature-sizeUndefined`: Self = StObject.set(x, "signature-size", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
}
