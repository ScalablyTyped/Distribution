package typings.googleapis.classroomV1Mod.classroomV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceInvitationsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Identifier of the invitation to delete.
    */
  var id: js.UndefOr[String] = js.undefined
}
object ParamsResourceInvitationsDelete {
  
  inline def apply(): ParamsResourceInvitationsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceInvitationsDelete]
  }
  
  extension [Self <: ParamsResourceInvitationsDelete](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
