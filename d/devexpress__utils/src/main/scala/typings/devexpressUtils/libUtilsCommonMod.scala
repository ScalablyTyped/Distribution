package typings.devexpressUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsCommonMod {
  
  @JSImport("@devexpress/utils/lib/utils/common", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def boolToInt(value: Boolean): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("boolToInt")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def boolToString(value: Boolean): String = ^.asInstanceOf[js.Dynamic].applyDynamic("boolToString")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def isDefined[T](): /* is T */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDefined")().asInstanceOf[/* is T */ Boolean]
  inline def isDefined[T](value: T): /* is T */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDefined")(value.asInstanceOf[js.Any]).asInstanceOf[/* is T */ Boolean]
  
  inline def isEven(num: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEven")(num.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isNonNullString(): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNonNullString")().asInstanceOf[/* is string */ Boolean]
  inline def isNonNullString(str: String): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNonNullString")(str.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
  
  inline def isNumber(obj: Any): /* is number */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumber")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is number */ Boolean]
  
  inline def isOdd(num: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isOdd")(num.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isString(obj: Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
  
  inline def numberToStringBin(num: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("numberToStringBin")(num.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def numberToStringBin(num: Double, minLength: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("numberToStringBin")(num.asInstanceOf[js.Any], minLength.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def numberToStringHex(num: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("numberToStringHex")(num.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def numberToStringHex(num: Double, minLength: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("numberToStringHex")(num.asInstanceOf[js.Any], minLength.asInstanceOf[js.Any])).asInstanceOf[String]
}
