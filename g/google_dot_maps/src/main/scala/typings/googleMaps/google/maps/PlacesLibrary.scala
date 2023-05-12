package typings.googleMaps.google.maps

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.googleMaps.anon.TypeofPlace
import typings.googleMaps.google.maps.places.AddressComponent
import typings.googleMaps.google.maps.places.Attribution
import typings.googleMaps.google.maps.places.Autocomplete
import typings.googleMaps.google.maps.places.AutocompleteOptions
import typings.googleMaps.google.maps.places.AutocompleteService
import typings.googleMaps.google.maps.places.AutocompleteSessionToken
import typings.googleMaps.google.maps.places.OpeningHours
import typings.googleMaps.google.maps.places.OpeningHoursPeriod
import typings.googleMaps.google.maps.places.OpeningHoursPoint
import typings.googleMaps.google.maps.places.Photo
import typings.googleMaps.google.maps.places.PhotoAttribution
import typings.googleMaps.google.maps.places.PlacesService
import typings.googleMaps.google.maps.places.PlusCode
import typings.googleMaps.google.maps.places.Review
import typings.googleMaps.google.maps.places.SearchBox
import typings.googleMaps.google.maps.places.SearchBoxOptions
import typings.std.HTMLDivElement
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlacesLibrary extends StObject {
  
  var AddressComponent: Instantiable0[typings.googleMaps.google.maps.places.AddressComponent]
  
  var Attribution: Instantiable0[typings.googleMaps.google.maps.places.Attribution]
  
  var Autocomplete: Instantiable2[
    /* inputField */ HTMLInputElement, 
    /* opts */ js.UndefOr[AutocompleteOptions | Null], 
    typings.googleMaps.google.maps.places.Autocomplete
  ]
  
  var AutocompleteService: Instantiable0[typings.googleMaps.google.maps.places.AutocompleteService]
  
  var AutocompleteSessionToken: Instantiable0[typings.googleMaps.google.maps.places.AutocompleteSessionToken]
  
  var BusinessStatus: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.maps.places.BusinessStatus */ Any
  
  var OpeningHours: Instantiable0[typings.googleMaps.google.maps.places.OpeningHours]
  
  var OpeningHoursPeriod: Instantiable0[typings.googleMaps.google.maps.places.OpeningHoursPeriod]
  
  var OpeningHoursPoint: Instantiable0[typings.googleMaps.google.maps.places.OpeningHoursPoint]
  
  var Photo: Instantiable0[typings.googleMaps.google.maps.places.Photo]
  
  var PhotoAttribution: Instantiable0[typings.googleMaps.google.maps.places.PhotoAttribution]
  
  var Place: TypeofPlace
  
  var PlacesService: Instantiable1[
    /* attrContainer */ HTMLDivElement | Map, 
    typings.googleMaps.google.maps.places.PlacesService
  ]
  
  var PlacesServiceStatus: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.maps.places.PlacesServiceStatus */ Any
  
  var PlusCode: Instantiable0[typings.googleMaps.google.maps.places.PlusCode]
  
  var PriceLevel: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.maps.places.PriceLevel */ Any
  
  var RankBy: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.maps.places.RankBy */ Any
  
  var Review: Instantiable0[typings.googleMaps.google.maps.places.Review]
  
  var SearchBox: Instantiable2[
    /* inputField */ HTMLInputElement, 
    /* opts */ js.UndefOr[SearchBoxOptions | Null], 
    typings.googleMaps.google.maps.places.SearchBox
  ]
}
object PlacesLibrary {
  
  inline def apply(
    AddressComponent: Instantiable0[AddressComponent],
    Attribution: Instantiable0[Attribution],
    Autocomplete: Instantiable2[
      /* inputField */ HTMLInputElement, 
      /* opts */ js.UndefOr[AutocompleteOptions | Null], 
      Autocomplete
    ],
    AutocompleteService: Instantiable0[AutocompleteService],
    AutocompleteSessionToken: Instantiable0[AutocompleteSessionToken],
    BusinessStatus: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.maps.places.BusinessStatus */ Any,
    OpeningHours: Instantiable0[OpeningHours],
    OpeningHoursPeriod: Instantiable0[OpeningHoursPeriod],
    OpeningHoursPoint: Instantiable0[OpeningHoursPoint],
    Photo: Instantiable0[Photo],
    PhotoAttribution: Instantiable0[PhotoAttribution],
    Place: TypeofPlace,
    PlacesService: Instantiable1[/* attrContainer */ HTMLDivElement | Map, PlacesService],
    PlacesServiceStatus: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.maps.places.PlacesServiceStatus */ Any,
    PlusCode: Instantiable0[PlusCode],
    PriceLevel: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.maps.places.PriceLevel */ Any,
    RankBy: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.maps.places.RankBy */ Any,
    Review: Instantiable0[Review],
    SearchBox: Instantiable2[
      /* inputField */ HTMLInputElement, 
      /* opts */ js.UndefOr[SearchBoxOptions | Null], 
      SearchBox
    ]
  ): PlacesLibrary = {
    val __obj = js.Dynamic.literal(AddressComponent = AddressComponent.asInstanceOf[js.Any], Attribution = Attribution.asInstanceOf[js.Any], Autocomplete = Autocomplete.asInstanceOf[js.Any], AutocompleteService = AutocompleteService.asInstanceOf[js.Any], AutocompleteSessionToken = AutocompleteSessionToken.asInstanceOf[js.Any], BusinessStatus = BusinessStatus.asInstanceOf[js.Any], OpeningHours = OpeningHours.asInstanceOf[js.Any], OpeningHoursPeriod = OpeningHoursPeriod.asInstanceOf[js.Any], OpeningHoursPoint = OpeningHoursPoint.asInstanceOf[js.Any], Photo = Photo.asInstanceOf[js.Any], PhotoAttribution = PhotoAttribution.asInstanceOf[js.Any], Place = Place.asInstanceOf[js.Any], PlacesService = PlacesService.asInstanceOf[js.Any], PlacesServiceStatus = PlacesServiceStatus.asInstanceOf[js.Any], PlusCode = PlusCode.asInstanceOf[js.Any], PriceLevel = PriceLevel.asInstanceOf[js.Any], RankBy = RankBy.asInstanceOf[js.Any], Review = Review.asInstanceOf[js.Any], SearchBox = SearchBox.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlacesLibrary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlacesLibrary] (val x: Self) extends AnyVal {
    
    inline def setAddressComponent(value: Instantiable0[AddressComponent]): Self = StObject.set(x, "AddressComponent", value.asInstanceOf[js.Any])
    
    inline def setAttribution(value: Instantiable0[Attribution]): Self = StObject.set(x, "Attribution", value.asInstanceOf[js.Any])
    
    inline def setAutocomplete(
      value: Instantiable2[
          /* inputField */ HTMLInputElement, 
          /* opts */ js.UndefOr[AutocompleteOptions | Null], 
          Autocomplete
        ]
    ): Self = StObject.set(x, "Autocomplete", value.asInstanceOf[js.Any])
    
    inline def setAutocompleteService(value: Instantiable0[AutocompleteService]): Self = StObject.set(x, "AutocompleteService", value.asInstanceOf[js.Any])
    
    inline def setAutocompleteSessionToken(value: Instantiable0[AutocompleteSessionToken]): Self = StObject.set(x, "AutocompleteSessionToken", value.asInstanceOf[js.Any])
    
    inline def setBusinessStatus(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.maps.places.BusinessStatus */ Any
    ): Self = StObject.set(x, "BusinessStatus", value.asInstanceOf[js.Any])
    
    inline def setOpeningHours(value: Instantiable0[OpeningHours]): Self = StObject.set(x, "OpeningHours", value.asInstanceOf[js.Any])
    
    inline def setOpeningHoursPeriod(value: Instantiable0[OpeningHoursPeriod]): Self = StObject.set(x, "OpeningHoursPeriod", value.asInstanceOf[js.Any])
    
    inline def setOpeningHoursPoint(value: Instantiable0[OpeningHoursPoint]): Self = StObject.set(x, "OpeningHoursPoint", value.asInstanceOf[js.Any])
    
    inline def setPhoto(value: Instantiable0[Photo]): Self = StObject.set(x, "Photo", value.asInstanceOf[js.Any])
    
    inline def setPhotoAttribution(value: Instantiable0[PhotoAttribution]): Self = StObject.set(x, "PhotoAttribution", value.asInstanceOf[js.Any])
    
    inline def setPlace(value: TypeofPlace): Self = StObject.set(x, "Place", value.asInstanceOf[js.Any])
    
    inline def setPlacesService(value: Instantiable1[/* attrContainer */ HTMLDivElement | Map, PlacesService]): Self = StObject.set(x, "PlacesService", value.asInstanceOf[js.Any])
    
    inline def setPlacesServiceStatus(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.maps.places.PlacesServiceStatus */ Any
    ): Self = StObject.set(x, "PlacesServiceStatus", value.asInstanceOf[js.Any])
    
    inline def setPlusCode(value: Instantiable0[PlusCode]): Self = StObject.set(x, "PlusCode", value.asInstanceOf[js.Any])
    
    inline def setPriceLevel(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.maps.places.PriceLevel */ Any
    ): Self = StObject.set(x, "PriceLevel", value.asInstanceOf[js.Any])
    
    inline def setRankBy(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.maps.places.RankBy */ Any
    ): Self = StObject.set(x, "RankBy", value.asInstanceOf[js.Any])
    
    inline def setReview(value: Instantiable0[Review]): Self = StObject.set(x, "Review", value.asInstanceOf[js.Any])
    
    inline def setSearchBox(
      value: Instantiable2[
          /* inputField */ HTMLInputElement, 
          /* opts */ js.UndefOr[SearchBoxOptions | Null], 
          SearchBox
        ]
    ): Self = StObject.set(x, "SearchBox", value.asInstanceOf[js.Any])
  }
}
