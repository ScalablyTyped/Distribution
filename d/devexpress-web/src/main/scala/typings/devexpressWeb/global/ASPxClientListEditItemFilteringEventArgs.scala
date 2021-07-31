package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientComboBox.ItemFiltering and ASPxClientListBox.ItemFiltering events.
  */
@JSGlobal("ASPxClientListEditItemFilteringEventArgs")
@js.native
/**
  * Initializes a new instance of the ASPxClientListEditItemFilteringEventArgs class.
  */
class ASPxClientListEditItemFilteringEventArgs ()
  extends StObject
     with typings.devexpressWeb.ASPxClientListEditItemFilteringEventArgs {
  
  /**
    * Gets a string that is a filter condition for the editor's items typed by a user.
    */
  /* CompleteClass */
  var filter: String = js.native
  
  /**
    * Specifies whether the item should be shown in the search result.
    */
  /* CompleteClass */
  var isFit: Boolean = js.native
  
  /**
    * Gets the editor item object related to the event.
    */
  /* CompleteClass */
  var item: typings.devexpressWeb.ASPxClientListEditItem = js.native
}
