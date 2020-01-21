package typings.ganacheCore.mod.Ganache

import typings.ganacheCore.AnonLog
import typings.ganacheCore.ganacheCoreStrings.byzantium
import typings.ganacheCore.ganacheCoreStrings.constantinople
import typings.ganacheCore.ganacheCoreStrings.istanbul
import typings.ganacheCore.ganacheCoreStrings.petersburg
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProviderOptions extends js.Object {
  var account_keys_path: js.UndefOr[String] = js.undefined
  var accounts: js.UndefOr[js.Array[js.Object]] = js.undefined
  var allowUnlimitedContractSize: js.UndefOr[Boolean] = js.undefined
  var blockTime: js.UndefOr[Double] = js.undefined
  var db_path: js.UndefOr[String] = js.undefined
  var debug: js.UndefOr[Boolean] = js.undefined
  var default_balance_ether: js.UndefOr[Double] = js.undefined
  var fork: js.UndefOr[String | js.Object] = js.undefined
  var fork_block_number: js.UndefOr[String | Double] = js.undefined
  var gasLimit: js.UndefOr[String | Double] = js.undefined
  var gasPrice: js.UndefOr[String] = js.undefined
  var hardfork: js.UndefOr[byzantium | constantinople | petersburg | istanbul] = js.undefined
  var hd_path: js.UndefOr[String] = js.undefined
  var locked: js.UndefOr[Boolean] = js.undefined
  var logger: js.UndefOr[AnonLog] = js.undefined
  var mnemonic: js.UndefOr[String] = js.undefined
  var networkId: js.UndefOr[Double] = js.undefined
  var network_id: js.UndefOr[Double] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var seed: js.UndefOr[js.Any] = js.undefined
  var time: js.UndefOr[Date] = js.undefined
  var total_accounts: js.UndefOr[Double] = js.undefined
  var unlocked_accounts: js.UndefOr[js.Array[String]] = js.undefined
  var verbose: js.UndefOr[Boolean] = js.undefined
  var vmErrorsOnRPCResponse: js.UndefOr[Boolean] = js.undefined
  var ws: js.UndefOr[Boolean] = js.undefined
}

object IProviderOptions {
  @scala.inline
  def apply(
    account_keys_path: String = null,
    accounts: js.Array[js.Object] = null,
    allowUnlimitedContractSize: js.UndefOr[Boolean] = js.undefined,
    blockTime: Int | Double = null,
    db_path: String = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    default_balance_ether: Int | Double = null,
    fork: String | js.Object = null,
    fork_block_number: String | Double = null,
    gasLimit: String | Double = null,
    gasPrice: String = null,
    hardfork: byzantium | constantinople | petersburg | istanbul = null,
    hd_path: String = null,
    locked: js.UndefOr[Boolean] = js.undefined,
    logger: AnonLog = null,
    mnemonic: String = null,
    networkId: Int | Double = null,
    network_id: Int | Double = null,
    port: Int | Double = null,
    seed: js.Any = null,
    time: Date = null,
    total_accounts: Int | Double = null,
    unlocked_accounts: js.Array[String] = null,
    verbose: js.UndefOr[Boolean] = js.undefined,
    vmErrorsOnRPCResponse: js.UndefOr[Boolean] = js.undefined,
    ws: js.UndefOr[Boolean] = js.undefined
  ): IProviderOptions = {
    val __obj = js.Dynamic.literal()
    if (account_keys_path != null) __obj.updateDynamic("account_keys_path")(account_keys_path.asInstanceOf[js.Any])
    if (accounts != null) __obj.updateDynamic("accounts")(accounts.asInstanceOf[js.Any])
    if (!js.isUndefined(allowUnlimitedContractSize)) __obj.updateDynamic("allowUnlimitedContractSize")(allowUnlimitedContractSize.asInstanceOf[js.Any])
    if (blockTime != null) __obj.updateDynamic("blockTime")(blockTime.asInstanceOf[js.Any])
    if (db_path != null) __obj.updateDynamic("db_path")(db_path.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (default_balance_ether != null) __obj.updateDynamic("default_balance_ether")(default_balance_ether.asInstanceOf[js.Any])
    if (fork != null) __obj.updateDynamic("fork")(fork.asInstanceOf[js.Any])
    if (fork_block_number != null) __obj.updateDynamic("fork_block_number")(fork_block_number.asInstanceOf[js.Any])
    if (gasLimit != null) __obj.updateDynamic("gasLimit")(gasLimit.asInstanceOf[js.Any])
    if (gasPrice != null) __obj.updateDynamic("gasPrice")(gasPrice.asInstanceOf[js.Any])
    if (hardfork != null) __obj.updateDynamic("hardfork")(hardfork.asInstanceOf[js.Any])
    if (hd_path != null) __obj.updateDynamic("hd_path")(hd_path.asInstanceOf[js.Any])
    if (!js.isUndefined(locked)) __obj.updateDynamic("locked")(locked.asInstanceOf[js.Any])
    if (logger != null) __obj.updateDynamic("logger")(logger.asInstanceOf[js.Any])
    if (mnemonic != null) __obj.updateDynamic("mnemonic")(mnemonic.asInstanceOf[js.Any])
    if (networkId != null) __obj.updateDynamic("networkId")(networkId.asInstanceOf[js.Any])
    if (network_id != null) __obj.updateDynamic("network_id")(network_id.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (seed != null) __obj.updateDynamic("seed")(seed.asInstanceOf[js.Any])
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    if (total_accounts != null) __obj.updateDynamic("total_accounts")(total_accounts.asInstanceOf[js.Any])
    if (unlocked_accounts != null) __obj.updateDynamic("unlocked_accounts")(unlocked_accounts.asInstanceOf[js.Any])
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose.asInstanceOf[js.Any])
    if (!js.isUndefined(vmErrorsOnRPCResponse)) __obj.updateDynamic("vmErrorsOnRPCResponse")(vmErrorsOnRPCResponse.asInstanceOf[js.Any])
    if (!js.isUndefined(ws)) __obj.updateDynamic("ws")(ws.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProviderOptions]
  }
}

