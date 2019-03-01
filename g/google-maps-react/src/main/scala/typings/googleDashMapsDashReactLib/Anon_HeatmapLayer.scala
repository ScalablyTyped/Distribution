package typings
package googleDashMapsDashReactLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HeatmapLayer extends js.Object {
  var HeatmapLayer: org.scalablytyped.runtime.Instantiable0[googlemapsLib.googleNs.mapsNs.visualizationNs.HeatmapLayer]
  var MapsEngineLayer: org.scalablytyped.runtime.Instantiable1[
    /* options */ googlemapsLib.googleNs.mapsNs.visualizationNs.MapsEngineLayerOptions, 
    googlemapsLib.googleNs.mapsNs.visualizationNs.MapsEngineLayer
  ]
  var MapsEventListener: org.scalablytyped.runtime.Instantiable0[googlemapsLib.googleNs.mapsNs.visualizationNs.MapsEventListener]
  var MouseEvent: org.scalablytyped.runtime.Instantiable0[googlemapsLib.googleNs.mapsNs.visualizationNs.MouseEvent]
}

object Anon_HeatmapLayer {
  @scala.inline
  def apply(
    HeatmapLayer: org.scalablytyped.runtime.Instantiable0[googlemapsLib.googleNs.mapsNs.visualizationNs.HeatmapLayer],
    MapsEngineLayer: org.scalablytyped.runtime.Instantiable1[
      /* options */ googlemapsLib.googleNs.mapsNs.visualizationNs.MapsEngineLayerOptions, 
      googlemapsLib.googleNs.mapsNs.visualizationNs.MapsEngineLayer
    ],
    MapsEventListener: org.scalablytyped.runtime.Instantiable0[googlemapsLib.googleNs.mapsNs.visualizationNs.MapsEventListener],
    MouseEvent: org.scalablytyped.runtime.Instantiable0[googlemapsLib.googleNs.mapsNs.visualizationNs.MouseEvent]
  ): Anon_HeatmapLayer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("HeatmapLayer")(HeatmapLayer)
    __obj.updateDynamic("MapsEngineLayer")(MapsEngineLayer)
    __obj.updateDynamic("MapsEventListener")(MapsEventListener)
    __obj.updateDynamic("MouseEvent")(MouseEvent)
    __obj.asInstanceOf[Anon_HeatmapLayer]
  }
}

