package typings
package extjsLib.ExtNs.tabNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITab
  extends extjsLib.ExtNs.buttonNs.IButton {
  /** [Property] (Boolean) */
  var active: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String) */
  var activeCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var closable: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String) */
  var closableCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var closeText: js.UndefOr[java.lang.String] = js.undefined
  /** [Property] (Boolean) */
  var isTab: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Sets this tab s attached card
  		* @param card Ext.Component The card to set
  		*/
  var setCard: js.UndefOr[js.Function1[/* card */ js.UndefOr[extjsLib.ExtNs.IComponent], scala.Unit]] = js.undefined
  /** [Method] Sets the tab as either closable or not
  		* @param closable Boolean Pass false to make the tab not closable. Otherwise the tab will be made closable (eg a close button will appear on the tab)
  		*/
  var setClosable: js.UndefOr[js.Function1[/* closable */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
}

object ITab {
  @scala.inline
  def apply(
    IButton: extjsLib.ExtNs.buttonNs.IButton = null,
    active: js.UndefOr[scala.Boolean] = js.undefined,
    activeCls: java.lang.String = null,
    baseCls: java.lang.String = null,
    closable: js.UndefOr[scala.Boolean] = js.undefined,
    closableCls: java.lang.String = null,
    closeText: java.lang.String = null,
    disable: /* silent */ js.UndefOr[js.Any] => scala.Unit = null,
    disabledCls: java.lang.String = null,
    enable: /* silent */ js.UndefOr[js.Any] => scala.Unit = null,
    getTemplateArgs: () => _ = null,
    initComponent: () => scala.Unit = null,
    isTab: js.UndefOr[scala.Boolean] = js.undefined,
    scale: js.Any = null,
    setCard: /* card */ js.UndefOr[extjsLib.ExtNs.IComponent] => scala.Unit = null,
    setClosable: /* closable */ js.UndefOr[scala.Boolean] => scala.Unit = null
  ): ITab = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IButton)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (activeCls != null) __obj.updateDynamic("activeCls")(activeCls)
    if (baseCls != null) __obj.updateDynamic("baseCls")(baseCls)
    if (!js.isUndefined(closable)) __obj.updateDynamic("closable")(closable)
    if (closableCls != null) __obj.updateDynamic("closableCls")(closableCls)
    if (closeText != null) __obj.updateDynamic("closeText")(closeText)
    if (disable != null) __obj.updateDynamic("disable")(js.Any.fromFunction1(disable))
    if (disabledCls != null) __obj.updateDynamic("disabledCls")(disabledCls)
    if (enable != null) __obj.updateDynamic("enable")(js.Any.fromFunction1(enable))
    if (getTemplateArgs != null) __obj.updateDynamic("getTemplateArgs")(js.Any.fromFunction0(getTemplateArgs))
    if (initComponent != null) __obj.updateDynamic("initComponent")(js.Any.fromFunction0(initComponent))
    if (!js.isUndefined(isTab)) __obj.updateDynamic("isTab")(isTab)
    if (scale != null) __obj.updateDynamic("scale")(scale)
    if (setCard != null) __obj.updateDynamic("setCard")(js.Any.fromFunction1(setCard))
    if (setClosable != null) __obj.updateDynamic("setClosable")(js.Any.fromFunction1(setClosable))
    __obj.asInstanceOf[ITab]
  }
}

