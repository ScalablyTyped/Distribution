package typings.gapiClientBigquerydatatransfer.gapi.client.bigquerydatatransfer

import typings.gapiClient.gapi.client.Request
import typings.gapiClientBigquerydatatransfer.anon.Accesstoken
import typings.gapiClientBigquerydatatransfer.anon.Filter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocationsResource extends js.Object {
  var dataSources: DataSourcesResource = js.native
  var transferConfigs: TransferConfigsResource = js.native
  /** Get information about a location. */
  def get(request: Accesstoken): Request[Location] = js.native
  /** Lists information about the supported locations for this service. */
  def list(request: Filter): Request[ListLocationsResponse] = js.native
}

object LocationsResource {
  @scala.inline
  def apply(
    dataSources: DataSourcesResource,
    get: Accesstoken => Request[Location],
    list: Filter => Request[ListLocationsResponse],
    transferConfigs: TransferConfigsResource
  ): LocationsResource = {
    val __obj = js.Dynamic.literal(dataSources = dataSources.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), transferConfigs = transferConfigs.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationsResource]
  }
  @scala.inline
  implicit class LocationsResourceOps[Self <: LocationsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDataSources(value: DataSourcesResource): Self = this.set("dataSources", value.asInstanceOf[js.Any])
    @scala.inline
    def setGet(value: Accesstoken => Request[Location]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Filter => Request[ListLocationsResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setTransferConfigs(value: TransferConfigsResource): Self = this.set("transferConfigs", value.asInstanceOf[js.Any])
  }
  
}

