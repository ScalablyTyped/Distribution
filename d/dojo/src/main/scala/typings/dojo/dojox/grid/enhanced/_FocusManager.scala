package typings.dojo.dojox.grid.enhanced

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/grid/enhanced/_FocusManager.html
  *
  *
  * @param grid
  */
@JSGlobal("dojox.grid.enhanced._FocusManager")
@js.native
class _FocusManager protected ()
  extends typings.dojo.dojox.grid._FocusManager {
  def this(grid: js.Any) = this()
  /**
    *
    * @param area
    */
  def addArea(area: js.Any): Unit = js.native
  /**
    *
    * @param evt
    */
  def contentMouseEvent(evt: js.Any): Unit = js.native
  /**
    * Set current area to the one areaName refers.
    *
    * @param areaName
    * @param toBlurOld
    */
  def currentArea(areaName: String, toBlurOld: js.Any): js.Any = js.native
  /**
    *
    * @param areaId
    * @param evt
    */
  def focusArea(): Boolean = js.native
  /**
    *
    * @param areaId
    * @param evt
    */
  def focusArea(areaId: String, evt: js.Any): Unit = js.native
  /**
    *
    * @param areaId
    * @param evt
    */
  def focusArea(areaId: js.Object, evt: js.Any): Unit = js.native
  def focusArea(areaId: Double): Boolean = js.native
  def focusArea(areaId: Double, evt: js.Any): Boolean = js.native
  def focusHeader(evt: js.Any): Boolean = js.native
  def focusHeader(evt: js.Any, step: js.Any): Boolean = js.native
  /**
    *
    * @param areaName
    */
  def getArea(areaName: js.Any): js.Any = js.native
  /**
    *
    * @param evt
    */
  def headerMouseEvent(evt: js.Any): Unit = js.native
  /**
    *
    * @param name
    */
  def ignoreArea(name: js.Any): Unit = js.native
  /**
    * Place the area refered by name at some logical position relative to an existing area.
    *
    * @param name
    * @param pos
    * @param otherAreaName
    */
  def placeArea(name: js.Any, pos: js.Any, otherAreaName: js.Any): Unit = js.native
  /**
    *
    * @param areaName
    */
  def removeArea(areaName: js.Any): Unit = js.native
  /**
    *
    * @param step
    * @param evt
    */
  def tab(step: js.Any, evt: js.Any): Unit = js.native
}

