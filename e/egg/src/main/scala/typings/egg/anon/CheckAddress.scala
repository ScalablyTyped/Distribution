package typings.egg.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckAddress extends StObject {
  
  var checkAddress: js.UndefOr[js.Function1[/* ip */ String, Boolean]] = js.undefined
  
  var ipBlackList: js.Array[String]
}
object CheckAddress {
  
  inline def apply(ipBlackList: js.Array[String]): CheckAddress = {
    val __obj = js.Dynamic.literal(ipBlackList = ipBlackList.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckAddress]
  }
  
  extension [Self <: CheckAddress](x: Self) {
    
    inline def setCheckAddress(value: /* ip */ String => Boolean): Self = StObject.set(x, "checkAddress", js.Any.fromFunction1(value))
    
    inline def setCheckAddressUndefined: Self = StObject.set(x, "checkAddress", js.undefined)
    
    inline def setIpBlackList(value: js.Array[String]): Self = StObject.set(x, "ipBlackList", value.asInstanceOf[js.Any])
    
    inline def setIpBlackListVarargs(value: String*): Self = StObject.set(x, "ipBlackList", js.Array(value*))
  }
}
