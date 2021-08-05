package typings.esfxInternalHashcode

import typings.esfxInternalHashcode.mod.Counter
import typings.std.Map
import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait BigIntSeed extends StObject {
    
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
    
    inline def apply(
      bigIntSeed: Double,
      globalSymbolSeed: Double,
      localSymbolSeed: Double,
      objectSeed: Double,
      stringSeed: Double
    ): BigIntSeed = {
      val __obj = js.Dynamic.literal(bigIntSeed = bigIntSeed.asInstanceOf[js.Any], globalSymbolSeed = globalSymbolSeed.asInstanceOf[js.Any], localSymbolSeed = localSymbolSeed.asInstanceOf[js.Any], objectSeed = objectSeed.asInstanceOf[js.Any], stringSeed = stringSeed.asInstanceOf[js.Any])
      __obj.asInstanceOf[BigIntSeed]
    }
    
    extension [Self <: BigIntSeed](x: Self) {
      
      inline def setBigIntSeed(value: Double): Self = StObject.set(x, "bigIntSeed", value.asInstanceOf[js.Any])
      
      inline def setGlobalSymbolHashes(value: Map[js.Symbol, Double]): Self = StObject.set(x, "globalSymbolHashes", value.asInstanceOf[js.Any])
      
      inline def setGlobalSymbolHashesUndefined: Self = StObject.set(x, "globalSymbolHashes", js.undefined)
      
      inline def setGlobalSymbolSeed(value: Double): Self = StObject.set(x, "globalSymbolSeed", value.asInstanceOf[js.Any])
      
      inline def setLocalSymbolCounter(value: Counter): Self = StObject.set(x, "localSymbolCounter", value.asInstanceOf[js.Any])
      
      inline def setLocalSymbolCounterUndefined: Self = StObject.set(x, "localSymbolCounter", js.undefined)
      
      inline def setLocalSymbolHashes(value: Map[js.Symbol, Double]): Self = StObject.set(x, "localSymbolHashes", value.asInstanceOf[js.Any])
      
      inline def setLocalSymbolHashesUndefined: Self = StObject.set(x, "localSymbolHashes", js.undefined)
      
      inline def setLocalSymbolSeed(value: Double): Self = StObject.set(x, "localSymbolSeed", value.asInstanceOf[js.Any])
      
      inline def setNullPrototypeCounter(value: Counter): Self = StObject.set(x, "nullPrototypeCounter", value.asInstanceOf[js.Any])
      
      inline def setNullPrototypeCounterUndefined: Self = StObject.set(x, "nullPrototypeCounter", js.undefined)
      
      inline def setObjectSeed(value: Double): Self = StObject.set(x, "objectSeed", value.asInstanceOf[js.Any])
      
      inline def setStringSeed(value: Double): Self = StObject.set(x, "stringSeed", value.asInstanceOf[js.Any])
      
      inline def setWeakObjectHashes(value: WeakMap[js.Object, Double]): Self = StObject.set(x, "weakObjectHashes", value.asInstanceOf[js.Any])
      
      inline def setWeakObjectHashesUndefined: Self = StObject.set(x, "weakObjectHashes", js.undefined)
      
      inline def setWeakPrototypeCounters(value: WeakMap[js.Object, Counter]): Self = StObject.set(x, "weakPrototypeCounters", value.asInstanceOf[js.Any])
      
      inline def setWeakPrototypeCountersUndefined: Self = StObject.set(x, "weakPrototypeCounters", js.undefined)
    }
  }
}
