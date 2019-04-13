package typings
package engineDotIoLib.engineDotIoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerOptions extends js.Object {
  /**
  		 * A function that receives a given handshake or upgrade request as its first parameter,
  		 * and can decide whether to continue or not. The second argument is a function that needs
  		 * to be called with the decided information: fn(err, success), where success is a boolean
  		 * value where false means that the request is rejected, and err is an error code.
  		 */
  var allowRequest: js.UndefOr[AllowRequestFunction] = js.undefined
  /**
  		 * whether to allow transport upgrades (true)
  		 */
  var allowUpgrades: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		 * name of the HTTP cookie that contains the client sid to send as part of handshake response headers. Set to false to not send one. (io)
  		 */
  var cookie: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  /**
  		 * If true HttpOnly io cookie cannot be accessed by client-side APIs,
  		 * such as JavaScript. (true) This option has no effect
  		 * if cookie or cookiePath is set to false.
  		 */
  var cookieHttpOnly: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		 * path of the above cookie option. If false, no path will be sent,
  		 * which means browsers will only send the cookie on the engine.io
  		 * attached path (/engine.io). Set false to not save io cookie
  		 * on all requests. (/)
  		 */
  var cookiePath: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  /**
  		 * parameters of the http compression for the polling transports (see zlib api docs). Set to false to disable. (true)
  		 */
  var httpCompression: js.UndefOr[js.Any] = js.undefined
  /**
  		 * an optional packet which will be concatenated to the handshake packet emitted by Engine.IO.
  		 */
  var initialPacket: js.UndefOr[Message] = js.undefined
  /**
  		 * how many bytes or characters a message can be, before closing the session (to avoid DoS). Default value is 10E7.
  		 */
  var maxHttpBufferSize: js.UndefOr[scala.Double] = js.undefined
  /**
  		 * parameters of the WebSocket permessage-deflate extension (see ws module api docs). Set to false to disable. (true)
  		 */
  var perMessageDeflate: js.UndefOr[js.Any] = js.undefined
  /**
  		 * how many ms before sending a new ping packet (25000)
  		 */
  var pingInterval: js.UndefOr[scala.Double] = js.undefined
  /**
  		 * how many ms without a pong packet to consider the connection closed (60000)
  		 */
  var pingTimeout: js.UndefOr[scala.Double] = js.undefined
  /**
  		 * to allow connections to (['polling', 'websocket'])
  		 */
  var transports: js.UndefOr[js.Array[Transport]] = js.undefined
  /**
  		 * how many ms before an uncompleted transport upgrade is cancelled (10000)
  		 */
  var upgradeTimeout: js.UndefOr[scala.Double] = js.undefined
  /**
  		 * what WebSocket server implementation to use. Specified module must
  		 * conform to the ws interface (see ws module api docs). Default value is ws.
  		 * An alternative c++ addon is also available by installing uws module.
  		 */
  var wsEngine: js.UndefOr[
    engineDotIoLib.engineDotIoLibStrings.ws | engineDotIoLib.engineDotIoLibStrings.uws
  ] = js.undefined
}

object ServerOptions {
  @scala.inline
  def apply(
    allowRequest: AllowRequestFunction = null,
    allowUpgrades: js.UndefOr[scala.Boolean] = js.undefined,
    cookie: java.lang.String | scala.Boolean = null,
    cookieHttpOnly: js.UndefOr[scala.Boolean] = js.undefined,
    cookiePath: java.lang.String | scala.Boolean = null,
    httpCompression: js.Any = null,
    initialPacket: Message = null,
    maxHttpBufferSize: scala.Int | scala.Double = null,
    perMessageDeflate: js.Any = null,
    pingInterval: scala.Int | scala.Double = null,
    pingTimeout: scala.Int | scala.Double = null,
    transports: js.Array[Transport] = null,
    upgradeTimeout: scala.Int | scala.Double = null,
    wsEngine: engineDotIoLib.engineDotIoLibStrings.ws | engineDotIoLib.engineDotIoLibStrings.uws = null
  ): ServerOptions = {
    val __obj = js.Dynamic.literal()
    if (allowRequest != null) __obj.updateDynamic("allowRequest")(allowRequest)
    if (!js.isUndefined(allowUpgrades)) __obj.updateDynamic("allowUpgrades")(allowUpgrades)
    if (cookie != null) __obj.updateDynamic("cookie")(cookie.asInstanceOf[js.Any])
    if (!js.isUndefined(cookieHttpOnly)) __obj.updateDynamic("cookieHttpOnly")(cookieHttpOnly)
    if (cookiePath != null) __obj.updateDynamic("cookiePath")(cookiePath.asInstanceOf[js.Any])
    if (httpCompression != null) __obj.updateDynamic("httpCompression")(httpCompression)
    if (initialPacket != null) __obj.updateDynamic("initialPacket")(initialPacket.asInstanceOf[js.Any])
    if (maxHttpBufferSize != null) __obj.updateDynamic("maxHttpBufferSize")(maxHttpBufferSize.asInstanceOf[js.Any])
    if (perMessageDeflate != null) __obj.updateDynamic("perMessageDeflate")(perMessageDeflate)
    if (pingInterval != null) __obj.updateDynamic("pingInterval")(pingInterval.asInstanceOf[js.Any])
    if (pingTimeout != null) __obj.updateDynamic("pingTimeout")(pingTimeout.asInstanceOf[js.Any])
    if (transports != null) __obj.updateDynamic("transports")(transports)
    if (upgradeTimeout != null) __obj.updateDynamic("upgradeTimeout")(upgradeTimeout.asInstanceOf[js.Any])
    if (wsEngine != null) __obj.updateDynamic("wsEngine")(wsEngine.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerOptions]
  }
}

