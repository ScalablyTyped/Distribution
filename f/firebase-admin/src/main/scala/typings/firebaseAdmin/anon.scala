package typings.firebaseAdmin

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseAdmin.authMod.auth.HashAlgorithmType
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Action extends StObject {
    
    /**
      * An action available to the user when the notification is presented
      */
    var action: String = js.native
    
    /**
      * Optional icon for a notification action.
      */
    var icon: js.UndefOr[String] = js.native
    
    /**
      * Title of the notification action.
      */
    var title: String = js.native
  }
  object Action {
    
    @scala.inline
    def apply(action: String, title: String): Action = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[Action]
    }
    
    @scala.inline
    implicit class ActionMutableBuilder[Self <: Action] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Algorithm extends StObject {
    
    /**
      * The password hashing algorithm identifier. The following algorithm
      * identifiers are supported:
      * `SCRYPT`, `STANDARD_SCRYPT`, `HMAC_SHA512`, `HMAC_SHA256`, `HMAC_SHA1`,
      * `HMAC_MD5`, `MD5`, `PBKDF_SHA1`, `BCRYPT`, `PBKDF2_SHA256`, `SHA512`,
      * `SHA256` and `SHA1`.
      */
    var algorithm: HashAlgorithmType = js.native
    
    /**
      * The block size (normally 8) of the hashing algorithm. Required for the
      * `STANDARD_SCRYPT` algorithm.
      */
    var blockSize: js.UndefOr[Double] = js.native
    
    /**
      * The derived key length of the hashing algorithm. Required for the
      * `STANDARD_SCRYPT` algorithm.
      */
    var derivedKeyLength: js.UndefOr[Double] = js.native
    
    /**
      * The signing key used in the hash algorithm in buffer bytes.
      * Required by hashing algorithms `SCRYPT`, `HMAC_SHA512`, `HMAC_SHA256`,
      * `HAMC_SHA1` and `HMAC_MD5`.
      */
    var key: js.UndefOr[Buffer] = js.native
    
    /**
      * The memory cost required for `SCRYPT` algorithm, or the CPU/memory cost.
      * Required for `STANDARD_SCRYPT` algorithm.
      */
    var memoryCost: js.UndefOr[Double] = js.native
    
    /**
      * The parallelization of the hashing algorithm. Required for the
      * `STANDARD_SCRYPT` algorithm.
      */
    var parallelization: js.UndefOr[Double] = js.native
    
    /**
      * The number of rounds for hashing calculation.
      * Required for `SCRYPT`, `MD5`, `SHA512`, `SHA256`, `SHA1`, `PBKDF_SHA1` and
      * `PBKDF2_SHA256`.
      */
    var rounds: js.UndefOr[Double] = js.native
    
    /**
      * The salt separator in buffer bytes which is appended to salt when
      * verifying a password. This is only used by the `SCRYPT` algorithm.
      */
    var saltSeparator: js.UndefOr[Buffer] = js.native
  }
  object Algorithm {
    
    @scala.inline
    def apply(algorithm: HashAlgorithmType): Algorithm = {
      val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any])
      __obj.asInstanceOf[Algorithm]
    }
    
    @scala.inline
    implicit class AlgorithmMutableBuilder[Self <: Algorithm] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlgorithm(value: HashAlgorithmType): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlockSize(value: Double): Self = StObject.set(x, "blockSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlockSizeUndefined: Self = StObject.set(x, "blockSize", js.undefined)
      
      @scala.inline
      def setDerivedKeyLength(value: Double): Self = StObject.set(x, "derivedKeyLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDerivedKeyLengthUndefined: Self = StObject.set(x, "derivedKeyLength", js.undefined)
      
      @scala.inline
      def setKey(value: Buffer): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setMemoryCost(value: Double): Self = StObject.set(x, "memoryCost", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMemoryCostUndefined: Self = StObject.set(x, "memoryCost", js.undefined)
      
      @scala.inline
      def setParallelization(value: Double): Self = StObject.set(x, "parallelization", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParallelizationUndefined: Self = StObject.set(x, "parallelization", js.undefined)
      
      @scala.inline
      def setRounds(value: Double): Self = StObject.set(x, "rounds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoundsUndefined: Self = StObject.set(x, "rounds", js.undefined)
      
      @scala.inline
      def setSaltSeparator(value: Buffer): Self = StObject.set(x, "saltSeparator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSaltSeparatorUndefined: Self = StObject.set(x, "saltSeparator", js.undefined)
    }
  }
  
  @js.native
  trait AutomlModel extends StObject {
    
    var automlModel: String = js.native
  }
  object AutomlModel {
    
    @scala.inline
    def apply(automlModel: String): AutomlModel = {
      val __obj = js.Dynamic.literal(automlModel = automlModel.asInstanceOf[js.Any])
      __obj.asInstanceOf[AutomlModel]
    }
    
    @scala.inline
    implicit class AutomlModelMutableBuilder[Self <: AutomlModel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutomlModel(value: String): Self = StObject.set(x, "automlModel", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BundleId extends StObject {
    
    /**
      * Defines the required iOS bundle ID of the app where the link should be
      * handled if the application is already installed on the device.
      */
    var bundleId: String = js.native
  }
  object BundleId {
    
    @scala.inline
    def apply(bundleId: String): BundleId = {
      val __obj = js.Dynamic.literal(bundleId = bundleId.asInstanceOf[js.Any])
      __obj.asInstanceOf[BundleId]
    }
    
    @scala.inline
    implicit class BundleIdMutableBuilder[Self <: BundleId] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBundleId(value: String): Self = StObject.set(x, "bundleId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Dictkey
    extends /* key */ StringDictionary[js.Any] {
    
    /**
      * Provider-specific identity details corresponding
      * to the provider used to sign in the user.
      */
    var identities: StringDictionary[js.Any] = js.native
    
    /**
      * The `uid` of the second factor used to sign in, provided the
      * ID token was obtained from a multi-factor authenticated user.
      */
    var second_factor_identifier: js.UndefOr[String] = js.native
    
    /**
      * The ID of the provider used to sign in the user.
      * One of `"anonymous"`, `"password"`, `"facebook.com"`, `"github.com"`,
      * `"google.com"`, `"twitter.com"`, or `"custom"`.
      */
    var sign_in_provider: String = js.native
    
    /**
      * The type identifier or `factorId` of the second factor, provided the
      * ID token was obtained from a multi-factor authenticated user.
      * For phone, this is `"phone"`.
      */
    var sign_in_second_factor: js.UndefOr[String] = js.native
    
    /**
      * The ID of the tenant the user belongs to, if available.
      */
    var tenant: js.UndefOr[String] = js.native
  }
  object Dictkey {
    
    @scala.inline
    def apply(identities: StringDictionary[js.Any], sign_in_provider: String): Dictkey = {
      val __obj = js.Dynamic.literal(identities = identities.asInstanceOf[js.Any], sign_in_provider = sign_in_provider.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dictkey]
    }
    
    @scala.inline
    implicit class DictkeyMutableBuilder[Self <: Dictkey] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIdentities(value: StringDictionary[js.Any]): Self = StObject.set(x, "identities", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecond_factor_identifier(value: String): Self = StObject.set(x, "second_factor_identifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecond_factor_identifierUndefined: Self = StObject.set(x, "second_factor_identifier", js.undefined)
      
      @scala.inline
      def setSign_in_provider(value: String): Self = StObject.set(x, "sign_in_provider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSign_in_second_factor(value: String): Self = StObject.set(x, "sign_in_second_factor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSign_in_second_factorUndefined: Self = StObject.set(x, "sign_in_second_factor", js.undefined)
      
      @scala.inline
      def setTenant(value: String): Self = StObject.set(x, "tenant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTenantUndefined: Self = StObject.set(x, "tenant", js.undefined)
    }
  }
  
  @js.native
  trait Enabled extends StObject {
    
    /**
      * Whether email provider is enabled.
      */
    var enabled: Boolean = js.native
    
    /**
      * Whether password is required for email sign-in. When not required,
      * email sign-in can be performed with password or via email link sign-in.
      */
    var passwordRequired: js.UndefOr[Boolean] = js.native
  }
  object Enabled {
    
    @scala.inline
    def apply(enabled: Boolean): Enabled = {
      val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[Enabled]
    }
    
    @scala.inline
    implicit class EnabledMutableBuilder[Self <: Enabled] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPasswordRequired(value: Boolean): Self = StObject.set(x, "passwordRequired", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPasswordRequiredUndefined: Self = StObject.set(x, "passwordRequired", js.undefined)
    }
  }
  
  @js.native
  trait Force extends StObject {
    
    var force: Boolean = js.native
  }
  object Force {
    
    @scala.inline
    def apply(force: Boolean): Force = {
      val __obj = js.Dynamic.literal(force = force.asInstanceOf[js.Any])
      __obj.asInstanceOf[Force]
    }
    
    @scala.inline
    implicit class ForceMutableBuilder[Self <: Force] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GcsTfliteUri extends StObject {
    
    var gcsTfliteUri: String = js.native
  }
  object GcsTfliteUri {
    
    @scala.inline
    def apply(gcsTfliteUri: String): GcsTfliteUri = {
      val __obj = js.Dynamic.literal(gcsTfliteUri = gcsTfliteUri.asInstanceOf[js.Any])
      __obj.asInstanceOf[GcsTfliteUri]
    }
    
    @scala.inline
    implicit class GcsTfliteUriMutableBuilder[Self <: GcsTfliteUri] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGcsTfliteUri(value: String): Self = StObject.set(x, "gcsTfliteUri", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait InstallApp extends StObject {
    
    /**
      * Whether to install the Android app if the device supports it and the app is
      * not already installed.
      */
    var installApp: js.UndefOr[Boolean] = js.native
    
    /**
      * The Android minimum version if available. If the installed app is an older
      * version, the user is taken to the GOogle Play Store to upgrade the app.
      */
    var minimumVersion: js.UndefOr[String] = js.native
    
    /**
      * Defines the required Android package name of the app where the link should be
      * handled if the Android app is installed.
      */
    var packageName: String = js.native
  }
  object InstallApp {
    
    @scala.inline
    def apply(packageName: String): InstallApp = {
      val __obj = js.Dynamic.literal(packageName = packageName.asInstanceOf[js.Any])
      __obj.asInstanceOf[InstallApp]
    }
    
    @scala.inline
    implicit class InstallAppMutableBuilder[Self <: InstallApp] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInstallApp(value: Boolean): Self = StObject.set(x, "installApp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstallAppUndefined: Self = StObject.set(x, "installApp", js.undefined)
      
      @scala.inline
      def setMinimumVersion(value: String): Self = StObject.set(x, "minimumVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinimumVersionUndefined: Self = StObject.set(x, "minimumVersion", js.undefined)
      
      @scala.inline
      def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    }
  }
}
