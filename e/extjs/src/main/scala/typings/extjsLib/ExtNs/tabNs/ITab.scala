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

