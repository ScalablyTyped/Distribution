package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeoTargeting extends js.Object {
  
  var cities: js.UndefOr[js.Array[City]] = js.native
  
  var countries: js.UndefOr[js.Array[Country]] = js.native
  
  var excludeCountries: js.UndefOr[Boolean] = js.native
  
  var metros: js.UndefOr[js.Array[Metro]] = js.native
  
  var postalCodes: js.UndefOr[js.Array[PostalCode]] = js.native
  
  var regions: js.UndefOr[js.Array[Region]] = js.native
}
object GeoTargeting {
  
  @scala.inline
  def apply(): GeoTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeoTargeting]
  }
  
  @scala.inline
  implicit class GeoTargetingOps[Self <: GeoTargeting] (val x: Self) extends AnyVal {
    
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
    def setCitiesVarargs(value: City*): Self = this.set("cities", js.Array(value :_*))
    
    @scala.inline
    def setCities(value: js.Array[City]): Self = this.set("cities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCities: Self = this.set("cities", js.undefined)
    
    @scala.inline
    def setCountriesVarargs(value: Country*): Self = this.set("countries", js.Array(value :_*))
    
    @scala.inline
    def setCountries(value: js.Array[Country]): Self = this.set("countries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountries: Self = this.set("countries", js.undefined)
    
    @scala.inline
    def setExcludeCountries(value: Boolean): Self = this.set("excludeCountries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludeCountries: Self = this.set("excludeCountries", js.undefined)
    
    @scala.inline
    def setMetrosVarargs(value: Metro*): Self = this.set("metros", js.Array(value :_*))
    
    @scala.inline
    def setMetros(value: js.Array[Metro]): Self = this.set("metros", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetros: Self = this.set("metros", js.undefined)
    
    @scala.inline
    def setPostalCodesVarargs(value: PostalCode*): Self = this.set("postalCodes", js.Array(value :_*))
    
    @scala.inline
    def setPostalCodes(value: js.Array[PostalCode]): Self = this.set("postalCodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePostalCodes: Self = this.set("postalCodes", js.undefined)
    
    @scala.inline
    def setRegionsVarargs(value: Region*): Self = this.set("regions", js.Array(value :_*))
    
    @scala.inline
    def setRegions(value: js.Array[Region]): Self = this.set("regions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegions: Self = this.set("regions", js.undefined)
  }
}
