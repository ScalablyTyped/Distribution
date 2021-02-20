package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListEditCustomHighlightingEventArgs extends EventArgs {
  
  val filter: String = js.native
  
  var highlighting: js.Any = js.native
}
object ListEditCustomHighlightingEventArgs {
  
  @scala.inline
  def apply(filter: String, highlighting: js.Any, sender: Control): ListEditCustomHighlightingEventArgs = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], highlighting = highlighting.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListEditCustomHighlightingEventArgs]
  }
  
  @scala.inline
  implicit class ListEditCustomHighlightingEventArgsMutableBuilder[Self <: ListEditCustomHighlightingEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlighting(value: js.Any): Self = StObject.set(x, "highlighting", value.asInstanceOf[js.Any])
  }
}
