package typings.googleAuthLibrary

import typings.googleAuthLibrary.anon.Envelope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loginticketMod {
  
  @JSImport("google-auth-library/build/src/auth/loginticket", "LoginTicket")
  @js.native
  /**
    * Create a simple class to extract user ID from an ID Token
    *
    * @param {string} env Envelope of the jwt
    * @param {TokenPayload} pay Payload of the jwt
    * @constructor
    */
  class LoginTicket () extends StObject {
    def this(env: String) = this()
    def this(env: js.UndefOr[scala.Nothing], pay: TokenPayload) = this()
    def this(env: String, pay: TokenPayload) = this()
    
    var envelope: js.Any = js.native
    
    /**
      * Returns attributes from the login ticket.  This can contain
      * various information about the user session.
      *
      * @return The envelope and payload
      */
    def getAttributes(): Envelope = js.native
    
    def getEnvelope(): js.UndefOr[String] = js.native
    
    def getPayload(): js.UndefOr[TokenPayload] = js.native
    
    /**
      * Create a simple class to extract user ID from an ID Token
      *
      * @return The user ID
      */
    def getUserId(): String | Null = js.native
    
    var payload: js.Any = js.native
  }
  
  @js.native
  trait TokenPayload extends StObject {
    
    /**
      * Access token hash. Provides validation that the access token is tied to the
      * identity token. If the ID token is issued with an access token in the
      * server flow, this is always included. This can be used as an alternate
      * mechanism to protect against cross-site request forgery attacks, but if you
      * follow Step 1 and Step 3 it is not necessary to verify the access token.
      */
    var at_hash: js.UndefOr[String] = js.native
    
    /**
      * Identifies the audience that this ID token is intended for. It must be one
      * of the OAuth 2.0 client IDs of your application.
      */
    var aud: String = js.native
    
    /**
      * The client_id of the authorized presenter. This claim is only needed when
      * the party requesting the ID token is not the same as the audience of the ID
      * token. This may be the case at Google for hybrid apps where a web
      * application and Android app have a different client_id but share the same
      * project.
      */
    var azp: js.UndefOr[String] = js.native
    
    /**
      * The user's email address. This may not be unique and is not suitable for
      * use as a primary key. Provided only if your scope included the string
      * "email".
      */
    var email: js.UndefOr[String] = js.native
    
    /**
      * True if the user's e-mail address has been verified; otherwise false.
      */
    var email_verified: js.UndefOr[Boolean] = js.native
    
    /**
      * The time the ID token expires, represented in Unix time (integer seconds).
      */
    var exp: Double = js.native
    
    /**
      * The user's family name, in a displayable form. Might be provided when:
      * - The request scope included the string "profile"
      * - The ID token is returned from a token refresh
      * - When name claims are present, you can use them to update your app's user
      * records. Note that this claim is never guaranteed to be present.
      */
    var family_name: js.UndefOr[String] = js.native
    
    /**
      * The user's given name, in a displayable form. Might be provided when:
      * - The request scope included the string "profile"
      * - The ID token is returned from a token refresh
      * - When name claims are present, you can use them to update your app's user
      * records. Note that this claim is never guaranteed to be present.
      */
    var given_name: js.UndefOr[String] = js.native
    
    /**
      * The hosted G Suite domain of the user. Provided only if the user belongs to
      * a hosted domain.
      */
    var hd: js.UndefOr[String] = js.native
    
    /**
      * The time the ID token was issued, represented in Unix time (integer
      * seconds).
      */
    var iat: Double = js.native
    
    /**
      * The Issuer Identifier for the Issuer of the response. Always
      * https://accounts.google.com or accounts.google.com for Google ID tokens.
      */
    var iss: String = js.native
    
    /**
      * The user's locale, represented by a BCP 47 language tag.
      * Might be provided when a name claim is present.
      */
    var locale: js.UndefOr[String] = js.native
    
    /**
      * The user's full name, in a displayable form. Might be provided when:
      * - The request scope included the string "profile"
      * - The ID token is returned from a token refresh
      * - When name claims are present, you can use them to update your app's user
      * records. Note that this claim is never guaranteed to be present.
      */
    var name: js.UndefOr[String] = js.native
    
    /**
      * The value of the nonce supplied by your app in the authentication request.
      * You should enforce protection against replay attacks by ensuring it is
      * presented only once.
      */
    var nonce: js.UndefOr[String] = js.native
    
    /**
      * The URL of the user's profile picture. Might be provided when:
      * - The request scope included the string "profile"
      * - The ID token is returned from a token refresh
      * - When picture claims are present, you can use them to update your app's
      * user records. Note that this claim is never guaranteed to be present.
      */
    var picture: js.UndefOr[String] = js.native
    
    /**
      * The URL of the user's profile page. Might be provided when:
      * - The request scope included the string "profile"
      * - The ID token is returned from a token refresh
      * - When profile claims are present, you can use them to update your app's
      * user records. Note that this claim is never guaranteed to be present.
      */
    var profile: js.UndefOr[String] = js.native
    
    /**
      * An identifier for the user, unique among all Google accounts and never
      * reused. A Google account can have multiple emails at different points in
      * time, but the sub value is never changed. Use sub within your application
      * as the unique-identifier key for the user.
      */
    var sub: String = js.native
  }
  object TokenPayload {
    
    @scala.inline
    def apply(aud: String, exp: Double, iat: Double, iss: String, sub: String): TokenPayload = {
      val __obj = js.Dynamic.literal(aud = aud.asInstanceOf[js.Any], exp = exp.asInstanceOf[js.Any], iat = iat.asInstanceOf[js.Any], iss = iss.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any])
      __obj.asInstanceOf[TokenPayload]
    }
    
    @scala.inline
    implicit class TokenPayloadMutableBuilder[Self <: TokenPayload] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAt_hash(value: String): Self = StObject.set(x, "at_hash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAt_hashUndefined: Self = StObject.set(x, "at_hash", js.undefined)
      
      @scala.inline
      def setAud(value: String): Self = StObject.set(x, "aud", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAzp(value: String): Self = StObject.set(x, "azp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAzpUndefined: Self = StObject.set(x, "azp", js.undefined)
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      @scala.inline
      def setEmail_verified(value: Boolean): Self = StObject.set(x, "email_verified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmail_verifiedUndefined: Self = StObject.set(x, "email_verified", js.undefined)
      
      @scala.inline
      def setExp(value: Double): Self = StObject.set(x, "exp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFamily_name(value: String): Self = StObject.set(x, "family_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFamily_nameUndefined: Self = StObject.set(x, "family_name", js.undefined)
      
      @scala.inline
      def setGiven_name(value: String): Self = StObject.set(x, "given_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGiven_nameUndefined: Self = StObject.set(x, "given_name", js.undefined)
      
      @scala.inline
      def setHd(value: String): Self = StObject.set(x, "hd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHdUndefined: Self = StObject.set(x, "hd", js.undefined)
      
      @scala.inline
      def setIat(value: Double): Self = StObject.set(x, "iat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIss(value: String): Self = StObject.set(x, "iss", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      @scala.inline
      def setPicture(value: String): Self = StObject.set(x, "picture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPictureUndefined: Self = StObject.set(x, "picture", js.undefined)
      
      @scala.inline
      def setProfile(value: String): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
      
      @scala.inline
      def setSub(value: String): Self = StObject.set(x, "sub", value.asInstanceOf[js.Any])
    }
  }
}
