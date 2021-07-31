package typings.gapiCalendar.gapi.client.calendar

import typings.gapiCalendar.anon.Type
import typings.gapiCalendar.gapiCalendarStrings.calendarNumbersignaclRule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Acl_ extends StObject {
  
  var etag: typings.gapiCalendar.gapi.client.calendar.etag
  
  var id: String
  
  var kind: calendarNumbersignaclRule
  
  var role: AccessRole
  
  var scope: Type
}
object Acl_ {
  
  @scala.inline
  def apply(etag: etag, id: String, role: AccessRole, scope: Type): Acl_ = {
    val __obj = js.Dynamic.literal(etag = etag.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = "calendar#aclRule", role = role.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[Acl_]
  }
  
  @scala.inline
  implicit class Acl_MutableBuilder[Self <: Acl_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEtag(value: etag): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: calendarNumbersignaclRule): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRole(value: AccessRole): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScope(value: Type): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
  }
}
