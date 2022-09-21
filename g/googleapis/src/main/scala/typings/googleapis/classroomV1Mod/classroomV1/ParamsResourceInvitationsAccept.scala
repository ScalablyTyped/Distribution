package typings.googleapis.classroomV1Mod.classroomV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceInvitationsAccept
  extends StObject
     with StandardParameters {
  
  /**
    * Identifier of the invitation to accept.
    */
  var id: js.UndefOr[String] = js.undefined
}
object ParamsResourceInvitationsAccept {
  
  inline def apply(): ParamsResourceInvitationsAccept = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceInvitationsAccept]
  }
  
  extension [Self <: ParamsResourceInvitationsAccept](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
