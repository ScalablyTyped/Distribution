package typings
package gapiDotClientDotDlpLib.gapiNs.clientNs.dlpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePrivacyDlpV2beta1CloudStoragePath extends js.Object {
  /** The url, in the format of `gs://bucket/<path>`. */
  var path: js.UndefOr[java.lang.String] = js.undefined
}

object GooglePrivacyDlpV2beta1CloudStoragePath {
  @scala.inline
  def apply(path: java.lang.String = null): GooglePrivacyDlpV2beta1CloudStoragePath = {
    val __obj = js.Dynamic.literal()
    if (path != null) __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1CloudStoragePath]
  }
}

