package typings
package engineDotIoLib.engineDotIoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachOptions extends js.Object {
  /**
  		 * destroy unhandled upgrade requests (true)
  		 */
  var destroyUpgrade: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		 * milliseconds after which unhandled requests are ended (1000)
  		 */
  var destroyUpgradeTimeout: js.UndefOr[scala.Double] = js.undefined
  /**
  		 * whether to let engine.io handle the OPTIONS requests. You can also pass a custom function to handle the requests (true)
  		 */
  var handlePreflightRequest: js.UndefOr[
    scala.Boolean | (js.Function3[
      /* server */ Server, 
      /* req */ nodeLib.httpMod.IncomingMessage, 
      /* res */ nodeLib.httpMod.ServerResponse, 
      scala.Unit
    ])
  ] = js.undefined
  /**
  		 * name of the path to capture (/engine.io).
  		 */
  var path: js.UndefOr[java.lang.String] = js.undefined
}

object AttachOptions {
  @scala.inline
  def apply(
    destroyUpgrade: js.UndefOr[scala.Boolean] = js.undefined,
    destroyUpgradeTimeout: scala.Int | scala.Double = null,
    handlePreflightRequest: scala.Boolean | (js.Function3[
      /* server */ Server, 
      /* req */ nodeLib.httpMod.IncomingMessage, 
      /* res */ nodeLib.httpMod.ServerResponse, 
      scala.Unit
    ]) = null,
    path: java.lang.String = null
  ): AttachOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(destroyUpgrade)) __obj.updateDynamic("destroyUpgrade")(destroyUpgrade)
    if (destroyUpgradeTimeout != null) __obj.updateDynamic("destroyUpgradeTimeout")(destroyUpgradeTimeout.asInstanceOf[js.Any])
    if (handlePreflightRequest != null) __obj.updateDynamic("handlePreflightRequest")(handlePreflightRequest.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[AttachOptions]
  }
}

