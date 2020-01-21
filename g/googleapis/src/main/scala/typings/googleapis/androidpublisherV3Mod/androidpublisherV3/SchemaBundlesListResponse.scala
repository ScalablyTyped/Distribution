package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaBundlesListResponse extends js.Object {
  var bundles: js.UndefOr[js.Array[SchemaBundle]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidpublisher#bundlesListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaBundlesListResponse {
  @scala.inline
  def apply(bundles: js.Array[SchemaBundle] = null, kind: String = null): SchemaBundlesListResponse = {
    val __obj = js.Dynamic.literal()
    if (bundles != null) __obj.updateDynamic("bundles")(bundles.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBundlesListResponse]
  }
}

