package typings.ethereumjsCommon.mod

import typings.ethereumjsCommon.typesMod.Chain
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethereumjs-common", JSImport.Default)
@js.native
class default protected () extends Common {
  /**
    * @constructor
    * @param chain String ('mainnet') or Number (1) chain
    * @param hardfork String identifier ('byzantium') for hardfork (optional)
    * @param supportedHardforks Limit parameter returns to the given hardforks (optional)
    */
  def this(chain: String) = this()
  def this(chain: js.Object) = this()
  def this(chain: Double) = this()
  def this(chain: String, hardfork: String) = this()
  def this(chain: js.Object, hardfork: String) = this()
  def this(chain: Double, hardfork: String) = this()
  def this(chain: String, hardfork: String, supportedHardforks: js.Array[String]) = this()
  def this(chain: String, hardfork: Null, supportedHardforks: js.Array[String]) = this()
  def this(chain: js.Object, hardfork: String, supportedHardforks: js.Array[String]) = this()
  def this(chain: js.Object, hardfork: Null, supportedHardforks: js.Array[String]) = this()
  def this(chain: Double, hardfork: String, supportedHardforks: js.Array[String]) = this()
  def this(chain: Double, hardfork: Null, supportedHardforks: js.Array[String]) = this()
}

/* static members */
@JSImport("ethereumjs-common", JSImport.Default)
@js.native
object default extends js.Object {
  var _getChainParams: js.Any = js.native
  /**
    * Creates a Common object for a custom chain, based on a standard one. It uses all the [[Chain]]
    * params from [[baseChain]] except the ones overridden in [[customChainParams]].
    *
    * @param baseChain The name (`mainnet`) or id (`1`) of a standard chain used to base the custom
    * chain params on.
    * @param customChainParams The custom parameters of the chain.
    * @param hardfork String identifier ('byzantium') for hardfork (optional)
    * @param supportedHardforks Limit parameter returns to the given hardforks (optional)
    */
  def forCustomChain(baseChain: String, customChainParams: Partial[Chain]): Common = js.native
  def forCustomChain(baseChain: String, customChainParams: Partial[Chain], hardfork: String): Common = js.native
  def forCustomChain(
    baseChain: String,
    customChainParams: Partial[Chain],
    hardfork: String,
    supportedHardforks: js.Array[String]
  ): Common = js.native
  def forCustomChain(
    baseChain: String,
    customChainParams: Partial[Chain],
    hardfork: Null,
    supportedHardforks: js.Array[String]
  ): Common = js.native
  def forCustomChain(baseChain: Double, customChainParams: Partial[Chain]): Common = js.native
  def forCustomChain(baseChain: Double, customChainParams: Partial[Chain], hardfork: String): Common = js.native
  def forCustomChain(
    baseChain: Double,
    customChainParams: Partial[Chain],
    hardfork: String,
    supportedHardforks: js.Array[String]
  ): Common = js.native
  def forCustomChain(
    baseChain: Double,
    customChainParams: Partial[Chain],
    hardfork: Null,
    supportedHardforks: js.Array[String]
  ): Common = js.native
}

