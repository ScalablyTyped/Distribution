package typings.googleapis.civicinfoV2Mod.civicinfoV2

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRepresentativeInfoResponse extends StObject {
  
  /**
    * A map of political geographic divisions that contain the requested address, keyed by the unique Open Civic Data identifier for this division.
    */
  var divisions: js.UndefOr[StringDictionary[SchemaGeographicDivision] | Null] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "civicinfo#representativeInfoResponse".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The normalized version of the requested address
    */
  var normalizedInput: js.UndefOr[SchemaSimpleAddressType] = js.undefined
  
  /**
    * Elected offices referenced by the divisions listed above. Will only be present if includeOffices was true in the request.
    */
  var offices: js.UndefOr[js.Array[SchemaOffice]] = js.undefined
  
  /**
    * Officials holding the offices listed above. Will only be present if includeOffices was true in the request.
    */
  var officials: js.UndefOr[js.Array[SchemaOfficial]] = js.undefined
}
object SchemaRepresentativeInfoResponse {
  
  inline def apply(): SchemaRepresentativeInfoResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRepresentativeInfoResponse]
  }
  
  extension [Self <: SchemaRepresentativeInfoResponse](x: Self) {
    
    inline def setDivisions(value: StringDictionary[SchemaGeographicDivision]): Self = StObject.set(x, "divisions", value.asInstanceOf[js.Any])
    
    inline def setDivisionsNull: Self = StObject.set(x, "divisions", null)
    
    inline def setDivisionsUndefined: Self = StObject.set(x, "divisions", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNormalizedInput(value: SchemaSimpleAddressType): Self = StObject.set(x, "normalizedInput", value.asInstanceOf[js.Any])
    
    inline def setNormalizedInputUndefined: Self = StObject.set(x, "normalizedInput", js.undefined)
    
    inline def setOffices(value: js.Array[SchemaOffice]): Self = StObject.set(x, "offices", value.asInstanceOf[js.Any])
    
    inline def setOfficesUndefined: Self = StObject.set(x, "offices", js.undefined)
    
    inline def setOfficesVarargs(value: SchemaOffice*): Self = StObject.set(x, "offices", js.Array(value*))
    
    inline def setOfficials(value: js.Array[SchemaOfficial]): Self = StObject.set(x, "officials", value.asInstanceOf[js.Any])
    
    inline def setOfficialsUndefined: Self = StObject.set(x, "officials", js.undefined)
    
    inline def setOfficialsVarargs(value: SchemaOfficial*): Self = StObject.set(x, "officials", js.Array(value*))
  }
}
