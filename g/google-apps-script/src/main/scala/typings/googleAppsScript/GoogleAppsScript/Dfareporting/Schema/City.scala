package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait City extends js.Object {
  var countryCode: js.UndefOr[String] = js.native
  var countryDartId: js.UndefOr[String] = js.native
  var dartId: js.UndefOr[String] = js.native
  var kind: js.UndefOr[String] = js.native
  var metroCode: js.UndefOr[String] = js.native
  var metroDmaId: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  var regionCode: js.UndefOr[String] = js.native
  var regionDartId: js.UndefOr[String] = js.native
}

object City {
  @scala.inline
  def apply(): City = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[City]
  }
  @scala.inline
  implicit class CityOps[Self <: City] (val x: Self) extends AnyVal {
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
    def setCountryCode(value: String): Self = this.set("countryCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountryCode: Self = this.set("countryCode", js.undefined)
    @scala.inline
    def setCountryDartId(value: String): Self = this.set("countryDartId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountryDartId: Self = this.set("countryDartId", js.undefined)
    @scala.inline
    def setDartId(value: String): Self = this.set("dartId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDartId: Self = this.set("dartId", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setMetroCode(value: String): Self = this.set("metroCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetroCode: Self = this.set("metroCode", js.undefined)
    @scala.inline
    def setMetroDmaId(value: String): Self = this.set("metroDmaId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetroDmaId: Self = this.set("metroDmaId", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setRegionCode(value: String): Self = this.set("regionCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegionCode: Self = this.set("regionCode", js.undefined)
    @scala.inline
    def setRegionDartId(value: String): Self = this.set("regionDartId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegionDartId: Self = this.set("regionDartId", js.undefined)
  }
  
}

