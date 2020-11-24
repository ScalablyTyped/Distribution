package typings.ethereumjsTx.typesMod

import typings.ethereumjsCommon.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransactionOptions extends js.Object {
  
  /**
    * The chain of the transaction, default: 'mainnet'
    */
  var chain: js.UndefOr[Double | String] = js.native
  
  /**
    * A Common object defining the chain and the hardfork a transaction belongs to.
    */
  var common: js.UndefOr[default] = js.native
  
  /**
    * The hardfork of the transaction, default: 'petersburg'
    */
  var hardfork: js.UndefOr[String] = js.native
}
object TransactionOptions {
  
  @scala.inline
  def apply(): TransactionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransactionOptions]
  }
  
  @scala.inline
  implicit class TransactionOptionsOps[Self <: TransactionOptions] (val x: Self) extends AnyVal {
    
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
    def setChain(value: Double | String): Self = this.set("chain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChain: Self = this.set("chain", js.undefined)
    
    @scala.inline
    def setCommon(value: default): Self = this.set("common", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommon: Self = this.set("common", js.undefined)
    
    @scala.inline
    def setHardfork(value: String): Self = this.set("hardfork", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHardfork: Self = this.set("hardfork", js.undefined)
  }
}
