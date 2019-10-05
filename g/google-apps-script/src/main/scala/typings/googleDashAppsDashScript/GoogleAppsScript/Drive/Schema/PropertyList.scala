package typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropertyList extends js.Object {
  var etag: js.UndefOr[String] = js.undefined
  var items: js.UndefOr[js.Array[Property]] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var selfLink: js.UndefOr[String] = js.undefined
}

object PropertyList {
  @scala.inline
  def apply(
    etag: String = null,
    items: js.Array[Property] = null,
    kind: String = null,
    selfLink: String = null
  ): PropertyList = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink)
    __obj.asInstanceOf[PropertyList]
  }
}

