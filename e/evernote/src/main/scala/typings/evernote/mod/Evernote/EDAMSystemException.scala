package typings.evernote.mod.Evernote

import typings.evernote.AnonErrorCodeMessage
import typings.thrift.mod.Thrift.TException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This exception is thrown by EDAM procedures when a call fails as a result of
  * a problem in the service that could not be changed through caller action.
  *
  * errorCode:    The numeric code indicating the type of error that occurred.
  *     must be one of the values of EDAMErrorCode.
  *
  * message:    This may contain additional information about the error
  *
  * rateLimitDuration:    Indicates the minimum number of seconds that an application should
  *     expect subsequent API calls for this user to fail. The application should not retry
  *     API requests for the user until at least this many seconds have passed. Present only
  *     when errorCode is RATE_LIMIT_REACHED,
  */
@JSImport("evernote", "Evernote.EDAMSystemException")
@js.native
class EDAMSystemException () extends TException {
  def this(args: AnonErrorCodeMessage) = this()
  var errorCode: EDAMErrorCode = js.native
  var rateLimitDuration: Double = js.native
}

