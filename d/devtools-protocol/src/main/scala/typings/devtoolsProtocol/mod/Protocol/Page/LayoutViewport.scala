package typings.devtoolsProtocol.mod.Protocol.Page

import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LayoutViewport extends StObject {
  
  /**
    * Height (CSS pixels), excludes scrollbar if present.
    */
  var clientHeight: integer
  
  /**
    * Width (CSS pixels), excludes scrollbar if present.
    */
  var clientWidth: integer
  
  /**
    * Horizontal offset relative to the document (CSS pixels).
    */
  var pageX: integer
  
  /**
    * Vertical offset relative to the document (CSS pixels).
    */
  var pageY: integer
}
object LayoutViewport {
  
  inline def apply(clientHeight: integer, clientWidth: integer, pageX: integer, pageY: integer): LayoutViewport = {
    val __obj = js.Dynamic.literal(clientHeight = clientHeight.asInstanceOf[js.Any], clientWidth = clientWidth.asInstanceOf[js.Any], pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutViewport]
  }
  
  extension [Self <: LayoutViewport](x: Self) {
    
    inline def setClientHeight(value: integer): Self = StObject.set(x, "clientHeight", value.asInstanceOf[js.Any])
    
    inline def setClientWidth(value: integer): Self = StObject.set(x, "clientWidth", value.asInstanceOf[js.Any])
    
    inline def setPageX(value: integer): Self = StObject.set(x, "pageX", value.asInstanceOf[js.Any])
    
    inline def setPageY(value: integer): Self = StObject.set(x, "pageY", value.asInstanceOf[js.Any])
  }
}
