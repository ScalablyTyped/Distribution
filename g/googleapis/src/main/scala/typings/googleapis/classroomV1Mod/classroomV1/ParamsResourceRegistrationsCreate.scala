package typings.googleapis.classroomV1Mod.classroomV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceRegistrationsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaRegistration] = js.undefined
}
object ParamsResourceRegistrationsCreate {
  
  inline def apply(): ParamsResourceRegistrationsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceRegistrationsCreate]
  }
  
  extension [Self <: ParamsResourceRegistrationsCreate](x: Self) {
    
    inline def setRequestBody(value: SchemaRegistration): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
