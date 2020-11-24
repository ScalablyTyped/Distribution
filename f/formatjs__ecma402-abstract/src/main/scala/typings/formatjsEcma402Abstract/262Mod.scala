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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@formatjs/ecma402-abstract/lib/262", JSImport.Namespace)
@js.native
object `262Mod` extends js.Object {
  
  def ArrayCreate(len: Double): js.Array[_] = js.native
  
  def DateFromTime(t: Double): Double = js.native
  
  def Day(t: Double): Double = js.native
  
  def DayFromYear(y: Double): Double = js.native
  
  def DayWithinYear(t: Double): Double = js.native
  
  def DaysInYear(y: Double): `365` | `366` = js.native
  
  def HasOwnProperty(o: js.Object, prop: String): Boolean = js.native
  
  def HourFromTime(t: Double): Double = js.native
  
  def InLeapYear(t: Double): `0` | `1` = js.native
  
  def MinFromTime(t: Double): Double = js.native
  
  def MonthFromTime(t: Double): `1` | `0` | `4` | `7` | `2` | `3` | `5` | `6` | `8` | `9` | `10` | `11` = js.native
  
  def SameValue(x: js.Any, y: js.Any): Boolean = js.native
  
  def SecFromTime(t: Double): Double = js.native
  
  def TimeClip(time: Double): Double = js.native
  
  def TimeFromYear(y: Double): Double = js.native
  
  def ToNumber(`val`: js.Any): Double = js.native
  
  def ToObject[T](arg: T): T = js.native
  
  def ToString(o: js.Any): String = js.native
  
  def Type(x: js.Any): js.UndefOr[
    Null | Undefined | Object | Number | typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.Boolean | typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.String | Symbol | BigInt
  ] = js.native
  
  def WeekDay(t: Double): Double = js.native
  
  def YearFromTime(t: Double): Double = js.native
}
