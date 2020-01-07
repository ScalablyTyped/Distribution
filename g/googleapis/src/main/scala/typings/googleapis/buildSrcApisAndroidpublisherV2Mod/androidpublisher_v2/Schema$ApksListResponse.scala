package typings.googleapis.buildSrcApisAndroidpublisherV2Mod.androidpublisher_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$ApksListResponse extends js.Object {
  var apks: js.UndefOr[js.Array[Schema$Apk]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidpublisher#apksListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$ApksListResponse {
  @scala.inline
  def apply(apks: js.Array[Schema$Apk] = null, kind: String = null): Schema$ApksListResponse = {
    val __obj = js.Dynamic.literal()
    if (apks != null) __obj.updateDynamic("apks")(apks.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ApksListResponse]
  }
}

