package typings.googleapis.cloudiotV1Mod.cloudiotV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsRegistriesDevicesList
  extends StObject
     with StandardParameters {
  
  /**
    * A list of device string IDs. For example, `['device0', 'device12']`. If empty, this field is ignored. Maximum IDs: 10,000
    */
  var deviceIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * A list of device numeric IDs. If empty, this field is ignored. Maximum IDs: 10,000.
    */
  var deviceNumIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The fields of the `Device` resource to be returned in the response. The fields `id` and `num_id` are always returned, along with any other fields specified in snake_case format, for example: `last_heartbeat_time`.
    */
  var fieldMask: js.UndefOr[String] = js.undefined
  
  /**
    * If set, returns only the gateways with which the specified device is associated. The device ID can be numeric (`num_id`) or the user-defined string (`id`). For example, if `456` is specified, returns only the gateways to which the device with `num_id` 456 is bound.
    */
  @JSName("gatewayListOptions.associationsDeviceId")
  var gatewayListOptionsDotassociationsDeviceId: js.UndefOr[String] = js.undefined
  
  /**
    * If set, only devices associated with the specified gateway are returned. The gateway ID can be numeric (`num_id`) or the user-defined string (`id`). For example, if `123` is specified, only devices bound to the gateway with `num_id` 123 are returned.
    */
  @JSName("gatewayListOptions.associationsGatewayId")
  var gatewayListOptionsDotassociationsGatewayId: js.UndefOr[String] = js.undefined
  
  /**
    * If `GATEWAY` is specified, only gateways are returned. If `NON_GATEWAY` is specified, only non-gateway devices are returned. If `GATEWAY_TYPE_UNSPECIFIED` is specified, all devices are returned.
    */
  @JSName("gatewayListOptions.gatewayType")
  var gatewayListOptionsDotgatewayType: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of devices to return in the response. If this value is zero, the service will select a default size. A call may return fewer objects than requested. A non-empty `next_page_token` in the response indicates that more data is available.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * The value returned by the last `ListDevicesResponse`; indicates that this is a continuation of a prior `ListDevices` call and the system should return the next page of data.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The device registry path. Required. For example, `projects/my-project/locations/us-central1/registries/my-registry`.
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsRegistriesDevicesList {
  
  inline def apply(): ParamsResourceProjectsLocationsRegistriesDevicesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsRegistriesDevicesList]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsRegistriesDevicesList](x: Self) {
    
    inline def setDeviceIds(value: js.Array[String]): Self = StObject.set(x, "deviceIds", value.asInstanceOf[js.Any])
    
    inline def setDeviceIdsUndefined: Self = StObject.set(x, "deviceIds", js.undefined)
    
    inline def setDeviceIdsVarargs(value: String*): Self = StObject.set(x, "deviceIds", js.Array(value*))
    
    inline def setDeviceNumIds(value: js.Array[String]): Self = StObject.set(x, "deviceNumIds", value.asInstanceOf[js.Any])
    
    inline def setDeviceNumIdsUndefined: Self = StObject.set(x, "deviceNumIds", js.undefined)
    
    inline def setDeviceNumIdsVarargs(value: String*): Self = StObject.set(x, "deviceNumIds", js.Array(value*))
    
    inline def setFieldMask(value: String): Self = StObject.set(x, "fieldMask", value.asInstanceOf[js.Any])
    
    inline def setFieldMaskUndefined: Self = StObject.set(x, "fieldMask", js.undefined)
    
    inline def setGatewayListOptionsDotassociationsDeviceId(value: String): Self = StObject.set(x, "gatewayListOptions.associationsDeviceId", value.asInstanceOf[js.Any])
    
    inline def setGatewayListOptionsDotassociationsDeviceIdUndefined: Self = StObject.set(x, "gatewayListOptions.associationsDeviceId", js.undefined)
    
    inline def setGatewayListOptionsDotassociationsGatewayId(value: String): Self = StObject.set(x, "gatewayListOptions.associationsGatewayId", value.asInstanceOf[js.Any])
    
    inline def setGatewayListOptionsDotassociationsGatewayIdUndefined: Self = StObject.set(x, "gatewayListOptions.associationsGatewayId", js.undefined)
    
    inline def setGatewayListOptionsDotgatewayType(value: String): Self = StObject.set(x, "gatewayListOptions.gatewayType", value.asInstanceOf[js.Any])
    
    inline def setGatewayListOptionsDotgatewayTypeUndefined: Self = StObject.set(x, "gatewayListOptions.gatewayType", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
