package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Property extends js.Object {
  var etag: js.UndefOr[java.lang.String] = js.undefined
  var key: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[java.lang.String] = js.undefined
  var visibility: js.UndefOr[java.lang.String] = js.undefined
}

object Property {
  @scala.inline
  def apply(
    etag: java.lang.String = null,
    key: java.lang.String = null,
    kind: java.lang.String = null,
    selfLink: java.lang.String = null,
    value: java.lang.String = null,
    visibility: java.lang.String = null
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

