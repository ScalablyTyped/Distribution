package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DriveNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Property extends js.Object {
  var etag: js.UndefOr[String] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var selfLink: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String] = js.undefined
  var visibility: js.UndefOr[String] = js.undefined
}

object Property {
  @scala.inline
  def apply(
    etag: String = null,
    key: String = null,
    kind: String = null,
    selfLink: String = null,
    value: String = null,
    visibility: String = null
  ): Property = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (key != null) __obj.updateDynamic("key")(key)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink)
    if (value != null) __obj.updateDynamic("value")(value)
    if (visibility != null) __obj.updateDynamic("visibility")(visibility)
    __obj.asInstanceOf[Property]
  }
}

