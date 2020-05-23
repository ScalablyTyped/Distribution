package typings.esfxInternalHashcode.anon

import typings.esfxInternalHashcode.mod.Counter
import typings.std.Map
import typings.std.WeakMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BigIntSeed extends js.Object {
  var bigIntSeed: Double
  var globalSymbolHashes: js.UndefOr[Map[js.Symbol, Double]] = js.undefined
  var globalSymbolSeed: Double
  var localSymbolCounter: js.UndefOr[Counter] = js.undefined
  var localSymbolHashes: js.UndefOr[Map[js.Symbol, Double]] = js.undefined
  var localSymbolSeed: Double
  var nullPrototypeCounter: js.UndefOr[Counter] = js.undefined
  var objectSeed: Double
  var stringSeed: Double
  var weakObjectHashes: js.UndefOr[WeakMap[js.Object, Double]] = js.undefined
  var weakPrototypeCounters: js.UndefOr[WeakMap[js.Object, Counter]] = js.undefined
}

object BigIntSeed {
  @scala.inline
  def apply(
    bigIntSeed: Double,
    globalSymbolSeed: Double,
    localSymbolSeed: Double,
    objectSeed: Double,
    stringSeed: Double,
    globalSymbolHashes: Map[js.Symbol, Double] = null,
    localSymbolCounter: Counter = null,
    localSymbolHashes: Map[js.Symbol, Double] = null,
    nullPrototypeCounter: Counter = null,
    weakObjectHashes: WeakMap[js.Object, Double] = null,
    weakPrototypeCounters: WeakMap[js.Object, Counter] = null
  ): BigIntSeed = {
    val __obj = js.Dynamic.literal(bigIntSeed = bigIntSeed.asInstanceOf[js.Any], globalSymbolSeed = globalSymbolSeed.asInstanceOf[js.Any], localSymbolSeed = localSymbolSeed.asInstanceOf[js.Any], objectSeed = objectSeed.asInstanceOf[js.Any], stringSeed = stringSeed.asInstanceOf[js.Any])
    if (globalSymbolHashes != null) __obj.updateDynamic("globalSymbolHashes")(globalSymbolHashes.asInstanceOf[js.Any])
    if (localSymbolCounter != null) __obj.updateDynamic("localSymbolCounter")(localSymbolCounter.asInstanceOf[js.Any])
    if (localSymbolHashes != null) __obj.updateDynamic("localSymbolHashes")(localSymbolHashes.asInstanceOf[js.Any])
    if (nullPrototypeCounter != null) __obj.updateDynamic("nullPrototypeCounter")(nullPrototypeCounter.asInstanceOf[js.Any])
    if (weakObjectHashes != null) __obj.updateDynamic("weakObjectHashes")(weakObjectHashes.asInstanceOf[js.Any])
    if (weakPrototypeCounters != null) __obj.updateDynamic("weakPrototypeCounters")(weakPrototypeCounters.asInstanceOf[js.Any])
    __obj.asInstanceOf[BigIntSeed]
  }
}

