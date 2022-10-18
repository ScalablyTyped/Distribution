package typings.ecmarkup.anon

import typings.ecmarkup.ecmarkupStrings.`Use the old table of contents styling`
import typings.ecmarkup.ecmarkupStrings.`old-toc`
import typings.std.BooleanConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeBooleanConstructor extends StObject {
  
  val description: `Use the old table of contents styling`
  
  val name: `old-toc`
  
  /* standard es5 */
  def `type`[T](): Boolean
  def `type`[T](value: T): Boolean
  @JSName("type")
  val type_Original: BooleanConstructor
}
object TypeBooleanConstructor {
  
  inline def apply(`type`: BooleanConstructor): TypeBooleanConstructor = {
    val __obj = js.Dynamic.literal(description = "Use the old table of contents styling", name = "old-toc")
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeBooleanConstructor]
  }
  
  extension [Self <: TypeBooleanConstructor](x: Self) {
    
    inline def setDescription(value: `Use the old table of contents styling`): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setName(value: `old-toc`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: BooleanConstructor): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
