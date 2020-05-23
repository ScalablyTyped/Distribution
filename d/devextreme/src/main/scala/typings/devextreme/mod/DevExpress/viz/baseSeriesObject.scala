package typings.devextreme.mod.DevExpress.viz

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait baseSeriesObject extends js.Object {
  /** @name baseSeriesObject.fullState */
  var fullState: js.UndefOr[Double] = js.native
  /** @name baseSeriesObject.name */
  var name: js.UndefOr[js.Any] = js.native
  /** @name baseSeriesObject.tag */
  var tag: js.UndefOr[js.Any] = js.native
  /** @name baseSeriesObject.type */
  var `type`: js.UndefOr[String] = js.native
  /** @name baseSeriesObject.clearHover() */
  def clearHover(): Unit = js.native
  /** @name baseSeriesObject.clearSelection() */
  def clearSelection(): Unit = js.native
  /** @name baseSeriesObject.deselectPoint(point) */
  def deselectPoint(point: basePointObject): Unit = js.native
  /** @name baseSeriesObject.getAllPoints() */
  def getAllPoints(): js.Array[basePointObject] = js.native
  /** @name baseSeriesObject.getColor() */
  def getColor(): String = js.native
  /** @name baseSeriesObject.getPointByPos(positionIndex) */
  def getPointByPos(positionIndex: Double): basePointObject = js.native
  def getPointsByArg(pointArg: String): js.Array[basePointObject] = js.native
  /** @name baseSeriesObject.getPointsByArg(pointArg) */
  def getPointsByArg(pointArg: Double): js.Array[basePointObject] = js.native
  def getPointsByArg(pointArg: Date): js.Array[basePointObject] = js.native
  /** @name baseSeriesObject.getVisiblePoints() */
  def getVisiblePoints(): js.Array[basePointObject] = js.native
  /** @name baseSeriesObject.hide() */
  def hide(): Unit = js.native
  /** @name baseSeriesObject.hover() */
  def hover(): Unit = js.native
  /** @name baseSeriesObject.isHovered() */
  def isHovered(): Boolean = js.native
  /** @name baseSeriesObject.isSelected() */
  def isSelected(): Boolean = js.native
  /** @name baseSeriesObject.isVisible() */
  def isVisible(): Boolean = js.native
  /** @name baseSeriesObject.select() */
  def select(): Unit = js.native
  /** @name baseSeriesObject.selectPoint(point) */
  def selectPoint(point: basePointObject): Unit = js.native
  /** @name baseSeriesObject.show() */
  def show(): Unit = js.native
}

