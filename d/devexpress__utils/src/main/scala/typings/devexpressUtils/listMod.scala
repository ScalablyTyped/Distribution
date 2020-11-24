package typings.devexpressUtils

import typings.devexpressUtils.constMod.ConstInterval
import typings.devexpressUtils.minMaxMod.ExtendedMax
import typings.devexpressUtils.minMaxMod.ExtendedMin
import typings.devexpressUtils.minMaxMod.ExtendedMinMax
import typings.devexpressUtils.minMaxMod.MinMax
import typings.devexpressUtils.typesMod.CmpFunc
import typings.devexpressUtils.typesMod.ICloneable
import typings.devexpressUtils.typesMod.IEquatable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@devexpress/utils/lib/utils/list", JSImport.Namespace)
@js.native
object listMod extends js.Object {
  
  @js.native
  class ListUtils () extends js.Object
  /* static members */
  @js.native
  object ListUtils extends js.Object {
    
    def accumulate[T, TAcc](
      list: js.Array[T],
      initAccValue: TAcc,
      callback: js.Function3[/* acc */ TAcc, /* currVal */ T, /* index */ Double, TAcc]
    ): TAcc = js.native
    def accumulate[T, TAcc](
      list: js.Array[T],
      initAccValue: TAcc,
      callback: js.Function3[/* acc */ TAcc, /* currVal */ T, /* index */ Double, TAcc],
      startIndex: js.UndefOr[scala.Nothing],
      endIndex: Double
    ): TAcc = js.native
    def accumulate[T, TAcc](
      list: js.Array[T],
      initAccValue: TAcc,
      callback: js.Function3[/* acc */ TAcc, /* currVal */ T, /* index */ Double, TAcc],
      startIndex: Double
    ): TAcc = js.native
    def accumulate[T, TAcc](
      list: js.Array[T],
      initAccValue: TAcc,
      callback: js.Function3[/* acc */ TAcc, /* currVal */ T, /* index */ Double, TAcc],
      startIndex: Double,
      endIndex: Double
    ): TAcc = js.native
    
    def accumulateNumber[T](
      list: js.Array[T],
      callback: js.Function3[/* currVal */ T, /* index */ Double, /* acc */ Double, Double]
    ): Double = js.native
    def accumulateNumber[T](
      list: js.Array[T],
      callback: js.Function3[/* currVal */ T, /* index */ Double, /* acc */ Double, Double],
      initAccValue: js.UndefOr[scala.Nothing],
      startIndex: js.UndefOr[scala.Nothing],
      endIndex: Double
    ): Double = js.native
    def accumulateNumber[T](
      list: js.Array[T],
      callback: js.Function3[/* currVal */ T, /* index */ Double, /* acc */ Double, Double],
      initAccValue: js.UndefOr[scala.Nothing],
      startIndex: Double
    ): Double = js.native
    def accumulateNumber[T](
      list: js.Array[T],
      callback: js.Function3[/* currVal */ T, /* index */ Double, /* acc */ Double, Double],
      initAccValue: js.UndefOr[scala.Nothing],
      startIndex: Double,
      endIndex: Double
    ): Double = js.native
    def accumulateNumber[T](
      list: js.Array[T],
      callback: js.Function3[/* currVal */ T, /* index */ Double, /* acc */ Double, Double],
      initAccValue: Double
    ): Double = js.native
    def accumulateNumber[T](
      list: js.Array[T],
      callback: js.Function3[/* currVal */ T, /* index */ Double, /* acc */ Double, Double],
      initAccValue: Double,
      startIndex: js.UndefOr[scala.Nothing],
      endIndex: Double
    ): Double = js.native
    def accumulateNumber[T](
      list: js.Array[T],
      callback: js.Function3[/* currVal */ T, /* index */ Double, /* acc */ Double, Double],
      initAccValue: Double,
      startIndex: Double
    ): Double = js.native
    def accumulateNumber[T](
      list: js.Array[T],
      callback: js.Function3[/* currVal */ T, /* index */ Double, /* acc */ Double, Double],
      initAccValue: Double,
      startIndex: Double,
      endIndex: Double
    ): Double = js.native
    
    def addListOnTail[T](resultList: js.Array[T], addedList: js.Array[T]): js.Array[T] = js.native
    
    def allOf[T](list: js.Array[T], callback: js.Function2[/* currVal */ T, /* index */ Double, Boolean]): Boolean = js.native
    def allOf[T](
      list: js.Array[T],
      callback: js.Function2[/* currVal */ T, /* index */ Double, Boolean],
      startIndex: js.UndefOr[scala.Nothing],
      endIndex: Double
    ): Boolean = js.native
    def allOf[T](
      list: js.Array[T],
      callback: js.Function2[/* currVal */ T, /* index */ Double, Boolean],
      startIndex: Double
    ): Boolean = js.native
    def allOf[T](
      list: js.Array[T],
      callback: js.Function2[/* currVal */ T, /* index */ Double, Boolean],
      startIndex: Double,
      endIndex: Double
    ): Boolean = js.native
    
    def allOf2[TA, TB](
      listA: js.Array[TA],
      listB: js.Array[TB],
      callback: js.Function3[/* currValA */ TA, /* currValB */ TB, /* index */ Double, Boolean]
    ): Boolean = js.native
    def allOf2[TA, TB](
      listA: js.Array[TA],
      listB: js.Array[TB],
      callback: js.Function3[/* currValA */ TA, /* currValB */ TB, /* index */ Double, Boolean],
      startIndex: js.UndefOr[scala.Nothing],
      endIndex: Double
    ): Boolean = js.native
    def allOf2[TA, TB](
      listA: js.Array[TA],
      listB: js.Array[TB],
      callback: js.Function3[/* currValA */ TA, /* currValB */ TB, /* index */ Double, Boolean],
      startIndex: Double
    ): Boolean = js.native
    def allOf2[TA, TB](
      listA: js.Array[TA],
      listB: js.Array[TB],
      callback: js.Function3[/* currValA */ TA, /* currValB */ TB, /* index */ Double, Boolean],
      startIndex: Double,
      endIndex: Double
    ): Boolean = js.native
    
    def allOfOnInterval(interval: ConstInterval, callback: js.Function1[/* index */ Double, Boolean]): Boolean = js.native
    
    def anyOf[T](list: js.Array[T], callback: js.Function2[/* currVal */ T, /* index */ Double, Boolean]): Boolean = js.native
    def anyOf[T](
      list: js.Array[T],
      callback: js.Function2[/* currVal */ T, /* index */ Double, Boolean],
      startIndex: js.UndefOr[scala.Nothing],
      endIndex: Double
    ): Boolean = js.native
    def anyOf[T](
      list: js.Array[T],
      callback: js.Function2[/* currVal */ T, /* index */ Double, Boolean],
      startIndex: Double
    ): Boolean = js.native
    def anyOf[T](
      list: js.Array[T],
      callback: js.Function2[/* currVal */ T, /* index */ Double, Boolean],
      startIndex: Double,
      endIndex: Double
    ): Boolean = js.native
    
    def anyOf2[TA, TB](
      listA: js.Array[TA],
      listB: js.Array[TB],
      callback: js.Function3[/* currValA */ TA, /* currValB */ TB, /* index */ Double, Boolean]
    ): Boolean = js.native
    def anyOf2[TA, TB](
      listA: js.Array[TA],
      listB: js.Array[TB],
      callback: js.Function3[/* currValA */ TA, /* currValB */ TB, /* index */ Double, Boolean],
      startIndex: js.UndefOr[scala.Nothing],
      endIndex: Double
    ): Boolean = js.native
    def anyOf2[TA, TB](
      listA: js.Array[TA],
      listB: js.Array[TB],
      callback: js.Function3[/* currValA */ TA, /* currValB */ TB, /* index */ Double, Boolean],
      startIndex: Double
    ): Boolean = js.native
    def anyOf2[TA, TB](
      listA: js.Array[TA],
      listB: js.Array[TB],
      callback: js.Function3[/* currValA */ TA, /* currValB */ TB, /* index */ Double, Boolean],
      startIndex: Double,
      endIndex: Double
    ): Boolean = js.native
    
    def clear[T](list: js.Array[T]): Unit = js.native
    
    def countIf[T](list: js.Array[T], callback: js.Function2[/* currElement */ T, /* index */ Double, Boolean]): Double = js.native
    
    def decLast(list: js.Array[Double]): Double = js.native
    
    def deepCopy[T /* <: ICloneable[T] */](list: js.Array[T]): js.Array[T] = js.native
    
    def elementBy[T](list: js.Array[T], callback: js.Function2[/* currElement */ T, /* index */ Double, Boolean]): T | Null = js.native
    def elementBy[T](
      list: js.Array[T],
      callback: js.Function2[/* currElement */ T, /* index */ Double, Boolean],
      startIndex: js.UndefOr[scala.Nothing],
      endIndex: Double
    ): T | Null = js.native
    def elementBy[T](
      list: js.Array[T],
      callback: js.Function2[/* currElement */ T, /* index */ Double, Boolean],
      startIndex: Double
    ): T | Null = js.native
    def elementBy[T](
      list: js.Array[T],
      callback: js.Function2[/* currElement */ T, /* index */ Double, Boolean],
      startIndex: Double,
      endIndex: Double
    ): T | Null = js.native
    
    def equals[T /* <: IEquatable[T] */](a: js.Array[T], b: js.Array[T]): Boolean = js.native
    
    def equalsByReference(a: js.Array[_], b: js.Array[_]): Boolean = js.native
    
    def filter[T](list: js.Array[T], callback: js.Function2[/* currVal */ T, /* index */ Double, Boolean]): js.Array[T] = js.native
    def filter[T](
      list: js.Array[T],
      callback: js.Function2[/* currVal */ T, /* index */ Double, Boolean],
      startIndex: js.UndefOr[scala.Nothing],
      endIndex: Double
    ): js.Array[T] = js.native
    def filter[T](
      list: js.Array[T],
      callback: js.Function2[/* currVal */ T, /* index */ Double, Boolean],
      startIndex: Double
    ): js.Array[T] = js.native
    def filter[T](
      list: js.Array[T],
      callback: js.Function2[/* currVal */ T, /* index */ Double, Boolean],
      startIndex: Double,
      endIndex: Double
    ): js.Array[T] = js.native
    
    def forEach[T](list: js.Array[T], callback: js.Function2[/* value */ T, /* index */ Double, Unit]): Unit = js.native
    def forEach[T](
      list: js.Array[T],
      callback: js.Function2[/* value */ T, /* index */ Double, Unit],
      startIndex: js.UndefOr[scala.Nothing],
      endIndex: Double
    ): Unit = js.native
    def forEach[T](
      list: js.Array[T],
      callback: js.Function2[/* value */ T, /* index */ Double, Unit],
      startIndex: Double
    ): Unit = js.native
    def forEach[T](
      list: js.Array[T],
      callback: js.Function2[/* value */ T, /* index */ Double, Unit],
      startIndex: Double,
      endIndex: Double
    ): Unit = js.native
    
    def forEach2[TA, TB](
      listA: js.Array[TA],
      listB: js.Array[TB],
      callback: js.Function3[/* valueA */ TA, /* valueB */ TB, /* index */ Double, Unit]
    ): Unit = js.native
    def forEach2[TA, TB](
      listA: js.Array[TA],
      listB: js.Array[TB],
      callback: js.Function3[/* valueA */ TA, /* valueB */ TB, /* index */ Double, Unit],
      startIndex: js.UndefOr[scala.Nothing],
      endIndex: Double
    ): Unit = js.native
    def forEach2[TA, TB](
      listA: js.Array[TA],
      listB: js.Array[TB],
      callback: js.Function3[/* valueA */ TA, /* valueB */ TB, /* index */ Double, Unit],
      startIndex: Double
    ): Unit = js.native
    def forEach2[TA, TB](
      listA: js.Array[TA],
      listB: js.Array[TB],
      callback: js.Function3[/* valueA */ TA, /* valueB */ TB, /* index */ Double, Unit],
      startIndex: Double,
      endIndex: Double
    ): Unit = js.native
    
    def forEachOnInterval(interval: ConstInterval, callback: js.Function1[/* index */ Double, Unit]): Unit = js.native
    
    def incLast(list: js.Array[Double]): Double = js.native
    
    def indexBy[T](list: js.Array[T], callback: js.Function2[/* currElement */ T, /* index */ Double, Boolean]): Double = js.native
    def indexBy[T](
      list: js.Array[T],
      callback: js.Function2[/* currElement */ T, /* index */ Double, Boolean],
      startIndex: js.UndefOr[scala.Nothing],
      endIndex: Double
    ): Double = js.native
    def indexBy[T](
      list: js.Array[T],
      callback: js.Function2[/* currElement */ T, /* index */ Double, Boolean],
      startIndex: Double
    ): Double = js.native
    def indexBy[T](
      list: js.Array[T],
      callback: js.Function2[/* currElement */ T, /* index */ Double, Boolean],
      startIndex: Double,
      endIndex: Double
    ): Double = js.native
    
    def initByCallback[T](numElements: Double, initCallback: js.Function1[/* index */ Double, T]): js.Array[T] = js.native
    
    def initByValue[T](numElements: Double, initValue: T): js.Array[T] = js.native
    
    def joinLists[T, TRes](converter: js.Function1[/* list */ js.Array[T], js.Array[TRes]], lists: js.Array[T]*): js.Array[TRes] = js.native
    
    def last[T](list: js.Array[T]): T = js.native
    
    def map[T, TRes](list: js.Array[T], callback: js.Function2[/* currVal */ T, /* index */ Double, TRes]): js.Array[TRes] = js.native
    def map[T, TRes](
      list: js.Array[T],
      callback: js.Function2[/* currVal */ T, /* index */ Double, TRes],
      startIndex: js.UndefOr[scala.Nothing],
      endIndex: Double
    ): js.Array[TRes] = js.native
    def map[T, TRes](
      list: js.Array[T],
      callback: js.Function2[/* currVal */ T, /* index */ Double, TRes],
      startIndex: Double
    ): js.Array[TRes] = js.native
    def map[T, TRes](
      list: js.Array[T],
      callback: js.Function2[/* currVal */ T, /* index */ Double, TRes],
      startIndex: Double,
      endIndex: Double
    ): js.Array[TRes] = js.native
    
    def max[T](list: js.Array[T], getValue: js.Function1[/* val */ T, Double]): T | Null = js.native
    def max[T](
      list: js.Array[T],
      getValue: js.Function1[/* val */ T, Double],
      startIndex: js.UndefOr[scala.Nothing],
      endIndex: Double
    ): T | Null = js.native
    def max[T](list: js.Array[T], getValue: js.Function1[/* val */ T, Double], startIndex: Double): T | Null = js.native
    def max[T](
      list: js.Array[T],
      getValue: js.Function1[/* val */ T, Double],
      startIndex: Double,
      endIndex: Double
    ): T | Null = js.native
    
    def maxByCmp[T](list: js.Array[T], cmp: CmpFunc[T]): T | Null = js.native
    def maxByCmp[T](list: js.Array[T], cmp: CmpFunc[T], startIndex: js.UndefOr[scala.Nothing], endIndex: Double): T | Null = js.native
    def maxByCmp[T](list: js.Array[T], cmp: CmpFunc[T], startIndex: Double): T | Null = js.native
    def maxByCmp[T](list: js.Array[T], cmp: CmpFunc[T], startIndex: Double, endIndex: Double): T | Null = js.native
    
    def maxExtended[T](list: js.Array[T], getValue: js.Function1[/* val */ T, Double]): ExtendedMax[T] | Null = js.native
    def maxExtended[T](
      list: js.Array[T],
      getValue: js.Function1[/* val */ T, Double],
      startIndex: js.UndefOr[scala.Nothing],
      endIndex: Double
    ): ExtendedMax[T] | Null = js.native
    def maxExtended[T](list: js.Array[T], getValue: js.Function1[/* val */ T, Double], startIndex: Double): ExtendedMax[T] | Null = js.native
    def maxExtended[T](
      list: js.Array[T],
      getValue: js.Function1[/* val */ T, Double],
      startIndex: Double,
      endIndex: Double
    ): ExtendedMax[T] | Null = js.native
    
    def merge[T](
      list: js.Array[T],
      cmp: CmpFunc[T],
      shouldMerge: js.Function2[/* a */ T, /* b */ T, Boolean],
      merge: js.Function2[/* toMerge */ T, /* fromMerge */ T, Unit]
    ): js.Array[T] = js.native
    def merge[T](
      list: js.Array[T],
      cmp: CmpFunc[T],
      shouldMerge: js.Function2[/* a */ T, /* b */ T, Boolean],
      merge: js.Function2[/* toMerge */ T, /* fromMerge */ T, Unit],
      startIndex: js.UndefOr[scala.Nothing],
      endIndex: Double
    ): js.Array[T] = js.native
    def merge[T](
      list: js.Array[T],
      cmp: CmpFunc[T],
      shouldMerge: js.Function2[/* a */ T, /* b */ T, Boolean],
      merge: js.Function2[/* toMerge */ T, /* fromMerge */ T, Unit],
      startIndex: Double
    ): js.Array[T] = js.native
    def merge[T](
      list: js.Array[T],
      cmp: CmpFunc[T],
      shouldMerge: js.Function2[/* a */ T, /* b */ T, Boolean],
      merge: js.Function2[/* toMerge */ T, /* fromMerge */ T, Unit],
      startIndex: Double,
      endIndex: Double
    ): js.Array[T] = js.native
    
    def min[T](list: js.Array[T], getValue: js.Function1[/* val */ T, Double]): T | Null = js.native
    def min[T](
      list: js.Array[T],
      getValue: js.Function1[/* val */ T, Double],
      startIndex: js.UndefOr[scala.Nothing],
      endIndex: Double
    ): T | Null = js.native
    def min[T](list: js.Array[T], getValue: js.Function1[/* val */ T, Double], startIndex: Double): T | Null = js.native
    def min[T](
      list: js.Array[T],
      getValue: js.Function1[/* val */ T, Double],
      startIndex: Double,
      endIndex: Double
    ): T | Null = js.native
    
    def minByCmp[T](list: js.Array[T], cmp: CmpFunc[T]): T | Null = js.native
    def minByCmp[T](list: js.Array[T], cmp: CmpFunc[T], startIndex: js.UndefOr[scala.Nothing], endIndex: Double): T | Null = js.native
    def minByCmp[T](list: js.Array[T], cmp: CmpFunc[T], startIndex: Double): T | Null = js.native
    def minByCmp[T](list: js.Array[T], cmp: CmpFunc[T], startIndex: Double, endIndex: Double): T | Null = js.native
    
    def minExtended[T](list: js.Array[T], getValue: js.Function1[/* val */ T, Double]): ExtendedMin[T] | Null = js.native
    def minExtended[T](
      list: js.Array[T],
      getValue: js.Function1[/* val */ T, Double],
      startIndex: js.UndefOr[scala.Nothing],
      endIndex: Double
    ): ExtendedMin[T] | Null = js.native
    def minExtended[T](list: js.Array[T], getValue: js.Function1[/* val */ T, Double], startIndex: Double): ExtendedMin[T] | Null = js.native
    def minExtended[T](
      list: js.Array[T],
      getValue: js.Function1[/* val */ T, Double],
      startIndex: Double,
      endIndex: Double
    ): ExtendedMin[T] | Null = js.native
    
    def minMax[T](list: js.Array[T], getValue: js.Function1[/* val */ T, Double]): MinMax[T] | Null = js.native
    def minMax[T](
      list: js.Array[T],
      getValue: js.Function1[/* val */ T, Double],
      startIndex: js.UndefOr[scala.Nothing],
      endIndex: Double
    ): MinMax[T] | Null = js.native
    def minMax[T](list: js.Array[T], getValue: js.Function1[/* val */ T, Double], startIndex: Double): MinMax[T] | Null = js.native
    def minMax[T](
      list: js.Array[T],
      getValue: js.Function1[/* val */ T, Double],
      startIndex: Double,
      endIndex: Double
    ): MinMax[T] | Null = js.native
    
    def minMaxByCmp[T](list: js.Array[T], cmp: CmpFunc[T]): MinMax[T] | Null = js.native
    def minMaxByCmp[T](list: js.Array[T], cmp: CmpFunc[T], startIndex: js.UndefOr[scala.Nothing], endIndex: Double): MinMax[T] | Null = js.native
    def minMaxByCmp[T](list: js.Array[T], cmp: CmpFunc[T], startIndex: Double): MinMax[T] | Null = js.native
    def minMaxByCmp[T](list: js.Array[T], cmp: CmpFunc[T], startIndex: Double, endIndex: Double): MinMax[T] | Null = js.native
    
    def minMaxExtended[T](list: js.Array[T], getValue: js.Function1[/* val */ T, Double]): ExtendedMinMax[T] | Null = js.native
    def minMaxExtended[T](
      list: js.Array[T],
      getValue: js.Function1[/* val */ T, Double],
      startIndex: js.UndefOr[scala.Nothing],
      endIndex: Double
    ): ExtendedMinMax[T] | Null = js.native
    def minMaxExtended[T](list: js.Array[T], getValue: js.Function1[/* val */ T, Double], startIndex: Double): ExtendedMinMax[T] | Null = js.native
    def minMaxExtended[T](
      list: js.Array[T],
      getValue: js.Function1[/* val */ T, Double],
      startIndex: Double,
      endIndex: Double
    ): ExtendedMinMax[T] | Null = js.native
    
    def push[T](list: js.Array[T], element: T): js.Array[T] = js.native
    
    def reducedMap[T, TRes](list: js.Array[T], callback: js.Function2[/* currVal */ T, /* index */ Double, TRes | Null]): js.Array[TRes] = js.native
    def reducedMap[T, TRes](
      list: js.Array[T],
      callback: js.Function2[/* currVal */ T, /* index */ Double, TRes | Null],
      startIndex: js.UndefOr[scala.Nothing],
      endIndex: Double
    ): js.Array[TRes] = js.native
    def reducedMap[T, TRes](
      list: js.Array[T],
      callback: js.Function2[/* currVal */ T, /* index */ Double, TRes | Null],
      startIndex: Double
    ): js.Array[TRes] = js.native
    def reducedMap[T, TRes](
      list: js.Array[T],
      callback: js.Function2[/* currVal */ T, /* index */ Double, TRes | Null],
      startIndex: Double,
      endIndex: Double
    ): js.Array[TRes] = js.native
    
    def remove[T](list: js.Array[T], element: T): Unit = js.native
    
    def removeBy[T](list: js.Array[T], callback: js.Function2[/* currVal */ T, /* index */ Double, Boolean]): T | Null = js.native
    
    def reverseAnyOf[T](list: js.Array[T], callback: js.Function2[/* currVal */ T, /* index */ Double, Boolean]): Boolean = js.native
    def reverseAnyOf[T](
      list: js.Array[T],
      callback: js.Function2[/* currVal */ T, /* index */ Double, Boolean],
      startIndex: js.UndefOr[scala.Nothing],
      endIndex: Double
    ): Boolean = js.native
    def reverseAnyOf[T](
      list: js.Array[T],
      callback: js.Function2[/* currVal */ T, /* index */ Double, Boolean],
      startIndex: Double
    ): Boolean = js.native
    def reverseAnyOf[T](
      list: js.Array[T],
      callback: js.Function2[/* currVal */ T, /* index */ Double, Boolean],
      startIndex: Double,
      endIndex: Double
    ): Boolean = js.native
    
    def reverseElementBy[T](list: js.Array[T], callback: js.Function2[/* currElement */ T, /* index */ Double, Boolean]): T | Null = js.native
    def reverseElementBy[T](
      list: js.Array[T],
      callback: js.Function2[/* currElement */ T, /* index */ Double, Boolean],
      startIndex: js.UndefOr[scala.Nothing],
      endIndex: Double
    ): T | Null = js.native
    def reverseElementBy[T](
      list: js.Array[T],
      callback: js.Function2[/* currElement */ T, /* index */ Double, Boolean],
      startIndex: Double
    ): T | Null = js.native
    def reverseElementBy[T](
      list: js.Array[T],
      callback: js.Function2[/* currElement */ T, /* index */ Double, Boolean],
      startIndex: Double,
      endIndex: Double
    ): T | Null = js.native
    
    def reverseForEach[T](list: js.Array[T], callback: js.Function2[/* value */ T, /* index */ Double, Unit]): Unit = js.native
    def reverseForEach[T](
      list: js.Array[T],
      callback: js.Function2[/* value */ T, /* index */ Double, Unit],
      startIndex: js.UndefOr[scala.Nothing],
      endIndex: Double
    ): Unit = js.native
    def reverseForEach[T](
      list: js.Array[T],
      callback: js.Function2[/* value */ T, /* index */ Double, Unit],
      startIndex: Double
    ): Unit = js.native
    def reverseForEach[T](
      list: js.Array[T],
      callback: js.Function2[/* value */ T, /* index */ Double, Unit],
      startIndex: Double,
      endIndex: Double
    ): Unit = js.native
    
    def reverseForEachOnInterval(interval: ConstInterval, callback: js.Function1[/* index */ Double, Unit]): Unit = js.native
    
    def reverseIndexBy[T](list: js.Array[T], callback: js.Function2[/* currElement */ T, /* index */ Double, Boolean]): Double = js.native
    def reverseIndexBy[T](
      list: js.Array[T],
      callback: js.Function2[/* currElement */ T, /* index */ Double, Boolean],
      startIndex: js.UndefOr[scala.Nothing],
      endIndex: Double
    ): Double = js.native
    def reverseIndexBy[T](
      list: js.Array[T],
      callback: js.Function2[/* currElement */ T, /* index */ Double, Boolean],
      startIndex: Double
    ): Double = js.native
    def reverseIndexBy[T](
      list: js.Array[T],
      callback: js.Function2[/* currElement */ T, /* index */ Double, Boolean],
      startIndex: Double,
      endIndex: Double
    ): Double = js.native
    
    def reverseIndexOf[T](list: js.Array[T], element: T): Double = js.native
    def reverseIndexOf[T](list: js.Array[T], element: T, startIndex: js.UndefOr[scala.Nothing], endIndex: Double): Double = js.native
    def reverseIndexOf[T](list: js.Array[T], element: T, startIndex: Double): Double = js.native
    def reverseIndexOf[T](list: js.Array[T], element: T, startIndex: Double, endIndex: Double): Double = js.native
    
    def setLast[T](list: js.Array[T], newVal: T): T = js.native
    
    def shallowCopy[T](list: js.Array[T]): js.Array[T] = js.native
    
    def unique[T](list: js.Array[T], cmp: CmpFunc[T]): js.Array[T] = js.native
    def unique[T](
      list: js.Array[T],
      cmp: CmpFunc[T],
      equal: js.UndefOr[scala.Nothing],
      finalizeObj: js.Function1[/* obj */ T, Unit]
    ): js.Array[T] = js.native
    def unique[T](list: js.Array[T], cmp: CmpFunc[T], equal: CmpFunc[T]): js.Array[T] = js.native
    def unique[T](
      list: js.Array[T],
      cmp: CmpFunc[T],
      equal: CmpFunc[T],
      finalizeObj: js.Function1[/* obj */ T, Unit]
    ): js.Array[T] = js.native
    
    def uniqueNumber(list: js.Array[Double]): js.Array[Double] = js.native
    
    def unsafeAnyOf[T, TRes](
      list: js.Array[T],
      callback: js.Function2[/* currVal */ T, /* index */ Double, js.UndefOr[TRes | Null]]
    ): TRes | Null = js.native
    def unsafeAnyOf[T, TRes](
      list: js.Array[T],
      callback: js.Function2[/* currVal */ T, /* index */ Double, js.UndefOr[TRes | Null]],
      startIndex: js.UndefOr[scala.Nothing],
      endIndex: Double
    ): TRes | Null = js.native
    def unsafeAnyOf[T, TRes](
      list: js.Array[T],
      callback: js.Function2[/* currVal */ T, /* index */ Double, js.UndefOr[TRes | Null]],
      startIndex: Double
    ): TRes | Null = js.native
    def unsafeAnyOf[T, TRes](
      list: js.Array[T],
      callback: js.Function2[/* currVal */ T, /* index */ Double, js.UndefOr[TRes | Null]],
      startIndex: Double,
      endIndex: Double
    ): TRes | Null = js.native
    
    def unsafeReverseAnyOf[T, TRes](
      list: js.Array[T],
      callback: js.Function2[/* currVal */ T, /* index */ Double, js.UndefOr[TRes | Null]]
    ): TRes | Null = js.native
    def unsafeReverseAnyOf[T, TRes](
      list: js.Array[T],
      callback: js.Function2[/* currVal */ T, /* index */ Double, js.UndefOr[TRes | Null]],
      startIndex: js.UndefOr[scala.Nothing],
      endIndex: Double
    ): TRes | Null = js.native
    def unsafeReverseAnyOf[T, TRes](
      list: js.Array[T],
      callback: js.Function2[/* currVal */ T, /* index */ Double, js.UndefOr[TRes | Null]],
      startIndex: Double
    ): TRes | Null = js.native
    def unsafeReverseAnyOf[T, TRes](
      list: js.Array[T],
      callback: js.Function2[/* currVal */ T, /* index */ Double, js.UndefOr[TRes | Null]],
      startIndex: Double,
      endIndex: Double
    ): TRes | Null = js.native
  }
}
