package typings.googleapis.civicinfoV2Mod.civicinfoV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A simple representation of an address.
  */
trait SchemaSimpleAddressType extends StObject {
  
  /**
    * The city or town for the address.
    */
  var city: js.UndefOr[String] = js.undefined
  
  /**
    * The street name and number of this address.
    */
  var line1: js.UndefOr[String] = js.undefined
  
  /**
    * The second line the address, if needed.
    */
  var line2: js.UndefOr[String] = js.undefined
  
  /**
    * The third line of the address, if needed.
    */
  var line3: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the location.
    */
  var locationName: js.UndefOr[String] = js.undefined
  
  /**
    * The US two letter state abbreviation of the address.
    */
  var state: js.UndefOr[String] = js.undefined
  
  /**
    * The US Postal Zip Code of the address.
    */
  var zip: js.UndefOr[String] = js.undefined
}
object SchemaSimpleAddressType {
  
  @scala.inline
  def apply(): SchemaSimpleAddressType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSimpleAddressType]
  }
  
  @scala.inline
  implicit class SchemaSimpleAddressTypeMutableBuilder[Self <: SchemaSimpleAddressType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCityUndefined: Self = StObject.set(x, "city", js.undefined)
    
    @scala.inline
    def setLine1(value: String): Self = StObject.set(x, "line1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLine1Undefined: Self = StObject.set(x, "line1", js.undefined)
    
    @scala.inline
    def setLine2(value: String): Self = StObject.set(x, "line2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLine2Undefined: Self = StObject.set(x, "line2", js.undefined)
    
    @scala.inline
    def setLine3(value: String): Self = StObject.set(x, "line3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLine3Undefined: Self = StObject.set(x, "line3", js.undefined)
    
    @scala.inline
    def setLocationName(value: String): Self = StObject.set(x, "locationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationNameUndefined: Self = StObject.set(x, "locationName", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setZip(value: String): Self = StObject.set(x, "zip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZipUndefined: Self = StObject.set(x, "zip", js.undefined)
  }
}
