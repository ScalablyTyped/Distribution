package typings
package extjsLib.ExtNs.formNs.fieldNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFileButton
  extends extjsLib.ExtNs.buttonNs.IButton

object IFileButton {
  @scala.inline
  def apply(
    IButton: extjsLib.ExtNs.buttonNs.IButton = null,
    afterRender: () => scala.Unit = null,
    cls: java.lang.String = null,
    getTemplateArgs: () => _ = null,
    onDisable: () => scala.Unit = null,
    onEnable: () => scala.Unit = null,
    preventDefault: js.UndefOr[scala.Boolean] = js.undefined,
    renderTpl: js.Any = null
  ): IFileButton = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IButton)
    if (afterRender != null) __obj.updateDynamic("afterRender")(js.Any.fromFunction0(afterRender))
    if (cls != null) __obj.updateDynamic("cls")(cls)
    if (getTemplateArgs != null) __obj.updateDynamic("getTemplateArgs")(js.Any.fromFunction0(getTemplateArgs))
    if (onDisable != null) __obj.updateDynamic("onDisable")(js.Any.fromFunction0(onDisable))
    if (onEnable != null) __obj.updateDynamic("onEnable")(js.Any.fromFunction0(onEnable))
    if (!js.isUndefined(preventDefault)) __obj.updateDynamic("preventDefault")(preventDefault)
    if (renderTpl != null) __obj.updateDynamic("renderTpl")(renderTpl)
    __obj.asInstanceOf[IFileButton]
  }
}

