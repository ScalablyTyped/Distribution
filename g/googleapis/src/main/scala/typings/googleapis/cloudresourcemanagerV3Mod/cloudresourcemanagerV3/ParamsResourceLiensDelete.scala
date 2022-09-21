package typings.googleapis.cloudresourcemanagerV3Mod.cloudresourcemanagerV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceLiensDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name/identifier of the Lien to delete.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceLiensDelete {
  
  inline def apply(): ParamsResourceLiensDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceLiensDelete]
  }
  
  extension [Self <: ParamsResourceLiensDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
