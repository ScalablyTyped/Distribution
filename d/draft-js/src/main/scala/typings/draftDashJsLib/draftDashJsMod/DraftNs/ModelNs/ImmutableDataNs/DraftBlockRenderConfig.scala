package typings
package draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DraftBlockRenderConfig extends js.Object {
  var element: java.lang.String
  var wrapper: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
}

object DraftBlockRenderConfig {
  @scala.inline
  def apply(element: java.lang.String, wrapper: reactLib.reactMod.ReactNode = null): DraftBlockRenderConfig = {
    val __obj = js.Dynamic.literal(element = element)
    if (wrapper != null) __obj.updateDynamic("wrapper")(wrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[DraftBlockRenderConfig]
  }
}

