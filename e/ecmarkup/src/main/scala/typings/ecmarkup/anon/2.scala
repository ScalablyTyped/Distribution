package typings.ecmarkup.anon

import typings.ecmarkup.ecmarkupStrings.multipage
import typings.std.BooleanConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `2` extends StObject {
  
  val description: /* Generate a multipage version of the spec. Cannot be used with --js-out or --css-out. */ String
  
  val name: multipage
  
  /* standard es5 */
  def `type`[T](): Boolean
  def `type`[T](value: T): Boolean
  @JSName("type")
  val type_Original: BooleanConstructor
}
object `2` {
  
  inline def apply(`type`: BooleanConstructor): `2` = {
    val __obj = js.Dynamic.literal(description = "Generate a multipage version of the spec. Cannot be used with --js-out or --css-out.", name = "multipage")
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`2`]
  }
  
  extension [Self <: `2`](x: Self) {
    
    inline def setDescription(
      value: /* Generate a multipage version of the spec. Cannot be used with --js-out or --css-out. */ String
    ): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setName(value: multipage): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: BooleanConstructor): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
