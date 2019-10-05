package typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParentList extends js.Object {
  var etag: js.UndefOr[String] = js.undefined
  var items: js.UndefOr[js.Array[ParentReference]] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var selfLink: js.UndefOr[String] = js.undefined
}

object ParentList {
  @scala.inline
  def apply(
    etag: String = null,
    items: js.Array[ParentReference] = null,
    kind: String = null,
    selfLink: String = null
  ): ParentList = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink)
    __obj.asInstanceOf[ParentList]
  }
}

