package typings.googleapis.admobV1betaMod.admobV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Resource name of the publisher account to retrieve. Example: accounts/pub-9876543210987654
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceAccountsGet {
  
  inline def apply(): ParamsResourceAccountsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsGet]
  }
  
  extension [Self <: ParamsResourceAccountsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
