package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TabControlTabClickEventArgs
  extends StObject
     with TabControlTabCancelEventArgs {
  
  val htmlElement: js.Object
  
  val htmlEvent: js.Object
}
object TabControlTabClickEventArgs {
  
  @scala.inline
  def apply(
    cancel: Boolean,
    htmlElement: js.Object,
    htmlEvent: js.Object,
    processOnServer: Boolean,
    reloadContentOnCallback: Boolean,
    sender: Control,
    tab: BootstrapTab
  ): TabControlTabClickEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], htmlElement = htmlElement.asInstanceOf[js.Any], htmlEvent = htmlEvent.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any], reloadContentOnCallback = reloadContentOnCallback.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], tab = tab.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabControlTabClickEventArgs]
  }
  
  @scala.inline
  implicit class TabControlTabClickEventArgsMutableBuilder[Self <: TabControlTabClickEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHtmlElement(value: js.Object): Self = StObject.set(x, "htmlElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlEvent(value: js.Object): Self = StObject.set(x, "htmlEvent", value.asInstanceOf[js.Any])
  }
}
