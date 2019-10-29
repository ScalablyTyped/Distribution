package typings.ethers.ethersMod

import typings.ethers.distTypesUtilsTypesMod.MinimalProvider
import typings.ethers.distTypesUtilsTypesMod.ParamType
import typings.ethers.distTypesUtilsTypesMod.Signer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethers", "Contract")
@js.native
class Contract protected ()
  extends typings.ethers.distTypesEthersMod.Contract {
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
    contractInterface: typings.ethers.distTypesContractsInterfaceMod.Interface,
    signerOrProvider: MinimalProvider
  ) = this()
  def this(
    addressOrName: String,
    contractInterface: typings.ethers.distTypesContractsInterfaceMod.Interface,
    signerOrProvider: Signer
  ) = this()
}

