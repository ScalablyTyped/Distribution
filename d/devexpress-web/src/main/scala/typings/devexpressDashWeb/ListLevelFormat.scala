package typings.devexpressDashWeb

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
  
  /* 2 */ val AIUEOFullWidthHiragana: typings.devexpressDashWeb.ListLevelFormat.AIUEOFullWidthHiragana with Double = js.native
  /* 1 */ val AIUEOHiragana: typings.devexpressDashWeb.ListLevelFormat.AIUEOHiragana with Double = js.native
  /* 3 */ val ArabicAbjad: typings.devexpressDashWeb.ListLevelFormat.ArabicAbjad with Double = js.native
  /* 4 */ val ArabicAlpha: typings.devexpressDashWeb.ListLevelFormat.ArabicAlpha with Double = js.native
  /* 5 */ val Bullet: typings.devexpressDashWeb.ListLevelFormat.Bullet with Double = js.native
  /* 6 */ val CardinalText: typings.devexpressDashWeb.ListLevelFormat.CardinalText with Double = js.native
  /* 7 */ val Chicago: typings.devexpressDashWeb.ListLevelFormat.Chicago with Double = js.native
  /* 8 */ val ChineseCounting: typings.devexpressDashWeb.ListLevelFormat.ChineseCounting with Double = js.native
  /* 9 */ val ChineseCountingThousand: typings.devexpressDashWeb.ListLevelFormat.ChineseCountingThousand with Double = js.native
  /* 10 */ val ChineseLegalSimplified: typings.devexpressDashWeb.ListLevelFormat.ChineseLegalSimplified with Double = js.native
  /* 11 */ val Chosung: typings.devexpressDashWeb.ListLevelFormat.Chosung with Double = js.native
  /* 0 */ val Decimal: typings.devexpressDashWeb.ListLevelFormat.Decimal with Double = js.native
  /* 12 */ val DecimalEnclosedCircle: typings.devexpressDashWeb.ListLevelFormat.DecimalEnclosedCircle with Double = js.native
  /* 13 */ val DecimalEnclosedCircleChinese: typings.devexpressDashWeb.ListLevelFormat.DecimalEnclosedCircleChinese with Double = js.native
  /* 14 */ val DecimalEnclosedFullstop: typings.devexpressDashWeb.ListLevelFormat.DecimalEnclosedFullstop with Double = js.native
  /* 15 */ val DecimalEnclosedParentheses: typings.devexpressDashWeb.ListLevelFormat.DecimalEnclosedParentheses with Double = js.native
  /* 16 */ val DecimalFullWidth: typings.devexpressDashWeb.ListLevelFormat.DecimalFullWidth with Double = js.native
  /* 17 */ val DecimalFullWidth2: typings.devexpressDashWeb.ListLevelFormat.DecimalFullWidth2 with Double = js.native
  /* 18 */ val DecimalHalfWidth: typings.devexpressDashWeb.ListLevelFormat.DecimalHalfWidth with Double = js.native
  /* 19 */ val DecimalZero: typings.devexpressDashWeb.ListLevelFormat.DecimalZero with Double = js.native
  /* 20 */ val Ganada: typings.devexpressDashWeb.ListLevelFormat.Ganada with Double = js.native
  /* 21 */ val Hebrew1: typings.devexpressDashWeb.ListLevelFormat.Hebrew1 with Double = js.native
  /* 22 */ val Hebrew2: typings.devexpressDashWeb.ListLevelFormat.Hebrew2 with Double = js.native
  /* 23 */ val Hex: typings.devexpressDashWeb.ListLevelFormat.Hex with Double = js.native
  /* 24 */ val HindiConsonants: typings.devexpressDashWeb.ListLevelFormat.HindiConsonants with Double = js.native
  /* 25 */ val HindiDescriptive: typings.devexpressDashWeb.ListLevelFormat.HindiDescriptive with Double = js.native
  /* 26 */ val HindiNumbers: typings.devexpressDashWeb.ListLevelFormat.HindiNumbers with Double = js.native
  /* 27 */ val HindiVowels: typings.devexpressDashWeb.ListLevelFormat.HindiVowels with Double = js.native
  /* 28 */ val IdeographDigital: typings.devexpressDashWeb.ListLevelFormat.IdeographDigital with Double = js.native
  /* 29 */ val IdeographEnclosedCircle: typings.devexpressDashWeb.ListLevelFormat.IdeographEnclosedCircle with Double = js.native
  /* 30 */ val IdeographLegalTraditional: typings.devexpressDashWeb.ListLevelFormat.IdeographLegalTraditional with Double = js.native
  /* 31 */ val IdeographTraditional: typings.devexpressDashWeb.ListLevelFormat.IdeographTraditional with Double = js.native
  /* 32 */ val IdeographZodiac: typings.devexpressDashWeb.ListLevelFormat.IdeographZodiac with Double = js.native
  /* 33 */ val IdeographZodiacTraditional: typings.devexpressDashWeb.ListLevelFormat.IdeographZodiacTraditional with Double = js.native
  /* 34 */ val Iroha: typings.devexpressDashWeb.ListLevelFormat.Iroha with Double = js.native
  /* 35 */ val IrohaFullWidth: typings.devexpressDashWeb.ListLevelFormat.IrohaFullWidth with Double = js.native
  /* 36 */ val JapaneseCounting: typings.devexpressDashWeb.ListLevelFormat.JapaneseCounting with Double = js.native
  /* 37 */ val JapaneseDigitalTenThousand: typings.devexpressDashWeb.ListLevelFormat.JapaneseDigitalTenThousand with Double = js.native
  /* 38 */ val JapaneseLegal: typings.devexpressDashWeb.ListLevelFormat.JapaneseLegal with Double = js.native
  /* 39 */ val KoreanCounting: typings.devexpressDashWeb.ListLevelFormat.KoreanCounting with Double = js.native
  /* 40 */ val KoreanDigital: typings.devexpressDashWeb.ListLevelFormat.KoreanDigital with Double = js.native
  /* 41 */ val KoreanDigital2: typings.devexpressDashWeb.ListLevelFormat.KoreanDigital2 with Double = js.native
  /* 42 */ val KoreanLegal: typings.devexpressDashWeb.ListLevelFormat.KoreanLegal with Double = js.native
  /* 43 */ val LowerLetter: typings.devexpressDashWeb.ListLevelFormat.LowerLetter with Double = js.native
  /* 44 */ val LowerRoman: typings.devexpressDashWeb.ListLevelFormat.LowerRoman with Double = js.native
  /* 45 */ val None: typings.devexpressDashWeb.ListLevelFormat.None with Double = js.native
  /* 46 */ val NumberInDash: typings.devexpressDashWeb.ListLevelFormat.NumberInDash with Double = js.native
  /* 47 */ val Ordinal: typings.devexpressDashWeb.ListLevelFormat.Ordinal with Double = js.native
  /* 48 */ val OrdinalText: typings.devexpressDashWeb.ListLevelFormat.OrdinalText with Double = js.native
  /* 49 */ val RussianLower: typings.devexpressDashWeb.ListLevelFormat.RussianLower with Double = js.native
  /* 50 */ val RussianUpper: typings.devexpressDashWeb.ListLevelFormat.RussianUpper with Double = js.native
  /* 51 */ val TaiwaneseCounting: typings.devexpressDashWeb.ListLevelFormat.TaiwaneseCounting with Double = js.native
  /* 52 */ val TaiwaneseCountingThousand: typings.devexpressDashWeb.ListLevelFormat.TaiwaneseCountingThousand with Double = js.native
  /* 53 */ val TaiwaneseDigital: typings.devexpressDashWeb.ListLevelFormat.TaiwaneseDigital with Double = js.native
  /* 54 */ val ThaiDescriptive: typings.devexpressDashWeb.ListLevelFormat.ThaiDescriptive with Double = js.native
  /* 55 */ val ThaiLetters: typings.devexpressDashWeb.ListLevelFormat.ThaiLetters with Double = js.native
  /* 56 */ val ThaiNumbers: typings.devexpressDashWeb.ListLevelFormat.ThaiNumbers with Double = js.native
  /* 57 */ val UpperLetter: typings.devexpressDashWeb.ListLevelFormat.UpperLetter with Double = js.native
  /* 58 */ val UpperRoman: typings.devexpressDashWeb.ListLevelFormat.UpperRoman with Double = js.native
  /* 59 */ val VietnameseDescriptive: typings.devexpressDashWeb.ListLevelFormat.VietnameseDescriptive with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ListLevelFormat with Double] = js.native
}

