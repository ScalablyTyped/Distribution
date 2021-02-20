package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientDashboard.ItemBeginUpdate event.
  */
@js.native
trait ASPxClientItemBeginUpdateEventArgs extends ASPxClientEventArgs {
  
  /**
    * Gets the component name of the dashboard item.
    */
  var ItemName: String = js.native
}
object ASPxClientItemBeginUpdateEventArgs {
  
  @scala.inline
  def apply(ItemName: String): ASPxClientItemBeginUpdateEventArgs = {
    val __obj = js.Dynamic.literal(ItemName = ItemName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientItemBeginUpdateEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientItemBeginUpdateEventArgsMutableBuilder[Self <: ASPxClientItemBeginUpdateEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItemName(value: String): Self = StObject.set(x, "ItemName", value.asInstanceOf[js.Any])
  }
}
