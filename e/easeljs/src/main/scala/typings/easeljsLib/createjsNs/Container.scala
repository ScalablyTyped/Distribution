package typings
package easeljsLib.createjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.Container")
@js.native
class Container () extends DisplayObject {
  // properties
  var children: js.Array[DisplayObject] = js.native
  var mouseChildren: scala.Boolean = js.native
  var numChildren: scala.Double = js.native
  var tickChildren: scala.Boolean = js.native
  def addChild(children: DisplayObject*): DisplayObject = js.native
  def addChild[T /* <: DisplayObject */](child0: DisplayObject, child1: DisplayObject, child2: DisplayObject, lastChild: T): T = js.native
  def addChild[T /* <: DisplayObject */](child0: DisplayObject, child1: DisplayObject, lastChild: T): T = js.native
  def addChild[T /* <: DisplayObject */](child0: DisplayObject, lastChild: T): T = js.native
  // methods
  def addChild[T /* <: DisplayObject */](child: T): T = js.native
  def addChildAt(childOrIndex: (DisplayObject | scala.Double)*): DisplayObject = js.native
  def addChildAt[T /* <: DisplayObject */](child0: DisplayObject, child1: DisplayObject, lastChild: T, index: scala.Double): T = js.native
  def addChildAt[T /* <: DisplayObject */](child0: DisplayObject, lastChild: T, index: scala.Double): T = js.native
  def addChildAt[T /* <: DisplayObject */](child: T, index: scala.Double): T = js.native
   // actually (...child: DisplayObject[], index: number)
  def clone(recursive: scala.Boolean): Container = js.native
  def contains(child: DisplayObject): scala.Boolean = js.native
  def getChildAt(index: scala.Double): DisplayObject = js.native
  def getChildByName(name: java.lang.String): DisplayObject = js.native
  def getChildIndex(child: DisplayObject): scala.Double = js.native
  /**
           * @deprecated - use numChildren property instead.
           */
  def getNumChildren(): scala.Double = js.native
  def getObjectUnderPoint(x: scala.Double, y: scala.Double, mode: scala.Double): DisplayObject = js.native
  def getObjectsUnderPoint(x: scala.Double, y: scala.Double, mode: scala.Double): js.Array[DisplayObject] = js.native
  def removeAllChildren(): scala.Unit = js.native
  def removeChild(child: DisplayObject*): scala.Boolean = js.native
  def removeChildAt(index: scala.Double*): scala.Boolean = js.native
  def setChildIndex(child: DisplayObject, index: scala.Double): scala.Unit = js.native
  def sortChildren(sortFunction: js.Function2[/* a */ DisplayObject, /* b */ DisplayObject, scala.Double]): scala.Unit = js.native
  def swapChildren(child1: DisplayObject, child2: DisplayObject): scala.Unit = js.native
  def swapChildrenAt(index1: scala.Double, index2: scala.Double): scala.Unit = js.native
}

