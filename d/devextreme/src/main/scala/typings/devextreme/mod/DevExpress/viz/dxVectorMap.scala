package typings.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxVectorMap extends BaseWidget {
  /** @name dxVectorMap.center() */
  def center(): js.Array[Double] = js.native
  /** @name dxVectorMap.center(centerCoordinates) */
  def center(centerCoordinates: js.Array[Double]): Unit = js.native
  /** @name dxVectorMap.clearSelection() */
  def clearSelection(): Unit = js.native
  /** @deprecated */
  /** @name dxVectorMap.convertCoordinates(x, y) */
  def convertCoordinates(x: Double, y: Double): js.Array[Double] = js.native
  /** @name dxVectorMap.convertToGeo(x, y) */
  def convertToGeo(x: Double, y: Double): js.Array[Double] = js.native
  /** @name dxVectorMap.convertToXY(longitude, latitude) */
  def convertToXY(longitude: Double, latitude: Double): js.Array[Double] = js.native
  /** @name dxVectorMap.getLayerByIndex(index) */
  def getLayerByIndex(index: Double): MapLayer = js.native
  /** @name dxVectorMap.getLayerByName(name) */
  def getLayerByName(name: String): MapLayer = js.native
  /** @name dxVectorMap.getLayers() */
  def getLayers(): js.Array[MapLayer] = js.native
  /** @name dxVectorMap.viewport() */
  def viewport(): js.Array[Double] = js.native
  /** @name dxVectorMap.viewport(viewportCoordinates) */
  def viewport(viewportCoordinates: js.Array[Double]): Unit = js.native
  /** @name dxVectorMap.zoomFactor() */
  def zoomFactor(): Double = js.native
  /** @name dxVectorMap.zoomFactor(zoomFactor) */
  def zoomFactor(zoomFactor: Double): Unit = js.native
}

