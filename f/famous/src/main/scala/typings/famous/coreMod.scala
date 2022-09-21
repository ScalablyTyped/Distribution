package typings.famous

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreMod {
  
  @JSImport("famous/core", "Clock")
  @js.native
  open class Clock () extends StObject {
    
    def setTimeout(callback: js.Function): Unit = js.native
    def setTimeout(callback: js.Function, delay: Double): Unit = js.native
  }
  
  @JSImport("famous/core", "Dispatch")
  @js.native
  open class Dispatch () extends StObject
  /* static members */
  object Dispatch {
    
    @JSImport("famous/core", "Dispatch")
    @js.native
    val ^ : js.Any = js.native
    
    inline def dispatchUIEvent(path: String, event: String, payload: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("dispatchUIEvent")(path.asInstanceOf[js.Any], event.asInstanceOf[js.Any], payload.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  @JSImport("famous/core", "FamousEngine")
  @js.native
  open class FamousEngine () extends StObject {
    
    def createScene(): Scene = js.native
  }
  /* static members */
  object FamousEngine {
    
    @JSImport("famous/core", "FamousEngine")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createScene(): Scene = ^.asInstanceOf[js.Dynamic].applyDynamic("createScene")().asInstanceOf[Scene]
    
    inline def getClock(): Clock = ^.asInstanceOf[js.Dynamic].applyDynamic("getClock")().asInstanceOf[Clock]
    
    inline def getContext(selector: String): Scene = ^.asInstanceOf[js.Dynamic].applyDynamic("getContext")(selector.asInstanceOf[js.Any]).asInstanceOf[Scene]
    
    inline def init(): FamousEngine = ^.asInstanceOf[js.Dynamic].applyDynamic("init")().asInstanceOf[FamousEngine]
    
    inline def requestUpdate(requester: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("requestUpdate")(requester.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def requestUpdateOnNextTick(requester: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("requestUpdateOnNextTick")(requester.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  @JSImport("famous/core", "Node")
  @js.native
  open class Node () extends StObject {
    
    def addChild(): Node = js.native
    def addChild(node: Node): Node = js.native
    
    def addComponent(component: Any): Double = js.native
    
    def addUIEvent(eventName: String): Unit = js.native
    
    def dismount(): Unit = js.native
    
    def emit(event: Any): Unit = js.native
    def emit(event: Any, payload: Any): Unit = js.native
    
    def getAbsoluteSize(): js.Array[Double] = js.native
    
    def getAlign(): js.Array[Double] = js.native
    
    def getChildren(): js.Array[Node] = js.native
    
    def getComponent(index: Double): Any = js.native
    
    def getComponents(): js.Array[Any] = js.native
    
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
    def setAbsoluteSize(x: Double): Node = js.native
    def setAbsoluteSize(x: Double, y: Double): Node = js.native
    def setAbsoluteSize(x: Double, y: Double, z: Double): Node = js.native
    def setAbsoluteSize(x: Double, y: Unit, z: Double): Node = js.native
    def setAbsoluteSize(x: Unit, y: Double): Node = js.native
    def setAbsoluteSize(x: Unit, y: Double, z: Double): Node = js.native
    def setAbsoluteSize(x: Unit, y: Unit, z: Double): Node = js.native
    
    def setAlign(): Node = js.native
    def setAlign(x: Double): Node = js.native
    def setAlign(x: Double, y: Double): Node = js.native
    def setAlign(x: Double, y: Double, z: Double): Node = js.native
    def setAlign(x: Double, y: Unit, z: Double): Node = js.native
    def setAlign(x: Unit, y: Double): Node = js.native
    def setAlign(x: Unit, y: Double, z: Double): Node = js.native
    def setAlign(x: Unit, y: Unit, z: Double): Node = js.native
    
    def setDifferentialSize(): Node = js.native
    def setDifferentialSize(x: Double): Node = js.native
    def setDifferentialSize(x: Double, y: Double): Node = js.native
    def setDifferentialSize(x: Double, y: Double, z: Double): Node = js.native
    def setDifferentialSize(x: Double, y: Unit, z: Double): Node = js.native
    def setDifferentialSize(x: Unit, y: Double): Node = js.native
    def setDifferentialSize(x: Unit, y: Double, z: Double): Node = js.native
    def setDifferentialSize(x: Unit, y: Unit, z: Double): Node = js.native
    
    def setMountPoint(): Node = js.native
    def setMountPoint(x: Double): Node = js.native
    def setMountPoint(x: Double, y: Double): Node = js.native
    def setMountPoint(x: Double, y: Double, z: Double): Node = js.native
    def setMountPoint(x: Double, y: Unit, z: Double): Node = js.native
    def setMountPoint(x: Unit, y: Double): Node = js.native
    def setMountPoint(x: Unit, y: Double, z: Double): Node = js.native
    def setMountPoint(x: Unit, y: Unit, z: Double): Node = js.native
    
    def setOrigin(): Node = js.native
    def setOrigin(x: Double): Node = js.native
    def setOrigin(x: Double, y: Double): Node = js.native
    def setOrigin(x: Double, y: Double, z: Double): Node = js.native
    def setOrigin(x: Double, y: Unit, z: Double): Node = js.native
    def setOrigin(x: Unit, y: Double): Node = js.native
    def setOrigin(x: Unit, y: Double, z: Double): Node = js.native
    def setOrigin(x: Unit, y: Unit, z: Double): Node = js.native
    
    def setPosition(): Node = js.native
    def setPosition(x: Double): Node = js.native
    def setPosition(x: Double, y: Double): Node = js.native
    def setPosition(x: Double, y: Double, z: Double): Node = js.native
    def setPosition(x: Double, y: Unit, z: Double): Node = js.native
    def setPosition(x: Unit, y: Double): Node = js.native
    def setPosition(x: Unit, y: Double, z: Double): Node = js.native
    def setPosition(x: Unit, y: Unit, z: Double): Node = js.native
    
    def setProportionalSize(): Node = js.native
    def setProportionalSize(x: Double): Node = js.native
    def setProportionalSize(x: Double, y: Double): Node = js.native
    def setProportionalSize(x: Double, y: Double, z: Double): Node = js.native
    def setProportionalSize(x: Double, y: Unit, z: Double): Node = js.native
    def setProportionalSize(x: Unit, y: Double): Node = js.native
    def setProportionalSize(x: Unit, y: Double, z: Double): Node = js.native
    def setProportionalSize(x: Unit, y: Unit, z: Double): Node = js.native
    
    def setRotation(): Node = js.native
    def setRotation(x: Double): Node = js.native
    def setRotation(x: Double, y: Double): Node = js.native
    def setRotation(x: Double, y: Double, z: Double): Node = js.native
    def setRotation(x: Double, y: Double, z: Double, w: Double): Node = js.native
    def setRotation(x: Double, y: Double, z: Unit, w: Double): Node = js.native
    def setRotation(x: Double, y: Unit, z: Double): Node = js.native
    def setRotation(x: Double, y: Unit, z: Double, w: Double): Node = js.native
    def setRotation(x: Double, y: Unit, z: Unit, w: Double): Node = js.native
    def setRotation(x: Unit, y: Double): Node = js.native
    def setRotation(x: Unit, y: Double, z: Double): Node = js.native
    def setRotation(x: Unit, y: Double, z: Double, w: Double): Node = js.native
    def setRotation(x: Unit, y: Double, z: Unit, w: Double): Node = js.native
    def setRotation(x: Unit, y: Unit, z: Double): Node = js.native
    def setRotation(x: Unit, y: Unit, z: Double, w: Double): Node = js.native
    def setRotation(x: Unit, y: Unit, z: Unit, w: Double): Node = js.native
    
    def setScale(): Node = js.native
    def setScale(x: Double): Node = js.native
    def setScale(x: Double, y: Double): Node = js.native
    def setScale(x: Double, y: Double, z: Double): Node = js.native
    def setScale(x: Double, y: Unit, z: Double): Node = js.native
    def setScale(x: Unit, y: Double): Node = js.native
    def setScale(x: Unit, y: Double, z: Double): Node = js.native
    def setScale(x: Unit, y: Unit, z: Double): Node = js.native
    
    def setSizeMode(): Node = js.native
    def setSizeMode(x: String): Node = js.native
    def setSizeMode(x: String, y: String): Node = js.native
    def setSizeMode(x: String, y: String, z: String): Node = js.native
    def setSizeMode(x: String, y: String, z: Double): Node = js.native
    def setSizeMode(x: String, y: Double): Node = js.native
    def setSizeMode(x: String, y: Double, z: String): Node = js.native
    def setSizeMode(x: String, y: Double, z: Double): Node = js.native
    def setSizeMode(x: String, y: Unit, z: String): Node = js.native
    def setSizeMode(x: String, y: Unit, z: Double): Node = js.native
    def setSizeMode(x: Double): Node = js.native
    def setSizeMode(x: Double, y: String): Node = js.native
    def setSizeMode(x: Double, y: String, z: String): Node = js.native
    def setSizeMode(x: Double, y: String, z: Double): Node = js.native
    def setSizeMode(x: Double, y: Double): Node = js.native
    def setSizeMode(x: Double, y: Double, z: String): Node = js.native
    def setSizeMode(x: Double, y: Double, z: Double): Node = js.native
    def setSizeMode(x: Double, y: Unit, z: String): Node = js.native
    def setSizeMode(x: Double, y: Unit, z: Double): Node = js.native
    def setSizeMode(x: Unit, y: String): Node = js.native
    def setSizeMode(x: Unit, y: String, z: String): Node = js.native
    def setSizeMode(x: Unit, y: String, z: Double): Node = js.native
    def setSizeMode(x: Unit, y: Double): Node = js.native
    def setSizeMode(x: Unit, y: Double, z: String): Node = js.native
    def setSizeMode(x: Unit, y: Double, z: Double): Node = js.native
    def setSizeMode(x: Unit, y: Unit, z: String): Node = js.native
    def setSizeMode(x: Unit, y: Unit, z: Double): Node = js.native
    
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
    inline def ABSOLUTE_SIZE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ABSOLUTE_SIZE")(x.asInstanceOf[js.Any])
    
    @JSImport("famous/core", "Node.DEFAULT_SIZE")
    @js.native
    def DEFAULT_SIZE: Double = js.native
    inline def DEFAULT_SIZE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_SIZE")(x.asInstanceOf[js.Any])
    
    @JSImport("famous/core", "Node.RELATIVE_SIZE")
    @js.native
    def RELATIVE_SIZE: Double = js.native
    inline def RELATIVE_SIZE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RELATIVE_SIZE")(x.asInstanceOf[js.Any])
    
    @JSImport("famous/core", "Node.RENDER_SIZE")
    @js.native
    def RENDER_SIZE: Double = js.native
    inline def RENDER_SIZE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RENDER_SIZE")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("famous/core", "Scene")
  @js.native
  open class Scene () extends Node
  
  @JSImport("famous/core", "Size")
  @js.native
  open class Size () extends StObject
  /* static members */
  object Size {
    
    @JSImport("famous/core", "Size")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("famous/core", "Size.ABSOLUTE")
    @js.native
    def ABSOLUTE: Double = js.native
    inline def ABSOLUTE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ABSOLUTE")(x.asInstanceOf[js.Any])
    
    @JSImport("famous/core", "Size.DEFAULT")
    @js.native
    def DEFAULT: Double = js.native
    inline def DEFAULT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT")(x.asInstanceOf[js.Any])
    
    @JSImport("famous/core", "Size.RELATIVE")
    @js.native
    def RELATIVE: Double = js.native
    inline def RELATIVE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RELATIVE")(x.asInstanceOf[js.Any])
    
    @JSImport("famous/core", "Size.RENDER")
    @js.native
    def RENDER: Double = js.native
    inline def RENDER_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RENDER")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("famous/core", "SizeSystem")
  @js.native
  open class SizeSystem () extends StObject
  /* static members */
  object SizeSystem {
    
    @JSImport("famous/core", "SizeSystem")
    @js.native
    val ^ : js.Any = js.native
    
    inline def deregisterSizeAtPath(path: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("deregisterSizeAtPath")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  @JSImport("famous/core", "TransformSystem")
  @js.native
  open class TransformSystem () extends StObject
  /* static members */
  object TransformSystem {
    
    @JSImport("famous/core", "TransformSystem")
    @js.native
    val ^ : js.Any = js.native
    
    inline def deregisterTransformAtPath(path: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("deregisterTransformAtPath")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}
