package typings.electronOsxSign

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("electron-osx-sign", "flat")
  @js.native
  def flat(opts: FlatOptions, callback: js.Function1[/* error */ Error, Unit]): Unit = js.native
  
  @JSImport("electron-osx-sign", "flatAsync")
  @js.native
  def flatAsync(opts: FlatOptions): js.Promise[_] = js.native
  
  @JSImport("electron-osx-sign", "sign")
  @js.native
  def sign(opts: SignOptions, callback: js.Function1[/* error */ Error, Unit]): Unit = js.native
  
  @JSImport("electron-osx-sign", "signAsync")
  @js.native
  def signAsync(opts: SignOptions): js.Promise[_] = js.native
  
  @js.native
  trait BaseSignOptions extends StObject {
    
    var app: String = js.native
    
    var identity: js.UndefOr[String] = js.native
    
    var keychain: js.UndefOr[String] = js.native
    
    var platform: js.UndefOr[String] = js.native
  }
  object BaseSignOptions {
    
    @scala.inline
    def apply(app: String): BaseSignOptions = {
      val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseSignOptions]
    }
    
    @scala.inline
    implicit class BaseSignOptionsMutableBuilder[Self <: BaseSignOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApp(value: String): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdentity(value: String): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdentityUndefined: Self = StObject.set(x, "identity", js.undefined)
      
      @scala.inline
      def setKeychain(value: String): Self = StObject.set(x, "keychain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeychainUndefined: Self = StObject.set(x, "keychain", js.undefined)
      
      @scala.inline
      def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    }
  }
  
  @js.native
  trait FlatOptions extends BaseSignOptions {
    
    var `identity-validation`: js.UndefOr[Boolean] = js.native
    
    var install: js.UndefOr[String] = js.native
    
    var pkg: js.UndefOr[String] = js.native
    
    var scripts: js.UndefOr[String] = js.native
  }
  object FlatOptions {
    
    @scala.inline
    def apply(app: String): FlatOptions = {
      val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any])
      __obj.asInstanceOf[FlatOptions]
    }
    
    @scala.inline
    implicit class FlatOptionsMutableBuilder[Self <: FlatOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def `setIdentity-validation`(value: Boolean): Self = StObject.set(x, "identity-validation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setIdentity-validationUndefined`: Self = StObject.set(x, "identity-validation", js.undefined)
      
      @scala.inline
      def setInstall(value: String): Self = StObject.set(x, "install", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstallUndefined: Self = StObject.set(x, "install", js.undefined)
      
      @scala.inline
      def setPkg(value: String): Self = StObject.set(x, "pkg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPkgUndefined: Self = StObject.set(x, "pkg", js.undefined)
      
      @scala.inline
      def setScripts(value: String): Self = StObject.set(x, "scripts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScriptsUndefined: Self = StObject.set(x, "scripts", js.undefined)
    }
  }
  
  @js.native
  trait SignOptions extends BaseSignOptions {
    
    var binaries: js.UndefOr[js.Array[String]] = js.native
    
    var entitlements: js.UndefOr[String] = js.native
    
    var `entitlements-inherit`: js.UndefOr[String] = js.native
    
    var `entitlements-loginhelper`: js.UndefOr[String] = js.native
    
    var `gatekeeper-assess`: js.UndefOr[Boolean] = js.native
    
    var hardenedRuntime: js.UndefOr[Boolean] = js.native
    
    var `identity-validation`: js.UndefOr[Boolean] = js.native
    
    var ignore: js.UndefOr[String] = js.native
    
    var `pre-auto-entitlements`: js.UndefOr[Boolean] = js.native
    
    var `pre-embed-provisioning-profile`: js.UndefOr[Boolean] = js.native
    
    var `provisioning-profile`: js.UndefOr[String] = js.native
    
    var requirements: js.UndefOr[String] = js.native
    
    var `signature-size`: js.UndefOr[Double] = js.native
    
    var `type`: js.UndefOr[String] = js.native
    
    var version: js.UndefOr[String] = js.native
  }
  object SignOptions {
    
    @scala.inline
    def apply(app: String): SignOptions = {
      val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any])
      __obj.asInstanceOf[SignOptions]
    }
    
    @scala.inline
    implicit class SignOptionsMutableBuilder[Self <: SignOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBinaries(value: js.Array[String]): Self = StObject.set(x, "binaries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBinariesUndefined: Self = StObject.set(x, "binaries", js.undefined)
      
      @scala.inline
      def setBinariesVarargs(value: String*): Self = StObject.set(x, "binaries", js.Array(value :_*))
      
      @scala.inline
      def setEntitlements(value: String): Self = StObject.set(x, "entitlements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setEntitlements-inherit`(value: String): Self = StObject.set(x, "entitlements-inherit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setEntitlements-inheritUndefined`: Self = StObject.set(x, "entitlements-inherit", js.undefined)
      
      @scala.inline
      def `setEntitlements-loginhelper`(value: String): Self = StObject.set(x, "entitlements-loginhelper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setEntitlements-loginhelperUndefined`: Self = StObject.set(x, "entitlements-loginhelper", js.undefined)
      
      @scala.inline
      def setEntitlementsUndefined: Self = StObject.set(x, "entitlements", js.undefined)
      
      @scala.inline
      def `setGatekeeper-assess`(value: Boolean): Self = StObject.set(x, "gatekeeper-assess", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGatekeeper-assessUndefined`: Self = StObject.set(x, "gatekeeper-assess", js.undefined)
      
      @scala.inline
      def setHardenedRuntime(value: Boolean): Self = StObject.set(x, "hardenedRuntime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHardenedRuntimeUndefined: Self = StObject.set(x, "hardenedRuntime", js.undefined)
      
      @scala.inline
      def `setIdentity-validation`(value: Boolean): Self = StObject.set(x, "identity-validation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setIdentity-validationUndefined`: Self = StObject.set(x, "identity-validation", js.undefined)
      
      @scala.inline
      def setIgnore(value: String): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      @scala.inline
      def `setPre-auto-entitlements`(value: Boolean): Self = StObject.set(x, "pre-auto-entitlements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setPre-auto-entitlementsUndefined`: Self = StObject.set(x, "pre-auto-entitlements", js.undefined)
      
      @scala.inline
      def `setPre-embed-provisioning-profile`(value: Boolean): Self = StObject.set(x, "pre-embed-provisioning-profile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setPre-embed-provisioning-profileUndefined`: Self = StObject.set(x, "pre-embed-provisioning-profile", js.undefined)
      
      @scala.inline
      def `setProvisioning-profile`(value: String): Self = StObject.set(x, "provisioning-profile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setProvisioning-profileUndefined`: Self = StObject.set(x, "provisioning-profile", js.undefined)
      
      @scala.inline
      def setRequirements(value: String): Self = StObject.set(x, "requirements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequirementsUndefined: Self = StObject.set(x, "requirements", js.undefined)
      
      @scala.inline
      def `setSignature-size`(value: Double): Self = StObject.set(x, "signature-size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setSignature-sizeUndefined`: Self = StObject.set(x, "signature-size", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
}
