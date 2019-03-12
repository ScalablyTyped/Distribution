package typings
package gapiDotClientDotDnsLib.gapiNs.clientNs.dnsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManagedZonesResource extends js.Object {
  /** Create a new ManagedZone. */
  def create(request: gapiDotClientDotDnsLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[ManagedZone]
  /** Delete a previously created ManagedZone. */
  def delete(request: gapiDotClientDotDnsLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Fetch the representation of an existing ManagedZone. */
  def get(request: gapiDotClientDotDnsLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[ManagedZone]
  /** Enumerate ManagedZones that have been created but not yet deleted. */
  def list(request: gapiDotClientDotDnsLib.Anon_AltDnsName): gapiDotClientLib.gapiNs.clientNs.Request[ManagedZonesListResponse]
}

object ManagedZonesResource {
  @scala.inline
  def apply(
    create: gapiDotClientDotDnsLib.Anon_AltFieldsKey => gapiDotClientLib.gapiNs.clientNs.Request[ManagedZone],
    delete: gapiDotClientDotDnsLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit],
    get: gapiDotClientDotDnsLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[ManagedZone],
    list: gapiDotClientDotDnsLib.Anon_AltDnsName => gapiDotClientLib.gapiNs.clientNs.Request[ManagedZonesListResponse]
  ): ManagedZonesResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[ManagedZonesResource]
  }
}

