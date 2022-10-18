package typings.ecmarkup.anon

import typings.ecmarkup.ecmarkupStrings.`Rebuild when files change`
import typings.ecmarkup.ecmarkupStrings.w
import typings.ecmarkup.ecmarkupStrings.watch
import typings.std.BooleanConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Description extends StObject {
  
  val alias: w
  
  val description: `Rebuild when files change`
  
  val name: watch
  
  /* standard es5 */
  def `type`[T](): Boolean
  def `type`[T](value: T): Boolean
  @JSName("type")
  val type_Original: BooleanConstructor
}
object Description {
  
  inline def apply(`type`: BooleanConstructor): Description = {
    val __obj = js.Dynamic.literal(alias = "w", description = "Rebuild when files change", name = "watch")
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Description]
  }
  
  extension [Self <: Description](x: Self) {
    
    inline def setAlias(value: w): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: `Rebuild when files change`): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setName(value: watch): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: BooleanConstructor): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
