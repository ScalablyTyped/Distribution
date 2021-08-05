package typings.firebaseAdmin

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseAdmin.authMod.auth.HashAlgorithmType
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Action extends StObject {
    
    /**
      * An action available to the user when the notification is presented
      */
    var action: String
    
    /**
      * Optional icon for a notification action.
      */
    var icon: js.UndefOr[String] = js.undefined
    
    /**
      * Title of the notification action.
      */
    var title: String
  }
  object Action {
    
    inline def apply(action: String, title: String): Action = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[Action]
    }
    
    extension [Self <: Action](x: Self) {
      
      inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  trait Algorithm extends StObject {
    
    /**
      * The password hashing algorithm identifier. The following algorithm
      * identifiers are supported:
      * `SCRYPT`, `STANDARD_SCRYPT`, `HMAC_SHA512`, `HMAC_SHA256`, `HMAC_SHA1`,
      * `HMAC_MD5`, `MD5`, `PBKDF_SHA1`, `BCRYPT`, `PBKDF2_SHA256`, `SHA512`,
      * `SHA256` and `SHA1`.
      */
    var algorithm: HashAlgorithmType
    
    /**
      * The block size (normally 8) of the hashing algorithm. Required for the
      * `STANDARD_SCRYPT` algorithm.
      */
    var blockSize: js.UndefOr[Double] = js.undefined
    
    /**
      * The derived key length of the hashing algorithm. Required for the
      * `STANDARD_SCRYPT` algorithm.
      */
    var derivedKeyLength: js.UndefOr[Double] = js.undefined
    
    /**
      * The signing key used in the hash algorithm in buffer bytes.
      * Required by hashing algorithms `SCRYPT`, `HMAC_SHA512`, `HMAC_SHA256`,
      * `HAMC_SHA1` and `HMAC_MD5`.
      */
    var key: js.UndefOr[Buffer] = js.undefined
    
    /**
      * The memory cost required for `SCRYPT` algorithm, or the CPU/memory cost.
      * Required for `STANDARD_SCRYPT` algorithm.
      */
    var memoryCost: js.UndefOr[Double] = js.undefined
    
    /**
      * The parallelization of the hashing algorithm. Required for the
      * `STANDARD_SCRYPT` algorithm.
      */
    var parallelization: js.UndefOr[Double] = js.undefined
    
    /**
      * The number of rounds for hashing calculation.
      * Required for `SCRYPT`, `MD5`, `SHA512`, `SHA256`, `SHA1`, `PBKDF_SHA1` and
      * `PBKDF2_SHA256`.
      */
    var rounds: js.UndefOr[Double] = js.undefined
    
    /**
      * The salt separator in buffer bytes which is appended to salt when
      * verifying a password. This is only used by the `SCRYPT` algorithm.
      */
    var saltSeparator: js.UndefOr[Buffer] = js.undefined
  }
  object Algorithm {
    
    inline def apply(algorithm: HashAlgorithmType): Algorithm = {
      val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any])
      __obj.asInstanceOf[Algorithm]
    }
    
    extension [Self <: Algorithm](x: Self) {
      
      inline def setAlgorithm(value: HashAlgorithmType): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      inline def setBlockSize(value: Double): Self = StObject.set(x, "blockSize", value.asInstanceOf[js.Any])
      
      inline def setBlockSizeUndefined: Self = StObject.set(x, "blockSize", js.undefined)
      
      inline def setDerivedKeyLength(value: Double): Self = StObject.set(x, "derivedKeyLength", value.asInstanceOf[js.Any])
      
      inline def setDerivedKeyLengthUndefined: Self = StObject.set(x, "derivedKeyLength", js.undefined)
      
      inline def setKey(value: Buffer): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setMemoryCost(value: Double): Self = StObject.set(x, "memoryCost", value.asInstanceOf[js.Any])
      
      inline def setMemoryCostUndefined: Self = StObject.set(x, "memoryCost", js.undefined)
      
      inline def setParallelization(value: Double): Self = StObject.set(x, "parallelization", value.asInstanceOf[js.Any])
      
      inline def setParallelizationUndefined: Self = StObject.set(x, "parallelization", js.undefined)
      
      inline def setRounds(value: Double): Self = StObject.set(x, "rounds", value.asInstanceOf[js.Any])
      
      inline def setRoundsUndefined: Self = StObject.set(x, "rounds", js.undefined)
      
      inline def setSaltSeparator(value: Buffer): Self = StObject.set(x, "saltSeparator", value.asInstanceOf[js.Any])
      
      inline def setSaltSeparatorUndefined: Self = StObject.set(x, "saltSeparator", js.undefined)
    }
  }
  
  trait AutomlModel extends StObject {
    
    var automlModel: String
  }
  object AutomlModel {
    
    inline def apply(automlModel: String): AutomlModel = {
      val __obj = js.Dynamic.literal(automlModel = automlModel.asInstanceOf[js.Any])
      __obj.asInstanceOf[AutomlModel]
    }
    
    extension [Self <: AutomlModel](x: Self) {
      
      inline def setAutomlModel(value: String): Self = StObject.set(x, "automlModel", value.asInstanceOf[js.Any])
    }
  }
  
  trait BundleId extends StObject {
    
    /**
      * Defines the required iOS bundle ID of the app where the link should be
      * handled if the application is already installed on the device.
      */
    var bundleId: String
  }
  object BundleId {
    
    inline def apply(bundleId: String): BundleId = {
      val __obj = js.Dynamic.literal(bundleId = bundleId.asInstanceOf[js.Any])
      __obj.asInstanceOf[BundleId]
    }
    
    extension [Self <: BundleId](x: Self) {
      
      inline def setBundleId(value: String): Self = StObject.set(x, "bundleId", value.asInstanceOf[js.Any])
    }
  }
  
  trait Dictkey
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    /**
      * Provider-specific identity details corresponding
      * to the provider used to sign in the user.
      */
    var identities: StringDictionary[js.Any]
    
    /**
      * The `uid` of the second factor used to sign in, provided the
      * ID token was obtained from a multi-factor authenticated user.
      */
    var second_factor_identifier: js.UndefOr[String] = js.undefined
    
    /**
      * The ID of the provider used to sign in the user.
      * One of `"anonymous"`, `"password"`, `"facebook.com"`, `"github.com"`,
      * `"google.com"`, `"twitter.com"`, or `"custom"`.
      */
    var sign_in_provider: String
    
    /**
      * The type identifier or `factorId` of the second factor, provided the
      * ID token was obtained from a multi-factor authenticated user.
      * For phone, this is `"phone"`.
      */
    var sign_in_second_factor: js.UndefOr[String] = js.undefined
    
    /**
      * The ID of the tenant the user belongs to, if available.
      */
    var tenant: js.UndefOr[String] = js.undefined
  }
  object Dictkey {
    
    inline def apply(identities: StringDictionary[js.Any], sign_in_provider: String): Dictkey = {
      val __obj = js.Dynamic.literal(identities = identities.asInstanceOf[js.Any], sign_in_provider = sign_in_provider.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dictkey]
    }
    
    extension [Self <: Dictkey](x: Self) {
      
      inline def setIdentities(value: StringDictionary[js.Any]): Self = StObject.set(x, "identities", value.asInstanceOf[js.Any])
      
      inline def setSecond_factor_identifier(value: String): Self = StObject.set(x, "second_factor_identifier", value.asInstanceOf[js.Any])
      
      inline def setSecond_factor_identifierUndefined: Self = StObject.set(x, "second_factor_identifier", js.undefined)
      
      inline def setSign_in_provider(value: String): Self = StObject.set(x, "sign_in_provider", value.asInstanceOf[js.Any])
      
      inline def setSign_in_second_factor(value: String): Self = StObject.set(x, "sign_in_second_factor", value.asInstanceOf[js.Any])
      
      inline def setSign_in_second_factorUndefined: Self = StObject.set(x, "sign_in_second_factor", js.undefined)
      
      inline def setTenant(value: String): Self = StObject.set(x, "tenant", value.asInstanceOf[js.Any])
      
      inline def setTenantUndefined: Self = StObject.set(x, "tenant", js.undefined)
    }
  }
  
  trait Enabled extends StObject {
    
    /**
      * Whether email provider is enabled.
      */
    var enabled: Boolean
    
    /**
      * Whether password is required for email sign-in. When not required,
      * email sign-in can be performed with password or via email link sign-in.
      */
    var passwordRequired: js.UndefOr[Boolean] = js.undefined
  }
  object Enabled {
    
    inline def apply(enabled: Boolean): Enabled = {
      val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[Enabled]
    }
    
    extension [Self <: Enabled](x: Self) {
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setPasswordRequired(value: Boolean): Self = StObject.set(x, "passwordRequired", value.asInstanceOf[js.Any])
      
      inline def setPasswordRequiredUndefined: Self = StObject.set(x, "passwordRequired", js.undefined)
    }
  }
  
  trait Force extends StObject {
    
    var force: Boolean
  }
  object Force {
    
    inline def apply(force: Boolean): Force = {
      val __obj = js.Dynamic.literal(force = force.asInstanceOf[js.Any])
      __obj.asInstanceOf[Force]
    }
    
    extension [Self <: Force](x: Self) {
      
      inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    }
  }
  
  trait GcsTfliteUri extends StObject {
    
    var gcsTfliteUri: String
  }
  object GcsTfliteUri {
    
    inline def apply(gcsTfliteUri: String): GcsTfliteUri = {
      val __obj = js.Dynamic.literal(gcsTfliteUri = gcsTfliteUri.asInstanceOf[js.Any])
      __obj.asInstanceOf[GcsTfliteUri]
    }
    
    extension [Self <: GcsTfliteUri](x: Self) {
      
      inline def setGcsTfliteUri(value: String): Self = StObject.set(x, "gcsTfliteUri", value.asInstanceOf[js.Any])
    }
  }
  
  trait InstallApp extends StObject {
    
    /**
      * Whether to install the Android app if the device supports it and the app is
      * not already installed.
      */
    var installApp: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The Android minimum version if available. If the installed app is an older
      * version, the user is taken to the GOogle Play Store to upgrade the app.
      */
    var minimumVersion: js.UndefOr[String] = js.undefined
    
    /**
      * Defines the required Android package name of the app where the link should be
      * handled if the Android app is installed.
      */
    var packageName: String
  }
  object InstallApp {
    
    inline def apply(packageName: String): InstallApp = {
      val __obj = js.Dynamic.literal(packageName = packageName.asInstanceOf[js.Any])
      __obj.asInstanceOf[InstallApp]
    }
    
    extension [Self <: InstallApp](x: Self) {
      
      inline def setInstallApp(value: Boolean): Self = StObject.set(x, "installApp", value.asInstanceOf[js.Any])
      
      inline def setInstallAppUndefined: Self = StObject.set(x, "installApp", js.undefined)
      
      inline def setMinimumVersion(value: String): Self = StObject.set(x, "minimumVersion", value.asInstanceOf[js.Any])
      
      inline def setMinimumVersionUndefined: Self = StObject.set(x, "minimumVersion", js.undefined)
      
      inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    }
  }
}
