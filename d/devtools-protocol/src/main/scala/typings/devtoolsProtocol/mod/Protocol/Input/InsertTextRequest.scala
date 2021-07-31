package typings.devtoolsProtocol.mod.Protocol.Input

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsertTextRequest extends StObject {
  
  /**
    * The text to insert.
    */
  var text: String
}
object InsertTextRequest {
  
  @scala.inline
  def apply(text: String): InsertTextRequest = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsertTextRequest]
  }
  
  @scala.inline
  implicit class InsertTextRequestMutableBuilder[Self <: InsertTextRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
