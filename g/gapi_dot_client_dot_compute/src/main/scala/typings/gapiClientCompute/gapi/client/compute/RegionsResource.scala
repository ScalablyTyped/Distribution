package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientCompute.AnonAlt
import typings.gapiClientCompute.AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegionsResource extends js.Object {
  /** Returns the specified Region resource. Get a list of available regions by making a list() request. */
  def get(request: AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegion): Request_[Region]
  /** Retrieves the list of region resources available to the specified project. */
  def list(request: AnonAlt): Request_[RegionList]
}

object RegionsResource {
  @scala.inline
  def apply(
    get: AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegion => Request_[Region],
    list: AnonAlt => Request_[RegionList]
  ): RegionsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[RegionsResource]
  }
}

