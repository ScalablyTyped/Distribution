package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Crosshair Cursor's element that displays information about an indicator.
  */
trait ASPxClientCrosshairIndicatorElement extends StObject {
  
  /**
    * Returns the indicator for whose point the Crosshair Cursor creates the element.
    */
  var Indicator: ASPxClientIndicator
}
object ASPxClientCrosshairIndicatorElement {
  
  inline def apply(Indicator: ASPxClientIndicator): ASPxClientCrosshairIndicatorElement = {
    val __obj = js.Dynamic.literal(Indicator = Indicator.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientCrosshairIndicatorElement]
  }
  
  extension [Self <: ASPxClientCrosshairIndicatorElement](x: Self) {
    
    inline def setIndicator(value: ASPxClientIndicator): Self = StObject.set(x, "Indicator", value.asInstanceOf[js.Any])
  }
}
