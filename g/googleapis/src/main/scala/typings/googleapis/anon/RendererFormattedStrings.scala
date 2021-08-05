package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RendererFormattedStrings extends StObject {
  
  var rendererFormattedStrings: js.UndefOr[AuditGroupExpandTooltip] = js.undefined
}
object RendererFormattedStrings {
  
  inline def apply(): RendererFormattedStrings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RendererFormattedStrings]
  }
  
  extension [Self <: RendererFormattedStrings](x: Self) {
    
    inline def setRendererFormattedStrings(value: AuditGroupExpandTooltip): Self = StObject.set(x, "rendererFormattedStrings", value.asInstanceOf[js.Any])
    
    inline def setRendererFormattedStringsUndefined: Self = StObject.set(x, "rendererFormattedStrings", js.undefined)
  }
}
