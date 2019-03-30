package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocsUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabStop extends js.Object {
  var alignment: js.UndefOr[java.lang.String] = js.undefined
  var offset: js.UndefOr[Dimension] = js.undefined
}

object TabStop {
  @scala.inline
  def apply(alignment: java.lang.String = null, offset: Dimension = null): TabStop = {
    val __obj = js.Dynamic.literal()
    if (alignment != null) __obj.updateDynamic("alignment")(alignment)
    if (offset != null) __obj.updateDynamic("offset")(offset)
    __obj.asInstanceOf[TabStop]
  }
}

