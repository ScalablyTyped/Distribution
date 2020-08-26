package typings.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TerritoryCondition extends js.Object {
  var territories: js.UndefOr[js.Array[String]] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object TerritoryCondition {
  @scala.inline
  def apply(): TerritoryCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TerritoryCondition]
  }
  @scala.inline
  implicit class TerritoryConditionOps[Self <: TerritoryCondition] (val x: Self) extends AnyVal {
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

