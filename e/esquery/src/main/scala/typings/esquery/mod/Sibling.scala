package typings.esquery.mod

import typings.esquery.esqueryStrings.sibling
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sibling
  extends StObject
     with BinarySelectorAtom
     with BinarySelector
     with Selector {
  
  @JSName("type")
  var type_Sibling: sibling
}
object Sibling {
  
  @scala.inline
  def apply(left: SubjectSelector, right: SubjectSelector): Sibling = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("sibling")
    __obj.asInstanceOf[Sibling]
  }
  
  @scala.inline
  implicit class SiblingMutableBuilder[Self <: Sibling] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: sibling): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
