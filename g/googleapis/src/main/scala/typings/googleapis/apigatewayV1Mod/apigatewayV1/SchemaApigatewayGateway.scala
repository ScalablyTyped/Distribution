package typings.googleapis.apigatewayV1Mod.apigatewayV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaApigatewayGateway extends StObject {
  
  /**
    * Required. Resource name of the API Config for this Gateway. Format: projects/{project\}/locations/global/apis/{api\}/configs/{apiConfig\}
    */
  var apiConfig: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Created time.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The default API Gateway host name of the form `{gateway_id\}-{hash\}.{region_code\}.gateway.dev`.
    */
  var defaultHostname: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Display name.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Resource labels to represent user-provided metadata. Refer to cloud documentation on labels for more details. https://cloud.google.com/compute/docs/labeling-resources
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Output only. Resource name of the Gateway. Format: projects/{project\}/locations/{location\}/gateways/{gateway\}
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The current state of the Gateway.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Updated time.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaApigatewayGateway {
  
  inline def apply(): SchemaApigatewayGateway = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApigatewayGateway]
  }
  
  extension [Self <: SchemaApigatewayGateway](x: Self) {
    
    inline def setApiConfig(value: String): Self = StObject.set(x, "apiConfig", value.asInstanceOf[js.Any])
    
    inline def setApiConfigNull: Self = StObject.set(x, "apiConfig", null)
    
    inline def setApiConfigUndefined: Self = StObject.set(x, "apiConfig", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDefaultHostname(value: String): Self = StObject.set(x, "defaultHostname", value.asInstanceOf[js.Any])
    
    inline def setDefaultHostnameNull: Self = StObject.set(x, "defaultHostname", null)
    
    inline def setDefaultHostnameUndefined: Self = StObject.set(x, "defaultHostname", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
