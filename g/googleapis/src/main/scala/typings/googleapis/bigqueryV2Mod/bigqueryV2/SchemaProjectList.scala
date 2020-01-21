package typings.googleapis.bigqueryV2Mod.bigqueryV2

import typings.googleapis.AnonFriendlyName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaProjectList extends js.Object {
  /**
    * A hash of the page of results
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The type of list.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * A token to request the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * Projects to which you have at least READ access.
    */
  var projects: js.UndefOr[js.Array[AnonFriendlyName]] = js.native
  /**
    * The total number of projects in the list.
    */
  var totalItems: js.UndefOr[Double] = js.native
}

object SchemaProjectList {
  @scala.inline
  def apply(
    etag: String = null,
    kind: String = null,
    nextPageToken: String = null,
    projects: js.Array[AnonFriendlyName] = null,
    totalItems: Int | Double = null
  ): SchemaProjectList = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (projects != null) __obj.updateDynamic("projects")(projects.asInstanceOf[js.Any])
    if (totalItems != null) __obj.updateDynamic("totalItems")(totalItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaProjectList]
  }
}

