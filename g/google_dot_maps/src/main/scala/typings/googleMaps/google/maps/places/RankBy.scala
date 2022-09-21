package typings.googleMaps.google.maps.places

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RankBy extends StObject
/**
  * Ranking options for a PlaceSearchRequest.
  */
@JSGlobal("google.maps.places.RankBy")
@js.native
object RankBy extends StObject {
  
  /**
    * Ranks place results by distance from the location.
    */
  @js.native
  sealed trait DISTANCE
    extends StObject
       with RankBy
  
  /**
    * Ranks place results by their prominence.
    */
  @js.native
  sealed trait PROMINENCE
    extends StObject
       with RankBy
}
