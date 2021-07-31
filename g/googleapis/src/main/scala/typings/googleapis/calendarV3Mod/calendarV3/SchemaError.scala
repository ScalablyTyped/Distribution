package typings.googleapis.calendarV3Mod.calendarV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaError extends StObject {
  
  /**
    * Domain, or broad category, of the error.
    */
  var domain: js.UndefOr[String] = js.undefined
  
  /**
    * Specific reason for the error. Some of the possible values are:   -
    * &quot;groupTooBig&quot; - The group of users requested is too large for a
    * single query.  - &quot;tooManyCalendarsRequested&quot; - The number of
    * calendars requested is too large for a single query.  -
    * &quot;notFound&quot; - The requested resource was not found.  -
    * &quot;internalError&quot; - The API service has encountered an internal
    * error.  Additional error types may be added in the future, so clients
    * should gracefully handle additional error statuses not included in this
    * list.
    */
  var reason: js.UndefOr[String] = js.undefined
}
object SchemaError {
  
  @scala.inline
  def apply(): SchemaError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaError]
  }
  
  @scala.inline
  implicit class SchemaErrorMutableBuilder[Self <: SchemaError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    @scala.inline
    def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
