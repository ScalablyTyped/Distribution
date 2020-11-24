package typings.devextreme.mod.DevExpress.viz

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait baseSeriesObject extends js.Object {
  
  /**
    * [descr:baseSeriesObject.clearHover()]
    */
  def clearHover(): Unit = js.native
  
  /**
    * [descr:baseSeriesObject.clearSelection()]
    */
  def clearSelection(): Unit = js.native
  
  /**
    * [descr:baseSeriesObject.deselectPoint(point)]
    */
  def deselectPoint(point: basePointObject): Unit = js.native
  
  /**
    * [descr:baseSeriesObject.fullState]
    */
  var fullState: js.UndefOr[Double] = js.native
  
  /**
    * [descr:baseSeriesObject.getAllPoints()]
    */
  def getAllPoints(): js.Array[basePointObject] = js.native
  
  /**
    * [descr:baseSeriesObject.getColor()]
    */
  def getColor(): String = js.native
  
  /**
    * [descr:baseSeriesObject.getPointByPos(positionIndex)]
    */
  def getPointByPos(positionIndex: Double): basePointObject = js.native
  
  def getPointsByArg(pointArg: String): js.Array[basePointObject] = js.native
  /**
    * [descr:baseSeriesObject.getPointsByArg(pointArg)]
    */
  def getPointsByArg(pointArg: Double): js.Array[basePointObject] = js.native
  def getPointsByArg(pointArg: Date): js.Array[basePointObject] = js.native
  
  /**
    * [descr:baseSeriesObject.getVisiblePoints()]
    */
  def getVisiblePoints(): js.Array[basePointObject] = js.native
  
  /**
    * [descr:baseSeriesObject.hide()]
    */
  def hide(): Unit = js.native
  
  /**
    * [descr:baseSeriesObject.hover()]
    */
  def hover(): Unit = js.native
  
  /**
    * [descr:baseSeriesObject.isHovered()]
    */
  def isHovered(): Boolean = js.native
  
  /**
    * [descr:baseSeriesObject.isSelected()]
    */
  def isSelected(): Boolean = js.native
  
  /**
    * [descr:baseSeriesObject.isVisible()]
    */
  def isVisible(): Boolean = js.native
  
  /**
    * [descr:baseSeriesObject.name]
    */
  var name: js.UndefOr[js.Any] = js.native
  
  /**
    * [descr:baseSeriesObject.select()]
    */
  def select(): Unit = js.native
  
  /**
    * [descr:baseSeriesObject.selectPoint(point)]
    */
  def selectPoint(point: basePointObject): Unit = js.native
  
  /**
    * [descr:baseSeriesObject.show()]
    */
  def show(): Unit = js.native
  
  /**
    * [descr:baseSeriesObject.tag]
    */
  var tag: js.UndefOr[js.Any] = js.native
  
  /**
    * [descr:baseSeriesObject.type]
    */
  var `type`: js.UndefOr[String] = js.native
}
