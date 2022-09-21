package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientFilterControl.Applied event.
  */
@JSGlobal("ASPxClientFilterAppliedEventArgs")
@js.native
open class ASPxClientFilterAppliedEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientFilterAppliedEventArgs {
  /**
    * Initializes a new instance of the ASPxClientFilterAppliedEventArgs class.
    * @param filterExpression A string value that specifies the filter expression currently being applied. This value is assigned to the ASPxClientFilterAppliedEventArgs.filterExpression property.
    */
  def this(filterExpression: String) = this()
  
  /**
    * Gets the filter expression currently being applied.
    */
  /* CompleteClass */
  var filterExpression: String = js.native
}
