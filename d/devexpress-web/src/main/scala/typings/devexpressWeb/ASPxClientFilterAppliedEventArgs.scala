package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientFilterControl.Applied event.
  */
trait ASPxClientFilterAppliedEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Gets the filter expression currently being applied.
    */
  var filterExpression: String
}
object ASPxClientFilterAppliedEventArgs {
  
  @scala.inline
  def apply(filterExpression: String): ASPxClientFilterAppliedEventArgs = {
    val __obj = js.Dynamic.literal(filterExpression = filterExpression.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientFilterAppliedEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientFilterAppliedEventArgsMutableBuilder[Self <: ASPxClientFilterAppliedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilterExpression(value: String): Self = StObject.set(x, "filterExpression", value.asInstanceOf[js.Any])
  }
}
