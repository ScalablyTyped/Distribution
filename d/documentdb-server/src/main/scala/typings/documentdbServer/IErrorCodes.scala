package typings.documentdbServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** List of error codes returned by database operations in the RequestCallback and FeedCallback. See the corresponding error message for more details. */
@js.native
trait IErrorCodes extends js.Object {
  
  // Client error
  /** (400) Request failed due to bad inputs **/
  var BadRequest: Double = js.native
  
  /** (409) Resource with the specified id already exists **/
  var Conflict: Double = js.native
  
  /** (403) Request was denied access to the resource **/
  var Forbidden: Double = js.native
  
  // Server error
  /** (500) Server encountered an unexpected error in processing the request **/
  var InternalServerError: Double = js.native
  
  /** (404) Request tried to access a resource which doesn't exist **/
  var NotFound: Double = js.native
  
  /** (412) Conditions specified in the request options were not met **/
  var PreconditionFailed: Double = js.native
  
  /** (413) Request failed because it was too large **/
  var RequestEntityTooLarge: Double = js.native
  
  /** (449) Request conflicted with the current state of a resource and must be retried from a new transaction from the client side **/
  var RetryWith: Double = js.native
}
object IErrorCodes {
  
  @scala.inline
  def apply(
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
  implicit class IErrorCodesOps[Self <: IErrorCodes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBadRequest(value: Double): Self = this.set("BadRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConflict(value: Double): Self = this.set("Conflict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForbidden(value: Double): Self = this.set("Forbidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInternalServerError(value: Double): Self = this.set("InternalServerError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotFound(value: Double): Self = this.set("NotFound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreconditionFailed(value: Double): Self = this.set("PreconditionFailed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestEntityTooLarge(value: Double): Self = this.set("RequestEntityTooLarge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetryWith(value: Double): Self = this.set("RetryWith", value.asInstanceOf[js.Any])
  }
}
