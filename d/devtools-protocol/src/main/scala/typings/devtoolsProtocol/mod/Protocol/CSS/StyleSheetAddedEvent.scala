package typings.devtoolsProtocol.mod.Protocol.CSS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StyleSheetAddedEvent extends StObject {
  
  /**
    * Added stylesheet metainfo.
    */
  var header: CSSStyleSheetHeader
}
object StyleSheetAddedEvent {
  
  inline def apply(header: CSSStyleSheetHeader): StyleSheetAddedEvent = {
    val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleSheetAddedEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StyleSheetAddedEvent] (val x: Self) extends AnyVal {
    
    inline def setHeader(value: CSSStyleSheetHeader): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
  }
}
