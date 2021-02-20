package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ItemClick and ItemDblClick events.
  */
@js.native
trait ASPxClientDiagramItemClickEventArgs extends ASPxClientEventArgs {
  
  /**
    * Gets an object that provides information about an item (shape or connector) related to the event.
    */
  var item: DiagramItem = js.native
}
object ASPxClientDiagramItemClickEventArgs {
  
  @scala.inline
  def apply(item: DiagramItem): ASPxClientDiagramItemClickEventArgs = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDiagramItemClickEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientDiagramItemClickEventArgsMutableBuilder[Self <: ASPxClientDiagramItemClickEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItem(value: DiagramItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
  }
}
