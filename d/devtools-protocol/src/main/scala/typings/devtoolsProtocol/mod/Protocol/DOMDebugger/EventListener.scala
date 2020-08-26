package typings.devtoolsProtocol.mod.Protocol.DOMDebugger

import typings.devtoolsProtocol.mod.Protocol.DOM.BackendNodeId
import typings.devtoolsProtocol.mod.Protocol.Runtime.RemoteObject
import typings.devtoolsProtocol.mod.Protocol.Runtime.ScriptId
import typings.devtoolsProtocol.mod.Protocol.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventListener extends js.Object {
  /**
    * Node the listener is added to (if any).
    */
  var backendNodeId: js.UndefOr[BackendNodeId] = js.native
  /**
    * Column number in the script (0-based).
    */
  var columnNumber: integer = js.native
  /**
    * Event handler function value.
    */
  var handler: js.UndefOr[RemoteObject] = js.native
  /**
    * Line number in the script (0-based).
    */
  var lineNumber: integer = js.native
  /**
    * `EventListener`'s once flag.
    */
  var once: Boolean = js.native
  /**
    * Event original handler function value.
    */
  var originalHandler: js.UndefOr[RemoteObject] = js.native
  /**
    * `EventListener`'s passive flag.
    */
  var passive: Boolean = js.native
  /**
    * Script id of the handler code.
    */
  var scriptId: ScriptId = js.native
  /**
    * `EventListener`'s type.
    */
  var `type`: String = js.native
  /**
    * `EventListener`'s useCapture.
    */
  var useCapture: Boolean = js.native
}

object EventListener {
  @scala.inline
  def apply(
    columnNumber: integer,
    lineNumber: integer,
    once: Boolean,
    passive: Boolean,
    scriptId: ScriptId,
    `type`: String,
    useCapture: Boolean
  ): EventListener = {
    val __obj = js.Dynamic.literal(columnNumber = columnNumber.asInstanceOf[js.Any], lineNumber = lineNumber.asInstanceOf[js.Any], once = once.asInstanceOf[js.Any], passive = passive.asInstanceOf[js.Any], scriptId = scriptId.asInstanceOf[js.Any], useCapture = useCapture.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventListener]
  }
  @scala.inline
  implicit class EventListenerOps[Self <: EventListener] (val x: Self) extends AnyVal {
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
    def setColumnNumber(value: integer): Self = this.set("columnNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def setLineNumber(value: integer): Self = this.set("lineNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnce(value: Boolean): Self = this.set("once", value.asInstanceOf[js.Any])
    @scala.inline
    def setPassive(value: Boolean): Self = this.set("passive", value.asInstanceOf[js.Any])
    @scala.inline
    def setScriptId(value: ScriptId): Self = this.set("scriptId", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setUseCapture(value: Boolean): Self = this.set("useCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def setBackendNodeId(value: BackendNodeId): Self = this.set("backendNodeId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackendNodeId: Self = this.set("backendNodeId", js.undefined)
    @scala.inline
    def setHandler(value: RemoteObject): Self = this.set("handler", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandler: Self = this.set("handler", js.undefined)
    @scala.inline
    def setOriginalHandler(value: RemoteObject): Self = this.set("originalHandler", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginalHandler: Self = this.set("originalHandler", js.undefined)
  }
  
}

