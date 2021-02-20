package typings.esquery.mod

import typings.esquery.esqueryStrings.child
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Child
  extends BinarySelectorAtom
     with BinarySelector
     with Selector {
  
  @JSName("type")
  var type_Child: child = js.native
}
object Child {
  
  @scala.inline
  def apply(left: SubjectSelector, right: SubjectSelector, `type`: child): Child = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Child]
  }
  
  @scala.inline
  implicit class ChildMutableBuilder[Self <: Child] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: child): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
