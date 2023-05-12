package typings.electron.Electron

import typings.electron.electronStrings.available
import typings.electron.electronStrings.unavailable
import typings.electron.electronStrings.unknown_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Display extends StObject {
  
  // Docs: https://electronjs.org/docs/api/structures/display
  /**
    * Can be `available`, `unavailable`, `unknown`.
    */
  var accelerometerSupport: available | unavailable | unknown_
  
  /**
    * the bounds of the display in DIP points.
    */
  var bounds: Rectangle
  
  /**
    * The number of bits per pixel.
    */
  var colorDepth: Double
  
  /**
    *  represent a color space (three-dimensional object which contains all realizable
    * color combinations) for the purpose of color conversions
    */
  var colorSpace: String
  
  /**
    * The number of bits per color component.
    */
  var depthPerComponent: Double
  
  /**
    * The display refresh rate.
    */
  var displayFrequency: Double
  
  /**
    * Unique identifier associated with the display.
    */
  var id: Double
  
  /**
    * `true` for an internal display and `false` for an external display
    */
  var internal: Boolean
  
  /**
    * User-friendly label, determined by the platform.
    */
  var label: String
  
  /**
    * Whether or not the display is a monochrome display.
    */
  var monochrome: Boolean
  
  /**
    * Can be 0, 90, 180, 270, represents screen rotation in clock-wise degrees.
    */
  var rotation: Double
  
  /**
    * Output device's pixel scale factor.
    */
  var scaleFactor: Double
  
  var size: Size
  
  /**
    * Can be `available`, `unavailable`, `unknown`.
    */
  var touchSupport: available | unavailable | unknown_
  
  /**
    * the work area of the display in DIP points.
    */
  var workArea: Rectangle
  
  var workAreaSize: Size
}
object Display {
  
  inline def apply(
    accelerometerSupport: available | unavailable | unknown_,
    bounds: Rectangle,
    colorDepth: Double,
    colorSpace: String,
    depthPerComponent: Double,
    displayFrequency: Double,
    id: Double,
    internal: Boolean,
    label: String,
    monochrome: Boolean,
    rotation: Double,
    scaleFactor: Double,
    size: Size,
    touchSupport: available | unavailable | unknown_,
    workArea: Rectangle,
    workAreaSize: Size
  ): Display = {
    val __obj = js.Dynamic.literal(accelerometerSupport = accelerometerSupport.asInstanceOf[js.Any], bounds = bounds.asInstanceOf[js.Any], colorDepth = colorDepth.asInstanceOf[js.Any], colorSpace = colorSpace.asInstanceOf[js.Any], depthPerComponent = depthPerComponent.asInstanceOf[js.Any], displayFrequency = displayFrequency.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], internal = internal.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], monochrome = monochrome.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], scaleFactor = scaleFactor.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], touchSupport = touchSupport.asInstanceOf[js.Any], workArea = workArea.asInstanceOf[js.Any], workAreaSize = workAreaSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Display]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Display] (val x: Self) extends AnyVal {
    
    inline def setAccelerometerSupport(value: available | unavailable | unknown_): Self = StObject.set(x, "accelerometerSupport", value.asInstanceOf[js.Any])
    
    inline def setBounds(value: Rectangle): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    inline def setColorDepth(value: Double): Self = StObject.set(x, "colorDepth", value.asInstanceOf[js.Any])
    
    inline def setColorSpace(value: String): Self = StObject.set(x, "colorSpace", value.asInstanceOf[js.Any])
    
    inline def setDepthPerComponent(value: Double): Self = StObject.set(x, "depthPerComponent", value.asInstanceOf[js.Any])
    
    inline def setDisplayFrequency(value: Double): Self = StObject.set(x, "displayFrequency", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInternal(value: Boolean): Self = StObject.set(x, "internal", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setMonochrome(value: Boolean): Self = StObject.set(x, "monochrome", value.asInstanceOf[js.Any])
    
    inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    inline def setScaleFactor(value: Double): Self = StObject.set(x, "scaleFactor", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setTouchSupport(value: available | unavailable | unknown_): Self = StObject.set(x, "touchSupport", value.asInstanceOf[js.Any])
    
    inline def setWorkArea(value: Rectangle): Self = StObject.set(x, "workArea", value.asInstanceOf[js.Any])
    
    inline def setWorkAreaSize(value: Size): Self = StObject.set(x, "workAreaSize", value.asInstanceOf[js.Any])
  }
}
