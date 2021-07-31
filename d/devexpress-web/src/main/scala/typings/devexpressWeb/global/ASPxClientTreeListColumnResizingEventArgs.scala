package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientTreeList.ColumnResizing event.
  */
@JSGlobal("ASPxClientTreeListColumnResizingEventArgs")
@js.native
class ASPxClientTreeListColumnResizingEventArgs ()
  extends StObject
     with typings.devexpressWeb.ASPxClientTreeListColumnResizingEventArgs {
  
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    */
  /* CompleteClass */
  var cancel: Boolean = js.native
  
  /**
    * Gets the processed client column.
    */
  /* CompleteClass */
  var column: typings.devexpressWeb.ASPxClientTreeListColumn = js.native
}
