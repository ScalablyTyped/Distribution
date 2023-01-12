package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsGeoTileGridBucketKeys
  extends StObject
     with AggregationsMultiBucketBase {
  
  var key: GeoTile
}
object AggregationsGeoTileGridBucketKeys {
  
  inline def apply(doc_count: long, key: GeoTile): AggregationsGeoTileGridBucketKeys = {
    val __obj = js.Dynamic.literal(doc_count = doc_count.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregationsGeoTileGridBucketKeys]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggregationsGeoTileGridBucketKeys] (val x: Self) extends AnyVal {
    
    inline def setKey(value: GeoTile): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
