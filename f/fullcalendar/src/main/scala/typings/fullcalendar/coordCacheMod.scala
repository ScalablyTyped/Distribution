package typings.fullcalendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/CoordCache", JSImport.Namespace)
@js.native
object coordCacheMod extends js.Object {
  @js.native
  class Default protected () extends js.Object {
    def this(options: js.Any) = this()
    var bottoms: js.Any = js.native
    var boundingRect: js.Any = js.native
    var els: js.Any = js.native
    var forcedOffsetParentEl: js.Any = js.native
    var isHorizontal: Boolean = js.native
    var isVertical: Boolean = js.native
    var lefts: js.Any = js.native
    var origin: js.Any = js.native
    var rights: js.Any = js.native
    var tops: js.Any = js.native
    def build(): Unit = js.native
    def buildElHorizontals(): Unit = js.native
    def buildElVerticals(): Unit = js.native
    def clear(): Unit = js.native
    def ensureBuilt(): Unit = js.native
    def getBottomOffset(topIndex: js.Any): js.Any = js.native
    def getBottomPosition(topIndex: js.Any): Double = js.native
    def getHeight(topIndex: js.Any): Double = js.native
    def getHorizontalIndex(leftOffset: js.Any): js.Any = js.native
    def getLeftOffset(leftIndex: js.Any): js.Any = js.native
    def getLeftPosition(leftIndex: js.Any): Double = js.native
    def getRightOffset(leftIndex: js.Any): js.Any = js.native
    def getRightPosition(leftIndex: js.Any): Double = js.native
    def getTopOffset(topIndex: js.Any): js.Any = js.native
    def getTopPosition(topIndex: js.Any): Double = js.native
    def getVerticalIndex(topOffset: js.Any): js.Any = js.native
    def getWidth(leftIndex: js.Any): Double = js.native
    def isLeftInBounds(leftOffset: js.Any): Boolean = js.native
    def isPointInBounds(leftOffset: js.Any, topOffset: js.Any): Boolean = js.native
    def isTopInBounds(topOffset: js.Any): Boolean = js.native
    def queryBoundingRect(): Anon_Bottom = js.native
  }
  
  @js.native
  class default protected () extends Default {
    def this(options: js.Any) = this()
  }
  
}

