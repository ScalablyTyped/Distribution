package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParentList extends js.Object {
  var etag: js.UndefOr[java.lang.String] = js.undefined
  var items: js.UndefOr[js.Array[ParentReference]] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
}

object ParentList {
  @scala.inline
  def apply(
    etag: java.lang.String = null,
    items: js.Array[ParentReference] = null,
    kind: java.lang.String = null,
    selfLink: java.lang.String = null
  ): ParentList = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink)
    __obj.asInstanceOf[ParentList]
  }
}

