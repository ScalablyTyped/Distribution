package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeList extends js.Object {
  var etag: js.UndefOr[java.lang.String] = js.undefined
  var items: js.UndefOr[js.Array[Change]] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var largestChangeId: js.UndefOr[java.lang.String] = js.undefined
  var newStartPageToken: js.UndefOr[java.lang.String] = js.undefined
  var nextLink: js.UndefOr[java.lang.String] = js.undefined
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
}

object ChangeList {
  @scala.inline
  def apply(
    etag: java.lang.String = null,
    items: js.Array[Change] = null,
    kind: java.lang.String = null,
    largestChangeId: java.lang.String = null,
    newStartPageToken: java.lang.String = null,
    nextLink: java.lang.String = null,
    nextPageToken: java.lang.String = null,
    selfLink: java.lang.String = null
  ): ChangeList = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (largestChangeId != null) __obj.updateDynamic("largestChangeId")(largestChangeId)
    if (newStartPageToken != null) __obj.updateDynamic("newStartPageToken")(newStartPageToken)
    if (nextLink != null) __obj.updateDynamic("nextLink")(nextLink)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink)
    __obj.asInstanceOf[ChangeList]
  }
}

