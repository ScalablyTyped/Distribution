package typings.faker

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Between extends js.Object {
  def between(from: String, to: String): Date = js.native
  def between(from: String, to: Date): Date = js.native
  def between(from: Double, to: String): Date = js.native
  def between(from: Double, to: Date): Date = js.native
  def between(from: Date, to: String): Date = js.native
  def between(from: Date, to: Date): Date = js.native
  def future(): Date = js.native
  def future(years: Double): Date = js.native
  def future(years: Double, refDate: String): Date = js.native
  def future(years: Double, refDate: Date): Date = js.native
  def month(): String = js.native
  def month(options: Anon_Abbr): String = js.native
  def past(): Date = js.native
  def past(years: Double): Date = js.native
  def past(years: Double, refDate: String): Date = js.native
  def past(years: Double, refDate: Date): Date = js.native
  def recent(): Date = js.native
  def recent(days: Double): Date = js.native
  def soon(): Date = js.native
  def soon(days: Double): Date = js.native
  def weekday(): String = js.native
  def weekday(options: Anon_Abbr): String = js.native
}

