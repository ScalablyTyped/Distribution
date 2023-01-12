package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client-side equivalent of the CrosshairElement class.
  */
trait ASPxClientCrosshairElement extends StObject {
  
  /**
    * Gets a series that a crosshair element hovers over when implementing a custom draw.
    */
  var Series: ASPxClientSeries
}
object ASPxClientCrosshairElement {
  
  inline def apply(Series: ASPxClientSeries): ASPxClientCrosshairElement = {
    val __obj = js.Dynamic.literal(Series = Series.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientCrosshairElement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxClientCrosshairElement] (val x: Self) extends AnyVal {
    
    inline def setSeries(value: ASPxClientSeries): Self = StObject.set(x, "Series", value.asInstanceOf[js.Any])
  }
}
