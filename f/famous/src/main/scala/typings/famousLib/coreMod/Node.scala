package typings
package famousLib.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("famous/core", "Node")
@js.native
class Node () extends js.Object {
  def addChild(): Node = js.native
  def addChild(node: Node): Node = js.native
  def addComponent(component: js.Any): scala.Double = js.native
  def addUIEvent(eventName: java.lang.String): scala.Unit = js.native
  def dismount(): scala.Unit = js.native
  def emit(event: js.Any): scala.Unit = js.native
  def emit(event: js.Any, payload: js.Any): scala.Unit = js.native
  def getAbsoluteSize(): js.Array[scala.Double] = js.native
  def getAlign(): js.Array[scala.Double] = js.native
  def getChildren(): js.Array[Node] = js.native
  def getComponent(index: scala.Double): js.Any = js.native
  def getComponents(): js.Array[_] = js.native
  def getDifferentialSize(): js.Array[scala.Double] = js.native
  def getLocation(): java.lang.String = js.native
  def getMountPoint(): js.Array[scala.Double] = js.native
  def getParent(): Node = js.native
  def getPosition(): js.Array[scala.Double] = js.native
  def getProportionalSize(): js.Array[scala.Double] = js.native
  def getRenderSize(): js.Array[scala.Double] = js.native
  def getSize(): js.Array[scala.Double] = js.native
  def getSizeMode(): js.Array[scala.Double] = js.native
  def hide(): Node = js.native
  def isMounted(): scala.Boolean = js.native
  def isShown(): scala.Boolean = js.native
  def mount(): scala.Unit = js.native
  def onSizeChange(x: scala.Double, y: scala.Double, z: scala.Double): scala.Unit = js.native
  def onUpdate(time: scala.Double): scala.Unit = js.native
  def removeChild(node: Node): scala.Boolean = js.native
  def requestUpdate(requester: scala.Double): scala.Unit = js.native
  def requestUpdateOnNextTick(requester: scala.Double): scala.Unit = js.native
  def setAbsoluteSize(): Node = js.native
  def setAbsoluteSize(x: scala.Double): Node = js.native
  def setAbsoluteSize(x: scala.Double, y: scala.Double): Node = js.native
  def setAbsoluteSize(x: scala.Double, y: scala.Double, z: scala.Double): Node = js.native
  def setAlign(): Node = js.native
  def setAlign(x: scala.Double): Node = js.native
  def setAlign(x: scala.Double, y: scala.Double): Node = js.native
  def setAlign(x: scala.Double, y: scala.Double, z: scala.Double): Node = js.native
  def setDifferentialSize(): Node = js.native
  def setDifferentialSize(x: scala.Double): Node = js.native
  def setDifferentialSize(x: scala.Double, y: scala.Double): Node = js.native
  def setDifferentialSize(x: scala.Double, y: scala.Double, z: scala.Double): Node = js.native
  def setMountPoint(): Node = js.native
  def setMountPoint(x: scala.Double): Node = js.native
  def setMountPoint(x: scala.Double, y: scala.Double): Node = js.native
  def setMountPoint(x: scala.Double, y: scala.Double, z: scala.Double): Node = js.native
  def setOrigin(): Node = js.native
  def setOrigin(x: scala.Double): Node = js.native
  def setOrigin(x: scala.Double, y: scala.Double): Node = js.native
  def setOrigin(x: scala.Double, y: scala.Double, z: scala.Double): Node = js.native
  def setPosition(): Node = js.native
  def setPosition(x: scala.Double): Node = js.native
  def setPosition(x: scala.Double, y: scala.Double): Node = js.native
  def setPosition(x: scala.Double, y: scala.Double, z: scala.Double): Node = js.native
  def setProportionalSize(): Node = js.native
  def setProportionalSize(x: scala.Double): Node = js.native
  def setProportionalSize(x: scala.Double, y: scala.Double): Node = js.native
  def setProportionalSize(x: scala.Double, y: scala.Double, z: scala.Double): Node = js.native
  def setRotation(): Node = js.native
  def setRotation(x: scala.Double): Node = js.native
  def setRotation(x: scala.Double, y: scala.Double): Node = js.native
  def setRotation(x: scala.Double, y: scala.Double, z: scala.Double): Node = js.native
  def setRotation(x: scala.Double, y: scala.Double, z: scala.Double, w: scala.Double): Node = js.native
  def setScale(): Node = js.native
  def setScale(x: scala.Double): Node = js.native
  def setScale(x: scala.Double, y: scala.Double): Node = js.native
  def setScale(x: scala.Double, y: scala.Double, z: scala.Double): Node = js.native
  def setSizeMode(): Node = js.native
  def setSizeMode(x: java.lang.String): Node = js.native
  def setSizeMode(x: java.lang.String, y: java.lang.String): Node = js.native
  def setSizeMode(x: java.lang.String, y: java.lang.String, z: java.lang.String): Node = js.native
  def setSizeMode(x: java.lang.String, y: java.lang.String, z: scala.Double): Node = js.native
  def setSizeMode(x: java.lang.String, y: scala.Double): Node = js.native
  def setSizeMode(x: java.lang.String, y: scala.Double, z: java.lang.String): Node = js.native
  def setSizeMode(x: java.lang.String, y: scala.Double, z: scala.Double): Node = js.native
  def setSizeMode(x: scala.Double): Node = js.native
  def setSizeMode(x: scala.Double, y: java.lang.String): Node = js.native
  def setSizeMode(x: scala.Double, y: java.lang.String, z: java.lang.String): Node = js.native
  def setSizeMode(x: scala.Double, y: java.lang.String, z: scala.Double): Node = js.native
  def setSizeMode(x: scala.Double, y: scala.Double): Node = js.native
  def setSizeMode(x: scala.Double, y: scala.Double, z: java.lang.String): Node = js.native
  def setSizeMode(x: scala.Double, y: scala.Double, z: scala.Double): Node = js.native
  def show(): Node = js.native
}

/* static members */
@JSImport("famous/core", "Node")
@js.native
object Node extends js.Object {
  var ABSOLUTE_SIZE: scala.Double = js.native
  var DEFAULT_SIZE: scala.Double = js.native
  var RELATIVE_SIZE: scala.Double = js.native
  var RENDER_SIZE: scala.Double = js.native
}

