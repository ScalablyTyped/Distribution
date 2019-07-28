package typings.esriDashLeaflet.esriDashLeafletMod

import typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esriNs.TaskOptions
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
  extends typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esriNs.Task {
  def this(options: typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esriNs.Service) = this()
  def this(options: TaskOptions) = this()
}

