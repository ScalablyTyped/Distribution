package typings.ganacheCore.mod.Ganache

import typings.ganacheCore.anon.Log
import typings.ganacheCore.ganacheCoreStrings.byzantium
import typings.ganacheCore.ganacheCoreStrings.constantinople
import typings.ganacheCore.ganacheCoreStrings.istanbul
import typings.ganacheCore.ganacheCoreStrings.muirGlacier
import typings.ganacheCore.ganacheCoreStrings.petersburg
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IServerOptions extends IProviderOptions {
  var keepAliveTimeout: js.UndefOr[Double] = js.undefined
}

object IServerOptions {
  @scala.inline
  def apply(
    account_keys_path: String = null,
    accounts: js.Array[js.Object] = null,
    allowUnlimitedContractSize: js.UndefOr[Boolean] = js.undefined,
    blockTime: js.UndefOr[Double] = js.undefined,
    db_path: String = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    default_balance_ether: js.UndefOr[Double] = js.undefined,
    fork: String | js.Object = null,
    fork_block_number: String | Double = null,
    gasLimit: String | Double = null,
    gasPrice: String = null,
    hardfork: byzantium | constantinople | petersburg | istanbul | muirGlacier = null,
    hd_path: String = null,
    keepAliveTimeout: js.UndefOr[Double] = js.undefined,
    locked: js.UndefOr[Boolean] = js.undefined,
    logger: Log = null,
    mnemonic: String = null,
    networkId: js.UndefOr[Double] = js.undefined,
    network_id: js.UndefOr[Double] = js.undefined,
    port: js.UndefOr[Double] = js.undefined,
    seed: js.Any = null,
    time: Date = null,
    total_accounts: js.UndefOr[Double] = js.undefined,
    unlocked_accounts: js.Array[String] = null,
    verbose: js.UndefOr[Boolean] = js.undefined,
    vmErrorsOnRPCResponse: js.UndefOr[Boolean] = js.undefined,
    ws: js.UndefOr[Boolean] = js.undefined
  ): IServerOptions = {
    val __obj = js.Dynamic.literal()
    if (account_keys_path != null) __obj.updateDynamic("account_keys_path")(account_keys_path.asInstanceOf[js.Any])
    if (accounts != null) __obj.updateDynamic("accounts")(accounts.asInstanceOf[js.Any])
    if (!js.isUndefined(allowUnlimitedContractSize)) __obj.updateDynamic("allowUnlimitedContractSize")(allowUnlimitedContractSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(blockTime)) __obj.updateDynamic("blockTime")(blockTime.get.asInstanceOf[js.Any])
    if (db_path != null) __obj.updateDynamic("db_path")(db_path.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.get.asInstanceOf[js.Any])
    if (!js.isUndefined(default_balance_ether)) __obj.updateDynamic("default_balance_ether")(default_balance_ether.get.asInstanceOf[js.Any])
    if (fork != null) __obj.updateDynamic("fork")(fork.asInstanceOf[js.Any])
    if (fork_block_number != null) __obj.updateDynamic("fork_block_number")(fork_block_number.asInstanceOf[js.Any])
    if (gasLimit != null) __obj.updateDynamic("gasLimit")(gasLimit.asInstanceOf[js.Any])
    if (gasPrice != null) __obj.updateDynamic("gasPrice")(gasPrice.asInstanceOf[js.Any])
    if (hardfork != null) __obj.updateDynamic("hardfork")(hardfork.asInstanceOf[js.Any])
    if (hd_path != null) __obj.updateDynamic("hd_path")(hd_path.asInstanceOf[js.Any])
    if (!js.isUndefined(keepAliveTimeout)) __obj.updateDynamic("keepAliveTimeout")(keepAliveTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(locked)) __obj.updateDynamic("locked")(locked.get.asInstanceOf[js.Any])
    if (logger != null) __obj.updateDynamic("logger")(logger.asInstanceOf[js.Any])
    if (mnemonic != null) __obj.updateDynamic("mnemonic")(mnemonic.asInstanceOf[js.Any])
    if (!js.isUndefined(networkId)) __obj.updateDynamic("networkId")(networkId.get.asInstanceOf[js.Any])
    if (!js.isUndefined(network_id)) __obj.updateDynamic("network_id")(network_id.get.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    if (seed != null) __obj.updateDynamic("seed")(seed.asInstanceOf[js.Any])
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    if (!js.isUndefined(total_accounts)) __obj.updateDynamic("total_accounts")(total_accounts.get.asInstanceOf[js.Any])
    if (unlocked_accounts != null) __obj.updateDynamic("unlocked_accounts")(unlocked_accounts.asInstanceOf[js.Any])
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose.get.asInstanceOf[js.Any])
    if (!js.isUndefined(vmErrorsOnRPCResponse)) __obj.updateDynamic("vmErrorsOnRPCResponse")(vmErrorsOnRPCResponse.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ws)) __obj.updateDynamic("ws")(ws.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IServerOptions]
  }
}

