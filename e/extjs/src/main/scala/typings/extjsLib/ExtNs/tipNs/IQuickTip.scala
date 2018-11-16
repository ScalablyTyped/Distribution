package typings
package extjsLib.ExtNs.tipNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IQuickTip extends IToolTip {
  /** [Method] Hides a visible tip or cancels an impending show for a particular element
  		* @param el String/HTMLElement/Ext.Element The element that is the target of the tip or ID of the element.
  		*/
  var cancelShow: js.UndefOr[js.Function1[/* el */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var interceptTitles: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Configures a new quick tip instance and assigns it to a target element
  		* @param config Object The config object with the following properties:
  		*/
  var register: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Removes this quick tip from its element and destroys it
  		* @param el String/HTMLElement/Ext.Element The element from which the quick tip is to be removed or ID of the element.
  		*/
  var unregister: js.UndefOr[js.Function1[/* el */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
}

