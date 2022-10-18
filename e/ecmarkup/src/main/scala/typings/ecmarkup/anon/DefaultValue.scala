package typings.ecmarkup.anon

import typings.ecmarkup.ecmarkupStrings.`Leftcurlybracketunderline formatterRightcurlybracket`
import typings.ecmarkup.ecmarkupStrings.`error-formatter`
import typings.ecmarkup.ecmarkupStrings.`eslint-formatter-codeframe`
import typings.std.StringConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultValue extends StObject {
  
  val defaultValue: `eslint-formatter-codeframe`
  
  val description: /* The formatter for warnings and errors; either a path prefixed with "." or "./", or package name, of an installed eslint compatible formatter (default: eslint-formatter-codeframe) */ String
  
  val name: `error-formatter`
  
  /* standard es5 */
  def `type`(): String
  def `type`(value: Any): String
  
  val typeLabel: `Leftcurlybracketunderline formatterRightcurlybracket`
  
  @JSName("type")
  val type_Original: StringConstructor
}
object DefaultValue {
  
  inline def apply(`type`: StringConstructor): DefaultValue = {
    val __obj = js.Dynamic.literal(defaultValue = "eslint-formatter-codeframe", description = "The formatter for warnings and errors; either a path prefixed with \".\" or \"./\", or package name, of an installed eslint compatible formatter (default: eslint-formatter-codeframe)", name = "error-formatter", typeLabel = "{underline formatter}")
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultValue]
  }
  
  extension [Self <: DefaultValue](x: Self) {
    
    inline def setDefaultValue(value: `eslint-formatter-codeframe`): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDescription(
      value: /* The formatter for warnings and errors; either a path prefixed with "." or "./", or package name, of an installed eslint compatible formatter (default: eslint-formatter-codeframe) */ String
    ): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setName(value: `error-formatter`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: StringConstructor): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeLabel(value: `Leftcurlybracketunderline formatterRightcurlybracket`): Self = StObject.set(x, "typeLabel", value.asInstanceOf[js.Any])
  }
}
