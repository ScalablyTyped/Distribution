package typings.gapiClientDns.gapi.client.dns

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDns.anon.Alt
import typings.gapiClientDns.anon.DnsName
import typings.gapiClientDns.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManagedZonesResource extends js.Object {
  /** Create a new ManagedZone. */
  def create(request: Key): Request[ManagedZone]
  /** Delete a previously created ManagedZone. */
  def delete(request: Alt): Request[Unit]
  /** Fetch the representation of an existing ManagedZone. */
  def get(request: Alt): Request[ManagedZone]
  /** Enumerate ManagedZones that have been created but not yet deleted. */
  def list(request: DnsName): Request[ManagedZonesListResponse]
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
}

