package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ListLevelFormat extends StObject
/**
  * Lists values that specify the numbering format used for a group of automatically numbered objects, such as pages.
  */
@JSGlobal("ListLevelFormat")
@js.native
object ListLevelFormat extends StObject {
  
  /**
    * Specifies that the sequence shall consist of full-width hiragana characters in the traditional a-i-u-e-o order. Currently not supported.
    */
  @js.native
  sealed trait AIUEOFullWidthHiragana
    extends StObject
       with ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of hiragana characters in the traditional a-i-u-e-o order. Currently not supported.
    */
  @js.native
  sealed trait AIUEOHiragana
    extends StObject
       with ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of ascending Abjad numerals. Currently not supported.
    */
  @js.native
  sealed trait ArabicAbjad
    extends StObject
       with ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of characters in the Arabic alphabet. Currently not supported.
    */
  @js.native
  sealed trait ArabicAlpha
    extends StObject
       with ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of bullet characters.
    */
  @js.native
  sealed trait Bullet
    extends StObject
       with ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of cardinal text of the current language. Example: one, two, three. The following languages are currently supported: English, French, German, Italian, Russian, Swedish and Turkish.
    */
  @js.native
  sealed trait CardinalText
    extends StObject
       with ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of characters as defined in the Chicago Manual of Style. Currently not supported.
    */
  @js.native
  sealed trait Chicago
    extends StObject
       with ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of ascending numbers from the Chinese counting system. Currently not supported.
    */
  @js.native
  sealed trait ChineseCounting
    extends StObject
       with ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of sequential numbers from the Chinese counting thousand system. Currently not supported.
    */
  @js.native
  sealed trait ChineseCountingThousand
    extends StObject
       with ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of sequential numbers from the Chinese simplified legal format. Currently not supported.
    */
  @js.native
  sealed trait ChineseLegalSimplified
    extends StObject
       with ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of sequential numbers from the Korean Chosung format. Currently not supported.
    */
  @js.native
  sealed trait Chosung
    extends StObject
       with ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of decimal numbering. Example: 1, 2, 3, ... , 9, 10, 11
    */
  @js.native
  sealed trait Decimal
    extends StObject
       with ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of decimal numbering enclosed in a circle, using the enclosed alphanumeric glyph character. Once the specified sequence reaches 21, the numbers may be replaced with non-enclosed equivalents. Currently not supported.
    */
  @js.native
  sealed trait DecimalEnclosedCircle
    extends StObject
       with ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of decimal numbering enclosed in a circle, using the enclosed alphanumeric glyph character. Currently not supported.
    */
  @js.native
  sealed trait DecimalEnclosedCircleChinese
    extends StObject
       with ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of decimal numbering followed by a period, using the enclosed alphanumeric glyph character. Currently not supported.
    */
  @js.native
  sealed trait DecimalEnclosedFullstop
    extends StObject
       with ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of decimal numbering enclosed in parentheses.
    */
  @js.native
  sealed trait DecimalEnclosedParentheses
    extends StObject
       with ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of double-byte Arabic numbering. Currently not supported.
    */
  @js.native
  sealed trait DecimalFullWidth
    extends StObject
       with ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of an alternative set of double-byte Arabic numbering, if one exists in the current font. Currently not supported.
    */
  @js.native
  sealed trait DecimalFullWidth2
    extends StObject
       with ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of single-byte Arabic numbering. Example: 1, 2, 3
    */
  @js.native
  sealed trait DecimalHalfWidth
    extends StObject
       with ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of Arabic numbering with a zero added to numbers one through nine. Example: 01, 02, 03, ..., 09, 10
    */
  @js.native
  sealed trait DecimalZero
    extends StObject
       with ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of sequential numbers from the Korean Ganada format. Currently not supported.
    */
  @js.native
  sealed trait Ganada
    extends StObject
       with ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of Hebrew numerals. Currently not supported.
    */
  @js.native
  sealed trait Hebrew1
    extends StObject
       with ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of the Hebrew alphabet. Currently not supported.
    */
  @js.native
  sealed trait Hebrew2
    extends StObject
       with ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of hexadecimal numbering. Example: 1, 2, 3, ... , 9, A, B
    */
  @js.native
  sealed trait Hex
    extends StObject
       with ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of Hindi consonants. Currently not supported.
    */
  @js.native
  sealed trait HindiConsonants
    extends StObject
       with ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of sequential numbers from the Hindi counting system. Currently not supported.
    */
  @js.native
  sealed trait HindiDescriptive
    extends StObject
       with ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of Hindi numbers. Currently not supported.
    */
  @js.native
  sealed trait HindiNumbers
    extends StObject
       with ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of Hindi vowels. Currently not supported.
    */
  @js.native
  sealed trait HindiVowels
    extends StObject
       with ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of sequential numerical ideographs enclosed in a circle, using the appropriate character. Currently not supported.
    */
  @js.native
  sealed trait IdeographDigital
    extends StObject
       with ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of sequential numerical ideographs enclosed in a circle, using the appropriate character. Currently not supported.
    */
  @js.native
  sealed trait IdeographEnclosedCircle
    extends StObject
       with ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of traditional sequential numerical legal ideographs. Currently not supported.
    */
  @js.native
  sealed trait IdeographLegalTraditional
    extends StObject
       with ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of traditional sequential numerical ideographs. Currently not supported.
    */
  @js.native
  sealed trait IdeographTraditional
    extends StObject
       with ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of traditional sequential numerical ideographs. Currently not supported.
    */
  @js.native
  sealed trait IdeographZodiac
    extends StObject
       with ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of traditional sequential zodiac ideographs. Currently not supported.
    */
  @js.native
  sealed trait IdeographZodiacTraditional
    extends StObject
       with ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of the iroha. Currently not supported.
    */
  @js.native
  sealed trait Iroha
    extends StObject
       with ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of the full-width forms of the iroha. Currently not supported.
    */
  @js.native
  sealed trait IrohaFullWidth
    extends StObject
       with ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of the full-width forms of the iroha. Currently not supported.
    */
  @js.native
  sealed trait JapaneseCounting
    extends StObject
       with ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of sequential numbers from the Japanese digital ten thousand counting system. Currently not supported.
    */
  @js.native
  sealed trait JapaneseDigitalTenThousand
    extends StObject
       with ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of sequential numbers from the Japanese legal counting system. Currently not supported.
    */
  @js.native
  sealed trait JapaneseLegal
    extends StObject
       with ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of sequential numbers from the Korean counting system. Currently not supported.
    */
  @js.native
  sealed trait KoreanCounting
    extends StObject
       with ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of sequential numbers from the Korean digital counting system. Currently not supported.
    */
  @js.native
  sealed trait KoreanDigital
    extends StObject
       with ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of sequential numbers from the Korean digital counting system. Currently not supported.
    */
  @js.native
  sealed trait KoreanDigital2
    extends StObject
       with ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of sequential numbers from the Korean legal numbering system. Currently not supported.
    */
  @js.native
  sealed trait KoreanLegal
    extends StObject
       with ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of the letters of the Latin alphabet in lower case. Example: a, b, c
    */
  @js.native
  sealed trait LowerLetter
    extends StObject
       with ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of lowercase roman numerals. Example: i, ii, iii
    */
  @js.native
  sealed trait LowerRoman
    extends StObject
       with ListLevelFormat
  
  /**
    * Specifies the default numbering sequence (specifies that the sequence consists of decimal numbering).
    */
  @js.native
  sealed trait None
    extends StObject
       with ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of Arabic numbering surrounded by dash characters. Example: - 1 -, - 2 -, - 3 -
    */
  @js.native
  sealed trait NumberInDash
    extends StObject
       with ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of ordinals of the current language. Example: 1st, 2nd, 3rd. The following languages are currently supported: English, French, German, Italian, Russian, Swedish and Turkish.
    */
  @js.native
  sealed trait Ordinal
    extends StObject
       with ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of ordinal text of the current language. Example: first, second, third. The following languages are currently supported: English, French, German, Italian, Russian, Swedish and Turkish.
    */
  @js.native
  sealed trait OrdinalText
    extends StObject
       with ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of the letters of the Russian alphabet in lower case. Example: &#x430;, &#x431;, &#x432;
    */
  @js.native
  sealed trait RussianLower
    extends StObject
       with ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of the letters of the Russian alphabet in upper case. Example: &#x410;, &#x411;, &#x412;
    */
  @js.native
  sealed trait RussianUpper
    extends StObject
       with ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of sequential numbers from the Taiwanese counting system. Currently not supported.
    */
  @js.native
  sealed trait TaiwaneseCounting
    extends StObject
       with ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of sequential numbers from the Taiwanese counting thousand system. Currently not supported.
    */
  @js.native
  sealed trait TaiwaneseCountingThousand
    extends StObject
       with ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of sequential numbers from the Taiwanese digital counting system. Currently not supported.
    */
  @js.native
  sealed trait TaiwaneseDigital
    extends StObject
       with ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of sequential numbers from the Thai counting system. Currently not supported.
    */
  @js.native
  sealed trait ThaiDescriptive
    extends StObject
       with ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of Thai letters. Currently not supported.
    */
  @js.native
  sealed trait ThaiLetters
    extends StObject
       with ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of Thai numerals. Currently not supported.
    */
  @js.native
  sealed trait ThaiNumbers
    extends StObject
       with ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of the letters of the Latin alphabet in upper case. Example: A, B, C
    */
  @js.native
  sealed trait UpperLetter
    extends StObject
       with ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of uppercase roman numerals. Example: I, II, III
    */
  @js.native
  sealed trait UpperRoman
    extends StObject
       with ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of Vietnamese numerals. Currently not supported.
    */
  @js.native
  sealed trait VietnameseDescriptive
    extends StObject
       with ListLevelFormat
}
