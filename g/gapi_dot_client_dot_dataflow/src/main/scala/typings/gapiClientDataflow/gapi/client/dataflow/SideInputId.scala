package typings.gapiClientDataflow.gapi.client.dataflow

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
  def apply(declaringStepName: String = null, inputIndex: js.UndefOr[Double] = js.undefined): SideInputId = {
    val __obj = js.Dynamic.literal()
    if (declaringStepName != null) __obj.updateDynamic("declaringStepName")(declaringStepName.asInstanceOf[js.Any])
    if (!js.isUndefined(inputIndex)) __obj.updateDynamic("inputIndex")(inputIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SideInputId]
  }
}

