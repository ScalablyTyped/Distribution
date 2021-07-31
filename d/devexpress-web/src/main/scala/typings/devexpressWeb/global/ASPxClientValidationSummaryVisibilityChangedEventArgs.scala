package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientValidationSummary.VisibilityChanged event.
  */
@JSGlobal("ASPxClientValidationSummaryVisibilityChangedEventArgs")
@js.native
class ASPxClientValidationSummaryVisibilityChangedEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientValidationSummaryVisibilityChangedEventArgs {
  /**
    * Initializes a new instance of the ASPxClientValidationSummaryVisibilityChangedEventArgs class.
    * @param visible true if the editor is visible; otherwise, false.
    */
  def this(visible: Boolean) = this()
  
  /**
    * Gets or sets whether the editor is visible on the client.
    */
  /* CompleteClass */
  var visible: Boolean = js.native
}
