package typings.gapiDotClientDotVault.gapi.client.vault

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotVault.Anon_Accesstoken
import typings.gapiDotClientDotVault.Anon_AccesstokenAlt
import typings.gapiDotClientDotVault.Anon_AccesstokenAltBearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HoldsResource extends js.Object {
  var accounts: AccountsResource
  /** Creates a hold in the given matter. */
  def create(request: Anon_AccesstokenAlt): Request[Hold]
  /** Removes a hold by ID. This will release any HeldAccounts on this Hold. */
  def delete(request: Anon_Accesstoken): Request[js.Object]
  /** Gets a hold by ID. */
  def get(request: Anon_Accesstoken): Request[Hold]
  /**
    * Lists holds within a matter. An empty page token in ListHoldsResponse
    * denotes no more holds to list.
    */
  def list(request: Anon_AccesstokenAltBearertoken): Request[ListHoldsResponse]
  /**
    * Updates the OU and/or query parameters of a hold. You cannot add accounts
    * to a hold that covers an OU, nor can you add OUs to a hold that covers
    * individual accounts. Accounts listed in the hold will be ignored.
    */
  def update(request: Anon_Accesstoken): Request[Hold]
}

object HoldsResource {
  @scala.inline
  def apply(
    accounts: AccountsResource,
    create: Anon_AccesstokenAlt => Request[Hold],
    delete: Anon_Accesstoken => Request[js.Object],
    get: Anon_Accesstoken => Request[Hold],
    list: Anon_AccesstokenAltBearertoken => Request[ListHoldsResponse],
    update: Anon_Accesstoken => Request[Hold]
  ): HoldsResource = {
    val __obj = js.Dynamic.literal(accounts = accounts.asInstanceOf[js.Any], create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[HoldsResource]
  }
}

