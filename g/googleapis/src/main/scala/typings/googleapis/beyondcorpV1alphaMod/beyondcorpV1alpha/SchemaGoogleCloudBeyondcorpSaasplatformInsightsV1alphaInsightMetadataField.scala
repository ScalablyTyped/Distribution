package typings.googleapis.beyondcorpV1alphaMod.beyondcorpV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudBeyondcorpSaasplatformInsightsV1alphaInsightMetadataField extends StObject {
  
  /**
    * Output only. Description of the field.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Name of the field.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Field name to be used in filter while requesting configured insight filtered on this field.
    */
  var filterAlias: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Indicates whether the field can be used for filtering.
    */
  var filterable: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Output only. Indicates whether the field can be used for grouping in custom grouping request.
    */
  var groupable: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Output only. Field id for which this is the metadata.
    */
  var id: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudBeyondcorpSaasplatformInsightsV1alphaInsightMetadataField {
  
  inline def apply(): SchemaGoogleCloudBeyondcorpSaasplatformInsightsV1alphaInsightMetadataField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudBeyondcorpSaasplatformInsightsV1alphaInsightMetadataField]
  }
  
  extension [Self <: SchemaGoogleCloudBeyondcorpSaasplatformInsightsV1alphaInsightMetadataField](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setFilterAlias(value: String): Self = StObject.set(x, "filterAlias", value.asInstanceOf[js.Any])
    
    inline def setFilterAliasNull: Self = StObject.set(x, "filterAlias", null)
    
    inline def setFilterAliasUndefined: Self = StObject.set(x, "filterAlias", js.undefined)
    
    inline def setFilterable(value: Boolean): Self = StObject.set(x, "filterable", value.asInstanceOf[js.Any])
    
    inline def setFilterableNull: Self = StObject.set(x, "filterable", null)
    
    inline def setFilterableUndefined: Self = StObject.set(x, "filterable", js.undefined)
    
    inline def setGroupable(value: Boolean): Self = StObject.set(x, "groupable", value.asInstanceOf[js.Any])
    
    inline def setGroupableNull: Self = StObject.set(x, "groupable", null)
    
    inline def setGroupableUndefined: Self = StObject.set(x, "groupable", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
