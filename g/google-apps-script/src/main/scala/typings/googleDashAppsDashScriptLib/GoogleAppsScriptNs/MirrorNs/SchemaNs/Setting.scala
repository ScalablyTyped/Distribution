package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Setting extends js.Object {
  var id: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object Setting {
  @scala.inline
  def apply(id: java.lang.String = null, kind: java.lang.String = null, value: java.lang.String = null): Setting = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Setting]
  }
}

