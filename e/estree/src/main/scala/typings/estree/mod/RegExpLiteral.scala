package typings.estree.mod

import typings.estree.anon.Flags
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegExpLiteral
  extends StObject
     with BaseNode
     with Literal {
  
  var raw: js.UndefOr[String] = js.undefined
  
  var regex: Flags
  
  @JSName("type")
  var type_RegExpLiteral: typings.estree.estreeStrings.Literal
  
  var value: js.UndefOr[js.RegExp | Null] = js.undefined
}
object RegExpLiteral {
  
  inline def apply(regex: Flags): RegExpLiteral = {
    val __obj = js.Dynamic.literal(regex = regex.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Literal")
    __obj.asInstanceOf[RegExpLiteral]
  }
  
  extension [Self <: RegExpLiteral](x: Self) {
    
    inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
    
    inline def setRegex(value: Flags): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.estree.estreeStrings.Literal): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: js.RegExp): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
