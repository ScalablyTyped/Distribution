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

@js.native
trait IProviderOptions extends js.Object {
  var account_keys_path: js.UndefOr[String] = js.native
  var accounts: js.UndefOr[js.Array[js.Object]] = js.native
  var allowUnlimitedContractSize: js.UndefOr[Boolean] = js.native
  var blockTime: js.UndefOr[Double] = js.native
  var db_path: js.UndefOr[String] = js.native
  var debug: js.UndefOr[Boolean] = js.native
  var default_balance_ether: js.UndefOr[Double] = js.native
  var fork: js.UndefOr[String | js.Object] = js.native
  var fork_block_number: js.UndefOr[String | Double] = js.native
  var gasLimit: js.UndefOr[String | Double] = js.native
  var gasPrice: js.UndefOr[String] = js.native
  var hardfork: js.UndefOr[byzantium | constantinople | petersburg | istanbul | muirGlacier] = js.native
  var hd_path: js.UndefOr[String] = js.native
  var locked: js.UndefOr[Boolean] = js.native
  var logger: js.UndefOr[Log] = js.native
  var mnemonic: js.UndefOr[String] = js.native
  var networkId: js.UndefOr[Double] = js.native
  var network_id: js.UndefOr[Double] = js.native
  var port: js.UndefOr[Double] = js.native
  var seed: js.UndefOr[js.Any] = js.native
  var time: js.UndefOr[Date] = js.native
  var total_accounts: js.UndefOr[Double] = js.native
  var unlocked_accounts: js.UndefOr[js.Array[String]] = js.native
  var verbose: js.UndefOr[Boolean] = js.native
  var vmErrorsOnRPCResponse: js.UndefOr[Boolean] = js.native
  var ws: js.UndefOr[Boolean] = js.native
}

object IProviderOptions {
  @scala.inline
  def apply(): IProviderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IProviderOptions]
  }
  @scala.inline
  implicit class IProviderOptionsOps[Self <: IProviderOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccount_keys_path(value: String): Self = this.set("account_keys_path", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccount_keys_path: Self = this.set("account_keys_path", js.undefined)
    @scala.inline
    def setAccountsVarargs(value: js.Object*): Self = this.set("accounts", js.Array(value :_*))
    @scala.inline
    def setAccounts(value: js.Array[js.Object]): Self = this.set("accounts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccounts: Self = this.set("accounts", js.undefined)
    @scala.inline
    def setAllowUnlimitedContractSize(value: Boolean): Self = this.set("allowUnlimitedContractSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowUnlimitedContractSize: Self = this.set("allowUnlimitedContractSize", js.undefined)
    @scala.inline
    def setBlockTime(value: Double): Self = this.set("blockTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlockTime: Self = this.set("blockTime", js.undefined)
    @scala.inline
    def setDb_path(value: String): Self = this.set("db_path", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDb_path: Self = this.set("db_path", js.undefined)
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    @scala.inline
    def setDefault_balance_ether(value: Double): Self = this.set("default_balance_ether", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefault_balance_ether: Self = this.set("default_balance_ether", js.undefined)
    @scala.inline
    def setFork(value: String | js.Object): Self = this.set("fork", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFork: Self = this.set("fork", js.undefined)
    @scala.inline
    def setFork_block_number(value: String | Double): Self = this.set("fork_block_number", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFork_block_number: Self = this.set("fork_block_number", js.undefined)
    @scala.inline
    def setGasLimit(value: String | Double): Self = this.set("gasLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGasLimit: Self = this.set("gasLimit", js.undefined)
    @scala.inline
    def setGasPrice(value: String): Self = this.set("gasPrice", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGasPrice: Self = this.set("gasPrice", js.undefined)
    @scala.inline
    def setHardfork(value: byzantium | constantinople | petersburg | istanbul | muirGlacier): Self = this.set("hardfork", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHardfork: Self = this.set("hardfork", js.undefined)
    @scala.inline
    def setHd_path(value: String): Self = this.set("hd_path", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHd_path: Self = this.set("hd_path", js.undefined)
    @scala.inline
    def setLocked(value: Boolean): Self = this.set("locked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocked: Self = this.set("locked", js.undefined)
    @scala.inline
    def setLogger(value: Log): Self = this.set("logger", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogger: Self = this.set("logger", js.undefined)
    @scala.inline
    def setMnemonic(value: String): Self = this.set("mnemonic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMnemonic: Self = this.set("mnemonic", js.undefined)
    @scala.inline
    def setNetworkId(value: Double): Self = this.set("networkId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkId: Self = this.set("networkId", js.undefined)
    @scala.inline
    def setNetwork_id(value: Double): Self = this.set("network_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetwork_id: Self = this.set("network_id", js.undefined)
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    @scala.inline
    def setSeed(value: js.Any): Self = this.set("seed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeed: Self = this.set("seed", js.undefined)
    @scala.inline
    def setTime(value: Date): Self = this.set("time", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTime: Self = this.set("time", js.undefined)
    @scala.inline
    def setTotal_accounts(value: Double): Self = this.set("total_accounts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotal_accounts: Self = this.set("total_accounts", js.undefined)
    @scala.inline
    def setUnlocked_accountsVarargs(value: String*): Self = this.set("unlocked_accounts", js.Array(value :_*))
    @scala.inline
    def setUnlocked_accounts(value: js.Array[String]): Self = this.set("unlocked_accounts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnlocked_accounts: Self = this.set("unlocked_accounts", js.undefined)
    @scala.inline
    def setVerbose(value: Boolean): Self = this.set("verbose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerbose: Self = this.set("verbose", js.undefined)
    @scala.inline
    def setVmErrorsOnRPCResponse(value: Boolean): Self = this.set("vmErrorsOnRPCResponse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVmErrorsOnRPCResponse: Self = this.set("vmErrorsOnRPCResponse", js.undefined)
    @scala.inline
    def setWs(value: Boolean): Self = this.set("ws", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWs: Self = this.set("ws", js.undefined)
  }
  
}

