package typings.esriLeafletGeocoder.mod.esri.Geocoding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArcgisOnlineProviderOptions extends BaseProviderOptions {
  var categories: js.UndefOr[String | js.Array[String]] = js.native
  var countries: js.UndefOr[String | js.Array[String]] = js.native
  var forStorage: js.UndefOr[Boolean] = js.native
}

object ArcgisOnlineProviderOptions {
  @scala.inline
  def apply(): ArcgisOnlineProviderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArcgisOnlineProviderOptions]
  }
  @scala.inline
  implicit class ArcgisOnlineProviderOptionsOps[Self <: ArcgisOnlineProviderOptions] (val x: Self) extends AnyVal {
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
    def setCategoriesVarargs(value: String*): Self = this.set("categories", js.Array(value :_*))
    @scala.inline
    def setCategories(value: String | js.Array[String]): Self = this.set("categories", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategories: Self = this.set("categories", js.undefined)
    @scala.inline
    def setCountriesVarargs(value: String*): Self = this.set("countries", js.Array(value :_*))
    @scala.inline
    def setCountries(value: String | js.Array[String]): Self = this.set("countries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountries: Self = this.set("countries", js.undefined)
    @scala.inline
    def setForStorage(value: Boolean): Self = this.set("forStorage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForStorage: Self = this.set("forStorage", js.undefined)
  }
  
}

