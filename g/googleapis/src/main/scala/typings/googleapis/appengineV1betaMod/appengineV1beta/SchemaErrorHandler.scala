package typings.googleapis.appengineV1betaMod.appengineV1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Custom static error page to be served when an error occurs.
  */
@js.native
trait SchemaErrorHandler extends js.Object {
  /**
    * Error condition this handler applies to.
    */
  var errorCode: js.UndefOr[String] = js.native
  /**
    * MIME type of file. Defaults to text/html.
    */
  var mimeType: js.UndefOr[String] = js.native
  /**
    * Static file content to be served for this error.
    */
  var staticFile: js.UndefOr[String] = js.native
}

object SchemaErrorHandler {
  @scala.inline
  def apply(errorCode: String = null, mimeType: String = null, staticFile: String = null): SchemaErrorHandler = {
    val __obj = js.Dynamic.literal()
    if (errorCode != null) __obj.updateDynamic("errorCode")(errorCode.asInstanceOf[js.Any])
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType.asInstanceOf[js.Any])
    if (staticFile != null) __obj.updateDynamic("staticFile")(staticFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaErrorHandler]
  }
}

