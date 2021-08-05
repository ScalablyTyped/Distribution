package typings.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SimpleLiteral
  extends StObject
     with BaseNode
     with Literal {
  
  var raw: js.UndefOr[String] = js.undefined
  
  @JSName("type")
  var type_SimpleLiteral: typings.estree.estreeStrings.Literal
  
  var value: String | Boolean | Double | Null
}
object SimpleLiteral {
  
  inline def apply(): SimpleLiteral = {
    val __obj = js.Dynamic.literal(value = null)
    __obj.updateDynamic("type")("Literal")
    __obj.asInstanceOf[SimpleLiteral]
  }
  
  extension [Self <: SimpleLiteral](x: Self) {
    
    inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
    
    inline def setType(value: typings.estree.estreeStrings.Literal): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String | Boolean | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
  }
}
