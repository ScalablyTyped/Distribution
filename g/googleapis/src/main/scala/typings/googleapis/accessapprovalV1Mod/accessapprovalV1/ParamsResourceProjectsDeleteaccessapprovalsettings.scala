package typings.googleapis.accessapprovalV1Mod.accessapprovalV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsDeleteaccessapprovalsettings
  extends StObject
     with StandardParameters {
  
  /**
    * Name of the AccessApprovalSettings to delete.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsDeleteaccessapprovalsettings {
  
  inline def apply(): ParamsResourceProjectsDeleteaccessapprovalsettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsDeleteaccessapprovalsettings]
  }
  
  extension [Self <: ParamsResourceProjectsDeleteaccessapprovalsettings](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
