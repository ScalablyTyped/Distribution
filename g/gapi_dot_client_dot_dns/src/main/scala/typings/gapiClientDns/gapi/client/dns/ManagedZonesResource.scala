package typings.gapiClientDns.gapi.client.dns

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDns.AnonAlt
import typings.gapiClientDns.AnonAltDnsName
import typings.gapiClientDns.AnonAltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManagedZonesResource extends js.Object {
  /** Create a new ManagedZone. */
  def create(request: AnonAltFieldsKey): Request_[ManagedZone]
  /** Delete a previously created ManagedZone. */
  def delete(request: AnonAlt): Request_[Unit]
  /** Fetch the representation of an existing ManagedZone. */
  def get(request: AnonAlt): Request_[ManagedZone]
  /** Enumerate ManagedZones that have been created but not yet deleted. */
  def list(request: AnonAltDnsName): Request_[ManagedZonesListResponse]
}

object ManagedZonesResource {
  @scala.inline
  def apply(
    create: AnonAltFieldsKey => Request_[ManagedZone],
    delete: AnonAlt => Request_[Unit],
    get: AnonAlt => Request_[ManagedZone],
    list: AnonAltDnsName => Request_[ManagedZonesListResponse]
  ): ManagedZonesResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[ManagedZonesResource]
  }
}

