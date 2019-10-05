package typings.esriDashLeaflet.esriDashLeafletMod

import typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esri.QueryOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * `L.esri.Query` is an abstraction for the query API included in Feature Layers and Image Services. It provides
  * a chainable API for building request parameters and executing queries.
  *
  * Note Depending on the type of service you are querying (Feature Layer, Map Service, Image Service) and the
  * version of ArcGIS Server that hosts the service some of these options may not be available.
  */
@JSImport("esri-leaflet", "Query")
@js.native
class Query protected ()
  extends typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esri.Query {
  def this(options: QueryOptions) = this()
}

@JSImport("esri-leaflet", "query")
@js.native
object query extends js.Object {
  /**
    * `L.esri.Query` is an abstraction for the query API included in Feature Layers and Image Services. It provides
    * a chainable API for building request parameters and executing queries.
    *
    * Note Depending on the type of service you are querying (Feature Layer, Map Service, Image Service) and the
    * version of ArcGIS Server that hosts the service some of these options may not be available.
    */
  def apply(options: QueryOptions): typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esri.Query = js.native
}

