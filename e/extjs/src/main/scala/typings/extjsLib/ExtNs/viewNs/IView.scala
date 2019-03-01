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
    clearHighlight: js.Function0[scala.Unit] = null,
    focusNode: js.Function1[/* rec */ js.UndefOr[extjsLib.ExtNs.dataNs.IModel], scala.Unit] = null,
    highlightItem: js.Function1[/* item */ js.UndefOr[stdLib.HTMLElement], scala.Unit] = null,
    initComponent: js.Function0[scala.Unit] = null,
    mouseOverOutBuffer: scala.Int | scala.Double = null,
    refresh: js.Function0[scala.Unit] = null
  ): IView = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IAbstractView)
    if (clearHighlight != null) __obj.updateDynamic("clearHighlight")(clearHighlight)
    if (focusNode != null) __obj.updateDynamic("focusNode")(focusNode)
    if (highlightItem != null) __obj.updateDynamic("highlightItem")(highlightItem)
    if (initComponent != null) __obj.updateDynamic("initComponent")(initComponent)
    if (mouseOverOutBuffer != null) __obj.updateDynamic("mouseOverOutBuffer")(mouseOverOutBuffer.asInstanceOf[js.Any])
    if (refresh != null) __obj.updateDynamic("refresh")(refresh)
    __obj.asInstanceOf[IView]
  }
}

