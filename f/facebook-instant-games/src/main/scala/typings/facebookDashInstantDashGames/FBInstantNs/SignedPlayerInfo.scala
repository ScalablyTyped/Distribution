package typings.facebookDashInstantDashGames.FBInstantNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents information about the player along with a signature to verify that it indeed comes from Facebook.
  */
trait SignedPlayerInfo extends js.Object {
  /**
    * Get the id of the player.
    * @returns The ID of the player
    */
  def getPlayerID(): String
  /**
    * A signature to verify this object indeed comes from Facebook. The string is base64url encoded and signed with an HMAC version of your App Secret,
    * based on the OAuth 2.0 spec.
    *
    * You can validate it with the following 4 steps:
    *
    * Split the signature into two parts delimited by the '.' character.
    *
    * Decode the first part (the encoded signature) with base64url encoding.
    *
    * Decode the second part (the response payload) with base64url encoding, which should be a string representation of a JSON object that has the following fields:
    * ** algorithm - always equals to HMAC-SHA256
    * ** issued_at - a unix timestamp of when this response was issued.
    * ** player_id - unique identifier of the player.
    * ** request_payload - the requestPayload string you specified when calling FBInstant.player.getSignedPlayerInfoAsync.
    *
    * Hash the whole response payload string using HMAC SHA-256 and your app secret and confirm that it is equal to the encoded signature.
    *
    * You may also wish to validate the issued_at timestamp in the response payload to ensure the request was made recently.
    *
    * Signature validation should only happen on your server. Never do it on the client side as it will compromise your app secret key.
    *
    * @returns The signature string.
    */
  def getSignature(): String
}

object SignedPlayerInfo {
  @scala.inline
  def apply(getPlayerID: () => String, getSignature: () => String): SignedPlayerInfo = {
    val __obj = js.Dynamic.literal(getPlayerID = js.Any.fromFunction0(getPlayerID), getSignature = js.Any.fromFunction0(getSignature))
  
    __obj.asInstanceOf[SignedPlayerInfo]
  }
}

