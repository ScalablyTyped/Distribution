package typings
package gapiDotClientDotBigquerydatatransferLib.gapiNs.clientNs.bigquerydatatransferNs

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dataSources")(dataSources)
    __obj.updateDynamic("locations")(locations)
    __obj.updateDynamic("transferConfigs")(transferConfigs)
    __obj.asInstanceOf[ProjectsResource]
  }
}

