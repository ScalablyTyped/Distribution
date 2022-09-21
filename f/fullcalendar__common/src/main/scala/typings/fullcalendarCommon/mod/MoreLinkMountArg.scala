package typings.fullcalendarCommon.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @fullcalendar/common.@fullcalendar/common.MountArg<@fullcalendar/common.@fullcalendar/common.MoreLinkContentArg> */
trait MoreLinkMountArg extends StObject {
  
  var el: HTMLElement
  
  var num: Double
  
  var shortText: String
  
  var text: String
  
  var view: ViewApi
}
object MoreLinkMountArg {
  
  inline def apply(el: HTMLElement, num: Double, shortText: String, text: String, view: ViewApi): MoreLinkMountArg = {
    val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any], num = num.asInstanceOf[js.Any], shortText = shortText.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[MoreLinkMountArg]
  }
  
  extension [Self <: MoreLinkMountArg](x: Self) {
    
    inline def setEl(value: HTMLElement): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
    
    inline def setNum(value: Double): Self = StObject.set(x, "num", value.asInstanceOf[js.Any])
    
    inline def setShortText(value: String): Self = StObject.set(x, "shortText", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setView(value: ViewApi): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
  }
}
