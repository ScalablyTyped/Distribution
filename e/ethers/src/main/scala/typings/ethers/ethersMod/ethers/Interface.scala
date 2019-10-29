package typings.ethers.ethersMod.ethers

import typings.ethers.distTypesUtilsTypesMod.ParamType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethers", "ethers.Interface")
@js.native
class Interface protected ()
  extends typings.ethers.distTypesEthersMod.Interface {
  def this(abi: String) = this()
  def this(abi: js.Array[String | ParamType]) = this()
}

