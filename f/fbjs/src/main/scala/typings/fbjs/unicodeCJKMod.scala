package typings.fbjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object unicodeCJKMod {
  
  @JSImport("fbjs/lib/UnicodeCJK", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Whether the string includes any CJK Ideograph or Syllable characters.
    */
  inline def hasIdeoOrSyll(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasIdeoOrSyll")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Whether the string includes any CJK Ideograph characters.
    */
  inline def hasIdeograph(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasIdeograph")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Whether the string includes any Katakana or Hiragana characters.
    */
  inline def hasKana(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasKana")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Replace any Hiragana character with the matching Katakana
    */
  inline def hiraganaToKatakana(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hiraganaToKatakana")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Whether the string is exactly a sequence of Kana characters followed by one
    * Latin character.
    */
  inline def isKanaWithTrailingLatin(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("isKanaWithTrailingLatin")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Drops the trailing Latin character from a string that is exactly a sequence
    * of Kana characters followed by one Latin character.
    */
  inline def kanaRemoveTrailingLatin(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("kanaRemoveTrailingLatin")(str.asInstanceOf[js.Any]).asInstanceOf[String]
}
