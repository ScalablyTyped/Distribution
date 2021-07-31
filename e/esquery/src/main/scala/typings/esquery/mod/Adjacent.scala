package typings.esquery.mod

import typings.esquery.esqueryStrings.adjacent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Adjacent
  extends StObject
     with BinarySelectorAtom
     with BinarySelector
     with Selector {
  
  @JSName("type")
  var type_Adjacent: adjacent
}
object Adjacent {
  
  @scala.inline
  def apply(left: SubjectSelector, right: SubjectSelector): Adjacent = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("adjacent")
    __obj.asInstanceOf[Adjacent]
  }
  
  @scala.inline
  implicit class AdjacentMutableBuilder[Self <: Adjacent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: adjacent): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
