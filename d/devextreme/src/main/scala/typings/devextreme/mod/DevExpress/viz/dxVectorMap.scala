package typings.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxVectorMap extends BaseWidget {
  /** Gets the current map center coordinates. */
  def center(): js.Array[Double] = js.native
  /** Sets the map center coordinates. */
  def center(centerCoordinates: js.Array[Double]): Unit = js.native
  /** Deselects all the selected area and markers on a map at once. The areas and markers are displayed in their initial style after. */
  def clearSelection(): Unit = js.native
  /** @deprecated Use convertToGeo instead. */
  /** Converts client area coordinates into map coordinates. */
  def convertCoordinates(x: Double, y: Double): js.Array[Double] = js.native
  /** Converts coordinates from the widget coordinate system to the dataSource coordinate system. */
  def convertToGeo(x: Double, y: Double): js.Array[Double] = js.native
  /** Converts coordinates from the dataSource coordinate system to the widget coordinate system. */
  def convertToXY(longitude: Double, latitude: Double): js.Array[Double] = js.native
  /** Gets a layer with a specific index. */
  def getLayerByIndex(index: Double): MapLayer = js.native
  /** Gets a layer with a specific name. */
  def getLayerByName(name: String): MapLayer = js.native
  /** Gets all layers. */
  def getLayers(): js.Array[MapLayer] = js.native
  /** Gets the current map viewport coordinates. */
  def viewport(): js.Array[Double] = js.native
  /** Sets the map viewport coordinates. */
  def viewport(viewportCoordinates: js.Array[Double]): Unit = js.native
  /** Gets the current zoom factor value. */
  def zoomFactor(): Double = js.native
  /** Sets the zoom factor value. */
  def zoomFactor(zoomFactor: Double): Unit = js.native
}

