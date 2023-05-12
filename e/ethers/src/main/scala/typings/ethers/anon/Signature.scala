package typings.ethers.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Signature extends StObject {
  
  var from: String
  
  var signature: typings.ethers.typesCryptoMod.Signature
  
  var `type`: Double
  
  var typeName: String
}
object Signature {
  
  inline def apply(from: String, signature: typings.ethers.typesCryptoMod.Signature, `type`: Double, typeName: String): Signature = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any], typeName = typeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Signature]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Signature] (val x: Self) extends AnyVal {
    
    inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setSignature(value: typings.ethers.typesCryptoMod.Signature): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeName(value: String): Self = StObject.set(x, "typeName", value.asInstanceOf[js.Any])
  }
}
