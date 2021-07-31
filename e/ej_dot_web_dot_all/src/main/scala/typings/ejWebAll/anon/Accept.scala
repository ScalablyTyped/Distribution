package typings.ejWebAll.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Accept extends StObject {
  
  var accept: String
  
  var data: js.Any
  
  var `type`: String
  
  var url: String
}
object Accept {
  
  @scala.inline
  def apply(accept: String, data: js.Any, `type`: String, url: String): Accept = {
    val __obj = js.Dynamic.literal(accept = accept.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accept]
  }
  
  @scala.inline
  implicit class AcceptMutableBuilder[Self <: Accept] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccept(value: String): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
