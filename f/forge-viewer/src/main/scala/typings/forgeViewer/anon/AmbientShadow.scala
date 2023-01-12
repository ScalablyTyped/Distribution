package typings.forgeViewer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AmbientShadow extends StObject {
  
  var ambientShadow: Boolean
  
  var antiAliasing: Boolean
  
  var displayLines: Boolean
  
  var displayPoints: Boolean
  
  var ghostHidden: Boolean
  
  var progressiveDisplay: Boolean
  
  var swapBlackAndWhite: Boolean
}
object AmbientShadow {
  
  inline def apply(
    ambientShadow: Boolean,
    antiAliasing: Boolean,
    displayLines: Boolean,
    displayPoints: Boolean,
    ghostHidden: Boolean,
    progressiveDisplay: Boolean,
    swapBlackAndWhite: Boolean
  ): AmbientShadow = {
    val __obj = js.Dynamic.literal(ambientShadow = ambientShadow.asInstanceOf[js.Any], antiAliasing = antiAliasing.asInstanceOf[js.Any], displayLines = displayLines.asInstanceOf[js.Any], displayPoints = displayPoints.asInstanceOf[js.Any], ghostHidden = ghostHidden.asInstanceOf[js.Any], progressiveDisplay = progressiveDisplay.asInstanceOf[js.Any], swapBlackAndWhite = swapBlackAndWhite.asInstanceOf[js.Any])
    __obj.asInstanceOf[AmbientShadow]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AmbientShadow] (val x: Self) extends AnyVal {
    
    inline def setAmbientShadow(value: Boolean): Self = StObject.set(x, "ambientShadow", value.asInstanceOf[js.Any])
    
    inline def setAntiAliasing(value: Boolean): Self = StObject.set(x, "antiAliasing", value.asInstanceOf[js.Any])
    
    inline def setDisplayLines(value: Boolean): Self = StObject.set(x, "displayLines", value.asInstanceOf[js.Any])
    
    inline def setDisplayPoints(value: Boolean): Self = StObject.set(x, "displayPoints", value.asInstanceOf[js.Any])
    
    inline def setGhostHidden(value: Boolean): Self = StObject.set(x, "ghostHidden", value.asInstanceOf[js.Any])
    
    inline def setProgressiveDisplay(value: Boolean): Self = StObject.set(x, "progressiveDisplay", value.asInstanceOf[js.Any])
    
    inline def setSwapBlackAndWhite(value: Boolean): Self = StObject.set(x, "swapBlackAndWhite", value.asInstanceOf[js.Any])
  }
}
