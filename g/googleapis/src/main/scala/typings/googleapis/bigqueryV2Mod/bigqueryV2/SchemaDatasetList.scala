package typings.googleapis.bigqueryV2Mod.bigqueryV2

import typings.googleapis.anon.DatasetReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDatasetList extends StObject {
  
  /**
    * An array of the dataset resources in the project. Each resource contains basic information. For full information about a particular dataset resource, use the Datasets: get method. This property is omitted when there are no datasets in the project.
    */
  var datasets: js.UndefOr[js.Array[DatasetReference] | Null] = js.undefined
  
  /**
    * A hash value of the results page. You can use this property to determine if the page has changed since the last request.
    */
  var etag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The list type. This property always returns the value "bigquery#datasetList".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A token that can be used to request the next results page. This property is omitted on the final results page.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaDatasetList {
  
  inline def apply(): SchemaDatasetList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDatasetList]
  }
  
  extension [Self <: SchemaDatasetList](x: Self) {
    
    inline def setDatasets(value: js.Array[DatasetReference]): Self = StObject.set(x, "datasets", value.asInstanceOf[js.Any])
    
    inline def setDatasetsNull: Self = StObject.set(x, "datasets", null)
    
    inline def setDatasetsUndefined: Self = StObject.set(x, "datasets", js.undefined)
    
    inline def setDatasetsVarargs(value: DatasetReference*): Self = StObject.set(x, "datasets", js.Array(value*))
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagNull: Self = StObject.set(x, "etag", null)
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
