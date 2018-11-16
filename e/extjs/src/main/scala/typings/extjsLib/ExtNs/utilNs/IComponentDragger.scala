package typings
package extjsLib.ExtNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IComponentDragger
  extends extjsLib.ExtNs.ddNs.IDragTracker {
  /** [Config Option] (Boolean) */
  var constrain: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var constrainDelegate: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Move either the ghost Component or the target Component to its new position on drag
  		* @param e Object
  		*/
  @JSName("onDrag")
  var onDrag_IComponentDragger: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Template method which should be overridden by each DragTracker instance
  		* @param e Object
  		*/
  @JSName("onEnd")
  var onEnd_IComponentDragger: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Template method which should be overridden by each DragTracker instance
  		* @param e Object
  		*/
  @JSName("onStart")
  var onStart_IComponentDragger: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
}

