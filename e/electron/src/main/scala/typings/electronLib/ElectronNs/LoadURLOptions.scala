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

