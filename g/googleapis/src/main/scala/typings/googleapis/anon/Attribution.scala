package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Attribution extends StObject {
  
  var attribution: js.UndefOr[String] = js.native
  
  var url: js.UndefOr[String] = js.native
}
object Attribution {
  
  @scala.inline
  def apply(): Attribution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Attribution]
  }
  
  @scala.inline
  implicit class AttributionMutableBuilder[Self <: Attribution] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttribution(value: String): Self = StObject.set(x, "attribution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributionUndefined: Self = StObject.set(x, "attribution", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
