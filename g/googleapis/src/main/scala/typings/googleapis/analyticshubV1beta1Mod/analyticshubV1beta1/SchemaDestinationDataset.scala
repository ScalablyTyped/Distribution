package typings.googleapis.analyticshubV1beta1Mod.analyticshubV1beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDestinationDataset extends StObject {
  
  /**
    * Required. A reference that identifies the destination dataset.
    */
  var datasetReference: js.UndefOr[SchemaDestinationDatasetReference] = js.undefined
  
  /**
    * Optional. A user-friendly description of the dataset.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. A descriptive name for the dataset.
    */
  var friendlyName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The labels associated with this dataset. You can use these to organize and group your datasets. You can set this property when inserting or updating a dataset. See https://cloud.google.com/resource-manager/docs/creating-managing-labels for more information.
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Required. The geographic location where the dataset should reside. See https://cloud.google.com/bigquery/docs/locations for supported locations.
    */
  var location: js.UndefOr[String | Null] = js.undefined
}
object SchemaDestinationDataset {
  
  inline def apply(): SchemaDestinationDataset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDestinationDataset]
  }
  
  extension [Self <: SchemaDestinationDataset](x: Self) {
    
    inline def setDatasetReference(value: SchemaDestinationDatasetReference): Self = StObject.set(x, "datasetReference", value.asInstanceOf[js.Any])
    
    inline def setDatasetReferenceUndefined: Self = StObject.set(x, "datasetReference", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
    
    inline def setFriendlyNameNull: Self = StObject.set(x, "friendlyName", null)
    
    inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationNull: Self = StObject.set(x, "location", null)
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
  }
}
