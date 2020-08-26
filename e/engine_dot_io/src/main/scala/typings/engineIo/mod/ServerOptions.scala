package typings.engineIo.mod

import typings.engineIo.engineIoStrings.uws
import typings.engineIo.engineIoStrings.ws
import typings.node.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerOptions extends js.Object {
  /**
    * A function that receives a given handshake or upgrade request as its first parameter,
    * and can decide whether to continue or not. The second argument is a function that needs
    * to be called with the decided information: fn(err, success), where success is a boolean
    * value where false means that the request is rejected, and err is an error code.
    */
  var allowRequest: js.UndefOr[AllowRequestFunction] = js.native
  /**
    * whether to allow transport upgrades (true)
    */
  var allowUpgrades: js.UndefOr[Boolean] = js.native
  /**
    * name of the HTTP cookie that contains the client sid to send as part of handshake response headers. Set to false to not send one. (io)
    */
  var cookie: js.UndefOr[String | Boolean] = js.native
  /**
    * If true HttpOnly io cookie cannot be accessed by client-side APIs,
    * such as JavaScript. (true) This option has no effect
    * if cookie or cookiePath is set to false.
    */
  var cookieHttpOnly: js.UndefOr[Boolean] = js.native
  /**
    * path of the above cookie option. If false, no path will be sent,
    * which means browsers will only send the cookie on the engine.io
    * attached path (/engine.io). Set false to not save io cookie
    * on all requests. (/)
    */
  var cookiePath: js.UndefOr[String | Boolean] = js.native
  /**
    * parameters of the http compression for the polling transports (see zlib api docs). Set to false to disable. (true)
    */
  var httpCompression: js.UndefOr[js.Any] = js.native
  /**
    * an optional packet which will be concatenated to the handshake packet emitted by Engine.IO.
    */
  var initialPacket: js.UndefOr[Message] = js.native
  /**
    * how many bytes or characters a message can be, before closing the session (to avoid DoS). Default value is 10E6.
    */
  var maxHttpBufferSize: js.UndefOr[Double] = js.native
  /**
    * parameters of the WebSocket permessage-deflate extension (see ws module api docs). Set to false to disable. (true)
    */
  var perMessageDeflate: js.UndefOr[js.Any] = js.native
  /**
    * how many ms before sending a new ping packet (25000)
    */
  var pingInterval: js.UndefOr[Double] = js.native
  /**
    * how many ms without a pong packet to consider the connection closed (5000)
    */
  var pingTimeout: js.UndefOr[Double] = js.native
  /**
    * to allow connections to (['polling', 'websocket'])
    */
  var transports: js.UndefOr[js.Array[Transport]] = js.native
  /**
    * how many ms before an uncompleted transport upgrade is cancelled (10000)
    */
  var upgradeTimeout: js.UndefOr[Double] = js.native
  /**
    * what WebSocket server implementation to use. Specified module must
    * conform to the ws interface (see ws module api docs). Default value is ws.
    * An alternative c++ addon is also available by installing uws module.
    */
  var wsEngine: js.UndefOr[ws | uws] = js.native
}

object ServerOptions {
  @scala.inline
  def apply(): ServerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerOptions]
  }
  @scala.inline
  implicit class ServerOptionsOps[Self <: ServerOptions] (val x: Self) extends AnyVal {
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
    def setAllowRequest(
      value: (/* req */ IncomingMessage, /* fn */ js.Function2[/* err */ js.UndefOr[String | Null], /* success */ Boolean, Unit]) => Unit
    ): Self = this.set("allowRequest", js.Any.fromFunction2(value))
    @scala.inline
    def deleteAllowRequest: Self = this.set("allowRequest", js.undefined)
    @scala.inline
    def setAllowUpgrades(value: Boolean): Self = this.set("allowUpgrades", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowUpgrades: Self = this.set("allowUpgrades", js.undefined)
    @scala.inline
    def setCookie(value: String | Boolean): Self = this.set("cookie", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCookie: Self = this.set("cookie", js.undefined)
    @scala.inline
    def setCookieHttpOnly(value: Boolean): Self = this.set("cookieHttpOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCookieHttpOnly: Self = this.set("cookieHttpOnly", js.undefined)
    @scala.inline
    def setCookiePath(value: String | Boolean): Self = this.set("cookiePath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCookiePath: Self = this.set("cookiePath", js.undefined)
    @scala.inline
    def setHttpCompression(value: js.Any): Self = this.set("httpCompression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHttpCompression: Self = this.set("httpCompression", js.undefined)
    @scala.inline
    def setInitialPacket(value: Message): Self = this.set("initialPacket", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialPacket: Self = this.set("initialPacket", js.undefined)
    @scala.inline
    def setMaxHttpBufferSize(value: Double): Self = this.set("maxHttpBufferSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxHttpBufferSize: Self = this.set("maxHttpBufferSize", js.undefined)
    @scala.inline
    def setPerMessageDeflate(value: js.Any): Self = this.set("perMessageDeflate", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePerMessageDeflate: Self = this.set("perMessageDeflate", js.undefined)
    @scala.inline
    def setPingInterval(value: Double): Self = this.set("pingInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePingInterval: Self = this.set("pingInterval", js.undefined)
    @scala.inline
    def setPingTimeout(value: Double): Self = this.set("pingTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePingTimeout: Self = this.set("pingTimeout", js.undefined)
    @scala.inline
    def setTransportsVarargs(value: Transport*): Self = this.set("transports", js.Array(value :_*))
    @scala.inline
    def setTransports(value: js.Array[Transport]): Self = this.set("transports", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransports: Self = this.set("transports", js.undefined)
    @scala.inline
    def setUpgradeTimeout(value: Double): Self = this.set("upgradeTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpgradeTimeout: Self = this.set("upgradeTimeout", js.undefined)
    @scala.inline
    def setWsEngine(value: ws | uws): Self = this.set("wsEngine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWsEngine: Self = this.set("wsEngine", js.undefined)
  }
  
}

