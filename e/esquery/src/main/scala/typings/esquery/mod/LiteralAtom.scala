package typings.esquery.mod

import typings.esquery.esqueryStrings.literal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LiteralAtom
  extends StObject
     with Atom {
  
  @JSName("type")
  var type_LiteralAtom: literal
  
  var value: String | Double
}
object LiteralAtom {
  
  @scala.inline
  def apply(value: String | Double): LiteralAtom = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("literal")
    __obj.asInstanceOf[LiteralAtom]
  }
  
  @scala.inline
  implicit class LiteralAtomMutableBuilder[Self <: LiteralAtom] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: literal): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
