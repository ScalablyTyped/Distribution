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

@JSImport("@devexpress/utils/lib/utils/map/string", JSImport.Namespace)
@js.native
object mapStringMod extends js.Object {
  
  @js.native
  class StringMapUtils () extends js.Object
  /* static members */
  @js.native
  object StringMapUtils extends js.Object {
    
    def accumulate[T, TAcc](
      map: Record[String, T],
      initAccValue: TAcc,
      callback: js.Function3[/* acc */ TAcc, /* currVal */ T, /* key */ String, TAcc]
    ): TAcc = js.native
    
    def allOf[T](map: Record[String, T], callback: js.Function2[/* currVal */ T, /* key */ String, Boolean]): Boolean = js.native
    
    def anyOf[T, TRes](map: Record[String, T], callback: js.Function2[/* currVal */ T, /* key */ String, TRes | Null]): TRes | Null = js.native
    
    def clear[T](map: Record[String, T]): Unit = js.native
    
    def containsBy[T](map: Record[String, T], callback: js.Function2[/* element */ T, /* key */ String, Boolean]): Boolean = js.native
    
    def deepCopy[T /* <: ICloneable[T] */](map: Record[String, T]): Record[String, T] = js.native
    
    def elementBy[T](map: Record[String, T], callback: js.Function2[/* element */ T, /* key */ String, Boolean]): T | Null = js.native
    
    def forEach[TValue](map: Record[String, TValue], callback: js.Function2[/* element */ TValue, /* key */ String, Unit]): Unit = js.native
    
    def isEmpty[T](map: Record[String, T]): Boolean = js.native
    
    def keyBy[T](map: Record[String, T], callback: js.Function2[/* element */ T, /* key */ String, Boolean]): String | Null = js.native
    
    def map[TValue, TRes](map: Record[String, TValue], callback: js.Function2[/* element */ TValue, /* key */ String, TRes]): Record[String, TRes] = js.native
    
    def mapLength[T](map: Record[String, T]): Double = js.native
    
    def max[T](map: Record[String, T], getValue: js.Function2[/* val */ T, /* key */ String, Double]): T | Null = js.native
    
    def maxByCmp[T](map: Record[String, T], cmp: CmpFunc[T]): T | Null = js.native
    
    def maxExtended[T](map: Record[String, T], getValue: js.Function2[/* val */ T, /* key */ String, Double]): ExtendedMax[T] | Null = js.native
    
    def min[T](map: Record[String, T], getValue: js.Function2[/* val */ T, /* key */ String, Double]): T | Null = js.native
    
    def minByCmp[T](map: Record[String, T], cmp: CmpFunc[T]): T | Null = js.native
    
    def minExtended[T](map: Record[String, T], getValue: js.Function2[/* val */ T, /* key */ String, Double]): ExtendedMin[T] | Null = js.native
    
    def minMax[T](map: Record[String, T], getValue: js.Function2[/* val */ T, /* key */ String, Double]): MinMax[T] | Null = js.native
    
    def minMaxExtended[T](map: Record[String, T], getValue: js.Function2[/* val */ T, /* key */ String, Double]): ExtendedMinMax[T] | Null = js.native
    
    def reducedMap[T, TRes](map: Record[String, T], callback: js.Function2[/* currVal */ T, /* key */ String, TRes | Null]): Record[String, TRes] = js.native
    
    def shallowCopy[T](map: Record[String, T]): Record[String, T] = js.native
    
    def toList[T](map: Record[String, T]): js.Array[T] = js.native
    
    def toListBy[T, TRes](map: Record[String, T], callback: js.Function2[/* elem */ T, /* key */ String, TRes]): js.Array[TRes] = js.native
    def toListBy[T, TRes](
      map: Record[String, T],
      callback: js.Function2[/* elem */ T, /* key */ String, TRes],
      maxElements: Double
    ): js.Array[TRes] = js.native
    
    def unsafeAnyOf[T, TRes](
      map: Record[String, T],
      callback: js.Function2[/* currVal */ T, /* key */ String, js.UndefOr[TRes | Null]]
    ): TRes | Null = js.native
  }
}
