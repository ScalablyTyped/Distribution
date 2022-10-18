package typings.ecmarkup.anon

import typings.ecmarkup.ecmarkupStrings.`Leftcurlybracketunderline fileRightcurlybracket`
import typings.ecmarkup.ecmarkupStrings.`Path to where the biblioDotjson should be written`
import typings.ecmarkup.ecmarkupStrings.`write-biblio`
import typings.std.StringConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Type extends StObject {
  
  val description: `Path to where the biblioDotjson should be written`
  
  val name: `write-biblio`
  
  /* standard es5 */
  def `type`(): String
  def `type`(value: Any): String
  
  val typeLabel: `Leftcurlybracketunderline fileRightcurlybracket`
  
  @JSName("type")
  val type_Original: StringConstructor
}
object Type {
  
  inline def apply(`type`: StringConstructor): Type = {
    val __obj = js.Dynamic.literal(description = "Path to where the biblio.json should be written", name = "write-biblio", typeLabel = "{underline file}")
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
  
  extension [Self <: Type](x: Self) {
    
    inline def setDescription(value: `Path to where the biblioDotjson should be written`): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setName(value: `write-biblio`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: StringConstructor): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeLabel(value: `Leftcurlybracketunderline fileRightcurlybracket`): Self = StObject.set(x, "typeLabel", value.asInstanceOf[js.Any])
  }
}
