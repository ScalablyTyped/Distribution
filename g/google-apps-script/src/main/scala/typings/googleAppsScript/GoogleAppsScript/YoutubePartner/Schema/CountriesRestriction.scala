package typings.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CountriesRestriction extends js.Object {
  var adFormats: js.UndefOr[js.Array[String]] = js.native
  var territories: js.UndefOr[js.Array[String]] = js.native
}

object CountriesRestriction {
  @scala.inline
  def apply(): CountriesRestriction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CountriesRestriction]
  }
  @scala.inline
  implicit class CountriesRestrictionOps[Self <: CountriesRestriction] (val x: Self) extends AnyVal {
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
    def setAdFormatsVarargs(value: String*): Self = this.set("adFormats", js.Array(value :_*))
    @scala.inline
    def setAdFormats(value: js.Array[String]): Self = this.set("adFormats", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdFormats: Self = this.set("adFormats", js.undefined)
    @scala.inline
    def setTerritoriesVarargs(value: String*): Self = this.set("territories", js.Array(value :_*))
    @scala.inline
    def setTerritories(value: js.Array[String]): Self = this.set("territories", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTerritories: Self = this.set("territories", js.undefined)
  }
  
}

