package typings.ecmarkup.anon

import typings.ecmarkup.ecmarkupStrings.`Display document build progress`
import typings.ecmarkup.ecmarkupStrings.verbose
import typings.std.BooleanConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `4` extends StObject {
  
  val description: `Display document build progress`
  
  val name: verbose
  
  /* standard es5 */
  def `type`[T](): Boolean
  def `type`[T](value: T): Boolean
  @JSName("type")
  val type_Original: BooleanConstructor
}
object `4` {
  
  inline def apply(`type`: BooleanConstructor): `4` = {
    val __obj = js.Dynamic.literal(description = "Display document build progress", name = "verbose")
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`4`]
  }
  
  extension [Self <: `4`](x: Self) {
    
    inline def setDescription(value: `Display document build progress`): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setName(value: verbose): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: BooleanConstructor): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
