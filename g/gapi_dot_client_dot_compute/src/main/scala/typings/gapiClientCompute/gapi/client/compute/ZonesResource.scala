package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientCompute.AnonAlt
import typings.gapiClientCompute.AnonQuotaUserUserIp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZonesResource extends js.Object {
  /** Returns the specified Zone resource. Get a list of available zones by making a list() request. */
  def get(request: AnonQuotaUserUserIp): Request_[Zone]
  /** Retrieves the list of Zone resources available to the specified project. */
  def list(request: AnonAlt): Request_[ZoneList]
}

object ZonesResource {
  @scala.inline
  def apply(get: AnonQuotaUserUserIp => Request_[Zone], list: AnonAlt => Request_[ZoneList]): ZonesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[ZonesResource]
  }
}

