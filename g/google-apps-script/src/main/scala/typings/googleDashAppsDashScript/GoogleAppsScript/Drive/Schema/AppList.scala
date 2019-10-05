package typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppList extends js.Object {
  var defaultAppIds: js.UndefOr[js.Array[String]] = js.undefined
  var etag: js.UndefOr[String] = js.undefined
  var items: js.UndefOr[js.Array[App]] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var selfLink: js.UndefOr[String] = js.undefined
}

object AppList {
  @scala.inline
  def apply(
    defaultAppIds: js.Array[String] = null,
    etag: String = null,
    items: js.Array[App] = null,
    kind: String = null,
    selfLink: String = null
  ): AppList = {
    val __obj = js.Dynamic.literal()
    if (defaultAppIds != null) __obj.updateDynamic("defaultAppIds")(defaultAppIds)
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink)
    __obj.asInstanceOf[AppList]
  }
}

