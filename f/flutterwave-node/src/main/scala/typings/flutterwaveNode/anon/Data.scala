package typings.flutterwaveNode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Data extends StObject {
  
  var data: Responsecode
  
  var tx: Acctvalrespcode
}
object Data {
  
  inline def apply(data: Responsecode, tx: Acctvalrespcode): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], tx = tx.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
    
    inline def setData(value: Responsecode): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setTx(value: Acctvalrespcode): Self = StObject.set(x, "tx", value.asInstanceOf[js.Any])
  }
}
