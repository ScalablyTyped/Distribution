package typings.gapiClientDns.gapi.client.dns

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDns.anon.Alt
import typings.gapiClientDns.anon.DnsName
import typings.gapiClientDns.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManagedZonesResource extends js.Object {
  /** Create a new ManagedZone. */
  def create(request: Key): Request[ManagedZone] = js.native
  /** Delete a previously created ManagedZone. */
  def delete(request: Alt): Request[Unit] = js.native
  /** Fetch the representation of an existing ManagedZone. */
  def get(request: Alt): Request[ManagedZone] = js.native
  /** Enumerate ManagedZones that have been created but not yet deleted. */
  def list(request: DnsName): Request[ManagedZonesListResponse] = js.native
}

object ManagedZonesResource {
  @scala.inline
  def apply(
    create: Key => Request[ManagedZone],
    delete: Alt => Request[Unit],
    get: Alt => Request[ManagedZone],
    list: DnsName => Request[ManagedZonesListResponse]
  ): ManagedZonesResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[ManagedZonesResource]
  }
  @scala.inline
  implicit class ManagedZonesResourceOps[Self <: ManagedZonesResource] (val x: Self) extends AnyVal {
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
    def setCreate(value: Key => Request[ManagedZone]): Self = this.set("create", js.Any.fromFunction1(value))
    @scala.inline
    def setDelete(value: Alt => Request[Unit]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: Alt => Request[ManagedZone]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: DnsName => Request[ManagedZonesListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

