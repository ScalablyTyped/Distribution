package typings.esquery.mod

import typings.esquery.esqueryStrings.regexp
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegExpLiteral
  extends StObject
     with Atom {
  
  @JSName("type")
  var type_RegExpLiteral: regexp
  
  var value: RegExp
}
object RegExpLiteral {
  
  @scala.inline
  def apply(value: RegExp): RegExpLiteral = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("regexp")
    __obj.asInstanceOf[RegExpLiteral]
  }
  
  @scala.inline
  implicit class RegExpLiteralMutableBuilder[Self <: RegExpLiteral] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: regexp): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: RegExp): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
