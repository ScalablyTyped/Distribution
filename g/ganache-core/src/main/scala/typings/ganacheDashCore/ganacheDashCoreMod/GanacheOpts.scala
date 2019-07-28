package typings.ganacheDashCore.ganacheDashCoreMod

import typings.ganacheDashCore.Anon_Log
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GanacheOpts extends js.Object {
  var db_path: js.UndefOr[String] = js.undefined
  var gasLimit: js.UndefOr[Double] = js.undefined
  var logger: js.UndefOr[Anon_Log] = js.undefined
  var mnemonic: js.UndefOr[String] = js.undefined
  var networkId: js.UndefOr[Double] = js.undefined
  var network_id: js.UndefOr[Double] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var verbose: js.UndefOr[Boolean] = js.undefined
  var vmErrorsOnRPCResponse: js.UndefOr[Boolean] = js.undefined
}

object GanacheOpts {
  @scala.inline
  def apply(
    db_path: String = null,
    gasLimit: Int | Double = null,
    logger: Anon_Log = null,
    mnemonic: String = null,
    networkId: Int | Double = null,
    network_id: Int | Double = null,
    port: Int | Double = null,
    verbose: js.UndefOr[Boolean] = js.undefined,
    vmErrorsOnRPCResponse: js.UndefOr[Boolean] = js.undefined
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

