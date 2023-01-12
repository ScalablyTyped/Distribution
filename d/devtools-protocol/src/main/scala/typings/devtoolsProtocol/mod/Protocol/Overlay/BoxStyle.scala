package typings.devtoolsProtocol.mod.Protocol.Overlay

import typings.devtoolsProtocol.mod.Protocol.DOM.RGBA
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BoxStyle extends StObject {
  
  /**
    * The background color for the box (default: transparent)
    */
  var fillColor: js.UndefOr[RGBA] = js.undefined
  
  /**
    * The hatching color for the box (default: transparent)
    */
  var hatchColor: js.UndefOr[RGBA] = js.undefined
}
object BoxStyle {
  
  inline def apply(): BoxStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BoxStyle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BoxStyle] (val x: Self) extends AnyVal {
    
    inline def setFillColor(value: RGBA): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
    
    inline def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
    
    inline def setHatchColor(value: RGBA): Self = StObject.set(x, "hatchColor", value.asInstanceOf[js.Any])
    
    inline def setHatchColorUndefined: Self = StObject.set(x, "hatchColor", js.undefined)
  }
}
