package typings.ethers.typesEthersMod

import typings.ethers.typesProvidersProviderMod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers/types/ethers", "BaseWallet")
@js.native
open class BaseWallet protected ()
  extends typings.ethers.typesWalletMod.BaseWallet {
  /**
    *  Creates a new BaseWallet for %%privateKey%%, optionally
    *  connected to %%provider%%.
    *
    *  If %%provider%% is not specified, only offline methods can
    *  be used.
    */
  def this(privateKey: typings.ethers.typesCryptoMod.SigningKey) = this()
  def this(privateKey: typings.ethers.typesCryptoMod.SigningKey, provider: Provider) = this()
}
