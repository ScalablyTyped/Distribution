package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceTargetpoolsGethealth
  extends StObject
     with StandardParameters {
  
  /**
    * Project ID for this request.
    */
  var project: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the region scoping this request.
    */
  var region: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaInstanceReference] = js.undefined
  
  /**
    * Name of the TargetPool resource to which the queried instance belongs.
    */
  var targetPool: js.UndefOr[String] = js.undefined
}
object ParamsResourceTargetpoolsGethealth {
  
  inline def apply(): ParamsResourceTargetpoolsGethealth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceTargetpoolsGethealth]
  }
  
  extension [Self <: ParamsResourceTargetpoolsGethealth](x: Self) {
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setRequestBody(value: SchemaInstanceReference): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setTargetPool(value: String): Self = StObject.set(x, "targetPool", value.asInstanceOf[js.Any])
    
    inline def setTargetPoolUndefined: Self = StObject.set(x, "targetPool", js.undefined)
  }
}
