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
    enginePriority: Array = null,
    gradients: Array = null,
    items: Array = null,
    surface: ISurface = null,
    viewBox: js.UndefOr[Boolean] = js.undefined
  ): IComponent = {
    val __obj = js.Dynamic.literal()
    if (IComponent != null) js.Dynamic.global.Object.assign(__obj, IComponent)
    if (!js.isUndefined(autoSize)) __obj.updateDynamic("autoSize")(autoSize.asInstanceOf[js.Any])
    if (enginePriority != null) __obj.updateDynamic("enginePriority")(enginePriority.asInstanceOf[js.Any])
    if (gradients != null) __obj.updateDynamic("gradients")(gradients.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (surface != null) __obj.updateDynamic("surface")(surface.asInstanceOf[js.Any])
    if (!js.isUndefined(viewBox)) __obj.updateDynamic("viewBox")(viewBox.asInstanceOf[js.Any])
    __obj.asInstanceOf[IComponent]
  }
}

