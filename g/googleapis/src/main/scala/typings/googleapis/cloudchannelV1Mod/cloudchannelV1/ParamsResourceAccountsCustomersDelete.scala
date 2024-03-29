package typings.googleapis.cloudchannelV1Mod.cloudchannelV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsCustomersDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of the customer to delete.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceAccountsCustomersDelete {
  
  inline def apply(): ParamsResourceAccountsCustomersDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsCustomersDelete]
  }
  
  extension [Self <: ParamsResourceAccountsCustomersDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
