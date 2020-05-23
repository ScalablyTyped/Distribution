package typings.extjs.Ext

import typings.extjs.Ext.data.IModel
import typings.extjs.Ext.view.IAbstractView
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDataView extends IAbstractView {
  /** [Method] Un highlights the currently highlighted item if any  */
  var clearHighlight: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Focuses a node in the view
    * @param rec Ext.data.Model The record associated to the node that is to be focused.
    */
  var focusNode: js.UndefOr[js.Function1[/* rec */ js.UndefOr[IModel], Unit]] = js.undefined
  /** [Method] Highlights a given item in the View
    * @param item HTMLElement The item to highlight
    */
  var highlightItem: js.UndefOr[js.Function1[/* item */ js.UndefOr[HTMLElement], Unit]] = js.undefined
  /** [Config Option] (Number) */
  var mouseOverOutBuffer: js.UndefOr[Double] = js.undefined
}

object IDataView {
  @scala.inline
  def apply(
    IAbstractView: IAbstractView = null,
    clearHighlight: () => Unit = null,
    focusNode: /* rec */ js.UndefOr[IModel] => Unit = null,
    highlightItem: /* item */ js.UndefOr[HTMLElement] => Unit = null,
    mouseOverOutBuffer: js.UndefOr[Double] = js.undefined
  ): IDataView = {
    val __obj = js.Dynamic.literal()
    if (IAbstractView != null) js.Dynamic.global.Object.assign(__obj, IAbstractView)
    if (clearHighlight != null) __obj.updateDynamic("clearHighlight")(js.Any.fromFunction0(clearHighlight))
    if (focusNode != null) __obj.updateDynamic("focusNode")(js.Any.fromFunction1(focusNode))
    if (highlightItem != null) __obj.updateDynamic("highlightItem")(js.Any.fromFunction1(highlightItem))
    if (!js.isUndefined(mouseOverOutBuffer)) __obj.updateDynamic("mouseOverOutBuffer")(mouseOverOutBuffer.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDataView]
  }
}

