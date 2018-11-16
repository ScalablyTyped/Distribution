package typings
package extjsLib.ExtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IDataView
  extends extjsLib.ExtNs.viewNs.IAbstractView {
  /** [Method] Un highlights the currently highlighted item if any  */
  var clearHighlight: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Focuses a node in the view
  		* @param rec Ext.data.Model The record associated to the node that is to be focused.
  		*/
  var focusNode: js.UndefOr[js.Function1[/* rec */ js.UndefOr[extjsLib.ExtNs.dataNs.IModel], scala.Unit]] = js.undefined
  /** [Method] Highlights a given item in the View
  		* @param item HTMLElement The item to highlight
  		*/
  var highlightItem: js.UndefOr[js.Function1[/* item */ js.UndefOr[stdLib.HTMLElement], scala.Unit]] = js.undefined
  /** [Config Option] (Number) */
  var mouseOverOutBuffer: js.UndefOr[scala.Double] = js.undefined
}

