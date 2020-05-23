package typings.engineIo.mod

import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachOptions extends js.Object {
  /**
    * destroy unhandled upgrade requests (true)
    */
  var destroyUpgrade: js.UndefOr[Boolean] = js.undefined
  /**
    * milliseconds after which unhandled requests are ended (1000)
    */
  var destroyUpgradeTimeout: js.UndefOr[Double] = js.undefined
  /**
    * whether to let engine.io handle the OPTIONS requests. You can also pass a custom function to handle the requests (true)
    */
  var handlePreflightRequest: js.UndefOr[
    Boolean | (js.Function3[/* server */ Server, /* req */ IncomingMessage, /* res */ ServerResponse, Unit])
  ] = js.undefined
  /**
    * name of the path to capture (/engine.io).
    */
  var path: js.UndefOr[String] = js.undefined
}

object AttachOptions {
  @scala.inline
  def apply(
    destroyUpgrade: js.UndefOr[Boolean] = js.undefined,
    destroyUpgradeTimeout: js.UndefOr[Double] = js.undefined,
    handlePreflightRequest: Boolean | (js.Function3[/* server */ Server, /* req */ IncomingMessage, /* res */ ServerResponse, Unit]) = null,
    path: String = null
  ): AttachOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(destroyUpgrade)) __obj.updateDynamic("destroyUpgrade")(destroyUpgrade.get.asInstanceOf[js.Any])
    if (!js.isUndefined(destroyUpgradeTimeout)) __obj.updateDynamic("destroyUpgradeTimeout")(destroyUpgradeTimeout.get.asInstanceOf[js.Any])
    if (handlePreflightRequest != null) __obj.updateDynamic("handlePreflightRequest")(handlePreflightRequest.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachOptions]
  }
}

