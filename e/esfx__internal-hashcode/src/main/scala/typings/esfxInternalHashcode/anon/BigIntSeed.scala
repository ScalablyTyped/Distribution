package typings.esfxInternalHashcode.anon

import typings.esfxInternalHashcode.mod.Counter
import typings.std.Map
import typings.std.WeakMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BigIntSeed extends js.Object {
  
  var bigIntSeed: Double = js.native
  
  var globalSymbolHashes: js.UndefOr[Map[js.Symbol, Double]] = js.native
  
  var globalSymbolSeed: Double = js.native
  
  var localSymbolCounter: js.UndefOr[Counter] = js.native
  
  var localSymbolHashes: js.UndefOr[Map[js.Symbol, Double]] = js.native
  
  var localSymbolSeed: Double = js.native
  
  var nullPrototypeCounter: js.UndefOr[Counter] = js.native
  
  var objectSeed: Double = js.native
  
  var stringSeed: Double = js.native
  
  var weakObjectHashes: js.UndefOr[WeakMap[js.Object, Double]] = js.native
  
  var weakPrototypeCounters: js.UndefOr[WeakMap[js.Object, Counter]] = js.native
}
object BigIntSeed {
  
  @scala.inline
  def apply(
    bigIntSeed: Double,
    globalSymbolSeed: Double,
    localSymbolSeed: Double,
    objectSeed: Double,
    stringSeed: Double
  ): BigIntSeed = {
    val __obj = js.Dynamic.literal(bigIntSeed = bigIntSeed.asInstanceOf[js.Any], globalSymbolSeed = globalSymbolSeed.asInstanceOf[js.Any], localSymbolSeed = localSymbolSeed.asInstanceOf[js.Any], objectSeed = objectSeed.asInstanceOf[js.Any], stringSeed = stringSeed.asInstanceOf[js.Any])
    __obj.asInstanceOf[BigIntSeed]
  }
  
  @scala.inline
  implicit class BigIntSeedOps[Self <: BigIntSeed] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBigIntSeed(value: Double): Self = this.set("bigIntSeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalSymbolSeed(value: Double): Self = this.set("globalSymbolSeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalSymbolSeed(value: Double): Self = this.set("localSymbolSeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectSeed(value: Double): Self = this.set("objectSeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringSeed(value: Double): Self = this.set("stringSeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalSymbolHashes(value: Map[js.Symbol, Double]): Self = this.set("globalSymbolHashes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobalSymbolHashes: Self = this.set("globalSymbolHashes", js.undefined)
    
    @scala.inline
    def setLocalSymbolCounter(value: Counter): Self = this.set("localSymbolCounter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalSymbolCounter: Self = this.set("localSymbolCounter", js.undefined)
    
    @scala.inline
    def setLocalSymbolHashes(value: Map[js.Symbol, Double]): Self = this.set("localSymbolHashes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalSymbolHashes: Self = this.set("localSymbolHashes", js.undefined)
    
    @scala.inline
    def setNullPrototypeCounter(value: Counter): Self = this.set("nullPrototypeCounter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNullPrototypeCounter: Self = this.set("nullPrototypeCounter", js.undefined)
    
    @scala.inline
    def setWeakObjectHashes(value: WeakMap[js.Object, Double]): Self = this.set("weakObjectHashes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeakObjectHashes: Self = this.set("weakObjectHashes", js.undefined)
    
    @scala.inline
    def setWeakPrototypeCounters(value: WeakMap[js.Object, Counter]): Self = this.set("weakPrototypeCounters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeakPrototypeCounters: Self = this.set("weakPrototypeCounters", js.undefined)
  }
}
