package typings
package extjsLib.ExtNs.fxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IAnimator
  extends extjsLib.ExtNs.utilNs.IObservable {
  /** [Property] (Number) */
  var currentIteration: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var delay: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var duration: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Boolean) */
  var dynamic: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String) */
  var easing: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Fire afteranimate event and end the animation  */
  var end: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Property] (Boolean) */
  var isAnimator: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Number) */
  var iterations: js.UndefOr[scala.Double] = js.undefined
  /** [Property] (Number) */
  var keyframeStep: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Object) */
  var keyframes: js.UndefOr[js.Any] = js.undefined
  /** [Property] (Boolean) */
  var paused: js.UndefOr[scala.Boolean] = js.undefined
  /** [Property] (Boolean) */
  var running: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Ext.fx.target.Target) */
  var target: js.UndefOr[extjsLib.ExtNs.fxNs.targetNs.ITarget] = js.undefined
}

