package typings
package esriDashLeafletLib.esriDashLeafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * `L.esri.Find` is an abstraction for the find API included in Map Services. It provides a chainable API for
  * building request parameters and executing find tasks.
  */
@JSImport("esri-leaflet", "Find")
@js.native
class Find protected ()
  extends esriDashLeafletLib.esriDashLeafletMod.leafletMod.esriNs.Find {
  def this(options: esriDashLeafletLib.esriDashLeafletMod.leafletMod.esriNs.FindOptions) = this()
  def this(options: esriDashLeafletLib.esriDashLeafletMod.leafletMod.esriNs.MapService) = this()
}

