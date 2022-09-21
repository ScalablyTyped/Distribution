package typings.googleapis.chromepolicyV1Mod.chromepolicyV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceCustomersPolicyschemasGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The policy schema resource name to query.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceCustomersPolicyschemasGet {
  
  inline def apply(): ParamsResourceCustomersPolicyschemasGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCustomersPolicyschemasGet]
  }
  
  extension [Self <: ParamsResourceCustomersPolicyschemasGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
