package typings.gatsbyCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdStatusText extends StObject {
  
  var id: String
  
  var statusText: String
}
object IdStatusText {
  
  @scala.inline
  def apply(id: String, statusText: String): IdStatusText = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdStatusText]
  }
  
  @scala.inline
  implicit class IdStatusTextMutableBuilder[Self <: IdStatusText] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
  }
}
