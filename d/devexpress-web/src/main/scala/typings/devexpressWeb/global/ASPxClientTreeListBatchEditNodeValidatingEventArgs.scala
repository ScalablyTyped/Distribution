package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientTreeList.BatchEditNodeValidating event.
  */
@JSGlobal("ASPxClientTreeListBatchEditNodeValidatingEventArgs")
@js.native
open class ASPxClientTreeListBatchEditNodeValidatingEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientTreeListBatchEditNodeValidatingEventArgs {
  /**
    * Initializes a new instance of the ASPxClientTreeListBatchEditNodeValidatingEventArgs class.
    * @param nodeKey A String value that identifies the processed node.
    * @param validationInfo An object containing validation information.
    */
  def this(nodeKey: String, validationInfo: Any) = this()
  
  /**
    * Gets the node's key value.
    */
  /* CompleteClass */
  var nodeKey: String = js.native
  
  /**
    * Provides validation information of a validated node.
    */
  /* CompleteClass */
  var validationInfo: Any = js.native
}
