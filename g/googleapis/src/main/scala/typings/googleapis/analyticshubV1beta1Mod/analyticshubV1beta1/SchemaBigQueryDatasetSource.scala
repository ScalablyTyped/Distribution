package typings.googleapis.analyticshubV1beta1Mod.analyticshubV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBigQueryDatasetSource extends StObject {
  
  /**
    * Resource name of the dataset source for this listing. e.g. `projects/myproject/datasets/123`
    */
  var dataset: js.UndefOr[String | Null] = js.undefined
}
object SchemaBigQueryDatasetSource {
  
  inline def apply(): SchemaBigQueryDatasetSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBigQueryDatasetSource]
  }
  
  extension [Self <: SchemaBigQueryDatasetSource](x: Self) {
    
    inline def setDataset(value: String): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
    
    inline def setDatasetNull: Self = StObject.set(x, "dataset", null)
    
    inline def setDatasetUndefined: Self = StObject.set(x, "dataset", js.undefined)
  }
}
