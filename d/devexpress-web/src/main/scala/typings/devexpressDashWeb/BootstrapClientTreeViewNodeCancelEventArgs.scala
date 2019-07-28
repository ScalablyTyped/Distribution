package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ExpandedChanging event.
  */
trait BootstrapClientTreeViewNodeCancelEventArgs extends ASPxClientProcessingModeCancelEventArgs {
  /**
    * Gets a node object related to the event.
    * Value: A BootstrapClientTreeViewNode object, manipulations on which forced the event to be raised.
    */
  var node: BootstrapClientTreeViewNode
}

object BootstrapClientTreeViewNodeCancelEventArgs {
  @scala.inline
  def apply(cancel: Boolean, node: BootstrapClientTreeViewNode, processOnServer: Boolean): BootstrapClientTreeViewNodeCancelEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel, node = node, processOnServer = processOnServer)
  
    __obj.asInstanceOf[BootstrapClientTreeViewNodeCancelEventArgs]
  }
}

