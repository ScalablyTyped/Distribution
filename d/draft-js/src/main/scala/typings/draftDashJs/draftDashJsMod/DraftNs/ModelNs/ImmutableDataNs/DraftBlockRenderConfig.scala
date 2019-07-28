package typings.draftDashJs.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DraftBlockRenderConfig extends js.Object {
  var element: String
  var wrapper: js.UndefOr[ReactNode] = js.undefined
}

object DraftBlockRenderConfig {
  @scala.inline
  def apply(element: String, wrapper: ReactNode = null): DraftBlockRenderConfig = {
    val __obj = js.Dynamic.literal(element = element)
    if (wrapper != null) __obj.updateDynamic("wrapper")(wrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[DraftBlockRenderConfig]
  }
}

