package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequesterPays extends js.Object {
  var requesterPays: js.UndefOr[Boolean] = js.native
}

object RequesterPays {
  @scala.inline
  def apply(): RequesterPays = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequesterPays]
  }
  @scala.inline
  implicit class RequesterPaysOps[Self <: RequesterPays] (val x: Self) extends AnyVal {
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
    def setRequesterPays(value: Boolean): Self = this.set("requesterPays", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequesterPays: Self = this.set("requesterPays", js.undefined)
  }
  
}

