package typings.famous

import typings.famous.coreMod.Node
import typings.famous.mathMod.Vec2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsMod {
  
  @JSImport("famous/components", "Align")
  @js.native
  open class Align protected () extends StObject {
    def this(node: Node) = this()
    
    def getX(): Double = js.native
    
    def getY(): Double = js.native
    
    def getZ(): Double = js.native
    
    def halt(): Position = js.native
    
    def isActive(): Boolean = js.native
    
    def onUpdate(): Unit = js.native
    
    def set(x: Double): Align = js.native
    def set(x: Double, y: Double): Align = js.native
    def set(x: Double, y: Double, z: Double): Align = js.native
    def set(x: Double, y: Double, z: Double, transition: Any): Align = js.native
    def set(x: Double, y: Double, z: Double, transition: Any, callback: js.Function): Align = js.native
    def set(x: Double, y: Double, z: Double, transition: Unit, callback: js.Function): Align = js.native
    def set(x: Double, y: Double, z: Unit, transition: Any): Align = js.native
    def set(x: Double, y: Double, z: Unit, transition: Any, callback: js.Function): Align = js.native
    def set(x: Double, y: Double, z: Unit, transition: Unit, callback: js.Function): Align = js.native
    def set(x: Double, y: Unit, z: Double): Align = js.native
    def set(x: Double, y: Unit, z: Double, transition: Any): Align = js.native
    def set(x: Double, y: Unit, z: Double, transition: Any, callback: js.Function): Align = js.native
    def set(x: Double, y: Unit, z: Double, transition: Unit, callback: js.Function): Align = js.native
    def set(x: Double, y: Unit, z: Unit, transition: Any): Align = js.native
    def set(x: Double, y: Unit, z: Unit, transition: Any, callback: js.Function): Align = js.native
    def set(x: Double, y: Unit, z: Unit, transition: Unit, callback: js.Function): Align = js.native
    
    def setX(`val`: Double): Align = js.native
    def setX(`val`: Double, transition: Any): Align = js.native
    def setX(`val`: Double, transition: Any, callback: js.Function): Align = js.native
    def setX(`val`: Double, transition: Unit, callback: js.Function): Align = js.native
    
    def setY(`val`: Double): Align = js.native
    def setY(`val`: Double, transition: Any): Align = js.native
    def setY(`val`: Double, transition: Any, callback: js.Function): Align = js.native
    def setY(`val`: Double, transition: Unit, callback: js.Function): Align = js.native
    
    def setZ(`val`: Double): Align = js.native
    def setZ(`val`: Double, transition: Any): Align = js.native
    def setZ(`val`: Double, transition: Any, callback: js.Function): Align = js.native
    def setZ(`val`: Double, transition: Unit, callback: js.Function): Align = js.native
    
    def update(): Unit = js.native
  }
  
  @JSImport("famous/components", "GestureHandler")
  @js.native
  open class GestureHandler protected () extends StObject {
    def this(node: Node) = this()
    def this(node: Node, events: js.Array[IGestureEvent]) = this()
    
    def on(ev: String, cb: js.Function1[/* payload */ js.UndefOr[IGesturePayload], Unit]): Unit = js.native
    def on(ev: IGestureEvent, cb: js.Function1[/* payload */ js.UndefOr[IGesturePayload], Unit]): Unit = js.native
    
    def onReceive(ev: String, payload: IGesturePayload): Unit = js.native
    
    def trigger(ev: String): Unit = js.native
    def trigger(ev: String, payload: IGesturePayload): Unit = js.native
    
    def triggerGestures(): Unit = js.native
  }
  
  @JSImport("famous/components", "MountPoint")
  @js.native
  open class MountPoint protected () extends StObject {
    def this(node: Node) = this()
    
    def getX(): Double = js.native
    
    def getY(): Double = js.native
    
    def getZ(): Double = js.native
    
    def halt(): Position = js.native
    
    def isActive(): Boolean = js.native
    
    def onUpdate(): Unit = js.native
    
    def set(x: Double): MountPoint = js.native
    def set(x: Double, y: Double): MountPoint = js.native
    def set(x: Double, y: Double, z: Double): MountPoint = js.native
    def set(x: Double, y: Double, z: Double, transition: Any): MountPoint = js.native
    def set(x: Double, y: Double, z: Double, transition: Any, callback: js.Function): MountPoint = js.native
    def set(x: Double, y: Double, z: Double, transition: Unit, callback: js.Function): MountPoint = js.native
    def set(x: Double, y: Double, z: Unit, transition: Any): MountPoint = js.native
    def set(x: Double, y: Double, z: Unit, transition: Any, callback: js.Function): MountPoint = js.native
    def set(x: Double, y: Double, z: Unit, transition: Unit, callback: js.Function): MountPoint = js.native
    def set(x: Double, y: Unit, z: Double): MountPoint = js.native
    def set(x: Double, y: Unit, z: Double, transition: Any): MountPoint = js.native
    def set(x: Double, y: Unit, z: Double, transition: Any, callback: js.Function): MountPoint = js.native
    def set(x: Double, y: Unit, z: Double, transition: Unit, callback: js.Function): MountPoint = js.native
    def set(x: Double, y: Unit, z: Unit, transition: Any): MountPoint = js.native
    def set(x: Double, y: Unit, z: Unit, transition: Any, callback: js.Function): MountPoint = js.native
    def set(x: Double, y: Unit, z: Unit, transition: Unit, callback: js.Function): MountPoint = js.native
    
    def setX(`val`: Double): MountPoint = js.native
    def setX(`val`: Double, transition: Any): MountPoint = js.native
    def setX(`val`: Double, transition: Any, callback: js.Function): MountPoint = js.native
    def setX(`val`: Double, transition: Unit, callback: js.Function): MountPoint = js.native
    
    def setY(`val`: Double): MountPoint = js.native
    def setY(`val`: Double, transition: Any): MountPoint = js.native
    def setY(`val`: Double, transition: Any, callback: js.Function): MountPoint = js.native
    def setY(`val`: Double, transition: Unit, callback: js.Function): MountPoint = js.native
    
    def setZ(`val`: Double): MountPoint = js.native
    def setZ(`val`: Double, transition: Any): MountPoint = js.native
    def setZ(`val`: Double, transition: Any, callback: js.Function): MountPoint = js.native
    def setZ(`val`: Double, transition: Unit, callback: js.Function): MountPoint = js.native
    
    def update(): Unit = js.native
  }
  
  @JSImport("famous/components", "Opacity")
  @js.native
  open class Opacity protected () extends StObject {
    def this(node: Node) = this()
    
    def get(): Double = js.native
    
    def halt(): Position = js.native
    
    def isActive(): Boolean = js.native
    
    def onUpdate(): Unit = js.native
    
    def set(value: Double): Opacity = js.native
    def set(value: Double, transition: Any): Opacity = js.native
    def set(value: Double, transition: Any, callback: js.Function): Opacity = js.native
    def set(value: Double, transition: Unit, callback: js.Function): Opacity = js.native
    
    def update(): Unit = js.native
  }
  
  @JSImport("famous/components", "Origin")
  @js.native
  open class Origin protected () extends StObject {
    def this(node: Node) = this()
    
    def getX(): Double = js.native
    
    def getY(): Double = js.native
    
    def getZ(): Double = js.native
    
    def halt(): Position = js.native
    
    def isActive(): Boolean = js.native
    
    def onUpdate(): Unit = js.native
    
    def set(x: Double): Origin = js.native
    def set(x: Double, y: Double): Origin = js.native
    def set(x: Double, y: Double, z: Double): Origin = js.native
    def set(x: Double, y: Double, z: Double, transition: Any): Origin = js.native
    def set(x: Double, y: Double, z: Double, transition: Any, callback: js.Function): Origin = js.native
    def set(x: Double, y: Double, z: Double, transition: Unit, callback: js.Function): Origin = js.native
    def set(x: Double, y: Double, z: Unit, transition: Any): Origin = js.native
    def set(x: Double, y: Double, z: Unit, transition: Any, callback: js.Function): Origin = js.native
    def set(x: Double, y: Double, z: Unit, transition: Unit, callback: js.Function): Origin = js.native
    def set(x: Double, y: Unit, z: Double): Origin = js.native
    def set(x: Double, y: Unit, z: Double, transition: Any): Origin = js.native
    def set(x: Double, y: Unit, z: Double, transition: Any, callback: js.Function): Origin = js.native
    def set(x: Double, y: Unit, z: Double, transition: Unit, callback: js.Function): Origin = js.native
    def set(x: Double, y: Unit, z: Unit, transition: Any): Origin = js.native
    def set(x: Double, y: Unit, z: Unit, transition: Any, callback: js.Function): Origin = js.native
    def set(x: Double, y: Unit, z: Unit, transition: Unit, callback: js.Function): Origin = js.native
    
    def setX(`val`: Double): Origin = js.native
    def setX(`val`: Double, transition: Any): Origin = js.native
    def setX(`val`: Double, transition: Any, callback: js.Function): Origin = js.native
    def setX(`val`: Double, transition: Unit, callback: js.Function): Origin = js.native
    
    def setY(`val`: Double): Origin = js.native
    def setY(`val`: Double, transition: Any): Origin = js.native
    def setY(`val`: Double, transition: Any, callback: js.Function): Origin = js.native
    def setY(`val`: Double, transition: Unit, callback: js.Function): Origin = js.native
    
    def setZ(`val`: Double): Origin = js.native
    def setZ(`val`: Double, transition: Any): Origin = js.native
    def setZ(`val`: Double, transition: Any, callback: js.Function): Origin = js.native
    def setZ(`val`: Double, transition: Unit, callback: js.Function): Origin = js.native
    
    def update(): Unit = js.native
  }
  
  @JSImport("famous/components", "Position")
  @js.native
  open class Position protected () extends StObject {
    def this(node: Node) = this()
    
    def getX(): Double = js.native
    
    def getY(): Double = js.native
    
    def getZ(): Double = js.native
    
    def halt(): Position = js.native
    
    def isActive(): Boolean = js.native
    
    def onUpdate(): Unit = js.native
    
    def set(x: Double): Position = js.native
    def set(x: Double, y: Double): Position = js.native
    def set(x: Double, y: Double, z: Double): Position = js.native
    def set(x: Double, y: Double, z: Double, transition: Any): Position = js.native
    def set(x: Double, y: Double, z: Double, transition: Any, callback: js.Function): Position = js.native
    def set(x: Double, y: Double, z: Double, transition: Unit, callback: js.Function): Position = js.native
    def set(x: Double, y: Double, z: Unit, transition: Any): Position = js.native
    def set(x: Double, y: Double, z: Unit, transition: Any, callback: js.Function): Position = js.native
    def set(x: Double, y: Double, z: Unit, transition: Unit, callback: js.Function): Position = js.native
    def set(x: Double, y: Unit, z: Double): Position = js.native
    def set(x: Double, y: Unit, z: Double, transition: Any): Position = js.native
    def set(x: Double, y: Unit, z: Double, transition: Any, callback: js.Function): Position = js.native
    def set(x: Double, y: Unit, z: Double, transition: Unit, callback: js.Function): Position = js.native
    def set(x: Double, y: Unit, z: Unit, transition: Any): Position = js.native
    def set(x: Double, y: Unit, z: Unit, transition: Any, callback: js.Function): Position = js.native
    def set(x: Double, y: Unit, z: Unit, transition: Unit, callback: js.Function): Position = js.native
    
    def setX(`val`: Double): Position = js.native
    def setX(`val`: Double, transition: Any): Position = js.native
    def setX(`val`: Double, transition: Any, callback: js.Function): Position = js.native
    def setX(`val`: Double, transition: Unit, callback: js.Function): Position = js.native
    
    def setY(`val`: Double): Position = js.native
    def setY(`val`: Double, transition: Any): Position = js.native
    def setY(`val`: Double, transition: Any, callback: js.Function): Position = js.native
    def setY(`val`: Double, transition: Unit, callback: js.Function): Position = js.native
    
    def setZ(`val`: Double): Position = js.native
    def setZ(`val`: Double, transition: Any): Position = js.native
    def setZ(`val`: Double, transition: Any, callback: js.Function): Position = js.native
    def setZ(`val`: Double, transition: Unit, callback: js.Function): Position = js.native
    
    def update(): Unit = js.native
  }
  
  @JSImport("famous/components", "Rotation")
  @js.native
  open class Rotation protected () extends StObject {
    def this(node: Node) = this()
    
    def getX(): Double = js.native
    
    def getY(): Double = js.native
    
    def getZ(): Double = js.native
    
    def halt(): Position = js.native
    
    def isActive(): Boolean = js.native
    
    def onUpdate(): Unit = js.native
    
    def set(x: Double): Rotation = js.native
    def set(x: Double, y: Double): Rotation = js.native
    def set(x: Double, y: Double, z: Double): Rotation = js.native
    def set(x: Double, y: Double, z: Double, transition: Any): Rotation = js.native
    def set(x: Double, y: Double, z: Double, transition: Any, callback: js.Function): Rotation = js.native
    def set(x: Double, y: Double, z: Double, transition: Unit, callback: js.Function): Rotation = js.native
    def set(x: Double, y: Double, z: Unit, transition: Any): Rotation = js.native
    def set(x: Double, y: Double, z: Unit, transition: Any, callback: js.Function): Rotation = js.native
    def set(x: Double, y: Double, z: Unit, transition: Unit, callback: js.Function): Rotation = js.native
    def set(x: Double, y: Unit, z: Double): Rotation = js.native
    def set(x: Double, y: Unit, z: Double, transition: Any): Rotation = js.native
    def set(x: Double, y: Unit, z: Double, transition: Any, callback: js.Function): Rotation = js.native
    def set(x: Double, y: Unit, z: Double, transition: Unit, callback: js.Function): Rotation = js.native
    def set(x: Double, y: Unit, z: Unit, transition: Any): Rotation = js.native
    def set(x: Double, y: Unit, z: Unit, transition: Any, callback: js.Function): Rotation = js.native
    def set(x: Double, y: Unit, z: Unit, transition: Unit, callback: js.Function): Rotation = js.native
    
    def setX(`val`: Double): Rotation = js.native
    def setX(`val`: Double, transition: Any): Rotation = js.native
    def setX(`val`: Double, transition: Any, callback: js.Function): Rotation = js.native
    def setX(`val`: Double, transition: Unit, callback: js.Function): Rotation = js.native
    
    def setY(`val`: Double): Rotation = js.native
    def setY(`val`: Double, transition: Any): Rotation = js.native
    def setY(`val`: Double, transition: Any, callback: js.Function): Rotation = js.native
    def setY(`val`: Double, transition: Unit, callback: js.Function): Rotation = js.native
    
    def setZ(`val`: Double): Rotation = js.native
    def setZ(`val`: Double, transition: Any): Rotation = js.native
    def setZ(`val`: Double, transition: Any, callback: js.Function): Rotation = js.native
    def setZ(`val`: Double, transition: Unit, callback: js.Function): Rotation = js.native
    
    def update(): Unit = js.native
  }
  
  @JSImport("famous/components", "Scale")
  @js.native
  open class Scale protected () extends StObject {
    def this(node: Node) = this()
    
    def getX(): Double = js.native
    
    def getY(): Double = js.native
    
    def getZ(): Double = js.native
    
    def halt(): Position = js.native
    
    def isActive(): Boolean = js.native
    
    def onUpdate(): Unit = js.native
    
    def set(x: Double): Scale = js.native
    def set(x: Double, y: Double): Scale = js.native
    def set(x: Double, y: Double, z: Double): Scale = js.native
    def set(x: Double, y: Double, z: Double, transition: Any): Scale = js.native
    def set(x: Double, y: Double, z: Double, transition: Any, callback: js.Function): Scale = js.native
    def set(x: Double, y: Double, z: Double, transition: Unit, callback: js.Function): Scale = js.native
    def set(x: Double, y: Double, z: Unit, transition: Any): Scale = js.native
    def set(x: Double, y: Double, z: Unit, transition: Any, callback: js.Function): Scale = js.native
    def set(x: Double, y: Double, z: Unit, transition: Unit, callback: js.Function): Scale = js.native
    def set(x: Double, y: Unit, z: Double): Scale = js.native
    def set(x: Double, y: Unit, z: Double, transition: Any): Scale = js.native
    def set(x: Double, y: Unit, z: Double, transition: Any, callback: js.Function): Scale = js.native
    def set(x: Double, y: Unit, z: Double, transition: Unit, callback: js.Function): Scale = js.native
    def set(x: Double, y: Unit, z: Unit, transition: Any): Scale = js.native
    def set(x: Double, y: Unit, z: Unit, transition: Any, callback: js.Function): Scale = js.native
    def set(x: Double, y: Unit, z: Unit, transition: Unit, callback: js.Function): Scale = js.native
    
    def setX(`val`: Double): Scale = js.native
    def setX(`val`: Double, transition: Any): Scale = js.native
    def setX(`val`: Double, transition: Any, callback: js.Function): Scale = js.native
    def setX(`val`: Double, transition: Unit, callback: js.Function): Scale = js.native
    
    def setY(`val`: Double): Scale = js.native
    def setY(`val`: Double, transition: Any): Scale = js.native
    def setY(`val`: Double, transition: Any, callback: js.Function): Scale = js.native
    def setY(`val`: Double, transition: Unit, callback: js.Function): Scale = js.native
    
    def setZ(`val`: Double): Scale = js.native
    def setZ(`val`: Double, transition: Any): Scale = js.native
    def setZ(`val`: Double, transition: Any, callback: js.Function): Scale = js.native
    def setZ(`val`: Double, transition: Unit, callback: js.Function): Scale = js.native
    
    def update(): Unit = js.native
  }
  
  @JSImport("famous/components", "Size")
  @js.native
  open class Size protected () extends StObject {
    def this(node: Node) = this()
    
    def setAbsolute(): Unit = js.native
    def setAbsolute(x: Double): Unit = js.native
    def setAbsolute(x: Double, y: Double): Unit = js.native
    def setAbsolute(x: Double, y: Double, z: Double): Unit = js.native
    def setAbsolute(x: Double, y: Double, z: Double, options: Any): Unit = js.native
    def setAbsolute(x: Double, y: Double, z: Double, options: Any, callback: js.Function): Unit = js.native
    def setAbsolute(x: Double, y: Double, z: Double, options: Unit, callback: js.Function): Unit = js.native
    def setAbsolute(x: Double, y: Double, z: Unit, options: Any): Unit = js.native
    def setAbsolute(x: Double, y: Double, z: Unit, options: Any, callback: js.Function): Unit = js.native
    def setAbsolute(x: Double, y: Double, z: Unit, options: Unit, callback: js.Function): Unit = js.native
    def setAbsolute(x: Double, y: Unit, z: Double): Unit = js.native
    def setAbsolute(x: Double, y: Unit, z: Double, options: Any): Unit = js.native
    def setAbsolute(x: Double, y: Unit, z: Double, options: Any, callback: js.Function): Unit = js.native
    def setAbsolute(x: Double, y: Unit, z: Double, options: Unit, callback: js.Function): Unit = js.native
    def setAbsolute(x: Double, y: Unit, z: Unit, options: Any): Unit = js.native
    def setAbsolute(x: Double, y: Unit, z: Unit, options: Any, callback: js.Function): Unit = js.native
    def setAbsolute(x: Double, y: Unit, z: Unit, options: Unit, callback: js.Function): Unit = js.native
    def setAbsolute(x: Unit, y: Double): Unit = js.native
    def setAbsolute(x: Unit, y: Double, z: Double): Unit = js.native
    def setAbsolute(x: Unit, y: Double, z: Double, options: Any): Unit = js.native
    def setAbsolute(x: Unit, y: Double, z: Double, options: Any, callback: js.Function): Unit = js.native
    def setAbsolute(x: Unit, y: Double, z: Double, options: Unit, callback: js.Function): Unit = js.native
    def setAbsolute(x: Unit, y: Double, z: Unit, options: Any): Unit = js.native
    def setAbsolute(x: Unit, y: Double, z: Unit, options: Any, callback: js.Function): Unit = js.native
    def setAbsolute(x: Unit, y: Double, z: Unit, options: Unit, callback: js.Function): Unit = js.native
    def setAbsolute(x: Unit, y: Unit, z: Double): Unit = js.native
    def setAbsolute(x: Unit, y: Unit, z: Double, options: Any): Unit = js.native
    def setAbsolute(x: Unit, y: Unit, z: Double, options: Any, callback: js.Function): Unit = js.native
    def setAbsolute(x: Unit, y: Unit, z: Double, options: Unit, callback: js.Function): Unit = js.native
    def setAbsolute(x: Unit, y: Unit, z: Unit, options: Any): Unit = js.native
    def setAbsolute(x: Unit, y: Unit, z: Unit, options: Any, callback: js.Function): Unit = js.native
    def setAbsolute(x: Unit, y: Unit, z: Unit, options: Unit, callback: js.Function): Unit = js.native
  }
  
  @JSImport("famous/components", "Transform")
  @js.native
  open class Transform protected () extends StObject {
    def this(node: Node) = this()
    
    def clean(): Unit = js.native
    
    def onUpdate(): Unit = js.native
    
    def translate(): Transform = js.native
  }
  
  @js.native
  trait IGestureEvent extends StObject {
    
    def callback(): Unit = js.native
    def callback(payload: IGesturePayload): Unit = js.native
    
    var event: String = js.native
  }
  
  trait IGesturePayload extends StObject {
    
    var center: Vec2
    
    var centerDelta: Vec2
    
    var centerVelocity: Vec2
    
    var current: Double
    
    var pointers: js.Array[IGesturePointer]
    
    var points: Double
    
    var status: String
    
    var time: Double
  }
  object IGesturePayload {
    
    inline def apply(
      center: Vec2,
      centerDelta: Vec2,
      centerVelocity: Vec2,
      current: Double,
      pointers: js.Array[IGesturePointer],
      points: Double,
      status: String,
      time: Double
    ): IGesturePayload = {
      val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], centerDelta = centerDelta.asInstanceOf[js.Any], centerVelocity = centerVelocity.asInstanceOf[js.Any], current = current.asInstanceOf[js.Any], pointers = pointers.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
      __obj.asInstanceOf[IGesturePayload]
    }
    
    extension [Self <: IGesturePayload](x: Self) {
      
      inline def setCenter(value: Vec2): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      inline def setCenterDelta(value: Vec2): Self = StObject.set(x, "centerDelta", value.asInstanceOf[js.Any])
      
      inline def setCenterVelocity(value: Vec2): Self = StObject.set(x, "centerVelocity", value.asInstanceOf[js.Any])
      
      inline def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setPointers(value: js.Array[IGesturePointer]): Self = StObject.set(x, "pointers", value.asInstanceOf[js.Any])
      
      inline def setPointersVarargs(value: IGesturePointer*): Self = StObject.set(x, "pointers", js.Array(value*))
      
      inline def setPoints(value: Double): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    }
  }
  
  trait IGesturePointer extends StObject {
    
    var delta: Vec2
    
    var position: Vec2
    
    var velocity: Vec2
  }
  object IGesturePointer {
    
    inline def apply(delta: Vec2, position: Vec2, velocity: Vec2): IGesturePointer = {
      val __obj = js.Dynamic.literal(delta = delta.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], velocity = velocity.asInstanceOf[js.Any])
      __obj.asInstanceOf[IGesturePointer]
    }
    
    extension [Self <: IGesturePointer](x: Self) {
      
      inline def setDelta(value: Vec2): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: Vec2): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setVelocity(value: Vec2): Self = StObject.set(x, "velocity", value.asInstanceOf[js.Any])
    }
  }
}
