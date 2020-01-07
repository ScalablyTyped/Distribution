package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_RendererFormattedStrings extends js.Object {
  var rendererFormattedStrings: js.UndefOr[Anon_AuditGroupExpandTooltip] = js.native
}

object Anon_RendererFormattedStrings {
  @scala.inline
  def apply(rendererFormattedStrings: Anon_AuditGroupExpandTooltip = null): Anon_RendererFormattedStrings = {
    val __obj = js.Dynamic.literal()
    if (rendererFormattedStrings != null) __obj.updateDynamic("rendererFormattedStrings")(rendererFormattedStrings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_RendererFormattedStrings]
  }
}

