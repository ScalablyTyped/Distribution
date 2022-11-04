package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsGeoHexGridBucketKeys
  extends StObject
     with AggregationsMultiBucketBase {
  
  var key: GeoHexCell
}
object AggregationsGeoHexGridBucketKeys {
  
  inline def apply(doc_count: long, key: GeoHexCell): AggregationsGeoHexGridBucketKeys = {
    val __obj = js.Dynamic.literal(doc_count = doc_count.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregationsGeoHexGridBucketKeys]
  }
  
  extension [Self <: AggregationsGeoHexGridBucketKeys](x: Self) {
    
    inline def setKey(value: GeoHexCell): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
