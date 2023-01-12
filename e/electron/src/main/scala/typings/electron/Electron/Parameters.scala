package typings.electron.Electron

import typings.electron.electronStrings.desktop
import typings.electron.electronStrings.mobile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters extends StObject {
  
  /**
    * Set the device scale factor (if zero defaults to original device scale factor)
    * (default: `0`).
    */
  var deviceScaleFactor: Double
  
  /**
    * Scale of emulated view inside available space (not in fit to view mode)
    * (default: `1`).
    */
  var scale: Double
  
  /**
    * Specify the screen type to emulate (default: `desktop`):
    */
  var screenPosition: desktop | mobile
  
  /**
    * Set the emulated screen size (screenPosition == mobile).
    */
  var screenSize: Size
  
  /**
    * Position the view on the screen (screenPosition == mobile) (default: `{ x: 0, y:
    * 0 }`).
    */
  var viewPosition: Point
  
  /**
    * Set the emulated view size (empty means no override)
    */
  var viewSize: Size
}
object Parameters {
  
  inline def apply(
    deviceScaleFactor: Double,
    scale: Double,
    screenPosition: desktop | mobile,
    screenSize: Size,
    viewPosition: Point,
    viewSize: Size
  ): Parameters = {
    val __obj = js.Dynamic.literal(deviceScaleFactor = deviceScaleFactor.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], screenPosition = screenPosition.asInstanceOf[js.Any], screenSize = screenSize.asInstanceOf[js.Any], viewPosition = viewPosition.asInstanceOf[js.Any], viewSize = viewSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters] (val x: Self) extends AnyVal {
    
    inline def setDeviceScaleFactor(value: Double): Self = StObject.set(x, "deviceScaleFactor", value.asInstanceOf[js.Any])
    
    inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScreenPosition(value: desktop | mobile): Self = StObject.set(x, "screenPosition", value.asInstanceOf[js.Any])
    
    inline def setScreenSize(value: Size): Self = StObject.set(x, "screenSize", value.asInstanceOf[js.Any])
    
    inline def setViewPosition(value: Point): Self = StObject.set(x, "viewPosition", value.asInstanceOf[js.Any])
    
    inline def setViewSize(value: Size): Self = StObject.set(x, "viewSize", value.asInstanceOf[js.Any])
  }
}
