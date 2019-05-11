package typings
package googleDashGaxLib.buildSrcOperationsClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationsClientOptions extends js.Object {
  var clientConfig: googleDashGaxLib.buildSrcGaxMod.ClientConfig
  var libName: js.UndefOr[java.lang.String] = js.undefined
  var libVersion: js.UndefOr[java.lang.String] = js.undefined
}

object OperationsClientOptions {
  @scala.inline
  def apply(
    clientConfig: googleDashGaxLib.buildSrcGaxMod.ClientConfig,
    libName: java.lang.String = null,
    libVersion: java.lang.String = null
  ): OperationsClientOptions = {
    val __obj = js.Dynamic.literal(clientConfig = clientConfig)
    if (libName != null) __obj.updateDynamic("libName")(libName)
    if (libVersion != null) __obj.updateDynamic("libVersion")(libVersion)
    __obj.asInstanceOf[OperationsClientOptions]
  }
}

