package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDfareporting.anon.Fields
import typings.gapiClientDfareporting.anon.Key
import typings.gapiClientDfareporting.anon.Oauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubaccountsResource extends js.Object {
  /** Gets one subaccount by ID. */
  def get(request: Fields): Request[Subaccount] = js.native
  /** Inserts a new subaccount. */
  def insert(request: Key): Request[Subaccount] = js.native
  /** Gets a list of subaccounts, possibly filtered. This method supports paging. */
  def list(request: Oauthtoken): Request[SubaccountsListResponse] = js.native
  /** Updates an existing subaccount. This method supports patch semantics. */
  def patch(request: Fields): Request[Subaccount] = js.native
  /** Updates an existing subaccount. */
  def update(request: Key): Request[Subaccount] = js.native
}

object SubaccountsResource {
  @scala.inline
  def apply(
    get: Fields => Request[Subaccount],
    insert: Key => Request[Subaccount],
    list: Oauthtoken => Request[SubaccountsListResponse],
    patch: Fields => Request[Subaccount],
    update: Key => Request[Subaccount]
  ): SubaccountsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[SubaccountsResource]
  }
  @scala.inline
  implicit class SubaccountsResourceOps[Self <: SubaccountsResource] (val x: Self) extends AnyVal {
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
    def setGet(value: Fields => Request[Subaccount]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: Key => Request[Subaccount]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Oauthtoken => Request[SubaccountsListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setPatch(value: Fields => Request[Subaccount]): Self = this.set("patch", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: Key => Request[Subaccount]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

