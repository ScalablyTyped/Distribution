package typings.ethereumjsCommon.mod

import typings.ethereumjsCommon.anon.PartialChain
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def this(chain: String, hardfork: js.UndefOr[scala.Nothing], supportedHardforks: js.Array[String]) = this()
  def this(chain: String, hardfork: String, supportedHardforks: js.Array[String]) = this()
  def this(chain: String, hardfork: Null, supportedHardforks: js.Array[String]) = this()
  def this(chain: js.Object, hardfork: js.UndefOr[scala.Nothing], supportedHardforks: js.Array[String]) = this()
  def this(chain: js.Object, hardfork: String, supportedHardforks: js.Array[String]) = this()
  def this(chain: js.Object, hardfork: Null, supportedHardforks: js.Array[String]) = this()
  def this(chain: Double, hardfork: js.UndefOr[scala.Nothing], supportedHardforks: js.Array[String]) = this()
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
  def forCustomChain(baseChain: String, customChainParams: PartialChain): Common = js.native
  def forCustomChain(
    baseChain: String,
    customChainParams: PartialChain,
    hardfork: js.UndefOr[scala.Nothing],
    supportedHardforks: js.Array[String]
  ): Common = js.native
  def forCustomChain(baseChain: String, customChainParams: PartialChain, hardfork: String): Common = js.native
  def forCustomChain(
    baseChain: String,
    customChainParams: PartialChain,
    hardfork: String,
    supportedHardforks: js.Array[String]
  ): Common = js.native
  def forCustomChain(
    baseChain: String,
    customChainParams: PartialChain,
    hardfork: Null,
    supportedHardforks: js.Array[String]
  ): Common = js.native
  def forCustomChain(baseChain: Double, customChainParams: PartialChain): Common = js.native
  def forCustomChain(
    baseChain: Double,
    customChainParams: PartialChain,
    hardfork: js.UndefOr[scala.Nothing],
    supportedHardforks: js.Array[String]
  ): Common = js.native
  def forCustomChain(baseChain: Double, customChainParams: PartialChain, hardfork: String): Common = js.native
  def forCustomChain(
    baseChain: Double,
    customChainParams: PartialChain,
    hardfork: String,
    supportedHardforks: js.Array[String]
  ): Common = js.native
  def forCustomChain(
    baseChain: Double,
    customChainParams: PartialChain,
    hardfork: Null,
    supportedHardforks: js.Array[String]
  ): Common = js.native
}
