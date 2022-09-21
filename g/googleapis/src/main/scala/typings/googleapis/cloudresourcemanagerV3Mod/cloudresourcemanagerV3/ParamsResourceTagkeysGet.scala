package typings.googleapis.cloudresourcemanagerV3Mod.cloudresourcemanagerV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceTagkeysGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. A resource name in the format `tagKeys/{id\}`, such as `tagKeys/123`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceTagkeysGet {
  
  inline def apply(): ParamsResourceTagkeysGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceTagkeysGet]
  }
  
  extension [Self <: ParamsResourceTagkeysGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
