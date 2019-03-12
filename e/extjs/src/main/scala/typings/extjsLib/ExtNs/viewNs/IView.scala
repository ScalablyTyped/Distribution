package typings
package extjsLib.ExtNs.viewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IView extends IAbstractView {
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

object IView {
  @scala.inline
  def apply(
    IAbstractView: IAbstractView = null,
    clearHighlight: () => scala.Unit = null,
    focusNode: /* rec */ js.UndefOr[extjsLib.ExtNs.dataNs.IModel] => scala.Unit = null,
    highlightItem: /* item */ js.UndefOr[stdLib.HTMLElement] => scala.Unit = null,
    initComponent: () => scala.Unit = null,
    mouseOverOutBuffer: scala.Int | scala.Double = null,
    refresh: () => scala.Unit = null
  ): IView = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IAbstractView)
    if (clearHighlight != null) __obj.updateDynamic("clearHighlight")(js.Any.fromFunction0(clearHighlight))
    if (focusNode != null) __obj.updateDynamic("focusNode")(js.Any.fromFunction1(focusNode))
    if (highlightItem != null) __obj.updateDynamic("highlightItem")(js.Any.fromFunction1(highlightItem))
    if (initComponent != null) __obj.updateDynamic("initComponent")(js.Any.fromFunction0(initComponent))
    if (mouseOverOutBuffer != null) __obj.updateDynamic("mouseOverOutBuffer")(mouseOverOutBuffer.asInstanceOf[js.Any])
    if (refresh != null) __obj.updateDynamic("refresh")(js.Any.fromFunction0(refresh))
    __obj.asInstanceOf[IView]
  }
}

