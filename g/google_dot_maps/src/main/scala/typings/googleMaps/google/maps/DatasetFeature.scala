package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatasetFeature
  extends StObject
     with Feature {
  
  /**
    * Key-value mapping of the feature&#39;s attributes.
    */
  var datasetAttributes: StringDictionary[String]
  
  /**
    * Dataset id of the dataset that this feature belongs to.
    */
  var datasetId: String
}
object DatasetFeature {
  
  inline def apply(datasetAttributes: StringDictionary[String], datasetId: String, featureType: FeatureType): DatasetFeature = {
    val __obj = js.Dynamic.literal(datasetAttributes = datasetAttributes.asInstanceOf[js.Any], datasetId = datasetId.asInstanceOf[js.Any], featureType = featureType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatasetFeature]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DatasetFeature] (val x: Self) extends AnyVal {
    
    inline def setDatasetAttributes(value: StringDictionary[String]): Self = StObject.set(x, "datasetAttributes", value.asInstanceOf[js.Any])
    
    inline def setDatasetId(value: String): Self = StObject.set(x, "datasetId", value.asInstanceOf[js.Any])
  }
}
