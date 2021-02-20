package typings.googleapis.civicinfoV2Mod.civicinfoV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaPostalAddress extends StObject {
  
  var addressLines: js.UndefOr[js.Array[String]] = js.native
  
  var administrativeAreaName: js.UndefOr[String] = js.native
  
  var countryName: js.UndefOr[String] = js.native
  
  var countryNameCode: js.UndefOr[String] = js.native
  
  var dependentLocalityName: js.UndefOr[String] = js.native
  
  var dependentThoroughfareName: js.UndefOr[String] = js.native
  
  var firmName: js.UndefOr[String] = js.native
  
  var isDisputed: js.UndefOr[Boolean] = js.native
  
  var languageCode: js.UndefOr[String] = js.native
  
  var localityName: js.UndefOr[String] = js.native
  
  var postBoxNumber: js.UndefOr[String] = js.native
  
  var postalCodeNumber: js.UndefOr[String] = js.native
  
  var postalCodeNumberExtension: js.UndefOr[String] = js.native
  
  var premiseName: js.UndefOr[String] = js.native
  
  var recipientName: js.UndefOr[String] = js.native
  
  var sortingCode: js.UndefOr[String] = js.native
  
  var subAdministrativeAreaName: js.UndefOr[String] = js.native
  
  var subPremiseName: js.UndefOr[String] = js.native
  
  var thoroughfareName: js.UndefOr[String] = js.native
  
  var thoroughfareNumber: js.UndefOr[String] = js.native
}
object SchemaPostalAddress {
  
  @scala.inline
  def apply(): SchemaPostalAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPostalAddress]
  }
  
  @scala.inline
  implicit class SchemaPostalAddressMutableBuilder[Self <: SchemaPostalAddress] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddressLines(value: js.Array[String]): Self = StObject.set(x, "addressLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressLinesUndefined: Self = StObject.set(x, "addressLines", js.undefined)
    
    @scala.inline
    def setAddressLinesVarargs(value: String*): Self = StObject.set(x, "addressLines", js.Array(value :_*))
    
    @scala.inline
    def setAdministrativeAreaName(value: String): Self = StObject.set(x, "administrativeAreaName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdministrativeAreaNameUndefined: Self = StObject.set(x, "administrativeAreaName", js.undefined)
    
    @scala.inline
    def setCountryName(value: String): Self = StObject.set(x, "countryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryNameCode(value: String): Self = StObject.set(x, "countryNameCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryNameCodeUndefined: Self = StObject.set(x, "countryNameCode", js.undefined)
    
    @scala.inline
    def setCountryNameUndefined: Self = StObject.set(x, "countryName", js.undefined)
    
    @scala.inline
    def setDependentLocalityName(value: String): Self = StObject.set(x, "dependentLocalityName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDependentLocalityNameUndefined: Self = StObject.set(x, "dependentLocalityName", js.undefined)
    
    @scala.inline
    def setDependentThoroughfareName(value: String): Self = StObject.set(x, "dependentThoroughfareName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDependentThoroughfareNameUndefined: Self = StObject.set(x, "dependentThoroughfareName", js.undefined)
    
    @scala.inline
    def setFirmName(value: String): Self = StObject.set(x, "firmName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirmNameUndefined: Self = StObject.set(x, "firmName", js.undefined)
    
    @scala.inline
    def setIsDisputed(value: Boolean): Self = StObject.set(x, "isDisputed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDisputedUndefined: Self = StObject.set(x, "isDisputed", js.undefined)
    
    @scala.inline
    def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    @scala.inline
    def setLocalityName(value: String): Self = StObject.set(x, "localityName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalityNameUndefined: Self = StObject.set(x, "localityName", js.undefined)
    
    @scala.inline
    def setPostBoxNumber(value: String): Self = StObject.set(x, "postBoxNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostBoxNumberUndefined: Self = StObject.set(x, "postBoxNumber", js.undefined)
    
    @scala.inline
    def setPostalCodeNumber(value: String): Self = StObject.set(x, "postalCodeNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostalCodeNumberExtension(value: String): Self = StObject.set(x, "postalCodeNumberExtension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostalCodeNumberExtensionUndefined: Self = StObject.set(x, "postalCodeNumberExtension", js.undefined)
    
    @scala.inline
    def setPostalCodeNumberUndefined: Self = StObject.set(x, "postalCodeNumber", js.undefined)
    
    @scala.inline
    def setPremiseName(value: String): Self = StObject.set(x, "premiseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPremiseNameUndefined: Self = StObject.set(x, "premiseName", js.undefined)
    
    @scala.inline
    def setRecipientName(value: String): Self = StObject.set(x, "recipientName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientNameUndefined: Self = StObject.set(x, "recipientName", js.undefined)
    
    @scala.inline
    def setSortingCode(value: String): Self = StObject.set(x, "sortingCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortingCodeUndefined: Self = StObject.set(x, "sortingCode", js.undefined)
    
    @scala.inline
    def setSubAdministrativeAreaName(value: String): Self = StObject.set(x, "subAdministrativeAreaName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubAdministrativeAreaNameUndefined: Self = StObject.set(x, "subAdministrativeAreaName", js.undefined)
    
    @scala.inline
    def setSubPremiseName(value: String): Self = StObject.set(x, "subPremiseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubPremiseNameUndefined: Self = StObject.set(x, "subPremiseName", js.undefined)
    
    @scala.inline
    def setThoroughfareName(value: String): Self = StObject.set(x, "thoroughfareName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThoroughfareNameUndefined: Self = StObject.set(x, "thoroughfareName", js.undefined)
    
    @scala.inline
    def setThoroughfareNumber(value: String): Self = StObject.set(x, "thoroughfareNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThoroughfareNumberUndefined: Self = StObject.set(x, "thoroughfareNumber", js.undefined)
  }
}
