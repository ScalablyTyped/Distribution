package typings.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndOfSegmentLocation extends js.Object {
  var segmentId: js.UndefOr[String] = js.native
}

object EndOfSegmentLocation {
  @scala.inline
  def apply(): EndOfSegmentLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndOfSegmentLocation]
  }
  @scala.inline
  implicit class EndOfSegmentLocationOps[Self <: EndOfSegmentLocation] (val x: Self) extends AnyVal {
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
    def setSegmentId(value: String): Self = this.set("segmentId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSegmentId: Self = this.set("segmentId", js.undefined)
  }
  
}

