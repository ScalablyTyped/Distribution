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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mapNumberMod {
  
  @JSImport("@devexpress/utils/lib/utils/map/number", "NumberMapUtils")
  @js.native
  class NumberMapUtils () extends StObject
  /* static members */
  object NumberMapUtils {
    
    @JSImport("@devexpress/utils/lib/utils/map/number", "NumberMapUtils")
    @js.native
    val ^ : js.Any = js.native
    
    inline def accumulate[T, TAcc](
      map: Record[Double, T],
      initAccValue: TAcc,
      callback: js.Function3[/* acc */ TAcc, /* currVal */ T, /* key */ Double, TAcc]
    ): TAcc = (^.asInstanceOf[js.Dynamic].applyDynamic("accumulate")(map.asInstanceOf[js.Any], initAccValue.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[TAcc]
    
    inline def allOf[T](map: Record[Double, T], callback: js.Function2[/* currVal */ T, /* key */ Double, Boolean]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("allOf")(map.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def anyOf[T, TRes](map: Record[Double, T], callback: js.Function2[/* currVal */ T, /* key */ Double, TRes | Null]): TRes | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("anyOf")(map.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[TRes | Null]
    
    inline def clear[T](map: Record[Double, T]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")(map.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def containsBy[T](map: Record[Double, T], callback: js.Function2[/* element */ T, /* key */ Double, Boolean]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("containsBy")(map.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def deepCopy[T /* <: ICloneable[T] */](map: Record[Double, T]): Record[Double, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("deepCopy")(map.asInstanceOf[js.Any]).asInstanceOf[Record[Double, T]]
    
    inline def elementBy[T](map: Record[Double, T], callback: js.Function2[/* element */ T, /* key */ Double, Boolean]): T | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("elementBy")(map.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[T | Null]
    
    inline def forEach[TValue](map: Record[Double, TValue], callback: js.Function2[/* element */ TValue, /* key */ Double, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(map.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def isEmpty[T](map: Record[Double, T]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmpty")(map.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def keyBy[T](map: Record[Double, T], callback: js.Function2[/* element */ T, /* key */ Double, Boolean]): Double | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("keyBy")(map.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Double | Null]
    
    inline def map[TValue, TRes](map: Record[Double, TValue], callback: js.Function2[/* element */ TValue, /* key */ Double, TRes]): Record[Double, TRes] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(map.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Record[Double, TRes]]
    
    inline def mapLength[T](map: Record[Double, T]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("mapLength")(map.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def max[T](map: Record[Double, T], getValue: js.Function2[/* val */ T, /* key */ Double, Double]): T | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("max")(map.asInstanceOf[js.Any], getValue.asInstanceOf[js.Any])).asInstanceOf[T | Null]
    
    inline def maxByCmp[T](map: Record[Double, T], cmp: CmpFunc[T]): T | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("maxByCmp")(map.asInstanceOf[js.Any], cmp.asInstanceOf[js.Any])).asInstanceOf[T | Null]
    
    inline def maxExtended[T](map: Record[Double, T], getValue: js.Function2[/* val */ T, /* key */ Double, Double]): ExtendedMax[T] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("maxExtended")(map.asInstanceOf[js.Any], getValue.asInstanceOf[js.Any])).asInstanceOf[ExtendedMax[T] | Null]
    
    inline def min[T](map: Record[Double, T], getValue: js.Function2[/* val */ T, /* key */ Double, Double]): T | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("min")(map.asInstanceOf[js.Any], getValue.asInstanceOf[js.Any])).asInstanceOf[T | Null]
    
    inline def minByCmp[T](map: Record[Double, T], cmp: CmpFunc[T]): T | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("minByCmp")(map.asInstanceOf[js.Any], cmp.asInstanceOf[js.Any])).asInstanceOf[T | Null]
    
    inline def minExtended[T](map: Record[Double, T], getValue: js.Function2[/* val */ T, /* key */ Double, Double]): ExtendedMin[T] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("minExtended")(map.asInstanceOf[js.Any], getValue.asInstanceOf[js.Any])).asInstanceOf[ExtendedMin[T] | Null]
    
    inline def minMax[T](map: Record[Double, T], getValue: js.Function2[/* val */ T, /* key */ Double, Double]): MinMax[T] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("minMax")(map.asInstanceOf[js.Any], getValue.asInstanceOf[js.Any])).asInstanceOf[MinMax[T] | Null]
    
    inline def minMaxExtended[T](map: Record[Double, T], getValue: js.Function2[/* val */ T, /* key */ Double, Double]): ExtendedMinMax[T] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("minMaxExtended")(map.asInstanceOf[js.Any], getValue.asInstanceOf[js.Any])).asInstanceOf[ExtendedMinMax[T] | Null]
    
    inline def reducedMap[T, TRes](map: Record[Double, T], callback: js.Function2[/* currVal */ T, /* key */ Double, TRes | Null]): Record[Double, TRes] = (^.asInstanceOf[js.Dynamic].applyDynamic("reducedMap")(map.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Record[Double, TRes]]
    
    inline def shallowCopy[T](map: Record[Double, T]): Record[Double, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("shallowCopy")(map.asInstanceOf[js.Any]).asInstanceOf[Record[Double, T]]
    
    inline def toList[T](map: Record[Double, T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("toList")(map.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
    
    inline def toListBy[T, TRes](map: Record[Double, T], callback: js.Function2[/* elem */ T, /* key */ Double, TRes]): js.Array[TRes] = (^.asInstanceOf[js.Dynamic].applyDynamic("toListBy")(map.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Array[TRes]]
    inline def toListBy[T, TRes](
      map: Record[Double, T],
      callback: js.Function2[/* elem */ T, /* key */ Double, TRes],
      maxElements: Double
    ): js.Array[TRes] = (^.asInstanceOf[js.Dynamic].applyDynamic("toListBy")(map.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], maxElements.asInstanceOf[js.Any])).asInstanceOf[js.Array[TRes]]
    
    inline def unsafeAnyOf[T, TRes](
      map: Record[Double, T],
      callback: js.Function2[/* currVal */ T, /* key */ Double, js.UndefOr[TRes | Null]]
    ): TRes | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("unsafeAnyOf")(map.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[TRes | Null]
  }
}
