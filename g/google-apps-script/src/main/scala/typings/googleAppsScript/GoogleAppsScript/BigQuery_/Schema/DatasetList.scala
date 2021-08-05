package typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatasetList extends StObject {
  
  var datasets: js.UndefOr[js.Array[DatasetListDatasets]] = js.undefined
  
  var etag: js.UndefOr[String] = js.undefined
  
  var kind: js.UndefOr[String] = js.undefined
  
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object DatasetList {
  
  inline def apply(): DatasetList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatasetList]
  }
  
  extension [Self <: DatasetList](x: Self) {
    
    inline def setDatasets(value: js.Array[DatasetListDatasets]): Self = StObject.set(x, "datasets", value.asInstanceOf[js.Any])
    
    inline def setDatasetsUndefined: Self = StObject.set(x, "datasets", js.undefined)
    
    inline def setDatasetsVarargs(value: DatasetListDatasets*): Self = StObject.set(x, "datasets", js.Array(value :_*))
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
