package typings.devextreme.mod.default.viz

import typings.devextreme.mod.DevExpress.data.DataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("devextreme", "viz.MapLayer")
@js.native
class MapLayer ()
  extends typings.devextreme.mod.DevExpress.viz.MapLayer {
  /** The type of the layer elements. */
  /* CompleteClass */
  override var elementType: String = js.native
  /** The layer index in the layers array. */
  /* CompleteClass */
  override var index: Double = js.native
  /** The name of the layer. */
  /* CompleteClass */
  override var name: String = js.native
  /** The layer type. Can be "area", "line" or "marker". */
  /* CompleteClass */
  override var `type`: String = js.native
  /** Deselects all layer elements. */
  /* CompleteClass */
  override def clearSelection(): Unit = js.native
  /** Returns the DataSource instance. */
  /* CompleteClass */
  override def getDataSource(): DataSource = js.native
  /** Gets all layer elements. */
  /* CompleteClass */
  override def getElements(): js.Array[typings.devextreme.mod.DevExpress.viz.MapLayerElement] = js.native
}

