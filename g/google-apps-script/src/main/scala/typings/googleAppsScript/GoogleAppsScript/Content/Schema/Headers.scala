package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Headers extends js.Object {
  
  var locations: js.UndefOr[js.Array[LocationIdSet]] = js.native
  
  var numberOfItems: js.UndefOr[js.Array[String]] = js.native
  
  var postalCodeGroupNames: js.UndefOr[js.Array[String]] = js.native
  
  var prices: js.UndefOr[js.Array[Price]] = js.native
  
  var weights: js.UndefOr[js.Array[Weight]] = js.native
}
object Headers {
  
  @scala.inline
  def apply(): Headers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Headers]
  }
  
  @scala.inline
  implicit class HeadersOps[Self <: Headers] (val x: Self) extends AnyVal {
    
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
    def setLocationsVarargs(value: LocationIdSet*): Self = this.set("locations", js.Array(value :_*))
    
    @scala.inline
    def setLocations(value: js.Array[LocationIdSet]): Self = this.set("locations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocations: Self = this.set("locations", js.undefined)
    
    @scala.inline
    def setNumberOfItemsVarargs(value: String*): Self = this.set("numberOfItems", js.Array(value :_*))
    
    @scala.inline
    def setNumberOfItems(value: js.Array[String]): Self = this.set("numberOfItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberOfItems: Self = this.set("numberOfItems", js.undefined)
    
    @scala.inline
    def setPostalCodeGroupNamesVarargs(value: String*): Self = this.set("postalCodeGroupNames", js.Array(value :_*))
    
    @scala.inline
    def setPostalCodeGroupNames(value: js.Array[String]): Self = this.set("postalCodeGroupNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePostalCodeGroupNames: Self = this.set("postalCodeGroupNames", js.undefined)
    
    @scala.inline
    def setPricesVarargs(value: Price*): Self = this.set("prices", js.Array(value :_*))
    
    @scala.inline
    def setPrices(value: js.Array[Price]): Self = this.set("prices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrices: Self = this.set("prices", js.undefined)
    
    @scala.inline
    def setWeightsVarargs(value: Weight*): Self = this.set("weights", js.Array(value :_*))
    
    @scala.inline
    def setWeights(value: js.Array[Weight]): Self = this.set("weights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeights: Self = this.set("weights", js.undefined)
  }
}
