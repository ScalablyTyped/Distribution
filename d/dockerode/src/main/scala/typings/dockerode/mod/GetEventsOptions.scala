package typings.dockerode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetEventsOptions extends js.Object {
  var filters: js.UndefOr[String | typings.dockerode.anon.Container] = js.native
  var since: js.UndefOr[Double] = js.native
  var until: js.UndefOr[Double] = js.native
}

object GetEventsOptions {
  @scala.inline
  def apply(): GetEventsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetEventsOptions]
  }
  @scala.inline
  implicit class GetEventsOptionsOps[Self <: GetEventsOptions] (val x: Self) extends AnyVal {
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
    def setFilters(value: String | typings.dockerode.anon.Container): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    @scala.inline
    def setSince(value: Double): Self = this.set("since", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSince: Self = this.set("since", js.undefined)
    @scala.inline
    def setUntil(value: Double): Self = this.set("until", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUntil: Self = this.set("until", js.undefined)
  }
  
}

