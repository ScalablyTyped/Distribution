package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client-side equivalent of the CrosshairElementGroup class.
  */
trait ASPxClientCrosshairElementGroup extends StObject {
  
  /**
    * Returns the collection of elements that the Crosshair Cursor displays in the group.
    */
  var CrosshairElements: js.Array[ASPxClientCrosshairElement]
  
  /**
    * Returns the collection of indicator elements that the Crosshair Cursor displays in the group.
    */
  var CrosshairIndicatorElements: js.Array[ASPxClientCrosshairIndicatorElement]
  
  /**
    * Returns the Crosshair Cursor group's Header element.
    */
  var HeaderElement: ASPxClientCrosshairGroupHeaderElement
}
object ASPxClientCrosshairElementGroup {
  
  inline def apply(
    CrosshairElements: js.Array[ASPxClientCrosshairElement],
    CrosshairIndicatorElements: js.Array[ASPxClientCrosshairIndicatorElement],
    HeaderElement: ASPxClientCrosshairGroupHeaderElement
  ): ASPxClientCrosshairElementGroup = {
    val __obj = js.Dynamic.literal(CrosshairElements = CrosshairElements.asInstanceOf[js.Any], CrosshairIndicatorElements = CrosshairIndicatorElements.asInstanceOf[js.Any], HeaderElement = HeaderElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientCrosshairElementGroup]
  }
  
  extension [Self <: ASPxClientCrosshairElementGroup](x: Self) {
    
    inline def setCrosshairElements(value: js.Array[ASPxClientCrosshairElement]): Self = StObject.set(x, "CrosshairElements", value.asInstanceOf[js.Any])
    
    inline def setCrosshairElementsVarargs(value: ASPxClientCrosshairElement*): Self = StObject.set(x, "CrosshairElements", js.Array(value :_*))
    
    inline def setCrosshairIndicatorElements(value: js.Array[ASPxClientCrosshairIndicatorElement]): Self = StObject.set(x, "CrosshairIndicatorElements", value.asInstanceOf[js.Any])
    
    inline def setCrosshairIndicatorElementsVarargs(value: ASPxClientCrosshairIndicatorElement*): Self = StObject.set(x, "CrosshairIndicatorElements", js.Array(value :_*))
    
    inline def setHeaderElement(value: ASPxClientCrosshairGroupHeaderElement): Self = StObject.set(x, "HeaderElement", value.asInstanceOf[js.Any])
  }
}
