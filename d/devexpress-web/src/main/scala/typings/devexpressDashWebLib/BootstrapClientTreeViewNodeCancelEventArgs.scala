package typings
package devexpressDashWebLib

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
  def apply(cancel: scala.Boolean, node: BootstrapClientTreeViewNode, processOnServer: scala.Boolean): BootstrapClientTreeViewNodeCancelEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancel")(cancel)
    __obj.updateDynamic("node")(node)
    __obj.updateDynamic("processOnServer")(processOnServer)
    __obj.asInstanceOf[BootstrapClientTreeViewNodeCancelEventArgs]
  }
}

