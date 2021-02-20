package typings.gapiCalendar.gapi.client.calendar

import typings.gapiCalendar.anon.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AclUpdateParameters extends AclInsertParameters {
  
  var ruleId: String = js.native
}
object AclUpdateParameters {
  
  @scala.inline
  def apply(calendarId: String, role: AccessRole, ruleId: String, scope: Value): AclUpdateParameters = {
    val __obj = js.Dynamic.literal(calendarId = calendarId.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], ruleId = ruleId.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[AclUpdateParameters]
  }
  
  @scala.inline
  implicit class AclUpdateParametersMutableBuilder[Self <: AclUpdateParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRuleId(value: String): Self = StObject.set(x, "ruleId", value.asInstanceOf[js.Any])
  }
}
