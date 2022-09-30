package typings.formatjsEcma402Abstract

import typings.formatjsEcma402Abstract.anon.BoundTargetFunction
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractInts.`0`
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractInts.`10`
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractInts.`11`
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractInts.`1`
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractInts.`2`
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractInts.`365`
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractInts.`366`
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractInts.`3`
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractInts.`4`
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractInts.`5`
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractInts.`6`
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractInts.`7`
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractInts.`8`
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractInts.`9`
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.BigInt
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.Null
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.Number
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.Object
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.Symbol
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.Undefined
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object `262Mod` {
  
  @JSImport("@formatjs/ecma402-abstract/lib/262", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ArrayCreate(len: Double): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("ArrayCreate")(len.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  
  inline def DateFromTime(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("DateFromTime")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def Day(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("Day")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def DayFromYear(y: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("DayFromYear")(y.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def DayWithinYear(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("DayWithinYear")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def DaysInYear(y: Double): `365` | `366` = ^.asInstanceOf[js.Dynamic].applyDynamic("DaysInYear")(y.asInstanceOf[js.Any]).asInstanceOf[`365` | `366`]
  
  inline def HasOwnProperty(o: js.Object, prop: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("HasOwnProperty")(o.asInstanceOf[js.Any], prop.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def HourFromTime(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("HourFromTime")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def InLeapYear(t: Double): `0` | `1` = ^.asInstanceOf[js.Dynamic].applyDynamic("InLeapYear")(t.asInstanceOf[js.Any]).asInstanceOf[`0` | `1`]
  
  inline def MinFromTime(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("MinFromTime")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def MonthFromTime(t: Double): `0` | `1` | `4` | `7` | `2` | `3` | `5` | `6` | `8` | `9` | `10` | `11` = ^.asInstanceOf[js.Dynamic].applyDynamic("MonthFromTime")(t.asInstanceOf[js.Any]).asInstanceOf[`0` | `1` | `4` | `7` | `2` | `3` | `5` | `6` | `8` | `9` | `10` | `11`]
  
  inline def OrdinaryHasInstance(C: js.Object, O: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("OrdinaryHasInstance")(C.asInstanceOf[js.Any], O.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def OrdinaryHasInstance(C: js.Object, O: Any, internalSlots: BoundTargetFunction): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("OrdinaryHasInstance")(C.asInstanceOf[js.Any], O.asInstanceOf[js.Any], internalSlots.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def SameValue(x: Any, y: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("SameValue")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def SecFromTime(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("SecFromTime")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def TimeClip(time: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("TimeClip")(time.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def TimeFromYear(y: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("TimeFromYear")(y.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def ToNumber(`val`: Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("ToNumber")(`val`.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def ToObject[T](arg: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("ToObject")(arg.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def ToString(o: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ToString")(o.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def Type(x: Any): js.UndefOr[
    Null | Undefined | Object | Number | typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.Boolean | typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.String | Symbol | BigInt
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("Type")(x.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[
    Null | Undefined | Object | Number | typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.Boolean | typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.String | Symbol | BigInt
  ]]
  
  inline def WeekDay(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("WeekDay")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def YearFromTime(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("YearFromTime")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def msFromTime(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("msFromTime")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
}
