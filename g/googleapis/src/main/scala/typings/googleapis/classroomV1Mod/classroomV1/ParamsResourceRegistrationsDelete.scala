package typings.googleapis.classroomV1Mod.classroomV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceRegistrationsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * The `registration_id` of the `Registration` to be deleted.
    */
  var registrationId: js.UndefOr[String] = js.undefined
}
object ParamsResourceRegistrationsDelete {
  
  inline def apply(): ParamsResourceRegistrationsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceRegistrationsDelete]
  }
  
  extension [Self <: ParamsResourceRegistrationsDelete](x: Self) {
    
    inline def setRegistrationId(value: String): Self = StObject.set(x, "registrationId", value.asInstanceOf[js.Any])
    
    inline def setRegistrationIdUndefined: Self = StObject.set(x, "registrationId", js.undefined)
  }
}
