package typings.firefoxWebextBrowser.browser.manifest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a protocol handler definition. */
@js.native
trait ProtocolHandler extends js.Object {
  
  /**
    * A user-readable title string for the protocol handler. This will be displayed to the user in interface objects as needed.
    */
  var name: String = js.native
  
  /**
    * The protocol the site wishes to handle, specified as a string. For example, you can register to handle SMS text message links by registering to handle the "sms" scheme.
    */
  var protocol: String | ProtocolHandlerProtocol = js.native
  
  /**
    * The URL of the handler, as a string. This string should include "%s" as a placeholder which will be replaced with the escaped URL of the document to be handled. This URL might be a true URL, or it could be a phone number, email address, or so forth.
    */
  var uriTemplate: ExtensionURL | HttpURL = js.native
}
object ProtocolHandler {
  
  @scala.inline
  def apply(name: String, protocol: String | ProtocolHandlerProtocol, uriTemplate: ExtensionURL | HttpURL): ProtocolHandler = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], uriTemplate = uriTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProtocolHandler]
  }
  
  @scala.inline
  implicit class ProtocolHandlerOps[Self <: ProtocolHandler] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocol(value: String | ProtocolHandlerProtocol): Self = this.set("protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUriTemplate(value: ExtensionURL | HttpURL): Self = this.set("uriTemplate", value.asInstanceOf[js.Any])
  }
}
