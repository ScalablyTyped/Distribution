package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.gapiClientCompute.anon.Alt
import typings.gapiClientCompute.anon.QuotaUserUserIp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZonesResource extends js.Object {
  /** Returns the specified Zone resource. Get a list of available zones by making a list() request. */
  def get(request: QuotaUserUserIp): Request[Zone]
  /** Retrieves the list of Zone resources available to the specified project. */
  def list(request: Alt): Request[ZoneList]
}

object ZonesResource {
  @scala.inline
  def apply(get: QuotaUserUserIp => Request[Zone], list: Alt => Request[ZoneList]): ZonesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[ZonesResource]
  }
}

