package typings.ethereumjsDashTx.distTypesMod

import typings.ethereumjsDashCommon.ethereumjsDashCommonMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransactionOptions extends js.Object {
  /**
    * The chain of the transaction, default: 'mainnet'
    */
  var chain: js.UndefOr[Double | String] = js.undefined
  /**
    * A Common object defining the chain and the hardfork a transaction belongs to.
    */
  var common: js.UndefOr[default] = js.undefined
  /**
    * The hardfork of the transaction, default: 'petersburg'
    */
  var hardfork: js.UndefOr[String] = js.undefined
}

object TransactionOptions {
  @scala.inline
  def apply(chain: Double | String = null, common: default = null, hardfork: String = null): TransactionOptions = {
    val __obj = js.Dynamic.literal()
    if (chain != null) __obj.updateDynamic("chain")(chain.asInstanceOf[js.Any])
    if (common != null) __obj.updateDynamic("common")(common)
    if (hardfork != null) __obj.updateDynamic("hardfork")(hardfork)
    __obj.asInstanceOf[TransactionOptions]
  }
}

