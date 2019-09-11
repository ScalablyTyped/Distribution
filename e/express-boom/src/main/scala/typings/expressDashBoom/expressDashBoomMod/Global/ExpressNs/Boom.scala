package typings.expressDashBoom.expressDashBoomMod.Global.ExpressNs

import org.scalablytyped.runtime.StringDictionary
import typings.expressDashBoom.Anon_Message
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Boom extends js.Object {
  /**
    * Respond a 422 Unprocessable Entity error
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boombaddatamessage-data}
    */
  def badData[Data](): BoomError[Data] = js.native
  def badData[Data](message: String): BoomError[Data] = js.native
  def badData[Data](message: String, data: Data): BoomError[Data] = js.native
  /**
    * Respond a 502 Bad Gateway error with your error message to the user
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boombadgatewaymessage-data}
    */
  def badGateway[Data](): BoomError[Data] = js.native
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
  def badRequest[Data](message: String): BoomError[Data] = js.native
  def badRequest[Data](message: String, data: Data): BoomError[Data] = js.native
  /**
    * Decorates an error with the boom properties
    * @param error the error object to wrap. If error is already a boom object, it defaults to overriding the object with the new status code and message.
    * @param options optional additional options
    * @see {@link https://github.com/hapijs/boom#boomifyerror-options}
    */
  def boomify(error: Error): BoomError[Null] = js.native
  def boomify(error: Error, options: Anon_Message): BoomError[Null] = js.native
  /**
    * Respond a 408 Request Time-out error
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boomclienttimeoutmessage-data}
    */
  def clientTimeout[Data](): BoomError[Data] = js.native
  def clientTimeout[Data](message: String): BoomError[Data] = js.native
  def clientTimeout[Data](message: String, data: Data): BoomError[Data] = js.native
  /**
    * Respond a 409 Conflict error
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boomconflictmessage-data}
    */
  def conflict[Data](): BoomError[Data] = js.native
  def conflict[Data](message: String): BoomError[Data] = js.native
  def conflict[Data](message: String, data: Data): BoomError[Data] = js.native
  def create[Data](statusCode: Double): BoomError[Data] = js.native
  def create[Data](statusCode: Double, message: String): BoomError[Data] = js.native
  def create[Data](statusCode: Double, message: String, data: Data): BoomError[Data] = js.native
  /**
    * Respond a 413 Request Entity Too Large error
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boomentitytoolargemessage-data}
    */
  def entityTooLarge[Data](): BoomError[Data] = js.native
  def entityTooLarge[Data](message: String): BoomError[Data] = js.native
  def entityTooLarge[Data](message: String, data: Data): BoomError[Data] = js.native
  /**
    * Respond a 417 Expectation Failed error
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boomexpectationfailedmessage-data}
    */
  def expectationFailed[Data](): BoomError[Data] = js.native
  def expectationFailed[Data](message: String): BoomError[Data] = js.native
  def expectationFailed[Data](message: String, data: Data): BoomError[Data] = js.native
  /**
    * Respond a 424 Failed Dependency error
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boomfaileddependencymessage-data}
    */
  def failedDependency[Data](): BoomError[Data] = js.native
  def failedDependency[Data](message: String): BoomError[Data] = js.native
  def failedDependency[Data](message: String, data: Data): BoomError[Data] = js.native
  /**
    * Respond a 403 Forbidden error
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boomforbiddenmessage-data}
    */
  def forbidden[Data](): BoomError[Data] = js.native
  def forbidden[Data](message: String): BoomError[Data] = js.native
  def forbidden[Data](message: String, data: Data): BoomError[Data] = js.native
  /**
    * Respond a 504 Gateway Time-out error with your error message to the user
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boomgatewaytimeoutmessage-data}
    */
  def gatewayTimeout[Data](): BoomError[Data] = js.native
  def gatewayTimeout[Data](message: String): BoomError[Data] = js.native
  def gatewayTimeout[Data](message: String, data: Data): BoomError[Data] = js.native
  /**
    * Respond a 451 Unavailable For Legal Reasons error
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boomillegalmessage-data}
    */
  def illegal[Data](): BoomError[Data] = js.native
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
  def internal[Data](message: String): BoomError[Data] = js.native
  def internal[Data](message: String, data: Data): BoomError[Data] = js.native
  /**
    * Respond a 411 Length Required error
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boomlengthrequiredmessage-data}
    */
  def lengthRequired[Data](): BoomError[Data] = js.native
  def lengthRequired[Data](message: String): BoomError[Data] = js.native
  def lengthRequired[Data](message: String, data: Data): BoomError[Data] = js.native
  /**
    * Respond a 423 Locked error
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boomlockedmessage-data}
    */
  def locked[Data](): BoomError[Data] = js.native
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
  def methodNotAllowed[Data](message: String): BoomError[Data] = js.native
  def methodNotAllowed[Data](message: String, data: Data): BoomError[Data] = js.native
  def methodNotAllowed[Data](message: String, data: Data, allow: String): BoomError[Data] = js.native
  def methodNotAllowed[Data](message: String, data: Data, allow: js.Array[String]): BoomError[Data] = js.native
  /**
    * Respond a 406 Not Acceptable error
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boomnotacceptablemessage-data}
    */
  def notAcceptable[Data](): BoomError[Data] = js.native
  def notAcceptable[Data](message: String): BoomError[Data] = js.native
  def notAcceptable[Data](message: String, data: Data): BoomError[Data] = js.native
  /**
    * Respond a 404 Not Found error
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boomnotfoundmessage-data}
    */
  def notFound[Data](): BoomError[Data] = js.native
  def notFound[Data](message: String): BoomError[Data] = js.native
  def notFound[Data](message: String, data: Data): BoomError[Data] = js.native
  /**
    * Respond a 501 Not Implemented error with your error message to the user
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boomnotimplementedmessage-data}
    */
  def notImplemented[Data](): BoomError[Data] = js.native
  def notImplemented[Data](message: String): BoomError[Data] = js.native
  def notImplemented[Data](message: String, data: Data): BoomError[Data] = js.native
  /**
    * Respond a 402 Payment Required error
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boompaymentrequiredmessage-data}
    */
  def paymentRequired[Data](): BoomError[Data] = js.native
  def paymentRequired[Data](message: String): BoomError[Data] = js.native
  def paymentRequired[Data](message: String, data: Data): BoomError[Data] = js.native
  /**
    * Respond a 412 Precondition Failed error
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boompreconditionfailedmessage-data}
    */
  def preconditionFailed[Data](): BoomError[Data] = js.native
  def preconditionFailed[Data](message: String): BoomError[Data] = js.native
  def preconditionFailed[Data](message: String, data: Data): BoomError[Data] = js.native
  /**
    * Respond a 428 Precondition Required error
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boompreconditionrequiredmessage-data}
    */
  def preconditionRequired[Data](): BoomError[Data] = js.native
  def preconditionRequired[Data](message: String): BoomError[Data] = js.native
  def preconditionRequired[Data](message: String, data: Data): BoomError[Data] = js.native
  /**
    * Respond a 407 Proxy Authentication Required error
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boomproxyauthrequiredmessage-data}
    */
  def proxyAuthRequired[Data](): BoomError[Data] = js.native
  def proxyAuthRequired[Data](message: String): BoomError[Data] = js.native
  def proxyAuthRequired[Data](message: String, data: Data): BoomError[Data] = js.native
  /**
    * Respond a 416 Requested Range Not Satisfiable error
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boomrangenotsatisfiablemessage-data}
    */
  def rangeNotSatisfiable[Data](): BoomError[Data] = js.native
  def rangeNotSatisfiable[Data](message: String): BoomError[Data] = js.native
  def rangeNotSatisfiable[Data](message: String, data: Data): BoomError[Data] = js.native
  /**
    * Respond a 410 Gone error
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boomresourcegonemessage-data}
    */
  def resourceGone[Data](): BoomError[Data] = js.native
  def resourceGone[Data](message: String): BoomError[Data] = js.native
  def resourceGone[Data](message: String, data: Data): BoomError[Data] = js.native
  /**
    * Respond a 503 Service Unavailable error with your error message to the user
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boomserverunavailablemessage-data}
    */
  def serverUnavailable[Data](): BoomError[Data] = js.native
  def serverUnavailable[Data](message: String): BoomError[Data] = js.native
  def serverUnavailable[Data](message: String, data: Data): BoomError[Data] = js.native
  /**
    * Respond a 418 I'm a Teapot error
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boomteapotmessage-data}
    */
  def teapot[Data](): BoomError[Data] = js.native
  def teapot[Data](message: String): BoomError[Data] = js.native
  def teapot[Data](message: String, data: Data): BoomError[Data] = js.native
  /**
    * Respond a 429 Too Many Requests error
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boomtoomanyrequestsmessage-data}
    */
  def tooManyRequests[Data](): BoomError[Data] = js.native
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
  def unauthorized(message: String): BoomError[Null] = js.native
  def unauthorized(message: String, scheme: String): BoomError[Null] = js.native
  def unauthorized(message: String, scheme: String, attributes: StringDictionary[String]): BoomError[Null] = js.native
  def unauthorized(message: String, scheme: js.Array[String]): BoomError[Null] = js.native
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
  def unsupportedMediaType[Data](message: String): BoomError[Data] = js.native
  def unsupportedMediaType[Data](message: String, data: Data): BoomError[Data] = js.native
  /**
    * Respond a 414 Request-URI Too Large error
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boomuritoolongmessage-data}
    */
  def uriTooLong[Data](): BoomError[Data] = js.native
  def uriTooLong[Data](message: String): BoomError[Data] = js.native
  def uriTooLong[Data](message: String, data: Data): BoomError[Data] = js.native
  // Add boom's properties in here
  def wrap(error: Error): BoomError[Null] = js.native
  def wrap(error: Error, statusCode: Double): BoomError[Null] = js.native
  def wrap(error: Error, statusCode: Double, message: String): BoomError[Null] = js.native
}

