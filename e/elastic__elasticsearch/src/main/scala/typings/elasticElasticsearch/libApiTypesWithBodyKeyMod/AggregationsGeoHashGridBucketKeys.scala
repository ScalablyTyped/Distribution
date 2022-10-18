package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsGeoHashGridBucketKeys
  extends StObject
     with AggregationsMultiBucketBase {
  
  var key: GeoHash
}
object AggregationsGeoHashGridBucketKeys {
  
  inline def apply(doc_count: long, key: GeoHash): AggregationsGeoHashGridBucketKeys = {
    val __obj = js.Dynamic.literal(doc_count = doc_count.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregationsGeoHashGridBucketKeys]
  }
  
  extension [Self <: AggregationsGeoHashGridBucketKeys](x: Self) {
    
    inline def setKey(value: GeoHash): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
