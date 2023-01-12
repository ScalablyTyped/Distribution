package typings.devtoolsProtocol.mod.Protocol.Accessibility

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoadCompleteEvent extends StObject {
  
  /**
    * New document root node.
    */
  var root: AXNode
}
object LoadCompleteEvent {
  
  inline def apply(root: AXNode): LoadCompleteEvent = {
    val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadCompleteEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LoadCompleteEvent] (val x: Self) extends AnyVal {
    
    inline def setRoot(value: AXNode): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
  }
}
