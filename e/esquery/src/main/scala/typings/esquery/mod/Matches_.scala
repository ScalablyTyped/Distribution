package typings.esquery.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Matches_
  extends MultiSelectorAtom
     with MultiSelector
     with Selector {
  
  @JSName("type")
  var type_Matches_ : typings.esquery.esqueryStrings.matches = js.native
}
object Matches_ {
  
  @scala.inline
  def apply(selectors: js.Array[SubjectSelector], `type`: typings.esquery.esqueryStrings.matches): Matches_ = {
    val __obj = js.Dynamic.literal(selectors = selectors.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Matches_]
  }
  
  @scala.inline
  implicit class Matches_MutableBuilder[Self <: Matches_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: typings.esquery.esqueryStrings.matches): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
