package typings.gapiClientBigquerydatatransfer.gapi.client.bigquerydatatransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsResource extends js.Object {
  var dataSources: DataSourcesResource
  var locations: LocationsResource
  var transferConfigs: TransferConfigsResource
}

object ProjectsResource {
  @scala.inline
  def apply(
    dataSources: DataSourcesResource,
    locations: LocationsResource,
    transferConfigs: TransferConfigsResource
  ): ProjectsResource = {
    val __obj = js.Dynamic.literal(dataSources = dataSources.asInstanceOf[js.Any], locations = locations.asInstanceOf[js.Any], transferConfigs = transferConfigs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsResource]
  }
}

