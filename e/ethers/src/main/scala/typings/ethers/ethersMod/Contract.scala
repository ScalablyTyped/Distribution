package typings.ethers.ethersMod

import typings.ethers.typesMod.MinimalProvider
import typings.ethers.typesMod.ParamType
import typings.ethers.typesMod.Signer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethers/dist/types/ethers", "Contract")
@js.native
class Contract protected ()
  extends typings.ethers.contractsMod.Contract {
  def this(addressOrName: String, contractInterface: String, signerOrProvider: MinimalProvider) = this()
  def this(addressOrName: String, contractInterface: String, signerOrProvider: Signer) = this()
  def this(
    addressOrName: String,
    contractInterface: js.Array[String | ParamType],
    signerOrProvider: MinimalProvider
  ) = this()
  def this(addressOrName: String, contractInterface: js.Array[String | ParamType], signerOrProvider: Signer) = this()
  def this(
    addressOrName: String,
    contractInterface: typings.ethers.interfaceMod.Interface,
    signerOrProvider: MinimalProvider
  ) = this()
  def this(
    addressOrName: String,
    contractInterface: typings.ethers.interfaceMod.Interface,
    signerOrProvider: Signer
  ) = this()
}

