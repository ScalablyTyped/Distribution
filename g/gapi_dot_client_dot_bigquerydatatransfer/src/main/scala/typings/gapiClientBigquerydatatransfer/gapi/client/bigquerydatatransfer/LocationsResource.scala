package typings.gapiClientBigquerydatatransfer.gapi.client.bigquerydatatransfer

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientBigquerydatatransfer.AnonAccesstoken
import typings.gapiClientBigquerydatatransfer.AnonFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationsResource extends js.Object {
  var dataSources: DataSourcesResource
  var transferConfigs: TransferConfigsResource
  /** Get information about a location. */
  def get(request: AnonAccesstoken): Request_[Location]
  /** Lists information about the supported locations for this service. */
  def list(request: AnonFilter): Request_[ListLocationsResponse]
}

object LocationsResource {
  @scala.inline
  def apply(
    dataSources: DataSourcesResource,
    get: AnonAccesstoken => Request_[Location],
    list: AnonFilter => Request_[ListLocationsResponse],
    transferConfigs: TransferConfigsResource
  ): LocationsResource = {
    val __obj = js.Dynamic.literal(dataSources = dataSources.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), transferConfigs = transferConfigs.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationsResource]
  }
}

