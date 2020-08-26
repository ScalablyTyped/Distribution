package typings.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TerritoryOwners extends js.Object {
  var owner: js.UndefOr[String] = js.native
  var publisher: js.UndefOr[String] = js.native
  var ratio: js.UndefOr[Double] = js.native
  var territories: js.UndefOr[js.Array[String]] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object TerritoryOwners {
  @scala.inline
  def apply(): TerritoryOwners = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TerritoryOwners]
  }
  @scala.inline
  implicit class TerritoryOwnersOps[Self <: TerritoryOwners] (val x: Self) extends AnyVal {
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
    def setPublisher(value: String): Self = this.set("publisher", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublisher: Self = this.set("publisher", js.undefined)
    @scala.inline
    def setRatio(value: Double): Self = this.set("ratio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRatio: Self = this.set("ratio", js.undefined)
    @scala.inline
    def setTerritoriesVarargs(value: String*): Self = this.set("territories", js.Array(value :_*))
    @scala.inline
    def setTerritories(value: js.Array[String]): Self = this.set("territories", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTerritories: Self = this.set("territories", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

