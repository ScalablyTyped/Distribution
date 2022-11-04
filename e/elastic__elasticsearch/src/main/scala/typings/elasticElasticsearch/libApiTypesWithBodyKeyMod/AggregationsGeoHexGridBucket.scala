package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsGeoHexGridBucket
  extends StObject
     with AggregationsGeoHexGridBucketKeys
     with /* property */ StringDictionary[AggregationsAggregate | GeoHexCell | long]
object AggregationsGeoHexGridBucket {
  
  inline def apply(doc_count: long, key: GeoHexCell): AggregationsGeoHexGridBucket = {
    val __obj = js.Dynamic.literal(doc_count = doc_count.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregationsGeoHexGridBucket]
  }
}
