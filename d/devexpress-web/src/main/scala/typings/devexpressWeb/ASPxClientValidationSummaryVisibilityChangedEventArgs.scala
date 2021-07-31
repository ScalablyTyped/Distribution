package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientValidationSummary.VisibilityChanged event.
  */
trait ASPxClientValidationSummaryVisibilityChangedEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Gets or sets whether the editor is visible on the client.
    */
  var visible: Boolean
}
object ASPxClientValidationSummaryVisibilityChangedEventArgs {
  
  @scala.inline
  def apply(visible: Boolean): ASPxClientValidationSummaryVisibilityChangedEventArgs = {
    val __obj = js.Dynamic.literal(visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientValidationSummaryVisibilityChangedEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientValidationSummaryVisibilityChangedEventArgsMutableBuilder[Self <: ASPxClientValidationSummaryVisibilityChangedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
