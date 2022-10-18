package typings.ecmarkup.anon

import typings.ecmarkup.ecmarkupStrings.`Display this help message`
import typings.ecmarkup.ecmarkupStrings.h
import typings.ecmarkup.ecmarkupStrings.help
import typings.std.BooleanConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Alias extends StObject {
  
  val alias: h
  
  val description: `Display this help message`
  
  val name: help
  
  /* standard es5 */
  def `type`[T](): Boolean
  def `type`[T](value: T): Boolean
  @JSName("type")
  val type_Original: BooleanConstructor
}
object Alias {
  
  inline def apply(`type`: BooleanConstructor): Alias = {
    val __obj = js.Dynamic.literal(alias = "h", description = "Display this help message", name = "help")
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alias]
  }
  
  extension [Self <: Alias](x: Self) {
    
    inline def setAlias(value: h): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: `Display this help message`): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setName(value: help): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: BooleanConstructor): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
