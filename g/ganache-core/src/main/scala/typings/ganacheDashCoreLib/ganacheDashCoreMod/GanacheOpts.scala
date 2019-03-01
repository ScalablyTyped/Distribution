package typings
package ganacheDashCoreLib.ganacheDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GanacheOpts extends js.Object {
  var db_path: js.UndefOr[java.lang.String] = js.undefined
  var gasLimit: js.UndefOr[scala.Double] = js.undefined
  var logger: js.UndefOr[ganacheDashCoreLib.Anon_Log] = js.undefined
  var mnemonic: js.UndefOr[java.lang.String] = js.undefined
  var networkId: js.UndefOr[scala.Double] = js.undefined
  var network_id: js.UndefOr[scala.Double] = js.undefined
  var port: js.UndefOr[scala.Double] = js.undefined
  var verbose: js.UndefOr[scala.Boolean] = js.undefined
  var vmErrorsOnRPCResponse: js.UndefOr[scala.Boolean] = js.undefined
}

object GanacheOpts {
  @scala.inline
  def apply(
    db_path: java.lang.String = null,
    gasLimit: scala.Int | scala.Double = null,
    logger: ganacheDashCoreLib.Anon_Log = null,
    mnemonic: java.lang.String = null,
    networkId: scala.Int | scala.Double = null,
    network_id: scala.Int | scala.Double = null,
    port: scala.Int | scala.Double = null,
    verbose: js.UndefOr[scala.Boolean] = js.undefined,
    vmErrorsOnRPCResponse: js.UndefOr[scala.Boolean] = js.undefined
  ): GanacheOpts = {
    val __obj = js.Dynamic.literal()
    if (db_path != null) __obj.updateDynamic("db_path")(db_path)
    if (gasLimit != null) __obj.updateDynamic("gasLimit")(gasLimit.asInstanceOf[js.Any])
    if (logger != null) __obj.updateDynamic("logger")(logger)
    if (mnemonic != null) __obj.updateDynamic("mnemonic")(mnemonic)
    if (networkId != null) __obj.updateDynamic("networkId")(networkId.asInstanceOf[js.Any])
    if (network_id != null) __obj.updateDynamic("network_id")(network_id.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose)
    if (!js.isUndefined(vmErrorsOnRPCResponse)) __obj.updateDynamic("vmErrorsOnRPCResponse")(vmErrorsOnRPCResponse)
    __obj.asInstanceOf[GanacheOpts]
  }
}

