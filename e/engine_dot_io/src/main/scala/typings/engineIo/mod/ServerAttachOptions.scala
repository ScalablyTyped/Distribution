package typings.engineIo.mod

import typings.engineIo.engineIoStrings.uws
import typings.engineIo.engineIoStrings.ws
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
    destroyUpgradeTimeout: js.UndefOr[Double] = js.undefined,
    handlePreflightRequest: Boolean | (js.Function3[/* server */ Server, /* req */ IncomingMessage, /* res */ ServerResponse, Unit]) = null,
    httpCompression: js.Any = null,
    initialPacket: Message = null,
    maxHttpBufferSize: js.UndefOr[Double] = js.undefined,
    path: String = null,
    perMessageDeflate: js.Any = null,
    pingInterval: js.UndefOr[Double] = js.undefined,
    pingTimeout: js.UndefOr[Double] = js.undefined,
    transports: js.Array[Transport] = null,
    upgradeTimeout: js.UndefOr[Double] = js.undefined,
    wsEngine: ws | uws = null
  ): ServerAttachOptions = {
    val __obj = js.Dynamic.literal()
    if (allowRequest != null) __obj.updateDynamic("allowRequest")(js.Any.fromFunction2(allowRequest))
    if (!js.isUndefined(allowUpgrades)) __obj.updateDynamic("allowUpgrades")(allowUpgrades.get.asInstanceOf[js.Any])
    if (cookie != null) __obj.updateDynamic("cookie")(cookie.asInstanceOf[js.Any])
    if (!js.isUndefined(cookieHttpOnly)) __obj.updateDynamic("cookieHttpOnly")(cookieHttpOnly.get.asInstanceOf[js.Any])
    if (cookiePath != null) __obj.updateDynamic("cookiePath")(cookiePath.asInstanceOf[js.Any])
    if (!js.isUndefined(destroyUpgrade)) __obj.updateDynamic("destroyUpgrade")(destroyUpgrade.get.asInstanceOf[js.Any])
    if (!js.isUndefined(destroyUpgradeTimeout)) __obj.updateDynamic("destroyUpgradeTimeout")(destroyUpgradeTimeout.get.asInstanceOf[js.Any])
    if (handlePreflightRequest != null) __obj.updateDynamic("handlePreflightRequest")(handlePreflightRequest.asInstanceOf[js.Any])
    if (httpCompression != null) __obj.updateDynamic("httpCompression")(httpCompression.asInstanceOf[js.Any])
    if (initialPacket != null) __obj.updateDynamic("initialPacket")(initialPacket.asInstanceOf[js.Any])
    if (!js.isUndefined(maxHttpBufferSize)) __obj.updateDynamic("maxHttpBufferSize")(maxHttpBufferSize.get.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (perMessageDeflate != null) __obj.updateDynamic("perMessageDeflate")(perMessageDeflate.asInstanceOf[js.Any])
    if (!js.isUndefined(pingInterval)) __obj.updateDynamic("pingInterval")(pingInterval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pingTimeout)) __obj.updateDynamic("pingTimeout")(pingTimeout.get.asInstanceOf[js.Any])
    if (transports != null) __obj.updateDynamic("transports")(transports.asInstanceOf[js.Any])
    if (!js.isUndefined(upgradeTimeout)) __obj.updateDynamic("upgradeTimeout")(upgradeTimeout.get.asInstanceOf[js.Any])
    if (wsEngine != null) __obj.updateDynamic("wsEngine")(wsEngine.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerAttachOptions]
  }
}

