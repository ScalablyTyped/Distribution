package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChildList extends js.Object {
  var etag: js.UndefOr[java.lang.String] = js.undefined
  var items: js.UndefOr[js.Array[ChildReference]] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var nextLink: js.UndefOr[java.lang.String] = js.undefined
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
}

object ChildList {
  @scala.inline
  def apply(
    etag: java.lang.String = null,
    items: js.Array[ChildReference] = null,
    kind: java.lang.String = null,
    nextLink: java.lang.String = null,
    nextPageToken: java.lang.String = null,
    selfLink: java.lang.String = null
  ): ChildList = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextLink != null) __obj.updateDynamic("nextLink")(nextLink)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink)
    __obj.asInstanceOf[ChildList]
  }
}

