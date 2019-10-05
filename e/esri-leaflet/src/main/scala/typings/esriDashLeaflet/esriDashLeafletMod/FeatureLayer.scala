package typings.esriDashLeaflet.esriDashLeafletMod

import typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esri.FeatureLayerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// TODO: VirtualGrid extends support
/**
  * `L.esri.FeatureLayer` is used to visualize, style, query and edit vector geographic data hosted in both
  * ArcGIS Online and published using ArcGIS Server. Copyright text from the service is added to map attribution
  * automatically.
  *
  * Feature Layers reference an individual data source in either a parent Map Service or Feature Service that can
  * contain multiple layers. You can see a sample Map Service URL below:
  * http://sampleserver6.arcgisonline.com/arcgis/rest/services/Hurricanes/MapServer
  *
  * This particular service includes two different data sources. The URL for the 'Hurricane Tracks' feature layer
  * will end in a number (representing its position among the other layers).
  * http://sampleserver6.arcgisonline.com/arcgis/rest/services/Hurricanes/MapServer/1
  *
  * Feature Layer URLs always end in a number (ex: /FeatureServer/{LAYER_ID} or /MapServer/{LAYER_ID}).
  *
  * You can create a new empty feature service with a single layer on the ArcGIS for Developers website or you
  * can use ArcGIS Online to create a Feature Service from a CSV or Shapefile
  *
  * `L.esri.FeatureLayer` divides the current map extent into a grid of individual cells and uses them to fire
  * queries to fetch nearby features. This technique is comparable to `MODE_ONDEMAND` in the ArcGIS API for
  * JavaScript.
  */
@JSImport("esri-leaflet", "FeatureLayer")
@js.native
class FeatureLayer protected ()
  extends typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esri.FeatureLayer {
  def this(options: FeatureLayerOptions) = this()
}

@JSImport("esri-leaflet", "featureLayer")
@js.native
object featureLayer extends js.Object {
  /**
    * `L.esri.FeatureLayer` is used to visualize, style, query and edit vector geographic data hosted in both
    * ArcGIS Online and published using ArcGIS Server. Copyright text from the service is added to map attribution
    * automatically.
    *
    * Feature Layers reference an individual data source in either a parent Map Service or Feature Service that can
    * contain multiple layers. You can see a sample Map Service URL below:
    * http://sampleserver6.arcgisonline.com/arcgis/rest/services/Hurricanes/MapServer
    *
    * This particular service includes two different data sources. The URL for the 'Hurricane Tracks' feature layer
    * will end in a number (representing its position among the other layers).
    * http://sampleserver6.arcgisonline.com/arcgis/rest/services/Hurricanes/MapServer/1
    *
    * Feature Layer URLs always end in a number (ex: /FeatureServer/{LAYER_ID} or /MapServer/{LAYER_ID}).
    *
    * You can create a new empty feature service with a single layer on the ArcGIS for Developers website or you
    * can use ArcGIS Online to create a Feature Service from a CSV or Shapefile
    *
    * L.esri.FeatureLayer divides the current map extent into a grid of individual cells and uses them to fire
    * queries to fetch nearby features. This technique is comparable to MODE_ONDEMAND in the ArcGIS API for
    * JavaScript.
    */
  def apply(options: FeatureLayerOptions): typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esri.FeatureLayer = js.native
}

