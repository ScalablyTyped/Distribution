package typings.gapiCalendar.anon

import typings.gapiCalendar.gapi.client.calendar.NotificationType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MethodType extends StObject {
  
  var method: String = js.native
  
  var `type`: NotificationType = js.native
}
object MethodType {
  
  @scala.inline
  def apply(method: String, `type`: NotificationType): MethodType = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MethodType]
  }
  
  @scala.inline
  implicit class MethodTypeMutableBuilder[Self <: MethodType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: NotificationType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
