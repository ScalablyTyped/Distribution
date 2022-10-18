package typings.ecmarkup.anon

import typings.ecmarkup.ecmarkupBooleans.`true`
import typings.ecmarkup.ecmarkupStrings.files
import typings.std.StringConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultOption extends StObject {
  
  val defaultOption: `true`
  
  val multiple: `true`
  
  val name: files
  
  /* standard es5 */
  def `type`(): String
  def `type`(value: Any): String
  @JSName("type")
  val type_Original: StringConstructor
}
object DefaultOption {
  
  inline def apply(`type`: StringConstructor): DefaultOption = {
    val __obj = js.Dynamic.literal(defaultOption = true, multiple = true, name = "files")
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultOption]
  }
  
  extension [Self <: DefaultOption](x: Self) {
    
    inline def setDefaultOption(value: `true`): Self = StObject.set(x, "defaultOption", value.asInstanceOf[js.Any])
    
    inline def setMultiple(value: `true`): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    
    inline def setName(value: files): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: StringConstructor): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
