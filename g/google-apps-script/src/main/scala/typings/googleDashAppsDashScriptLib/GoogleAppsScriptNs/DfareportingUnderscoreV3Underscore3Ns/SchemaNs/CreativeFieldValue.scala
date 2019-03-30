package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingUnderscoreV3Underscore3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreativeFieldValue extends js.Object {
  var id: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object CreativeFieldValue {
  @scala.inline
  def apply(id: java.lang.String = null, kind: java.lang.String = null, value: java.lang.String = null): CreativeFieldValue = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[CreativeFieldValue]
  }
}

