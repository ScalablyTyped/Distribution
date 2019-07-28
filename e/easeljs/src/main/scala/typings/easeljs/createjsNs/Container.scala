package typings.easeljs.createjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.Container")
@js.native
class Container () extends DisplayObject {
  // properties
  var children: js.Array[DisplayObject] = js.native
  var mouseChildren: Boolean = js.native
  var numChildren: Double = js.native
  var tickChildren: Boolean = js.native
  def addChild(children: DisplayObject*): DisplayObject = js.native
  def addChild[T /* <: DisplayObject */](child0: DisplayObject, child1: DisplayObject, child2: DisplayObject, lastChild: T): T = js.native
  def addChild[T /* <: DisplayObject */](child0: DisplayObject, child1: DisplayObject, lastChild: T): T = js.native
  def addChild[T /* <: DisplayObject */](child0: DisplayObject, lastChild: T): T = js.native
  // methods
  def addChild[T /* <: DisplayObject */](child: T): T = js.native
  def addChildAt(childOrIndex: (DisplayObject | Double)*): DisplayObject = js.native
  def addChildAt[T /* <: DisplayObject */](child0: DisplayObject, child1: DisplayObject, lastChild: T, index: Double): T = js.native
  def addChildAt[T /* <: DisplayObject */](child0: DisplayObject, lastChild: T, index: Double): T = js.native
  def addChildAt[T /* <: DisplayObject */](child: T, index: Double): T = js.native
  def clone(recursive: Boolean): Container = js.native
  def contains(child: DisplayObject): Boolean = js.native
  def getChildAt(index: Double): DisplayObject = js.native
  def getChildByName(name: String): DisplayObject = js.native
  def getChildIndex(child: DisplayObject): Double = js.native
  /**
    * @deprecated - use numChildren property instead.
    */
  def getNumChildren(): Double = js.native
  def getObjectUnderPoint(x: Double, y: Double, mode: Double): DisplayObject = js.native
  def getObjectsUnderPoint(x: Double, y: Double, mode: Double): js.Array[DisplayObject] = js.native
  def removeAllChildren(): Unit = js.native
  def removeChild(child: DisplayObject*): Boolean = js.native
  def removeChildAt(index: Double*): Boolean = js.native
  def setChildIndex(child: DisplayObject, index: Double): Unit = js.native
  def sortChildren(sortFunction: js.Function2[/* a */ DisplayObject, /* b */ DisplayObject, Double]): Unit = js.native
  def swapChildren(child1: DisplayObject, child2: DisplayObject): Unit = js.native
  def swapChildrenAt(index1: Double, index2: Double): Unit = js.native
}

