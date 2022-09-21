package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorVisible extends StObject {
  
  /**
    * Specifies the color a node&apos;s border changes to when the node is hovered over or pressed.
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether a node&apos;s border is visible when the node is hovered over or pressed.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the width a node&apos;s border changes to when the node is hovered over or pressed.
    */
  var width: js.UndefOr[Double] = js.undefined
}
object ColorVisible {
  
  inline def apply(): ColorVisible = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorVisible]
  }
  
  extension [Self <: ColorVisible](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
