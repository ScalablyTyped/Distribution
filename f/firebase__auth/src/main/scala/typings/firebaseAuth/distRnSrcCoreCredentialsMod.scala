package typings.firebaseAuth

import typings.firebaseAuth.distRnSrcCoreCredentialsOauthMod.OAuthCredentialParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distRnSrcCoreCredentialsMod {
  
  @JSImport("@firebase/auth/dist/rn/src/core/credentials", "AuthCredential")
  @js.native
  open class AuthCredential protected ()
    extends typings.firebaseAuth.distRnSrcCoreCredentialsAuthCredentialMod.AuthCredential {
    /** @internal */
    /* protected */ def this(
      /**
      * The authentication provider ID for the credential.
      *
      * @remarks
      * For example, 'facebook.com', or 'google.com'.
      */
    providerId: String,
      /**
      * The authentication sign in method for the credential.
      *
      * @remarks
      * For example, {@link SignInMethod}.EMAIL_PASSWORD, or
      * {@link SignInMethod}.EMAIL_LINK. This corresponds to the sign-in method
      * identifier as returned in {@link fetchSignInMethodsForEmail}.
      */
    signInMethod: String
    ) = this()
  }
  
  @JSImport("@firebase/auth/dist/rn/src/core/credentials", "EmailAuthCredential")
  @js.native
  /** @internal */
  /* private */ open class EmailAuthCredential ()
    extends typings.firebaseAuth.distRnSrcCoreCredentialsEmailMod.EmailAuthCredential
  /* static members */
  object EmailAuthCredential {
    
    @JSImport("@firebase/auth/dist/rn/src/core/credentials", "EmailAuthCredential")
    @js.native
    val ^ : js.Any = js.native
    
    /** @internal */
    inline def _fromEmailAndCode(email: String, oobCode: String): typings.firebaseAuth.distRnSrcCoreCredentialsEmailMod.EmailAuthCredential = (^.asInstanceOf[js.Dynamic].applyDynamic("_fromEmailAndCode")(email.asInstanceOf[js.Any], oobCode.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseAuth.distRnSrcCoreCredentialsEmailMod.EmailAuthCredential]
    inline def _fromEmailAndCode(email: String, oobCode: String, tenantId: String): typings.firebaseAuth.distRnSrcCoreCredentialsEmailMod.EmailAuthCredential = (^.asInstanceOf[js.Dynamic].applyDynamic("_fromEmailAndCode")(email.asInstanceOf[js.Any], oobCode.asInstanceOf[js.Any], tenantId.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseAuth.distRnSrcCoreCredentialsEmailMod.EmailAuthCredential]
    
    /** @internal */
    inline def _fromEmailAndPassword(email: String, password: String): typings.firebaseAuth.distRnSrcCoreCredentialsEmailMod.EmailAuthCredential = (^.asInstanceOf[js.Dynamic].applyDynamic("_fromEmailAndPassword")(email.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseAuth.distRnSrcCoreCredentialsEmailMod.EmailAuthCredential]
    
    inline def fromJSON(json: String): typings.firebaseAuth.distRnSrcCoreCredentialsEmailMod.EmailAuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseAuth.distRnSrcCoreCredentialsEmailMod.EmailAuthCredential | Null]
    /**
      * Static method to deserialize a JSON representation of an object into an {@link  AuthCredential}.
      *
      * @param json - Either `object` or the stringified representation of the object. When string is
      * provided, `JSON.parse` would be called first.
      *
      * @returns If the JSON input does not represent an {@link AuthCredential}, null is returned.
      */
    inline def fromJSON(json: js.Object): typings.firebaseAuth.distRnSrcCoreCredentialsEmailMod.EmailAuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseAuth.distRnSrcCoreCredentialsEmailMod.EmailAuthCredential | Null]
  }
  
  @JSImport("@firebase/auth/dist/rn/src/core/credentials", "OAuthCredential")
  @js.native
  open class OAuthCredential protected ()
    extends typings.firebaseAuth.distRnSrcCoreCredentialsOauthMod.OAuthCredential {
    /** @internal */
    /* protected */ def this(
      /**
      * The authentication provider ID for the credential.
      *
      * @remarks
      * For example, 'facebook.com', or 'google.com'.
      */
    providerId: String,
      /**
      * The authentication sign in method for the credential.
      *
      * @remarks
      * For example, {@link SignInMethod}.EMAIL_PASSWORD, or
      * {@link SignInMethod}.EMAIL_LINK. This corresponds to the sign-in method
      * identifier as returned in {@link fetchSignInMethodsForEmail}.
      */
    signInMethod: String
    ) = this()
  }
  /* static members */
  object OAuthCredential {
    
    @JSImport("@firebase/auth/dist/rn/src/core/credentials", "OAuthCredential")
    @js.native
    val ^ : js.Any = js.native
    
    /** @internal */
    inline def _fromParams(params: OAuthCredentialParams): typings.firebaseAuth.distRnSrcCoreCredentialsOauthMod.OAuthCredential = ^.asInstanceOf[js.Dynamic].applyDynamic("_fromParams")(params.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseAuth.distRnSrcCoreCredentialsOauthMod.OAuthCredential]
    
    /**
      * Static method to deserialize a JSON representation of an object into an
      * {@link  AuthCredential}.
      *
      * @param json - Input can be either Object or the stringified representation of the object.
      * When string is provided, JSON.parse would be called first.
      *
      * @returns If the JSON input does not represent an {@link  AuthCredential}, null is returned.
      */
    inline def fromJSON(json: String): typings.firebaseAuth.distRnSrcCoreCredentialsOauthMod.OAuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseAuth.distRnSrcCoreCredentialsOauthMod.OAuthCredential | Null]
    inline def fromJSON(json: js.Object): typings.firebaseAuth.distRnSrcCoreCredentialsOauthMod.OAuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseAuth.distRnSrcCoreCredentialsOauthMod.OAuthCredential | Null]
  }
  
  @JSImport("@firebase/auth/dist/rn/src/core/credentials", "PhoneAuthCredential")
  @js.native
  /* private */ open class PhoneAuthCredential ()
    extends typings.firebaseAuth.distRnSrcCoreCredentialsPhoneMod.PhoneAuthCredential
  /* static members */
  object PhoneAuthCredential {
    
    @JSImport("@firebase/auth/dist/rn/src/core/credentials", "PhoneAuthCredential")
    @js.native
    val ^ : js.Any = js.native
    
    /** @internal */
    inline def _fromTokenResponse(phoneNumber: String, temporaryProof: String): typings.firebaseAuth.distRnSrcCoreCredentialsPhoneMod.PhoneAuthCredential = (^.asInstanceOf[js.Dynamic].applyDynamic("_fromTokenResponse")(phoneNumber.asInstanceOf[js.Any], temporaryProof.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseAuth.distRnSrcCoreCredentialsPhoneMod.PhoneAuthCredential]
    
    /** @internal */
    inline def _fromVerification(verificationId: String, verificationCode: String): typings.firebaseAuth.distRnSrcCoreCredentialsPhoneMod.PhoneAuthCredential = (^.asInstanceOf[js.Dynamic].applyDynamic("_fromVerification")(verificationId.asInstanceOf[js.Any], verificationCode.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseAuth.distRnSrcCoreCredentialsPhoneMod.PhoneAuthCredential]
    
    inline def fromJSON(json: String): typings.firebaseAuth.distRnSrcCoreCredentialsPhoneMod.PhoneAuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseAuth.distRnSrcCoreCredentialsPhoneMod.PhoneAuthCredential | Null]
    /** Generates a phone credential based on a plain object or a JSON string. */
    inline def fromJSON(json: js.Object): typings.firebaseAuth.distRnSrcCoreCredentialsPhoneMod.PhoneAuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseAuth.distRnSrcCoreCredentialsPhoneMod.PhoneAuthCredential | Null]
  }
}
