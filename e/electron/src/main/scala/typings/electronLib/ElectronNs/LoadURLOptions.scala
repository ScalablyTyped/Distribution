package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadURLOptions extends js.Object {
  /**
    * Base url (with trailing path separator) for files to be loaded by the data url.
    * This is needed only if the specified url is a data url and needs to load other
    * files.
    */
  var baseURLForDataURL: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Extra headers separated by "\n"
    */
  var extraHeaders: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An HTTP Referrer url.
    */
  var httpReferrer: js.UndefOr[java.lang.String | Referrer] = js.undefined
  var postData: js.UndefOr[js.Array[UploadRawData] | js.Array[UploadFile] | js.Array[UploadBlob]] = js.undefined
  /**
    * A user agent originating the request.
    */
  var userAgent: js.UndefOr[java.lang.String] = js.undefined
}

object LoadURLOptions {
  @scala.inline
  def apply(
    baseURLForDataURL: java.lang.String = null,
    extraHeaders: java.lang.String = null,
    httpReferrer: java.lang.String | Referrer = null,
    postData: js.Array[UploadRawData] | js.Array[UploadFile] | js.Array[UploadBlob] = null,
    userAgent: java.lang.String = null
  ): LoadURLOptions = {
    val __obj = js.Dynamic.literal()
    if (baseURLForDataURL != null) __obj.updateDynamic("baseURLForDataURL")(baseURLForDataURL)
    if (extraHeaders != null) __obj.updateDynamic("extraHeaders")(extraHeaders)
    if (httpReferrer != null) __obj.updateDynamic("httpReferrer")(httpReferrer.asInstanceOf[js.Any])
    if (postData != null) __obj.updateDynamic("postData")(postData.asInstanceOf[js.Any])
    if (userAgent != null) __obj.updateDynamic("userAgent")(userAgent)
    __obj.asInstanceOf[LoadURLOptions]
  }
}

