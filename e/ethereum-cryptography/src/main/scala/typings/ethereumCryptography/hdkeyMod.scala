package typings.ethereumCryptography

import org.scalablytyped.runtime.Instantiable0
import typings.ethereumCryptography.anon.Xpriv
import typings.ethereumCryptography.pureHdkeyMod.HDKeyT
import typings.ethereumCryptography.pureHdkeyMod.Versions
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethereum-cryptography/hdkey", JSImport.Namespace)
@js.native
object hdkeyMod extends js.Object {
  @js.native
  class HDKey () extends HDKeyT
  
  @js.native
  object HDKey extends Instantiable0[HDKeyT] {
    var HARDENED_OFFSET: Double = js.native
    def fromExtendedKey(base58key: String): HDKeyT = js.native
    def fromExtendedKey(base58key: String, versions: Versions): HDKeyT = js.native
    def fromJSON(json: Xpriv): HDKeyT = js.native
    def fromMasterSeed(seed: Buffer): HDKeyT = js.native
    def fromMasterSeed(seed: Buffer, versions: Versions): HDKeyT = js.native
  }
  
}

