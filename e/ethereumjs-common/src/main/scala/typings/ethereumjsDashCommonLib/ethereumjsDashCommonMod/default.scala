package typings
package ethereumjsDashCommonLib.ethereumjsDashCommonMod

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
  def this(chain: java.lang.String) = this()
  def this(chain: js.Object) = this()
  def this(chain: scala.Double) = this()
  def this(chain: java.lang.String, hardfork: java.lang.String) = this()
  def this(chain: js.Object, hardfork: java.lang.String) = this()
  def this(chain: scala.Double, hardfork: java.lang.String) = this()
  def this(chain: java.lang.String, hardfork: java.lang.String, supportedHardforks: js.Array[java.lang.String]) = this()
  def this(chain: java.lang.String, hardfork: scala.Null, supportedHardforks: js.Array[java.lang.String]) = this()
  def this(chain: js.Object, hardfork: java.lang.String, supportedHardforks: js.Array[java.lang.String]) = this()
  def this(chain: js.Object, hardfork: scala.Null, supportedHardforks: js.Array[java.lang.String]) = this()
  def this(chain: scala.Double, hardfork: java.lang.String, supportedHardforks: js.Array[java.lang.String]) = this()
  def this(chain: scala.Double, hardfork: scala.Null, supportedHardforks: js.Array[java.lang.String]) = this()
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
  def forCustomChain(
    baseChain: java.lang.String,
    customChainParams: stdLib.Partial[ethereumjsDashCommonLib.distTypesMod.Chain]
  ): ethereumjsDashCommonLib.ethereumjsDashCommonMod.Common = js.native
  def forCustomChain(
    baseChain: java.lang.String,
    customChainParams: stdLib.Partial[ethereumjsDashCommonLib.distTypesMod.Chain],
    hardfork: java.lang.String
  ): ethereumjsDashCommonLib.ethereumjsDashCommonMod.Common = js.native
  def forCustomChain(
    baseChain: java.lang.String,
    customChainParams: stdLib.Partial[ethereumjsDashCommonLib.distTypesMod.Chain],
    hardfork: java.lang.String,
    supportedHardforks: js.Array[java.lang.String]
  ): ethereumjsDashCommonLib.ethereumjsDashCommonMod.Common = js.native
  def forCustomChain(
    baseChain: java.lang.String,
    customChainParams: stdLib.Partial[ethereumjsDashCommonLib.distTypesMod.Chain],
    hardfork: scala.Null,
    supportedHardforks: js.Array[java.lang.String]
  ): ethereumjsDashCommonLib.ethereumjsDashCommonMod.Common = js.native
  def forCustomChain(
    baseChain: scala.Double,
    customChainParams: stdLib.Partial[ethereumjsDashCommonLib.distTypesMod.Chain]
  ): ethereumjsDashCommonLib.ethereumjsDashCommonMod.Common = js.native
  def forCustomChain(
    baseChain: scala.Double,
    customChainParams: stdLib.Partial[ethereumjsDashCommonLib.distTypesMod.Chain],
    hardfork: java.lang.String
  ): ethereumjsDashCommonLib.ethereumjsDashCommonMod.Common = js.native
  def forCustomChain(
    baseChain: scala.Double,
    customChainParams: stdLib.Partial[ethereumjsDashCommonLib.distTypesMod.Chain],
    hardfork: java.lang.String,
    supportedHardforks: js.Array[java.lang.String]
  ): ethereumjsDashCommonLib.ethereumjsDashCommonMod.Common = js.native
  def forCustomChain(
    baseChain: scala.Double,
    customChainParams: stdLib.Partial[ethereumjsDashCommonLib.distTypesMod.Chain],
    hardfork: scala.Null,
    supportedHardforks: js.Array[java.lang.String]
  ): ethereumjsDashCommonLib.ethereumjsDashCommonMod.Common = js.native
}

