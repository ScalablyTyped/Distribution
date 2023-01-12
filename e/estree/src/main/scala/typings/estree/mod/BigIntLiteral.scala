package typings.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BigIntLiteral
  extends StObject
     with BaseNode
     with Literal {
  
  var bigint: String
  
  var raw: js.UndefOr[String] = js.undefined
  
  @JSName("type")
  var type_BigIntLiteral: typings.estree.estreeStrings.Literal
  
  var value: js.UndefOr[js.BigInt | Null] = js.undefined
}
object BigIntLiteral {
  
  inline def apply(bigint: String): BigIntLiteral = {
    val __obj = js.Dynamic.literal(bigint = bigint.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Literal")
    __obj.asInstanceOf[BigIntLiteral]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BigIntLiteral] (val x: Self) extends AnyVal {
    
    inline def setBigint(value: String): Self = StObject.set(x, "bigint", value.asInstanceOf[js.Any])
    
    inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
    
    inline def setType(value: typings.estree.estreeStrings.Literal): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: js.BigInt): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
