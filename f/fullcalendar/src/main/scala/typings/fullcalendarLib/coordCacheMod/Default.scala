package typings
package fullcalendarLib.coordCacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/CoordCache", "Default")
@js.native
class Default protected () extends js.Object {
  def this(options: js.Any) = this()
  var bottoms: js.Any = js.native
  var boundingRect: js.Any = js.native
  var els: js.Any = js.native
  var forcedOffsetParentEl: js.Any = js.native
  var isHorizontal: scala.Boolean = js.native
  var isVertical: scala.Boolean = js.native
  var lefts: js.Any = js.native
  var origin: js.Any = js.native
  var rights: js.Any = js.native
  var tops: js.Any = js.native
  def build(): scala.Unit = js.native
  def buildElHorizontals(): scala.Unit = js.native
  def buildElVerticals(): scala.Unit = js.native
  def clear(): scala.Unit = js.native
  def ensureBuilt(): scala.Unit = js.native
  def getBottomOffset(topIndex: js.Any): js.Any = js.native
  def getBottomPosition(topIndex: js.Any): scala.Double = js.native
  def getHeight(topIndex: js.Any): scala.Double = js.native
  def getHorizontalIndex(leftOffset: js.Any): js.Any = js.native
  def getLeftOffset(leftIndex: js.Any): js.Any = js.native
  def getLeftPosition(leftIndex: js.Any): scala.Double = js.native
  def getRightOffset(leftIndex: js.Any): js.Any = js.native
  def getRightPosition(leftIndex: js.Any): scala.Double = js.native
  def getTopOffset(topIndex: js.Any): js.Any = js.native
  def getTopPosition(topIndex: js.Any): scala.Double = js.native
  def getVerticalIndex(topOffset: js.Any): js.Any = js.native
  def getWidth(leftIndex: js.Any): scala.Double = js.native
  def isLeftInBounds(leftOffset: js.Any): scala.Boolean = js.native
  def isPointInBounds(leftOffset: js.Any, topOffset: js.Any): scala.Boolean = js.native
  def isTopInBounds(topOffset: js.Any): scala.Boolean = js.native
  def queryBoundingRect(): fullcalendarLib.Anon_Bottom = js.native
}

@JSImport("fullcalendar/CoordCache", JSImport.Default)
@js.native
class default protected () extends Default {
  def this(options: js.Any) = this()
}

