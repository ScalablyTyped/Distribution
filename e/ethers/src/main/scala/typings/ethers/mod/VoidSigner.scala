package typings.ethers.mod

import typings.ethersprojectAbstractProvider.mod.Provider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers", "VoidSigner")
@js.native
class VoidSigner protected ()
  extends typings.ethersprojectAbstractSigner.mod.VoidSigner {
  def this(address: String) = this()
  def this(address: String, provider: Provider) = this()
}
