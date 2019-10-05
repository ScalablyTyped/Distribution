package typings.gapiDotClientDotCompute.gapi.client.compute

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotCompute.Anon_Alt
import typings.gapiDotClientDotCompute.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegionsResource extends js.Object {
  /** Returns the specified Region resource. Get a list of available regions by making a list() request. */
  def get(request: Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegion): Request[Region]
  /** Retrieves the list of region resources available to the specified project. */
  def list(request: Anon_Alt): Request[RegionList]
}

object RegionsResource {
  @scala.inline
  def apply(
    get: Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegion => Request[Region],
    list: Anon_Alt => Request[RegionList]
  ): RegionsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[RegionsResource]
  }
}

