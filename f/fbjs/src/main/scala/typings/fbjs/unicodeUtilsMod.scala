package typings.fbjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object unicodeUtilsMod {
  
  @JSImport("fbjs/lib/UnicodeUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Get a list of Unicode code-points from a String
    */
  inline def getCodePoints(str: String): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCodePoints")(str.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  /**
    * Return the length of the original Unicode character at given position in the
    * String by looking into the UTF-16 code unit; that is equal to 1 for any
    * non-surrogate characters in BMP ([U+0000..U+D7FF] and [U+E000, U+FFFF]); and
    * returns 2 for the hi/low surrogates ([U+D800..U+DFFF]), which are in fact
    * representing non-BMP characters ([U+10000..U+10FFFF]).
    *
    * Examples:
    * - '\\u0020': 1
    * - '\\u3020': 1
    * - '\\uD835': 2
    * - '\\uD835\\uDDEF': 2
    * - '\\uDDEF': 2
    */
  inline def getUTF16Length(str: String, pos: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getUTF16Length")(str.asInstanceOf[js.Any], pos.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def hasSurrogateUnit(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasSurrogateUnit")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isCodeUnitInSurrogateRange(codeUnit: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCodeUnitInSurrogateRange")(codeUnit.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Returns whether the two characters starting at `index` form a surrogate pair.
    * For example, given the string s = "\\uD83D\\uDE0A", (s, 0) returns true and
    * (s, 1) returns false.
    */
  inline def isSurrogatePair(str: String, index: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSurrogatePair")(str.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Fully Unicode-enabled replacement for String#length
    */
  inline def strlen(str: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("strlen")(str.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Fully Unicode-enabled replacement for String#substr()
    */
  inline def substr(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("substr")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def substr(str: String, start: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("substr")(str.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def substr(str: String, start: Double, length: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("substr")(str.asInstanceOf[js.Any], start.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def substr(str: String, start: Unit, length: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("substr")(str.asInstanceOf[js.Any], start.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * Fully Unicode-enabled replacement for String#substring()
    */
  inline def substring(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("substring")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def substring(str: String, start: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("substring")(str.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def substring(str: String, start: Double, end: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("substring")(str.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def substring(str: String, start: Unit, end: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("substring")(str.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[String]
}
