package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientTreeView.ExpandedChanging event.
  */
@JSGlobal("ASPxClientTreeViewNodeCancelEventArgs")
@js.native
class ASPxClientTreeViewNodeCancelEventArgs protected () extends ASPxClientProcessingModeCancelEventArgs {
  /**
    * Initializes a new object of the ASPxClientTreeViewNodeCancelEventArgs type with the specified settings.
    * @param processOnServer true to process the event on the server side; false to completely handle it on the client side.
    * @param node An ASPxClientTreeViewNode object that represents a node related to the event.
    */
  def this(processOnServer: Boolean, node: ASPxClientTreeViewNode) = this()
  /**
    * Gets a node object related to the event.
    */
  var node: ASPxClientTreeViewNode = js.native
}

