package typings
package extjsLib.ExtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResizable
  extends extjsLib.ExtNs.utilNs.IObservable {
  /** [Config Option] (Ext.Element/Ext.util.Region) */
  var constrainTo: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var dynamic: js.UndefOr[scala.Boolean] = js.undefined
  /** [Property] (Ext.Element) */
  var el: js.UndefOr[IElement] = js.undefined
  /** [Method] Returns the element that was configured with the el or target config property
  		* @returns Ext.Element element
  		*/
  var getEl: js.UndefOr[js.Function0[IElement]] = js.undefined
  /** [Method] Returns the element or component that was configured with the target config property
  		* @returns Ext.Element/Ext.Component
  		*/
  var getTarget: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Config Option] (String) */
  var handles: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Number) */
  var height: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var heightIncrement: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var maxHeight: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var maxWidth: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var minHeight: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var minWidth: js.UndefOr[scala.Double] = js.undefined
  /** [Property] (Ext.Element/Ext.Component) */
  var originalTarget: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var pinned: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var preserveRatio: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Perform a manual resize and fires the resize event
  		* @param width Number
  		* @param height Number
  		*/
  var resizeTo: js.UndefOr[
    js.Function2[
      /* width */ js.UndefOr[scala.Double], 
      /* height */ js.UndefOr[scala.Double], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Property] (Ext.resizer.ResizeTracker) */
  var resizeTracker: js.UndefOr[extjsLib.ExtNs.resizerNs.IResizeTracker] = js.undefined
  /** [Config Option] (Ext.Element/Ext.Component) */
  var target: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var transparent: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Number) */
  var width: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var widthIncrement: js.UndefOr[scala.Double] = js.undefined
}

