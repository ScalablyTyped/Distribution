package typings.famous

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreMod {
  
  @JSImport("famous/core", "Clock")
  @js.native
  class Clock () extends StObject {
    
    def setTimeout(callback: js.Function): Unit = js.native
    def setTimeout(callback: js.Function, delay: Double): Unit = js.native
  }
  
  @JSImport("famous/core", "Dispatch")
  @js.native
  class Dispatch () extends StObject
  /* static members */
  object Dispatch {
    
    @JSImport("famous/core", "Dispatch.dispatchUIEvent")
    @js.native
    def dispatchUIEvent(path: String, event: String, payload: js.Any): Unit = js.native
  }
  
  @JSImport("famous/core", "FamousEngine")
  @js.native
  class FamousEngine () extends StObject {
    
    def createScene(): Scene = js.native
  }
  /* static members */
  object FamousEngine {
    
    @JSImport("famous/core", "FamousEngine.createScene")
    @js.native
    def createScene(): Scene = js.native
    
    @JSImport("famous/core", "FamousEngine.getClock")
    @js.native
    def getClock(): Clock = js.native
    
    @JSImport("famous/core", "FamousEngine.getContext")
    @js.native
    def getContext(selector: String): Scene = js.native
    
    @JSImport("famous/core", "FamousEngine.init")
    @js.native
    def init(): FamousEngine = js.native
    
    @JSImport("famous/core", "FamousEngine.requestUpdate")
    @js.native
    def requestUpdate(requester: Double): Unit = js.native
    
    @JSImport("famous/core", "FamousEngine.requestUpdateOnNextTick")
    @js.native
    def requestUpdateOnNextTick(requester: Double): Unit = js.native
  }
  
  @JSImport("famous/core", "Node")
  @js.native
  class Node () extends StObject {
    
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
  object Node {
    
    @JSImport("famous/core", "Node")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("famous/core", "Node.ABSOLUTE_SIZE")
    @js.native
    def ABSOLUTE_SIZE: Double = js.native
    @scala.inline
    def ABSOLUTE_SIZE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ABSOLUTE_SIZE")(x.asInstanceOf[js.Any])
    
    @JSImport("famous/core", "Node.DEFAULT_SIZE")
    @js.native
    def DEFAULT_SIZE: Double = js.native
    @scala.inline
    def DEFAULT_SIZE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_SIZE")(x.asInstanceOf[js.Any])
    
    @JSImport("famous/core", "Node.RELATIVE_SIZE")
    @js.native
    def RELATIVE_SIZE: Double = js.native
    @scala.inline
    def RELATIVE_SIZE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RELATIVE_SIZE")(x.asInstanceOf[js.Any])
    
    @JSImport("famous/core", "Node.RENDER_SIZE")
    @js.native
    def RENDER_SIZE: Double = js.native
    @scala.inline
    def RENDER_SIZE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RENDER_SIZE")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("famous/core", "Scene")
  @js.native
  class Scene () extends Node
  
  @JSImport("famous/core", "Size")
  @js.native
  class Size () extends StObject
  /* static members */
  object Size {
    
    @JSImport("famous/core", "Size")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("famous/core", "Size.ABSOLUTE")
    @js.native
    def ABSOLUTE: Double = js.native
    @scala.inline
    def ABSOLUTE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ABSOLUTE")(x.asInstanceOf[js.Any])
    
    @JSImport("famous/core", "Size.DEFAULT")
    @js.native
    def DEFAULT: Double = js.native
    @scala.inline
    def DEFAULT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT")(x.asInstanceOf[js.Any])
    
    @JSImport("famous/core", "Size.RELATIVE")
    @js.native
    def RELATIVE: Double = js.native
    @scala.inline
    def RELATIVE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RELATIVE")(x.asInstanceOf[js.Any])
    
    @JSImport("famous/core", "Size.RENDER")
    @js.native
    def RENDER: Double = js.native
    @scala.inline
    def RENDER_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RENDER")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("famous/core", "SizeSystem")
  @js.native
  class SizeSystem () extends StObject
  /* static members */
  object SizeSystem {
    
    @JSImport("famous/core", "SizeSystem.deregisterSizeAtPath")
    @js.native
    def deregisterSizeAtPath(path: String): Unit = js.native
  }
  
  @JSImport("famous/core", "TransformSystem")
  @js.native
  class TransformSystem () extends StObject
  /* static members */
  object TransformSystem {
    
    @JSImport("famous/core", "TransformSystem.deregisterTransformAtPath")
    @js.native
    def deregisterTransformAtPath(path: String): Unit = js.native
  }
}
