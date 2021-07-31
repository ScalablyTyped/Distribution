package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ActionCollapsing event.
  */
trait ASPxClientFloatingActionButtonActionCollapsingEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Specifies whether the user action or APIs has collapsed the action group.
    */
  var collapseReason: ASPxClientFloatingActionButtonCollapseReason
  
  /**
    * Specifies the FAB action's context name.
    */
  var contextName: String
}
object ASPxClientFloatingActionButtonActionCollapsingEventArgs {
  
  @scala.inline
  def apply(collapseReason: ASPxClientFloatingActionButtonCollapseReason, contextName: String): ASPxClientFloatingActionButtonActionCollapsingEventArgs = {
    val __obj = js.Dynamic.literal(collapseReason = collapseReason.asInstanceOf[js.Any], contextName = contextName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientFloatingActionButtonActionCollapsingEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientFloatingActionButtonActionCollapsingEventArgsMutableBuilder[Self <: ASPxClientFloatingActionButtonActionCollapsingEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollapseReason(value: ASPxClientFloatingActionButtonCollapseReason): Self = StObject.set(x, "collapseReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextName(value: String): Self = StObject.set(x, "contextName", value.asInstanceOf[js.Any])
  }
}
