package typings.googleapis.cloudresourcemanagerV1beta1Mod.cloudresourcemanagerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaProject] = js.undefined
  
  /**
    * A now unused experiment opt-out option.
    */
  var useLegacyStack: js.UndefOr[Boolean] = js.undefined
}
object ParamsResourceProjectsCreate {
  
  inline def apply(): ParamsResourceProjectsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsCreate]
  }
  
  extension [Self <: ParamsResourceProjectsCreate](x: Self) {
    
    inline def setRequestBody(value: SchemaProject): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setUseLegacyStack(value: Boolean): Self = StObject.set(x, "useLegacyStack", value.asInstanceOf[js.Any])
    
    inline def setUseLegacyStackUndefined: Self = StObject.set(x, "useLegacyStack", js.undefined)
  }
}
