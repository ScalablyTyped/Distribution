package typings.gapiDotClientDotDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SideInputId extends js.Object {
  /** The step that receives and usually consumes this side input. */
  var declaringStepName: js.UndefOr[String] = js.undefined
  /** The index of the side input, from the list of non_parallel_inputs. */
  var inputIndex: js.UndefOr[Double] = js.undefined
}

object SideInputId {
  @scala.inline
  def apply(declaringStepName: String = null, inputIndex: Int | Double = null): SideInputId = {
    val __obj = js.Dynamic.literal()
    if (declaringStepName != null) __obj.updateDynamic("declaringStepName")(declaringStepName.asInstanceOf[js.Any])
    if (inputIndex != null) __obj.updateDynamic("inputIndex")(inputIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[SideInputId]
  }
}

