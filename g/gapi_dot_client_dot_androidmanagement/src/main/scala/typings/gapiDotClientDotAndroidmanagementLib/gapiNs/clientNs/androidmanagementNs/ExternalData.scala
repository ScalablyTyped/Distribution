package typings
package gapiDotClientDotAndroidmanagementLib.gapiNs.clientNs.androidmanagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExternalData extends js.Object {
  /** The base-64 encoded SHA-256 hash of the content hosted at url. If the content does not match this hash, Android Device Policy will not use the data. */
  var sha256Hash: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The absolute URL to the data, which must use either the http or https scheme. Android Device Policy does not provide any credentials in the GET
    * request, so the URL must be publicly accessible. Including a long, random component in the URL may be used to prevent attackers from discovering the
    * URL.
    */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object ExternalData {
  @scala.inline
  def apply(sha256Hash: java.lang.String = null, url: java.lang.String = null): ExternalData = {
    val __obj = js.Dynamic.literal()
    if (sha256Hash != null) __obj.updateDynamic("sha256Hash")(sha256Hash)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[ExternalData]
  }
}

