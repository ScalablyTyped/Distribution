package typings.esriLeaflet.mod

import typings.esriLeaflet.mod.leafletAugmentingMod.esri.TaskOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri-leaflet", "task")
@js.native
object task extends js.Object {
  def apply(options: typings.esriLeaflet.mod.leafletAugmentingMod.esri.Service): typings.esriLeaflet.mod.leafletAugmentingMod.esri.Task_ = js.native
  /**
    * `L.esri.Task` is a generic class that provides the foundation for calling operations on ArcGIS Online and
    * ArcGIS Server Services like query, find and identify.
    */
  def apply(options: TaskOptions): typings.esriLeaflet.mod.leafletAugmentingMod.esri.Task_ = js.native
}

