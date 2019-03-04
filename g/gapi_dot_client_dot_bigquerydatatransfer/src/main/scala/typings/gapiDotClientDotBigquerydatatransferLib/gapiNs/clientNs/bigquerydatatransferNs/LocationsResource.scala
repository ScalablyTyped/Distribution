package typings
package gapiDotClientDotBigquerydatatransferLib.gapiNs.clientNs.bigquerydatatransferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationsResource extends js.Object {
  var dataSources: DataSourcesResource
  var transferConfigs: TransferConfigsResource
  /** Get information about a location. */
  def get(request: gapiDotClientDotBigquerydatatransferLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[Location]
  /** Lists information about the supported locations for this service. */
  def list(
    request: gapiDotClientDotBigquerydatatransferLib.Anon_AccesstokenAltBearertokenCallbackFieldsFilter
  ): gapiDotClientLib.gapiNs.clientNs.Request[ListLocationsResponse]
}

object LocationsResource {
  @scala.inline
  def apply(
    dataSources: DataSourcesResource,
    get: js.Function1[
      gapiDotClientDotBigquerydatatransferLib.Anon_Accesstoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[Location]
    ],
    list: js.Function1[
      gapiDotClientDotBigquerydatatransferLib.Anon_AccesstokenAltBearertokenCallbackFieldsFilter, 
      gapiDotClientLib.gapiNs.clientNs.Request[ListLocationsResponse]
    ],
    transferConfigs: TransferConfigsResource
  ): LocationsResource = {
    val __obj = js.Dynamic.literal(dataSources = dataSources, get = get, list = list, transferConfigs = transferConfigs)
  
    __obj.asInstanceOf[LocationsResource]
  }
}

