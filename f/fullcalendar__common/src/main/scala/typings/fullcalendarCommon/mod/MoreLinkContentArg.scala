package typings.fullcalendarCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MoreLinkContentArg extends StObject {
  
  var num: Double
  
  var shortText: String
  
  var text: String
  
  var view: ViewApi
}
object MoreLinkContentArg {
  
  inline def apply(num: Double, shortText: String, text: String, view: ViewApi): MoreLinkContentArg = {
    val __obj = js.Dynamic.literal(num = num.asInstanceOf[js.Any], shortText = shortText.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[MoreLinkContentArg]
  }
  
  extension [Self <: MoreLinkContentArg](x: Self) {
    
    inline def setNum(value: Double): Self = StObject.set(x, "num", value.asInstanceOf[js.Any])
    
    inline def setShortText(value: String): Self = StObject.set(x, "shortText", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setView(value: ViewApi): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
  }
}
