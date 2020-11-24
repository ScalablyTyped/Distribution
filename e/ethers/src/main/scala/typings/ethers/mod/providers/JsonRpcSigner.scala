package typings.ethers.mod.providers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers", "providers.JsonRpcSigner")
@js.native
class JsonRpcSigner protected ()
  extends typings.ethersprojectProviders.mod.JsonRpcSigner {
  def this(
    constructorGuard: js.Any,
    provider: typings.ethersprojectProviders.jsonRpcProviderMod.JsonRpcProvider
  ) = this()
  def this(
    constructorGuard: js.Any,
    provider: typings.ethersprojectProviders.jsonRpcProviderMod.JsonRpcProvider,
    addressOrIndex: String
  ) = this()
  def this(
    constructorGuard: js.Any,
    provider: typings.ethersprojectProviders.jsonRpcProviderMod.JsonRpcProvider,
    addressOrIndex: Double
  ) = this()
}
