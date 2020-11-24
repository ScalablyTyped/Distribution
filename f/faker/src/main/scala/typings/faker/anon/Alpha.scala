package typings.faker.anon

import org.scalablytyped.runtime.StringDictionary
import typings.faker.fakerStrings.key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Alpha extends js.Object {
  
  def alpha(): String = js.native
  def alpha(options: Count): String = js.native
  
  def alphaNumeric(): String = js.native
  def alphaNumeric(count: Double): String = js.native
  
  def arrayElement(): String = js.native
  def arrayElement[T](array: js.Array[T]): T = js.native
  
  def arrayElements(): js.Array[String] = js.native
  def arrayElements(count: Double): js.Array[String] = js.native
  def arrayElements[T](array: js.Array[T]): js.Array[T] = js.native
  def arrayElements[T](array: js.Array[T], count: Double): js.Array[T] = js.native
  
  def boolean(): Boolean = js.native
  
  def float(): Double = js.native
  def float(max: Double): Double = js.native
  def float(options: Max): Double = js.native
  
  def hexaDecimal(): String = js.native
  def hexaDecimal(count: Double): String = js.native
  
  def image(): String = js.native
  
  def locale(): String = js.native
  
  def number(): Double = js.native
  def number(max: Double): Double = js.native
  def number(options: Max): Double = js.native
  
  def objectElement(): String = js.native
  def objectElement(`object`: StringDictionary[js.Any]): String = js.native
  def objectElement[T](`object`: js.UndefOr[scala.Nothing], field: js.Any): T = js.native
  def objectElement[T](`object`: StringDictionary[T], field: js.Any): T = js.native
  @JSName("objectElement")
  def objectElement_T_T[T](): T = js.native
  @JSName("objectElement")
  def objectElement_T_T[T](`object`: StringDictionary[T]): T = js.native
  @JSName("objectElement")
  def objectElement_key(`object`: js.UndefOr[scala.Nothing], field: key): String = js.native
  @JSName("objectElement")
  def objectElement_key(`object`: StringDictionary[js.Any], field: key): String = js.native
  
  def uuid(): String = js.native
  
  def word(): String = js.native
  def word(`type`: String): String = js.native
  
  def words(): String = js.native
  def words(count: Double): String = js.native
}
