package typings.googleapis.cloudiotV1Mod.cloudiotV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceProjectsLocationsRegistriesDevicesList extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * A list of device string IDs. For example, `['device0', 'device12']`. If
    * empty, this field is ignored. Maximum IDs: 10,000
    */
  var deviceIds: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * A list of device numeric IDs. If empty, this field is ignored. Maximum
    * IDs: 10,000.
    */
  var deviceNumIds: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The fields of the `Device` resource to be returned in the response. The
    * fields `id` and `num_id` are always returned, along with any other fields
    * specified.
    */
  var fieldMask: js.UndefOr[String] = js.native
  
  /**
    * If set, returns only the gateways with which the specified device is
    * associated. The device ID can be numeric (`num_id`) or the user-defined
    * string (`id`). For example, if `456` is specified, returns only the
    * gateways to which the device with `num_id` 456 is bound.
    */
  @JSName("gatewayListOptions.associationsDeviceId")
  var gatewayListOptionsDotassociationsDeviceId: js.UndefOr[String] = js.native
  
  /**
    * If set, only devices associated with the specified gateway are returned.
    * The gateway ID can be numeric (`num_id`) or the user-defined string
    * (`id`). For example, if `123` is specified, only devices bound to the
    * gateway with `num_id` 123 are returned.
    */
  @JSName("gatewayListOptions.associationsGatewayId")
  var gatewayListOptionsDotassociationsGatewayId: js.UndefOr[String] = js.native
  
  /**
    * If `GATEWAY` is specified, only gateways are returned. If `NON_GATEWAY`
    * is specified, only non-gateway devices are returned. If
    * `GATEWAY_TYPE_UNSPECIFIED` is specified, all devices are returned.
    */
  @JSName("gatewayListOptions.gatewayType")
  var gatewayListOptionsDotgatewayType: js.UndefOr[String] = js.native
  
  /**
    * The maximum number of devices to return in the response. If this value is
    * zero, the service will select a default size. A call may return fewer
    * objects than requested. A non-empty `next_page_token` in the response
    * indicates that more data is available.
    */
  var pageSize: js.UndefOr[Double] = js.native
  
  /**
    * The value returned by the last `ListDevicesResponse`; indicates that this
    * is a continuation of a prior `ListDevices` call and the system should
    * return the next page of data.
    */
  var pageToken: js.UndefOr[String] = js.native
  
  /**
    * The device registry path. Required. For example,
    * `projects/my-project/locations/us-central1/registries/my-registry`.
    */
  var parent: js.UndefOr[String] = js.native
}
object ParamsResourceProjectsLocationsRegistriesDevicesList {
  
  @scala.inline
  def apply(): ParamsResourceProjectsLocationsRegistriesDevicesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsRegistriesDevicesList]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsLocationsRegistriesDevicesListOps[Self <: ParamsResourceProjectsLocationsRegistriesDevicesList] (val x: Self) extends AnyVal {
    
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
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    
    @scala.inline
    def setDeviceIdsVarargs(value: String*): Self = this.set("deviceIds", js.Array(value :_*))
    
    @scala.inline
    def setDeviceIds(value: js.Array[String]): Self = this.set("deviceIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceIds: Self = this.set("deviceIds", js.undefined)
    
    @scala.inline
    def setDeviceNumIdsVarargs(value: String*): Self = this.set("deviceNumIds", js.Array(value :_*))
    
    @scala.inline
    def setDeviceNumIds(value: js.Array[String]): Self = this.set("deviceNumIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceNumIds: Self = this.set("deviceNumIds", js.undefined)
    
    @scala.inline
    def setFieldMask(value: String): Self = this.set("fieldMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFieldMask: Self = this.set("fieldMask", js.undefined)
    
    @scala.inline
    def setGatewayListOptionsDotassociationsDeviceId(value: String): Self = this.set("gatewayListOptions.associationsDeviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGatewayListOptionsDotassociationsDeviceId: Self = this.set("gatewayListOptions.associationsDeviceId", js.undefined)
    
    @scala.inline
    def setGatewayListOptionsDotassociationsGatewayId(value: String): Self = this.set("gatewayListOptions.associationsGatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGatewayListOptionsDotassociationsGatewayId: Self = this.set("gatewayListOptions.associationsGatewayId", js.undefined)
    
    @scala.inline
    def setGatewayListOptionsDotgatewayType(value: String): Self = this.set("gatewayListOptions.gatewayType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGatewayListOptionsDotgatewayType: Self = this.set("gatewayListOptions.gatewayType", js.undefined)
    
    @scala.inline
    def setPageSize(value: Double): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
  }
}
