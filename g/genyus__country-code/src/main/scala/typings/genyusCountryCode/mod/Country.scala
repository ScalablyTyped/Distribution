package typings.genyusCountryCode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Country extends js.Object {
  
  val alpha2: String = js.native
  
  val alpha3: String = js.native
  
  var isoNumeric: String = js.native
  
  val name: String = js.native
}
object Country {
  
  @scala.inline
  def apply(alpha2: String, alpha3: String, isoNumeric: String, name: String): Country = {
    val __obj = js.Dynamic.literal(alpha2 = alpha2.asInstanceOf[js.Any], alpha3 = alpha3.asInstanceOf[js.Any], isoNumeric = isoNumeric.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Country]
  }
  
  @scala.inline
  implicit class CountryOps[Self <: Country] (val x: Self) extends AnyVal {
    
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
    def setAlpha2(value: String): Self = this.set("alpha2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlpha3(value: String): Self = this.set("alpha3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsoNumeric(value: String): Self = this.set("isoNumeric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
