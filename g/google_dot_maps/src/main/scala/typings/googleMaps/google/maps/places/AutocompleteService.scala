package typings.googleMaps.google.maps.places

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains methods related to retrieving Autocomplete predictions.
  */
@js.native
trait AutocompleteService extends StObject {
  
  /**
    * Retrieves place autocomplete predictions based on the supplied
    * autocomplete request.
    * @param request The autocompletion request.
    * @param callback A callback accepting an array of AutocompletePrediction
    *     objects and a PlacesServiceStatus value as argument.
    */
  def getPlacePredictions(request: AutocompletionRequest): js.Promise[AutocompleteResponse] = js.native
  def getPlacePredictions(
    request: AutocompletionRequest,
    callback: js.Function2[/* a */ js.Array[AutocompletePrediction] | Null, /* b */ PlacesServiceStatus, Unit]
  ): js.Promise[AutocompleteResponse] = js.native
  
  /**
    * Retrieves query autocomplete predictions based on the supplied query
    * autocomplete request.
    * @param request The query autocompletion request.
    * @param callback A callback accepting an array of
    *     QueryAutocompletePrediction objects and a PlacesServiceStatus value
    *     as argument.
    */
  def getQueryPredictions(
    request: QueryAutocompletionRequest,
    callback: js.Function2[
      /* a */ js.Array[QueryAutocompletePrediction] | Null, 
      /* b */ PlacesServiceStatus, 
      Unit
    ]
  ): Unit = js.native
}
