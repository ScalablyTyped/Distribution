package typings.formatjsEcma402Abstract

import typings.formatjsEcma402Abstract.formatjsEcma402AbstractNumbers.`0`
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractNumbers.`10`
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractNumbers.`11`
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractNumbers.`1`
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractNumbers.`2`
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractNumbers.`365`
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractNumbers.`366`
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractNumbers.`3`
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractNumbers.`4`
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractNumbers.`5`
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractNumbers.`6`
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractNumbers.`7`
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractNumbers.`8`
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractNumbers.`9`
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
  
  inline def ArrayCreate(len: Double): js.Array[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("ArrayCreate")(len.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Any]]
  
  inline def DateFromTime(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("DateFromTime")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def Day(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("Day")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def DayFromYear(y: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("DayFromYear")(y.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def DayWithinYear(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("DayWithinYear")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def DaysInYear(y: Double): `365` | `366` = ^.asInstanceOf[js.Dynamic].applyDynamic("DaysInYear")(y.asInstanceOf[js.Any]).asInstanceOf[`365` | `366`]
  
  inline def HasOwnProperty(o: js.Object, prop: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("HasOwnProperty")(o.asInstanceOf[js.Any], prop.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def HourFromTime(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("HourFromTime")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def InLeapYear(t: Double): `0` | `1` = ^.asInstanceOf[js.Dynamic].applyDynamic("InLeapYear")(t.asInstanceOf[js.Any]).asInstanceOf[`0` | `1`]
  
  inline def MinFromTime(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("MinFromTime")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def MonthFromTime(t: Double): `1` | `0` | `4` | `7` | `2` | `3` | `5` | `6` | `8` | `9` | `10` | `11` = ^.asInstanceOf[js.Dynamic].applyDynamic("MonthFromTime")(t.asInstanceOf[js.Any]).asInstanceOf[`1` | `0` | `4` | `7` | `2` | `3` | `5` | `6` | `8` | `9` | `10` | `11`]
  
  inline def SameValue(x: js.Any, y: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("SameValue")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def SecFromTime(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("SecFromTime")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def TimeClip(time: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("TimeClip")(time.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def TimeFromYear(y: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("TimeFromYear")(y.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def ToNumber(`val`: js.Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("ToNumber")(`val`.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def ToObject[T](arg: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("ToObject")(arg.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def ToString(o: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ToString")(o.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def Type(x: js.Any): js.UndefOr[
    Null | Undefined | Object | Number | typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.Boolean | typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.String | Symbol | BigInt
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("Type")(x.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[
    Null | Undefined | Object | Number | typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.Boolean | typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.String | Symbol | BigInt
  ]]
  
  inline def WeekDay(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("WeekDay")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def YearFromTime(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("YearFromTime")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
}
