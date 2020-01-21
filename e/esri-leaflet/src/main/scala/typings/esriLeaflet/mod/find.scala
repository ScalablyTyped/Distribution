package typings.esriLeaflet.mod

import typings.esriLeaflet.mod.leafletAugmentingMod.esri.FindOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri-leaflet", "find")
@js.native
object find extends js.Object {
  /**
    * L.esri.Find is an abstraction for the find API included in Map Services. It provides a chainable API for
    * building request parameters and executing find tasks.
    */
  def apply(options: FindOptions): typings.esriLeaflet.mod.leafletAugmentingMod.esri.Find_ = js.native
  def apply(options: typings.esriLeaflet.mod.leafletAugmentingMod.esri.MapService_): typings.esriLeaflet.mod.leafletAugmentingMod.esri.Find_ = js.native
}

