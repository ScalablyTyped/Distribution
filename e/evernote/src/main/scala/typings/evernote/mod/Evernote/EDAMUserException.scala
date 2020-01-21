package typings.evernote.mod.Evernote

import typings.evernote.AnonErrorCode
import typings.thrift.mod.Thrift.TException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This exception is thrown by EDAM procedures when a call fails as a result of
  * a problem that a caller may be able to resolve.    For example, if the user
  * attempts to add a note to their account which would exceed their storage
  * quota, this type of exception may be thrown to indicate the source of the
  * error so that they can choose an alternate action.
  *
  * This exception would not be used for internal system errors that do not
  * reflect user actions, but rather reflect a problem within the service that
  * the user cannot resolve.
  *
  * errorCode:    The numeric code indicating the type of error that occurred.
  *     must be one of the values of EDAMErrorCode.
  *
  * parameter:    If the error applied to a particular input parameter, this will
  *     indicate which parameter.
  */
@JSImport("evernote", "Evernote.EDAMUserException")
@js.native
class EDAMUserException () extends TException {
  def this(args: AnonErrorCode) = this()
  var errorCode: EDAMErrorCode = js.native
  var parameter: String = js.native
}

