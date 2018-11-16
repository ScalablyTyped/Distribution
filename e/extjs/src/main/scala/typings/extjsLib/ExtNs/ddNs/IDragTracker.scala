package typings
package extjsLib.ExtNs.ddNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IDragTracker
  extends extjsLib.ExtNs.utilNs.IObservable {
  /** [Property] (Boolean) */
  var active: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean/Number) */
  var autoStart: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Ext.util.Region/Ext.Element) */
  var constrainTo: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var delegate: js.UndefOr[java.lang.String] = js.undefined
  /** [Property] (HTMLElement) */
  var dragTarget: js.UndefOr[stdLib.HTMLElement] = js.undefined
  /** [Method] Returns the drag target
  		* @returns Ext.Element The element currently being tracked.
  		*/
  var getDragTarget: js.UndefOr[js.Function0[extjsLib.ExtNs.IElement]] = js.undefined
  /** [Method] Returns the X Y offset of the current mouse position from the mousedown point
  		* @param constrainMode String If omitted the true mouse position is returned. May be passed as point or dragTarget. See above.
  		* @returns Number[] The X, Y offset from the mousedown point, optionally constrained.
  		*/
  var getOffset: js.UndefOr[
    js.Function1[/* constrainMode */ js.UndefOr[java.lang.String], extjsLib.ExtNs.Array]
  ] = js.undefined
  /** [Method] Initializes the DragTracker on a given element
  		* @param el Ext.Element/HTMLElement The element
  		*/
  var initEl: js.UndefOr[js.Function1[/* el */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Template method which should be overridden by each DragTracker instance
  		* @param e Ext.EventObject The event object
  		*/
  var onBeforeStart: js.UndefOr[js.Function1[/* e */ js.UndefOr[extjsLib.ExtNs.IEventObject], scala.Unit]] = js.undefined
  /** [Method] Template method which should be overridden by each DragTracker instance
  		* @param e Ext.EventObject The event object
  		*/
  var onDrag: js.UndefOr[js.Function1[/* e */ js.UndefOr[extjsLib.ExtNs.IEventObject], scala.Unit]] = js.undefined
  /** [Method] Template method which should be overridden by each DragTracker instance
  		* @param e Ext.EventObject The event object
  		*/
  var onEnd: js.UndefOr[js.Function1[/* e */ js.UndefOr[extjsLib.ExtNs.IEventObject], scala.Unit]] = js.undefined
  /** [Method] Template method which should be overridden by each DragTracker instance
  		* @param e Ext.EventObject The event object
  		*/
  var onStart: js.UndefOr[js.Function1[/* e */ js.UndefOr[extjsLib.ExtNs.IEventObject], scala.Unit]] = js.undefined
  /** [Config Option] (String) */
  var overCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var preventDefault: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var stopEvent: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Number) */
  var tolerance: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Boolean) */
  var trackOver: js.UndefOr[scala.Boolean] = js.undefined
}

