package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMetadataFilter extends StObject {
  
  /**
    * The list of label value pairs that must match labels in the provided metadata based on filterMatchCriteria This list must not be empty and can have at the most 64 entries.
    */
  var filterLabels: js.UndefOr[js.Array[SchemaMetadataFilterLabelMatch]] = js.undefined
  
  /**
    * Specifies how individual filter label matches within the list of filterLabels and contributes toward the overall metadataFilter match. Supported values are: - MATCH_ANY: at least one of the filterLabels must have a matching label in the provided metadata. - MATCH_ALL: all filterLabels must have matching labels in the provided metadata.
    */
  var filterMatchCriteria: js.UndefOr[String | Null] = js.undefined
}
object SchemaMetadataFilter {
  
  inline def apply(): SchemaMetadataFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMetadataFilter]
  }
  
  extension [Self <: SchemaMetadataFilter](x: Self) {
    
    inline def setFilterLabels(value: js.Array[SchemaMetadataFilterLabelMatch]): Self = StObject.set(x, "filterLabels", value.asInstanceOf[js.Any])
    
    inline def setFilterLabelsUndefined: Self = StObject.set(x, "filterLabels", js.undefined)
    
    inline def setFilterLabelsVarargs(value: SchemaMetadataFilterLabelMatch*): Self = StObject.set(x, "filterLabels", js.Array(value*))
    
    inline def setFilterMatchCriteria(value: String): Self = StObject.set(x, "filterMatchCriteria", value.asInstanceOf[js.Any])
    
    inline def setFilterMatchCriteriaNull: Self = StObject.set(x, "filterMatchCriteria", null)
    
    inline def setFilterMatchCriteriaUndefined: Self = StObject.set(x, "filterMatchCriteria", js.undefined)
  }
}
