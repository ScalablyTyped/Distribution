package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The store page resources for the enterprise.
  */
@js.native
trait SchemaStoreLayoutPagesListResponse extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#storeLayoutPagesListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * A store page of an enterprise.
    */
  var page: js.UndefOr[js.Array[SchemaStorePage]] = js.native
}

object SchemaStoreLayoutPagesListResponse {
  @scala.inline
  def apply(kind: String = null, page: js.Array[SchemaStorePage] = null): SchemaStoreLayoutPagesListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaStoreLayoutPagesListResponse]
  }
}

