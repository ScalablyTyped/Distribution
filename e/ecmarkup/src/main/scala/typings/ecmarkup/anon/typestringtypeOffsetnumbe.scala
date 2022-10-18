package typings.ecmarkup.anon

import typings.ecmarkup.ecmarkupStrings.del
import typings.ecmarkup.ecmarkupStrings.ins
import typings.ecmarkup.ecmarkupStrings.mark
import typings.ecmarkup.libHeaderParserMod.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  type :string,   typeOffset :number} & ecmarkup.ecmarkup/lib/header-parser.BaseParam */
trait typestringtypeOffsetnumbe
  extends StObject
     with Param {
  
  var name: String
  
  var `type`: String
  
  var typeOffset: Double
  
  var wrappingTag: ins | del | mark | Null
}
object typestringtypeOffsetnumbe {
  
  inline def apply(name: String, `type`: String, typeOffset: Double): typestringtypeOffsetnumbe = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], typeOffset = typeOffset.asInstanceOf[js.Any], wrappingTag = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typestringtypeOffsetnumbe]
  }
  
  extension [Self <: typestringtypeOffsetnumbe](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeOffset(value: Double): Self = StObject.set(x, "typeOffset", value.asInstanceOf[js.Any])
    
    inline def setWrappingTag(value: ins | del | mark): Self = StObject.set(x, "wrappingTag", value.asInstanceOf[js.Any])
    
    inline def setWrappingTagNull: Self = StObject.set(x, "wrappingTag", null)
  }
}
