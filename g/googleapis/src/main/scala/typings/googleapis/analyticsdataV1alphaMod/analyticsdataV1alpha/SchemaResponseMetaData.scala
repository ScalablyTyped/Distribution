package typings.googleapis.analyticsdataV1alphaMod.analyticsdataV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaResponseMetaData extends StObject {
  
  /**
    * If true, indicates some buckets of dimension combinations are rolled into "(other)" row. This can happen for high cardinality reports.
    */
  var dataLossFromOtherRow: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaResponseMetaData {
  
  inline def apply(): SchemaResponseMetaData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResponseMetaData]
  }
  
  extension [Self <: SchemaResponseMetaData](x: Self) {
    
    inline def setDataLossFromOtherRow(value: Boolean): Self = StObject.set(x, "dataLossFromOtherRow", value.asInstanceOf[js.Any])
    
    inline def setDataLossFromOtherRowNull: Self = StObject.set(x, "dataLossFromOtherRow", null)
    
    inline def setDataLossFromOtherRowUndefined: Self = StObject.set(x, "dataLossFromOtherRow", js.undefined)
  }
}
