package typings.ethers.mod.ethers.providers

import typings.ethersprojectNetworks.typesMod.Networkish
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers", "ethers.providers.IpcProvider")
@js.native
class IpcProvider protected ()
  extends typings.ethers.ethersMod.providers.IpcProvider {
  def this(path: String) = this()
  def this(path: String, network: Networkish) = this()
}
