package typings.famous

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("famous/core", JSImport.Namespace)
@js.native
object coreMod extends js.Object {
  
  @js.native
  class Clock () extends js.Object {
    
    def setTimeout(callback: js.Function): Unit = js.native
    def setTimeout(callback: js.Function, delay: Double): Unit = js.native
  }
  
  @js.native
  class Dispatch () extends js.Object
  /* static members */
  @js.native
  object Dispatch extends js.Object {
    
    def dispatchUIEvent(path: String, event: String, payload: js.Any): Unit = js.native
  }
  
  @js.native
  class FamousEngine () extends js.Object {
    
    def createScene(): Scene = js.native
  }
  /* static members */
  @js.native
  object FamousEngine extends js.Object {
    
    def createScene(): Scene = js.native
    
    def getClock(): Clock = js.native
    
    def getContext(selector: String): Scene = js.native
    
    def init(): FamousEngine = js.native
    
    def requestUpdate(requester: Double): Unit = js.native
    
    def requestUpdateOnNextTick(requester: Double): Unit = js.native
  }
  
  @js.native
  class Node () extends js.Object {
    
    def addChild(): Node = js.native
    def addChild(node: Node): Node = js.native
    
    def addComponent(component: js.Any): Double = js.native
    
    def addUIEvent(eventName: String): Unit = js.native
    
    def dismount(): Unit = js.native
    
    def emit(event: js.Any): Unit = js.native
    def emit(event: js.Any, payload: js.Any): Unit = js.native
    
    def getAbsoluteSize(): js.Array[Double] = js.native
    
    def getAlign(): js.Array[Double] = js.native
    
    def getChildren(): js.Array[Node] = js.native
    
    def getComponent(index: Double): js.Any = js.native
    
    def getComponents(): js.Array[_] = js.native
    
    def getDifferentialSize(): js.Array[Double] = js.native
    
    def getLocation(): String = js.native
    
    def getMountPoint(): js.Array[Double] = js.native
    
    def getParent(): Node = js.native
    
    def getPosition(): js.Array[Double] = js.native
    
    def getProportionalSize(): js.Array[Double] = js.native
    
    def getRenderSize(): js.Array[Double] = js.native
    
    def getSize(): js.Array[Double] = js.native
    
    def getSizeMode(): js.Array[Double] = js.native
    
    def hide(): Node = js.native
    
    def isMounted(): Boolean = js.native
    
    def isShown(): Boolean = js.native
    
    def mount(): Unit = js.native
    
    def onSizeChange(x: Double, y: Double, z: Double): Unit = js.native
    
    def onUpdate(time: Double): Unit = js.native
    
    def removeChild(node: Node): Boolean = js.native
    
    def requestUpdate(requester: Double): Unit = js.native
    
    def requestUpdateOnNextTick(requester: Double): Unit = js.native
    
    def setAbsoluteSize(): Node = js.native
    def setAbsoluteSize(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], z: Double): Node = js.native
    def setAbsoluteSize(x: js.UndefOr[scala.Nothing], y: Double): Node = js.native
    def setAbsoluteSize(x: js.UndefOr[scala.Nothing], y: Double, z: Double): Node = js.native
    def setAbsoluteSize(x: Double): Node = js.native
    def setAbsoluteSize(x: Double, y: js.UndefOr[scala.Nothing], z: Double): Node = js.native
    def setAbsoluteSize(x: Double, y: Double): Node = js.native
    def setAbsoluteSize(x: Double, y: Double, z: Double): Node = js.native
    
    def setAlign(): Node = js.native
    def setAlign(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], z: Double): Node = js.native
    def setAlign(x: js.UndefOr[scala.Nothing], y: Double): Node = js.native
    def setAlign(x: js.UndefOr[scala.Nothing], y: Double, z: Double): Node = js.native
    def setAlign(x: Double): Node = js.native
    def setAlign(x: Double, y: js.UndefOr[scala.Nothing], z: Double): Node = js.native
    def setAlign(x: Double, y: Double): Node = js.native
    def setAlign(x: Double, y: Double, z: Double): Node = js.native
    
    def setDifferentialSize(): Node = js.native
    def setDifferentialSize(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], z: Double): Node = js.native
    def setDifferentialSize(x: js.UndefOr[scala.Nothing], y: Double): Node = js.native
    def setDifferentialSize(x: js.UndefOr[scala.Nothing], y: Double, z: Double): Node = js.native
    def setDifferentialSize(x: Double): Node = js.native
    def setDifferentialSize(x: Double, y: js.UndefOr[scala.Nothing], z: Double): Node = js.native
    def setDifferentialSize(x: Double, y: Double): Node = js.native
    def setDifferentialSize(x: Double, y: Double, z: Double): Node = js.native
    
    def setMountPoint(): Node = js.native
    def setMountPoint(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], z: Double): Node = js.native
    def setMountPoint(x: js.UndefOr[scala.Nothing], y: Double): Node = js.native
    def setMountPoint(x: js.UndefOr[scala.Nothing], y: Double, z: Double): Node = js.native
    def setMountPoint(x: Double): Node = js.native
    def setMountPoint(x: Double, y: js.UndefOr[scala.Nothing], z: Double): Node = js.native
    def setMountPoint(x: Double, y: Double): Node = js.native
    def setMountPoint(x: Double, y: Double, z: Double): Node = js.native
    
    def setOrigin(): Node = js.native
    def setOrigin(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], z: Double): Node = js.native
    def setOrigin(x: js.UndefOr[scala.Nothing], y: Double): Node = js.native
    def setOrigin(x: js.UndefOr[scala.Nothing], y: Double, z: Double): Node = js.native
    def setOrigin(x: Double): Node = js.native
    def setOrigin(x: Double, y: js.UndefOr[scala.Nothing], z: Double): Node = js.native
    def setOrigin(x: Double, y: Double): Node = js.native
    def setOrigin(x: Double, y: Double, z: Double): Node = js.native
    
    def setPosition(): Node = js.native
    def setPosition(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], z: Double): Node = js.native
    def setPosition(x: js.UndefOr[scala.Nothing], y: Double): Node = js.native
    def setPosition(x: js.UndefOr[scala.Nothing], y: Double, z: Double): Node = js.native
    def setPosition(x: Double): Node = js.native
    def setPosition(x: Double, y: js.UndefOr[scala.Nothing], z: Double): Node = js.native
    def setPosition(x: Double, y: Double): Node = js.native
    def setPosition(x: Double, y: Double, z: Double): Node = js.native
    
    def setProportionalSize(): Node = js.native
    def setProportionalSize(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], z: Double): Node = js.native
    def setProportionalSize(x: js.UndefOr[scala.Nothing], y: Double): Node = js.native
    def setProportionalSize(x: js.UndefOr[scala.Nothing], y: Double, z: Double): Node = js.native
    def setProportionalSize(x: Double): Node = js.native
    def setProportionalSize(x: Double, y: js.UndefOr[scala.Nothing], z: Double): Node = js.native
    def setProportionalSize(x: Double, y: Double): Node = js.native
    def setProportionalSize(x: Double, y: Double, z: Double): Node = js.native
    
    def setRotation(): Node = js.native
    def setRotation(
      x: js.UndefOr[scala.Nothing],
      y: js.UndefOr[scala.Nothing],
      z: js.UndefOr[scala.Nothing],
      w: Double
    ): Node = js.native
    def setRotation(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], z: Double): Node = js.native
    def setRotation(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], z: Double, w: Double): Node = js.native
    def setRotation(x: js.UndefOr[scala.Nothing], y: Double): Node = js.native
    def setRotation(x: js.UndefOr[scala.Nothing], y: Double, z: js.UndefOr[scala.Nothing], w: Double): Node = js.native
    def setRotation(x: js.UndefOr[scala.Nothing], y: Double, z: Double): Node = js.native
    def setRotation(x: js.UndefOr[scala.Nothing], y: Double, z: Double, w: Double): Node = js.native
    def setRotation(x: Double): Node = js.native
    def setRotation(x: Double, y: js.UndefOr[scala.Nothing], z: js.UndefOr[scala.Nothing], w: Double): Node = js.native
    def setRotation(x: Double, y: js.UndefOr[scala.Nothing], z: Double): Node = js.native
    def setRotation(x: Double, y: js.UndefOr[scala.Nothing], z: Double, w: Double): Node = js.native
    def setRotation(x: Double, y: Double): Node = js.native
    def setRotation(x: Double, y: Double, z: js.UndefOr[scala.Nothing], w: Double): Node = js.native
    def setRotation(x: Double, y: Double, z: Double): Node = js.native
    def setRotation(x: Double, y: Double, z: Double, w: Double): Node = js.native
    
    def setScale(): Node = js.native
    def setScale(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], z: Double): Node = js.native
    def setScale(x: js.UndefOr[scala.Nothing], y: Double): Node = js.native
    def setScale(x: js.UndefOr[scala.Nothing], y: Double, z: Double): Node = js.native
    def setScale(x: Double): Node = js.native
    def setScale(x: Double, y: js.UndefOr[scala.Nothing], z: Double): Node = js.native
    def setScale(x: Double, y: Double): Node = js.native
    def setScale(x: Double, y: Double, z: Double): Node = js.native
    
    def setSizeMode(): Node = js.native
    def setSizeMode(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], z: String): Node = js.native
    def setSizeMode(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], z: Double): Node = js.native
    def setSizeMode(x: js.UndefOr[scala.Nothing], y: String): Node = js.native
    def setSizeMode(x: js.UndefOr[scala.Nothing], y: String, z: String): Node = js.native
    def setSizeMode(x: js.UndefOr[scala.Nothing], y: String, z: Double): Node = js.native
    def setSizeMode(x: js.UndefOr[scala.Nothing], y: Double): Node = js.native
    def setSizeMode(x: js.UndefOr[scala.Nothing], y: Double, z: String): Node = js.native
    def setSizeMode(x: js.UndefOr[scala.Nothing], y: Double, z: Double): Node = js.native
    def setSizeMode(x: String): Node = js.native
    def setSizeMode(x: String, y: js.UndefOr[scala.Nothing], z: String): Node = js.native
    def setSizeMode(x: String, y: js.UndefOr[scala.Nothing], z: Double): Node = js.native
    def setSizeMode(x: String, y: String): Node = js.native
    def setSizeMode(x: String, y: String, z: String): Node = js.native
    def setSizeMode(x: String, y: String, z: Double): Node = js.native
    def setSizeMode(x: String, y: Double): Node = js.native
    def setSizeMode(x: String, y: Double, z: String): Node = js.native
    def setSizeMode(x: String, y: Double, z: Double): Node = js.native
    def setSizeMode(x: Double): Node = js.native
    def setSizeMode(x: Double, y: js.UndefOr[scala.Nothing], z: String): Node = js.native
    def setSizeMode(x: Double, y: js.UndefOr[scala.Nothing], z: Double): Node = js.native
    def setSizeMode(x: Double, y: String): Node = js.native
    def setSizeMode(x: Double, y: String, z: String): Node = js.native
    def setSizeMode(x: Double, y: String, z: Double): Node = js.native
    def setSizeMode(x: Double, y: Double): Node = js.native
    def setSizeMode(x: Double, y: Double, z: String): Node = js.native
    def setSizeMode(x: Double, y: Double, z: Double): Node = js.native
    
    def show(): Node = js.native
  }
  /* static members */
  @js.native
  object Node extends js.Object {
    
    var ABSOLUTE_SIZE: Double = js.native
    
    var DEFAULT_SIZE: Double = js.native
    
    var RELATIVE_SIZE: Double = js.native
    
    var RENDER_SIZE: Double = js.native
  }
  
  @js.native
  class Scene () extends Node
  
  @js.native
  class Size () extends js.Object
  /* static members */
  @js.native
  object Size extends js.Object {
    
    var ABSOLUTE: Double = js.native
    
    var DEFAULT: Double = js.native
    
    var RELATIVE: Double = js.native
    
    var RENDER: Double = js.native
  }
  
  @js.native
  class SizeSystem () extends js.Object
  /* static members */
  @js.native
  object SizeSystem extends js.Object {
    
    def deregisterSizeAtPath(path: String): Unit = js.native
  }
  
  @js.native
  class TransformSystem () extends js.Object
  /* static members */
  @js.native
  object TransformSystem extends js.Object {
    
    def deregisterTransformAtPath(path: String): Unit = js.native
  }
}
