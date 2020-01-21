package typings.ethers

import typings.ethers.typesMod.Arrayish
import typings.ethers.typesMod.HDNode
import typings.ethers.typesMod.Signature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethers/dist/types/wallet/signing-key", JSImport.Namespace)
@js.native
object signingKeyMod extends js.Object {
  @js.native
  class SigningKey protected () extends js.Object {
    def this(privateKey: Arrayish) = this()
    def this(privateKey: HDNode) = this()
    val address: String = js.native
    val keyPair: js.Any = js.native
    val mnemonic: String = js.native
    val path: String = js.native
    val privateKey: String = js.native
    val publicKey: String = js.native
    def signDigest(digest: Arrayish): Signature = js.native
  }
  
}

