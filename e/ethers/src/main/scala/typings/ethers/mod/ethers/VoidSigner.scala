package typings.ethers.mod.ethers

import typings.ethersprojectAbstractProvider.mod.Provider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers", "ethers.VoidSigner")
@js.native
class VoidSigner protected ()
  extends typings.ethers.ethersMod.VoidSigner {
  def this(address: String) = this()
  def this(address: String, provider: Provider) = this()
}
