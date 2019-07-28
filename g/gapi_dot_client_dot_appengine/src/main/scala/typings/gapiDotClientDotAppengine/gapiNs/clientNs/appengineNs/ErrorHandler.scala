package typings.gapiDotClientDotAppengine.gapiNs.clientNs.appengineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorHandler extends js.Object {
  /** Error condition this handler applies to. */
  var errorCode: js.UndefOr[String] = js.undefined
  /** MIME type of file. Defaults to text/html. */
  var mimeType: js.UndefOr[String] = js.undefined
  /** Static file content to be served for this error. */
  var staticFile: js.UndefOr[String] = js.undefined
}

object ErrorHandler {
  @scala.inline
  def apply(errorCode: String = null, mimeType: String = null, staticFile: String = null): ErrorHandler = {
    val __obj = js.Dynamic.literal()
    if (errorCode != null) __obj.updateDynamic("errorCode")(errorCode)
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType)
    if (staticFile != null) __obj.updateDynamic("staticFile")(staticFile)
    __obj.asInstanceOf[ErrorHandler]
  }
}

