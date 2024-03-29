package typings.googleapis.apigatewayV1betaMod.apigatewayV1beta

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaApigatewayApi extends StObject {
  
  /**
    * Output only. Created time.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Display name.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Resource labels to represent user-provided metadata. Refer to cloud documentation on labels for more details. https://cloud.google.com/compute/docs/labeling-resources
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Optional. Immutable. The name of a Google Managed Service ( https://cloud.google.com/service-infrastructure/docs/glossary#managed). If not specified, a new Service will automatically be created in the same project as this API.
    */
  var managedService: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Resource name of the API. Format: projects/{project\}/locations/global/apis/{api\}
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. State of the API.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Updated time.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaApigatewayApi {
  
  inline def apply(): SchemaApigatewayApi = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApigatewayApi]
  }
  
  extension [Self <: SchemaApigatewayApi](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setManagedService(value: String): Self = StObject.set(x, "managedService", value.asInstanceOf[js.Any])
    
    inline def setManagedServiceNull: Self = StObject.set(x, "managedService", null)
    
    inline def setManagedServiceUndefined: Self = StObject.set(x, "managedService", js.undefined)
    
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
