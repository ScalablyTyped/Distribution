package typings.fbjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUnicodeHangulKoreanMod {
  
  @JSImport("fbjs/lib/UnicodeHangulKorean", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Return Unicode characters as they are, except for Hangul characters, which
    * will be converted to the Conjoining Jamo form.
    */
  inline def toConjoiningJamo(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toConjoiningJamo")(str.asInstanceOf[js.Any]).asInstanceOf[String]
}
