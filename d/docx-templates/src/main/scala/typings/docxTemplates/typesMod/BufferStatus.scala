package typings.docxTemplates.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BufferStatus extends StObject {
  
  var cmds: String = js.native
  
  var fInsertedText: Boolean = js.native
  
  var text: String = js.native
}
object BufferStatus {
  
  @scala.inline
  def apply(cmds: String, fInsertedText: Boolean, text: String): BufferStatus = {
    val __obj = js.Dynamic.literal(cmds = cmds.asInstanceOf[js.Any], fInsertedText = fInsertedText.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferStatus]
  }
  
  @scala.inline
  implicit class BufferStatusMutableBuilder[Self <: BufferStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCmds(value: String): Self = StObject.set(x, "cmds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFInsertedText(value: Boolean): Self = StObject.set(x, "fInsertedText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
