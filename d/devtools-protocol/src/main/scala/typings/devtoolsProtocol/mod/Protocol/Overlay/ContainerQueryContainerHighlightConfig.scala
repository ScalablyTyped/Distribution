package typings.devtoolsProtocol.mod.Protocol.Overlay

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainerQueryContainerHighlightConfig extends StObject {
  
  /**
    * The style of the container border.
    */
  var containerBorder: js.UndefOr[LineStyle] = js.undefined
  
  /**
    * The style of the descendants' borders.
    */
  var descendantBorder: js.UndefOr[LineStyle] = js.undefined
}
object ContainerQueryContainerHighlightConfig {
  
  inline def apply(): ContainerQueryContainerHighlightConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerQueryContainerHighlightConfig]
  }
  
  extension [Self <: ContainerQueryContainerHighlightConfig](x: Self) {
    
    inline def setContainerBorder(value: LineStyle): Self = StObject.set(x, "containerBorder", value.asInstanceOf[js.Any])
    
    inline def setContainerBorderUndefined: Self = StObject.set(x, "containerBorder", js.undefined)
    
    inline def setDescendantBorder(value: LineStyle): Self = StObject.set(x, "descendantBorder", value.asInstanceOf[js.Any])
    
    inline def setDescendantBorderUndefined: Self = StObject.set(x, "descendantBorder", js.undefined)
  }
}
