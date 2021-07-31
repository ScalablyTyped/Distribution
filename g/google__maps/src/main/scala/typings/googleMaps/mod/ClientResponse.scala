package typings.googleMaps.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientResponse[T] extends StObject {
  
  /** The HTTP headers. */
  var headers: StringDictionary[String]
  
  /** Deserialized JSON object for the API response. */
  var json: T
  
  /** The HTTP status. */
  var status: Double
}
object ClientResponse {
  
  @scala.inline
  def apply[T](headers: StringDictionary[String], json: T, status: Double): ClientResponse[T] = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientResponse[T]]
  }
  
  @scala.inline
  implicit class ClientResponseMutableBuilder[Self <: ClientResponse[?], T] (val x: Self & ClientResponse[T]) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJson(value: T): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
