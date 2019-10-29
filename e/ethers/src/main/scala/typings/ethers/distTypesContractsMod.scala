package typings.ethers

import typings.ethers.distTypesUtilsTypesMod.MinimalProvider
import typings.ethers.distTypesUtilsTypesMod.ParamType
import typings.ethers.distTypesUtilsTypesMod.Signer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethers/dist/types/contracts", JSImport.Namespace)
@js.native
object distTypesContractsMod extends js.Object {
  @js.native
  class Contract protected ()
    extends typings.ethers.distTypesContractsContractMod.Contract {
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
  
  @js.native
  class Interface protected ()
    extends typings.ethers.distTypesContractsInterfaceMod.Interface {
    def this(abi: String) = this()
    def this(abi: js.Array[String | ParamType]) = this()
  }
  
}

