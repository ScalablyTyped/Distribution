package typings.googleapis.beyondcorpV1alphaMod.beyondcorpV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudBeyondcorpSaasplatformInsightsV1alphaRowFieldVal extends StObject {
  
  /**
    * Output only. Name of the field.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Field name to be used in filter while requesting configured insight filtered on this field.
    */
  var filterAlias: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Field id.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Value of the field in string format. Acceptable values are strings or numbers.
    */
  var value: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudBeyondcorpSaasplatformInsightsV1alphaRowFieldVal {
  
  inline def apply(): SchemaGoogleCloudBeyondcorpSaasplatformInsightsV1alphaRowFieldVal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudBeyondcorpSaasplatformInsightsV1alphaRowFieldVal]
  }
  
  extension [Self <: SchemaGoogleCloudBeyondcorpSaasplatformInsightsV1alphaRowFieldVal](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setFilterAlias(value: String): Self = StObject.set(x, "filterAlias", value.asInstanceOf[js.Any])
    
    inline def setFilterAliasNull: Self = StObject.set(x, "filterAlias", null)
    
    inline def setFilterAliasUndefined: Self = StObject.set(x, "filterAlias", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
