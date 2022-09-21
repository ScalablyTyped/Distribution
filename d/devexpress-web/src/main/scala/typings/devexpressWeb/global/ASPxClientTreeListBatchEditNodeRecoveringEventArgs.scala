package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientTreeList.BatchEditNodeRecovering event.
  */
@JSGlobal("ASPxClientTreeListBatchEditNodeRecoveringEventArgs")
@js.native
open class ASPxClientTreeListBatchEditNodeRecoveringEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientTreeListBatchEditNodeRecoveringEventArgs {
  /**
    * Initializes a new instance of the ASPxClientTreeListBatchEditNodeRecoveringEventArgs class.
    * @param nodeKey A string object that is the node key.
    * @param nodeValues An object representing the node values.
    */
  def this(nodeKey: String, nodeValues: Any) = this()
  
  /**
    * Specifies whether to cancel the related action (for example, row edit, export).
    */
  /* CompleteClass */
  var cancel: Boolean = js.native
  
  /**
    * Gets the processed node's key value.
    */
  /* CompleteClass */
  var nodeKey: String = js.native
  
  /**
    * Gets a hashtable that maintains information about recovered cells.
    */
  /* CompleteClass */
  var nodeValues: Any = js.native
}
