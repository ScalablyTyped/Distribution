package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceUsersPatch
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Resource name for this user, following the pattern "developers/{developer\}/users/{email\}".
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaUser] = js.undefined
  
  /**
    * Optional. The list of fields to be updated.
    */
  var updateMask: js.UndefOr[String] = js.undefined
}
object ParamsResourceUsersPatch {
  
  inline def apply(): ParamsResourceUsersPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceUsersPatch]
  }
  
  extension [Self <: ParamsResourceUsersPatch](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaUser): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
