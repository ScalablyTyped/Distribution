package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridViewContextMenuItemClickEventArgs
  extends StObject
     with ProcessingModeEventArgs {
  
  val elementIndex: Double
  
  var handled: Boolean
  
  val item: BootstrapMenuItem
  
  val objectType: String
  
  var usePostBack: Boolean
}
object GridViewContextMenuItemClickEventArgs {
  
  inline def apply(
    elementIndex: Double,
    handled: Boolean,
    item: BootstrapMenuItem,
    objectType: String,
    processOnServer: Boolean,
    sender: Control,
    usePostBack: Boolean
  ): GridViewContextMenuItemClickEventArgs = {
    val __obj = js.Dynamic.literal(elementIndex = elementIndex.asInstanceOf[js.Any], handled = handled.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], objectType = objectType.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], usePostBack = usePostBack.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridViewContextMenuItemClickEventArgs]
  }
  
  extension [Self <: GridViewContextMenuItemClickEventArgs](x: Self) {
    
    inline def setElementIndex(value: Double): Self = StObject.set(x, "elementIndex", value.asInstanceOf[js.Any])
    
    inline def setHandled(value: Boolean): Self = StObject.set(x, "handled", value.asInstanceOf[js.Any])
    
    inline def setItem(value: BootstrapMenuItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setObjectType(value: String): Self = StObject.set(x, "objectType", value.asInstanceOf[js.Any])
    
    inline def setUsePostBack(value: Boolean): Self = StObject.set(x, "usePostBack", value.asInstanceOf[js.Any])
  }
}
