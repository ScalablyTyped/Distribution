package typings.extjs.Ext.tab

import typings.extjs.Ext.panel.IHeader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBar extends IHeader {
  /** [Method] Called by the layout system after the Component has been laid out
  		* @param width Object
  		*/
  @JSName("afterComponentLayout")
  var afterComponentLayout_IBar: js.UndefOr[js.Function1[/* width */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Property] (Boolean) */
  var isTabBar: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Number) */
  var maxTabWidth: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Number) */
  var minTabWidth: js.UndefOr[Double] = js.undefined
  /** [Method] This method is invoked after a new Component has been removed
  		* @param tab Object
  		*/
  @JSName("onRemove")
  var onRemove_IBar: js.UndefOr[js.Function1[/* tab */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Template method called when this Component s DOM structure is created  */
  @JSName("onRender")
  var onRender_IBar: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var plain: js.UndefOr[Boolean] = js.undefined
}

object IBar {
  @scala.inline
  def apply(
    IHeader: IHeader = null,
    afterComponentLayout: /* width */ js.UndefOr[js.Any] => Unit = null,
    isTabBar: js.UndefOr[Boolean] = js.undefined,
    maxTabWidth: Int | Double = null,
    minTabWidth: Int | Double = null,
    onRemove: /* tab */ js.UndefOr[js.Any] => Unit = null,
    onRender: () => Unit = null,
    plain: js.UndefOr[Boolean] = js.undefined
  ): IBar = {
    val __obj = js.Dynamic.literal()
    if (IHeader != null) js.Dynamic.global.Object.assign(__obj, IHeader)
    if (afterComponentLayout != null) __obj.updateDynamic("afterComponentLayout")(js.Any.fromFunction1(afterComponentLayout))
    if (!js.isUndefined(isTabBar)) __obj.updateDynamic("isTabBar")(isTabBar.asInstanceOf[js.Any])
    if (maxTabWidth != null) __obj.updateDynamic("maxTabWidth")(maxTabWidth.asInstanceOf[js.Any])
    if (minTabWidth != null) __obj.updateDynamic("minTabWidth")(minTabWidth.asInstanceOf[js.Any])
    if (onRemove != null) __obj.updateDynamic("onRemove")(js.Any.fromFunction1(onRemove))
    if (onRender != null) __obj.updateDynamic("onRender")(js.Any.fromFunction0(onRender))
    if (!js.isUndefined(plain)) __obj.updateDynamic("plain")(plain.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBar]
  }
}

