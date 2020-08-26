package typings.devtoolsProtocol.mod.Protocol.Log

import typings.devtoolsProtocol.devtoolsProtocolStrings.appcache
import typings.devtoolsProtocol.devtoolsProtocolStrings.deprecation
import typings.devtoolsProtocol.devtoolsProtocolStrings.error
import typings.devtoolsProtocol.devtoolsProtocolStrings.info
import typings.devtoolsProtocol.devtoolsProtocolStrings.intervention
import typings.devtoolsProtocol.devtoolsProtocolStrings.javascript_
import typings.devtoolsProtocol.devtoolsProtocolStrings.network
import typings.devtoolsProtocol.devtoolsProtocolStrings.other_
import typings.devtoolsProtocol.devtoolsProtocolStrings.recommendation
import typings.devtoolsProtocol.devtoolsProtocolStrings.rendering
import typings.devtoolsProtocol.devtoolsProtocolStrings.security
import typings.devtoolsProtocol.devtoolsProtocolStrings.storage
import typings.devtoolsProtocol.devtoolsProtocolStrings.verbose
import typings.devtoolsProtocol.devtoolsProtocolStrings.violation
import typings.devtoolsProtocol.devtoolsProtocolStrings.warning
import typings.devtoolsProtocol.devtoolsProtocolStrings.worker_
import typings.devtoolsProtocol.devtoolsProtocolStrings.xml
import typings.devtoolsProtocol.mod.Protocol.Network.RequestId
import typings.devtoolsProtocol.mod.Protocol.Runtime.RemoteObject
import typings.devtoolsProtocol.mod.Protocol.Runtime.StackTrace
import typings.devtoolsProtocol.mod.Protocol.Runtime.Timestamp
import typings.devtoolsProtocol.mod.Protocol.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogEntry extends js.Object {
  /**
    * Call arguments.
    */
  var args: js.UndefOr[js.Array[RemoteObject]] = js.native
  /**
    * Log entry severity. (LogEntryLevel enum)
    */
  var level: verbose | info | warning | error = js.native
  /**
    * Line number in the resource.
    */
  var lineNumber: js.UndefOr[integer] = js.native
  /**
    * Identifier of the network request associated with this entry.
    */
  var networkRequestId: js.UndefOr[RequestId] = js.native
  /**
    * Log entry source. (LogEntrySource enum)
    */
  var source: xml | javascript_ | network | storage | appcache | rendering | security | deprecation | worker_ | violation | intervention | recommendation | other_ = js.native
  /**
    * JavaScript stack trace.
    */
  var stackTrace: js.UndefOr[StackTrace] = js.native
  /**
    * Logged text.
    */
  var text: String = js.native
  /**
    * Timestamp when this entry was added.
    */
  var timestamp: Timestamp = js.native
  /**
    * URL of the resource if known.
    */
  var url: js.UndefOr[String] = js.native
  /**
    * Identifier of the worker associated with this entry.
    */
  var workerId: js.UndefOr[String] = js.native
}

object LogEntry {
  @scala.inline
  def apply(
    level: verbose | info | warning | error,
    source: xml | javascript_ | network | storage | appcache | rendering | security | deprecation | worker_ | violation | intervention | recommendation | other_,
    text: String,
    timestamp: Timestamp
  ): LogEntry = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogEntry]
  }
  @scala.inline
  implicit class LogEntryOps[Self <: LogEntry] (val x: Self) extends AnyVal {
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
    def setLevel(value: verbose | info | warning | error): Self = this.set("level", value.asInstanceOf[js.Any])
    @scala.inline
    def setSource(
      value: xml | javascript_ | network | storage | appcache | rendering | security | deprecation | worker_ | violation | intervention | recommendation | other_
    ): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimestamp(value: Timestamp): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def setArgsVarargs(value: RemoteObject*): Self = this.set("args", js.Array(value :_*))
    @scala.inline
    def setArgs(value: js.Array[RemoteObject]): Self = this.set("args", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArgs: Self = this.set("args", js.undefined)
    @scala.inline
    def setLineNumber(value: integer): Self = this.set("lineNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineNumber: Self = this.set("lineNumber", js.undefined)
    @scala.inline
    def setNetworkRequestId(value: RequestId): Self = this.set("networkRequestId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkRequestId: Self = this.set("networkRequestId", js.undefined)
    @scala.inline
    def setStackTrace(value: StackTrace): Self = this.set("stackTrace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStackTrace: Self = this.set("stackTrace", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    @scala.inline
    def setWorkerId(value: String): Self = this.set("workerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkerId: Self = this.set("workerId", js.undefined)
  }
  
}

