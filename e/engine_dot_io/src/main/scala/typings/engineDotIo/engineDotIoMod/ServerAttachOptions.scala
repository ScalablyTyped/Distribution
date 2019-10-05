package typings.engineDotIo.engineDotIoMod

import typings.engineDotIo.engineDotIoStrings.uws
import typings.engineDotIo.engineDotIoStrings.ws
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerAttachOptions
  extends ServerOptions
     with AttachOptions

object ServerAttachOptions {
  @scala.inline
  def apply(
    allowRequest: (/* req */ IncomingMessage, /* fn */ js.Function2[/* err */ js.UndefOr[String | Null], /* success */ Boolean, Unit]) => Unit = null,
    allowUpgrades: js.UndefOr[Boolean] = js.undefined,
    cookie: String | Boolean = null,
    cookieHttpOnly: js.UndefOr[Boolean] = js.undefined,
    cookiePath: String | Boolean = null,
    destroyUpgrade: js.UndefOr[Boolean] = js.undefined,
    destroyUpgradeTimeout: Int | Double = null,
    handlePreflightRequest: Boolean | (js.Function3[/* server */ Server, /* req */ IncomingMessage, /* res */ ServerResponse, Unit]) = null,
    httpCompression: js.Any = null,
    initialPacket: Message = null,
    maxHttpBufferSize: Int | Double = null,
    path: String = null,
    perMessageDeflate: js.Any = null,
    pingInterval: Int | Double = null,
    pingTimeout: Int | Double = null,
    transports: js.Array[Transport] = null,
    upgradeTimeout: Int | Double = null,
    wsEngine: ws | uws = null
  ): ServerAttachOptions = {
    val __obj = js.Dynamic.literal()
    if (allowRequest != null) __obj.updateDynamic("allowRequest")(js.Any.fromFunction2(allowRequest))
    if (!js.isUndefined(allowUpgrades)) __obj.updateDynamic("allowUpgrades")(allowUpgrades)
    if (cookie != null) __obj.updateDynamic("cookie")(cookie.asInstanceOf[js.Any])
    if (!js.isUndefined(cookieHttpOnly)) __obj.updateDynamic("cookieHttpOnly")(cookieHttpOnly)
    if (cookiePath != null) __obj.updateDynamic("cookiePath")(cookiePath.asInstanceOf[js.Any])
    if (!js.isUndefined(destroyUpgrade)) __obj.updateDynamic("destroyUpgrade")(destroyUpgrade)
    if (destroyUpgradeTimeout != null) __obj.updateDynamic("destroyUpgradeTimeout")(destroyUpgradeTimeout.asInstanceOf[js.Any])
    if (handlePreflightRequest != null) __obj.updateDynamic("handlePreflightRequest")(handlePreflightRequest.asInstanceOf[js.Any])
    if (httpCompression != null) __obj.updateDynamic("httpCompression")(httpCompression)
    if (initialPacket != null) __obj.updateDynamic("initialPacket")(initialPacket.asInstanceOf[js.Any])
    if (maxHttpBufferSize != null) __obj.updateDynamic("maxHttpBufferSize")(maxHttpBufferSize.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path)
    if (perMessageDeflate != null) __obj.updateDynamic("perMessageDeflate")(perMessageDeflate)
    if (pingInterval != null) __obj.updateDynamic("pingInterval")(pingInterval.asInstanceOf[js.Any])
    if (pingTimeout != null) __obj.updateDynamic("pingTimeout")(pingTimeout.asInstanceOf[js.Any])
    if (transports != null) __obj.updateDynamic("transports")(transports)
    if (upgradeTimeout != null) __obj.updateDynamic("upgradeTimeout")(upgradeTimeout.asInstanceOf[js.Any])
    if (wsEngine != null) __obj.updateDynamic("wsEngine")(wsEngine.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerAttachOptions]
  }
}

