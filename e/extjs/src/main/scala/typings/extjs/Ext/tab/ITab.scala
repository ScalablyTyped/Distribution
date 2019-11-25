package typings.extjs.Ext.tab

import typings.extjs.Ext.IComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITab
  extends typings.extjs.Ext.button.IButton {
  /** [Property] (Boolean) */
  var active: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (String) */
  var activeCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var closable: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (String) */
  var closableCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var closeText: js.UndefOr[java.lang.String] = js.undefined
  /** [Property] (Boolean) */
  var isTab: js.UndefOr[Boolean] = js.undefined
  /** [Method] Sets this tab s attached card
  		* @param card Ext.Component The card to set
  		*/
  var setCard: js.UndefOr[js.Function1[/* card */ js.UndefOr[IComponent], Unit]] = js.undefined
  /** [Method] Sets the tab as either closable or not
  		* @param closable Boolean Pass false to make the tab not closable. Otherwise the tab will be made closable (eg a close button will appear on the tab)
  		*/
  var setClosable: js.UndefOr[js.Function1[/* closable */ js.UndefOr[Boolean], Unit]] = js.undefined
}

object ITab {
  @scala.inline
  def apply(
    IButton: typings.extjs.Ext.button.IButton = null,
    active: js.UndefOr[Boolean] = js.undefined,
    activeCls: java.lang.String = null,
    closable: js.UndefOr[Boolean] = js.undefined,
    closableCls: java.lang.String = null,
    closeText: java.lang.String = null,
    isTab: js.UndefOr[Boolean] = js.undefined,
    setCard: /* card */ js.UndefOr[IComponent] => Unit = null,
    setClosable: /* closable */ js.UndefOr[Boolean] => Unit = null
  ): ITab = {
    val __obj = js.Dynamic.literal()
    if (IButton != null) js.Dynamic.global.Object.assign(__obj, IButton)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (activeCls != null) __obj.updateDynamic("activeCls")(activeCls.asInstanceOf[js.Any])
    if (!js.isUndefined(closable)) __obj.updateDynamic("closable")(closable.asInstanceOf[js.Any])
    if (closableCls != null) __obj.updateDynamic("closableCls")(closableCls.asInstanceOf[js.Any])
    if (closeText != null) __obj.updateDynamic("closeText")(closeText.asInstanceOf[js.Any])
    if (!js.isUndefined(isTab)) __obj.updateDynamic("isTab")(isTab.asInstanceOf[js.Any])
    if (setCard != null) __obj.updateDynamic("setCard")(js.Any.fromFunction1(setCard))
    if (setClosable != null) __obj.updateDynamic("setClosable")(js.Any.fromFunction1(setClosable))
    __obj.asInstanceOf[ITab]
  }
}

