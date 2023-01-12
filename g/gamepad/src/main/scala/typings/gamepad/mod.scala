package typings.gamepad

import org.scalablytyped.runtime.Shortcut
import typings.gamepad.gamepadStrings.attach
import typings.gamepad.gamepadStrings.down
import typings.gamepad.gamepadStrings.move
import typings.gamepad.gamepadStrings.remove
import typings.gamepad.gamepadStrings.up
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("gamepad", JSImport.Namespace)
  @js.native
  val ^ : NodeGamepad = js.native
  
  trait GamepadInstance extends StObject {
    
    var axisStates: js.Array[Double]
    
    var buttonStates: js.Array[Boolean]
    
    var description: String
    
    var deviceID: Double
    
    var productID: Double
    
    var vendorID: Double
  }
  object GamepadInstance {
    
    inline def apply(
      axisStates: js.Array[Double],
      buttonStates: js.Array[Boolean],
      description: String,
      deviceID: Double,
      productID: Double,
      vendorID: Double
    ): GamepadInstance = {
      val __obj = js.Dynamic.literal(axisStates = axisStates.asInstanceOf[js.Any], buttonStates = buttonStates.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], deviceID = deviceID.asInstanceOf[js.Any], productID = productID.asInstanceOf[js.Any], vendorID = vendorID.asInstanceOf[js.Any])
      __obj.asInstanceOf[GamepadInstance]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GamepadInstance] (val x: Self) extends AnyVal {
      
      inline def setAxisStates(value: js.Array[Double]): Self = StObject.set(x, "axisStates", value.asInstanceOf[js.Any])
      
      inline def setAxisStatesVarargs(value: Double*): Self = StObject.set(x, "axisStates", js.Array(value*))
      
      inline def setButtonStates(value: js.Array[Boolean]): Self = StObject.set(x, "buttonStates", value.asInstanceOf[js.Any])
      
      inline def setButtonStatesVarargs(value: Boolean*): Self = StObject.set(x, "buttonStates", js.Array(value*))
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDeviceID(value: Double): Self = StObject.set(x, "deviceID", value.asInstanceOf[js.Any])
      
      inline def setProductID(value: Double): Self = StObject.set(x, "productID", value.asInstanceOf[js.Any])
      
      inline def setVendorID(value: Double): Self = StObject.set(x, "vendorID", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NodeGamepad extends EventEmitter {
    
    def detectDevices(): Unit = js.native
    
    def deviceAtIndex(deviceIndex: Double): GamepadInstance = js.native
    
    def init(): Unit = js.native
    
    def numDevices(): Double = js.native
    
    def on(
      event: down | up,
      listener: js.Function3[/* deviceID */ Double, /* buttonID */ Double, /* timestamp */ Double, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_attach(event: attach, listener: js.Function2[/* deviceID */ Double, /* device */ GamepadInstance, Unit]): this.type = js.native
    @JSName("on")
    def on_move(
      event: move,
      listener: js.Function5[
          /* deviceID */ Double, 
          /* axisID */ Double, 
          /* value */ Double, 
          /* lastValue */ Double, 
          /* timestamp */ Double, 
          Unit
        ]
    ): this.type = js.native
    @JSName("on")
    def on_remove(event: remove, listener: js.Function1[/* deviceID */ Double, Unit]): this.type = js.native
    
    def processEvents(): Unit = js.native
    
    def shutdown(): Unit = js.native
  }
  
  type _To = NodeGamepad
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: NodeGamepad = ^
}
