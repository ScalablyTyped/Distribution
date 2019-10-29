package typings.ethers.distTypesEthersMod

import typings.ethers.distTypesUtilsTypesMod.ParamType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethers/dist/types/ethers", "Interface")
@js.native
class Interface protected ()
  extends typings.ethers.distTypesContractsMod.Interface {
  def this(abi: String) = this()
  def this(abi: js.Array[String | ParamType]) = this()
}

