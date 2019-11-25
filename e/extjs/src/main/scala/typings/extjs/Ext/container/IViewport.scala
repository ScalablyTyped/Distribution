package typings.extjs.Ext.container

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IViewport
  extends typings.extjs.Ext.container.IContainer {
  /** [Property] (Boolean) */
  var isViewport: js.UndefOr[Boolean] = js.undefined
  /** [Method] Template method called when this Component s DOM structure is created  */
  @JSName("onRender")
  var onRender_IViewport: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object IViewport {
  @scala.inline
  def apply(
    IContainer: typings.extjs.Ext.container.IContainer = null,
    isViewport: js.UndefOr[Boolean] = js.undefined,
    onRender: () => Unit = null
  ): IViewport = {
    val __obj = js.Dynamic.literal()
    if (IContainer != null) js.Dynamic.global.Object.assign(__obj, IContainer)
    if (!js.isUndefined(isViewport)) __obj.updateDynamic("isViewport")(isViewport.asInstanceOf[js.Any])
    if (onRender != null) __obj.updateDynamic("onRender")(js.Any.fromFunction0(onRender))
    __obj.asInstanceOf[IViewport]
  }
}

