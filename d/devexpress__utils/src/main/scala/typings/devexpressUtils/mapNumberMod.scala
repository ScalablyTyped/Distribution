package typings.devexpressUtils

import typings.devexpressUtils.minMaxMod.ExtendedMax
import typings.devexpressUtils.minMaxMod.ExtendedMin
import typings.devexpressUtils.minMaxMod.ExtendedMinMax
import typings.devexpressUtils.minMaxMod.MinMax
import typings.devexpressUtils.typesMod.CmpFunc
import typings.devexpressUtils.typesMod.ICloneable
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mapNumberMod {
  
  @JSImport("@devexpress/utils/lib/utils/map/number", "NumberMapUtils")
  @js.native
  class NumberMapUtils () extends StObject
  /* static members */
  object NumberMapUtils {
    
    @JSImport("@devexpress/utils/lib/utils/map/number", "NumberMapUtils.accumulate")
    @js.native
    def accumulate[T, TAcc](
      map: Record[Double, T],
      initAccValue: TAcc,
      callback: js.Function3[/* acc */ TAcc, /* currVal */ T, /* key */ Double, TAcc]
    ): TAcc = js.native
    
    @JSImport("@devexpress/utils/lib/utils/map/number", "NumberMapUtils.allOf")
    @js.native
    def allOf[T](map: Record[Double, T], callback: js.Function2[/* currVal */ T, /* key */ Double, Boolean]): Boolean = js.native
    
    @JSImport("@devexpress/utils/lib/utils/map/number", "NumberMapUtils.anyOf")
    @js.native
    def anyOf[T, TRes](map: Record[Double, T], callback: js.Function2[/* currVal */ T, /* key */ Double, TRes | Null]): TRes | Null = js.native
    
    @JSImport("@devexpress/utils/lib/utils/map/number", "NumberMapUtils.clear")
    @js.native
    def clear[T](map: Record[Double, T]): Unit = js.native
    
    @JSImport("@devexpress/utils/lib/utils/map/number", "NumberMapUtils.containsBy")
    @js.native
    def containsBy[T](map: Record[Double, T], callback: js.Function2[/* element */ T, /* key */ Double, Boolean]): Boolean = js.native
    
    @JSImport("@devexpress/utils/lib/utils/map/number", "NumberMapUtils.deepCopy")
    @js.native
    def deepCopy[T /* <: ICloneable[T] */](map: Record[Double, T]): Record[Double, T] = js.native
    
    @JSImport("@devexpress/utils/lib/utils/map/number", "NumberMapUtils.elementBy")
    @js.native
    def elementBy[T](map: Record[Double, T], callback: js.Function2[/* element */ T, /* key */ Double, Boolean]): T | Null = js.native
    
    @JSImport("@devexpress/utils/lib/utils/map/number", "NumberMapUtils.forEach")
    @js.native
    def forEach[TValue](map: Record[Double, TValue], callback: js.Function2[/* element */ TValue, /* key */ Double, Unit]): Unit = js.native
    
    @JSImport("@devexpress/utils/lib/utils/map/number", "NumberMapUtils.isEmpty")
    @js.native
    def isEmpty[T](map: Record[Double, T]): Boolean = js.native
    
    @JSImport("@devexpress/utils/lib/utils/map/number", "NumberMapUtils.keyBy")
    @js.native
    def keyBy[T](map: Record[Double, T], callback: js.Function2[/* element */ T, /* key */ Double, Boolean]): Double | Null = js.native
    
    @JSImport("@devexpress/utils/lib/utils/map/number", "NumberMapUtils.map")
    @js.native
    def map[TValue, TRes](map: Record[Double, TValue], callback: js.Function2[/* element */ TValue, /* key */ Double, TRes]): Record[Double, TRes] = js.native
    
    @JSImport("@devexpress/utils/lib/utils/map/number", "NumberMapUtils.mapLength")
    @js.native
    def mapLength[T](map: Record[Double, T]): Double = js.native
    
    @JSImport("@devexpress/utils/lib/utils/map/number", "NumberMapUtils.max")
    @js.native
    def max[T](map: Record[Double, T], getValue: js.Function2[/* val */ T, /* key */ Double, Double]): T | Null = js.native
    
    @JSImport("@devexpress/utils/lib/utils/map/number", "NumberMapUtils.maxByCmp")
    @js.native
    def maxByCmp[T](map: Record[Double, T], cmp: CmpFunc[T]): T | Null = js.native
    
    @JSImport("@devexpress/utils/lib/utils/map/number", "NumberMapUtils.maxExtended")
    @js.native
    def maxExtended[T](map: Record[Double, T], getValue: js.Function2[/* val */ T, /* key */ Double, Double]): ExtendedMax[T] | Null = js.native
    
    @JSImport("@devexpress/utils/lib/utils/map/number", "NumberMapUtils.min")
    @js.native
    def min[T](map: Record[Double, T], getValue: js.Function2[/* val */ T, /* key */ Double, Double]): T | Null = js.native
    
    @JSImport("@devexpress/utils/lib/utils/map/number", "NumberMapUtils.minByCmp")
    @js.native
    def minByCmp[T](map: Record[Double, T], cmp: CmpFunc[T]): T | Null = js.native
    
    @JSImport("@devexpress/utils/lib/utils/map/number", "NumberMapUtils.minExtended")
    @js.native
    def minExtended[T](map: Record[Double, T], getValue: js.Function2[/* val */ T, /* key */ Double, Double]): ExtendedMin[T] | Null = js.native
    
    @JSImport("@devexpress/utils/lib/utils/map/number", "NumberMapUtils.minMax")
    @js.native
    def minMax[T](map: Record[Double, T], getValue: js.Function2[/* val */ T, /* key */ Double, Double]): MinMax[T] | Null = js.native
    
    @JSImport("@devexpress/utils/lib/utils/map/number", "NumberMapUtils.minMaxExtended")
    @js.native
    def minMaxExtended[T](map: Record[Double, T], getValue: js.Function2[/* val */ T, /* key */ Double, Double]): ExtendedMinMax[T] | Null = js.native
    
    @JSImport("@devexpress/utils/lib/utils/map/number", "NumberMapUtils.reducedMap")
    @js.native
    def reducedMap[T, TRes](map: Record[Double, T], callback: js.Function2[/* currVal */ T, /* key */ Double, TRes | Null]): Record[Double, TRes] = js.native
    
    @JSImport("@devexpress/utils/lib/utils/map/number", "NumberMapUtils.shallowCopy")
    @js.native
    def shallowCopy[T](map: Record[Double, T]): Record[Double, T] = js.native
    
    @JSImport("@devexpress/utils/lib/utils/map/number", "NumberMapUtils.toList")
    @js.native
    def toList[T](map: Record[Double, T]): js.Array[T] = js.native
    
    @JSImport("@devexpress/utils/lib/utils/map/number", "NumberMapUtils.toListBy")
    @js.native
    def toListBy[T, TRes](map: Record[Double, T], callback: js.Function2[/* elem */ T, /* key */ Double, TRes]): js.Array[TRes] = js.native
    @JSImport("@devexpress/utils/lib/utils/map/number", "NumberMapUtils.toListBy")
    @js.native
    def toListBy[T, TRes](
      map: Record[Double, T],
      callback: js.Function2[/* elem */ T, /* key */ Double, TRes],
      maxElements: Double
    ): js.Array[TRes] = js.native
    
    @JSImport("@devexpress/utils/lib/utils/map/number", "NumberMapUtils.unsafeAnyOf")
    @js.native
    def unsafeAnyOf[T, TRes](
      map: Record[Double, T],
      callback: js.Function2[/* currVal */ T, /* key */ Double, js.UndefOr[TRes | Null]]
    ): TRes | Null = js.native
  }
}
