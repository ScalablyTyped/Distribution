package typings.devexpressUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@devexpress/utils/lib/utils/common", JSImport.Namespace)
@js.native
object utilsCommonMod extends js.Object {
  
  def boolToInt(value: Boolean): Double = js.native
  
  def boolToString(value: Boolean): String = js.native
  
  def isDefined[T](): /* is T */ Boolean = js.native
  def isDefined[T](value: T): /* is T */ Boolean = js.native
  
  def isEven(num: Double): Boolean = js.native
  
  def isNonNullString(): /* is string */ Boolean = js.native
  def isNonNullString(str: String): /* is string */ Boolean = js.native
  
  def isNumber(obj: js.Any): /* is number */ Boolean = js.native
  
  def isOdd(num: Double): Boolean = js.native
  
  def isString(obj: js.Any): /* is string */ Boolean = js.native
  
  def numberToStringBin(num: Double): String = js.native
  def numberToStringBin(num: Double, minLength: Double): String = js.native
  
  def numberToStringHex(num: Double): String = js.native
  def numberToStringHex(num: Double, minLength: Double): String = js.native
}
