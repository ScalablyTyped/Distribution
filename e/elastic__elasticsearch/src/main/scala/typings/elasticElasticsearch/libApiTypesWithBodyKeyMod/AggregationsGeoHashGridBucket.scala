package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsGeoHashGridBucket
  extends StObject
     with AggregationsGeoHashGridBucketKeys
     with /* property */ StringDictionary[AggregationsAggregate | GeoHash | long]
object AggregationsGeoHashGridBucket {
  
  inline def apply(doc_count: long, key: GeoHash): AggregationsGeoHashGridBucket = {
    val __obj = js.Dynamic.literal(doc_count = doc_count.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregationsGeoHashGridBucket]
  }
}
