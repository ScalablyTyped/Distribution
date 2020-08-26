package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.gapiClientCompute.anon.Alt
import typings.gapiClientCompute.anon.AltFields
import typings.gapiClientCompute.anon.FieldsFirewall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FirewallsResource extends js.Object {
  /** Deletes the specified firewall. */
  def delete(request: typings.gapiClientCompute.anon.Firewall): Request[Operation] = js.native
  /** Returns the specified firewall. */
  def get(request: FieldsFirewall): Request[Firewall] = js.native
  /** Creates a firewall rule in the specified project using the data included in the request. */
  def insert(request: AltFields): Request[Operation] = js.native
  /** Retrieves the list of firewall rules available to the specified project. */
  def list(request: Alt): Request[FirewallList] = js.native
  /**
    * Updates the specified firewall rule with the data included in the request. This method supports PATCH semantics and uses the JSON merge patch format
    * and processing rules.
    */
  def patch(request: typings.gapiClientCompute.anon.Firewall): Request[Operation] = js.native
  /**
    * Updates the specified firewall rule with the data included in the request. Using PUT method, can only update following fields of firewall rule:
    * allowed, description, sourceRanges, sourceTags, targetTags.
    */
  def update(request: typings.gapiClientCompute.anon.Firewall): Request[Operation] = js.native
}

object FirewallsResource {
  @scala.inline
  def apply(
    delete: typings.gapiClientCompute.anon.Firewall => Request[Operation],
    get: FieldsFirewall => Request[Firewall],
    insert: AltFields => Request[Operation],
    list: Alt => Request[FirewallList],
    patch: typings.gapiClientCompute.anon.Firewall => Request[Operation],
    update: typings.gapiClientCompute.anon.Firewall => Request[Operation]
  ): FirewallsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[FirewallsResource]
  }
  @scala.inline
  implicit class FirewallsResourceOps[Self <: FirewallsResource] (val x: Self) extends AnyVal {
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
    def setDelete(value: typings.gapiClientCompute.anon.Firewall => Request[Operation]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: FieldsFirewall => Request[Firewall]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: AltFields => Request[Operation]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Alt => Request[FirewallList]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setPatch(value: typings.gapiClientCompute.anon.Firewall => Request[Operation]): Self = this.set("patch", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: typings.gapiClientCompute.anon.Firewall => Request[Operation]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

