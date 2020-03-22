package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadURLOptions extends js.Object {
  /**
    * Base url (with trailing path separator) for files to be loaded by the data url.
    * This is needed only if the specified `url` is a data url and needs to load other
    * files.
    */
  var baseURLForDataURL: js.UndefOr[String] = js.undefined
  /**
    * Extra headers separated by "\n"
    */
  var extraHeaders: js.UndefOr[String] = js.undefined
  /**
    * An HTTP Referrer url.
    */
  var httpReferrer: js.UndefOr[String | Referrer] = js.undefined
  var postData: js.UndefOr[js.Array[UploadBlob | UploadFile | UploadRawData]] = js.undefined
  /**
    * A user agent originating the request.
    */
  var userAgent: js.UndefOr[String] = js.undefined
}

object LoadURLOptions {
  @scala.inline
  def apply(
    baseURLForDataURL: String = null,
    extraHeaders: String = null,
    httpReferrer: String | Referrer = null,
    postData: js.Array[UploadBlob | UploadFile | UploadRawData] = null,
    userAgent: String = null
  ): LoadURLOptions = {
    val __obj = js.Dynamic.literal()
    if (baseURLForDataURL != null) __obj.updateDynamic("baseURLForDataURL")(baseURLForDataURL.asInstanceOf[js.Any])
    if (extraHeaders != null) __obj.updateDynamic("extraHeaders")(extraHeaders.asInstanceOf[js.Any])
    if (httpReferrer != null) __obj.updateDynamic("httpReferrer")(httpReferrer.asInstanceOf[js.Any])
    if (postData != null) __obj.updateDynamic("postData")(postData.asInstanceOf[js.Any])
    if (userAgent != null) __obj.updateDynamic("userAgent")(userAgent.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadURLOptions]
  }
}

