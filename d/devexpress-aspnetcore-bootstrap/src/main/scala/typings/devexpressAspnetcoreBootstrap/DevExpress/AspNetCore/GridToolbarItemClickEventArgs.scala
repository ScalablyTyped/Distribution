package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridToolbarItemClickEventArgs
  extends StObject
     with ProcessingModeEventArgs {
  
  val item: BootstrapMenuItem
  
  val toolbarIndex: Double
  
  val toolbarName: String
  
  var usePostBack: Boolean
}
object GridToolbarItemClickEventArgs {
  
  inline def apply(
    item: BootstrapMenuItem,
    processOnServer: Boolean,
    sender: Control,
    toolbarIndex: Double,
    toolbarName: String,
    usePostBack: Boolean
  ): GridToolbarItemClickEventArgs = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], toolbarIndex = toolbarIndex.asInstanceOf[js.Any], toolbarName = toolbarName.asInstanceOf[js.Any], usePostBack = usePostBack.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridToolbarItemClickEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GridToolbarItemClickEventArgs] (val x: Self) extends AnyVal {
    
    inline def setItem(value: BootstrapMenuItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setToolbarIndex(value: Double): Self = StObject.set(x, "toolbarIndex", value.asInstanceOf[js.Any])
    
    inline def setToolbarName(value: String): Self = StObject.set(x, "toolbarName", value.asInstanceOf[js.Any])
    
    inline def setUsePostBack(value: Boolean): Self = StObject.set(x, "usePostBack", value.asInstanceOf[js.Any])
  }
}
