package typings.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAdexchangebuyer.anon.AccountId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PubprofilesResource extends js.Object {
  /** Gets the requested publisher profile(s) by publisher accountId. */
  def list(request: AccountId): Request[GetPublisherProfilesByAccountIdResponse]
}

object PubprofilesResource {
  @scala.inline
  def apply(list: AccountId => Request[GetPublisherProfilesByAccountIdResponse]): PubprofilesResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[PubprofilesResource]
  }
}

