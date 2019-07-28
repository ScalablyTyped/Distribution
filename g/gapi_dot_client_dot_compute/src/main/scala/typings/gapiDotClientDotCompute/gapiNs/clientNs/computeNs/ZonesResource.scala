package typings.gapiDotClientDotCompute.gapiNs.clientNs.computeNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotCompute.Anon_Alt
import typings.gapiDotClientDotCompute.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserUserIpZone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZonesResource extends js.Object {
  /** Returns the specified Zone resource. Get a list of available zones by making a list() request. */
  def get(request: Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserUserIpZone): Request[Zone]
  /** Retrieves the list of Zone resources available to the specified project. */
  def list(request: Anon_Alt): Request[ZoneList]
}

object ZonesResource {
  @scala.inline
  def apply(
    get: Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserUserIpZone => Request[Zone],
    list: Anon_Alt => Request[ZoneList]
  ): ZonesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[ZonesResource]
  }
}

