package typings.docxTemplates.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommandSummary extends StObject {
  
  var code: String
  
  var raw: String
  
  var `type`: BuiltInCommand
}
object CommandSummary {
  
  inline def apply(code: String, raw: String, `type`: BuiltInCommand): CommandSummary = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandSummary]
  }
  
  extension [Self <: CommandSummary](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setType(value: BuiltInCommand): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
