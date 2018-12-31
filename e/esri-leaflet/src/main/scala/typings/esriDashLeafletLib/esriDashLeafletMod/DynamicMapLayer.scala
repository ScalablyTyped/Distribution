package typings
package esriDashLeafletLib.esriDashLeafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Render and visualize Map Services from ArcGIS Online and ArcGIS Server. `L.esri.DynamicMapLayer` also
  * supports custom popups and identification of features.
  *
  * Map Services are used when its preferable to ask the server to draw layers at a particular location and scale
  * and pass back the image which was generated on the fly. They also expose capabilities for querying and
  * identifying individual features.
  */
@JSImport("esri-leaflet", "DynamicMapLayer")
@js.native
class DynamicMapLayer protected ()
  extends esriDashLeafletLib.esriDashLeafletMod.leafletMod.esriNs.DynamicMapLayer {
  def this(options: esriDashLeafletLib.esriDashLeafletMod.leafletMod.esriNs.DynamicMapLayerOptions) = this()
}

