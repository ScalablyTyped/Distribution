package typings.googleDashMaps

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.googlemaps.googleNs.mapsNs.placesNs.Autocomplete
import typings.googlemaps.googleNs.mapsNs.placesNs.AutocompleteService
import typings.googlemaps.googleNs.mapsNs.placesNs.AutocompleteSessionToken
import typings.googlemaps.googleNs.mapsNs.placesNs.PlacesService
import typings.googlemaps.googleNs.mapsNs.placesNs.SearchBox
import typings.std.HTMLDivElement
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofplaces extends js.Object {
  var Autocomplete: Instantiable1[
    /* inputField */ HTMLInputElement, 
    typings.googlemaps.googleNs.mapsNs.placesNs.Autocomplete
  ]
  var AutocompleteService: Instantiable0[typings.googlemaps.googleNs.mapsNs.placesNs.AutocompleteService]
  var AutocompleteSessionToken: Instantiable0[typings.googlemaps.googleNs.mapsNs.placesNs.AutocompleteSessionToken]
  var PlacesService: Instantiable1[
    /* attrContainer */ HTMLDivElement, 
    typings.googlemaps.googleNs.mapsNs.placesNs.PlacesService
  ]
  var SearchBox: Instantiable1[
    /* inputField */ HTMLInputElement, 
    typings.googlemaps.googleNs.mapsNs.placesNs.SearchBox
  ]
}

object Typeofplaces {
  @scala.inline
  def apply(
    Autocomplete: Instantiable1[/* inputField */ HTMLInputElement, Autocomplete],
    AutocompleteService: Instantiable0[AutocompleteService],
    AutocompleteSessionToken: Instantiable0[AutocompleteSessionToken],
    PlacesService: Instantiable1[/* attrContainer */ HTMLDivElement, PlacesService],
    SearchBox: Instantiable1[/* inputField */ HTMLInputElement, SearchBox]
  ): Typeofplaces = {
    val __obj = js.Dynamic.literal(Autocomplete = Autocomplete, AutocompleteService = AutocompleteService, AutocompleteSessionToken = AutocompleteSessionToken, PlacesService = PlacesService, SearchBox = SearchBox)
  
    __obj.asInstanceOf[Typeofplaces]
  }
}

