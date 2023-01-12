package typings.electronOsxSign

import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsTypesMod {
  
  /* Inlined std.Readonly<{  app :string,   identity :string | undefined,   platform :@electron/osx-sign.@electron/osx-sign/dist/cjs/types.ElectronMacPlatform | undefined,   keychain :string | undefined}> */
  trait BaseSignOptions extends StObject {
    
    val app: String
    
    val identity: js.UndefOr[String] = js.undefined
    
    val keychain: js.UndefOr[String] = js.undefined
    
    val platform: js.UndefOr[ElectronMacPlatform] = js.undefined
  }
  object BaseSignOptions {
    
    inline def apply(app: String): BaseSignOptions = {
      val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseSignOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BaseSignOptions] (val x: Self) extends AnyVal {
      
      inline def setApp(value: String): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
      
      inline def setIdentity(value: String): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      inline def setIdentityUndefined: Self = StObject.set(x, "identity", js.undefined)
      
      inline def setKeychain(value: String): Self = StObject.set(x, "keychain", value.asInstanceOf[js.Any])
      
      inline def setKeychainUndefined: Self = StObject.set(x, "keychain", js.undefined)
      
      inline def setPlatform(value: ElectronMacPlatform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.electronOsxSign.electronOsxSignStrings.darwin
    - typings.electronOsxSign.electronOsxSignStrings.mas
  */
  trait ElectronMacPlatform extends StObject
  object ElectronMacPlatform {
    
    inline def darwin: typings.electronOsxSign.electronOsxSignStrings.darwin = "darwin".asInstanceOf[typings.electronOsxSign.electronOsxSignStrings.darwin]
    
    inline def mas: typings.electronOsxSign.electronOsxSignStrings.mas = "mas".asInstanceOf[typings.electronOsxSign.electronOsxSignStrings.mas]
  }
  
  /* Inlined std.Readonly<@electron/osx-sign.@electron/osx-sign/dist/cjs/types.OnlyFlatOptions & @electron/osx-sign.@electron/osx-sign/dist/cjs/types.BaseSignOptions> */
  trait FlatOptions extends StObject {
    
    val app: String
    
    val identity: js.UndefOr[String] = js.undefined
    
    val identityValidation: js.UndefOr[Boolean] = js.undefined
    
    val install: js.UndefOr[String] = js.undefined
    
    val keychain: js.UndefOr[String] = js.undefined
    
    val pkg: js.UndefOr[String] = js.undefined
    
    val platform: js.UndefOr[ElectronMacPlatform] = js.undefined
    
    val scripts: js.UndefOr[String] = js.undefined
  }
  object FlatOptions {
    
    inline def apply(app: String): FlatOptions = {
      val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any])
      __obj.asInstanceOf[FlatOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FlatOptions] (val x: Self) extends AnyVal {
      
      inline def setApp(value: String): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
      
      inline def setIdentity(value: String): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      inline def setIdentityUndefined: Self = StObject.set(x, "identity", js.undefined)
      
      inline def setIdentityValidation(value: Boolean): Self = StObject.set(x, "identityValidation", value.asInstanceOf[js.Any])
      
      inline def setIdentityValidationUndefined: Self = StObject.set(x, "identityValidation", js.undefined)
      
      inline def setInstall(value: String): Self = StObject.set(x, "install", value.asInstanceOf[js.Any])
      
      inline def setInstallUndefined: Self = StObject.set(x, "install", js.undefined)
      
      inline def setKeychain(value: String): Self = StObject.set(x, "keychain", value.asInstanceOf[js.Any])
      
      inline def setKeychainUndefined: Self = StObject.set(x, "keychain", js.undefined)
      
      inline def setPkg(value: String): Self = StObject.set(x, "pkg", value.asInstanceOf[js.Any])
      
      inline def setPkgUndefined: Self = StObject.set(x, "pkg", js.undefined)
      
      inline def setPlatform(value: ElectronMacPlatform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
      
      inline def setScripts(value: String): Self = StObject.set(x, "scripts", value.asInstanceOf[js.Any])
      
      inline def setScriptsUndefined: Self = StObject.set(x, "scripts", js.undefined)
    }
  }
  
  trait OnlyFlatOptions extends StObject {
    
    var identityValidation: js.UndefOr[Boolean] = js.undefined
    
    var install: js.UndefOr[String] = js.undefined
    
    var pkg: js.UndefOr[String] = js.undefined
    
    var scripts: js.UndefOr[String] = js.undefined
  }
  object OnlyFlatOptions {
    
    inline def apply(): OnlyFlatOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OnlyFlatOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OnlyFlatOptions] (val x: Self) extends AnyVal {
      
      inline def setIdentityValidation(value: Boolean): Self = StObject.set(x, "identityValidation", value.asInstanceOf[js.Any])
      
      inline def setIdentityValidationUndefined: Self = StObject.set(x, "identityValidation", js.undefined)
      
      inline def setInstall(value: String): Self = StObject.set(x, "install", value.asInstanceOf[js.Any])
      
      inline def setInstallUndefined: Self = StObject.set(x, "install", js.undefined)
      
      inline def setPkg(value: String): Self = StObject.set(x, "pkg", value.asInstanceOf[js.Any])
      
      inline def setPkgUndefined: Self = StObject.set(x, "pkg", js.undefined)
      
      inline def setScripts(value: String): Self = StObject.set(x, "scripts", value.asInstanceOf[js.Any])
      
      inline def setScriptsUndefined: Self = StObject.set(x, "scripts", js.undefined)
    }
  }
  
  trait OnlySignOptions extends StObject {
    
    var binaries: js.UndefOr[js.Array[String]] = js.undefined
    
    var identityValidation: js.UndefOr[Boolean] = js.undefined
    
    var ignore: js.UndefOr[String | js.Array[String] | (js.Function1[/* file */ String, Boolean])] = js.undefined
    
    var optionsForFile: js.UndefOr[js.Function1[/* filePath */ String, PerFileSignOptions]] = js.undefined
    
    var preAutoEntitlements: js.UndefOr[Boolean] = js.undefined
    
    var preEmbedProvisioningProfile: js.UndefOr[Boolean] = js.undefined
    
    var provisioningProfile: js.UndefOr[String] = js.undefined
    
    var strictVerify: js.UndefOr[Boolean] = js.undefined
    
    var `type`: js.UndefOr[SigningDistributionType] = js.undefined
    
    var version: js.UndefOr[String] = js.undefined
  }
  object OnlySignOptions {
    
    inline def apply(): OnlySignOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OnlySignOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OnlySignOptions] (val x: Self) extends AnyVal {
      
      inline def setBinaries(value: js.Array[String]): Self = StObject.set(x, "binaries", value.asInstanceOf[js.Any])
      
      inline def setBinariesUndefined: Self = StObject.set(x, "binaries", js.undefined)
      
      inline def setBinariesVarargs(value: String*): Self = StObject.set(x, "binaries", js.Array(value*))
      
      inline def setIdentityValidation(value: Boolean): Self = StObject.set(x, "identityValidation", value.asInstanceOf[js.Any])
      
      inline def setIdentityValidationUndefined: Self = StObject.set(x, "identityValidation", js.undefined)
      
      inline def setIgnore(value: String | js.Array[String] | (js.Function1[/* file */ String, Boolean])): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      inline def setIgnoreFunction1(value: /* file */ String => Boolean): Self = StObject.set(x, "ignore", js.Any.fromFunction1(value))
      
      inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      inline def setIgnoreVarargs(value: String*): Self = StObject.set(x, "ignore", js.Array(value*))
      
      inline def setOptionsForFile(value: /* filePath */ String => PerFileSignOptions): Self = StObject.set(x, "optionsForFile", js.Any.fromFunction1(value))
      
      inline def setOptionsForFileUndefined: Self = StObject.set(x, "optionsForFile", js.undefined)
      
      inline def setPreAutoEntitlements(value: Boolean): Self = StObject.set(x, "preAutoEntitlements", value.asInstanceOf[js.Any])
      
      inline def setPreAutoEntitlementsUndefined: Self = StObject.set(x, "preAutoEntitlements", js.undefined)
      
      inline def setPreEmbedProvisioningProfile(value: Boolean): Self = StObject.set(x, "preEmbedProvisioningProfile", value.asInstanceOf[js.Any])
      
      inline def setPreEmbedProvisioningProfileUndefined: Self = StObject.set(x, "preEmbedProvisioningProfile", js.undefined)
      
      inline def setProvisioningProfile(value: String): Self = StObject.set(x, "provisioningProfile", value.asInstanceOf[js.Any])
      
      inline def setProvisioningProfileUndefined: Self = StObject.set(x, "provisioningProfile", js.undefined)
      
      inline def setStrictVerify(value: Boolean): Self = StObject.set(x, "strictVerify", value.asInstanceOf[js.Any])
      
      inline def setStrictVerifyUndefined: Self = StObject.set(x, "strictVerify", js.undefined)
      
      inline def setType(value: SigningDistributionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  trait OnlyValidatedBaseSignOptions extends StObject {
    
    var platform: ElectronMacPlatform
  }
  object OnlyValidatedBaseSignOptions {
    
    inline def apply(platform: ElectronMacPlatform): OnlyValidatedBaseSignOptions = {
      val __obj = js.Dynamic.literal(platform = platform.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnlyValidatedBaseSignOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OnlyValidatedBaseSignOptions] (val x: Self) extends AnyVal {
      
      inline def setPlatform(value: ElectronMacPlatform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    }
  }
  
  trait OnlyValidatedFlatOptions extends StObject {
    
    var install: String
    
    var pkg: String
  }
  object OnlyValidatedFlatOptions {
    
    inline def apply(install: String, pkg: String): OnlyValidatedFlatOptions = {
      val __obj = js.Dynamic.literal(install = install.asInstanceOf[js.Any], pkg = pkg.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnlyValidatedFlatOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OnlyValidatedFlatOptions] (val x: Self) extends AnyVal {
      
      inline def setInstall(value: String): Self = StObject.set(x, "install", value.asInstanceOf[js.Any])
      
      inline def setPkg(value: String): Self = StObject.set(x, "pkg", value.asInstanceOf[js.Any])
    }
  }
  
  trait OnlyValidatedSignOptions extends StObject {
    
    var ignore: js.UndefOr[js.Array[String | (js.Function1[/* file */ String, Boolean])]] = js.undefined
    
    var `type`: SigningDistributionType
  }
  object OnlyValidatedSignOptions {
    
    inline def apply(`type`: SigningDistributionType): OnlyValidatedSignOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnlyValidatedSignOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OnlyValidatedSignOptions] (val x: Self) extends AnyVal {
      
      inline def setIgnore(value: js.Array[String | (js.Function1[/* file */ String, Boolean])]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      inline def setIgnoreVarargs(value: (String | (js.Function1[/* file */ String, Boolean]))*): Self = StObject.set(x, "ignore", js.Array(value*))
      
      inline def setType(value: SigningDistributionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait PerFileSignOptions extends StObject {
    
    /**
      * The entitlements file to use when signing this file
      */
    var entitlements: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /**
      * Whether to enable hardened runtime for this file.  Enabled by default.
      */
    var hardenedRuntime: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The designated requirements to embed when signing this file
      */
    var requirements: js.UndefOr[String] = js.undefined
    
    /**
      * See --options of the "codesign" command.
      *
      * https://www.manpagez.com/man/1/codesign
      */
    var signatureFlags: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /**
      * The timestamp server to use when signing, by default uses the Apple provided
      * timestamp server.
      */
    var timestamp: js.UndefOr[String] = js.undefined
  }
  object PerFileSignOptions {
    
    inline def apply(): PerFileSignOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PerFileSignOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PerFileSignOptions] (val x: Self) extends AnyVal {
      
      inline def setEntitlements(value: String | js.Array[String]): Self = StObject.set(x, "entitlements", value.asInstanceOf[js.Any])
      
      inline def setEntitlementsUndefined: Self = StObject.set(x, "entitlements", js.undefined)
      
      inline def setEntitlementsVarargs(value: String*): Self = StObject.set(x, "entitlements", js.Array(value*))
      
      inline def setHardenedRuntime(value: Boolean): Self = StObject.set(x, "hardenedRuntime", value.asInstanceOf[js.Any])
      
      inline def setHardenedRuntimeUndefined: Self = StObject.set(x, "hardenedRuntime", js.undefined)
      
      inline def setRequirements(value: String): Self = StObject.set(x, "requirements", value.asInstanceOf[js.Any])
      
      inline def setRequirementsUndefined: Self = StObject.set(x, "requirements", js.undefined)
      
      inline def setSignatureFlags(value: String | js.Array[String]): Self = StObject.set(x, "signatureFlags", value.asInstanceOf[js.Any])
      
      inline def setSignatureFlagsUndefined: Self = StObject.set(x, "signatureFlags", js.undefined)
      
      inline def setSignatureFlagsVarargs(value: String*): Self = StObject.set(x, "signatureFlags", js.Array(value*))
      
      inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<@electron/osx-sign.@electron/osx-sign/dist/cjs/types.OnlySignOptions & @electron/osx-sign.@electron/osx-sign/dist/cjs/types.BaseSignOptions> */
  trait SignOptions extends StObject {
    
    val app: String
    
    val binaries: js.UndefOr[js.Array[String]] = js.undefined
    
    val identity: js.UndefOr[String] = js.undefined
    
    val identityValidation: js.UndefOr[Boolean] = js.undefined
    
    val ignore: js.UndefOr[String | js.Array[String] | (js.Function1[/* file */ String, Boolean])] = js.undefined
    
    val keychain: js.UndefOr[String] = js.undefined
    
    val optionsForFile: js.UndefOr[js.Function1[/* filePath */ String, PerFileSignOptions]] = js.undefined
    
    val platform: js.UndefOr[ElectronMacPlatform] = js.undefined
    
    val preAutoEntitlements: js.UndefOr[Boolean] = js.undefined
    
    val preEmbedProvisioningProfile: js.UndefOr[Boolean] = js.undefined
    
    val provisioningProfile: js.UndefOr[String] = js.undefined
    
    val strictVerify: js.UndefOr[Boolean] = js.undefined
    
    val `type`: js.UndefOr[SigningDistributionType] = js.undefined
    
    val version: js.UndefOr[String] = js.undefined
  }
  object SignOptions {
    
    inline def apply(app: String): SignOptions = {
      val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any])
      __obj.asInstanceOf[SignOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SignOptions] (val x: Self) extends AnyVal {
      
      inline def setApp(value: String): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
      
      inline def setBinaries(value: js.Array[String]): Self = StObject.set(x, "binaries", value.asInstanceOf[js.Any])
      
      inline def setBinariesUndefined: Self = StObject.set(x, "binaries", js.undefined)
      
      inline def setBinariesVarargs(value: String*): Self = StObject.set(x, "binaries", js.Array(value*))
      
      inline def setIdentity(value: String): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      inline def setIdentityUndefined: Self = StObject.set(x, "identity", js.undefined)
      
      inline def setIdentityValidation(value: Boolean): Self = StObject.set(x, "identityValidation", value.asInstanceOf[js.Any])
      
      inline def setIdentityValidationUndefined: Self = StObject.set(x, "identityValidation", js.undefined)
      
      inline def setIgnore(value: String | js.Array[String] | (js.Function1[/* file */ String, Boolean])): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      inline def setIgnoreFunction1(value: /* file */ String => Boolean): Self = StObject.set(x, "ignore", js.Any.fromFunction1(value))
      
      inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      inline def setIgnoreVarargs(value: String*): Self = StObject.set(x, "ignore", js.Array(value*))
      
      inline def setKeychain(value: String): Self = StObject.set(x, "keychain", value.asInstanceOf[js.Any])
      
      inline def setKeychainUndefined: Self = StObject.set(x, "keychain", js.undefined)
      
      inline def setOptionsForFile(value: /* filePath */ String => PerFileSignOptions): Self = StObject.set(x, "optionsForFile", js.Any.fromFunction1(value))
      
      inline def setOptionsForFileUndefined: Self = StObject.set(x, "optionsForFile", js.undefined)
      
      inline def setPlatform(value: ElectronMacPlatform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
      
      inline def setPreAutoEntitlements(value: Boolean): Self = StObject.set(x, "preAutoEntitlements", value.asInstanceOf[js.Any])
      
      inline def setPreAutoEntitlementsUndefined: Self = StObject.set(x, "preAutoEntitlements", js.undefined)
      
      inline def setPreEmbedProvisioningProfile(value: Boolean): Self = StObject.set(x, "preEmbedProvisioningProfile", value.asInstanceOf[js.Any])
      
      inline def setPreEmbedProvisioningProfileUndefined: Self = StObject.set(x, "preEmbedProvisioningProfile", js.undefined)
      
      inline def setProvisioningProfile(value: String): Self = StObject.set(x, "provisioningProfile", value.asInstanceOf[js.Any])
      
      inline def setProvisioningProfileUndefined: Self = StObject.set(x, "provisioningProfile", js.undefined)
      
      inline def setStrictVerify(value: Boolean): Self = StObject.set(x, "strictVerify", value.asInstanceOf[js.Any])
      
      inline def setStrictVerifyUndefined: Self = StObject.set(x, "strictVerify", js.undefined)
      
      inline def setType(value: SigningDistributionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.electronOsxSign.electronOsxSignStrings.development
    - typings.electronOsxSign.electronOsxSignStrings.distribution
  */
  trait SigningDistributionType extends StObject
  object SigningDistributionType {
    
    inline def development: typings.electronOsxSign.electronOsxSignStrings.development = "development".asInstanceOf[typings.electronOsxSign.electronOsxSignStrings.development]
    
    inline def distribution: typings.electronOsxSign.electronOsxSignStrings.distribution = "distribution".asInstanceOf[typings.electronOsxSign.electronOsxSignStrings.distribution]
  }
  
  /* Inlined std.Readonly<@electron/osx-sign.@electron/osx-sign/dist/cjs/types.ValidatedForm<@electron/osx-sign.@electron/osx-sign/dist/cjs/types.BaseSignOptions, @electron/osx-sign.@electron/osx-sign/dist/cjs/types.OnlyValidatedBaseSignOptions>> */
  trait ValidatedBaseSignOptions extends StObject {
    
    val app: String
    
    val identity: js.UndefOr[String] = js.undefined
    
    val keychain: js.UndefOr[String] = js.undefined
    
    val platform: ElectronMacPlatform
  }
  object ValidatedBaseSignOptions {
    
    inline def apply(app: String, platform: ElectronMacPlatform): ValidatedBaseSignOptions = {
      val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValidatedBaseSignOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ValidatedBaseSignOptions] (val x: Self) extends AnyVal {
      
      inline def setApp(value: String): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
      
      inline def setIdentity(value: String): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      inline def setIdentityUndefined: Self = StObject.set(x, "identity", js.undefined)
      
      inline def setKeychain(value: String): Self = StObject.set(x, "keychain", value.asInstanceOf[js.Any])
      
      inline def setKeychainUndefined: Self = StObject.set(x, "keychain", js.undefined)
      
      inline def setPlatform(value: ElectronMacPlatform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Readonly<@electron/osx-sign.@electron/osx-sign/dist/cjs/types.ValidatedForm<@electron/osx-sign.@electron/osx-sign/dist/cjs/types.OnlyFlatOptions, @electron/osx-sign.@electron/osx-sign/dist/cjs/types.OnlyValidatedFlatOptions> & @electron/osx-sign.@electron/osx-sign/dist/cjs/types.ValidatedBaseSignOptions> */
  trait ValidatedFlatOptions extends StObject {
    
    val app: String
    
    val identity: js.UndefOr[String] = js.undefined
    
    val identityValidation: js.UndefOr[Boolean] = js.undefined
    
    val install: String
    
    val keychain: js.UndefOr[String] = js.undefined
    
    val pkg: String
    
    val platform: ElectronMacPlatform
    
    val scripts: js.UndefOr[String] = js.undefined
  }
  object ValidatedFlatOptions {
    
    inline def apply(app: String, install: String, pkg: String, platform: ElectronMacPlatform): ValidatedFlatOptions = {
      val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], install = install.asInstanceOf[js.Any], pkg = pkg.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValidatedFlatOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ValidatedFlatOptions] (val x: Self) extends AnyVal {
      
      inline def setApp(value: String): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
      
      inline def setIdentity(value: String): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      inline def setIdentityUndefined: Self = StObject.set(x, "identity", js.undefined)
      
      inline def setIdentityValidation(value: Boolean): Self = StObject.set(x, "identityValidation", value.asInstanceOf[js.Any])
      
      inline def setIdentityValidationUndefined: Self = StObject.set(x, "identityValidation", js.undefined)
      
      inline def setInstall(value: String): Self = StObject.set(x, "install", value.asInstanceOf[js.Any])
      
      inline def setKeychain(value: String): Self = StObject.set(x, "keychain", value.asInstanceOf[js.Any])
      
      inline def setKeychainUndefined: Self = StObject.set(x, "keychain", js.undefined)
      
      inline def setPkg(value: String): Self = StObject.set(x, "pkg", value.asInstanceOf[js.Any])
      
      inline def setPlatform(value: ElectronMacPlatform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setScripts(value: String): Self = StObject.set(x, "scripts", value.asInstanceOf[js.Any])
      
      inline def setScriptsUndefined: Self = StObject.set(x, "scripts", js.undefined)
    }
  }
  
  type ValidatedForm[UnValidated, Validated] = (Omit[UnValidated, /* keyof Validated */ String]) & Validated
  
  /* Inlined std.Readonly<@electron/osx-sign.@electron/osx-sign/dist/cjs/types.ValidatedForm<@electron/osx-sign.@electron/osx-sign/dist/cjs/types.OnlySignOptions, @electron/osx-sign.@electron/osx-sign/dist/cjs/types.OnlyValidatedSignOptions> & @electron/osx-sign.@electron/osx-sign/dist/cjs/types.ValidatedBaseSignOptions> */
  trait ValidatedSignOptions extends StObject {
    
    val app: String
    
    val binaries: js.UndefOr[js.Array[String]] = js.undefined
    
    val identity: js.UndefOr[String] = js.undefined
    
    val identityValidation: js.UndefOr[Boolean] = js.undefined
    
    val ignore: js.UndefOr[js.Array[String | (js.Function1[/* file */ String, Boolean])]] = js.undefined
    
    val keychain: js.UndefOr[String] = js.undefined
    
    val optionsForFile: js.UndefOr[js.Function1[/* filePath */ String, PerFileSignOptions]] = js.undefined
    
    val platform: ElectronMacPlatform
    
    val preAutoEntitlements: js.UndefOr[Boolean] = js.undefined
    
    val preEmbedProvisioningProfile: js.UndefOr[Boolean] = js.undefined
    
    val provisioningProfile: js.UndefOr[String] = js.undefined
    
    val strictVerify: js.UndefOr[Boolean] = js.undefined
    
    val `type`: SigningDistributionType
    
    val version: js.UndefOr[String] = js.undefined
  }
  object ValidatedSignOptions {
    
    inline def apply(app: String, platform: ElectronMacPlatform, `type`: SigningDistributionType): ValidatedSignOptions = {
      val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValidatedSignOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ValidatedSignOptions] (val x: Self) extends AnyVal {
      
      inline def setApp(value: String): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
      
      inline def setBinaries(value: js.Array[String]): Self = StObject.set(x, "binaries", value.asInstanceOf[js.Any])
      
      inline def setBinariesUndefined: Self = StObject.set(x, "binaries", js.undefined)
      
      inline def setBinariesVarargs(value: String*): Self = StObject.set(x, "binaries", js.Array(value*))
      
      inline def setIdentity(value: String): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      inline def setIdentityUndefined: Self = StObject.set(x, "identity", js.undefined)
      
      inline def setIdentityValidation(value: Boolean): Self = StObject.set(x, "identityValidation", value.asInstanceOf[js.Any])
      
      inline def setIdentityValidationUndefined: Self = StObject.set(x, "identityValidation", js.undefined)
      
      inline def setIgnore(value: js.Array[String | (js.Function1[/* file */ String, Boolean])]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      inline def setIgnoreVarargs(value: (String | (js.Function1[/* file */ String, Boolean]))*): Self = StObject.set(x, "ignore", js.Array(value*))
      
      inline def setKeychain(value: String): Self = StObject.set(x, "keychain", value.asInstanceOf[js.Any])
      
      inline def setKeychainUndefined: Self = StObject.set(x, "keychain", js.undefined)
      
      inline def setOptionsForFile(value: /* filePath */ String => PerFileSignOptions): Self = StObject.set(x, "optionsForFile", js.Any.fromFunction1(value))
      
      inline def setOptionsForFileUndefined: Self = StObject.set(x, "optionsForFile", js.undefined)
      
      inline def setPlatform(value: ElectronMacPlatform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setPreAutoEntitlements(value: Boolean): Self = StObject.set(x, "preAutoEntitlements", value.asInstanceOf[js.Any])
      
      inline def setPreAutoEntitlementsUndefined: Self = StObject.set(x, "preAutoEntitlements", js.undefined)
      
      inline def setPreEmbedProvisioningProfile(value: Boolean): Self = StObject.set(x, "preEmbedProvisioningProfile", value.asInstanceOf[js.Any])
      
      inline def setPreEmbedProvisioningProfileUndefined: Self = StObject.set(x, "preEmbedProvisioningProfile", js.undefined)
      
      inline def setProvisioningProfile(value: String): Self = StObject.set(x, "provisioningProfile", value.asInstanceOf[js.Any])
      
      inline def setProvisioningProfileUndefined: Self = StObject.set(x, "provisioningProfile", js.undefined)
      
      inline def setStrictVerify(value: Boolean): Self = StObject.set(x, "strictVerify", value.asInstanceOf[js.Any])
      
      inline def setStrictVerifyUndefined: Self = StObject.set(x, "strictVerify", js.undefined)
      
      inline def setType(value: SigningDistributionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
}
