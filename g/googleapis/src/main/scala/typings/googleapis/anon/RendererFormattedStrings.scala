package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RendererFormattedStrings extends js.Object {
  var rendererFormattedStrings: js.UndefOr[AuditGroupExpandTooltip] = js.native
}

object RendererFormattedStrings {
  @scala.inline
  def apply(rendererFormattedStrings: AuditGroupExpandTooltip = null): RendererFormattedStrings = {
    val __obj = js.Dynamic.literal()
    if (rendererFormattedStrings != null) __obj.updateDynamic("rendererFormattedStrings")(rendererFormattedStrings.asInstanceOf[js.Any])
    __obj.asInstanceOf[RendererFormattedStrings]
  }
}

