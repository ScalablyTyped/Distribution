package typings
package gapiDotClientDotAndroidpublisherLib.gapiNs.clientNs.androidpublisherNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApksListResponse extends js.Object {
  var apks: js.UndefOr[js.Array[Apk]] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "androidpublisher#apksListResponse". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

object ApksListResponse {
  @scala.inline
  def apply(apks: js.Array[Apk] = null, kind: java.lang.String = null): ApksListResponse = {
    val __obj = js.Dynamic.literal()
    if (apks != null) __obj.updateDynamic("apks")(apks)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[ApksListResponse]
  }
}

