package typings.ecmarkup.anon

import typings.ecmarkup.ecmarkupStrings.`no-toc`
import typings.std.BooleanConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescriptionNameType extends StObject {
  
  val description: /* Don't include the table of contents */ String
  
  val name: `no-toc`
  
  /* standard es5 */
  def `type`[T](): Boolean
  def `type`[T](value: T): Boolean
  @JSName("type")
  val type_Original: BooleanConstructor
}
object DescriptionNameType {
  
  inline def apply(`type`: BooleanConstructor): DescriptionNameType = {
    val __obj = js.Dynamic.literal(description = "Don't include the table of contents", name = "no-toc")
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescriptionNameType]
  }
  
  extension [Self <: DescriptionNameType](x: Self) {
    
    inline def setDescription(value: /* Don't include the table of contents */ String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setName(value: `no-toc`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: BooleanConstructor): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
