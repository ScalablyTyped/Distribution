package typings.gaeaModel.FitGaea

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventActionJumpUrl extends StObject {
  
  var url: js.UndefOr[String] = js.undefined
}
object EventActionJumpUrl {
  
  inline def apply(): EventActionJumpUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventActionJumpUrl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventActionJumpUrl] (val x: Self) extends AnyVal {
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
