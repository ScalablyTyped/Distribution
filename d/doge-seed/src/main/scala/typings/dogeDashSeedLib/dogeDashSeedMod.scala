package typings
package dogeDashSeedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("doge-seed", JSImport.Namespace)
@js.native
object dogeDashSeedMod extends js.Object {
  /**
    * Generates a cryptographically secure mnemonic seed phrase with added dankness.
    * The first four words will be a randomly generated Doge-like sentence.
    *
    * The seed phrases are fully valid checksummed BIP39 seeds. They can be used with any cryptocurrency
    * and can be imported into any BIP39 compliant wallet.
    *
    * @param bits The number of bits to derive a BIP39 mnemonic from. Default: `128`.
    * @returns A BIP39 mnemonic seed phrase.
    */
  def apply(): java.lang.String = js.native
  def apply(
    bits: dogeDashSeedLib.dogeDashSeedLibNumbers.`128` | dogeDashSeedLib.dogeDashSeedLibNumbers.`160` | dogeDashSeedLib.dogeDashSeedLibNumbers.`192` | dogeDashSeedLib.dogeDashSeedLibNumbers.`224` | dogeDashSeedLib.dogeDashSeedLibNumbers.`256`
  ): java.lang.String = js.native
}

