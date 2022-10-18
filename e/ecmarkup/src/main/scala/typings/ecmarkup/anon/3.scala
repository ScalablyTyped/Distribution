package typings.ecmarkup.anon

import typings.ecmarkup.ecmarkupStrings.strict
import typings.std.BooleanConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `3` extends StObject {
  
  val description: /* Exit with an error if there are warnings. Cannot be used with --watch. */ String
  
  val name: strict
  
  /* standard es5 */
  def `type`[T](): Boolean
  def `type`[T](value: T): Boolean
  @JSName("type")
  val type_Original: BooleanConstructor
}
object `3` {
  
  inline def apply(`type`: BooleanConstructor): `3` = {
    val __obj = js.Dynamic.literal(description = "Exit with an error if there are warnings. Cannot be used with --watch.", name = "strict")
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`3`]
  }
  
  extension [Self <: `3`](x: Self) {
    
    inline def setDescription(value: /* Exit with an error if there are warnings. Cannot be used with --watch. */ String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setName(value: strict): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: BooleanConstructor): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
