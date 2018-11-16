package typings
package fakerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Number extends js.Object {
  def alphaNumeric(): java.lang.String = js.native
  def alphaNumeric(count: scala.Double): java.lang.String = js.native
  def arrayElement(): java.lang.String = js.native
  def arrayElement[T](array: js.Array[T]): T = js.native
  def boolean(): scala.Boolean = js.native
  def hexaDecimal(): java.lang.String = js.native
  def hexaDecimal(count: scala.Double): java.lang.String = js.native
  def image(): java.lang.String = js.native
  def locale(): java.lang.String = js.native
  def number(): scala.Double = js.native
  def number(max: scala.Double): scala.Double = js.native
  def number(options: Anon_Max): scala.Double = js.native
  def objectElement(): java.lang.String = js.native
  def objectElement(`object`: ScalablyTyped.runtime.StringDictionary[js.Any]): java.lang.String = js.native
  def objectElement[T](`object`: ScalablyTyped.runtime.StringDictionary[T], field: js.Any): T = js.native
  @JSName("objectElement")
  def objectElement_TT[T](): T = js.native
  @JSName("objectElement")
  def objectElement_TT[T](`object`: ScalablyTyped.runtime.StringDictionary[T]): T = js.native
  @JSName("objectElement")
  def objectElement_key(`object`: ScalablyTyped.runtime.StringDictionary[js.Any], field: fakerLib.fakerLibStrings.key): java.lang.String = js.native
  def uuid(): java.lang.String = js.native
  def word(): java.lang.String = js.native
  def word(`type`: java.lang.String): java.lang.String = js.native
  def words(): java.lang.String = js.native
  def words(count: scala.Double): java.lang.String = js.native
}

