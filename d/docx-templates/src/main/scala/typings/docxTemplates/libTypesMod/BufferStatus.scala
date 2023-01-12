package typings.docxTemplates.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BufferStatus extends StObject {
  
  var cmds: String
  
  var fInsertedText: Boolean
  
  var text: String
}
object BufferStatus {
  
  inline def apply(cmds: String, fInsertedText: Boolean, text: String): BufferStatus = {
    val __obj = js.Dynamic.literal(cmds = cmds.asInstanceOf[js.Any], fInsertedText = fInsertedText.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BufferStatus] (val x: Self) extends AnyVal {
    
    inline def setCmds(value: String): Self = StObject.set(x, "cmds", value.asInstanceOf[js.Any])
    
    inline def setFInsertedText(value: Boolean): Self = StObject.set(x, "fInsertedText", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
