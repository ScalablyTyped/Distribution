package typings.dogeSeed

import typings.dogeSeed.dogeSeedInts.`128`
import typings.dogeSeed.dogeSeedInts.`160`
import typings.dogeSeed.dogeSeedInts.`192`
import typings.dogeSeed.dogeSeedInts.`224`
import typings.dogeSeed.dogeSeedInts.`256`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
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
  inline def apply(): String = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[String]
  inline def apply(bits: `128` | `160` | `192` | `224` | `256`): String = ^.asInstanceOf[js.Dynamic].apply(bits.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("doge-seed", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
