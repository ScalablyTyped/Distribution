package typings.gaeaModel.FitGaea

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventActionJumpUrl extends StObject {
  
  var url: js.UndefOr[String] = js.native
}
object EventActionJumpUrl {
  
  @scala.inline
  def apply(): EventActionJumpUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventActionJumpUrl]
  }
  
  @scala.inline
  implicit class EventActionJumpUrlMutableBuilder[Self <: EventActionJumpUrl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
