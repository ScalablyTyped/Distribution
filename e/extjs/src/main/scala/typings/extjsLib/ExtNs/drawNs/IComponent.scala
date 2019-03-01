package typings
package extjsLib.ExtNs.drawNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IComponent
  extends extjsLib.ExtNs.IComponent {
  /** [Config Option] (Boolean) */
  var autoSize: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String[]) */
  var enginePriority: js.UndefOr[extjsLib.ExtNs.Array] = js.undefined
  /** [Config Option] (Object[]) */
  var gradients: js.UndefOr[extjsLib.ExtNs.Array] = js.undefined
  /** [Config Option] (Ext.draw.Sprite[]) */
  var items: js.UndefOr[extjsLib.ExtNs.Array] = js.undefined
  /** [Property] (Ext.draw.Surface) */
  var surface: js.UndefOr[ISurface] = js.undefined
  /** [Config Option] (Boolean) */
  var viewBox: js.UndefOr[scala.Boolean] = js.undefined
}

object IComponent {
  @scala.inline
  def apply(
    IComponent: extjsLib.ExtNs.IComponent = null,
    autoSize: js.UndefOr[scala.Boolean] = js.undefined,
    baseCls: java.lang.String = null,
    componentLayout: js.Any = null,
    enginePriority: extjsLib.ExtNs.Array = null,
    gradients: extjsLib.ExtNs.Array = null,
    items: extjsLib.ExtNs.Array = null,
    shrinkWrap: js.Any = null,
    surface: ISurface = null,
    viewBox: js.UndefOr[scala.Boolean] = js.undefined
  ): IComponent = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IComponent)
    if (!js.isUndefined(autoSize)) __obj.updateDynamic("autoSize")(autoSize)
    if (baseCls != null) __obj.updateDynamic("baseCls")(baseCls)
    if (componentLayout != null) __obj.updateDynamic("componentLayout")(componentLayout)
    if (enginePriority != null) __obj.updateDynamic("enginePriority")(enginePriority)
    if (gradients != null) __obj.updateDynamic("gradients")(gradients)
    if (items != null) __obj.updateDynamic("items")(items)
    if (shrinkWrap != null) __obj.updateDynamic("shrinkWrap")(shrinkWrap)
    if (surface != null) __obj.updateDynamic("surface")(surface)
    if (!js.isUndefined(viewBox)) __obj.updateDynamic("viewBox")(viewBox)
    __obj.asInstanceOf[IComponent]
  }
}

