package typings.devtoolsProtocol.mod.Protocol.Overlay

import typings.devtoolsProtocol.devtoolsProtocolStrings.dashed
import typings.devtoolsProtocol.devtoolsProtocolStrings.dotted
import typings.devtoolsProtocol.mod.Protocol.DOM.RGBA
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineStyle extends StObject {
  
  /**
    * The color of the line (default: transparent)
    */
  var color: js.UndefOr[RGBA] = js.undefined
  
  /**
    * The line pattern (default: solid) (LineStylePattern enum)
    */
  var pattern: js.UndefOr[dashed | dotted] = js.undefined
}
object LineStyle {
  
  inline def apply(): LineStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineStyle]
  }
  
  extension [Self <: LineStyle](x: Self) {
    
    inline def setColor(value: RGBA): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setPattern(value: dashed | dotted): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
  }
}
