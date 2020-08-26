package typings.devtoolsProtocol.mod.Protocol.CSS

import typings.devtoolsProtocol.mod.Protocol.DOM.NodeId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ForcePseudoStateRequest extends js.Object {
  /**
    * Element pseudo classes to force when computing the element's style.
    */
  var forcedPseudoClasses: js.Array[String] = js.native
  /**
    * The element id for which to force the pseudo state.
    */
  var nodeId: NodeId = js.native
}

object ForcePseudoStateRequest {
  @scala.inline
  def apply(forcedPseudoClasses: js.Array[String], nodeId: NodeId): ForcePseudoStateRequest = {
    val __obj = js.Dynamic.literal(forcedPseudoClasses = forcedPseudoClasses.asInstanceOf[js.Any], nodeId = nodeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForcePseudoStateRequest]
  }
  @scala.inline
  implicit class ForcePseudoStateRequestOps[Self <: ForcePseudoStateRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setForcedPseudoClassesVarargs(value: String*): Self = this.set("forcedPseudoClasses", js.Array(value :_*))
    @scala.inline
    def setForcedPseudoClasses(value: js.Array[String]): Self = this.set("forcedPseudoClasses", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodeId(value: NodeId): Self = this.set("nodeId", value.asInstanceOf[js.Any])
  }
  
}

