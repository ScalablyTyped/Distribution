package typings.googleapis.civicinfoV2Mod.civicinfoV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A simple representation of an address.
  */
@js.native
trait SchemaSimpleAddressType extends js.Object {
  
  /**
    * The city or town for the address.
    */
  var city: js.UndefOr[String] = js.native
  
  /**
    * The street name and number of this address.
    */
  var line1: js.UndefOr[String] = js.native
  
  /**
    * The second line the address, if needed.
    */
  var line2: js.UndefOr[String] = js.native
  
  /**
    * The third line of the address, if needed.
    */
  var line3: js.UndefOr[String] = js.native
  
  /**
    * The name of the location.
    */
  var locationName: js.UndefOr[String] = js.native
  
  /**
    * The US two letter state abbreviation of the address.
    */
  var state: js.UndefOr[String] = js.native
  
  /**
    * The US Postal Zip Code of the address.
    */
  var zip: js.UndefOr[String] = js.native
}
object SchemaSimpleAddressType {
  
  @scala.inline
  def apply(): SchemaSimpleAddressType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSimpleAddressType]
  }
  
  @scala.inline
  implicit class SchemaSimpleAddressTypeOps[Self <: SchemaSimpleAddressType] (val x: Self) extends AnyVal {
    
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
    def setCity(value: String): Self = this.set("city", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCity: Self = this.set("city", js.undefined)
    
    @scala.inline
    def setLine1(value: String): Self = this.set("line1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLine1: Self = this.set("line1", js.undefined)
    
    @scala.inline
    def setLine2(value: String): Self = this.set("line2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLine2: Self = this.set("line2", js.undefined)
    
    @scala.inline
    def setLine3(value: String): Self = this.set("line3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLine3: Self = this.set("line3", js.undefined)
    
    @scala.inline
    def setLocationName(value: String): Self = this.set("locationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocationName: Self = this.set("locationName", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setZip(value: String): Self = this.set("zip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZip: Self = this.set("zip", js.undefined)
  }
}
