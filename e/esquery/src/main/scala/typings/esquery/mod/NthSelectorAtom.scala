package typings.esquery.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NthSelectorAtom extends SubjectSelectorAtom {
  
  var index: NumericLiteral = js.native
}
object NthSelectorAtom {
  
  @scala.inline
  def apply(index: NumericLiteral, `type`: String): NthSelectorAtom = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NthSelectorAtom]
  }
  
  @scala.inline
  implicit class NthSelectorAtomMutableBuilder[Self <: NthSelectorAtom] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndex(value: NumericLiteral): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
  }
}
