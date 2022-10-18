package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlGetRecordsResponse extends StObject {
  
  var count: long
  
  var records: js.Array[MlAnomaly]
}
object MlGetRecordsResponse {
  
  inline def apply(count: long, records: js.Array[MlAnomaly]): MlGetRecordsResponse = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], records = records.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlGetRecordsResponse]
  }
  
  extension [Self <: MlGetRecordsResponse](x: Self) {
    
    inline def setCount(value: long): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setRecords(value: js.Array[MlAnomaly]): Self = StObject.set(x, "records", value.asInstanceOf[js.Any])
    
    inline def setRecordsVarargs(value: MlAnomaly*): Self = StObject.set(x, "records", js.Array(value*))
  }
}
