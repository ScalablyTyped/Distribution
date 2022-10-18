package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryDslGeoDistanceQuery
  extends StObject
     with QueryDslGeoDistanceQueryKeys
     with /* property */ StringDictionary[
      GeoLocation | Distance | GeoDistanceType | QueryDslGeoValidationMethod | float | String
    ]
object QueryDslGeoDistanceQuery {
  
  inline def apply(): QueryDslGeoDistanceQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryDslGeoDistanceQuery]
  }
}
