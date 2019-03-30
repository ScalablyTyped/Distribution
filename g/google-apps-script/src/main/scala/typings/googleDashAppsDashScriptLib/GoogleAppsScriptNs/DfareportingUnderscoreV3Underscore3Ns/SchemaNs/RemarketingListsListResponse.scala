package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingUnderscoreV3Underscore3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemarketingListsListResponse extends js.Object {
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  var remarketingLists: js.UndefOr[js.Array[RemarketingList]] = js.undefined
}

object RemarketingListsListResponse {
  @scala.inline
  def apply(
    kind: java.lang.String = null,
    nextPageToken: java.lang.String = null,
    remarketingLists: js.Array[RemarketingList] = null
  ): RemarketingListsListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (remarketingLists != null) __obj.updateDynamic("remarketingLists")(remarketingLists)
    __obj.asInstanceOf[RemarketingListsListResponse]
  }
}

