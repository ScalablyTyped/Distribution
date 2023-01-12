package typings.documentdbServer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** List of error codes returned by database operations in the RequestCallback and FeedCallback. See the corresponding error message for more details. */
trait IErrorCodes extends StObject {
  
  // Client error
  /** (400) Request failed due to bad inputs **/
  var BadRequest: Double
  
  /** (409) Resource with the specified id already exists **/
  var Conflict: Double
  
  /** (403) Request was denied access to the resource **/
  var Forbidden: Double
  
  // Server error
  /** (500) Server encountered an unexpected error in processing the request **/
  var InternalServerError: Double
  
  /** (404) Request tried to access a resource which doesn't exist **/
  var NotFound: Double
  
  /** (412) Conditions specified in the request options were not met **/
  var PreconditionFailed: Double
  
  /** (413) Request failed because it was too large **/
  var RequestEntityTooLarge: Double
  
  /** (449) Request conflicted with the current state of a resource and must be retried from a new transaction from the client side **/
  var RetryWith: Double
}
object IErrorCodes {
  
  inline def apply(
    BadRequest: Double,
    Conflict: Double,
    Forbidden: Double,
    InternalServerError: Double,
    NotFound: Double,
    PreconditionFailed: Double,
    RequestEntityTooLarge: Double,
    RetryWith: Double
  ): IErrorCodes = {
    val __obj = js.Dynamic.literal(BadRequest = BadRequest.asInstanceOf[js.Any], Conflict = Conflict.asInstanceOf[js.Any], Forbidden = Forbidden.asInstanceOf[js.Any], InternalServerError = InternalServerError.asInstanceOf[js.Any], NotFound = NotFound.asInstanceOf[js.Any], PreconditionFailed = PreconditionFailed.asInstanceOf[js.Any], RequestEntityTooLarge = RequestEntityTooLarge.asInstanceOf[js.Any], RetryWith = RetryWith.asInstanceOf[js.Any])
    __obj.asInstanceOf[IErrorCodes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IErrorCodes] (val x: Self) extends AnyVal {
    
    inline def setBadRequest(value: Double): Self = StObject.set(x, "BadRequest", value.asInstanceOf[js.Any])
    
    inline def setConflict(value: Double): Self = StObject.set(x, "Conflict", value.asInstanceOf[js.Any])
    
    inline def setForbidden(value: Double): Self = StObject.set(x, "Forbidden", value.asInstanceOf[js.Any])
    
    inline def setInternalServerError(value: Double): Self = StObject.set(x, "InternalServerError", value.asInstanceOf[js.Any])
    
    inline def setNotFound(value: Double): Self = StObject.set(x, "NotFound", value.asInstanceOf[js.Any])
    
    inline def setPreconditionFailed(value: Double): Self = StObject.set(x, "PreconditionFailed", value.asInstanceOf[js.Any])
    
    inline def setRequestEntityTooLarge(value: Double): Self = StObject.set(x, "RequestEntityTooLarge", value.asInstanceOf[js.Any])
    
    inline def setRetryWith(value: Double): Self = StObject.set(x, "RetryWith", value.asInstanceOf[js.Any])
  }
}
