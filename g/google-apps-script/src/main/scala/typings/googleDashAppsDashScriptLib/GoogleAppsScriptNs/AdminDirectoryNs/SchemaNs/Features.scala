package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Features extends js.Object {
  var etag: js.UndefOr[java.lang.String] = js.undefined
  var features: js.UndefOr[js.Array[Feature]] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

object Features {
  @scala.inline
  def apply(
    etag: java.lang.String = null,
    features: js.Array[Feature] = null,
    kind: java.lang.String = null,
    nextPageToken: java.lang.String = null
  ): Features = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (features != null) __obj.updateDynamic("features")(features)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[Features]
  }
}

