package typings
package extjsLib.ExtNs.resizerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISplitterTracker
  extends extjsLib.ExtNs.ddNs.IDragTracker {
  /** [Method] ensure the tracker is enabled store boxes of previous and next components and calculate the constrain region
  		* @param e Object
  		*/
  @JSName("onBeforeStart")
  var onBeforeStart_ISplitterTracker: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Track the proxy and set the proper XY coordinates while constraining the drag
  		* @param e Object
  		*/
  @JSName("onDrag")
  var onDrag_ISplitterTracker: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] perform the resize and remove the proxy class from the splitter el
  		* @param e Object
  		*/
  @JSName("onEnd")
  var onEnd_ISplitterTracker: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] We move the splitter el
  		* @param e Object
  		*/
  @JSName("onStart")
  var onStart_ISplitterTracker: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
}

