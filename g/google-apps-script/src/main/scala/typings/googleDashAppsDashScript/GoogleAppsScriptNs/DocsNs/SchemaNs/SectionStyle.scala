package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DocsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SectionStyle extends js.Object {
  var columnProperties: js.UndefOr[js.Array[SectionColumnProperties]] = js.undefined
  var columnSeparatorStyle: js.UndefOr[String] = js.undefined
  var contentDirection: js.UndefOr[String] = js.undefined
}

object SectionStyle {
  @scala.inline
  def apply(
    columnProperties: js.Array[SectionColumnProperties] = null,
    columnSeparatorStyle: String = null,
    contentDirection: String = null
  ): SectionStyle = {
    val __obj = js.Dynamic.literal()
    if (columnProperties != null) __obj.updateDynamic("columnProperties")(columnProperties)
    if (columnSeparatorStyle != null) __obj.updateDynamic("columnSeparatorStyle")(columnSeparatorStyle)
    if (contentDirection != null) __obj.updateDynamic("contentDirection")(contentDirection)
    __obj.asInstanceOf[SectionStyle]
  }
}

