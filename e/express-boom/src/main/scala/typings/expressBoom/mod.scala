package typings.expressBoom

import org.scalablytyped.runtime.StringDictionary
import typings.express.mod.RequestHandler
import typings.expressBoom.anon.Message
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("express-boom", JSImport.Namespace)
  @js.native
  def apply(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  
  /**
    * Type augmentation for express
    */
  /**
    * Based on Sandeep K Nair gist: https://gist.github.com/sandeepsuvit/2486c99c0346db87de24539472f34451
    * And https://github.com/hapijs/boom
    */
  object global {
    
    object Express {
      
      @js.native
      trait Boom extends StObject {
        
        /**
          * Respond a 422 Unprocessable Entity error
          * @param message optional message.
          * @param data optional additional error data.
          * @see {@link https://github.com/hapijs/boom#boombaddatamessage-data}
          */
        def badData[Data](): BoomError[Data] = js.native
        def badData[Data](message: js.UndefOr[scala.Nothing], data: Data): BoomError[Data] = js.native
        def badData[Data](message: String): BoomError[Data] = js.native
        def badData[Data](message: String, data: Data): BoomError[Data] = js.native
        
        /**
          * Respond a 502 Bad Gateway error with your error message to the user
          * @param message optional message.
          * @param data optional additional error data.
          * @see {@link https://github.com/hapijs/boom#boombadgatewaymessage-data}
          */
        def badGateway[Data](): BoomError[Data] = js.native
        def badGateway[Data](message: js.UndefOr[scala.Nothing], data: Data): BoomError[Data] = js.native
        def badGateway[Data](message: String): BoomError[Data] = js.native
        def badGateway[Data](message: String, data: Data): BoomError[Data] = js.native
        
        // 5xx
        /**
          * Respond a 500 Internal Server Error error
          * Only 500 errors will hide your message from the end user. Your message is recorded in the server log.
          * @param message optional message.
          * @param data optional additional error data.
          * @see {@link https://github.com/hapijs/boom#boombadimplementationmessage-data---alias-internal}
          */
        def badImplementation[Data](): BoomError[Data] = js.native
        def badImplementation[Data](message: js.UndefOr[scala.Nothing], data: Data): BoomError[Data] = js.native
        def badImplementation[Data](message: String): BoomError[Data] = js.native
        def badImplementation[Data](message: String, data: Data): BoomError[Data] = js.native
        
        // 4xx
        /**
          * Respond a 400 Bad Request error
          * @param message optional message.
          * @param data optional additional error data.
          * @see {@link https://github.com/hapijs/boom#boombadrequestmessage-data}
          */
        def badRequest[Data](): BoomError[Data] = js.native
        def badRequest[Data](message: js.UndefOr[scala.Nothing], data: Data): BoomError[Data] = js.native
        def badRequest[Data](message: String): BoomError[Data] = js.native
        def badRequest[Data](message: String, data: Data): BoomError[Data] = js.native
        
        /**
          * Decorates an error with the boom properties
          * @param error the error object to wrap. If error is already a boom object, it defaults to overriding the object with the new status code and message.
          * @param options optional additional options
          * @see {@link https://github.com/hapijs/boom#boomifyerror-options}
          */
        def boomify(error: Error): BoomError[Null] = js.native
        def boomify(error: Error, options: Message): BoomError[Null] = js.native
        
        /**
          * Respond a 408 Request Time-out error
          * @param message optional message.
          * @param data optional additional error data.
          * @see {@link https://github.com/hapijs/boom#boomclienttimeoutmessage-data}
          */
        def clientTimeout[Data](): BoomError[Data] = js.native
        def clientTimeout[Data](message: js.UndefOr[scala.Nothing], data: Data): BoomError[Data] = js.native
        def clientTimeout[Data](message: String): BoomError[Data] = js.native
        def clientTimeout[Data](message: String, data: Data): BoomError[Data] = js.native
        
        /**
          * Respond a 409 Conflict error
          * @param message optional message.
          * @param data optional additional error data.
          * @see {@link https://github.com/hapijs/boom#boomconflictmessage-data}
          */
        def conflict[Data](): BoomError[Data] = js.native
        def conflict[Data](message: js.UndefOr[scala.Nothing], data: Data): BoomError[Data] = js.native
        def conflict[Data](message: String): BoomError[Data] = js.native
        def conflict[Data](message: String, data: Data): BoomError[Data] = js.native
        
        def create[Data](statusCode: Double): BoomError[Data] = js.native
        def create[Data](statusCode: Double, message: js.UndefOr[scala.Nothing], data: Data): BoomError[Data] = js.native
        def create[Data](statusCode: Double, message: String): BoomError[Data] = js.native
        def create[Data](statusCode: Double, message: String, data: Data): BoomError[Data] = js.native
        
        /**
          * Respond a 413 Request Entity Too Large error
          * @param message optional message.
          * @param data optional additional error data.
          * @see {@link https://github.com/hapijs/boom#boomentitytoolargemessage-data}
          */
        def entityTooLarge[Data](): BoomError[Data] = js.native
        def entityTooLarge[Data](message: js.UndefOr[scala.Nothing], data: Data): BoomError[Data] = js.native
        def entityTooLarge[Data](message: String): BoomError[Data] = js.native
        def entityTooLarge[Data](message: String, data: Data): BoomError[Data] = js.native
        
        /**
          * Respond a 417 Expectation Failed error
          * @param message optional message.
          * @param data optional additional error data.
          * @see {@link https://github.com/hapijs/boom#boomexpectationfailedmessage-data}
          */
        def expectationFailed[Data](): BoomError[Data] = js.native
        def expectationFailed[Data](message: js.UndefOr[scala.Nothing], data: Data): BoomError[Data] = js.native
        def expectationFailed[Data](message: String): BoomError[Data] = js.native
        def expectationFailed[Data](message: String, data: Data): BoomError[Data] = js.native
        
        /**
          * Respond a 424 Failed Dependency error
          * @param message optional message.
          * @param data optional additional error data.
          * @see {@link https://github.com/hapijs/boom#boomfaileddependencymessage-data}
          */
        def failedDependency[Data](): BoomError[Data] = js.native
        def failedDependency[Data](message: js.UndefOr[scala.Nothing], data: Data): BoomError[Data] = js.native
        def failedDependency[Data](message: String): BoomError[Data] = js.native
        def failedDependency[Data](message: String, data: Data): BoomError[Data] = js.native
        
        /**
          * Respond a 403 Forbidden error
          * @param message optional message.
          * @param data optional additional error data.
          * @see {@link https://github.com/hapijs/boom#boomforbiddenmessage-data}
          */
        def forbidden[Data](): BoomError[Data] = js.native
        def forbidden[Data](message: js.UndefOr[scala.Nothing], data: Data): BoomError[Data] = js.native
        def forbidden[Data](message: String): BoomError[Data] = js.native
        def forbidden[Data](message: String, data: Data): BoomError[Data] = js.native
        
        /**
          * Respond a 504 Gateway Time-out error with your error message to the user
          * @param message optional message.
          * @param data optional additional error data.
          * @see {@link https://github.com/hapijs/boom#boomgatewaytimeoutmessage-data}
          */
        def gatewayTimeout[Data](): BoomError[Data] = js.native
        def gatewayTimeout[Data](message: js.UndefOr[scala.Nothing], data: Data): BoomError[Data] = js.native
        def gatewayTimeout[Data](message: String): BoomError[Data] = js.native
        def gatewayTimeout[Data](message: String, data: Data): BoomError[Data] = js.native
        
        /**
          * Respond a 451 Unavailable For Legal Reasons error
          * @param message optional message.
          * @param data optional additional error data.
          * @see {@link https://github.com/hapijs/boom#boomillegalmessage-data}
          */
        def illegal[Data](): BoomError[Data] = js.native
        def illegal[Data](message: js.UndefOr[scala.Nothing], data: Data): BoomError[Data] = js.native
        def illegal[Data](message: String): BoomError[Data] = js.native
        def illegal[Data](message: String, data: Data): BoomError[Data] = js.native
        
        /**
          * Respond a 500 Internal Server Error error
          * Only 500 errors will hide your message from the end user. Your message is recorded in the server log.
          * @param message optional message.
          * @param data optional additional error data.
          * @see {@link https://github.com/hapijs/boom#boombadimplementationmessage-data---alias-internal}
          */
        def internal[Data](): BoomError[Data] = js.native
        def internal[Data](message: js.UndefOr[scala.Nothing], data: Data): BoomError[Data] = js.native
        def internal[Data](message: String): BoomError[Data] = js.native
        def internal[Data](message: String, data: Data): BoomError[Data] = js.native
        
        /**
          * Respond a 411 Length Required error
          * @param message optional message.
          * @param data optional additional error data.
          * @see {@link https://github.com/hapijs/boom#boomlengthrequiredmessage-data}
          */
        def lengthRequired[Data](): BoomError[Data] = js.native
        def lengthRequired[Data](message: js.UndefOr[scala.Nothing], data: Data): BoomError[Data] = js.native
        def lengthRequired[Data](message: String): BoomError[Data] = js.native
        def lengthRequired[Data](message: String, data: Data): BoomError[Data] = js.native
        
        /**
          * Respond a 423 Locked error
          * @param message optional message.
          * @param data optional additional error data.
          * @see {@link https://github.com/hapijs/boom#boomlockedmessage-data}
          */
        def locked[Data](): BoomError[Data] = js.native
        def locked[Data](message: js.UndefOr[scala.Nothing], data: Data): BoomError[Data] = js.native
        def locked[Data](message: String): BoomError[Data] = js.native
        def locked[Data](message: String, data: Data): BoomError[Data] = js.native
        
        /**
          * Respond a 405 Method Not Allowed error
          * @param message optional message.
          * @param data optional additional error data.
          * @param allow optional string or array of strings (to be combined and separated by ', ') which is set to the 'Allow' header.
          * @see {@link https://github.com/hapijs/boom#boommethodnotallowedmessage-data-allow}
          */
        def methodNotAllowed[Data](): BoomError[Data] = js.native
        def methodNotAllowed[Data](message: js.UndefOr[scala.Nothing], data: Data): BoomError[Data] = js.native
        def methodNotAllowed[Data](message: js.UndefOr[scala.Nothing], data: Data, allow: String): BoomError[Data] = js.native
        def methodNotAllowed[Data](message: js.UndefOr[scala.Nothing], data: Data, allow: js.Array[String]): BoomError[Data] = js.native
        def methodNotAllowed[Data](message: js.UndefOr[scala.Nothing], data: js.UndefOr[scala.Nothing], allow: String): BoomError[Data] = js.native
        def methodNotAllowed[Data](message: js.UndefOr[scala.Nothing], data: js.UndefOr[scala.Nothing], allow: js.Array[String]): BoomError[Data] = js.native
        def methodNotAllowed[Data](message: String): BoomError[Data] = js.native
        def methodNotAllowed[Data](message: String, data: Data): BoomError[Data] = js.native
        def methodNotAllowed[Data](message: String, data: Data, allow: String): BoomError[Data] = js.native
        def methodNotAllowed[Data](message: String, data: Data, allow: js.Array[String]): BoomError[Data] = js.native
        def methodNotAllowed[Data](message: String, data: js.UndefOr[scala.Nothing], allow: String): BoomError[Data] = js.native
        def methodNotAllowed[Data](message: String, data: js.UndefOr[scala.Nothing], allow: js.Array[String]): BoomError[Data] = js.native
        
        /**
          * Respond a 406 Not Acceptable error
          * @param message optional message.
          * @param data optional additional error data.
          * @see {@link https://github.com/hapijs/boom#boomnotacceptablemessage-data}
          */
        def notAcceptable[Data](): BoomError[Data] = js.native
        def notAcceptable[Data](message: js.UndefOr[scala.Nothing], data: Data): BoomError[Data] = js.native
        def notAcceptable[Data](message: String): BoomError[Data] = js.native
        def notAcceptable[Data](message: String, data: Data): BoomError[Data] = js.native
        
        /**
          * Respond a 404 Not Found error
          * @param message optional message.
          * @param data optional additional error data.
          * @see {@link https://github.com/hapijs/boom#boomnotfoundmessage-data}
          */
        def notFound[Data](): BoomError[Data] = js.native
        def notFound[Data](message: js.UndefOr[scala.Nothing], data: Data): BoomError[Data] = js.native
        def notFound[Data](message: String): BoomError[Data] = js.native
        def notFound[Data](message: String, data: Data): BoomError[Data] = js.native
        
        /**
          * Respond a 501 Not Implemented error with your error message to the user
          * @param message optional message.
          * @param data optional additional error data.
          * @see {@link https://github.com/hapijs/boom#boomnotimplementedmessage-data}
          */
        def notImplemented[Data](): BoomError[Data] = js.native
        def notImplemented[Data](message: js.UndefOr[scala.Nothing], data: Data): BoomError[Data] = js.native
        def notImplemented[Data](message: String): BoomError[Data] = js.native
        def notImplemented[Data](message: String, data: Data): BoomError[Data] = js.native
        
        /**
          * Respond a 402 Payment Required error
          * @param message optional message.
          * @param data optional additional error data.
          * @see {@link https://github.com/hapijs/boom#boompaymentrequiredmessage-data}
          */
        def paymentRequired[Data](): BoomError[Data] = js.native
        def paymentRequired[Data](message: js.UndefOr[scala.Nothing], data: Data): BoomError[Data] = js.native
        def paymentRequired[Data](message: String): BoomError[Data] = js.native
        def paymentRequired[Data](message: String, data: Data): BoomError[Data] = js.native
        
        /**
          * Respond a 412 Precondition Failed error
          * @param message optional message.
          * @param data optional additional error data.
          * @see {@link https://github.com/hapijs/boom#boompreconditionfailedmessage-data}
          */
        def preconditionFailed[Data](): BoomError[Data] = js.native
        def preconditionFailed[Data](message: js.UndefOr[scala.Nothing], data: Data): BoomError[Data] = js.native
        def preconditionFailed[Data](message: String): BoomError[Data] = js.native
        def preconditionFailed[Data](message: String, data: Data): BoomError[Data] = js.native
        
        /**
          * Respond a 428 Precondition Required error
          * @param message optional message.
          * @param data optional additional error data.
          * @see {@link https://github.com/hapijs/boom#boompreconditionrequiredmessage-data}
          */
        def preconditionRequired[Data](): BoomError[Data] = js.native
        def preconditionRequired[Data](message: js.UndefOr[scala.Nothing], data: Data): BoomError[Data] = js.native
        def preconditionRequired[Data](message: String): BoomError[Data] = js.native
        def preconditionRequired[Data](message: String, data: Data): BoomError[Data] = js.native
        
        /**
          * Respond a 407 Proxy Authentication Required error
          * @param message optional message.
          * @param data optional additional error data.
          * @see {@link https://github.com/hapijs/boom#boomproxyauthrequiredmessage-data}
          */
        def proxyAuthRequired[Data](): BoomError[Data] = js.native
        def proxyAuthRequired[Data](message: js.UndefOr[scala.Nothing], data: Data): BoomError[Data] = js.native
        def proxyAuthRequired[Data](message: String): BoomError[Data] = js.native
        def proxyAuthRequired[Data](message: String, data: Data): BoomError[Data] = js.native
        
        /**
          * Respond a 416 Requested Range Not Satisfiable error
          * @param message optional message.
          * @param data optional additional error data.
          * @see {@link https://github.com/hapijs/boom#boomrangenotsatisfiablemessage-data}
          */
        def rangeNotSatisfiable[Data](): BoomError[Data] = js.native
        def rangeNotSatisfiable[Data](message: js.UndefOr[scala.Nothing], data: Data): BoomError[Data] = js.native
        def rangeNotSatisfiable[Data](message: String): BoomError[Data] = js.native
        def rangeNotSatisfiable[Data](message: String, data: Data): BoomError[Data] = js.native
        
        /**
          * Respond a 410 Gone error
          * @param message optional message.
          * @param data optional additional error data.
          * @see {@link https://github.com/hapijs/boom#boomresourcegonemessage-data}
          */
        def resourceGone[Data](): BoomError[Data] = js.native
        def resourceGone[Data](message: js.UndefOr[scala.Nothing], data: Data): BoomError[Data] = js.native
        def resourceGone[Data](message: String): BoomError[Data] = js.native
        def resourceGone[Data](message: String, data: Data): BoomError[Data] = js.native
        
        /**
          * Respond a 503 Service Unavailable error with your error message to the user
          * @param message optional message.
          * @param data optional additional error data.
          * @see {@link https://github.com/hapijs/boom#boomserverunavailablemessage-data}
          */
        def serverUnavailable[Data](): BoomError[Data] = js.native
        def serverUnavailable[Data](message: js.UndefOr[scala.Nothing], data: Data): BoomError[Data] = js.native
        def serverUnavailable[Data](message: String): BoomError[Data] = js.native
        def serverUnavailable[Data](message: String, data: Data): BoomError[Data] = js.native
        
        /**
          * Respond a 418 I'm a Teapot error
          * @param message optional message.
          * @param data optional additional error data.
          * @see {@link https://github.com/hapijs/boom#boomteapotmessage-data}
          */
        def teapot[Data](): BoomError[Data] = js.native
        def teapot[Data](message: js.UndefOr[scala.Nothing], data: Data): BoomError[Data] = js.native
        def teapot[Data](message: String): BoomError[Data] = js.native
        def teapot[Data](message: String, data: Data): BoomError[Data] = js.native
        
        /**
          * Respond a 429 Too Many Requests error
          * @param message optional message.
          * @param data optional additional error data.
          * @see {@link https://github.com/hapijs/boom#boomtoomanyrequestsmessage-data}
          */
        def tooManyRequests[Data](): BoomError[Data] = js.native
        def tooManyRequests[Data](message: js.UndefOr[scala.Nothing], data: Data): BoomError[Data] = js.native
        def tooManyRequests[Data](message: String): BoomError[Data] = js.native
        def tooManyRequests[Data](message: String, data: Data): BoomError[Data] = js.native
        
        /**
          * Respond a 401 Unauthorized error
          * @param message optional message.
          * @param scheme can be one of the following:
          *      * an authentication scheme name
          *      * an array of string values. These values will be separated by ', ' and set to the 'WWW-Authenticate' header.
          * @param attributes an object of values to use while setting the 'WWW-Authenticate' header.
          * This value is only used when scheme is a string, otherwise it is ignored.
          * Every key/value pair will be included in the 'WWW-Authenticate' in the format of
          * 'key="value"' as well as in the response payload under the attributes key.
          * Alternatively value can be a string which is use to set the value of the scheme,
          * for example setting the token value for negotiate header.
          * If string is used message parameter must be null.
          * null and undefined will be replaced with an empty string. If attributes is set,
          * message will be used as the 'error' segment of the 'WWW-Authenticate' header.
          * If message is unset, the 'error' segment of the header will not be present and isMissing will be true on the error object.
          * @see {@link https://github.com/hapijs/boom#boomunauthorizedmessage-scheme-attributes}
          */
        def unauthorized(): BoomError[Null] = js.native
        def unauthorized(message: js.UndefOr[scala.Nothing], scheme: js.UndefOr[scala.Nothing], attributes: String): BoomError[Null] = js.native
        def unauthorized(
          message: js.UndefOr[scala.Nothing],
          scheme: js.UndefOr[scala.Nothing],
          attributes: StringDictionary[String]
        ): BoomError[Null] = js.native
        def unauthorized(message: js.UndefOr[scala.Nothing], scheme: String): BoomError[Null] = js.native
        def unauthorized(message: js.UndefOr[scala.Nothing], scheme: String, attributes: String): BoomError[Null] = js.native
        def unauthorized(message: js.UndefOr[scala.Nothing], scheme: String, attributes: StringDictionary[String]): BoomError[Null] = js.native
        def unauthorized(message: js.UndefOr[scala.Nothing], scheme: js.Array[String]): BoomError[Null] = js.native
        def unauthorized(message: String): BoomError[Null] = js.native
        def unauthorized(message: String, scheme: js.UndefOr[scala.Nothing], attributes: StringDictionary[String]): BoomError[Null] = js.native
        def unauthorized(message: String, scheme: String): BoomError[Null] = js.native
        def unauthorized(message: String, scheme: String, attributes: StringDictionary[String]): BoomError[Null] = js.native
        def unauthorized(message: String, scheme: js.Array[String]): BoomError[Null] = js.native
        def unauthorized(message: Null, scheme: js.UndefOr[scala.Nothing], attributes: String): BoomError[Null] = js.native
        def unauthorized(message: Null, scheme: js.UndefOr[scala.Nothing], attributes: StringDictionary[String]): BoomError[Null] = js.native
        def unauthorized(message: Null, scheme: String): BoomError[Null] = js.native
        def unauthorized(message: Null, scheme: String, attributes: String): BoomError[Null] = js.native
        def unauthorized(message: Null, scheme: String, attributes: StringDictionary[String]): BoomError[Null] = js.native
        
        /**
          * Respond a 415 Unsupported Media Type error
          * @param message optional message.
          * @param data optional additional error data.
          * @see {@link https://github.com/hapijs/boom#boomunsupportedmediatypemessage-data}
          */
        def unsupportedMediaType[Data](): BoomError[Data] = js.native
        def unsupportedMediaType[Data](message: js.UndefOr[scala.Nothing], data: Data): BoomError[Data] = js.native
        def unsupportedMediaType[Data](message: String): BoomError[Data] = js.native
        def unsupportedMediaType[Data](message: String, data: Data): BoomError[Data] = js.native
        
        /**
          * Respond a 414 Request-URI Too Large error
          * @param message optional message.
          * @param data optional additional error data.
          * @see {@link https://github.com/hapijs/boom#boomuritoolongmessage-data}
          */
        def uriTooLong[Data](): BoomError[Data] = js.native
        def uriTooLong[Data](message: js.UndefOr[scala.Nothing], data: Data): BoomError[Data] = js.native
        def uriTooLong[Data](message: String): BoomError[Data] = js.native
        def uriTooLong[Data](message: String, data: Data): BoomError[Data] = js.native
        
        // Add boom's properties in here
        def wrap(error: Error): BoomError[Null] = js.native
        def wrap(error: Error, statusCode: js.UndefOr[scala.Nothing], message: String): BoomError[Null] = js.native
        def wrap(error: Error, statusCode: Double): BoomError[Null] = js.native
        def wrap(error: Error, statusCode: Double, message: String): BoomError[Null] = js.native
      }
      
      @js.native
      trait BoomError[Data] extends StObject {
        
        var data: Data = js.native
        
        var isBoom: Boolean = js.native
        
        var isServer: Boolean = js.native
        
        var message: String = js.native
        
        var output: Output = js.native
        
        def reformat(): Unit = js.native
      }
      object BoomError {
        
        @scala.inline
        def apply[Data](
          data: Data,
          isBoom: Boolean,
          isServer: Boolean,
          message: String,
          output: Output,
          reformat: () => Unit
        ): BoomError[Data] = {
          val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], isBoom = isBoom.asInstanceOf[js.Any], isServer = isServer.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], reformat = js.Any.fromFunction0(reformat))
          __obj.asInstanceOf[BoomError[Data]]
        }
        
        @scala.inline
        implicit class BoomErrorMutableBuilder[Self <: BoomError[_], Data] (val x: Self with BoomError[Data]) extends AnyVal {
          
          @scala.inline
          def setData(value: Data): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setIsBoom(value: Boolean): Self = StObject.set(x, "isBoom", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setIsServer(value: Boolean): Self = StObject.set(x, "isServer", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setOutput(value: Output): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setReformat(value: () => Unit): Self = StObject.set(x, "reformat", js.Any.fromFunction0(value))
        }
      }
      
      @js.native
      trait Output extends StObject {
        
        /**
          * headers - an object containing any HTTP headers where each key is a header name and
          * value is the header content. (Limited value type to string
          * https://github.com/hapijs/boom/issues/151 )
          */
        var headers: StringDictionary[String] = js.native
        
        /**
          * payload - the formatted object used as the response payload (stringified).
          * Can be directly manipulated but any changes will be lost if reformat() is called.
          * Any content allowed and by default includes the following content:
          */
        var payload: Payload = js.native
        
        /** statusCode - the HTTP status code (typically 4xx or 5xx). */
        var statusCode: Double = js.native
      }
      object Output {
        
        @scala.inline
        def apply(headers: StringDictionary[String], payload: Payload, statusCode: Double): Output = {
          val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
          __obj.asInstanceOf[Output]
        }
        
        @scala.inline
        implicit class OutputMutableBuilder[Self <: Output] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setPayload(value: Payload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
        }
      }
      
      @js.native
      trait Payload extends StObject {
        
        /**
          * "Every key/value pair will be included ... in the response payload under the attributes key."
          * [see docs](https://github.com/hapijs/boom#boomunauthorizedmessage-scheme-attributes)
          */
        var attributes: js.UndefOr[js.Any] = js.native
        
        /** error - the HTTP status message (e.g. 'Bad Request', 'Internal Server Error') derived from statusCode. */
        var error: String = js.native
        
        /** message - the error message derived from error.message. */
        var message: String = js.native
        
        /** statusCode - the HTTP status code, derived from error.output.statusCode. */
        var statusCode: Double = js.native
      }
      object Payload {
        
        @scala.inline
        def apply(error: String, message: String, statusCode: Double): Payload = {
          val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
          __obj.asInstanceOf[Payload]
        }
        
        @scala.inline
        implicit class PayloadMutableBuilder[Self <: Payload] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setAttributes(value: js.Any): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
          
          @scala.inline
          def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
        }
      }
      
      @js.native
      trait Response extends StObject {
        
        var boom: Boom = js.native
      }
      object Response {
        
        @scala.inline
        def apply(boom: Boom): Response = {
          val __obj = js.Dynamic.literal(boom = boom.asInstanceOf[js.Any])
          __obj.asInstanceOf[Response]
        }
        
        @scala.inline
        implicit class ResponseMutableBuilder[Self <: Response] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setBoom(value: Boom): Self = StObject.set(x, "boom", value.asInstanceOf[js.Any])
        }
      }
    }
  }
}
