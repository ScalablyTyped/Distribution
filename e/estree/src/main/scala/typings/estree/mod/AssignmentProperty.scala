package typings.estree.mod

import typings.estree.estreeStrings.init
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.estree.mod.Node because Already inherited */ @js.native
trait AssignmentProperty extends Property {
  
  @JSName("kind")
  var kind_AssignmentProperty: init = js.native
  
  @JSName("value")
  var value_AssignmentProperty: Pattern = js.native
}
object AssignmentProperty {
  
  @scala.inline
  def apply(
    computed: Boolean,
    key: Expression,
    kind: init,
    method: Boolean,
    shorthand: Boolean,
    `type`: typings.estree.estreeStrings.Property,
    value: Pattern
  ): AssignmentProperty = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], shorthand = shorthand.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssignmentProperty]
  }
  
  @scala.inline
  implicit class AssignmentPropertyMutableBuilder[Self <: AssignmentProperty] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: init): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Pattern): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
