package typings.gapiClientVault.gapi.client.vault

import typings.gapiClient.gapi.client.Request
import typings.gapiClientVault.anon.Accesstoken
import typings.gapiClientVault.anon.Alt
import typings.gapiClientVault.anon.Bearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HoldsResource extends js.Object {
  var accounts: AccountsResource
  /** Creates a hold in the given matter. */
  def create(request: Alt): Request[Hold]
  /** Removes a hold by ID. This will release any HeldAccounts on this Hold. */
  def delete(request: Accesstoken): Request[js.Object]
  /** Gets a hold by ID. */
  def get(request: Accesstoken): Request[Hold]
  /**
    * Lists holds within a matter. An empty page token in ListHoldsResponse
    * denotes no more holds to list.
    */
  def list(request: Bearertoken): Request[ListHoldsResponse]
  /**
    * Updates the OU and/or query parameters of a hold. You cannot add accounts
    * to a hold that covers an OU, nor can you add OUs to a hold that covers
    * individual accounts. Accounts listed in the hold will be ignored.
    */
  def update(request: Accesstoken): Request[Hold]
}

object HoldsResource {
  @scala.inline
  def apply(
    accounts: AccountsResource,
    create: Alt => Request[Hold],
    delete: Accesstoken => Request[js.Object],
    get: Accesstoken => Request[Hold],
    list: Bearertoken => Request[ListHoldsResponse],
    update: Accesstoken => Request[Hold]
  ): HoldsResource = {
    val __obj = js.Dynamic.literal(accounts = accounts.asInstanceOf[js.Any], create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[HoldsResource]
  }
}

