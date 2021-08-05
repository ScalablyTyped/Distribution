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
  
  extension [Self <: EventActionJumpUrl](x: Self) {
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
