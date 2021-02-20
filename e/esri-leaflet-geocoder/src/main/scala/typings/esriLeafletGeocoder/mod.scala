package typings.esriLeafletGeocoder

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.esriLeafletGeocoder.anon.Address
import typings.leaflet.mod.ControlPosition
import typings.leaflet.mod.Control_
import typings.leaflet.mod.Evented
import typings.leaflet.mod.GeoJSON_
import typings.leaflet.mod.LatLngBoundsExpression
import typings.leaflet.mod.LatLngExpression
import typings.leaflet.mod.LatLngTuple
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  object esri {
    
    object Geocoding {
      
      @JSImport("leaflet", "esri.Geocoding.ArcgisOnlineProvider")
      @js.native
      class ArcgisOnlineProvider_ ()
        extends GeocodeService_
           with GeosearchProvider {
        def this(options: ArcgisOnlineProviderOptions) = this()
      }
      
      /* import warning: RemoveDifficultInheritance.summarizeChanges 
      - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FeatureLayerService * / any */ @JSImport("leaflet", "esri.Geocoding.FeatureLayerProvider")
      @js.native
      class FeatureLayerProvider_ () extends GeosearchProvider {
        def this(options: FeatureLayerProviderOptions) = this()
      }
      
      @JSImport("leaflet", "esri.Geocoding.GeocodeServiceProvider")
      @js.native
      class GeocodeServiceProvider_ ()
        extends GeocodeService_
           with GeosearchProvider {
        def this(options: GeocodeServiceProviderOptions) = this()
      }
      
      /* import warning: RemoveDifficultInheritance.summarizeChanges 
      - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Service * / any */ @JSImport("leaflet", "esri.Geocoding.GeocodeService")
      @js.native
      class GeocodeService_ () extends StObject {
        def this(options: GeocodeServiceOptions) = this()
        
        def geocode(): Geocode_ = js.native
        
        def reverse(): ReverseGeocode_ = js.native
        
        def suggest(): Suggest_ = js.native
      }
      
      /* import warning: RemoveDifficultInheritance.summarizeChanges 
      - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Task * / any */ @JSImport("leaflet", "esri.Geocoding.Geocode")
      @js.native
      class Geocode_ () extends StObject {
        def this(options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TaskOptions */ js.Any) = this()
        
        def address(text: String): this.type = js.native
        
        def category(text: String): this.type = js.native
        
        def city(text: String): this.type = js.native
        
        def country(text: String): this.type = js.native
        
        def nearby(latlng: LatLngExpression, distance: Double): this.type = js.native
        
        def neighborhood(text: String): this.type = js.native
        
        def postal(text: String): this.type = js.native
        
        def region(text: String): this.type = js.native
        
        def run(
          callback: js.Function3[
                  /* error */ js.UndefOr[js.Any], 
                  /* results */ typings.esriLeafletGeocoder.anon.Results, 
                  /* response */ js.Any, 
                  Unit
                ]
        ): this.type = js.native
        def run(
          callback: js.Function3[
                  /* error */ js.UndefOr[js.Any], 
                  /* results */ typings.esriLeafletGeocoder.anon.Results, 
                  /* response */ js.Any, 
                  Unit
                ],
          context: js.Any
        ): this.type = js.native
        
        def subregion(text: String): this.type = js.native
        
        def text(text: String): this.type = js.native
        
        def within(bounds: LatLngBoundsExpression): this.type = js.native
      }
      
      @JSImport("leaflet", "esri.Geocoding.Geosearch")
      @js.native
      val Geosearch_ : GeosearchConstructor = js.native
      
      type Geosearch_ = GeosearchControl with Evented
      
      /* import warning: RemoveDifficultInheritance.summarizeChanges 
      - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MapService * / any */ @JSImport("leaflet", "esri.Geocoding.MapServiceProvider")
      @js.native
      class MapServiceProvider_ () extends GeosearchProvider {
        def this(options: MapServiceProviderOptions) = this()
      }
      
      /* import warning: RemoveDifficultInheritance.summarizeChanges 
      - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Task * / any */ @JSImport("leaflet", "esri.Geocoding.ReverseGeocode")
      @js.native
      class ReverseGeocode_ () extends StObject {
        def this(options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TaskOptions */ js.Any) = this()
        
        def distance(distance: Double): this.type = js.native
        
        def language(language: String): this.type = js.native
        
        def latlng(latlng: LatLngExpression): this.type = js.native
        
        def run(
          callback: js.Function3[/* error */ js.UndefOr[js.Any], /* results */ Address, /* response */ js.Any, Unit]
        ): this.type = js.native
        def run(
          callback: js.Function3[/* error */ js.UndefOr[js.Any], /* results */ Address, /* response */ js.Any, Unit],
          context: js.Any
        ): this.type = js.native
      }
      
      /* import warning: RemoveDifficultInheritance.summarizeChanges 
      - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Task * / any */ @JSImport("leaflet", "esri.Geocoding.Suggest")
      @js.native
      class Suggest_ () extends StObject {
        def this(options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TaskOptions */ js.Any) = this()
        
        def category(text: String): this.type = js.native
        
        def nearby(latlng: LatLngExpression, distance: Double): this.type = js.native
        
        def run(
          callback: js.Function3[/* error */ js.UndefOr[js.Any], /* results */ js.Any, /* response */ js.Any, Unit]
        ): this.type = js.native
        def run(
          callback: js.Function3[/* error */ js.UndefOr[js.Any], /* results */ js.Any, /* response */ js.Any, Unit],
          context: js.Any
        ): this.type = js.native
        
        def text(text: String): this.type = js.native
        
        def within(bounds: LatLngBoundsExpression): this.type = js.native
      }
      
      @JSImport("leaflet", "esri.Geocoding.arcgisOnlineProvider")
      @js.native
      def arcgisOnlineProvider(): ArcgisOnlineProvider_ = js.native
      @JSImport("leaflet", "esri.Geocoding.arcgisOnlineProvider")
      @js.native
      def arcgisOnlineProvider(options: ArcgisOnlineProviderOptions): ArcgisOnlineProvider_ = js.native
      
      @JSImport("leaflet", "esri.Geocoding.featureLayerProvider")
      @js.native
      def featureLayerProvider(): FeatureLayerProvider_ = js.native
      @JSImport("leaflet", "esri.Geocoding.featureLayerProvider")
      @js.native
      def featureLayerProvider(options: FeatureLayerProviderOptions): FeatureLayerProvider_ = js.native
      
      @JSImport("leaflet", "esri.Geocoding.geocode")
      @js.native
      def geocode(): Geocode_ = js.native
      @JSImport("leaflet", "esri.Geocoding.geocode")
      @js.native
      def geocode(
        options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TaskOptions */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Service */ js.Any
      ): Geocode_ = js.native
      
      @JSImport("leaflet", "esri.Geocoding.geocodeService")
      @js.native
      def geocodeService(): GeocodeService_ = js.native
      @JSImport("leaflet", "esri.Geocoding.geocodeService")
      @js.native
      def geocodeService(options: GeocodeServiceOptions): GeocodeService_ = js.native
      
      @JSImport("leaflet", "esri.Geocoding.geocodeServiceProvider")
      @js.native
      def geocodeServiceProvider(): GeocodeServiceProvider_ = js.native
      @JSImport("leaflet", "esri.Geocoding.geocodeServiceProvider")
      @js.native
      def geocodeServiceProvider(options: GeocodeServiceProviderOptions): GeocodeServiceProvider_ = js.native
      
      @JSImport("leaflet", "esri.Geocoding.geosearch")
      @js.native
      def geosearch(): typings.esriLeafletGeocoder.mod.esri.Geocoding.Geosearch_ = js.native
      @JSImport("leaflet", "esri.Geocoding.geosearch")
      @js.native
      def geosearch(options: GeosearchObject): typings.esriLeafletGeocoder.mod.esri.Geocoding.Geosearch_ = js.native
      
      @JSImport("leaflet", "esri.Geocoding.mapServiceProvider")
      @js.native
      def mapServiceProvider(): MapServiceProvider_ = js.native
      @JSImport("leaflet", "esri.Geocoding.mapServiceProvider")
      @js.native
      def mapServiceProvider(options: MapServiceProviderOptions): MapServiceProvider_ = js.native
      
      @JSImport("leaflet", "esri.Geocoding.reverseGeocode")
      @js.native
      def reverseGeocode(): ReverseGeocode_ = js.native
      @JSImport("leaflet", "esri.Geocoding.reverseGeocode")
      @js.native
      def reverseGeocode(
        options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TaskOptions */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Service */ js.Any
      ): ReverseGeocode_ = js.native
      
      @JSImport("leaflet", "esri.Geocoding.suggest")
      @js.native
      def suggest(): Suggest_ = js.native
      @JSImport("leaflet", "esri.Geocoding.suggest")
      @js.native
      def suggest(
        options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TaskOptions */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Service */ js.Any
      ): Suggest_ = js.native
      
      @js.native
      trait ArcgisOnlineProviderOptions extends BaseProviderOptions {
        
        var categories: js.UndefOr[String | js.Array[String]] = js.native
        
        var countries: js.UndefOr[String | js.Array[String]] = js.native
        
        var forStorage: js.UndefOr[Boolean] = js.native
      }
      object ArcgisOnlineProviderOptions {
        
        @scala.inline
        def apply(): ArcgisOnlineProviderOptions = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[ArcgisOnlineProviderOptions]
        }
        
        @scala.inline
        implicit class ArcgisOnlineProviderOptionsMutableBuilder[Self <: ArcgisOnlineProviderOptions] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setCategories(value: String | js.Array[String]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
          
          @scala.inline
          def setCategoriesVarargs(value: String*): Self = StObject.set(x, "categories", js.Array(value :_*))
          
          @scala.inline
          def setCountries(value: String | js.Array[String]): Self = StObject.set(x, "countries", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setCountriesUndefined: Self = StObject.set(x, "countries", js.undefined)
          
          @scala.inline
          def setCountriesVarargs(value: String*): Self = StObject.set(x, "countries", js.Array(value :_*))
          
          @scala.inline
          def setForStorage(value: Boolean): Self = StObject.set(x, "forStorage", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setForStorageUndefined: Self = StObject.set(x, "forStorage", js.undefined)
        }
      }
      
      @js.native
      trait BaseProviderOptions extends StObject {
        
        var attribution: js.UndefOr[String] = js.native
        
        var label: js.UndefOr[String] = js.native
        
        var maxResults: js.UndefOr[Double] = js.native
        
        var token: js.UndefOr[String | Null] = js.native
      }
      object BaseProviderOptions {
        
        @scala.inline
        def apply(): BaseProviderOptions = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[BaseProviderOptions]
        }
        
        @scala.inline
        implicit class BaseProviderOptionsMutableBuilder[Self <: BaseProviderOptions] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setAttribution(value: String): Self = StObject.set(x, "attribution", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setAttributionUndefined: Self = StObject.set(x, "attribution", js.undefined)
          
          @scala.inline
          def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
          
          @scala.inline
          def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
          
          @scala.inline
          def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setTokenNull: Self = StObject.set(x, "token", null)
          
          @scala.inline
          def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
        }
      }
      
      @js.native
      trait FeatureLayerProviderOptions extends BaseProviderOptions {
        
        var bufferRadius: js.UndefOr[Double] = js.native
        
        var formatSuggestion: js.UndefOr[js.Function1[/* featureInformation */ js.Any, String]] = js.native
        
        var searchFields: js.UndefOr[String | js.Array[String]] = js.native
        
        var url: String = js.native
      }
      object FeatureLayerProviderOptions {
        
        @scala.inline
        def apply(url: String): FeatureLayerProviderOptions = {
          val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
          __obj.asInstanceOf[FeatureLayerProviderOptions]
        }
        
        @scala.inline
        implicit class FeatureLayerProviderOptionsMutableBuilder[Self <: FeatureLayerProviderOptions] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setBufferRadius(value: Double): Self = StObject.set(x, "bufferRadius", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setBufferRadiusUndefined: Self = StObject.set(x, "bufferRadius", js.undefined)
          
          @scala.inline
          def setFormatSuggestion(value: /* featureInformation */ js.Any => String): Self = StObject.set(x, "formatSuggestion", js.Any.fromFunction1(value))
          
          @scala.inline
          def setFormatSuggestionUndefined: Self = StObject.set(x, "formatSuggestion", js.undefined)
          
          @scala.inline
          def setSearchFields(value: String | js.Array[String]): Self = StObject.set(x, "searchFields", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setSearchFieldsUndefined: Self = StObject.set(x, "searchFields", js.undefined)
          
          @scala.inline
          def setSearchFieldsVarargs(value: String*): Self = StObject.set(x, "searchFields", js.Array(value :_*))
          
          @scala.inline
          def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
        }
      }
      
      /* import warning: RemoveDifficultInheritance.summarizeChanges 
      - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ServiceOptions * / any */ @js.native
      trait GeocodeServiceOptions extends StObject {
        
        var supportsSuggest: js.UndefOr[Boolean] = js.native
      }
      object GeocodeServiceOptions {
        
        @scala.inline
        def apply(): GeocodeServiceOptions = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[GeocodeServiceOptions]
        }
        
        @scala.inline
        implicit class GeocodeServiceOptionsMutableBuilder[Self <: GeocodeServiceOptions] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setSupportsSuggest(value: Boolean): Self = StObject.set(x, "supportsSuggest", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setSupportsSuggestUndefined: Self = StObject.set(x, "supportsSuggest", js.undefined)
        }
      }
      
      @js.native
      trait GeocodeServiceProviderOptions extends BaseProviderOptions {
        
        var url: String = js.native
      }
      object GeocodeServiceProviderOptions {
        
        @scala.inline
        def apply(url: String): GeocodeServiceProviderOptions = {
          val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
          __obj.asInstanceOf[GeocodeServiceProviderOptions]
        }
        
        @scala.inline
        implicit class GeocodeServiceProviderOptionsMutableBuilder[Self <: GeocodeServiceProviderOptions] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
        }
      }
      
      type GeosearchCallback = js.Function2[/* error */ js.UndefOr[js.Any], /* results */ js.Any, Unit]
      
      type GeosearchConstructor = Instantiable1[
            /* options */ js.UndefOr[GeosearchObject], 
            typings.esriLeafletGeocoder.mod.esri.Geocoding.Geosearch_
          ]
      
      @js.native
      trait GeosearchControl extends Control_ {
        
        def clear(): this.type = js.native
        
        def clearSuggestions(): this.type = js.native
        
        def disable(): this.type = js.native
        
        def enable(): this.type = js.native
      }
      
      @js.native
      trait GeosearchObject extends StObject {
        
        var allowMultipleResults: js.UndefOr[Boolean] = js.native
        
        var collapseAfterResult: js.UndefOr[Boolean] = js.native
        
        var expanded: js.UndefOr[Boolean] = js.native
        
        var placeholder: js.UndefOr[String] = js.native
        
        var position: js.UndefOr[ControlPosition] = js.native
        
        var providers: js.UndefOr[js.Array[GeosearchProvider]] = js.native
        
        var searchBounds: js.UndefOr[LatLngBoundsExpression | Null] = js.native
        
        var title: js.UndefOr[String] = js.native
        
        var useMapBounds: js.UndefOr[Boolean | Double] = js.native
        
        var zoomToResult: js.UndefOr[Boolean] = js.native
      }
      object GeosearchObject {
        
        @scala.inline
        def apply(): GeosearchObject = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[GeosearchObject]
        }
        
        @scala.inline
        implicit class GeosearchObjectMutableBuilder[Self <: GeosearchObject] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setAllowMultipleResults(value: Boolean): Self = StObject.set(x, "allowMultipleResults", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setAllowMultipleResultsUndefined: Self = StObject.set(x, "allowMultipleResults", js.undefined)
          
          @scala.inline
          def setCollapseAfterResult(value: Boolean): Self = StObject.set(x, "collapseAfterResult", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setCollapseAfterResultUndefined: Self = StObject.set(x, "collapseAfterResult", js.undefined)
          
          @scala.inline
          def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
          
          @scala.inline
          def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
          
          @scala.inline
          def setPosition(value: ControlPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
          
          @scala.inline
          def setProviders(value: js.Array[GeosearchProvider]): Self = StObject.set(x, "providers", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setProvidersUndefined: Self = StObject.set(x, "providers", js.undefined)
          
          @scala.inline
          def setProvidersVarargs(value: GeosearchProvider*): Self = StObject.set(x, "providers", js.Array(value :_*))
          
          @scala.inline
          def setSearchBounds(value: LatLngBoundsExpression): Self = StObject.set(x, "searchBounds", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setSearchBoundsNull: Self = StObject.set(x, "searchBounds", null)
          
          @scala.inline
          def setSearchBoundsUndefined: Self = StObject.set(x, "searchBounds", js.undefined)
          
          @scala.inline
          def setSearchBoundsVarargs(value: LatLngTuple*): Self = StObject.set(x, "searchBounds", js.Array(value :_*))
          
          @scala.inline
          def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
          
          @scala.inline
          def setUseMapBounds(value: Boolean | Double): Self = StObject.set(x, "useMapBounds", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setUseMapBoundsUndefined: Self = StObject.set(x, "useMapBounds", js.undefined)
          
          @scala.inline
          def setZoomToResult(value: Boolean): Self = StObject.set(x, "zoomToResult", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setZoomToResultUndefined: Self = StObject.set(x, "zoomToResult", js.undefined)
        }
      }
      
      @js.native
      trait GeosearchProvider extends StObject {
        
        def results(text: String, key: String, bounds: js.UndefOr[LatLngBoundsExpression], callback: GeosearchCallback): js.Any = js.native
        def results(text: String, key: String, bounds: Null, callback: GeosearchCallback): js.Any = js.native
        
        def suggestions(text: String, bounds: js.UndefOr[LatLngBoundsExpression], callback: GeosearchCallback): js.Any = js.native
        def suggestions(text: String, bounds: Null, callback: GeosearchCallback): js.Any = js.native
      }
      
      @js.native
      trait MapServiceProviderOptions extends BaseProviderOptions {
        
        var bufferRadius: Double | js.Array[Double] = js.native
        
        def formatSuggestion(featureInformation: js.Any): String = js.native
        
        var layers: Double | js.Array[Double] = js.native
        
        var searchFields: String | js.Array[String] = js.native
        
        var url: String = js.native
      }
      object MapServiceProviderOptions {
        
        @scala.inline
        def apply(
          bufferRadius: Double | js.Array[Double],
          formatSuggestion: js.Any => String,
          layers: Double | js.Array[Double],
          searchFields: String | js.Array[String],
          url: String
        ): MapServiceProviderOptions = {
          val __obj = js.Dynamic.literal(bufferRadius = bufferRadius.asInstanceOf[js.Any], formatSuggestion = js.Any.fromFunction1(formatSuggestion), layers = layers.asInstanceOf[js.Any], searchFields = searchFields.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
          __obj.asInstanceOf[MapServiceProviderOptions]
        }
        
        @scala.inline
        implicit class MapServiceProviderOptionsMutableBuilder[Self <: MapServiceProviderOptions] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setBufferRadius(value: Double | js.Array[Double]): Self = StObject.set(x, "bufferRadius", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setBufferRadiusVarargs(value: Double*): Self = StObject.set(x, "bufferRadius", js.Array(value :_*))
          
          @scala.inline
          def setFormatSuggestion(value: js.Any => String): Self = StObject.set(x, "formatSuggestion", js.Any.fromFunction1(value))
          
          @scala.inline
          def setLayers(value: Double | js.Array[Double]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setLayersVarargs(value: Double*): Self = StObject.set(x, "layers", js.Array(value :_*))
          
          @scala.inline
          def setSearchFields(value: String | js.Array[String]): Self = StObject.set(x, "searchFields", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setSearchFieldsVarargs(value: String*): Self = StObject.set(x, "searchFields", js.Array(value :_*))
          
          @scala.inline
          def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
        }
      }
      
      @js.native
      trait ResultObject
        extends /* key */ StringDictionary[js.Any] {
        
        var bounds: js.UndefOr[LatLngBoundsExpression] = js.native
        
        var geojson: js.UndefOr[GeoJSON_[_]] = js.native
        
        var latlng: js.UndefOr[LatLngExpression] = js.native
        
        var properties: js.UndefOr[js.Any] = js.native
        
        var text: js.UndefOr[String] = js.native
      }
      object ResultObject {
        
        @scala.inline
        def apply(): ResultObject = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[ResultObject]
        }
        
        @scala.inline
        implicit class ResultObjectMutableBuilder[Self <: ResultObject] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setBounds(value: LatLngBoundsExpression): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
          
          @scala.inline
          def setBoundsVarargs(value: LatLngTuple*): Self = StObject.set(x, "bounds", js.Array(value :_*))
          
          @scala.inline
          def setGeojson(value: GeoJSON_[_]): Self = StObject.set(x, "geojson", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setGeojsonUndefined: Self = StObject.set(x, "geojson", js.undefined)
          
          @scala.inline
          def setLatlng(value: LatLngExpression): Self = StObject.set(x, "latlng", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setLatlngUndefined: Self = StObject.set(x, "latlng", js.undefined)
          
          @scala.inline
          def setProperties(value: js.Any): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
          
          @scala.inline
          def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
        }
      }
      
      @js.native
      trait Results extends StObject {
        
        var bounds: LatLngBoundsExpression = js.native
        
        var latlng: LatLngExpression = js.native
        
        var results: js.Array[ResultObject] = js.native
      }
      object Results {
        
        @scala.inline
        def apply(bounds: LatLngBoundsExpression, latlng: LatLngExpression, results: js.Array[ResultObject]): Results = {
          val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], latlng = latlng.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
          __obj.asInstanceOf[Results]
        }
        
        @scala.inline
        implicit class ResultsMutableBuilder[Self <: Results] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setBounds(value: LatLngBoundsExpression): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setBoundsVarargs(value: LatLngTuple*): Self = StObject.set(x, "bounds", js.Array(value :_*))
          
          @scala.inline
          def setLatlng(value: LatLngExpression): Self = StObject.set(x, "latlng", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setResults(value: js.Array[ResultObject]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setResultsVarargs(value: ResultObject*): Self = StObject.set(x, "results", js.Array(value :_*))
        }
      }
    }
  }
}
