package typings.esriLeaflet.mod

import typings.esriLeaflet.mod.leafletAugmentingMod.esri.QueryOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * `L.esri.Query` is an abstraction for the query API included in Feature Layers and Image Services. It provides
  * a chainable API for building request parameters and executing queries.
  *
  * Note Depending on the type of service you are querying (Feature Layer, Map Service, Image Service) and the
  * version of ArcGIS Server that hosts the service some of these options may not be available.
  */
@JSImport("esri-leaflet", "Query")
@js.native
open class Query_ protected ()
  extends typings.esriLeaflet.mod.leafletAugmentingMod.esri.Query_ {
  def this(options: QueryOptions) = this()
}
