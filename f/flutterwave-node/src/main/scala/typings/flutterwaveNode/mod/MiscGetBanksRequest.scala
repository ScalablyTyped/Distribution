package typings.flutterwaveNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MiscGetBanksRequest extends StObject {
  
  var __n: js.UndefOr[String] = js.undefined
}
object MiscGetBanksRequest {
  
  inline def apply(): MiscGetBanksRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MiscGetBanksRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MiscGetBanksRequest] (val x: Self) extends AnyVal {
    
    inline def set__n(value: String): Self = StObject.set(x, "__n", value.asInstanceOf[js.Any])
    
    inline def set__nUndefined: Self = StObject.set(x, "__n", js.undefined)
  }
}
