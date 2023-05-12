package typings.ethers.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessList extends StObject {
  
  var accessList: Null
  
  var maxFeePerGas: Null
  
  var maxPriorityFeePerGas: Null
}
object AccessList {
  
  inline def apply(accessList: Null, maxFeePerGas: Null, maxPriorityFeePerGas: Null): AccessList = {
    val __obj = js.Dynamic.literal(accessList = accessList.asInstanceOf[js.Any], maxFeePerGas = maxFeePerGas.asInstanceOf[js.Any], maxPriorityFeePerGas = maxPriorityFeePerGas.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessList]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccessList] (val x: Self) extends AnyVal {
    
    inline def setAccessList(value: Null): Self = StObject.set(x, "accessList", value.asInstanceOf[js.Any])
    
    inline def setMaxFeePerGas(value: Null): Self = StObject.set(x, "maxFeePerGas", value.asInstanceOf[js.Any])
    
    inline def setMaxPriorityFeePerGas(value: Null): Self = StObject.set(x, "maxPriorityFeePerGas", value.asInstanceOf[js.Any])
  }
}
