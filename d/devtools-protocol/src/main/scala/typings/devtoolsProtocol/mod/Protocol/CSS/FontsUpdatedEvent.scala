package typings.devtoolsProtocol.mod.Protocol.CSS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontsUpdatedEvent extends StObject {
  
  /**
    * The web font that has loaded.
    */
  var font: js.UndefOr[FontFace] = js.undefined
}
object FontsUpdatedEvent {
  
  inline def apply(): FontsUpdatedEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontsUpdatedEvent]
  }
  
  extension [Self <: FontsUpdatedEvent](x: Self) {
    
    inline def setFont(value: FontFace): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
  }
}
