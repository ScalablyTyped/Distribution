package typings.forgeViewer.Autodesk.Viewing.UI

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScrollContainerOptions
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var heightAdjustment: Double
  
  var left: Boolean
  
  var marginTop: Double
}
object ScrollContainerOptions {
  
  inline def apply(heightAdjustment: Double, left: Boolean, marginTop: Double): ScrollContainerOptions = {
    val __obj = js.Dynamic.literal(heightAdjustment = heightAdjustment.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], marginTop = marginTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollContainerOptions]
  }
  
  extension [Self <: ScrollContainerOptions](x: Self) {
    
    inline def setHeightAdjustment(value: Double): Self = StObject.set(x, "heightAdjustment", value.asInstanceOf[js.Any])
    
    inline def setLeft(value: Boolean): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setMarginTop(value: Double): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
  }
}
