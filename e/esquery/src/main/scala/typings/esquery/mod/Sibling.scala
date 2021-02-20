package typings.esquery.mod

import typings.esquery.esqueryStrings.sibling
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sibling
  extends BinarySelectorAtom
     with BinarySelector
     with Selector {
  
  @JSName("type")
  var type_Sibling: sibling = js.native
}
object Sibling {
  
  @scala.inline
  def apply(left: SubjectSelector, right: SubjectSelector, `type`: sibling): Sibling = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sibling]
  }
  
  @scala.inline
  implicit class SiblingMutableBuilder[Self <: Sibling] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: sibling): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
