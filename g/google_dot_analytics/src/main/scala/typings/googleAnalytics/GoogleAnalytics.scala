package typings.googleAnalytics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAnalytics extends StObject {
  
  var async: Boolean
  
  var src: String
  
  var `type`: String
}
object GoogleAnalytics {
  
  @scala.inline
  def apply(async: Boolean, src: String, `type`: String): GoogleAnalytics = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleAnalytics]
  }
  
  @scala.inline
  implicit class GoogleAnalyticsMutableBuilder[Self <: GoogleAnalytics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
