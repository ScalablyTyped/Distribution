package typings.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConflictingOwnership extends js.Object {
  var owner: js.UndefOr[String] = js.native
  var ratio: js.UndefOr[Double] = js.native
}

object ConflictingOwnership {
  @scala.inline
  def apply(): ConflictingOwnership = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConflictingOwnership]
  }
  @scala.inline
  implicit class ConflictingOwnershipOps[Self <: ConflictingOwnership] (val x: Self) extends AnyVal {
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
    def setOwner(value: String): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    @scala.inline
    def setRatio(value: Double): Self = this.set("ratio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRatio: Self = this.set("ratio", js.undefined)
  }
  
}

