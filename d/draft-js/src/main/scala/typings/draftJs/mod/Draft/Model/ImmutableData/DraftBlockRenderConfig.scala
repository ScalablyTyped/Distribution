package typings.draftJs.mod.Draft.Model.ImmutableData

import typings.react.mod.ReactNode
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
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any])
    if (wrapper != null) __obj.updateDynamic("wrapper")(wrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[DraftBlockRenderConfig]
  }
}

