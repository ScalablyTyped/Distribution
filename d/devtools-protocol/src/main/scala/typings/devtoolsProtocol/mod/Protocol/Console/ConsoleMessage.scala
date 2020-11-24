package typings.devtoolsProtocol.mod.Protocol.Console

import typings.devtoolsProtocol.devtoolsProtocolStrings.`console-api`
import typings.devtoolsProtocol.devtoolsProtocolStrings.appcache
import typings.devtoolsProtocol.devtoolsProtocolStrings.debug
import typings.devtoolsProtocol.devtoolsProtocolStrings.deprecation
import typings.devtoolsProtocol.devtoolsProtocolStrings.error
import typings.devtoolsProtocol.devtoolsProtocolStrings.info
import typings.devtoolsProtocol.devtoolsProtocolStrings.javascript_
import typings.devtoolsProtocol.devtoolsProtocolStrings.log
import typings.devtoolsProtocol.devtoolsProtocolStrings.network
import typings.devtoolsProtocol.devtoolsProtocolStrings.other_
import typings.devtoolsProtocol.devtoolsProtocolStrings.rendering
import typings.devtoolsProtocol.devtoolsProtocolStrings.security
import typings.devtoolsProtocol.devtoolsProtocolStrings.storage
import typings.devtoolsProtocol.devtoolsProtocolStrings.warning
import typings.devtoolsProtocol.devtoolsProtocolStrings.worker_
import typings.devtoolsProtocol.devtoolsProtocolStrings.xml
import typings.devtoolsProtocol.mod.Protocol.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConsoleMessage extends js.Object {
  
  /**
    * Column number in the resource that generated this message (1-based).
    */
  var column: js.UndefOr[integer] = js.native
  
  /**
    * Message severity. (ConsoleMessageLevel enum)
    */
  var level: log | warning | error | debug | info = js.native
  
  /**
    * Line number in the resource that generated this message (1-based).
    */
  var line: js.UndefOr[integer] = js.native
  
  /**
    * Message source. (ConsoleMessageSource enum)
    */
  var source: xml | javascript_ | network | `console-api` | storage | appcache | rendering | security | other_ | deprecation | worker_ = js.native
  
  /**
    * Message text.
    */
  var text: String = js.native
  
  /**
    * URL of the message origin.
    */
  var url: js.UndefOr[String] = js.native
}
object ConsoleMessage {
  
  @scala.inline
  def apply(
    level: log | warning | error | debug | info,
    source: xml | javascript_ | network | `console-api` | storage | appcache | rendering | security | other_ | deprecation | worker_,
    text: String
  ): ConsoleMessage = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsoleMessage]
  }
  
  @scala.inline
  implicit class ConsoleMessageOps[Self <: ConsoleMessage] (val x: Self) extends AnyVal {
    
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
    def setLevel(value: log | warning | error | debug | info): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(
      value: xml | javascript_ | network | `console-api` | storage | appcache | rendering | security | other_ | deprecation | worker_
    ): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumn(value: integer): Self = this.set("column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumn: Self = this.set("column", js.undefined)
    
    @scala.inline
    def setLine(value: integer): Self = this.set("line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLine: Self = this.set("line", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
