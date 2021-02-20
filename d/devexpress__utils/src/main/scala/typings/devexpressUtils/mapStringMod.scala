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

object mapStringMod {
  
  @JSImport("@devexpress/utils/lib/utils/map/string", "StringMapUtils")
  @js.native
  class StringMapUtils () extends StObject
  /* static members */
  object StringMapUtils {
    
    @JSImport("@devexpress/utils/lib/utils/map/string", "StringMapUtils.accumulate")
    @js.native
    def accumulate[T, TAcc](
      map: Record[String, T],
      initAccValue: TAcc,
      callback: js.Function3[/* acc */ TAcc, /* currVal */ T, /* key */ String, TAcc]
    ): TAcc = js.native
    
    @JSImport("@devexpress/utils/lib/utils/map/string", "StringMapUtils.allOf")
    @js.native
    def allOf[T](map: Record[String, T], callback: js.Function2[/* currVal */ T, /* key */ String, Boolean]): Boolean = js.native
    
    @JSImport("@devexpress/utils/lib/utils/map/string", "StringMapUtils.anyOf")
    @js.native
    def anyOf[T, TRes](map: Record[String, T], callback: js.Function2[/* currVal */ T, /* key */ String, TRes | Null]): TRes | Null = js.native
    
    @JSImport("@devexpress/utils/lib/utils/map/string", "StringMapUtils.clear")
    @js.native
    def clear[T](map: Record[String, T]): Unit = js.native
    
    @JSImport("@devexpress/utils/lib/utils/map/string", "StringMapUtils.containsBy")
    @js.native
    def containsBy[T](map: Record[String, T], callback: js.Function2[/* element */ T, /* key */ String, Boolean]): Boolean = js.native
    
    @JSImport("@devexpress/utils/lib/utils/map/string", "StringMapUtils.deepCopy")
    @js.native
    def deepCopy[T /* <: ICloneable[T] */](map: Record[String, T]): Record[String, T] = js.native
    
    @JSImport("@devexpress/utils/lib/utils/map/string", "StringMapUtils.elementBy")
    @js.native
    def elementBy[T](map: Record[String, T], callback: js.Function2[/* element */ T, /* key */ String, Boolean]): T | Null = js.native
    
    @JSImport("@devexpress/utils/lib/utils/map/string", "StringMapUtils.forEach")
    @js.native
    def forEach[TValue](map: Record[String, TValue], callback: js.Function2[/* element */ TValue, /* key */ String, Unit]): Unit = js.native
    
    @JSImport("@devexpress/utils/lib/utils/map/string", "StringMapUtils.isEmpty")
    @js.native
    def isEmpty[T](map: Record[String, T]): Boolean = js.native
    
    @JSImport("@devexpress/utils/lib/utils/map/string", "StringMapUtils.keyBy")
    @js.native
    def keyBy[T](map: Record[String, T], callback: js.Function2[/* element */ T, /* key */ String, Boolean]): String | Null = js.native
    
    @JSImport("@devexpress/utils/lib/utils/map/string", "StringMapUtils.map")
    @js.native
    def map[TValue, TRes](map: Record[String, TValue], callback: js.Function2[/* element */ TValue, /* key */ String, TRes]): Record[String, TRes] = js.native
    
    @JSImport("@devexpress/utils/lib/utils/map/string", "StringMapUtils.mapLength")
    @js.native
    def mapLength[T](map: Record[String, T]): Double = js.native
    
    @JSImport("@devexpress/utils/lib/utils/map/string", "StringMapUtils.max")
    @js.native
    def max[T](map: Record[String, T], getValue: js.Function2[/* val */ T, /* key */ String, Double]): T | Null = js.native
    
    @JSImport("@devexpress/utils/lib/utils/map/string", "StringMapUtils.maxByCmp")
    @js.native
    def maxByCmp[T](map: Record[String, T], cmp: CmpFunc[T]): T | Null = js.native
    
    @JSImport("@devexpress/utils/lib/utils/map/string", "StringMapUtils.maxExtended")
    @js.native
    def maxExtended[T](map: Record[String, T], getValue: js.Function2[/* val */ T, /* key */ String, Double]): ExtendedMax[T] | Null = js.native
    
    @JSImport("@devexpress/utils/lib/utils/map/string", "StringMapUtils.min")
    @js.native
    def min[T](map: Record[String, T], getValue: js.Function2[/* val */ T, /* key */ String, Double]): T | Null = js.native
    
    @JSImport("@devexpress/utils/lib/utils/map/string", "StringMapUtils.minByCmp")
    @js.native
    def minByCmp[T](map: Record[String, T], cmp: CmpFunc[T]): T | Null = js.native
    
    @JSImport("@devexpress/utils/lib/utils/map/string", "StringMapUtils.minExtended")
    @js.native
    def minExtended[T](map: Record[String, T], getValue: js.Function2[/* val */ T, /* key */ String, Double]): ExtendedMin[T] | Null = js.native
    
    @JSImport("@devexpress/utils/lib/utils/map/string", "StringMapUtils.minMax")
    @js.native
    def minMax[T](map: Record[String, T], getValue: js.Function2[/* val */ T, /* key */ String, Double]): MinMax[T] | Null = js.native
    
    @JSImport("@devexpress/utils/lib/utils/map/string", "StringMapUtils.minMaxExtended")
    @js.native
    def minMaxExtended[T](map: Record[String, T], getValue: js.Function2[/* val */ T, /* key */ String, Double]): ExtendedMinMax[T] | Null = js.native
    
    @JSImport("@devexpress/utils/lib/utils/map/string", "StringMapUtils.reducedMap")
    @js.native
    def reducedMap[T, TRes](map: Record[String, T], callback: js.Function2[/* currVal */ T, /* key */ String, TRes | Null]): Record[String, TRes] = js.native
    
    @JSImport("@devexpress/utils/lib/utils/map/string", "StringMapUtils.shallowCopy")
    @js.native
    def shallowCopy[T](map: Record[String, T]): Record[String, T] = js.native
    
    @JSImport("@devexpress/utils/lib/utils/map/string", "StringMapUtils.toList")
    @js.native
    def toList[T](map: Record[String, T]): js.Array[T] = js.native
    
    @JSImport("@devexpress/utils/lib/utils/map/string", "StringMapUtils.toListBy")
    @js.native
    def toListBy[T, TRes](map: Record[String, T], callback: js.Function2[/* elem */ T, /* key */ String, TRes]): js.Array[TRes] = js.native
    @JSImport("@devexpress/utils/lib/utils/map/string", "StringMapUtils.toListBy")
    @js.native
    def toListBy[T, TRes](
      map: Record[String, T],
      callback: js.Function2[/* elem */ T, /* key */ String, TRes],
      maxElements: Double
    ): js.Array[TRes] = js.native
    
    @JSImport("@devexpress/utils/lib/utils/map/string", "StringMapUtils.unsafeAnyOf")
    @js.native
    def unsafeAnyOf[T, TRes](
      map: Record[String, T],
      callback: js.Function2[/* currVal */ T, /* key */ String, js.UndefOr[TRes | Null]]
    ): TRes | Null = js.native
  }
}
