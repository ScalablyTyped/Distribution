package typings.devexpressUtils

import typings.devexpressUtils.constMod.ConstInterval
import typings.devexpressUtils.minMaxMod.ExtendedMax
import typings.devexpressUtils.minMaxMod.ExtendedMin
import typings.devexpressUtils.minMaxMod.ExtendedMinMax
import typings.devexpressUtils.minMaxMod.MinMax
import typings.devexpressUtils.typesMod.CmpFunc
import typings.devexpressUtils.typesMod.ICloneable
import typings.devexpressUtils.typesMod.IEquatable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listMod {
  
  @JSImport("@devexpress/utils/lib/utils/list", "ListUtils")
  @js.native
  class ListUtils () extends StObject
  /* static members */
  object ListUtils {
    
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.accumulate")
    @js.native
    def accumulate[T, TAcc](
      list: js.Array[T],
      initAccValue: TAcc,
      callback: js.Function3[/* acc */ TAcc, /* currVal */ T, /* index */ Double, TAcc]
    ): TAcc = js.native
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.accumulate")
    @js.native
    def accumulate[T, TAcc](
      list: js.Array[T],
      initAccValue: TAcc,
      callback: js.Function3[/* acc */ TAcc, /* currVal */ T, /* index */ Double, TAcc],
      startIndex: js.UndefOr[scala.Nothing],
      endIndex: Double
    ): TAcc = js.native
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.accumulate")
    @js.native
    def accumulate[T, TAcc](
      list: js.Array[T],
      initAccValue: TAcc,
      callback: js.Function3[/* acc */ TAcc, /* currVal */ T, /* index */ Double, TAcc],
      startIndex: Double
    ): TAcc = js.native
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.accumulate")
    @js.native
    def accumulate[T, TAcc](
      list: js.Array[T],
      initAccValue: TAcc,
      callback: js.Function3[/* acc */ TAcc, /* currVal */ T, /* index */ Double, TAcc],
      startIndex: Double,
      endIndex: Double
    ): TAcc = js.native
    
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.accumulateNumber")
    @js.native
    def accumulateNumber[T](
      list: js.Array[T],
      callback: js.Function3[/* currVal */ T, /* index */ Double, /* acc */ Double, Double]
    ): Double = js.native
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.accumulateNumber")
    @js.native
    def accumulateNumber[T](
      list: js.Array[T],
      callback: js.Function3[/* currVal */ T, /* index */ Double, /* acc */ Double, Double],
      initAccValue: js.UndefOr[scala.Nothing],
      startIndex: js.UndefOr[scala.Nothing],
      endIndex: Double
    ): Double = js.native
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.accumulateNumber")
    @js.native
    def accumulateNumber[T](
      list: js.Array[T],
      callback: js.Function3[/* currVal */ T, /* index */ Double, /* acc */ Double, Double],
      initAccValue: js.UndefOr[scala.Nothing],
      startIndex: Double
    ): Double = js.native
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.accumulateNumber")
    @js.native
    def accumulateNumber[T](
      list: js.Array[T],
      callback: js.Function3[/* currVal */ T, /* index */ Double, /* acc */ Double, Double],
      initAccValue: js.UndefOr[scala.Nothing],
      startIndex: Double,
      endIndex: Double
    ): Double = js.native
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.accumulateNumber")
    @js.native
    def accumulateNumber[T](
      list: js.Array[T],
      callback: js.Function3[/* currVal */ T, /* index */ Double, /* acc */ Double, Double],
      initAccValue: Double
    ): Double = js.native
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.accumulateNumber")
    @js.native
    def accumulateNumber[T](
      list: js.Array[T],
      callback: js.Function3[/* currVal */ T, /* index */ Double, /* acc */ Double, Double],
      initAccValue: Double,
      startIndex: js.UndefOr[scala.Nothing],
      endIndex: Double
    ): Double = js.native
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.accumulateNumber")
    @js.native
    def accumulateNumber[T](
      list: js.Array[T],
      callback: js.Function3[/* currVal */ T, /* index */ Double, /* acc */ Double, Double],
      initAccValue: Double,
      startIndex: Double
    ): Double = js.native
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.accumulateNumber")
    @js.native
    def accumulateNumber[T](
      list: js.Array[T],
      callback: js.Function3[/* currVal */ T, /* index */ Double, /* acc */ Double, Double],
      initAccValue: Double,
      startIndex: Double,
      endIndex: Double
    ): Double = js.native
    
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.addListOnTail")
    @js.native
    def addListOnTail[T](resultList: js.Array[T], addedList: js.Array[T]): js.Array[T] = js.native
    
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.allOf")
    @js.native
    def allOf[T](list: js.Array[T], callback: js.Function2[/* currVal */ T, /* index */ Double, Boolean]): Boolean = js.native
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.allOf")
    @js.native
    def allOf[T](
      list: js.Array[T],
      callback: js.Function2[/* currVal */ T, /* index */ Double, Boolean],
      startIndex: js.UndefOr[scala.Nothing],
      endIndex: Double
    ): Boolean = js.native
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.allOf")
    @js.native
    def allOf[T](
      list: js.Array[T],
      callback: js.Function2[/* currVal */ T, /* index */ Double, Boolean],
      startIndex: Double
    ): Boolean = js.native
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.allOf")
    @js.native
    def allOf[T](
      list: js.Array[T],
      callback: js.Function2[/* currVal */ T, /* index */ Double, Boolean],
      startIndex: Double,
      endIndex: Double
    ): Boolean = js.native
    
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.allOf2")
    @js.native
    def allOf2[TA, TB](
      listA: js.Array[TA],
      listB: js.Array[TB],
      callback: js.Function3[/* currValA */ TA, /* currValB */ TB, /* index */ Double, Boolean]
    ): Boolean = js.native
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.allOf2")
    @js.native
    def allOf2[TA, TB](
      listA: js.Array[TA],
      listB: js.Array[TB],
      callback: js.Function3[/* currValA */ TA, /* currValB */ TB, /* index */ Double, Boolean],
      startIndex: js.UndefOr[scala.Nothing],
      endIndex: Double
    ): Boolean = js.native
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.allOf2")
    @js.native
    def allOf2[TA, TB](
      listA: js.Array[TA],
      listB: js.Array[TB],
      callback: js.Function3[/* currValA */ TA, /* currValB */ TB, /* index */ Double, Boolean],
      startIndex: Double
    ): Boolean = js.native
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.allOf2")
    @js.native
    def allOf2[TA, TB](
      listA: js.Array[TA],
      listB: js.Array[TB],
      callback: js.Function3[/* currValA */ TA, /* currValB */ TB, /* index */ Double, Boolean],
      startIndex: Double,
      endIndex: Double
    ): Boolean = js.native
    
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.allOfOnInterval")
    @js.native
    def allOfOnInterval(interval: ConstInterval, callback: js.Function1[/* index */ Double, Boolean]): Boolean = js.native
    
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.anyOf")
    @js.native
    def anyOf[T](list: js.Array[T], callback: js.Function2[/* currVal */ T, /* index */ Double, Boolean]): Boolean = js.native
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.anyOf")
    @js.native
    def anyOf[T](
      list: js.Array[T],
      callback: js.Function2[/* currVal */ T, /* index */ Double, Boolean],
      startIndex: js.UndefOr[scala.Nothing],
      endIndex: Double
    ): Boolean = js.native
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.anyOf")
    @js.native
    def anyOf[T](
      list: js.Array[T],
      callback: js.Function2[/* currVal */ T, /* index */ Double, Boolean],
      startIndex: Double
    ): Boolean = js.native
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.anyOf")
    @js.native
    def anyOf[T](
      list: js.Array[T],
      callback: js.Function2[/* currVal */ T, /* index */ Double, Boolean],
      startIndex: Double,
      endIndex: Double
    ): Boolean = js.native
    
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.anyOf2")
    @js.native
    def anyOf2[TA, TB](
      listA: js.Array[TA],
      listB: js.Array[TB],
      callback: js.Function3[/* currValA */ TA, /* currValB */ TB, /* index */ Double, Boolean]
    ): Boolean = js.native
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.anyOf2")
    @js.native
    def anyOf2[TA, TB](
      listA: js.Array[TA],
      listB: js.Array[TB],
      callback: js.Function3[/* currValA */ TA, /* currValB */ TB, /* index */ Double, Boolean],
      startIndex: js.UndefOr[scala.Nothing],
      endIndex: Double
    ): Boolean = js.native
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.anyOf2")
    @js.native
    def anyOf2[TA, TB](
      listA: js.Array[TA],
      listB: js.Array[TB],
      callback: js.Function3[/* currValA */ TA, /* currValB */ TB, /* index */ Double, Boolean],
      startIndex: Double
    ): Boolean = js.native
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.anyOf2")
    @js.native
    def anyOf2[TA, TB](
      listA: js.Array[TA],
      listB: js.Array[TB],
      callback: js.Function3[/* currValA */ TA, /* currValB */ TB, /* index */ Double, Boolean],
      startIndex: Double,
      endIndex: Double
    ): Boolean = js.native
    
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.clear")
    @js.native
    def clear[T](list: js.Array[T]): Unit = js.native
    
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.countIf")
    @js.native
    def countIf[T](list: js.Array[T], callback: js.Function2[/* currElement */ T, /* index */ Double, Boolean]): Double = js.native
    
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.decLast")
    @js.native
    def decLast(list: js.Array[Double]): Double = js.native
    
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.deepCopy")
    @js.native
    def deepCopy[T /* <: ICloneable[T] */](list: js.Array[T]): js.Array[T] = js.native
    
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.elementBy")
    @js.native
    def elementBy[T](list: js.Array[T], callback: js.Function2[/* currElement */ T, /* index */ Double, Boolean]): T | Null = js.native
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.elementBy")
    @js.native
    def elementBy[T](
      list: js.Array[T],
      callback: js.Function2[/* currElement */ T, /* index */ Double, Boolean],
      startIndex: js.UndefOr[scala.Nothing],
      endIndex: Double
    ): T | Null = js.native
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.elementBy")
    @js.native
    def elementBy[T](
      list: js.Array[T],
      callback: js.Function2[/* currElement */ T, /* index */ Double, Boolean],
      startIndex: Double
    ): T | Null = js.native
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.elementBy")
    @js.native
    def elementBy[T](
      list: js.Array[T],
      callback: js.Function2[/* currElement */ T, /* index */ Double, Boolean],
      startIndex: Double,
      endIndex: Double
    ): T | Null = js.native
    
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.equals")
    @js.native
    def equals[T /* <: IEquatable[T] */](a: js.Array[T], b: js.Array[T]): Boolean = js.native
    
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.equalsByReference")
    @js.native
    def equalsByReference(a: js.Array[_], b: js.Array[_]): Boolean = js.native
    
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.filter")
    @js.native
    def filter[T](list: js.Array[T], callback: js.Function2[/* currVal */ T, /* index */ Double, Boolean]): js.Array[T] = js.native
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.filter")
    @js.native
    def filter[T](
      list: js.Array[T],
      callback: js.Function2[/* currVal */ T, /* index */ Double, Boolean],
      startIndex: js.UndefOr[scala.Nothing],
      endIndex: Double
    ): js.Array[T] = js.native
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.filter")
    @js.native
    def filter[T](
      list: js.Array[T],
      callback: js.Function2[/* currVal */ T, /* index */ Double, Boolean],
      startIndex: Double
    ): js.Array[T] = js.native
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.filter")
    @js.native
    def filter[T](
      list: js.Array[T],
      callback: js.Function2[/* currVal */ T, /* index */ Double, Boolean],
      startIndex: Double,
      endIndex: Double
    ): js.Array[T] = js.native
    
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.forEach")
    @js.native
    def forEach[T](list: js.Array[T], callback: js.Function2[/* value */ T, /* index */ Double, Unit]): Unit = js.native
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.forEach")
    @js.native
    def forEach[T](
      list: js.Array[T],
      callback: js.Function2[/* value */ T, /* index */ Double, Unit],
      startIndex: js.UndefOr[scala.Nothing],
      endIndex: Double
    ): Unit = js.native
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.forEach")
    @js.native
    def forEach[T](
      list: js.Array[T],
      callback: js.Function2[/* value */ T, /* index */ Double, Unit],
      startIndex: Double
    ): Unit = js.native
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.forEach")
    @js.native
    def forEach[T](
      list: js.Array[T],
      callback: js.Function2[/* value */ T, /* index */ Double, Unit],
      startIndex: Double,
      endIndex: Double
    ): Unit = js.native
    
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.forEach2")
    @js.native
    def forEach2[TA, TB](
      listA: js.Array[TA],
      listB: js.Array[TB],
      callback: js.Function3[/* valueA */ TA, /* valueB */ TB, /* index */ Double, Unit]
    ): Unit = js.native
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.forEach2")
    @js.native
    def forEach2[TA, TB](
      listA: js.Array[TA],
      listB: js.Array[TB],
      callback: js.Function3[/* valueA */ TA, /* valueB */ TB, /* index */ Double, Unit],
      startIndex: js.UndefOr[scala.Nothing],
      endIndex: Double
    ): Unit = js.native
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.forEach2")
    @js.native
    def forEach2[TA, TB](
      listA: js.Array[TA],
      listB: js.Array[TB],
      callback: js.Function3[/* valueA */ TA, /* valueB */ TB, /* index */ Double, Unit],
      startIndex: Double
    ): Unit = js.native
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.forEach2")
    @js.native
    def forEach2[TA, TB](
      listA: js.Array[TA],
      listB: js.Array[TB],
      callback: js.Function3[/* valueA */ TA, /* valueB */ TB, /* index */ Double, Unit],
      startIndex: Double,
      endIndex: Double
    ): Unit = js.native
    
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.forEachOnInterval")
    @js.native
    def forEachOnInterval(interval: ConstInterval, callback: js.Function1[/* index */ Double, Unit]): Unit = js.native
    
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.incLast")
    @js.native
    def incLast(list: js.Array[Double]): Double = js.native
    
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.indexBy")
    @js.native
    def indexBy[T](list: js.Array[T], callback: js.Function2[/* currElement */ T, /* index */ Double, Boolean]): Double = js.native
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.indexBy")
    @js.native
    def indexBy[T](
      list: js.Array[T],
      callback: js.Function2[/* currElement */ T, /* index */ Double, Boolean],
      startIndex: js.UndefOr[scala.Nothing],
      endIndex: Double
    ): Double = js.native
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.indexBy")
    @js.native
    def indexBy[T](
      list: js.Array[T],
      callback: js.Function2[/* currElement */ T, /* index */ Double, Boolean],
      startIndex: Double
    ): Double = js.native
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.indexBy")
    @js.native
    def indexBy[T](
      list: js.Array[T],
      callback: js.Function2[/* currElement */ T, /* index */ Double, Boolean],
      startIndex: Double,
      endIndex: Double
    ): Double = js.native
    
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.initByCallback")
    @js.native
    def initByCallback[T](numElements: Double, initCallback: js.Function1[/* index */ Double, T]): js.Array[T] = js.native
    
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.initByValue")
    @js.native
    def initByValue[T](numElements: Double, initValue: T): js.Array[T] = js.native
    
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.joinLists")
    @js.native
    def joinLists[T, TRes](converter: js.Function1[/* list */ js.Array[T], js.Array[TRes]], lists: js.Array[T]*): js.Array[TRes] = js.native
    
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.last")
    @js.native
    def last[T](list: js.Array[T]): T = js.native
    
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.map")
    @js.native
    def map[T, TRes](list: js.Array[T], callback: js.Function2[/* currVal */ T, /* index */ Double, TRes]): js.Array[TRes] = js.native
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.map")
    @js.native
    def map[T, TRes](
      list: js.Array[T],
      callback: js.Function2[/* currVal */ T, /* index */ Double, TRes],
      startIndex: js.UndefOr[scala.Nothing],
      endIndex: Double
    ): js.Array[TRes] = js.native
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.map")
    @js.native
    def map[T, TRes](
      list: js.Array[T],
      callback: js.Function2[/* currVal */ T, /* index */ Double, TRes],
      startIndex: Double
    ): js.Array[TRes] = js.native
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.map")
    @js.native
    def map[T, TRes](
      list: js.Array[T],
      callback: js.Function2[/* currVal */ T, /* index */ Double, TRes],
      startIndex: Double,
      endIndex: Double
    ): js.Array[TRes] = js.native
    
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.max")
    @js.native
    def max[T](list: js.Array[T], getValue: js.Function1[/* val */ T, Double]): T | Null = js.native
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.max")
    @js.native
    def max[T](
      list: js.Array[T],
      getValue: js.Function1[/* val */ T, Double],
      startIndex: js.UndefOr[scala.Nothing],
      endIndex: Double
    ): T | Null = js.native
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.max")
    @js.native
    def max[T](list: js.Array[T], getValue: js.Function1[/* val */ T, Double], startIndex: Double): T | Null = js.native
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.max")
    @js.native
    def max[T](
      list: js.Array[T],
      getValue: js.Function1[/* val */ T, Double],
      startIndex: Double,
      endIndex: Double
    ): T | Null = js.native
    
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.maxByCmp")
    @js.native
    def maxByCmp[T](list: js.Array[T], cmp: CmpFunc[T]): T | Null = js.native
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.maxByCmp")
    @js.native
    def maxByCmp[T](list: js.Array[T], cmp: CmpFunc[T], startIndex: js.UndefOr[scala.Nothing], endIndex: Double): T | Null = js.native
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.maxByCmp")
    @js.native
    def maxByCmp[T](list: js.Array[T], cmp: CmpFunc[T], startIndex: Double): T | Null = js.native
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.maxByCmp")
    @js.native
    def maxByCmp[T](list: js.Array[T], cmp: CmpFunc[T], startIndex: Double, endIndex: Double): T | Null = js.native
    
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.maxExtended")
    @js.native
    def maxExtended[T](list: js.Array[T], getValue: js.Function1[/* val */ T, Double]): ExtendedMax[T] | Null = js.native
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.maxExtended")
    @js.native
    def maxExtended[T](
      list: js.Array[T],
      getValue: js.Function1[/* val */ T, Double],
      startIndex: js.UndefOr[scala.Nothing],
      endIndex: Double
    ): ExtendedMax[T] | Null = js.native
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.maxExtended")
    @js.native
    def maxExtended[T](list: js.Array[T], getValue: js.Function1[/* val */ T, Double], startIndex: Double): ExtendedMax[T] | Null = js.native
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.maxExtended")
    @js.native
    def maxExtended[T](
      list: js.Array[T],
      getValue: js.Function1[/* val */ T, Double],
      startIndex: Double,
      endIndex: Double
    ): ExtendedMax[T] | Null = js.native
    
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.merge")
    @js.native
    def merge[T](
      list: js.Array[T],
      cmp: CmpFunc[T],
      shouldMerge: js.Function2[/* a */ T, /* b */ T, Boolean],
      merge: js.Function2[/* toMerge */ T, /* fromMerge */ T, Unit]
    ): js.Array[T] = js.native
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.merge")
    @js.native
    def merge[T](
      list: js.Array[T],
      cmp: CmpFunc[T],
      shouldMerge: js.Function2[/* a */ T, /* b */ T, Boolean],
      merge: js.Function2[/* toMerge */ T, /* fromMerge */ T, Unit],
      startIndex: js.UndefOr[scala.Nothing],
      endIndex: Double
    ): js.Array[T] = js.native
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.merge")
    @js.native
    def merge[T](
      list: js.Array[T],
      cmp: CmpFunc[T],
      shouldMerge: js.Function2[/* a */ T, /* b */ T, Boolean],
      merge: js.Function2[/* toMerge */ T, /* fromMerge */ T, Unit],
      startIndex: Double
    ): js.Array[T] = js.native
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.merge")
    @js.native
    def merge[T](
      list: js.Array[T],
      cmp: CmpFunc[T],
      shouldMerge: js.Function2[/* a */ T, /* b */ T, Boolean],
      merge: js.Function2[/* toMerge */ T, /* fromMerge */ T, Unit],
      startIndex: Double,
      endIndex: Double
    ): js.Array[T] = js.native
    
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.min")
    @js.native
    def min[T](list: js.Array[T], getValue: js.Function1[/* val */ T, Double]): T | Null = js.native
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.min")
    @js.native
    def min[T](
      list: js.Array[T],
      getValue: js.Function1[/* val */ T, Double],
      startIndex: js.UndefOr[scala.Nothing],
      endIndex: Double
    ): T | Null = js.native
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.min")
    @js.native
    def min[T](list: js.Array[T], getValue: js.Function1[/* val */ T, Double], startIndex: Double): T | Null = js.native
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.min")
    @js.native
    def min[T](
      list: js.Array[T],
      getValue: js.Function1[/* val */ T, Double],
      startIndex: Double,
      endIndex: Double
    ): T | Null = js.native
    
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.minByCmp")
    @js.native
    def minByCmp[T](list: js.Array[T], cmp: CmpFunc[T]): T | Null = js.native
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.minByCmp")
    @js.native
    def minByCmp[T](list: js.Array[T], cmp: CmpFunc[T], startIndex: js.UndefOr[scala.Nothing], endIndex: Double): T | Null = js.native
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.minByCmp")
    @js.native
    def minByCmp[T](list: js.Array[T], cmp: CmpFunc[T], startIndex: Double): T | Null = js.native
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.minByCmp")
    @js.native
    def minByCmp[T](list: js.Array[T], cmp: CmpFunc[T], startIndex: Double, endIndex: Double): T | Null = js.native
    
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.minExtended")
    @js.native
    def minExtended[T](list: js.Array[T], getValue: js.Function1[/* val */ T, Double]): ExtendedMin[T] | Null = js.native
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.minExtended")
    @js.native
    def minExtended[T](
      list: js.Array[T],
      getValue: js.Function1[/* val */ T, Double],
      startIndex: js.UndefOr[scala.Nothing],
      endIndex: Double
    ): ExtendedMin[T] | Null = js.native
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.minExtended")
    @js.native
    def minExtended[T](list: js.Array[T], getValue: js.Function1[/* val */ T, Double], startIndex: Double): ExtendedMin[T] | Null = js.native
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.minExtended")
    @js.native
    def minExtended[T](
      list: js.Array[T],
      getValue: js.Function1[/* val */ T, Double],
      startIndex: Double,
      endIndex: Double
    ): ExtendedMin[T] | Null = js.native
    
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.minMax")
    @js.native
    def minMax[T](list: js.Array[T], getValue: js.Function1[/* val */ T, Double]): MinMax[T] | Null = js.native
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.minMax")
    @js.native
    def minMax[T](
      list: js.Array[T],
      getValue: js.Function1[/* val */ T, Double],
      startIndex: js.UndefOr[scala.Nothing],
      endIndex: Double
    ): MinMax[T] | Null = js.native
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.minMax")
    @js.native
    def minMax[T](list: js.Array[T], getValue: js.Function1[/* val */ T, Double], startIndex: Double): MinMax[T] | Null = js.native
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.minMax")
    @js.native
    def minMax[T](
      list: js.Array[T],
      getValue: js.Function1[/* val */ T, Double],
      startIndex: Double,
      endIndex: Double
    ): MinMax[T] | Null = js.native
    
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.minMaxByCmp")
    @js.native
    def minMaxByCmp[T](list: js.Array[T], cmp: CmpFunc[T]): MinMax[T] | Null = js.native
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.minMaxByCmp")
    @js.native
    def minMaxByCmp[T](list: js.Array[T], cmp: CmpFunc[T], startIndex: js.UndefOr[scala.Nothing], endIndex: Double): MinMax[T] | Null = js.native
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.minMaxByCmp")
    @js.native
    def minMaxByCmp[T](list: js.Array[T], cmp: CmpFunc[T], startIndex: Double): MinMax[T] | Null = js.native
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.minMaxByCmp")
    @js.native
    def minMaxByCmp[T](list: js.Array[T], cmp: CmpFunc[T], startIndex: Double, endIndex: Double): MinMax[T] | Null = js.native
    
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.minMaxExtended")
    @js.native
    def minMaxExtended[T](list: js.Array[T], getValue: js.Function1[/* val */ T, Double]): ExtendedMinMax[T] | Null = js.native
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.minMaxExtended")
    @js.native
    def minMaxExtended[T](
      list: js.Array[T],
      getValue: js.Function1[/* val */ T, Double],
      startIndex: js.UndefOr[scala.Nothing],
      endIndex: Double
    ): ExtendedMinMax[T] | Null = js.native
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.minMaxExtended")
    @js.native
    def minMaxExtended[T](list: js.Array[T], getValue: js.Function1[/* val */ T, Double], startIndex: Double): ExtendedMinMax[T] | Null = js.native
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.minMaxExtended")
    @js.native
    def minMaxExtended[T](
      list: js.Array[T],
      getValue: js.Function1[/* val */ T, Double],
      startIndex: Double,
      endIndex: Double
    ): ExtendedMinMax[T] | Null = js.native
    
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.push")
    @js.native
    def push[T](list: js.Array[T], element: T): js.Array[T] = js.native
    
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.reducedMap")
    @js.native
    def reducedMap[T, TRes](list: js.Array[T], callback: js.Function2[/* currVal */ T, /* index */ Double, TRes | Null]): js.Array[TRes] = js.native
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.reducedMap")
    @js.native
    def reducedMap[T, TRes](
      list: js.Array[T],
      callback: js.Function2[/* currVal */ T, /* index */ Double, TRes | Null],
      startIndex: js.UndefOr[scala.Nothing],
      endIndex: Double
    ): js.Array[TRes] = js.native
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.reducedMap")
    @js.native
    def reducedMap[T, TRes](
      list: js.Array[T],
      callback: js.Function2[/* currVal */ T, /* index */ Double, TRes | Null],
      startIndex: Double
    ): js.Array[TRes] = js.native
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.reducedMap")
    @js.native
    def reducedMap[T, TRes](
      list: js.Array[T],
      callback: js.Function2[/* currVal */ T, /* index */ Double, TRes | Null],
      startIndex: Double,
      endIndex: Double
    ): js.Array[TRes] = js.native
    
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.remove")
    @js.native
    def remove[T](list: js.Array[T], element: T): Unit = js.native
    
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.removeBy")
    @js.native
    def removeBy[T](list: js.Array[T], callback: js.Function2[/* currVal */ T, /* index */ Double, Boolean]): T | Null = js.native
    
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.reverseAnyOf")
    @js.native
    def reverseAnyOf[T](list: js.Array[T], callback: js.Function2[/* currVal */ T, /* index */ Double, Boolean]): Boolean = js.native
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.reverseAnyOf")
    @js.native
    def reverseAnyOf[T](
      list: js.Array[T],
      callback: js.Function2[/* currVal */ T, /* index */ Double, Boolean],
      startIndex: js.UndefOr[scala.Nothing],
      endIndex: Double
    ): Boolean = js.native
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.reverseAnyOf")
    @js.native
    def reverseAnyOf[T](
      list: js.Array[T],
      callback: js.Function2[/* currVal */ T, /* index */ Double, Boolean],
      startIndex: Double
    ): Boolean = js.native
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.reverseAnyOf")
    @js.native
    def reverseAnyOf[T](
      list: js.Array[T],
      callback: js.Function2[/* currVal */ T, /* index */ Double, Boolean],
      startIndex: Double,
      endIndex: Double
    ): Boolean = js.native
    
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.reverseElementBy")
    @js.native
    def reverseElementBy[T](list: js.Array[T], callback: js.Function2[/* currElement */ T, /* index */ Double, Boolean]): T | Null = js.native
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.reverseElementBy")
    @js.native
    def reverseElementBy[T](
      list: js.Array[T],
      callback: js.Function2[/* currElement */ T, /* index */ Double, Boolean],
      startIndex: js.UndefOr[scala.Nothing],
      endIndex: Double
    ): T | Null = js.native
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.reverseElementBy")
    @js.native
    def reverseElementBy[T](
      list: js.Array[T],
      callback: js.Function2[/* currElement */ T, /* index */ Double, Boolean],
      startIndex: Double
    ): T | Null = js.native
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.reverseElementBy")
    @js.native
    def reverseElementBy[T](
      list: js.Array[T],
      callback: js.Function2[/* currElement */ T, /* index */ Double, Boolean],
      startIndex: Double,
      endIndex: Double
    ): T | Null = js.native
    
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.reverseForEach")
    @js.native
    def reverseForEach[T](list: js.Array[T], callback: js.Function2[/* value */ T, /* index */ Double, Unit]): Unit = js.native
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.reverseForEach")
    @js.native
    def reverseForEach[T](
      list: js.Array[T],
      callback: js.Function2[/* value */ T, /* index */ Double, Unit],
      startIndex: js.UndefOr[scala.Nothing],
      endIndex: Double
    ): Unit = js.native
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.reverseForEach")
    @js.native
    def reverseForEach[T](
      list: js.Array[T],
      callback: js.Function2[/* value */ T, /* index */ Double, Unit],
      startIndex: Double
    ): Unit = js.native
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.reverseForEach")
    @js.native
    def reverseForEach[T](
      list: js.Array[T],
      callback: js.Function2[/* value */ T, /* index */ Double, Unit],
      startIndex: Double,
      endIndex: Double
    ): Unit = js.native
    
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.reverseForEachOnInterval")
    @js.native
    def reverseForEachOnInterval(interval: ConstInterval, callback: js.Function1[/* index */ Double, Unit]): Unit = js.native
    
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.reverseIndexBy")
    @js.native
    def reverseIndexBy[T](list: js.Array[T], callback: js.Function2[/* currElement */ T, /* index */ Double, Boolean]): Double = js.native
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.reverseIndexBy")
    @js.native
    def reverseIndexBy[T](
      list: js.Array[T],
      callback: js.Function2[/* currElement */ T, /* index */ Double, Boolean],
      startIndex: js.UndefOr[scala.Nothing],
      endIndex: Double
    ): Double = js.native
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.reverseIndexBy")
    @js.native
    def reverseIndexBy[T](
      list: js.Array[T],
      callback: js.Function2[/* currElement */ T, /* index */ Double, Boolean],
      startIndex: Double
    ): Double = js.native
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.reverseIndexBy")
    @js.native
    def reverseIndexBy[T](
      list: js.Array[T],
      callback: js.Function2[/* currElement */ T, /* index */ Double, Boolean],
      startIndex: Double,
      endIndex: Double
    ): Double = js.native
    
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.reverseIndexOf")
    @js.native
    def reverseIndexOf[T](list: js.Array[T], element: T): Double = js.native
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.reverseIndexOf")
    @js.native
    def reverseIndexOf[T](list: js.Array[T], element: T, startIndex: js.UndefOr[scala.Nothing], endIndex: Double): Double = js.native
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.reverseIndexOf")
    @js.native
    def reverseIndexOf[T](list: js.Array[T], element: T, startIndex: Double): Double = js.native
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.reverseIndexOf")
    @js.native
    def reverseIndexOf[T](list: js.Array[T], element: T, startIndex: Double, endIndex: Double): Double = js.native
    
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.setLast")
    @js.native
    def setLast[T](list: js.Array[T], newVal: T): T = js.native
    
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.shallowCopy")
    @js.native
    def shallowCopy[T](list: js.Array[T]): js.Array[T] = js.native
    
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.unique")
    @js.native
    def unique[T](list: js.Array[T], cmp: CmpFunc[T]): js.Array[T] = js.native
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.unique")
    @js.native
    def unique[T](
      list: js.Array[T],
      cmp: CmpFunc[T],
      equal: js.UndefOr[scala.Nothing],
      finalizeObj: js.Function1[/* obj */ T, Unit]
    ): js.Array[T] = js.native
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.unique")
    @js.native
    def unique[T](list: js.Array[T], cmp: CmpFunc[T], equal: CmpFunc[T]): js.Array[T] = js.native
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.unique")
    @js.native
    def unique[T](
      list: js.Array[T],
      cmp: CmpFunc[T],
      equal: CmpFunc[T],
      finalizeObj: js.Function1[/* obj */ T, Unit]
    ): js.Array[T] = js.native
    
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.uniqueNumber")
    @js.native
    def uniqueNumber(list: js.Array[Double]): js.Array[Double] = js.native
    
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.unsafeAnyOf")
    @js.native
    def unsafeAnyOf[T, TRes](
      list: js.Array[T],
      callback: js.Function2[/* currVal */ T, /* index */ Double, js.UndefOr[TRes | Null]]
    ): TRes | Null = js.native
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.unsafeAnyOf")
    @js.native
    def unsafeAnyOf[T, TRes](
      list: js.Array[T],
      callback: js.Function2[/* currVal */ T, /* index */ Double, js.UndefOr[TRes | Null]],
      startIndex: js.UndefOr[scala.Nothing],
      endIndex: Double
    ): TRes | Null = js.native
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.unsafeAnyOf")
    @js.native
    def unsafeAnyOf[T, TRes](
      list: js.Array[T],
      callback: js.Function2[/* currVal */ T, /* index */ Double, js.UndefOr[TRes | Null]],
      startIndex: Double
    ): TRes | Null = js.native
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.unsafeAnyOf")
    @js.native
    def unsafeAnyOf[T, TRes](
      list: js.Array[T],
      callback: js.Function2[/* currVal */ T, /* index */ Double, js.UndefOr[TRes | Null]],
      startIndex: Double,
      endIndex: Double
    ): TRes | Null = js.native
    
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.unsafeReverseAnyOf")
    @js.native
    def unsafeReverseAnyOf[T, TRes](
      list: js.Array[T],
      callback: js.Function2[/* currVal */ T, /* index */ Double, js.UndefOr[TRes | Null]]
    ): TRes | Null = js.native
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.unsafeReverseAnyOf")
    @js.native
    def unsafeReverseAnyOf[T, TRes](
      list: js.Array[T],
      callback: js.Function2[/* currVal */ T, /* index */ Double, js.UndefOr[TRes | Null]],
      startIndex: js.UndefOr[scala.Nothing],
      endIndex: Double
    ): TRes | Null = js.native
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.unsafeReverseAnyOf")
    @js.native
    def unsafeReverseAnyOf[T, TRes](
      list: js.Array[T],
      callback: js.Function2[/* currVal */ T, /* index */ Double, js.UndefOr[TRes | Null]],
      startIndex: Double
    ): TRes | Null = js.native
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils.unsafeReverseAnyOf")
    @js.native
    def unsafeReverseAnyOf[T, TRes](
      list: js.Array[T],
      callback: js.Function2[/* currVal */ T, /* index */ Double, js.UndefOr[TRes | Null]],
      startIndex: Double,
      endIndex: Double
    ): TRes | Null = js.native
  }
}
