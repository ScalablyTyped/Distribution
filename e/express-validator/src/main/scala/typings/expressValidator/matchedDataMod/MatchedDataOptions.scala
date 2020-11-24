package typings.expressValidator.matchedDataMod

import typings.expressValidator.baseMod.Location
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MatchedDataOptions extends js.Object {
  
  var includeOptionals: Boolean = js.native
  
  var locations: js.Array[Location] = js.native
  
  var onlyValidData: Boolean = js.native
}
object MatchedDataOptions {
  
  @scala.inline
  def apply(includeOptionals: Boolean, locations: js.Array[Location], onlyValidData: Boolean): MatchedDataOptions = {
    val __obj = js.Dynamic.literal(includeOptionals = includeOptionals.asInstanceOf[js.Any], locations = locations.asInstanceOf[js.Any], onlyValidData = onlyValidData.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchedDataOptions]
  }
  
  @scala.inline
  implicit class MatchedDataOptionsOps[Self <: MatchedDataOptions] (val x: Self) extends AnyVal {
    
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
    def setIncludeOptionals(value: Boolean): Self = this.set("includeOptionals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationsVarargs(value: Location*): Self = this.set("locations", js.Array(value :_*))
    
    @scala.inline
    def setLocations(value: js.Array[Location]): Self = this.set("locations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnlyValidData(value: Boolean): Self = this.set("onlyValidData", value.asInstanceOf[js.Any])
  }
}
