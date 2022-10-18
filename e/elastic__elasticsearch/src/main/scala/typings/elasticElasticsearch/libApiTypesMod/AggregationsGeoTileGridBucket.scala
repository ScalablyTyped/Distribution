package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsGeoTileGridBucket
  extends StObject
     with AggregationsGeoTileGridBucketKeys
     with /* property */ StringDictionary[AggregationsAggregate | GeoTile | long]
object AggregationsGeoTileGridBucket {
  
  inline def apply(doc_count: long, key: GeoTile): AggregationsGeoTileGridBucket = {
    val __obj = js.Dynamic.literal(doc_count = doc_count.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregationsGeoTileGridBucket]
  }
}
