package typings
package extjsLib.ExtNs.layoutNs.containerNs.boxoverflowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IScroller
  extends extjsLib.ExtNs.utilNs.IObservable {
  /** [Config Option] (String) */
  var afterCtCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var afterScrollerCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var animateScroll: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String) */
  var beforeCtCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var beforeScrollerCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Returns the current scroll position of the innerCt element
  		* @returns Number The current scroll position
  		*/
  var getScrollPosition: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Config Option] (Number) */
  var scrollDuration: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var scrollIncrement: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var scrollRepeatInterval: js.UndefOr[scala.Double] = js.undefined
  /** [Method] Scrolls to the given component
  		* @param item String/Number/Ext.Component The item to scroll to. Can be a numerical index, component id or a reference to the component itself.
  		* @param animate Boolean True to animate the scrolling
  		*/
  var scrollToItem: js.UndefOr[
    js.Function2[/* item */ js.UndefOr[js.Any], /* animate */ js.UndefOr[scala.Boolean], scala.Unit]
  ] = js.undefined
  /** [Config Option] (String) */
  var scrollerCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Number) */
  var wheelIncrement: js.UndefOr[scala.Double] = js.undefined
}

