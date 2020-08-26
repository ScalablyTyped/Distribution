package typings.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SideInputId extends js.Object {
  /** The step that receives and usually consumes this side input. */
  var declaringStepName: js.UndefOr[String] = js.native
  /** The index of the side input, from the list of non_parallel_inputs. */
  var inputIndex: js.UndefOr[Double] = js.native
}

object SideInputId {
  @scala.inline
  def apply(): SideInputId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SideInputId]
  }
  @scala.inline
  implicit class SideInputIdOps[Self <: SideInputId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDeclaringStepName(value: String): Self = this.set("declaringStepName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeclaringStepName: Self = this.set("declaringStepName", js.undefined)
    @scala.inline
    def setInputIndex(value: Double): Self = this.set("inputIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputIndex: Self = this.set("inputIndex", js.undefined)
  }
  
}

