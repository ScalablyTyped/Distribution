package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientComboBox.CustomHighlighting and ASPxClientListBox.CustomHighlighting events.
  */
@JSGlobal("ASPxClientListEditCustomHighlightingEventArgs")
@js.native
/**
  * Initializes a new instance of the ASPxClientListEditCustomHighlightingEventArgs class.
  */
open class ASPxClientListEditCustomHighlightingEventArgs ()
  extends StObject
     with typings.devexpressWeb.ASPxClientListEditCustomHighlightingEventArgs {
  
  /**
    * Gets a string that is a filter condition for the editor's items typed by a user.
    */
  /* CompleteClass */
  var filter: String = js.native
  
  /**
    * Specifies rules according to which the editor highlights the filtered items.
    */
  /* CompleteClass */
  var highlighting: Any = js.native
}
