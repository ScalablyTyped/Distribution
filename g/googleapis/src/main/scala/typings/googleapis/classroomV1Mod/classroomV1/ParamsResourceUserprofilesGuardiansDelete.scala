package typings.googleapis.classroomV1Mod.classroomV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceUserprofilesGuardiansDelete
  extends StObject
     with StandardParameters {
  
  /**
    * The `id` field from a `Guardian`.
    */
  var guardianId: js.UndefOr[String] = js.undefined
  
  /**
    * The student whose guardian is to be deleted. One of the following: * the numeric identifier for the user * the email address of the user * the string literal `"me"`, indicating the requesting user
    */
  var studentId: js.UndefOr[String] = js.undefined
}
object ParamsResourceUserprofilesGuardiansDelete {
  
  inline def apply(): ParamsResourceUserprofilesGuardiansDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceUserprofilesGuardiansDelete]
  }
  
  extension [Self <: ParamsResourceUserprofilesGuardiansDelete](x: Self) {
    
    inline def setGuardianId(value: String): Self = StObject.set(x, "guardianId", value.asInstanceOf[js.Any])
    
    inline def setGuardianIdUndefined: Self = StObject.set(x, "guardianId", js.undefined)
    
    inline def setStudentId(value: String): Self = StObject.set(x, "studentId", value.asInstanceOf[js.Any])
    
    inline def setStudentIdUndefined: Self = StObject.set(x, "studentId", js.undefined)
  }
}
