package typings.googleapis.buildSrcApisAndroidpublisherV2Mod.androidpublisher_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$BundlesListResponse extends js.Object {
  var bundles: js.UndefOr[js.Array[Schema$Bundle]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidpublisher#bundlesListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$BundlesListResponse {
  @scala.inline
  def apply(bundles: js.Array[Schema$Bundle] = null, kind: String = null): Schema$BundlesListResponse = {
    val __obj = js.Dynamic.literal()
    if (bundles != null) __obj.updateDynamic("bundles")(bundles.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$BundlesListResponse]
  }
}

