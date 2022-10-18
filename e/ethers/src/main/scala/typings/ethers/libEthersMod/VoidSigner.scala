package typings.ethers.libEthersMod

import typings.ethersprojectAbstractProvider.mod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers/lib/ethers", "VoidSigner")
@js.native
open class VoidSigner protected ()
  extends typings.ethersprojectAbstractSigner.mod.VoidSigner {
  def this(address: String) = this()
  def this(address: String, provider: Provider) = this()
}
