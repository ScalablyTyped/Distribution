package typings.devtoolsProtocol.mod.Protocol.CSS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StyleSheetRemovedEvent extends StObject {
  
  /**
    * Identifier of the removed stylesheet.
    */
  var styleSheetId: StyleSheetId
}
object StyleSheetRemovedEvent {
  
  inline def apply(styleSheetId: StyleSheetId): StyleSheetRemovedEvent = {
    val __obj = js.Dynamic.literal(styleSheetId = styleSheetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleSheetRemovedEvent]
  }
  
  extension [Self <: StyleSheetRemovedEvent](x: Self) {
    
    inline def setStyleSheetId(value: StyleSheetId): Self = StObject.set(x, "styleSheetId", value.asInstanceOf[js.Any])
  }
}
