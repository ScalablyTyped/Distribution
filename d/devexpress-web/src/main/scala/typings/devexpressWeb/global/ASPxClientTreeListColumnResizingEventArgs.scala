package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientTreeList.ColumnResizing event.
  */
@JSGlobal("ASPxClientTreeListColumnResizingEventArgs")
@js.native
open class ASPxClientTreeListColumnResizingEventArgs ()
  extends StObject
     with typings.devexpressWeb.ASPxClientTreeListColumnResizingEventArgs {
  
  /**
    * Specifies whether to cancel the related action (for example, row edit, export).
    */
  /* CompleteClass */
  var cancel: Boolean = js.native
  
  /**
    * Gets the processed client column.
    */
  /* CompleteClass */
  var column: typings.devexpressWeb.ASPxClientTreeListColumn = js.native
}
