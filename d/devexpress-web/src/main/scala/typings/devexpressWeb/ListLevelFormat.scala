package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ListLevelFormat extends js.Object

/**
  * Lists values that specify the numbering format used for a group of automatically numbered objects, such as pages.
  */
@JSGlobal("ListLevelFormat")
@js.native
object ListLevelFormat extends js.Object {
  /**
    * Specifies that the sequence shall consist of full-width hiragana characters in the traditional a-i-u-e-o order. Currently not supported.
    */
  @js.native
  sealed trait AIUEOFullWidthHiragana extends ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of hiragana characters in the traditional a-i-u-e-o order. Currently not supported.
    */
  @js.native
  sealed trait AIUEOHiragana extends ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of ascending Abjad numerals. Currently not supported.
    */
  @js.native
  sealed trait ArabicAbjad extends ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of characters in the Arabic alphabet. Currently not supported.
    */
  @js.native
  sealed trait ArabicAlpha extends ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of bullet characters.
    */
  @js.native
  sealed trait Bullet extends ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of cardinal text of the current language. Example: one, two, three. The following languages are currently supported: English, French, German, Italian, Russian, Swedish and Turkish.
    */
  @js.native
  sealed trait CardinalText extends ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of characters as defined in the Chicago Manual of Style. Currently not supported.
    */
  @js.native
  sealed trait Chicago extends ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of ascending numbers from the Chinese counting system. Currently not supported.
    */
  @js.native
  sealed trait ChineseCounting extends ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of sequential numbers from the Chinese counting thousand system. Currently not supported.
    */
  @js.native
  sealed trait ChineseCountingThousand extends ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of sequential numbers from the Chinese simplified legal format. Currently not supported.
    */
  @js.native
  sealed trait ChineseLegalSimplified extends ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of sequential numbers from the Korean Chosung format. Currently not supported.
    */
  @js.native
  sealed trait Chosung extends ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of decimal numbering. Example: 1, 2, 3, ... , 9, 10, 11
    */
  @js.native
  sealed trait Decimal extends ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of decimal numbering enclosed in a circle, using the enclosed alphanumeric glyph character. Once the specified sequence reaches 21, the numbers may be replaced with non-enclosed equivalents. Currently not supported.
    */
  @js.native
  sealed trait DecimalEnclosedCircle extends ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of decimal numbering enclosed in a circle, using the enclosed alphanumeric glyph character. Currently not supported.
    */
  @js.native
  sealed trait DecimalEnclosedCircleChinese extends ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of decimal numbering followed by a period, using the enclosed alphanumeric glyph character. Currently not supported.
    */
  @js.native
  sealed trait DecimalEnclosedFullstop extends ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of decimal numbering enclosed in parentheses.
    */
  @js.native
  sealed trait DecimalEnclosedParentheses extends ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of double-byte Arabic numbering. Currently not supported.
    */
  @js.native
  sealed trait DecimalFullWidth extends ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of an alternative set of double-byte Arabic numbering, if one exists in the current font. Currently not supported.
    */
  @js.native
  sealed trait DecimalFullWidth2 extends ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of single-byte Arabic numbering. Example: 1, 2, 3
    */
  @js.native
  sealed trait DecimalHalfWidth extends ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of Arabic numbering with a zero added to numbers one through nine. Example: 01, 02, 03, ..., 09, 10
    */
  @js.native
  sealed trait DecimalZero extends ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of sequential numbers from the Korean Ganada format. Currently not supported.
    */
  @js.native
  sealed trait Ganada extends ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of Hebrew numerals. Currently not supported.
    */
  @js.native
  sealed trait Hebrew1 extends ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of the Hebrew alphabet. Currently not supported.
    */
  @js.native
  sealed trait Hebrew2 extends ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of hexadecimal numbering. Example: 1, 2, 3, ... , 9, A, B
    */
  @js.native
  sealed trait Hex extends ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of Hindi consonants. Currently not supported.
    */
  @js.native
  sealed trait HindiConsonants extends ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of sequential numbers from the Hindi counting system. Currently not supported.
    */
  @js.native
  sealed trait HindiDescriptive extends ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of Hindi numbers. Currently not supported.
    */
  @js.native
  sealed trait HindiNumbers extends ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of Hindi vowels. Currently not supported.
    */
  @js.native
  sealed trait HindiVowels extends ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of sequential numerical ideographs enclosed in a circle, using the appropriate character. Currently not supported.
    */
  @js.native
  sealed trait IdeographDigital extends ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of sequential numerical ideographs enclosed in a circle, using the appropriate character. Currently not supported.
    */
  @js.native
  sealed trait IdeographEnclosedCircle extends ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of traditional sequential numerical legal ideographs. Currently not supported.
    */
  @js.native
  sealed trait IdeographLegalTraditional extends ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of traditional sequential numerical ideographs. Currently not supported.
    */
  @js.native
  sealed trait IdeographTraditional extends ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of traditional sequential numerical ideographs. Currently not supported.
    */
  @js.native
  sealed trait IdeographZodiac extends ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of traditional sequential zodiac ideographs. Currently not supported.
    */
  @js.native
  sealed trait IdeographZodiacTraditional extends ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of the iroha. Currently not supported.
    */
  @js.native
  sealed trait Iroha extends ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of the full-width forms of the iroha. Currently not supported.
    */
  @js.native
  sealed trait IrohaFullWidth extends ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of the full-width forms of the iroha. Currently not supported.
    */
  @js.native
  sealed trait JapaneseCounting extends ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of sequential numbers from the Japanese digital ten thousand counting system. Currently not supported.
    */
  @js.native
  sealed trait JapaneseDigitalTenThousand extends ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of sequential numbers from the Japanese legal counting system. Currently not supported.
    */
  @js.native
  sealed trait JapaneseLegal extends ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of sequential numbers from the Korean counting system. Currently not supported.
    */
  @js.native
  sealed trait KoreanCounting extends ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of sequential numbers from the Korean digital counting system. Currently not supported.
    */
  @js.native
  sealed trait KoreanDigital extends ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of sequential numbers from the Korean digital counting system. Currently not supported.
    */
  @js.native
  sealed trait KoreanDigital2 extends ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of sequential numbers from the Korean legal numbering system. Currently not supported.
    */
  @js.native
  sealed trait KoreanLegal extends ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of the letters of the Latin alphabet in lower case. Example: a, b, c
    */
  @js.native
  sealed trait LowerLetter extends ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of lowercase roman numerals. Example: i, ii, iii
    */
  @js.native
  sealed trait LowerRoman extends ListLevelFormat
  
  /**
    * Specifies the default numbering sequence (specifies that the sequence consists of decimal numbering).
    */
  @js.native
  sealed trait None extends ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of Arabic numbering surrounded by dash characters. Example: - 1 -, - 2 -, - 3 -
    */
  @js.native
  sealed trait NumberInDash extends ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of ordinals of the current language. Example: 1st, 2nd, 3rd. The following languages are currently supported: English, French, German, Italian, Russian, Swedish and Turkish.
    */
  @js.native
  sealed trait Ordinal extends ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of ordinal text of the current language. Example: first, second, third. The following languages are currently supported: English, French, German, Italian, Russian, Swedish and Turkish.
    */
  @js.native
  sealed trait OrdinalText extends ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of the letters of the Russian alphabet in lower case. Example: &#x430;, &#x431;, &#x432;
    */
  @js.native
  sealed trait RussianLower extends ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of the letters of the Russian alphabet in upper case. Example: &#x410;, &#x411;, &#x412;
    */
  @js.native
  sealed trait RussianUpper extends ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of sequential numbers from the Taiwanese counting system. Currently not supported.
    */
  @js.native
  sealed trait TaiwaneseCounting extends ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of sequential numbers from the Taiwanese counting thousand system. Currently not supported.
    */
  @js.native
  sealed trait TaiwaneseCountingThousand extends ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of sequential numbers from the Taiwanese digital counting system. Currently not supported.
    */
  @js.native
  sealed trait TaiwaneseDigital extends ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of sequential numbers from the Thai counting system. Currently not supported.
    */
  @js.native
  sealed trait ThaiDescriptive extends ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of Thai letters. Currently not supported.
    */
  @js.native
  sealed trait ThaiLetters extends ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of Thai numerals. Currently not supported.
    */
  @js.native
  sealed trait ThaiNumbers extends ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of the letters of the Latin alphabet in upper case. Example: A, B, C
    */
  @js.native
  sealed trait UpperLetter extends ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of uppercase roman numerals. Example: I, II, III
    */
  @js.native
  sealed trait UpperRoman extends ListLevelFormat
  
  /**
    * Specifies that the sequence shall consist of Vietnamese numerals. Currently not supported.
    */
  @js.native
  sealed trait VietnameseDescriptive extends ListLevelFormat
  
}

