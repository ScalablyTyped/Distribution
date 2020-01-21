package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRendererFormattedStrings extends js.Object {
  var rendererFormattedStrings: js.UndefOr[AnonAuditGroupExpandTooltip] = js.native
}

object AnonRendererFormattedStrings {
  @scala.inline
  def apply(rendererFormattedStrings: AnonAuditGroupExpandTooltip = null): AnonRendererFormattedStrings = {
    val __obj = js.Dynamic.literal()
    if (rendererFormattedStrings != null) __obj.updateDynamic("rendererFormattedStrings")(rendererFormattedStrings.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRendererFormattedStrings]
  }
}

