package typings.firebaseAdmin

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseAdmin.anon.Dictkey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAuthTokenVerifierMod {
  
  trait DecodedAuthBlockingEnrolledFactors extends StObject {
    
    var enrolled_factors: js.UndefOr[js.Array[DecodedAuthBlockingMfaInfo]] = js.undefined
  }
  object DecodedAuthBlockingEnrolledFactors {
    
    inline def apply(): DecodedAuthBlockingEnrolledFactors = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DecodedAuthBlockingEnrolledFactors]
    }
    
    extension [Self <: DecodedAuthBlockingEnrolledFactors](x: Self) {
      
      inline def setEnrolled_factors(value: js.Array[DecodedAuthBlockingMfaInfo]): Self = StObject.set(x, "enrolled_factors", value.asInstanceOf[js.Any])
      
      inline def setEnrolled_factorsUndefined: Self = StObject.set(x, "enrolled_factors", js.undefined)
      
      inline def setEnrolled_factorsVarargs(value: DecodedAuthBlockingMfaInfo*): Self = StObject.set(x, "enrolled_factors", js.Array(value*))
    }
  }
  
  trait DecodedAuthBlockingMetadata extends StObject {
    
    var creation_time: js.UndefOr[Double] = js.undefined
    
    var last_sign_in_time: js.UndefOr[Double] = js.undefined
  }
  object DecodedAuthBlockingMetadata {
    
    inline def apply(): DecodedAuthBlockingMetadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DecodedAuthBlockingMetadata]
    }
    
    extension [Self <: DecodedAuthBlockingMetadata](x: Self) {
      
      inline def setCreation_time(value: Double): Self = StObject.set(x, "creation_time", value.asInstanceOf[js.Any])
      
      inline def setCreation_timeUndefined: Self = StObject.set(x, "creation_time", js.undefined)
      
      inline def setLast_sign_in_time(value: Double): Self = StObject.set(x, "last_sign_in_time", value.asInstanceOf[js.Any])
      
      inline def setLast_sign_in_timeUndefined: Self = StObject.set(x, "last_sign_in_time", js.undefined)
    }
  }
  
  trait DecodedAuthBlockingMfaInfo extends StObject {
    
    var display_name: js.UndefOr[String] = js.undefined
    
    var enrollment_time: js.UndefOr[String] = js.undefined
    
    var factor_id: js.UndefOr[String] = js.undefined
    
    var phone_number: js.UndefOr[String] = js.undefined
    
    var uid: String
  }
  object DecodedAuthBlockingMfaInfo {
    
    inline def apply(uid: String): DecodedAuthBlockingMfaInfo = {
      val __obj = js.Dynamic.literal(uid = uid.asInstanceOf[js.Any])
      __obj.asInstanceOf[DecodedAuthBlockingMfaInfo]
    }
    
    extension [Self <: DecodedAuthBlockingMfaInfo](x: Self) {
      
      inline def setDisplay_name(value: String): Self = StObject.set(x, "display_name", value.asInstanceOf[js.Any])
      
      inline def setDisplay_nameUndefined: Self = StObject.set(x, "display_name", js.undefined)
      
      inline def setEnrollment_time(value: String): Self = StObject.set(x, "enrollment_time", value.asInstanceOf[js.Any])
      
      inline def setEnrollment_timeUndefined: Self = StObject.set(x, "enrollment_time", js.undefined)
      
      inline def setFactor_id(value: String): Self = StObject.set(x, "factor_id", value.asInstanceOf[js.Any])
      
      inline def setFactor_idUndefined: Self = StObject.set(x, "factor_id", js.undefined)
      
      inline def setPhone_number(value: String): Self = StObject.set(x, "phone_number", value.asInstanceOf[js.Any])
      
      inline def setPhone_numberUndefined: Self = StObject.set(x, "phone_number", js.undefined)
      
      inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    }
  }
  
  trait DecodedAuthBlockingSharedUserInfo extends StObject {
    
    var display_name: js.UndefOr[String] = js.undefined
    
    var email: js.UndefOr[String] = js.undefined
    
    var phone_number: js.UndefOr[String] = js.undefined
    
    var photo_url: js.UndefOr[String] = js.undefined
    
    var uid: String
  }
  object DecodedAuthBlockingSharedUserInfo {
    
    inline def apply(uid: String): DecodedAuthBlockingSharedUserInfo = {
      val __obj = js.Dynamic.literal(uid = uid.asInstanceOf[js.Any])
      __obj.asInstanceOf[DecodedAuthBlockingSharedUserInfo]
    }
    
    extension [Self <: DecodedAuthBlockingSharedUserInfo](x: Self) {
      
      inline def setDisplay_name(value: String): Self = StObject.set(x, "display_name", value.asInstanceOf[js.Any])
      
      inline def setDisplay_nameUndefined: Self = StObject.set(x, "display_name", js.undefined)
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setPhone_number(value: String): Self = StObject.set(x, "phone_number", value.asInstanceOf[js.Any])
      
      inline def setPhone_numberUndefined: Self = StObject.set(x, "phone_number", js.undefined)
      
      inline def setPhoto_url(value: String): Self = StObject.set(x, "photo_url", value.asInstanceOf[js.Any])
      
      inline def setPhoto_urlUndefined: Self = StObject.set(x, "photo_url", js.undefined)
      
      inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    }
  }
  
  trait DecodedAuthBlockingToken
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var aud: String
    
    var event_id: String
    
    var event_type: String
    
    var exp: Double
    
    var iat: Double
    
    var ip_address: String
    
    var iss: String
    
    var locale: js.UndefOr[String] = js.undefined
    
    var oauth_access_token: js.UndefOr[String] = js.undefined
    
    var oauth_expires_in: js.UndefOr[Double] = js.undefined
    
    var oauth_id_token: js.UndefOr[String] = js.undefined
    
    var oauth_refresh_token: js.UndefOr[String] = js.undefined
    
    var oauth_token_secret: js.UndefOr[String] = js.undefined
    
    var raw_user_info: js.UndefOr[String] = js.undefined
    
    var sign_in_attributes: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    var sign_in_method: js.UndefOr[String] = js.undefined
    
    var sub: String
    
    var tenant_id: js.UndefOr[String] = js.undefined
    
    var user_agent: js.UndefOr[String] = js.undefined
    
    var user_record: js.UndefOr[DecodedAuthBlockingUserRecord] = js.undefined
  }
  object DecodedAuthBlockingToken {
    
    inline def apply(
      aud: String,
      event_id: String,
      event_type: String,
      exp: Double,
      iat: Double,
      ip_address: String,
      iss: String,
      sub: String
    ): DecodedAuthBlockingToken = {
      val __obj = js.Dynamic.literal(aud = aud.asInstanceOf[js.Any], event_id = event_id.asInstanceOf[js.Any], event_type = event_type.asInstanceOf[js.Any], exp = exp.asInstanceOf[js.Any], iat = iat.asInstanceOf[js.Any], ip_address = ip_address.asInstanceOf[js.Any], iss = iss.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any])
      __obj.asInstanceOf[DecodedAuthBlockingToken]
    }
    
    extension [Self <: DecodedAuthBlockingToken](x: Self) {
      
      inline def setAud(value: String): Self = StObject.set(x, "aud", value.asInstanceOf[js.Any])
      
      inline def setEvent_id(value: String): Self = StObject.set(x, "event_id", value.asInstanceOf[js.Any])
      
      inline def setEvent_type(value: String): Self = StObject.set(x, "event_type", value.asInstanceOf[js.Any])
      
      inline def setExp(value: Double): Self = StObject.set(x, "exp", value.asInstanceOf[js.Any])
      
      inline def setIat(value: Double): Self = StObject.set(x, "iat", value.asInstanceOf[js.Any])
      
      inline def setIp_address(value: String): Self = StObject.set(x, "ip_address", value.asInstanceOf[js.Any])
      
      inline def setIss(value: String): Self = StObject.set(x, "iss", value.asInstanceOf[js.Any])
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setOauth_access_token(value: String): Self = StObject.set(x, "oauth_access_token", value.asInstanceOf[js.Any])
      
      inline def setOauth_access_tokenUndefined: Self = StObject.set(x, "oauth_access_token", js.undefined)
      
      inline def setOauth_expires_in(value: Double): Self = StObject.set(x, "oauth_expires_in", value.asInstanceOf[js.Any])
      
      inline def setOauth_expires_inUndefined: Self = StObject.set(x, "oauth_expires_in", js.undefined)
      
      inline def setOauth_id_token(value: String): Self = StObject.set(x, "oauth_id_token", value.asInstanceOf[js.Any])
      
      inline def setOauth_id_tokenUndefined: Self = StObject.set(x, "oauth_id_token", js.undefined)
      
      inline def setOauth_refresh_token(value: String): Self = StObject.set(x, "oauth_refresh_token", value.asInstanceOf[js.Any])
      
      inline def setOauth_refresh_tokenUndefined: Self = StObject.set(x, "oauth_refresh_token", js.undefined)
      
      inline def setOauth_token_secret(value: String): Self = StObject.set(x, "oauth_token_secret", value.asInstanceOf[js.Any])
      
      inline def setOauth_token_secretUndefined: Self = StObject.set(x, "oauth_token_secret", js.undefined)
      
      inline def setRaw_user_info(value: String): Self = StObject.set(x, "raw_user_info", value.asInstanceOf[js.Any])
      
      inline def setRaw_user_infoUndefined: Self = StObject.set(x, "raw_user_info", js.undefined)
      
      inline def setSign_in_attributes(value: StringDictionary[Any]): Self = StObject.set(x, "sign_in_attributes", value.asInstanceOf[js.Any])
      
      inline def setSign_in_attributesUndefined: Self = StObject.set(x, "sign_in_attributes", js.undefined)
      
      inline def setSign_in_method(value: String): Self = StObject.set(x, "sign_in_method", value.asInstanceOf[js.Any])
      
      inline def setSign_in_methodUndefined: Self = StObject.set(x, "sign_in_method", js.undefined)
      
      inline def setSub(value: String): Self = StObject.set(x, "sub", value.asInstanceOf[js.Any])
      
      inline def setTenant_id(value: String): Self = StObject.set(x, "tenant_id", value.asInstanceOf[js.Any])
      
      inline def setTenant_idUndefined: Self = StObject.set(x, "tenant_id", js.undefined)
      
      inline def setUser_agent(value: String): Self = StObject.set(x, "user_agent", value.asInstanceOf[js.Any])
      
      inline def setUser_agentUndefined: Self = StObject.set(x, "user_agent", js.undefined)
      
      inline def setUser_record(value: DecodedAuthBlockingUserRecord): Self = StObject.set(x, "user_record", value.asInstanceOf[js.Any])
      
      inline def setUser_recordUndefined: Self = StObject.set(x, "user_record", js.undefined)
    }
  }
  
  trait DecodedAuthBlockingUserInfo
    extends StObject
       with DecodedAuthBlockingSharedUserInfo {
    
    var provider_id: String
  }
  object DecodedAuthBlockingUserInfo {
    
    inline def apply(provider_id: String, uid: String): DecodedAuthBlockingUserInfo = {
      val __obj = js.Dynamic.literal(provider_id = provider_id.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
      __obj.asInstanceOf[DecodedAuthBlockingUserInfo]
    }
    
    extension [Self <: DecodedAuthBlockingUserInfo](x: Self) {
      
      inline def setProvider_id(value: String): Self = StObject.set(x, "provider_id", value.asInstanceOf[js.Any])
    }
  }
  
  trait DecodedAuthBlockingUserRecord
    extends StObject
       with DecodedAuthBlockingSharedUserInfo
       with /* key */ StringDictionary[Any] {
    
    var custom_claims: js.UndefOr[Any] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var email_verified: js.UndefOr[Boolean] = js.undefined
    
    var metadata: js.UndefOr[DecodedAuthBlockingMetadata] = js.undefined
    
    var multi_factor: js.UndefOr[DecodedAuthBlockingEnrolledFactors] = js.undefined
    
    var password_hash: js.UndefOr[String] = js.undefined
    
    var password_salt: js.UndefOr[String] = js.undefined
    
    var provider_data: js.UndefOr[js.Array[DecodedAuthBlockingUserInfo]] = js.undefined
    
    var tenant_id: js.UndefOr[String] = js.undefined
    
    var tokens_valid_after_time: js.UndefOr[Double] = js.undefined
  }
  object DecodedAuthBlockingUserRecord {
    
    inline def apply(uid: String): DecodedAuthBlockingUserRecord = {
      val __obj = js.Dynamic.literal(uid = uid.asInstanceOf[js.Any])
      __obj.asInstanceOf[DecodedAuthBlockingUserRecord]
    }
    
    extension [Self <: DecodedAuthBlockingUserRecord](x: Self) {
      
      inline def setCustom_claims(value: Any): Self = StObject.set(x, "custom_claims", value.asInstanceOf[js.Any])
      
      inline def setCustom_claimsUndefined: Self = StObject.set(x, "custom_claims", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setEmail_verified(value: Boolean): Self = StObject.set(x, "email_verified", value.asInstanceOf[js.Any])
      
      inline def setEmail_verifiedUndefined: Self = StObject.set(x, "email_verified", js.undefined)
      
      inline def setMetadata(value: DecodedAuthBlockingMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      inline def setMulti_factor(value: DecodedAuthBlockingEnrolledFactors): Self = StObject.set(x, "multi_factor", value.asInstanceOf[js.Any])
      
      inline def setMulti_factorUndefined: Self = StObject.set(x, "multi_factor", js.undefined)
      
      inline def setPassword_hash(value: String): Self = StObject.set(x, "password_hash", value.asInstanceOf[js.Any])
      
      inline def setPassword_hashUndefined: Self = StObject.set(x, "password_hash", js.undefined)
      
      inline def setPassword_salt(value: String): Self = StObject.set(x, "password_salt", value.asInstanceOf[js.Any])
      
      inline def setPassword_saltUndefined: Self = StObject.set(x, "password_salt", js.undefined)
      
      inline def setProvider_data(value: js.Array[DecodedAuthBlockingUserInfo]): Self = StObject.set(x, "provider_data", value.asInstanceOf[js.Any])
      
      inline def setProvider_dataUndefined: Self = StObject.set(x, "provider_data", js.undefined)
      
      inline def setProvider_dataVarargs(value: DecodedAuthBlockingUserInfo*): Self = StObject.set(x, "provider_data", js.Array(value*))
      
      inline def setTenant_id(value: String): Self = StObject.set(x, "tenant_id", value.asInstanceOf[js.Any])
      
      inline def setTenant_idUndefined: Self = StObject.set(x, "tenant_id", js.undefined)
      
      inline def setTokens_valid_after_time(value: Double): Self = StObject.set(x, "tokens_valid_after_time", value.asInstanceOf[js.Any])
      
      inline def setTokens_valid_after_timeUndefined: Self = StObject.set(x, "tokens_valid_after_time", js.undefined)
    }
  }
  
  trait DecodedIdToken
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    /**
      * The audience for which this token is intended.
      *
      * This value is a string equal to your Firebase project ID, the unique
      * identifier for your Firebase project, which can be found in [your project's
      * settings](https://console.firebase.google.com/project/_/settings/general/android:com.random.android).
      */
    var aud: String
    
    /**
      * Time, in seconds since the Unix epoch, when the end-user authentication
      * occurred.
      *
      * This value is not set when this particular ID token was created, but when the
      * user initially logged in to this session. In a single session, the Firebase
      * SDKs will refresh a user's ID tokens every hour. Each ID token will have a
      * different [`iat`](#iat) value, but the same `auth_time` value.
      */
    var auth_time: Double
    
    /**
      * The email of the user to whom the ID token belongs, if available.
      */
    var email: js.UndefOr[String] = js.undefined
    
    /**
      * Whether or not the email of the user to whom the ID token belongs is
      * verified, provided the user has an email.
      */
    var email_verified: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The ID token's expiration time, in seconds since the Unix epoch. That is, the
      * time at which this ID token expires and should no longer be considered valid.
      *
      * The Firebase SDKs transparently refresh ID tokens every hour, issuing a new
      * ID token with up to a one hour expiration.
      */
    var exp: Double
    
    /**
      * Information about the sign in event, including which sign in provider was
      * used and provider-specific identity details.
      *
      * This data is provided by the Firebase Authentication service and is a
      * reserved claim in the ID token.
      */
    var firebase: Dictkey
    
    /**
      * The ID token's issued-at time, in seconds since the Unix epoch. That is, the
      * time at which this ID token was issued and should start to be considered
      * valid.
      *
      * The Firebase SDKs transparently refresh ID tokens every hour, issuing a new
      * ID token with a new issued-at time. If you want to get the time at which the
      * user session corresponding to the ID token initially occurred, see the
      * [`auth_time`](#auth_time) property.
      */
    var iat: Double
    
    /**
      * The issuer identifier for the issuer of the response.
      *
      * This value is a URL with the format
      * `https://securetoken.google.com/<PROJECT_ID>`, where `<PROJECT_ID>` is the
      * same project ID specified in the [`aud`](#aud) property.
      */
    var iss: String
    
    /**
      * The phone number of the user to whom the ID token belongs, if available.
      */
    var phone_number: js.UndefOr[String] = js.undefined
    
    /**
      * The photo URL for the user to whom the ID token belongs, if available.
      */
    var picture: js.UndefOr[String] = js.undefined
    
    /**
      * The `uid` corresponding to the user who the ID token belonged to.
      *
      * As a convenience, this value is copied over to the [`uid`](#uid) property.
      */
    var sub: String
    
    /**
      * The `uid` corresponding to the user who the ID token belonged to.
      *
      * This value is not actually in the JWT token claims itself. It is added as a
      * convenience, and is set as the value of the [`sub`](#sub) property.
      */
    var uid: String
  }
  object DecodedIdToken {
    
    inline def apply(
      aud: String,
      auth_time: Double,
      exp: Double,
      firebase: Dictkey,
      iat: Double,
      iss: String,
      sub: String,
      uid: String
    ): DecodedIdToken = {
      val __obj = js.Dynamic.literal(aud = aud.asInstanceOf[js.Any], auth_time = auth_time.asInstanceOf[js.Any], exp = exp.asInstanceOf[js.Any], firebase = firebase.asInstanceOf[js.Any], iat = iat.asInstanceOf[js.Any], iss = iss.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
      __obj.asInstanceOf[DecodedIdToken]
    }
    
    extension [Self <: DecodedIdToken](x: Self) {
      
      inline def setAud(value: String): Self = StObject.set(x, "aud", value.asInstanceOf[js.Any])
      
      inline def setAuth_time(value: Double): Self = StObject.set(x, "auth_time", value.asInstanceOf[js.Any])
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setEmail_verified(value: Boolean): Self = StObject.set(x, "email_verified", value.asInstanceOf[js.Any])
      
      inline def setEmail_verifiedUndefined: Self = StObject.set(x, "email_verified", js.undefined)
      
      inline def setExp(value: Double): Self = StObject.set(x, "exp", value.asInstanceOf[js.Any])
      
      inline def setFirebase(value: Dictkey): Self = StObject.set(x, "firebase", value.asInstanceOf[js.Any])
      
      inline def setIat(value: Double): Self = StObject.set(x, "iat", value.asInstanceOf[js.Any])
      
      inline def setIss(value: String): Self = StObject.set(x, "iss", value.asInstanceOf[js.Any])
      
      inline def setPhone_number(value: String): Self = StObject.set(x, "phone_number", value.asInstanceOf[js.Any])
      
      inline def setPhone_numberUndefined: Self = StObject.set(x, "phone_number", js.undefined)
      
      inline def setPicture(value: String): Self = StObject.set(x, "picture", value.asInstanceOf[js.Any])
      
      inline def setPictureUndefined: Self = StObject.set(x, "picture", js.undefined)
      
      inline def setSub(value: String): Self = StObject.set(x, "sub", value.asInstanceOf[js.Any])
      
      inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    }
  }
}
