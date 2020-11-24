package typings.googleAuthLibrary.loginticketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TokenPayload extends js.Object {
  
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
  implicit class TokenPayloadOps[Self <: TokenPayload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAud(value: String): Self = this.set("aud", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExp(value: Double): Self = this.set("exp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIat(value: Double): Self = this.set("iat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIss(value: String): Self = this.set("iss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSub(value: String): Self = this.set("sub", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAt_hash(value: String): Self = this.set("at_hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAt_hash: Self = this.set("at_hash", js.undefined)
    
    @scala.inline
    def setAzp(value: String): Self = this.set("azp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAzp: Self = this.set("azp", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    
    @scala.inline
    def setEmail_verified(value: Boolean): Self = this.set("email_verified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmail_verified: Self = this.set("email_verified", js.undefined)
    
    @scala.inline
    def setFamily_name(value: String): Self = this.set("family_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFamily_name: Self = this.set("family_name", js.undefined)
    
    @scala.inline
    def setGiven_name(value: String): Self = this.set("given_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGiven_name: Self = this.set("given_name", js.undefined)
    
    @scala.inline
    def setHd(value: String): Self = this.set("hd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHd: Self = this.set("hd", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNonce(value: String): Self = this.set("nonce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNonce: Self = this.set("nonce", js.undefined)
    
    @scala.inline
    def setPicture(value: String): Self = this.set("picture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePicture: Self = this.set("picture", js.undefined)
    
    @scala.inline
    def setProfile(value: String): Self = this.set("profile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProfile: Self = this.set("profile", js.undefined)
  }
}
