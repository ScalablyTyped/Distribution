package typings.esriDashLeaflet.esriDashLeafletMod

import typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esri.TaskOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * `L.esri.Task` is a generic class that provides the foundation for calling operations on ArcGIS Online and
  * ArcGIS Server Services like query, find and identify.
  */
@JSImport("esri-leaflet", "Task")
@js.native
class Task protected ()
  extends typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esri.Task {
  def this(options: typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esri.Service) = this()
  def this(options: TaskOptions) = this()
}

@JSImport("esri-leaflet", "task")
@js.native
object task extends js.Object {
  def apply(options: typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esri.Service): typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esri.Task = js.native
  /**
    * `L.esri.Task` is a generic class that provides the foundation for calling operations on ArcGIS Online and
    * ArcGIS Server Services like query, find and identify.
    */
  def apply(options: TaskOptions): typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esri.Task = js.native
}

