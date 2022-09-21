package typings.googleapis.classroomV1Mod.classroomV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceInvitationsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Identifier of the invitation to return.
    */
  var id: js.UndefOr[String] = js.undefined
}
object ParamsResourceInvitationsGet {
  
  inline def apply(): ParamsResourceInvitationsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceInvitationsGet]
  }
  
  extension [Self <: ParamsResourceInvitationsGet](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
