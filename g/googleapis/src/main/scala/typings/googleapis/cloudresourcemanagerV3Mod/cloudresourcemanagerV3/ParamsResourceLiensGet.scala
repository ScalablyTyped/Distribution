package typings.googleapis.cloudresourcemanagerV3Mod.cloudresourcemanagerV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceLiensGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name/identifier of the Lien.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceLiensGet {
  
  inline def apply(): ParamsResourceLiensGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceLiensGet]
  }
  
  extension [Self <: ParamsResourceLiensGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
