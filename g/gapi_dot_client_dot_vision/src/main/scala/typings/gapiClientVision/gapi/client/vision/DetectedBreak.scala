package typings.gapiClientVision.gapi.client.vision

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetectedBreak extends js.Object {
  /** True if break prepends the element. */
  var isPrefix: js.UndefOr[Boolean] = js.native
  /** Detected break type. */
  var `type`: js.UndefOr[String] = js.native
}

object DetectedBreak {
  @scala.inline
  def apply(): DetectedBreak = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectedBreak]
  }
  @scala.inline
  implicit class DetectedBreakOps[Self <: DetectedBreak] (val x: Self) extends AnyVal {
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
    def setIsPrefix(value: Boolean): Self = this.set("isPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsPrefix: Self = this.set("isPrefix", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

