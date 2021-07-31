package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientTreeList.BatchEditEndEditing event.
  */
@JSGlobal("ASPxClientTreeListBatchEditEndEditingEventArgs")
@js.native
class ASPxClientTreeListBatchEditEndEditingEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientTreeListBatchEditEndEditingEventArgs {
  /**
    * Initializes a new instance of the ASPxClientTreeListBatchEditEndEditingEventArgs class.
    * @param nodeKey A String value that identifies the processed node.
    * @param nodeValues An object representing a data source’s field values.
    */
  def this(nodeKey: String, nodeValues: js.Any) = this()
  
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    */
  /* CompleteClass */
  var cancel: Boolean = js.native
  
  /**
    * Gets the processed node's key value.
    */
  /* CompleteClass */
  var nodeKey: String = js.native
  
  /**
    * Gets the value of the processed cell.
    */
  /* CompleteClass */
  var nodeValues: js.Any = js.native
}
