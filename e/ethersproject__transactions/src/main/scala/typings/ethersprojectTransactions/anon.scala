package typings.ethersprojectTransactions

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Address extends StObject {
    
    var address: String
    
    var storageKeys: js.Array[String]
  }
  object Address {
    
    inline def apply(address: String, storageKeys: js.Array[String]): Address = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], storageKeys = storageKeys.asInstanceOf[js.Any])
      __obj.asInstanceOf[Address]
    }
    
    extension [Self <: Address](x: Self) {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setStorageKeys(value: js.Array[String]): Self = StObject.set(x, "storageKeys", value.asInstanceOf[js.Any])
      
      inline def setStorageKeysVarargs(value: String*): Self = StObject.set(x, "storageKeys", js.Array(value*))
    }
  }
}
