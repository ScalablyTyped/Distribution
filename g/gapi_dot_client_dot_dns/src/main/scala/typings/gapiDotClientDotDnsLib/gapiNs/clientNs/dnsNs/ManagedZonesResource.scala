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
    create: js.Function1[
      gapiDotClientDotDnsLib.Anon_AltFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[ManagedZone]
    ],
    delete: js.Function1[
      gapiDotClientDotDnsLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
    ],
    get: js.Function1[
      gapiDotClientDotDnsLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[ManagedZone]
    ],
    list: js.Function1[
      gapiDotClientDotDnsLib.Anon_AltDnsName, 
      gapiDotClientLib.gapiNs.clientNs.Request[ManagedZonesListResponse]
    ]
  ): ManagedZonesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(create)
    __obj.updateDynamic("delete")(delete)
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("list")(list)
    __obj.asInstanceOf[ManagedZonesResource]
  }
}

