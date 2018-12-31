package typings
package gapiDotClientDotDnsLib.gapiNs.clientNs.dnsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManagedZonesResource extends js.Object {
  /** Create a new ManagedZone. */
  def create(request: gapiDotClientDotDnsLib.Anon_ProjectPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[ManagedZone]
  /** Delete a previously created ManagedZone. */
  def delete(request: gapiDotClientDotDnsLib.Anon_ManagedZoneProjectPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Fetch the representation of an existing ManagedZone. */
  def get(request: gapiDotClientDotDnsLib.Anon_ManagedZoneProjectPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[ManagedZone]
  /** Enumerate ManagedZones that have been created but not yet deleted. */
  def list(request: gapiDotClientDotDnsLib.Anon_Project): gapiDotClientLib.gapiNs.clientNs.Request[ManagedZonesListResponse]
}

