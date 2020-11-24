package typings.devexpressUtils

import typings.devexpressUtils.minMaxMod.ExtendedMax
import typings.devexpressUtils.minMaxMod.ExtendedMin
import typings.devexpressUtils.minMaxMod.ExtendedMinMax
import typings.devexpressUtils.minMaxMod.MinMax
import typings.devexpressUtils.typesMod.CmpFunc
import typings.devexpressUtils.typesMod.ICloneable
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@devexpress/utils/lib/utils/map/number", JSImport.Namespace)
@js.native
object mapNumberMod extends js.Object {
  
  @js.native
  class NumberMapUtils () extends js.Object
  /* static members */
  @js.native
  object NumberMapUtils extends js.Object {
    
    def accumulate[T, TAcc](
      map: Record[Double, T],
      initAccValue: TAcc,
      callback: js.Function3[/* acc */ TAcc, /* currVal */ T, /* key */ Double, TAcc]
    ): TAcc = js.native
    
    def allOf[T](map: Record[Double, T], callback: js.Function2[/* currVal */ T, /* key */ Double, Boolean]): Boolean = js.native
    
    def anyOf[T, TRes](map: Record[Double, T], callback: js.Function2[/* currVal */ T, /* key */ Double, TRes | Null]): TRes | Null = js.native
    
    def clear[T](map: Record[Double, T]): Unit = js.native
    
    def containsBy[T](map: Record[Double, T], callback: js.Function2[/* element */ T, /* key */ Double, Boolean]): Boolean = js.native
    
    def deepCopy[T /* <: ICloneable[T] */](map: Record[Double, T]): Record[Double, T] = js.native
    
    def elementBy[T](map: Record[Double, T], callback: js.Function2[/* element */ T, /* key */ Double, Boolean]): T | Null = js.native
    
    def forEach[TValue](map: Record[Double, TValue], callback: js.Function2[/* element */ TValue, /* key */ Double, Unit]): Unit = js.native
    
    def isEmpty[T](map: Record[Double, T]): Boolean = js.native
    
    def keyBy[T](map: Record[Double, T], callback: js.Function2[/* element */ T, /* key */ Double, Boolean]): Double | Null = js.native
    
    def map[TValue, TRes](map: Record[Double, TValue], callback: js.Function2[/* element */ TValue, /* key */ Double, TRes]): Record[Double, TRes] = js.native
    
    def mapLength[T](map: Record[Double, T]): Double = js.native
    
    def max[T](map: Record[Double, T], getValue: js.Function2[/* val */ T, /* key */ Double, Double]): T | Null = js.native
    
    def maxByCmp[T](map: Record[Double, T], cmp: CmpFunc[T]): T | Null = js.native
    
    def maxExtended[T](map: Record[Double, T], getValue: js.Function2[/* val */ T, /* key */ Double, Double]): ExtendedMax[T] | Null = js.native
    
    def min[T](map: Record[Double, T], getValue: js.Function2[/* val */ T, /* key */ Double, Double]): T | Null = js.native
    
    def minByCmp[T](map: Record[Double, T], cmp: CmpFunc[T]): T | Null = js.native
    
    def minExtended[T](map: Record[Double, T], getValue: js.Function2[/* val */ T, /* key */ Double, Double]): ExtendedMin[T] | Null = js.native
    
    def minMax[T](map: Record[Double, T], getValue: js.Function2[/* val */ T, /* key */ Double, Double]): MinMax[T] | Null = js.native
    
    def minMaxExtended[T](map: Record[Double, T], getValue: js.Function2[/* val */ T, /* key */ Double, Double]): ExtendedMinMax[T] | Null = js.native
    
    def reducedMap[T, TRes](map: Record[Double, T], callback: js.Function2[/* currVal */ T, /* key */ Double, TRes | Null]): Record[Double, TRes] = js.native
    
    def shallowCopy[T](map: Record[Double, T]): Record[Double, T] = js.native
    
    def toList[T](map: Record[Double, T]): js.Array[T] = js.native
    
    def toListBy[T, TRes](map: Record[Double, T], callback: js.Function2[/* elem */ T, /* key */ Double, TRes]): js.Array[TRes] = js.native
    def toListBy[T, TRes](
      map: Record[Double, T],
      callback: js.Function2[/* elem */ T, /* key */ Double, TRes],
      maxElements: Double
    ): js.Array[TRes] = js.native
    
    def unsafeAnyOf[T, TRes](
      map: Record[Double, T],
      callback: js.Function2[/* currVal */ T, /* key */ Double, js.UndefOr[TRes | Null]]
    ): TRes | Null = js.native
  }
}
