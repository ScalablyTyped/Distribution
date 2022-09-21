package typings.flutterwaveNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatusRequeryRequest extends StObject {
  
  var flwref: js.UndefOr[String] = js.undefined
  
  var txref: js.UndefOr[String] = js.undefined
}
object StatusRequeryRequest {
  
  inline def apply(): StatusRequeryRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatusRequeryRequest]
  }
  
  extension [Self <: StatusRequeryRequest](x: Self) {
    
    inline def setFlwref(value: String): Self = StObject.set(x, "flwref", value.asInstanceOf[js.Any])
    
    inline def setFlwrefUndefined: Self = StObject.set(x, "flwref", js.undefined)
    
    inline def setTxref(value: String): Self = StObject.set(x, "txref", value.asInstanceOf[js.Any])
    
    inline def setTxrefUndefined: Self = StObject.set(x, "txref", js.undefined)
  }
}
