package typings
package extjsLib.ExtNs.gridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRowEditorButtons
  extends extjsLib.ExtNs.containerNs.IContainer

object IRowEditorButtons {
  @scala.inline
  def apply(
    IContainer: extjsLib.ExtNs.containerNs.IContainer = null,
    frame: js.UndefOr[scala.Boolean] = js.undefined,
    shrinkWrap: js.Any = null
  ): IRowEditorButtons = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IContainer)
    if (!js.isUndefined(frame)) __obj.updateDynamic("frame")(frame)
    if (shrinkWrap != null) __obj.updateDynamic("shrinkWrap")(shrinkWrap)
    __obj.asInstanceOf[IRowEditorButtons]
  }
}

