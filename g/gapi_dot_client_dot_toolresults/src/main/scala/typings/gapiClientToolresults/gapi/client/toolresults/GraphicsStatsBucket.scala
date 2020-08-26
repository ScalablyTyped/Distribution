package typings.gapiClientToolresults.gapi.client.toolresults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphicsStatsBucket extends js.Object {
  /** Number of frames in the bucket. */
  var frameCount: js.UndefOr[String] = js.native
  /** Lower bound of render time in milliseconds. */
  var renderMillis: js.UndefOr[String] = js.native
}

object GraphicsStatsBucket {
  @scala.inline
  def apply(): GraphicsStatsBucket = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GraphicsStatsBucket]
  }
  @scala.inline
  implicit class GraphicsStatsBucketOps[Self <: GraphicsStatsBucket] (val x: Self) extends AnyVal {
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
    def setFrameCount(value: String): Self = this.set("frameCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrameCount: Self = this.set("frameCount", js.undefined)
    @scala.inline
    def setRenderMillis(value: String): Self = this.set("renderMillis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderMillis: Self = this.set("renderMillis", js.undefined)
  }
  
}

