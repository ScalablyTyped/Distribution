package typings.feathersjsErrors

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@feathersjs/errors", "BadGateway")
  @js.native
  class BadGateway () extends FeathersError {
    def this(msg: String) = this()
    def this(msg: Error) = this()
    def this(msg: js.UndefOr[scala.Nothing], data: js.Any) = this()
    def this(msg: String, data: js.Any) = this()
    def this(msg: Error, data: js.Any) = this()
  }
  
  @JSImport("@feathersjs/errors", "BadRequest")
  @js.native
  class BadRequest () extends FeathersError {
    def this(msg: String) = this()
    def this(msg: Error) = this()
    def this(msg: js.UndefOr[scala.Nothing], data: js.Any) = this()
    def this(msg: String, data: js.Any) = this()
    def this(msg: Error, data: js.Any) = this()
  }
  
  @JSImport("@feathersjs/errors", "Conflict")
  @js.native
  class Conflict () extends FeathersError {
    def this(msg: String) = this()
    def this(msg: Error) = this()
    def this(msg: js.UndefOr[scala.Nothing], data: js.Any) = this()
    def this(msg: String, data: js.Any) = this()
    def this(msg: Error, data: js.Any) = this()
  }
  
  @JSImport("@feathersjs/errors", "FeathersError")
  @js.native
  class FeathersError protected () extends Error {
    def this(msg: String, name: String, code: Double, className: String, data: js.Any) = this()
    def this(msg: Error, name: String, code: Double, className: String, data: js.Any) = this()
    
    val className: String = js.native
    
    val code: Double = js.native
    
    val data: js.Any = js.native
    
    val errors: js.Any = js.native
    
    def toJSON(): FeathersErrorJSON = js.native
  }
  
  @JSImport("@feathersjs/errors", "Forbidden")
  @js.native
  class Forbidden () extends FeathersError {
    def this(msg: String) = this()
    def this(msg: Error) = this()
    def this(msg: js.UndefOr[scala.Nothing], data: js.Any) = this()
    def this(msg: String, data: js.Any) = this()
    def this(msg: Error, data: js.Any) = this()
  }
  
  @JSImport("@feathersjs/errors", "GeneralError")
  @js.native
  class GeneralError () extends FeathersError {
    def this(msg: String) = this()
    def this(msg: Error) = this()
    def this(msg: js.UndefOr[scala.Nothing], data: js.Any) = this()
    def this(msg: String, data: js.Any) = this()
    def this(msg: Error, data: js.Any) = this()
  }
  
  @JSImport("@feathersjs/errors", "LengthRequired")
  @js.native
  class LengthRequired () extends FeathersError {
    def this(msg: String) = this()
    def this(msg: Error) = this()
    def this(msg: js.UndefOr[scala.Nothing], data: js.Any) = this()
    def this(msg: String, data: js.Any) = this()
    def this(msg: Error, data: js.Any) = this()
  }
  
  @JSImport("@feathersjs/errors", "MethodNotAllowed")
  @js.native
  class MethodNotAllowed () extends FeathersError {
    def this(msg: String) = this()
    def this(msg: Error) = this()
    def this(msg: js.UndefOr[scala.Nothing], data: js.Any) = this()
    def this(msg: String, data: js.Any) = this()
    def this(msg: Error, data: js.Any) = this()
  }
  
  @JSImport("@feathersjs/errors", "NotAcceptable")
  @js.native
  class NotAcceptable () extends FeathersError {
    def this(msg: String) = this()
    def this(msg: Error) = this()
    def this(msg: js.UndefOr[scala.Nothing], data: js.Any) = this()
    def this(msg: String, data: js.Any) = this()
    def this(msg: Error, data: js.Any) = this()
  }
  
  @JSImport("@feathersjs/errors", "NotAuthenticated")
  @js.native
  class NotAuthenticated () extends FeathersError {
    def this(msg: String) = this()
    def this(msg: Error) = this()
    def this(msg: js.UndefOr[scala.Nothing], data: js.Any) = this()
    def this(msg: String, data: js.Any) = this()
    def this(msg: Error, data: js.Any) = this()
  }
  
  @JSImport("@feathersjs/errors", "NotFound")
  @js.native
  class NotFound () extends FeathersError {
    def this(msg: String) = this()
    def this(msg: Error) = this()
    def this(msg: js.UndefOr[scala.Nothing], data: js.Any) = this()
    def this(msg: String, data: js.Any) = this()
    def this(msg: Error, data: js.Any) = this()
  }
  
  @JSImport("@feathersjs/errors", "NotImplemented")
  @js.native
  class NotImplemented () extends FeathersError {
    def this(msg: String) = this()
    def this(msg: Error) = this()
    def this(msg: js.UndefOr[scala.Nothing], data: js.Any) = this()
    def this(msg: String, data: js.Any) = this()
    def this(msg: Error, data: js.Any) = this()
  }
  
  @JSImport("@feathersjs/errors", "PaymentError")
  @js.native
  class PaymentError () extends FeathersError {
    def this(msg: String) = this()
    def this(msg: Error) = this()
    def this(msg: js.UndefOr[scala.Nothing], data: js.Any) = this()
    def this(msg: String, data: js.Any) = this()
    def this(msg: Error, data: js.Any) = this()
  }
  
  @JSImport("@feathersjs/errors", "Timeout")
  @js.native
  class Timeout () extends FeathersError {
    def this(msg: String) = this()
    def this(msg: Error) = this()
    def this(msg: js.UndefOr[scala.Nothing], data: js.Any) = this()
    def this(msg: String, data: js.Any) = this()
    def this(msg: Error, data: js.Any) = this()
  }
  
  @JSImport("@feathersjs/errors", "TooManyRequests")
  @js.native
  class TooManyRequests () extends FeathersError {
    def this(msg: String) = this()
    def this(msg: Error) = this()
    def this(msg: js.UndefOr[scala.Nothing], data: js.Any) = this()
    def this(msg: String, data: js.Any) = this()
    def this(msg: Error, data: js.Any) = this()
  }
  
  @JSImport("@feathersjs/errors", "Unavailable")
  @js.native
  class Unavailable () extends FeathersError {
    def this(msg: String) = this()
    def this(msg: Error) = this()
    def this(msg: js.UndefOr[scala.Nothing], data: js.Any) = this()
    def this(msg: String, data: js.Any) = this()
    def this(msg: Error, data: js.Any) = this()
  }
  
  @JSImport("@feathersjs/errors", "Unprocessable")
  @js.native
  class Unprocessable () extends FeathersError {
    def this(msg: String) = this()
    def this(msg: Error) = this()
    def this(msg: js.UndefOr[scala.Nothing], data: js.Any) = this()
    def this(msg: String, data: js.Any) = this()
    def this(msg: Error, data: js.Any) = this()
  }
  
  @JSImport("@feathersjs/errors", "convert")
  @js.native
  def convert(error: js.Any): FeathersError = js.native
  
  @JSImport("@feathersjs/errors", "errors")
  @js.native
  val errors: Errors_ = js.native
  
  @JSImport("@feathersjs/errors", "types")
  @js.native
  val types: Errors_ = js.native
  
  @js.native
  trait Errors_ extends StObject {
    
    var BadGateway: typings.feathersjsErrors.mod.BadGateway = js.native
    
    var BadRequest: typings.feathersjsErrors.mod.BadRequest = js.native
    
    var Conflict: typings.feathersjsErrors.mod.Conflict = js.native
    
    var FeathersError: typings.feathersjsErrors.mod.FeathersError = js.native
    
    var Forbidden: typings.feathersjsErrors.mod.Forbidden = js.native
    
    var GeneralError: typings.feathersjsErrors.mod.GeneralError = js.native
    
    var LengthRequired: typings.feathersjsErrors.mod.LengthRequired = js.native
    
    var MethodNotAllowed: typings.feathersjsErrors.mod.MethodNotAllowed = js.native
    
    var NotAcceptable: typings.feathersjsErrors.mod.NotAcceptable = js.native
    
    var NotAuthenticated: typings.feathersjsErrors.mod.NotAuthenticated = js.native
    
    var NotFound: typings.feathersjsErrors.mod.NotFound = js.native
    
    var NotImplemented: typings.feathersjsErrors.mod.NotImplemented = js.native
    
    var PaymentError: typings.feathersjsErrors.mod.PaymentError = js.native
    
    var Timeout: typings.feathersjsErrors.mod.Timeout = js.native
    
    var TooManyRequests: typings.feathersjsErrors.mod.TooManyRequests = js.native
    
    var Unavailable: typings.feathersjsErrors.mod.Unavailable = js.native
    
    var Unprocessable: typings.feathersjsErrors.mod.Unprocessable = js.native
  }
  object Errors_ {
    
    @scala.inline
    def apply(
      BadGateway: BadGateway,
      BadRequest: BadRequest,
      Conflict: Conflict,
      FeathersError: FeathersError,
      Forbidden: Forbidden,
      GeneralError: GeneralError,
      LengthRequired: LengthRequired,
      MethodNotAllowed: MethodNotAllowed,
      NotAcceptable: NotAcceptable,
      NotAuthenticated: NotAuthenticated,
      NotFound: NotFound,
      NotImplemented: NotImplemented,
      PaymentError: PaymentError,
      Timeout: Timeout,
      TooManyRequests: TooManyRequests,
      Unavailable: Unavailable,
      Unprocessable: Unprocessable
    ): Errors_ = {
      val __obj = js.Dynamic.literal(BadGateway = BadGateway.asInstanceOf[js.Any], BadRequest = BadRequest.asInstanceOf[js.Any], Conflict = Conflict.asInstanceOf[js.Any], FeathersError = FeathersError.asInstanceOf[js.Any], Forbidden = Forbidden.asInstanceOf[js.Any], GeneralError = GeneralError.asInstanceOf[js.Any], LengthRequired = LengthRequired.asInstanceOf[js.Any], MethodNotAllowed = MethodNotAllowed.asInstanceOf[js.Any], NotAcceptable = NotAcceptable.asInstanceOf[js.Any], NotAuthenticated = NotAuthenticated.asInstanceOf[js.Any], NotFound = NotFound.asInstanceOf[js.Any], NotImplemented = NotImplemented.asInstanceOf[js.Any], PaymentError = PaymentError.asInstanceOf[js.Any], Timeout = Timeout.asInstanceOf[js.Any], TooManyRequests = TooManyRequests.asInstanceOf[js.Any], Unavailable = Unavailable.asInstanceOf[js.Any], Unprocessable = Unprocessable.asInstanceOf[js.Any])
      __obj.asInstanceOf[Errors_]
    }
    
    @scala.inline
    implicit class Errors_MutableBuilder[Self <: Errors_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBadGateway(value: BadGateway): Self = StObject.set(x, "BadGateway", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBadRequest(value: BadRequest): Self = StObject.set(x, "BadRequest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConflict(value: Conflict): Self = StObject.set(x, "Conflict", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFeathersError(value: FeathersError): Self = StObject.set(x, "FeathersError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForbidden(value: Forbidden): Self = StObject.set(x, "Forbidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGeneralError(value: GeneralError): Self = StObject.set(x, "GeneralError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLengthRequired(value: LengthRequired): Self = StObject.set(x, "LengthRequired", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodNotAllowed(value: MethodNotAllowed): Self = StObject.set(x, "MethodNotAllowed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotAcceptable(value: NotAcceptable): Self = StObject.set(x, "NotAcceptable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotAuthenticated(value: NotAuthenticated): Self = StObject.set(x, "NotAuthenticated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotFound(value: NotFound): Self = StObject.set(x, "NotFound", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotImplemented(value: NotImplemented): Self = StObject.set(x, "NotImplemented", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaymentError(value: PaymentError): Self = StObject.set(x, "PaymentError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeout(value: Timeout): Self = StObject.set(x, "Timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooManyRequests(value: TooManyRequests): Self = StObject.set(x, "TooManyRequests", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnavailable(value: Unavailable): Self = StObject.set(x, "Unavailable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnprocessable(value: Unprocessable): Self = StObject.set(x, "Unprocessable", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FeathersErrorJSON extends StObject {
    
    val className: String = js.native
    
    val code: Double = js.native
    
    val data: js.Any = js.native
    
    val errors: js.Any = js.native
    
    val message: String = js.native
    
    val name: String = js.native
  }
  object FeathersErrorJSON {
    
    @scala.inline
    def apply(className: String, code: Double, data: js.Any, errors: js.Any, message: String, name: String): FeathersErrorJSON = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[FeathersErrorJSON]
    }
    
    @scala.inline
    implicit class FeathersErrorJSONMutableBuilder[Self <: FeathersErrorJSON] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrors(value: js.Any): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
