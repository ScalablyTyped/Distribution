package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CountriesListResponse extends js.Object {
  var countries: js.UndefOr[js.Array[Country]] = js.native
  var kind: js.UndefOr[String] = js.native
}

object CountriesListResponse {
  @scala.inline
  def apply(): CountriesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CountriesListResponse]
  }
  @scala.inline
  implicit class CountriesListResponseOps[Self <: CountriesListResponse] (val x: Self) extends AnyVal {
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
    def setCountriesVarargs(value: Country*): Self = this.set("countries", js.Array(value :_*))
    @scala.inline
    def setCountries(value: js.Array[Country]): Self = this.set("countries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountries: Self = this.set("countries", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
  
}

