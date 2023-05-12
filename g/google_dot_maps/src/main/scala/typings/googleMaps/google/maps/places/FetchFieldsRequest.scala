package typings.googleMaps.google.maps.places

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FetchFieldsRequest extends StObject {
  
  /**
    * List of fields to be fetched.
    */
  var fields: js.Array[String]
  
  /**
    * Unique reference used to bundle the details request with an autocomplete
    * session.
    */
  var sessionToken: js.UndefOr[AutocompleteSessionToken | Null] = js.undefined
}
object FetchFieldsRequest {
  
  inline def apply(fields: js.Array[String]): FetchFieldsRequest = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchFieldsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FetchFieldsRequest] (val x: Self) extends AnyVal {
    
    inline def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setSessionToken(value: AutocompleteSessionToken): Self = StObject.set(x, "sessionToken", value.asInstanceOf[js.Any])
    
    inline def setSessionTokenNull: Self = StObject.set(x, "sessionToken", null)
    
    inline def setSessionTokenUndefined: Self = StObject.set(x, "sessionToken", js.undefined)
  }
}
