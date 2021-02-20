package typings.esquery.mod

import typings.esquery.esqueryStrings.literal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LiteralAtom extends Atom {
  
  @JSName("type")
  var type_LiteralAtom: literal = js.native
  
  var value: String | Double = js.native
}
object LiteralAtom {
  
  @scala.inline
  def apply(`type`: literal, value: String | Double): LiteralAtom = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
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
