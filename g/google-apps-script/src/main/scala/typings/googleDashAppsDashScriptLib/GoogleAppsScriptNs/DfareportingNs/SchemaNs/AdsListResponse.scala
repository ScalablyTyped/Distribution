package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdsListResponse extends js.Object {
  var ads: js.UndefOr[js.Array[Ad]] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

object AdsListResponse {
  @scala.inline
  def apply(ads: js.Array[Ad] = null, kind: java.lang.String = null, nextPageToken: java.lang.String = null): AdsListResponse = {
    val __obj = js.Dynamic.literal()
    if (ads != null) __obj.updateDynamic("ads")(ads)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[AdsListResponse]
  }
}

