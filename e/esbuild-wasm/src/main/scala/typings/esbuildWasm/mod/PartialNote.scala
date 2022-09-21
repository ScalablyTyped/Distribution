package typings.esbuildWasm.mod

import typings.esbuildWasm.anon.PartialLocation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PartialNote extends StObject {
  
  var location: js.UndefOr[PartialLocation | Null] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
}
object PartialNote {
  
  inline def apply(): PartialNote = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialNote]
  }
  
  extension [Self <: PartialNote](x: Self) {
    
    inline def setLocation(value: PartialLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationNull: Self = StObject.set(x, "location", null)
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
