package typings.facebookInstantGames.FBInstant

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents app-scoped user id of current player along with a signature to verify that it indeed comes from
  * Facebook.
  *
  * @since 7.1
  */
trait SignedASID extends StObject {
  
  /**
    * Get the app-scoped user id of the player.
    *
    * @example
    * FBInstant.player.getSignedASIDAsync()
    *   .then(function (result) {
    *     result.getASID();
    *   });
    * @returns The ID of the player.
    */
  def getASID(): String
  
  /**
    * A signature to verify this object indeed comes from Facebook. The string is base64url encoded and signed with
    * an HMAC version of your App Secret, based on the OAuth 2.0 spec.
    *
    * You can validate it with the following 4 steps:
    *
    * * Split the signature into two parts delimited by the '.' character.
    * * Decode the first part (the encoded signature) with base64url encoding.
    * * Decode the second part (the response payload) with base64url encoding, which should be a string
    * representation of a JSON object that has the following fields: **algorithm** - always equals to HMAC-SHA256,
    * **issued_at** - a unix timestamp of when this response was issued, **asid** - the app-scoped user id of the player.
    * * Hash the whole response payload string using HMAC SHA-256 and your app secret and confirm that it is equal
    * to the encoded signature.
    * * You may also wish to validate the issued_at timestamp in the response payload to ensure the request was
    * made recently.
    *
    * Signature validation should only happen on your server. Never do it on the client side as it will compromise
    * your app secret key.
    *
    * @example
    * FBInstant.player.getSignedASIDAsync()
    *   .then(function (result) {
    *     result.getSignature();
    *     // Eii6e636mz5J47sfqAYEK40jYAwoFqi3x5bxHkPG4Q4.eyJhbGdvcml0aG0iOiJITUFDLVNIQTI1NiIsImlzc3VlZF9hdCI6MTUwM
    *     // DM5ODY3NSwicGxheWVyX2lkIjoiMTI0OTUyNTMwMTc1MjIwMSIsInJlcXVlc3RfcGF5bG9hZCI6Im15X2ZpcnN0X3JlcXVlc3QifQ
    *   });
    * @returns The signature string.
    */
  def getSignature(): String
}
object SignedASID {
  
  inline def apply(getASID: () => String, getSignature: () => String): SignedASID = {
    val __obj = js.Dynamic.literal(getASID = js.Any.fromFunction0(getASID), getSignature = js.Any.fromFunction0(getSignature))
    __obj.asInstanceOf[SignedASID]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SignedASID] (val x: Self) extends AnyVal {
    
    inline def setGetASID(value: () => String): Self = StObject.set(x, "getASID", js.Any.fromFunction0(value))
    
    inline def setGetSignature(value: () => String): Self = StObject.set(x, "getSignature", js.Any.fromFunction0(value))
  }
}
