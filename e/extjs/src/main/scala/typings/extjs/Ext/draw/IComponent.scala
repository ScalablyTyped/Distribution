package typings.extjs.Ext.draw

import typings.extjs.Ext.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IComponent
  extends typings.extjs.Ext.IComponent {
  /** [Config Option] (Boolean) */
  var autoSize: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (String[]) */
  var enginePriority: js.UndefOr[Array] = js.undefined
  /** [Config Option] (Object[]) */
  var gradients: js.UndefOr[Array] = js.undefined
  /** [Config Option] (Ext.draw.Sprite[]) */
  var items: js.UndefOr[Array] = js.undefined
  /** [Property] (Ext.draw.Surface) */
  var surface: js.UndefOr[ISurface] = js.undefined
  /** [Config Option] (Boolean) */
  var viewBox: js.UndefOr[Boolean] = js.undefined
}

object IComponent {
  @scala.inline
  def apply(
    IComponent: typings.extjs.Ext.IComponent = null,
    autoSize: js.UndefOr[Boolean] = js.undefined,
    baseCls: java.lang.String = null,
    componentLayout: js.Any = null,
    enginePriority: Array = null,
    gradients: Array = null,
    items: Array = null,
    shrinkWrap: js.Any = null,
    surface: ISurface = null,
    viewBox: js.UndefOr[Boolean] = js.undefined
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

