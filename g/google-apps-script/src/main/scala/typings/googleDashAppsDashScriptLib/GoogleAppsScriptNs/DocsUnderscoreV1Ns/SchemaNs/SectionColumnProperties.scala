package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocsUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SectionColumnProperties extends js.Object {
  var paddingEnd: js.UndefOr[Dimension] = js.undefined
  var width: js.UndefOr[Dimension] = js.undefined
}

object SectionColumnProperties {
  @scala.inline
  def apply(paddingEnd: Dimension = null, width: Dimension = null): SectionColumnProperties = {
    val __obj = js.Dynamic.literal()
    if (paddingEnd != null) __obj.updateDynamic("paddingEnd")(paddingEnd)
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[SectionColumnProperties]
  }
}

