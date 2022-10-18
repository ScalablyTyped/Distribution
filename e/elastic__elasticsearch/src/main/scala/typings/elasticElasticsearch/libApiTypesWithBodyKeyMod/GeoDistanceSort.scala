package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeoDistanceSort
  extends StObject
     with GeoDistanceSortKeys
     with /* property */ StringDictionary[
      GeoLocation | js.Array[GeoLocation] | SortMode | GeoDistanceType | Boolean | SortOrder | DistanceUnit
    ]
object GeoDistanceSort {
  
  inline def apply(): GeoDistanceSort = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeoDistanceSort]
  }
}
