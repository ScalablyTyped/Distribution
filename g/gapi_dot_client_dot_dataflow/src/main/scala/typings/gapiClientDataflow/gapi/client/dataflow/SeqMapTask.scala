package typings.gapiClientDataflow.gapi.client.dataflow

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SeqMapTask extends js.Object {
  /** Information about each of the inputs. */
  var inputs: js.UndefOr[js.Array[SideInputInfo]] = js.native
  /** The user-provided name of the SeqDo operation. */
  var name: js.UndefOr[String] = js.native
  /** Information about each of the outputs. */
  var outputInfos: js.UndefOr[js.Array[SeqMapTaskOutputInfo]] = js.native
  /**
    * System-defined name of the stage containing the SeqDo operation.
    * Unique across the workflow.
    */
  var stageName: js.UndefOr[String] = js.native
  /**
    * System-defined name of the SeqDo operation.
    * Unique across the workflow.
    */
  var systemName: js.UndefOr[String] = js.native
  /** The user function to invoke. */
  var userFn: js.UndefOr[Record[String, _]] = js.native
}

object SeqMapTask {
  @scala.inline
  def apply(): SeqMapTask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeqMapTask]
  }
  @scala.inline
  implicit class SeqMapTaskOps[Self <: SeqMapTask] (val x: Self) extends AnyVal {
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
    def setInputsVarargs(value: SideInputInfo*): Self = this.set("inputs", js.Array(value :_*))
    @scala.inline
    def setInputs(value: js.Array[SideInputInfo]): Self = this.set("inputs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputs: Self = this.set("inputs", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOutputInfosVarargs(value: SeqMapTaskOutputInfo*): Self = this.set("outputInfos", js.Array(value :_*))
    @scala.inline
    def setOutputInfos(value: js.Array[SeqMapTaskOutputInfo]): Self = this.set("outputInfos", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputInfos: Self = this.set("outputInfos", js.undefined)
    @scala.inline
    def setStageName(value: String): Self = this.set("stageName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStageName: Self = this.set("stageName", js.undefined)
    @scala.inline
    def setSystemName(value: String): Self = this.set("systemName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSystemName: Self = this.set("systemName", js.undefined)
    @scala.inline
    def setUserFn(value: Record[String, _]): Self = this.set("userFn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserFn: Self = this.set("userFn", js.undefined)
  }
  
}

