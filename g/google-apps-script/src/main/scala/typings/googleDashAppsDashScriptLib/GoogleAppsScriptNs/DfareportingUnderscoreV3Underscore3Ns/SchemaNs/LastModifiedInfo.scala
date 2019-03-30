package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingUnderscoreV3Underscore3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LastModifiedInfo extends js.Object {
  var time: js.UndefOr[java.lang.String] = js.undefined
}

object LastModifiedInfo {
  @scala.inline
  def apply(time: java.lang.String = null): LastModifiedInfo = {
    val __obj = js.Dynamic.literal()
    if (time != null) __obj.updateDynamic("time")(time)
    __obj.asInstanceOf[LastModifiedInfo]
  }
}

