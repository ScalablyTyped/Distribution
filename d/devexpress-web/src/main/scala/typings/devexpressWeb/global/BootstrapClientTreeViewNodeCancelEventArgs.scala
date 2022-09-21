package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientTreeView.ExpandedChanging event.
  */
@JSGlobal("BootstrapClientTreeViewNodeCancelEventArgs")
@js.native
open class BootstrapClientTreeViewNodeCancelEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.BootstrapClientTreeViewNodeCancelEventArgs {
  /**
    * Initializes a new object of the BootstrapClientTreeViewNodeCancelEventArgs type with the specified settings.
    * @param processOnServer true to process the event on the server side; false to completely handle it on the client side.
    * @param node An BootstrapClientTreeViewNode object that represents a node related to the event.
    */
  def this(processOnServer: Boolean, node: typings.devexpressWeb.BootstrapClientTreeViewNode) = this()
  
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    */
  /* CompleteClass */
  var cancel: Boolean = js.native
  
  /**
    * Gets a node object related to the event.
    */
  /* CompleteClass */
  var node: typings.devexpressWeb.BootstrapClientTreeViewNode = js.native
  
  /**
    * Gets or sets a value that specifies whether the event should be finally processed on the server side.
    */
  /* CompleteClass */
  var processOnServer: Boolean = js.native
}
