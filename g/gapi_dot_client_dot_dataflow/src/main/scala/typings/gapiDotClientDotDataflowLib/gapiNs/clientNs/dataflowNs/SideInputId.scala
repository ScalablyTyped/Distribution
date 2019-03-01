package typings
package gapiDotClientDotDataflowLib.gapiNs.clientNs.dataflowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SideInputId extends js.Object {
  /** The step that receives and usually consumes this side input. */
  var declaringStepName: js.UndefOr[java.lang.String] = js.undefined
  /** The index of the side input, from the list of non_parallel_inputs. */
  var inputIndex: js.UndefOr[scala.Double] = js.undefined
}

object SideInputId {
  @scala.inline
  def apply(declaringStepName: java.lang.String = null, inputIndex: scala.Int | scala.Double = null): SideInputId = {
    val __obj = js.Dynamic.literal()
    if (declaringStepName != null) __obj.updateDynamic("declaringStepName")(declaringStepName)
    if (inputIndex != null) __obj.updateDynamic("inputIndex")(inputIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[SideInputId]
  }
}

