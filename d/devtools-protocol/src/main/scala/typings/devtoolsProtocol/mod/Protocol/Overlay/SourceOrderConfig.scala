package typings.devtoolsProtocol.mod.Protocol.Overlay

import typings.devtoolsProtocol.mod.Protocol.DOM.RGBA
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceOrderConfig extends StObject {
  
  /**
    * the color to outline the child elements in.
    */
  var childOutlineColor: RGBA
  
  /**
    * the color to outline the givent element in.
    */
  var parentOutlineColor: RGBA
}
object SourceOrderConfig {
  
  inline def apply(childOutlineColor: RGBA, parentOutlineColor: RGBA): SourceOrderConfig = {
    val __obj = js.Dynamic.literal(childOutlineColor = childOutlineColor.asInstanceOf[js.Any], parentOutlineColor = parentOutlineColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceOrderConfig]
  }
  
  extension [Self <: SourceOrderConfig](x: Self) {
    
    inline def setChildOutlineColor(value: RGBA): Self = StObject.set(x, "childOutlineColor", value.asInstanceOf[js.Any])
    
    inline def setParentOutlineColor(value: RGBA): Self = StObject.set(x, "parentOutlineColor", value.asInstanceOf[js.Any])
  }
}
