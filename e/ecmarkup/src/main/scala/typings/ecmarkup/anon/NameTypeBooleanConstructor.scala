package typings.ecmarkup.anon

import typings.ecmarkup.ecmarkupStrings.`Render markers for effects like Quotationmarkuser codeQuotationmark [UC]`
import typings.ecmarkup.ecmarkupStrings.`mark-effects`
import typings.std.BooleanConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NameTypeBooleanConstructor extends StObject {
  
  val description: `Render markers for effects like Quotationmarkuser codeQuotationmark [UC]`
  
  val name: `mark-effects`
  
  /* standard es5 */
  def `type`[T](): Boolean
  def `type`[T](value: T): Boolean
  @JSName("type")
  val type_Original: BooleanConstructor
}
object NameTypeBooleanConstructor {
  
  inline def apply(`type`: BooleanConstructor): NameTypeBooleanConstructor = {
    val __obj = js.Dynamic.literal(description = "Render markers for effects like \"user code\" [UC]", name = "mark-effects")
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameTypeBooleanConstructor]
  }
  
  extension [Self <: NameTypeBooleanConstructor](x: Self) {
    
    inline def setDescription(value: `Render markers for effects like Quotationmarkuser codeQuotationmark [UC]`): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setName(value: `mark-effects`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: BooleanConstructor): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
