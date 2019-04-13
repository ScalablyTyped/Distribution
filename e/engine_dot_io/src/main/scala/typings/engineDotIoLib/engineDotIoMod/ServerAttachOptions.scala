package typings
package engineDotIoLib.engineDotIoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerAttachOptions
  extends ServerOptions
     with AttachOptions

object ServerAttachOptions {
  @scala.inline
  def apply(
    allowRequest: AllowRequestFunction = null,
    allowUpgrades: js.UndefOr[scala.Boolean] = js.undefined,
    cookie: java.lang.String | scala.Boolean = null,
    cookieHttpOnly: js.UndefOr[scala.Boolean] = js.undefined,
    cookiePath: java.lang.String | scala.Boolean = null,
    destroyUpgrade: js.UndefOr[scala.Boolean] = js.undefined,
    destroyUpgradeTimeout: scala.Int | scala.Double = null,
    handlePreflightRequest: scala.Boolean | (js.Function3[
      /* server */ Server, 
      /* req */ nodeLib.httpMod.IncomingMessage, 
      /* res */ nodeLib.httpMod.ServerResponse, 
      scala.Unit
    ]) = null,
    httpCompression: js.Any = null,
    initialPacket: Message = null,
    maxHttpBufferSize: scala.Int | scala.Double = null,
    path: java.lang.String = null,
    perMessageDeflate: js.Any = null,
    pingInterval: scala.Int | scala.Double = null,
    pingTimeout: scala.Int | scala.Double = null,
    transports: js.Array[Transport] = null,
    upgradeTimeout: scala.Int | scala.Double = null,
    wsEngine: engineDotIoLib.engineDotIoLibStrings.ws | engineDotIoLib.engineDotIoLibStrings.uws = null
  ): ServerAttachOptions = {
    val __obj = js.Dynamic.literal()
    if (allowRequest != null) __obj.updateDynamic("allowRequest")(allowRequest)
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

