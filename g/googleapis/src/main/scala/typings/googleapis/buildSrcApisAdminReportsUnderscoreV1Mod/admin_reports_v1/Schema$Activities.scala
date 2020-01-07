package typings.googleapis.buildSrcApisAdminReportsUnderscoreV1Mod.admin_reports_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for a collection of activites.
  */
@js.native
trait Schema$Activities extends js.Object {
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * Each record in read response.
    */
  var items: js.UndefOr[js.Array[Schema$Activity]] = js.native
  /**
    * Kind of list response this is.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Token for retrieving the next page
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$Activities {
  @scala.inline
  def apply(
    etag: String = null,
    items: js.Array[Schema$Activity] = null,
    kind: String = null,
    nextPageToken: String = null
  ): Schema$Activities = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Activities]
  }
}

