package typings.gapiDotClientDotAdexchangebuyer.gapi.client.adexchangebuyer

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotAdexchangebuyer.Anon_AccountId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PubprofilesResource extends js.Object {
  /** Gets the requested publisher profile(s) by publisher accountId. */
  def list(request: Anon_AccountId): Request[GetPublisherProfilesByAccountIdResponse]
}

object PubprofilesResource {
  @scala.inline
  def apply(list: Anon_AccountId => Request[GetPublisherProfilesByAccountIdResponse]): PubprofilesResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[PubprofilesResource]
  }
}

