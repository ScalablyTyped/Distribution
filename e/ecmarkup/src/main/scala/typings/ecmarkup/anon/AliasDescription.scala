package typings.ecmarkup.anon

import typings.ecmarkup.ecmarkupStrings.`Display version info`
import typings.ecmarkup.ecmarkupStrings.v
import typings.ecmarkup.ecmarkupStrings.version
import typings.std.BooleanConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AliasDescription extends StObject {
  
  val alias: v
  
  val description: `Display version info`
  
  val name: version
  
  /* standard es5 */
  def `type`[T](): Boolean
  def `type`[T](value: T): Boolean
  @JSName("type")
  val type_Original: BooleanConstructor
}
object AliasDescription {
  
  inline def apply(`type`: BooleanConstructor): AliasDescription = {
    val __obj = js.Dynamic.literal(alias = "v", description = "Display version info", name = "version")
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AliasDescription]
  }
  
  extension [Self <: AliasDescription](x: Self) {
    
    inline def setAlias(value: v): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: `Display version info`): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setName(value: version): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: BooleanConstructor): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
