package typings.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxVectorMap extends BaseWidget {
  
  /**
    * [descr:dxVectorMap.center()]
    */
  def center(): js.Array[Double] = js.native
  /**
    * [descr:dxVectorMap.center(centerCoordinates)]
    */
  def center(centerCoordinates: js.Array[Double]): Unit = js.native
  
  /**
    * [descr:dxVectorMap.clearSelection()]
    */
  def clearSelection(): Unit = js.native
  
  /**
    * [descr:dxVectorMap.convertCoordinates(x, y)]
    * @deprecated [depNote:dxVectorMap.convertCoordinates(x, y)]
    */
  def convertCoordinates(x: Double, y: Double): js.Array[Double] = js.native
  
  /**
    * [descr:dxVectorMap.convertToGeo(x, y)]
    */
  def convertToGeo(x: Double, y: Double): js.Array[Double] = js.native
  
  /**
    * [descr:dxVectorMap.convertToXY(longitude, latitude)]
    */
  def convertToXY(longitude: Double, latitude: Double): js.Array[Double] = js.native
  
  /**
    * [descr:dxVectorMap.getLayerByIndex(index)]
    */
  def getLayerByIndex(index: Double): MapLayer = js.native
  
  /**
    * [descr:dxVectorMap.getLayerByName(name)]
    */
  def getLayerByName(name: String): MapLayer = js.native
  
  /**
    * [descr:dxVectorMap.getLayers()]
    */
  def getLayers(): js.Array[MapLayer] = js.native
  
  /**
    * [descr:dxVectorMap.viewport()]
    */
  def viewport(): js.Array[Double] = js.native
  /**
    * [descr:dxVectorMap.viewport(viewportCoordinates)]
    */
  def viewport(viewportCoordinates: js.Array[Double]): Unit = js.native
  
  /**
    * [descr:dxVectorMap.zoomFactor()]
    */
  def zoomFactor(): Double = js.native
  /**
    * [descr:dxVectorMap.zoomFactor(zoomFactor)]
    */
  def zoomFactor(zoomFactor: Double): Unit = js.native
}
