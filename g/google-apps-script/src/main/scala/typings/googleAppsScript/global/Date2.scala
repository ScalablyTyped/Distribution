package typings.googleAppsScript.global

import typings.googleAppsScript.GoogleAppsScript.Base.Date
import typings.googleAppsScript.GoogleAppsScript.Base.DateConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("Date2")
@js.native
class Date2 ()
  extends StObject
     with Date {
  def this(value: String) = this()
  def this(value: Double) = this()
  def this(year: Double, month: Double) = this()
  def this(year: Double, month: Double, date: Double) = this()
  def this(year: Double, month: Double, date: Double, hours: Double) = this()
  def this(year: Double, month: Double, date: Unit, hours: Double) = this()
  def this(year: Double, month: Double, date: Double, hours: Double, minutes: Double) = this()
  def this(year: Double, month: Double, date: Double, hours: Unit, minutes: Double) = this()
  def this(year: Double, month: Double, date: Unit, hours: Double, minutes: Double) = this()
  def this(year: Double, month: Double, date: Unit, hours: Unit, minutes: Double) = this()
  def this(year: Double, month: Double, date: Double, hours: Double, minutes: Double, seconds: Double) = this()
  def this(year: Double, month: Double, date: Double, hours: Double, minutes: Unit, seconds: Double) = this()
  def this(year: Double, month: Double, date: Double, hours: Unit, minutes: Double, seconds: Double) = this()
  def this(year: Double, month: Double, date: Double, hours: Unit, minutes: Unit, seconds: Double) = this()
  def this(year: Double, month: Double, date: Unit, hours: Double, minutes: Double, seconds: Double) = this()
  def this(year: Double, month: Double, date: Unit, hours: Double, minutes: Unit, seconds: Double) = this()
  def this(year: Double, month: Double, date: Unit, hours: Unit, minutes: Double, seconds: Double) = this()
  def this(year: Double, month: Double, date: Unit, hours: Unit, minutes: Unit, seconds: Double) = this()
  def this(
    year: Double,
    month: Double,
    date: Double,
    hours: Double,
    minutes: Double,
    seconds: Double,
    ms: Double
  ) = this()
  def this(
    year: Double,
    month: Double,
    date: Double,
    hours: Double,
    minutes: Double,
    seconds: Unit,
    ms: Double
  ) = this()
  def this(
    year: Double,
    month: Double,
    date: Double,
    hours: Double,
    minutes: Unit,
    seconds: Double,
    ms: Double
  ) = this()
  def this(year: Double, month: Double, date: Double, hours: Double, minutes: Unit, seconds: Unit, ms: Double) = this()
  def this(
    year: Double,
    month: Double,
    date: Double,
    hours: Unit,
    minutes: Double,
    seconds: Double,
    ms: Double
  ) = this()
  def this(year: Double, month: Double, date: Double, hours: Unit, minutes: Double, seconds: Unit, ms: Double) = this()
  def this(year: Double, month: Double, date: Double, hours: Unit, minutes: Unit, seconds: Double, ms: Double) = this()
  def this(year: Double, month: Double, date: Double, hours: Unit, minutes: Unit, seconds: Unit, ms: Double) = this()
  def this(
    year: Double,
    month: Double,
    date: Unit,
    hours: Double,
    minutes: Double,
    seconds: Double,
    ms: Double
  ) = this()
  def this(year: Double, month: Double, date: Unit, hours: Double, minutes: Double, seconds: Unit, ms: Double) = this()
  def this(year: Double, month: Double, date: Unit, hours: Double, minutes: Unit, seconds: Double, ms: Double) = this()
  def this(year: Double, month: Double, date: Unit, hours: Double, minutes: Unit, seconds: Unit, ms: Double) = this()
  def this(year: Double, month: Double, date: Unit, hours: Unit, minutes: Double, seconds: Double, ms: Double) = this()
  def this(year: Double, month: Double, date: Unit, hours: Unit, minutes: Double, seconds: Unit, ms: Double) = this()
  def this(year: Double, month: Double, date: Unit, hours: Unit, minutes: Unit, seconds: Double, ms: Double) = this()
  def this(year: Double, month: Double, date: Unit, hours: Unit, minutes: Unit, seconds: Unit, ms: Double) = this()
}
object Date2 {
  
  // The name `Date` conflicts with lib.es5.d.ts.
  // - We cannot include lib.es5.d.ts with Apps Script though because Apps Script is ES3
  //   and doesn't include all ES5+ features.
  //   Thus developers using the Date class must alias the type in their own TS projects.
  // - We cannot use lib.es3.d.ts because it is no longer by dtslint.
  @scala.inline
  def apply: DateConstructor = js.Dynamic.global.selectDynamic("Date2").asInstanceOf[DateConstructor]
}
