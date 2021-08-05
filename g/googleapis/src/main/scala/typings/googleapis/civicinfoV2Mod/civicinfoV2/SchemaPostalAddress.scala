package typings.googleapis.civicinfoV2Mod.civicinfoV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPostalAddress extends StObject {
  
  var addressLines: js.UndefOr[js.Array[String]] = js.undefined
  
  var administrativeAreaName: js.UndefOr[String] = js.undefined
  
  var countryName: js.UndefOr[String] = js.undefined
  
  var countryNameCode: js.UndefOr[String] = js.undefined
  
  var dependentLocalityName: js.UndefOr[String] = js.undefined
  
  var dependentThoroughfareName: js.UndefOr[String] = js.undefined
  
  var firmName: js.UndefOr[String] = js.undefined
  
  var isDisputed: js.UndefOr[Boolean] = js.undefined
  
  var languageCode: js.UndefOr[String] = js.undefined
  
  var localityName: js.UndefOr[String] = js.undefined
  
  var postBoxNumber: js.UndefOr[String] = js.undefined
  
  var postalCodeNumber: js.UndefOr[String] = js.undefined
  
  var postalCodeNumberExtension: js.UndefOr[String] = js.undefined
  
  var premiseName: js.UndefOr[String] = js.undefined
  
  var recipientName: js.UndefOr[String] = js.undefined
  
  var sortingCode: js.UndefOr[String] = js.undefined
  
  var subAdministrativeAreaName: js.UndefOr[String] = js.undefined
  
  var subPremiseName: js.UndefOr[String] = js.undefined
  
  var thoroughfareName: js.UndefOr[String] = js.undefined
  
  var thoroughfareNumber: js.UndefOr[String] = js.undefined
}
object SchemaPostalAddress {
  
  inline def apply(): SchemaPostalAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPostalAddress]
  }
  
  extension [Self <: SchemaPostalAddress](x: Self) {
    
    inline def setAddressLines(value: js.Array[String]): Self = StObject.set(x, "addressLines", value.asInstanceOf[js.Any])
    
    inline def setAddressLinesUndefined: Self = StObject.set(x, "addressLines", js.undefined)
    
    inline def setAddressLinesVarargs(value: String*): Self = StObject.set(x, "addressLines", js.Array(value :_*))
    
    inline def setAdministrativeAreaName(value: String): Self = StObject.set(x, "administrativeAreaName", value.asInstanceOf[js.Any])
    
    inline def setAdministrativeAreaNameUndefined: Self = StObject.set(x, "administrativeAreaName", js.undefined)
    
    inline def setCountryName(value: String): Self = StObject.set(x, "countryName", value.asInstanceOf[js.Any])
    
    inline def setCountryNameCode(value: String): Self = StObject.set(x, "countryNameCode", value.asInstanceOf[js.Any])
    
    inline def setCountryNameCodeUndefined: Self = StObject.set(x, "countryNameCode", js.undefined)
    
    inline def setCountryNameUndefined: Self = StObject.set(x, "countryName", js.undefined)
    
    inline def setDependentLocalityName(value: String): Self = StObject.set(x, "dependentLocalityName", value.asInstanceOf[js.Any])
    
    inline def setDependentLocalityNameUndefined: Self = StObject.set(x, "dependentLocalityName", js.undefined)
    
    inline def setDependentThoroughfareName(value: String): Self = StObject.set(x, "dependentThoroughfareName", value.asInstanceOf[js.Any])
    
    inline def setDependentThoroughfareNameUndefined: Self = StObject.set(x, "dependentThoroughfareName", js.undefined)
    
    inline def setFirmName(value: String): Self = StObject.set(x, "firmName", value.asInstanceOf[js.Any])
    
    inline def setFirmNameUndefined: Self = StObject.set(x, "firmName", js.undefined)
    
    inline def setIsDisputed(value: Boolean): Self = StObject.set(x, "isDisputed", value.asInstanceOf[js.Any])
    
    inline def setIsDisputedUndefined: Self = StObject.set(x, "isDisputed", js.undefined)
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    inline def setLocalityName(value: String): Self = StObject.set(x, "localityName", value.asInstanceOf[js.Any])
    
    inline def setLocalityNameUndefined: Self = StObject.set(x, "localityName", js.undefined)
    
    inline def setPostBoxNumber(value: String): Self = StObject.set(x, "postBoxNumber", value.asInstanceOf[js.Any])
    
    inline def setPostBoxNumberUndefined: Self = StObject.set(x, "postBoxNumber", js.undefined)
    
    inline def setPostalCodeNumber(value: String): Self = StObject.set(x, "postalCodeNumber", value.asInstanceOf[js.Any])
    
    inline def setPostalCodeNumberExtension(value: String): Self = StObject.set(x, "postalCodeNumberExtension", value.asInstanceOf[js.Any])
    
    inline def setPostalCodeNumberExtensionUndefined: Self = StObject.set(x, "postalCodeNumberExtension", js.undefined)
    
    inline def setPostalCodeNumberUndefined: Self = StObject.set(x, "postalCodeNumber", js.undefined)
    
    inline def setPremiseName(value: String): Self = StObject.set(x, "premiseName", value.asInstanceOf[js.Any])
    
    inline def setPremiseNameUndefined: Self = StObject.set(x, "premiseName", js.undefined)
    
    inline def setRecipientName(value: String): Self = StObject.set(x, "recipientName", value.asInstanceOf[js.Any])
    
    inline def setRecipientNameUndefined: Self = StObject.set(x, "recipientName", js.undefined)
    
    inline def setSortingCode(value: String): Self = StObject.set(x, "sortingCode", value.asInstanceOf[js.Any])
    
    inline def setSortingCodeUndefined: Self = StObject.set(x, "sortingCode", js.undefined)
    
    inline def setSubAdministrativeAreaName(value: String): Self = StObject.set(x, "subAdministrativeAreaName", value.asInstanceOf[js.Any])
    
    inline def setSubAdministrativeAreaNameUndefined: Self = StObject.set(x, "subAdministrativeAreaName", js.undefined)
    
    inline def setSubPremiseName(value: String): Self = StObject.set(x, "subPremiseName", value.asInstanceOf[js.Any])
    
    inline def setSubPremiseNameUndefined: Self = StObject.set(x, "subPremiseName", js.undefined)
    
    inline def setThoroughfareName(value: String): Self = StObject.set(x, "thoroughfareName", value.asInstanceOf[js.Any])
    
    inline def setThoroughfareNameUndefined: Self = StObject.set(x, "thoroughfareName", js.undefined)
    
    inline def setThoroughfareNumber(value: String): Self = StObject.set(x, "thoroughfareNumber", value.asInstanceOf[js.Any])
    
    inline def setThoroughfareNumberUndefined: Self = StObject.set(x, "thoroughfareNumber", js.undefined)
  }
}
