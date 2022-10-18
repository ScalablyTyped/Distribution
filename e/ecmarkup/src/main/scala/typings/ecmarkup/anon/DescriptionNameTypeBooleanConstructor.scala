package typings.ecmarkup.anon

import typings.ecmarkup.ecmarkupStrings.`Enforce some style and correctness checks`
import typings.ecmarkup.ecmarkupStrings.`lint-spec`
import typings.std.BooleanConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescriptionNameTypeBooleanConstructor extends StObject {
  
  val description: `Enforce some style and correctness checks`
  
  val name: `lint-spec`
  
  /* standard es5 */
  def `type`[T](): Boolean
  def `type`[T](value: T): Boolean
  @JSName("type")
  val type_Original: BooleanConstructor
}
object DescriptionNameTypeBooleanConstructor {
  
  inline def apply(`type`: BooleanConstructor): DescriptionNameTypeBooleanConstructor = {
    val __obj = js.Dynamic.literal(description = "Enforce some style and correctness checks", name = "lint-spec")
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescriptionNameTypeBooleanConstructor]
  }
  
  extension [Self <: DescriptionNameTypeBooleanConstructor](x: Self) {
    
    inline def setDescription(value: `Enforce some style and correctness checks`): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setName(value: `lint-spec`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: BooleanConstructor): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
