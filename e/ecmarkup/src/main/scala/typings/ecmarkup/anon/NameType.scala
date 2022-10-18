package typings.ecmarkup.anon

import typings.ecmarkup.ecmarkupStrings.`Leftcurlybracketunderline fileRightcurlybracket`
import typings.ecmarkup.ecmarkupStrings.`Path to a file where the JS assets should be written`
import typings.ecmarkup.ecmarkupStrings.`js-out`
import typings.std.StringConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NameType extends StObject {
  
  val description: `Path to a file where the JS assets should be written`
  
  val name: `js-out`
  
  /* standard es5 */
  def `type`(): String
  def `type`(value: Any): String
  
  val typeLabel: `Leftcurlybracketunderline fileRightcurlybracket`
  
  @JSName("type")
  val type_Original: StringConstructor
}
object NameType {
  
  inline def apply(`type`: StringConstructor): NameType = {
    val __obj = js.Dynamic.literal(description = "Path to a file where the JS assets should be written", name = "js-out", typeLabel = "{underline file}")
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameType]
  }
  
  extension [Self <: NameType](x: Self) {
    
    inline def setDescription(value: `Path to a file where the JS assets should be written`): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setName(value: `js-out`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: StringConstructor): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeLabel(value: `Leftcurlybracketunderline fileRightcurlybracket`): Self = StObject.set(x, "typeLabel", value.asInstanceOf[js.Any])
  }
}
