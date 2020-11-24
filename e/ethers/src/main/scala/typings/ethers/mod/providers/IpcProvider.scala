package typings.ethers.mod.providers

import typings.ethersprojectNetworks.typesMod.Networkish
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers", "providers.IpcProvider")
@js.native
class IpcProvider protected ()
  extends typings.ethersprojectProviders.mod.IpcProvider {
  def this(path: String) = this()
  def this(path: String, network: Networkish) = this()
}
