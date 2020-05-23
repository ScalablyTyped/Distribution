package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.gapiClientCompute.anon.Alt
import typings.gapiClientCompute.anon.RegionUserIp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegionsResource extends js.Object {
  /** Returns the specified Region resource. Get a list of available regions by making a list() request. */
  def get(request: RegionUserIp): Request[Region]
  /** Retrieves the list of region resources available to the specified project. */
  def list(request: Alt): Request[RegionList]
}

object RegionsResource {
  @scala.inline
  def apply(get: RegionUserIp => Request[Region], list: Alt => Request[RegionList]): RegionsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[RegionsResource]
  }
}

