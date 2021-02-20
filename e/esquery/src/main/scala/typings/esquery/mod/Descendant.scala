package typings.esquery.mod

import typings.esquery.esqueryStrings.descendant
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Descendant
  extends BinarySelectorAtom
     with BinarySelector
     with Selector {
  
  @JSName("type")
  var type_Descendant: descendant = js.native
}
object Descendant {
  
  @scala.inline
  def apply(left: SubjectSelector, right: SubjectSelector, `type`: descendant): Descendant = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Descendant]
  }
  
  @scala.inline
  implicit class DescendantMutableBuilder[Self <: Descendant] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: descendant): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
