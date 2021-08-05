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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listMod {
  
  @JSImport("@devexpress/utils/lib/utils/list", "ListUtils")
  @js.native
  class ListUtils () extends StObject
  /* static members */
  object ListUtils {
    
    @JSImport("@devexpress/utils/lib/utils/list", "ListUtils")
    @js.native
    val ^ : js.Any = js.native
    
    inline def accumulate[T, TAcc](
      list: js.Array[T],
      initAccValue: TAcc,
      callback: js.Function3[/* acc */ TAcc, /* currVal */ T, /* index */ Double, TAcc]
    ): TAcc = (^.asInstanceOf[js.Dynamic].applyDynamic("accumulate")(list.asInstanceOf[js.Any], initAccValue.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[TAcc]
    inline def accumulate[T, TAcc](
      list: js.Array[T],
      initAccValue: TAcc,
      callback: js.Function3[/* acc */ TAcc, /* currVal */ T, /* index */ Double, TAcc],
      startIndex: Double
    ): TAcc = (^.asInstanceOf[js.Dynamic].applyDynamic("accumulate")(list.asInstanceOf[js.Any], initAccValue.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any])).asInstanceOf[TAcc]
    inline def accumulate[T, TAcc](
      list: js.Array[T],
      initAccValue: TAcc,
      callback: js.Function3[/* acc */ TAcc, /* currVal */ T, /* index */ Double, TAcc],
      startIndex: Double,
      endIndex: Double
    ): TAcc = (^.asInstanceOf[js.Dynamic].applyDynamic("accumulate")(list.asInstanceOf[js.Any], initAccValue.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[TAcc]
    inline def accumulate[T, TAcc](
      list: js.Array[T],
      initAccValue: TAcc,
      callback: js.Function3[/* acc */ TAcc, /* currVal */ T, /* index */ Double, TAcc],
      startIndex: Unit,
      endIndex: Double
    ): TAcc = (^.asInstanceOf[js.Dynamic].applyDynamic("accumulate")(list.asInstanceOf[js.Any], initAccValue.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[TAcc]
    
    inline def accumulateNumber[T](
      list: js.Array[T],
      callback: js.Function3[/* currVal */ T, /* index */ Double, /* acc */ Double, Double]
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("accumulateNumber")(list.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def accumulateNumber[T](
      list: js.Array[T],
      callback: js.Function3[/* currVal */ T, /* index */ Double, /* acc */ Double, Double],
      initAccValue: Double
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("accumulateNumber")(list.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], initAccValue.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def accumulateNumber[T](
      list: js.Array[T],
      callback: js.Function3[/* currVal */ T, /* index */ Double, /* acc */ Double, Double],
      initAccValue: Double,
      startIndex: Double
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("accumulateNumber")(list.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], initAccValue.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def accumulateNumber[T](
      list: js.Array[T],
      callback: js.Function3[/* currVal */ T, /* index */ Double, /* acc */ Double, Double],
      initAccValue: Double,
      startIndex: Double,
      endIndex: Double
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("accumulateNumber")(list.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], initAccValue.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def accumulateNumber[T](
      list: js.Array[T],
      callback: js.Function3[/* currVal */ T, /* index */ Double, /* acc */ Double, Double],
      initAccValue: Double,
      startIndex: Unit,
      endIndex: Double
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("accumulateNumber")(list.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], initAccValue.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def accumulateNumber[T](
      list: js.Array[T],
      callback: js.Function3[/* currVal */ T, /* index */ Double, /* acc */ Double, Double],
      initAccValue: Unit,
      startIndex: Double
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("accumulateNumber")(list.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], initAccValue.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def accumulateNumber[T](
      list: js.Array[T],
      callback: js.Function3[/* currVal */ T, /* index */ Double, /* acc */ Double, Double],
      initAccValue: Unit,
      startIndex: Double,
      endIndex: Double
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("accumulateNumber")(list.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], initAccValue.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def accumulateNumber[T](
      list: js.Array[T],
      callback: js.Function3[/* currVal */ T, /* index */ Double, /* acc */ Double, Double],
      initAccValue: Unit,
      startIndex: Unit,
      endIndex: Double
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("accumulateNumber")(list.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], initAccValue.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def addListOnTail[T](resultList: js.Array[T], addedList: js.Array[T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("addListOnTail")(resultList.asInstanceOf[js.Any], addedList.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
    
    inline def allOf[T](list: js.Array[T], callback: js.Function2[/* currVal */ T, /* index */ Double, Boolean]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("allOf")(list.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def allOf[T](
      list: js.Array[T],
      callback: js.Function2[/* currVal */ T, /* index */ Double, Boolean],
      startIndex: Double
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("allOf")(list.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def allOf[T](
      list: js.Array[T],
      callback: js.Function2[/* currVal */ T, /* index */ Double, Boolean],
      startIndex: Double,
      endIndex: Double
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("allOf")(list.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def allOf[T](
      list: js.Array[T],
      callback: js.Function2[/* currVal */ T, /* index */ Double, Boolean],
      startIndex: Unit,
      endIndex: Double
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("allOf")(list.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def allOf2[TA, TB](
      listA: js.Array[TA],
      listB: js.Array[TB],
      callback: js.Function3[/* currValA */ TA, /* currValB */ TB, /* index */ Double, Boolean]
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("allOf2")(listA.asInstanceOf[js.Any], listB.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def allOf2[TA, TB](
      listA: js.Array[TA],
      listB: js.Array[TB],
      callback: js.Function3[/* currValA */ TA, /* currValB */ TB, /* index */ Double, Boolean],
      startIndex: Double
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("allOf2")(listA.asInstanceOf[js.Any], listB.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def allOf2[TA, TB](
      listA: js.Array[TA],
      listB: js.Array[TB],
      callback: js.Function3[/* currValA */ TA, /* currValB */ TB, /* index */ Double, Boolean],
      startIndex: Double,
      endIndex: Double
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("allOf2")(listA.asInstanceOf[js.Any], listB.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def allOf2[TA, TB](
      listA: js.Array[TA],
      listB: js.Array[TB],
      callback: js.Function3[/* currValA */ TA, /* currValB */ TB, /* index */ Double, Boolean],
      startIndex: Unit,
      endIndex: Double
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("allOf2")(listA.asInstanceOf[js.Any], listB.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def allOfOnInterval(interval: ConstInterval, callback: js.Function1[/* index */ Double, Boolean]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("allOfOnInterval")(interval.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def anyOf[T](list: js.Array[T], callback: js.Function2[/* currVal */ T, /* index */ Double, Boolean]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("anyOf")(list.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def anyOf[T](
      list: js.Array[T],
      callback: js.Function2[/* currVal */ T, /* index */ Double, Boolean],
      startIndex: Double
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("anyOf")(list.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def anyOf[T](
      list: js.Array[T],
      callback: js.Function2[/* currVal */ T, /* index */ Double, Boolean],
      startIndex: Double,
      endIndex: Double
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("anyOf")(list.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def anyOf[T](
      list: js.Array[T],
      callback: js.Function2[/* currVal */ T, /* index */ Double, Boolean],
      startIndex: Unit,
      endIndex: Double
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("anyOf")(list.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def anyOf2[TA, TB](
      listA: js.Array[TA],
      listB: js.Array[TB],
      callback: js.Function3[/* currValA */ TA, /* currValB */ TB, /* index */ Double, Boolean]
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("anyOf2")(listA.asInstanceOf[js.Any], listB.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def anyOf2[TA, TB](
      listA: js.Array[TA],
      listB: js.Array[TB],
      callback: js.Function3[/* currValA */ TA, /* currValB */ TB, /* index */ Double, Boolean],
      startIndex: Double
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("anyOf2")(listA.asInstanceOf[js.Any], listB.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def anyOf2[TA, TB](
      listA: js.Array[TA],
      listB: js.Array[TB],
      callback: js.Function3[/* currValA */ TA, /* currValB */ TB, /* index */ Double, Boolean],
      startIndex: Double,
      endIndex: Double
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("anyOf2")(listA.asInstanceOf[js.Any], listB.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def anyOf2[TA, TB](
      listA: js.Array[TA],
      listB: js.Array[TB],
      callback: js.Function3[/* currValA */ TA, /* currValB */ TB, /* index */ Double, Boolean],
      startIndex: Unit,
      endIndex: Double
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("anyOf2")(listA.asInstanceOf[js.Any], listB.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def clear[T](list: js.Array[T]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")(list.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def countIf[T](list: js.Array[T], callback: js.Function2[/* currElement */ T, /* index */ Double, Boolean]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("countIf")(list.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def decLast(list: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("decLast")(list.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def deepCopy[T /* <: ICloneable[T] */](list: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("deepCopy")(list.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
    
    inline def elementBy[T](list: js.Array[T], callback: js.Function2[/* currElement */ T, /* index */ Double, Boolean]): T | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("elementBy")(list.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[T | Null]
    inline def elementBy[T](
      list: js.Array[T],
      callback: js.Function2[/* currElement */ T, /* index */ Double, Boolean],
      startIndex: Double
    ): T | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("elementBy")(list.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any])).asInstanceOf[T | Null]
    inline def elementBy[T](
      list: js.Array[T],
      callback: js.Function2[/* currElement */ T, /* index */ Double, Boolean],
      startIndex: Double,
      endIndex: Double
    ): T | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("elementBy")(list.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[T | Null]
    inline def elementBy[T](
      list: js.Array[T],
      callback: js.Function2[/* currElement */ T, /* index */ Double, Boolean],
      startIndex: Unit,
      endIndex: Double
    ): T | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("elementBy")(list.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[T | Null]
    
    inline def equals[T /* <: IEquatable[T] */](a: js.Array[T], b: js.Array[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def equalsByReference(a: js.Array[js.Any], b: js.Array[js.Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsByReference")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def filter[T](list: js.Array[T], callback: js.Function2[/* currVal */ T, /* index */ Double, Boolean]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(list.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
    inline def filter[T](
      list: js.Array[T],
      callback: js.Function2[/* currVal */ T, /* index */ Double, Boolean],
      startIndex: Double
    ): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(list.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
    inline def filter[T](
      list: js.Array[T],
      callback: js.Function2[/* currVal */ T, /* index */ Double, Boolean],
      startIndex: Double,
      endIndex: Double
    ): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(list.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
    inline def filter[T](
      list: js.Array[T],
      callback: js.Function2[/* currVal */ T, /* index */ Double, Boolean],
      startIndex: Unit,
      endIndex: Double
    ): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(list.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
    
    inline def forEach[T](list: js.Array[T], callback: js.Function2[/* value */ T, /* index */ Double, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(list.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def forEach[T](
      list: js.Array[T],
      callback: js.Function2[/* value */ T, /* index */ Double, Unit],
      startIndex: Double
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(list.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def forEach[T](
      list: js.Array[T],
      callback: js.Function2[/* value */ T, /* index */ Double, Unit],
      startIndex: Double,
      endIndex: Double
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(list.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def forEach[T](
      list: js.Array[T],
      callback: js.Function2[/* value */ T, /* index */ Double, Unit],
      startIndex: Unit,
      endIndex: Double
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(list.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def forEach2[TA, TB](
      listA: js.Array[TA],
      listB: js.Array[TB],
      callback: js.Function3[/* valueA */ TA, /* valueB */ TB, /* index */ Double, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach2")(listA.asInstanceOf[js.Any], listB.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def forEach2[TA, TB](
      listA: js.Array[TA],
      listB: js.Array[TB],
      callback: js.Function3[/* valueA */ TA, /* valueB */ TB, /* index */ Double, Unit],
      startIndex: Double
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach2")(listA.asInstanceOf[js.Any], listB.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def forEach2[TA, TB](
      listA: js.Array[TA],
      listB: js.Array[TB],
      callback: js.Function3[/* valueA */ TA, /* valueB */ TB, /* index */ Double, Unit],
      startIndex: Double,
      endIndex: Double
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach2")(listA.asInstanceOf[js.Any], listB.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def forEach2[TA, TB](
      listA: js.Array[TA],
      listB: js.Array[TB],
      callback: js.Function3[/* valueA */ TA, /* valueB */ TB, /* index */ Double, Unit],
      startIndex: Unit,
      endIndex: Double
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach2")(listA.asInstanceOf[js.Any], listB.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def forEachOnInterval(interval: ConstInterval, callback: js.Function1[/* index */ Double, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEachOnInterval")(interval.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def incLast(list: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("incLast")(list.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def indexBy[T](list: js.Array[T], callback: js.Function2[/* currElement */ T, /* index */ Double, Boolean]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("indexBy")(list.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def indexBy[T](
      list: js.Array[T],
      callback: js.Function2[/* currElement */ T, /* index */ Double, Boolean],
      startIndex: Double
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("indexBy")(list.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def indexBy[T](
      list: js.Array[T],
      callback: js.Function2[/* currElement */ T, /* index */ Double, Boolean],
      startIndex: Double,
      endIndex: Double
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("indexBy")(list.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def indexBy[T](
      list: js.Array[T],
      callback: js.Function2[/* currElement */ T, /* index */ Double, Boolean],
      startIndex: Unit,
      endIndex: Double
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("indexBy")(list.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def initByCallback[T](numElements: Double, initCallback: js.Function1[/* index */ Double, T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("initByCallback")(numElements.asInstanceOf[js.Any], initCallback.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
    
    inline def initByValue[T](numElements: Double, initValue: T): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("initByValue")(numElements.asInstanceOf[js.Any], initValue.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
    
    inline def joinLists[T, TRes](converter: js.Function1[/* list */ js.Array[T], js.Array[TRes]], lists: js.Array[T]*): js.Array[TRes] = (^.asInstanceOf[js.Dynamic].applyDynamic("joinLists")(converter.asInstanceOf[js.Any], lists.asInstanceOf[js.Any])).asInstanceOf[js.Array[TRes]]
    
    inline def last[T](list: js.Array[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("last")(list.asInstanceOf[js.Any]).asInstanceOf[T]
    
    inline def map[T, TRes](list: js.Array[T], callback: js.Function2[/* currVal */ T, /* index */ Double, TRes]): js.Array[TRes] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(list.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Array[TRes]]
    inline def map[T, TRes](
      list: js.Array[T],
      callback: js.Function2[/* currVal */ T, /* index */ Double, TRes],
      startIndex: Double
    ): js.Array[TRes] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(list.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[TRes]]
    inline def map[T, TRes](
      list: js.Array[T],
      callback: js.Function2[/* currVal */ T, /* index */ Double, TRes],
      startIndex: Double,
      endIndex: Double
    ): js.Array[TRes] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(list.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[TRes]]
    inline def map[T, TRes](
      list: js.Array[T],
      callback: js.Function2[/* currVal */ T, /* index */ Double, TRes],
      startIndex: Unit,
      endIndex: Double
    ): js.Array[TRes] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(list.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[TRes]]
    
    inline def max[T](list: js.Array[T], getValue: js.Function1[/* val */ T, Double]): T | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("max")(list.asInstanceOf[js.Any], getValue.asInstanceOf[js.Any])).asInstanceOf[T | Null]
    inline def max[T](list: js.Array[T], getValue: js.Function1[/* val */ T, Double], startIndex: Double): T | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("max")(list.asInstanceOf[js.Any], getValue.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any])).asInstanceOf[T | Null]
    inline def max[T](
      list: js.Array[T],
      getValue: js.Function1[/* val */ T, Double],
      startIndex: Double,
      endIndex: Double
    ): T | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("max")(list.asInstanceOf[js.Any], getValue.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[T | Null]
    inline def max[T](list: js.Array[T], getValue: js.Function1[/* val */ T, Double], startIndex: Unit, endIndex: Double): T | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("max")(list.asInstanceOf[js.Any], getValue.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[T | Null]
    
    inline def maxByCmp[T](list: js.Array[T], cmp: CmpFunc[T]): T | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("maxByCmp")(list.asInstanceOf[js.Any], cmp.asInstanceOf[js.Any])).asInstanceOf[T | Null]
    inline def maxByCmp[T](list: js.Array[T], cmp: CmpFunc[T], startIndex: Double): T | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("maxByCmp")(list.asInstanceOf[js.Any], cmp.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any])).asInstanceOf[T | Null]
    inline def maxByCmp[T](list: js.Array[T], cmp: CmpFunc[T], startIndex: Double, endIndex: Double): T | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("maxByCmp")(list.asInstanceOf[js.Any], cmp.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[T | Null]
    inline def maxByCmp[T](list: js.Array[T], cmp: CmpFunc[T], startIndex: Unit, endIndex: Double): T | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("maxByCmp")(list.asInstanceOf[js.Any], cmp.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[T | Null]
    
    inline def maxExtended[T](list: js.Array[T], getValue: js.Function1[/* val */ T, Double]): ExtendedMax[T] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("maxExtended")(list.asInstanceOf[js.Any], getValue.asInstanceOf[js.Any])).asInstanceOf[ExtendedMax[T] | Null]
    inline def maxExtended[T](list: js.Array[T], getValue: js.Function1[/* val */ T, Double], startIndex: Double): ExtendedMax[T] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("maxExtended")(list.asInstanceOf[js.Any], getValue.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any])).asInstanceOf[ExtendedMax[T] | Null]
    inline def maxExtended[T](
      list: js.Array[T],
      getValue: js.Function1[/* val */ T, Double],
      startIndex: Double,
      endIndex: Double
    ): ExtendedMax[T] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("maxExtended")(list.asInstanceOf[js.Any], getValue.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[ExtendedMax[T] | Null]
    inline def maxExtended[T](list: js.Array[T], getValue: js.Function1[/* val */ T, Double], startIndex: Unit, endIndex: Double): ExtendedMax[T] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("maxExtended")(list.asInstanceOf[js.Any], getValue.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[ExtendedMax[T] | Null]
    
    inline def merge[T](
      list: js.Array[T],
      cmp: CmpFunc[T],
      shouldMerge: js.Function2[/* a */ T, /* b */ T, Boolean],
      merge: js.Function2[/* toMerge */ T, /* fromMerge */ T, Unit]
    ): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(list.asInstanceOf[js.Any], cmp.asInstanceOf[js.Any], shouldMerge.asInstanceOf[js.Any], merge.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
    inline def merge[T](
      list: js.Array[T],
      cmp: CmpFunc[T],
      shouldMerge: js.Function2[/* a */ T, /* b */ T, Boolean],
      merge: js.Function2[/* toMerge */ T, /* fromMerge */ T, Unit],
      startIndex: Double
    ): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(list.asInstanceOf[js.Any], cmp.asInstanceOf[js.Any], shouldMerge.asInstanceOf[js.Any], merge.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
    inline def merge[T](
      list: js.Array[T],
      cmp: CmpFunc[T],
      shouldMerge: js.Function2[/* a */ T, /* b */ T, Boolean],
      merge: js.Function2[/* toMerge */ T, /* fromMerge */ T, Unit],
      startIndex: Double,
      endIndex: Double
    ): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(list.asInstanceOf[js.Any], cmp.asInstanceOf[js.Any], shouldMerge.asInstanceOf[js.Any], merge.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
    inline def merge[T](
      list: js.Array[T],
      cmp: CmpFunc[T],
      shouldMerge: js.Function2[/* a */ T, /* b */ T, Boolean],
      merge: js.Function2[/* toMerge */ T, /* fromMerge */ T, Unit],
      startIndex: Unit,
      endIndex: Double
    ): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(list.asInstanceOf[js.Any], cmp.asInstanceOf[js.Any], shouldMerge.asInstanceOf[js.Any], merge.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
    
    inline def min[T](list: js.Array[T], getValue: js.Function1[/* val */ T, Double]): T | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("min")(list.asInstanceOf[js.Any], getValue.asInstanceOf[js.Any])).asInstanceOf[T | Null]
    inline def min[T](list: js.Array[T], getValue: js.Function1[/* val */ T, Double], startIndex: Double): T | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("min")(list.asInstanceOf[js.Any], getValue.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any])).asInstanceOf[T | Null]
    inline def min[T](
      list: js.Array[T],
      getValue: js.Function1[/* val */ T, Double],
      startIndex: Double,
      endIndex: Double
    ): T | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("min")(list.asInstanceOf[js.Any], getValue.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[T | Null]
    inline def min[T](list: js.Array[T], getValue: js.Function1[/* val */ T, Double], startIndex: Unit, endIndex: Double): T | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("min")(list.asInstanceOf[js.Any], getValue.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[T | Null]
    
    inline def minByCmp[T](list: js.Array[T], cmp: CmpFunc[T]): T | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("minByCmp")(list.asInstanceOf[js.Any], cmp.asInstanceOf[js.Any])).asInstanceOf[T | Null]
    inline def minByCmp[T](list: js.Array[T], cmp: CmpFunc[T], startIndex: Double): T | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("minByCmp")(list.asInstanceOf[js.Any], cmp.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any])).asInstanceOf[T | Null]
    inline def minByCmp[T](list: js.Array[T], cmp: CmpFunc[T], startIndex: Double, endIndex: Double): T | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("minByCmp")(list.asInstanceOf[js.Any], cmp.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[T | Null]
    inline def minByCmp[T](list: js.Array[T], cmp: CmpFunc[T], startIndex: Unit, endIndex: Double): T | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("minByCmp")(list.asInstanceOf[js.Any], cmp.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[T | Null]
    
    inline def minExtended[T](list: js.Array[T], getValue: js.Function1[/* val */ T, Double]): ExtendedMin[T] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("minExtended")(list.asInstanceOf[js.Any], getValue.asInstanceOf[js.Any])).asInstanceOf[ExtendedMin[T] | Null]
    inline def minExtended[T](list: js.Array[T], getValue: js.Function1[/* val */ T, Double], startIndex: Double): ExtendedMin[T] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("minExtended")(list.asInstanceOf[js.Any], getValue.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any])).asInstanceOf[ExtendedMin[T] | Null]
    inline def minExtended[T](
      list: js.Array[T],
      getValue: js.Function1[/* val */ T, Double],
      startIndex: Double,
      endIndex: Double
    ): ExtendedMin[T] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("minExtended")(list.asInstanceOf[js.Any], getValue.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[ExtendedMin[T] | Null]
    inline def minExtended[T](list: js.Array[T], getValue: js.Function1[/* val */ T, Double], startIndex: Unit, endIndex: Double): ExtendedMin[T] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("minExtended")(list.asInstanceOf[js.Any], getValue.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[ExtendedMin[T] | Null]
    
    inline def minMax[T](list: js.Array[T], getValue: js.Function1[/* val */ T, Double]): MinMax[T] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("minMax")(list.asInstanceOf[js.Any], getValue.asInstanceOf[js.Any])).asInstanceOf[MinMax[T] | Null]
    inline def minMax[T](list: js.Array[T], getValue: js.Function1[/* val */ T, Double], startIndex: Double): MinMax[T] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("minMax")(list.asInstanceOf[js.Any], getValue.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any])).asInstanceOf[MinMax[T] | Null]
    inline def minMax[T](
      list: js.Array[T],
      getValue: js.Function1[/* val */ T, Double],
      startIndex: Double,
      endIndex: Double
    ): MinMax[T] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("minMax")(list.asInstanceOf[js.Any], getValue.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[MinMax[T] | Null]
    inline def minMax[T](list: js.Array[T], getValue: js.Function1[/* val */ T, Double], startIndex: Unit, endIndex: Double): MinMax[T] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("minMax")(list.asInstanceOf[js.Any], getValue.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[MinMax[T] | Null]
    
    inline def minMaxByCmp[T](list: js.Array[T], cmp: CmpFunc[T]): MinMax[T] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("minMaxByCmp")(list.asInstanceOf[js.Any], cmp.asInstanceOf[js.Any])).asInstanceOf[MinMax[T] | Null]
    inline def minMaxByCmp[T](list: js.Array[T], cmp: CmpFunc[T], startIndex: Double): MinMax[T] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("minMaxByCmp")(list.asInstanceOf[js.Any], cmp.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any])).asInstanceOf[MinMax[T] | Null]
    inline def minMaxByCmp[T](list: js.Array[T], cmp: CmpFunc[T], startIndex: Double, endIndex: Double): MinMax[T] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("minMaxByCmp")(list.asInstanceOf[js.Any], cmp.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[MinMax[T] | Null]
    inline def minMaxByCmp[T](list: js.Array[T], cmp: CmpFunc[T], startIndex: Unit, endIndex: Double): MinMax[T] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("minMaxByCmp")(list.asInstanceOf[js.Any], cmp.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[MinMax[T] | Null]
    
    inline def minMaxExtended[T](list: js.Array[T], getValue: js.Function1[/* val */ T, Double]): ExtendedMinMax[T] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("minMaxExtended")(list.asInstanceOf[js.Any], getValue.asInstanceOf[js.Any])).asInstanceOf[ExtendedMinMax[T] | Null]
    inline def minMaxExtended[T](list: js.Array[T], getValue: js.Function1[/* val */ T, Double], startIndex: Double): ExtendedMinMax[T] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("minMaxExtended")(list.asInstanceOf[js.Any], getValue.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any])).asInstanceOf[ExtendedMinMax[T] | Null]
    inline def minMaxExtended[T](
      list: js.Array[T],
      getValue: js.Function1[/* val */ T, Double],
      startIndex: Double,
      endIndex: Double
    ): ExtendedMinMax[T] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("minMaxExtended")(list.asInstanceOf[js.Any], getValue.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[ExtendedMinMax[T] | Null]
    inline def minMaxExtended[T](list: js.Array[T], getValue: js.Function1[/* val */ T, Double], startIndex: Unit, endIndex: Double): ExtendedMinMax[T] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("minMaxExtended")(list.asInstanceOf[js.Any], getValue.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[ExtendedMinMax[T] | Null]
    
    inline def push[T](list: js.Array[T], element: T): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("push")(list.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
    
    inline def reducedMap[T, TRes](list: js.Array[T], callback: js.Function2[/* currVal */ T, /* index */ Double, TRes | Null]): js.Array[TRes] = (^.asInstanceOf[js.Dynamic].applyDynamic("reducedMap")(list.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Array[TRes]]
    inline def reducedMap[T, TRes](
      list: js.Array[T],
      callback: js.Function2[/* currVal */ T, /* index */ Double, TRes | Null],
      startIndex: Double
    ): js.Array[TRes] = (^.asInstanceOf[js.Dynamic].applyDynamic("reducedMap")(list.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[TRes]]
    inline def reducedMap[T, TRes](
      list: js.Array[T],
      callback: js.Function2[/* currVal */ T, /* index */ Double, TRes | Null],
      startIndex: Double,
      endIndex: Double
    ): js.Array[TRes] = (^.asInstanceOf[js.Dynamic].applyDynamic("reducedMap")(list.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[TRes]]
    inline def reducedMap[T, TRes](
      list: js.Array[T],
      callback: js.Function2[/* currVal */ T, /* index */ Double, TRes | Null],
      startIndex: Unit,
      endIndex: Double
    ): js.Array[TRes] = (^.asInstanceOf[js.Dynamic].applyDynamic("reducedMap")(list.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[TRes]]
    
    inline def remove[T](list: js.Array[T], element: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(list.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def removeBy[T](list: js.Array[T], callback: js.Function2[/* currVal */ T, /* index */ Double, Boolean]): T | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBy")(list.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[T | Null]
    
    inline def reverseAnyOf[T](list: js.Array[T], callback: js.Function2[/* currVal */ T, /* index */ Double, Boolean]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("reverseAnyOf")(list.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def reverseAnyOf[T](
      list: js.Array[T],
      callback: js.Function2[/* currVal */ T, /* index */ Double, Boolean],
      startIndex: Double
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("reverseAnyOf")(list.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def reverseAnyOf[T](
      list: js.Array[T],
      callback: js.Function2[/* currVal */ T, /* index */ Double, Boolean],
      startIndex: Double,
      endIndex: Double
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("reverseAnyOf")(list.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def reverseAnyOf[T](
      list: js.Array[T],
      callback: js.Function2[/* currVal */ T, /* index */ Double, Boolean],
      startIndex: Unit,
      endIndex: Double
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("reverseAnyOf")(list.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def reverseElementBy[T](list: js.Array[T], callback: js.Function2[/* currElement */ T, /* index */ Double, Boolean]): T | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("reverseElementBy")(list.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[T | Null]
    inline def reverseElementBy[T](
      list: js.Array[T],
      callback: js.Function2[/* currElement */ T, /* index */ Double, Boolean],
      startIndex: Double
    ): T | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("reverseElementBy")(list.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any])).asInstanceOf[T | Null]
    inline def reverseElementBy[T](
      list: js.Array[T],
      callback: js.Function2[/* currElement */ T, /* index */ Double, Boolean],
      startIndex: Double,
      endIndex: Double
    ): T | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("reverseElementBy")(list.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[T | Null]
    inline def reverseElementBy[T](
      list: js.Array[T],
      callback: js.Function2[/* currElement */ T, /* index */ Double, Boolean],
      startIndex: Unit,
      endIndex: Double
    ): T | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("reverseElementBy")(list.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[T | Null]
    
    inline def reverseForEach[T](list: js.Array[T], callback: js.Function2[/* value */ T, /* index */ Double, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("reverseForEach")(list.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def reverseForEach[T](
      list: js.Array[T],
      callback: js.Function2[/* value */ T, /* index */ Double, Unit],
      startIndex: Double
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("reverseForEach")(list.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def reverseForEach[T](
      list: js.Array[T],
      callback: js.Function2[/* value */ T, /* index */ Double, Unit],
      startIndex: Double,
      endIndex: Double
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("reverseForEach")(list.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def reverseForEach[T](
      list: js.Array[T],
      callback: js.Function2[/* value */ T, /* index */ Double, Unit],
      startIndex: Unit,
      endIndex: Double
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("reverseForEach")(list.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def reverseForEachOnInterval(interval: ConstInterval, callback: js.Function1[/* index */ Double, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("reverseForEachOnInterval")(interval.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def reverseIndexBy[T](list: js.Array[T], callback: js.Function2[/* currElement */ T, /* index */ Double, Boolean]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("reverseIndexBy")(list.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def reverseIndexBy[T](
      list: js.Array[T],
      callback: js.Function2[/* currElement */ T, /* index */ Double, Boolean],
      startIndex: Double
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("reverseIndexBy")(list.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def reverseIndexBy[T](
      list: js.Array[T],
      callback: js.Function2[/* currElement */ T, /* index */ Double, Boolean],
      startIndex: Double,
      endIndex: Double
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("reverseIndexBy")(list.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def reverseIndexBy[T](
      list: js.Array[T],
      callback: js.Function2[/* currElement */ T, /* index */ Double, Boolean],
      startIndex: Unit,
      endIndex: Double
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("reverseIndexBy")(list.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def reverseIndexOf[T](list: js.Array[T], element: T): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("reverseIndexOf")(list.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def reverseIndexOf[T](list: js.Array[T], element: T, startIndex: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("reverseIndexOf")(list.asInstanceOf[js.Any], element.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def reverseIndexOf[T](list: js.Array[T], element: T, startIndex: Double, endIndex: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("reverseIndexOf")(list.asInstanceOf[js.Any], element.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def reverseIndexOf[T](list: js.Array[T], element: T, startIndex: Unit, endIndex: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("reverseIndexOf")(list.asInstanceOf[js.Any], element.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def setLast[T](list: js.Array[T], newVal: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("setLast")(list.asInstanceOf[js.Any], newVal.asInstanceOf[js.Any])).asInstanceOf[T]
    
    inline def shallowCopy[T](list: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("shallowCopy")(list.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
    
    inline def unique[T](list: js.Array[T], cmp: CmpFunc[T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("unique")(list.asInstanceOf[js.Any], cmp.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
    inline def unique[T](list: js.Array[T], cmp: CmpFunc[T], equal: Unit, finalizeObj: js.Function1[/* obj */ T, Unit]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("unique")(list.asInstanceOf[js.Any], cmp.asInstanceOf[js.Any], equal.asInstanceOf[js.Any], finalizeObj.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
    inline def unique[T](list: js.Array[T], cmp: CmpFunc[T], equal: CmpFunc[T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("unique")(list.asInstanceOf[js.Any], cmp.asInstanceOf[js.Any], equal.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
    inline def unique[T](
      list: js.Array[T],
      cmp: CmpFunc[T],
      equal: CmpFunc[T],
      finalizeObj: js.Function1[/* obj */ T, Unit]
    ): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("unique")(list.asInstanceOf[js.Any], cmp.asInstanceOf[js.Any], equal.asInstanceOf[js.Any], finalizeObj.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
    
    inline def uniqueNumber(list: js.Array[Double]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("uniqueNumber")(list.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
    
    inline def unsafeAnyOf[T, TRes](
      list: js.Array[T],
      callback: js.Function2[/* currVal */ T, /* index */ Double, js.UndefOr[TRes | Null]]
    ): TRes | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("unsafeAnyOf")(list.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[TRes | Null]
    inline def unsafeAnyOf[T, TRes](
      list: js.Array[T],
      callback: js.Function2[/* currVal */ T, /* index */ Double, js.UndefOr[TRes | Null]],
      startIndex: Double
    ): TRes | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("unsafeAnyOf")(list.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any])).asInstanceOf[TRes | Null]
    inline def unsafeAnyOf[T, TRes](
      list: js.Array[T],
      callback: js.Function2[/* currVal */ T, /* index */ Double, js.UndefOr[TRes | Null]],
      startIndex: Double,
      endIndex: Double
    ): TRes | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("unsafeAnyOf")(list.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[TRes | Null]
    inline def unsafeAnyOf[T, TRes](
      list: js.Array[T],
      callback: js.Function2[/* currVal */ T, /* index */ Double, js.UndefOr[TRes | Null]],
      startIndex: Unit,
      endIndex: Double
    ): TRes | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("unsafeAnyOf")(list.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[TRes | Null]
    
    inline def unsafeReverseAnyOf[T, TRes](
      list: js.Array[T],
      callback: js.Function2[/* currVal */ T, /* index */ Double, js.UndefOr[TRes | Null]]
    ): TRes | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("unsafeReverseAnyOf")(list.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[TRes | Null]
    inline def unsafeReverseAnyOf[T, TRes](
      list: js.Array[T],
      callback: js.Function2[/* currVal */ T, /* index */ Double, js.UndefOr[TRes | Null]],
      startIndex: Double
    ): TRes | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("unsafeReverseAnyOf")(list.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any])).asInstanceOf[TRes | Null]
    inline def unsafeReverseAnyOf[T, TRes](
      list: js.Array[T],
      callback: js.Function2[/* currVal */ T, /* index */ Double, js.UndefOr[TRes | Null]],
      startIndex: Double,
      endIndex: Double
    ): TRes | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("unsafeReverseAnyOf")(list.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[TRes | Null]
    inline def unsafeReverseAnyOf[T, TRes](
      list: js.Array[T],
      callback: js.Function2[/* currVal */ T, /* index */ Double, js.UndefOr[TRes | Null]],
      startIndex: Unit,
      endIndex: Double
    ): TRes | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("unsafeReverseAnyOf")(list.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[TRes | Null]
  }
}
