package typings.esquery.mod

import typings.esquery.esqueryStrings.not
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Negation
  extends MultiSelectorAtom
     with MultiSelector
     with Selector {
  
  @JSName("type")
  var type_Negation: not = js.native
}
object Negation {
  
  @scala.inline
  def apply(selectors: js.Array[SubjectSelector], `type`: not): Negation = {
    val __obj = js.Dynamic.literal(selectors = selectors.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Negation]
  }
  
  @scala.inline
  implicit class NegationMutableBuilder[Self <: Negation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: not): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
