package typings.fbjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUnicodeUtilsExtraMod {
  
  @JSImport("fbjs/lib/UnicodeUtilsExtra", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns a double-quoted C string with all non-printable and
    * non-US-ASCII sequences escaped.
    */
  inline def cEscape(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("cEscape")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def formatCodePoint(codePoint: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatCodePoint")(codePoint.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Get a list of formatted (string) Unicode code-points from a String
    */
  inline def getCodePointsFormatted(str: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCodePointsFormatted")(str.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  /**
    * Returns a double-quoted Java or JavaScript string with all
    * non-printable and non-US-ASCII sequences escaped.
    */
  inline def jsEscape(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("jsEscape")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Returns a double-quoted Objective-C string with all non-printable
    * and non-US-ASCII sequences escaped.
    */
  inline def objcEscape(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("objcEscape")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Returns a double-quoted PHP string with all non-printable and
    * non-US-ASCII sequences escaped.
    */
  inline def phpEscape(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("phpEscape")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Returns a double-quoted Python string with all non-printable
    * and non-US-ASCII sequences escaped.
    */
  inline def pyEscape(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("pyEscape")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def zeroPaddedHex(codePoint: Double, len: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("zeroPaddedHex")(codePoint.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[String]
}
