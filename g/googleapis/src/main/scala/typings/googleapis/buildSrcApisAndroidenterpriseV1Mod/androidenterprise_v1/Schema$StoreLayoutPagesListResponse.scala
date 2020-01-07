package typings.googleapis.buildSrcApisAndroidenterpriseV1Mod.androidenterprise_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The store page resources for the enterprise.
  */
@js.native
trait Schema$StoreLayoutPagesListResponse extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#storeLayoutPagesListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * A store page of an enterprise.
    */
  var page: js.UndefOr[js.Array[Schema$StorePage]] = js.native
}

object Schema$StoreLayoutPagesListResponse {
  @scala.inline
  def apply(kind: String = null, page: js.Array[Schema$StorePage] = null): Schema$StoreLayoutPagesListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$StoreLayoutPagesListResponse]
  }
}

