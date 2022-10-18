package typings.devexpressUtils

import typings.devexpressUtils.libClassMinMaxMod.ExtendedMax
import typings.devexpressUtils.libClassMinMaxMod.ExtendedMin
import typings.devexpressUtils.libClassMinMaxMod.ExtendedMinMax
import typings.devexpressUtils.libClassMinMaxMod.MinMax
import typings.devexpressUtils.libTypesMod.CmpFunc
import typings.devexpressUtils.libTypesMod.ICloneable
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsMapStringMod {
  
  @JSImport("@devexpress/utils/lib/utils/map/string", "StringMapUtils")
  @js.native
  open class StringMapUtils () extends StObject
  /* static members */
  object StringMapUtils {
    
    @JSImport("@devexpress/utils/lib/utils/map/string", "StringMapUtils")
    @js.native
    val ^ : js.Any = js.native
    
    inline def accumulate[T, TAcc](
      map: Record[String, T],
      initAccValue: TAcc,
      callback: js.Function3[/* acc */ TAcc, /* currVal */ T, /* key */ String, TAcc]
    ): TAcc = (^.asInstanceOf[js.Dynamic].applyDynamic("accumulate")(map.asInstanceOf[js.Any], initAccValue.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[TAcc]
    
    inline def allOf[T](map: Record[String, T], callback: js.Function2[/* currVal */ T, /* key */ String, Boolean]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("allOf")(map.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def anyOf[T, TRes](map: Record[String, T], callback: js.Function2[/* currVal */ T, /* key */ String, TRes | Null]): TRes | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("anyOf")(map.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[TRes | Null]
    
    inline def clear[T](map: Record[String, T]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")(map.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def containsBy[T](map: Record[String, T], callback: js.Function2[/* element */ T, /* key */ String, Boolean]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("containsBy")(map.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def deepCopy[T /* <: ICloneable[T] */](map: Record[String, T]): Record[String, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("deepCopy")(map.asInstanceOf[js.Any]).asInstanceOf[Record[String, T]]
    
    inline def elementBy[T](map: Record[String, T], callback: js.Function2[/* element */ T, /* key */ String, Boolean]): T | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("elementBy")(map.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[T | Null]
    
    inline def forEach[TValue](map: Record[String, TValue], callback: js.Function2[/* element */ TValue, /* key */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(map.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def isEmpty[T](map: Record[String, T]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmpty")(map.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def keyBy[T](map: Record[String, T], callback: js.Function2[/* element */ T, /* key */ String, Boolean]): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("keyBy")(map.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[String | Null]
    
    inline def map[TValue, TRes](map: Record[String, TValue], callback: js.Function2[/* element */ TValue, /* key */ String, TRes]): Record[String, TRes] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(map.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Record[String, TRes]]
    
    inline def mapLength[T](map: Record[String, T]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("mapLength")(map.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def max[T](map: Record[String, T], getValue: js.Function2[/* val */ T, /* key */ String, Double]): T | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("max")(map.asInstanceOf[js.Any], getValue.asInstanceOf[js.Any])).asInstanceOf[T | Null]
    
    inline def maxByCmp[T](map: Record[String, T], cmp: CmpFunc[T]): T | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("maxByCmp")(map.asInstanceOf[js.Any], cmp.asInstanceOf[js.Any])).asInstanceOf[T | Null]
    
    inline def maxExtended[T](map: Record[String, T], getValue: js.Function2[/* val */ T, /* key */ String, Double]): ExtendedMax[T] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("maxExtended")(map.asInstanceOf[js.Any], getValue.asInstanceOf[js.Any])).asInstanceOf[ExtendedMax[T] | Null]
    
    inline def min[T](map: Record[String, T], getValue: js.Function2[/* val */ T, /* key */ String, Double]): T | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("min")(map.asInstanceOf[js.Any], getValue.asInstanceOf[js.Any])).asInstanceOf[T | Null]
    
    inline def minByCmp[T](map: Record[String, T], cmp: CmpFunc[T]): T | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("minByCmp")(map.asInstanceOf[js.Any], cmp.asInstanceOf[js.Any])).asInstanceOf[T | Null]
    
    inline def minExtended[T](map: Record[String, T], getValue: js.Function2[/* val */ T, /* key */ String, Double]): ExtendedMin[T] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("minExtended")(map.asInstanceOf[js.Any], getValue.asInstanceOf[js.Any])).asInstanceOf[ExtendedMin[T] | Null]
    
    inline def minMax[T](map: Record[String, T], getValue: js.Function2[/* val */ T, /* key */ String, Double]): MinMax[T] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("minMax")(map.asInstanceOf[js.Any], getValue.asInstanceOf[js.Any])).asInstanceOf[MinMax[T] | Null]
    
    inline def minMaxExtended[T](map: Record[String, T], getValue: js.Function2[/* val */ T, /* key */ String, Double]): ExtendedMinMax[T] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("minMaxExtended")(map.asInstanceOf[js.Any], getValue.asInstanceOf[js.Any])).asInstanceOf[ExtendedMinMax[T] | Null]
    
    inline def reducedMap[T, TRes](map: Record[String, T], callback: js.Function2[/* currVal */ T, /* key */ String, TRes | Null]): Record[String, TRes] = (^.asInstanceOf[js.Dynamic].applyDynamic("reducedMap")(map.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Record[String, TRes]]
    
    inline def shallowCopy[T](map: Record[String, T]): Record[String, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("shallowCopy")(map.asInstanceOf[js.Any]).asInstanceOf[Record[String, T]]
    
    inline def toList[T](map: Record[String, T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("toList")(map.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
    
    inline def toListBy[T, TRes](map: Record[String, T], callback: js.Function2[/* elem */ T, /* key */ String, TRes]): js.Array[TRes] = (^.asInstanceOf[js.Dynamic].applyDynamic("toListBy")(map.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Array[TRes]]
    inline def toListBy[T, TRes](
      map: Record[String, T],
      callback: js.Function2[/* elem */ T, /* key */ String, TRes],
      maxElements: Double
    ): js.Array[TRes] = (^.asInstanceOf[js.Dynamic].applyDynamic("toListBy")(map.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], maxElements.asInstanceOf[js.Any])).asInstanceOf[js.Array[TRes]]
    
    inline def unsafeAnyOf[T, TRes](
      map: Record[String, T],
      callback: js.Function2[/* currVal */ T, /* key */ String, js.UndefOr[TRes | Null]]
    ): TRes | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("unsafeAnyOf")(map.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[TRes | Null]
  }
}
