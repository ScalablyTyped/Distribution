package typings.ethers

import typings.ethers.typesMod.MinimalProvider
import typings.ethers.typesMod.ParamType
import typings.ethers.typesMod.Signer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethers/dist/types/contracts", JSImport.Namespace)
@js.native
object contractsMod extends js.Object {
  @js.native
  class Contract protected ()
    extends typings.ethers.contractMod.Contract {
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
  
  @js.native
  class Interface protected ()
    extends typings.ethers.interfaceMod.Interface {
    def this(abi: String) = this()
    def this(abi: js.Array[String | ParamType]) = this()
  }
  
}

