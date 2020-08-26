package typings.gapiClientDataflow.gapi.client.dataflow

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SideInputInfo extends js.Object {
  /** How to interpret the source element(s) as a side input value. */
  var kind: js.UndefOr[Record[String, _]] = js.native
  /**
    * The source(s) to read element(s) from to get the value of this side input.
    * If more than one source, then the elements are taken from the
    * sources, in the specified order if order matters.
    * At least one source is required.
    */
  var sources: js.UndefOr[js.Array[Source]] = js.native
  /**
    * The id of the tag the user code will access this side input by;
    * this should correspond to the tag of some MultiOutputInfo.
    */
  var tag: js.UndefOr[String] = js.native
}

object SideInputInfo {
  @scala.inline
  def apply(): SideInputInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SideInputInfo]
  }
  @scala.inline
  implicit class SideInputInfoOps[Self <: SideInputInfo] (val x: Self) extends AnyVal {
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
    def setKind(value: Record[String, _]): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setSourcesVarargs(value: Source*): Self = this.set("sources", js.Array(value :_*))
    @scala.inline
    def setSources(value: js.Array[Source]): Self = this.set("sources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSources: Self = this.set("sources", js.undefined)
    @scala.inline
    def setTag(value: String): Self = this.set("tag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
  }
  
}

