package typings.docxTemplates.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommandSummary extends StObject {
  
  var code: String = js.native
  
  var raw: String = js.native
  
  var `type`: BuiltInCommand = js.native
}
object CommandSummary {
  
  @scala.inline
  def apply(code: String, raw: String, `type`: BuiltInCommand): CommandSummary = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandSummary]
  }
  
  @scala.inline
  implicit class CommandSummaryMutableBuilder[Self <: CommandSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: BuiltInCommand): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
