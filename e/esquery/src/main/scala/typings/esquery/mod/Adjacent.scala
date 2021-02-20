package typings.esquery.mod

import typings.esquery.esqueryStrings.adjacent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Adjacent
  extends BinarySelectorAtom
     with BinarySelector
     with Selector {
  
  @JSName("type")
  var type_Adjacent: adjacent = js.native
}
object Adjacent {
  
  @scala.inline
  def apply(left: SubjectSelector, right: SubjectSelector, `type`: adjacent): Adjacent = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Adjacent]
  }
  
  @scala.inline
  implicit class AdjacentMutableBuilder[Self <: Adjacent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: adjacent): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
