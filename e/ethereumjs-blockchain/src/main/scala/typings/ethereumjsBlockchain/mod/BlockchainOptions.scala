package typings.ethereumjsBlockchain.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BlockchainOptions extends js.Object {
  
  /**
    * The chain id or name. Default: `"mainnet"`.
    */
  var chain: js.UndefOr[String | Double] = js.native
  
  /**
    * An alternative way to specify the chain and hardfork is by passing a Common instance.
    */
  var common: js.UndefOr[typings.ethereumjsCommon.mod.default] = js.native
  
  /**
    * Database to store blocks and metadata. Should be a
    * [levelup](https://github.com/rvagg/node-levelup) instance.
    */
  var db: js.UndefOr[js.Any] = js.native
  
  /**
    * Hardfork for the blocks. If `undefined` or `null` is passed, it gets computed based on block
    * numbers.
    */
  var hardfork: js.UndefOr[String | Null] = js.native
  
  /**
    * This the flag indicates if blocks and Proof-of-Work should be validated.
    * This option can't be used in conjunction with `validatePow` nor `validateBlocks`.
    *
    * @deprecated
    */
  var validate: js.UndefOr[Boolean] = js.native
  
  /**
    * This flags indicates if blocks should be validated. See Block#validate for details. If
    * `validate` is provided, this option takes its value. If neither `validate` nor this option are
    * provided, it defaults to `true`.
    */
  var validateBlocks: js.UndefOr[Boolean] = js.native
  
  /**
    * This flags indicates if Proof-of-work should be validated. If `validate` is provided, this
    * option takes its value. If neither `validate` nor this option are provided, it defaults to
    * `true`.
    */
  var validatePow: js.UndefOr[Boolean] = js.native
}
object BlockchainOptions {
  
  @scala.inline
  def apply(): BlockchainOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BlockchainOptions]
  }
  
  @scala.inline
  implicit class BlockchainOptionsOps[Self <: BlockchainOptions] (val x: Self) extends AnyVal {
    
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
    def setChain(value: String | Double): Self = this.set("chain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChain: Self = this.set("chain", js.undefined)
    
    @scala.inline
    def setCommon(value: typings.ethereumjsCommon.mod.default): Self = this.set("common", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommon: Self = this.set("common", js.undefined)
    
    @scala.inline
    def setDb(value: js.Any): Self = this.set("db", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDb: Self = this.set("db", js.undefined)
    
    @scala.inline
    def setHardfork(value: String): Self = this.set("hardfork", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHardfork: Self = this.set("hardfork", js.undefined)
    
    @scala.inline
    def setHardforkNull: Self = this.set("hardfork", null)
    
    @scala.inline
    def setValidate(value: Boolean): Self = this.set("validate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidate: Self = this.set("validate", js.undefined)
    
    @scala.inline
    def setValidateBlocks(value: Boolean): Self = this.set("validateBlocks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidateBlocks: Self = this.set("validateBlocks", js.undefined)
    
    @scala.inline
    def setValidatePow(value: Boolean): Self = this.set("validatePow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidatePow: Self = this.set("validatePow", js.undefined)
  }
}
