package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ExpandedChanging event.
  */
trait ASPxClientTreeViewNodeCancelEventArgs extends ASPxClientProcessingModeCancelEventArgs {
  /**
    * Gets a node object related to the event.
    * Value: An ASPxClientTreeViewNode object, manipulations on which forced the event to be raised.
    */
  var node: ASPxClientTreeViewNode
}

object ASPxClientTreeViewNodeCancelEventArgs {
  @scala.inline
  def apply(cancel: Boolean, node: ASPxClientTreeViewNode, processOnServer: Boolean): ASPxClientTreeViewNodeCancelEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel, node = node, processOnServer = processOnServer)
  
    __obj.asInstanceOf[ASPxClientTreeViewNodeCancelEventArgs]
  }
}

