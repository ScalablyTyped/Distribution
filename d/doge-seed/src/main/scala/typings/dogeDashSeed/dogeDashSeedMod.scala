package typings.dogeDashSeed

import typings.dogeDashSeed.dogeDashSeedNumbers.`128`
import typings.dogeDashSeed.dogeDashSeedNumbers.`160`
import typings.dogeDashSeed.dogeDashSeedNumbers.`192`
import typings.dogeDashSeed.dogeDashSeedNumbers.`224`
import typings.dogeDashSeed.dogeDashSeedNumbers.`256`
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
  def apply(): String = js.native
  def apply(bits: `128`): String = js.native
  def apply(bits: `160`): String = js.native
  def apply(bits: `192`): String = js.native
  def apply(bits: `224`): String = js.native
  def apply(bits: `256`): String = js.native
}

