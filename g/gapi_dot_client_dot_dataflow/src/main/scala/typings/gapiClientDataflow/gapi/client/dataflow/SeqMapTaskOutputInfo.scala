package typings.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SeqMapTaskOutputInfo extends js.Object {
  /** The sink to write the output value to. */
  var sink: js.UndefOr[Sink] = js.native
  /** The id of the TupleTag the user code will tag the output value by. */
  var tag: js.UndefOr[String] = js.native
}

object SeqMapTaskOutputInfo {
  @scala.inline
  def apply(): SeqMapTaskOutputInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeqMapTaskOutputInfo]
  }
  @scala.inline
  implicit class SeqMapTaskOutputInfoOps[Self <: SeqMapTaskOutputInfo] (val x: Self) extends AnyVal {
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
    def setSink(value: Sink): Self = this.set("sink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSink: Self = this.set("sink", js.undefined)
    @scala.inline
    def setTag(value: String): Self = this.set("tag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
  }
  
}

