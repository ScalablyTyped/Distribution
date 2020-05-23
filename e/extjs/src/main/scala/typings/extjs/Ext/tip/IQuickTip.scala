package typings.extjs.Ext.tip

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IQuickTip extends IToolTip {
  /** [Method] Hides a visible tip or cancels an impending show for a particular element
    * @param el String/HTMLElement/Ext.Element The element that is the target of the tip or ID of the element.
    */
  var cancelShow: js.UndefOr[js.Function1[/* el */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var interceptTitles: js.UndefOr[Boolean] = js.undefined
  /** [Method] Configures a new quick tip instance and assigns it to a target element
    * @param config Object The config object with the following properties:
    */
  var register: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Removes this quick tip from its element and destroys it
    * @param el String/HTMLElement/Ext.Element The element from which the quick tip is to be removed or ID of the element.
    */
  var unregister: js.UndefOr[js.Function1[/* el */ js.UndefOr[js.Any], Unit]] = js.undefined
}

object IQuickTip {
  @scala.inline
  def apply(
    IToolTip: IToolTip = null,
    cancelShow: /* el */ js.UndefOr[js.Any] => Unit = null,
    interceptTitles: js.UndefOr[Boolean] = js.undefined,
    register: /* config */ js.UndefOr[js.Any] => Unit = null,
    unregister: /* el */ js.UndefOr[js.Any] => Unit = null
  ): IQuickTip = {
    val __obj = js.Dynamic.literal()
    if (IToolTip != null) js.Dynamic.global.Object.assign(__obj, IToolTip)
    if (cancelShow != null) __obj.updateDynamic("cancelShow")(js.Any.fromFunction1(cancelShow))
    if (!js.isUndefined(interceptTitles)) __obj.updateDynamic("interceptTitles")(interceptTitles.get.asInstanceOf[js.Any])
    if (register != null) __obj.updateDynamic("register")(js.Any.fromFunction1(register))
    if (unregister != null) __obj.updateDynamic("unregister")(js.Any.fromFunction1(unregister))
    __obj.asInstanceOf[IQuickTip]
  }
}

