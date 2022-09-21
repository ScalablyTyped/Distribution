package typings.googleapis.cloudresourcemanagerV3Mod.cloudresourcemanagerV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the Project (for example, `projects/415104041262`).
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsDelete {
  
  inline def apply(): ParamsResourceProjectsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsDelete]
  }
  
  extension [Self <: ParamsResourceProjectsDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
