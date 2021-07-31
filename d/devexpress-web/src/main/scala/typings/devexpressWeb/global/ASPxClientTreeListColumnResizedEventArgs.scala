package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientTreeList.ColumnResized event.
  */
@JSGlobal("ASPxClientTreeListColumnResizedEventArgs")
@js.native
class ASPxClientTreeListColumnResizedEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientTreeListColumnResizedEventArgs {
  /**
    * Initializes a new instance of the ASPxClientTreeListColumnResizedEventArgs class with the specified setting.
    * @param column A ASPxClientTreeListColumn object that is the column related to the event.
    */
  def this(column: typings.devexpressWeb.ASPxClientTreeListColumn) = this()
  
  /**
    * Gets the processed client column.
    */
  /* CompleteClass */
  var column: typings.devexpressWeb.ASPxClientTreeListColumn = js.native
  
  /**
    * Gets or sets a value that specifies whether the event should be finally processed on the server side.
    */
  /* CompleteClass */
  var processOnServer: Boolean = js.native
}
