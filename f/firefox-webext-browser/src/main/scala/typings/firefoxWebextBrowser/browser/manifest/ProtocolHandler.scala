package typings.firefoxWebextBrowser.browser.manifest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a protocol handler definition. */
trait ProtocolHandler extends js.Object {
  /**
    * A user-readable title string for the protocol handler. This will be displayed to the user in interface
    * objects as needed.
    */
  var name: String
  /**
    * The protocol the site wishes to handle, specified as a string. For example, you can register to handle SMS
    * text message links by registering to handle the "sms" scheme.
    */
  var protocol: String | ProtocolHandlerProtocol
  /**
    * The URL of the handler, as a string. This string should include "%s" as a placeholder which will be replaced
    * with the escaped URL of the document to be handled. This URL might be a true URL, or it could be a phone
    * number, email address, or so forth.
    */
  var uriTemplate: ExtensionURL | HttpURL
}

object ProtocolHandler {
  @scala.inline
  def apply(name: String, protocol: String | ProtocolHandlerProtocol, uriTemplate: ExtensionURL | HttpURL): ProtocolHandler = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], uriTemplate = uriTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProtocolHandler]
  }
}

