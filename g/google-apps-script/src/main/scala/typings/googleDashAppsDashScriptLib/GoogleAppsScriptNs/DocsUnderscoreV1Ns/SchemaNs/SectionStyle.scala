package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocsUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SectionStyle extends js.Object {
  var columnProperties: js.UndefOr[js.Array[SectionColumnProperties]] = js.undefined
  var columnSeparatorStyle: js.UndefOr[java.lang.String] = js.undefined
  var contentDirection: js.UndefOr[java.lang.String] = js.undefined
}

object SectionStyle {
  @scala.inline
  def apply(
    columnProperties: js.Array[SectionColumnProperties] = null,
    columnSeparatorStyle: java.lang.String = null,
    contentDirection: java.lang.String = null
  ): SectionStyle = {
    val __obj = js.Dynamic.literal()
    if (columnProperties != null) __obj.updateDynamic("columnProperties")(columnProperties)
    if (columnSeparatorStyle != null) __obj.updateDynamic("columnSeparatorStyle")(columnSeparatorStyle)
    if (contentDirection != null) __obj.updateDynamic("contentDirection")(contentDirection)
    __obj.asInstanceOf[SectionStyle]
  }
}

