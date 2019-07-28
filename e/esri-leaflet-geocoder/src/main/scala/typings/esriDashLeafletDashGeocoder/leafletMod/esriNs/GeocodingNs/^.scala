package typings.esriDashLeafletDashGeocoder.leafletMod.esriNs.GeocodingNs

import typings.esriDashLeaflet.esriDashLeafletMod.Service
import typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esriNs.TaskOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("leaflet.esri.Geocoding")
@js.native
object ^ extends js.Object {
  val Geosearch: GeosearchConstructor = js.native
  def arcgisOnlineProvider(): ArcgisOnlineProvider = js.native
  def arcgisOnlineProvider(options: ArcgisOnlineProviderOptions): ArcgisOnlineProvider = js.native
  def featureLayerProvider(): FeatureLayerProvider = js.native
  def featureLayerProvider(options: FeatureLayerProviderOptions): FeatureLayerProvider = js.native
  def geocode(): Geocode = js.native
  def geocode(options: Service): Geocode = js.native
  def geocode(options: TaskOptions): Geocode = js.native
  def geocodeService(): GeocodeService = js.native
  def geocodeService(options: GeocodeServiceOptions): GeocodeService = js.native
  def geocodeServiceProvider(): GeocodeServiceProvider = js.native
  def geocodeServiceProvider(options: GeocodeServiceProviderOptions): GeocodeServiceProvider = js.native
  def geosearch(): typings.esriDashLeafletDashGeocoder.leafletMod.esriNs.GeocodingNs.Geosearch = js.native
  def geosearch(options: GeosearchObject): typings.esriDashLeafletDashGeocoder.leafletMod.esriNs.GeocodingNs.Geosearch = js.native
  def mapServiceProvider(): MapServiceProvider = js.native
  def mapServiceProvider(options: MapServiceProviderOptions): MapServiceProvider = js.native
  def reverseGeocode(): ReverseGeocode = js.native
  def reverseGeocode(options: Service): ReverseGeocode = js.native
  def reverseGeocode(options: TaskOptions): ReverseGeocode = js.native
  def suggest(): Suggest = js.native
  def suggest(options: Service): Suggest = js.native
  def suggest(options: TaskOptions): Suggest = js.native
}

