package typings.devexpressWeb

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ListLevelFormat with Double] = js.native
  /* 2 */ @js.native
  object AIUEOFullWidthHiragana extends TopLevel[AIUEOFullWidthHiragana with Double]
  
  /* 1 */ @js.native
  object AIUEOHiragana extends TopLevel[AIUEOHiragana with Double]
  
  /* 3 */ @js.native
  object ArabicAbjad extends TopLevel[ArabicAbjad with Double]
  
  /* 4 */ @js.native
  object ArabicAlpha extends TopLevel[ArabicAlpha with Double]
  
  /* 5 */ @js.native
  object Bullet extends TopLevel[Bullet with Double]
  
  /* 6 */ @js.native
  object CardinalText extends TopLevel[CardinalText with Double]
  
  /* 7 */ @js.native
  object Chicago extends TopLevel[Chicago with Double]
  
  /* 8 */ @js.native
  object ChineseCounting extends TopLevel[ChineseCounting with Double]
  
  /* 9 */ @js.native
  object ChineseCountingThousand extends TopLevel[ChineseCountingThousand with Double]
  
  /* 10 */ @js.native
  object ChineseLegalSimplified extends TopLevel[ChineseLegalSimplified with Double]
  
  /* 11 */ @js.native
  object Chosung extends TopLevel[Chosung with Double]
  
  /* 0 */ @js.native
  object Decimal extends TopLevel[Decimal with Double]
  
  /* 12 */ @js.native
  object DecimalEnclosedCircle extends TopLevel[DecimalEnclosedCircle with Double]
  
  /* 13 */ @js.native
  object DecimalEnclosedCircleChinese extends TopLevel[DecimalEnclosedCircleChinese with Double]
  
  /* 14 */ @js.native
  object DecimalEnclosedFullstop extends TopLevel[DecimalEnclosedFullstop with Double]
  
  /* 15 */ @js.native
  object DecimalEnclosedParentheses extends TopLevel[DecimalEnclosedParentheses with Double]
  
  /* 16 */ @js.native
  object DecimalFullWidth extends TopLevel[DecimalFullWidth with Double]
  
  /* 17 */ @js.native
  object DecimalFullWidth2 extends TopLevel[DecimalFullWidth2 with Double]
  
  /* 18 */ @js.native
  object DecimalHalfWidth extends TopLevel[DecimalHalfWidth with Double]
  
  /* 19 */ @js.native
  object DecimalZero extends TopLevel[DecimalZero with Double]
  
  /* 20 */ @js.native
  object Ganada extends TopLevel[Ganada with Double]
  
  /* 21 */ @js.native
  object Hebrew1 extends TopLevel[Hebrew1 with Double]
  
  /* 22 */ @js.native
  object Hebrew2 extends TopLevel[Hebrew2 with Double]
  
  /* 23 */ @js.native
  object Hex extends TopLevel[Hex with Double]
  
  /* 24 */ @js.native
  object HindiConsonants extends TopLevel[HindiConsonants with Double]
  
  /* 25 */ @js.native
  object HindiDescriptive extends TopLevel[HindiDescriptive with Double]
  
  /* 26 */ @js.native
  object HindiNumbers extends TopLevel[HindiNumbers with Double]
  
  /* 27 */ @js.native
  object HindiVowels extends TopLevel[HindiVowels with Double]
  
  /* 28 */ @js.native
  object IdeographDigital extends TopLevel[IdeographDigital with Double]
  
  /* 29 */ @js.native
  object IdeographEnclosedCircle extends TopLevel[IdeographEnclosedCircle with Double]
  
  /* 30 */ @js.native
  object IdeographLegalTraditional extends TopLevel[IdeographLegalTraditional with Double]
  
  /* 31 */ @js.native
  object IdeographTraditional extends TopLevel[IdeographTraditional with Double]
  
  /* 32 */ @js.native
  object IdeographZodiac extends TopLevel[IdeographZodiac with Double]
  
  /* 33 */ @js.native
  object IdeographZodiacTraditional extends TopLevel[IdeographZodiacTraditional with Double]
  
  /* 34 */ @js.native
  object Iroha extends TopLevel[Iroha with Double]
  
  /* 35 */ @js.native
  object IrohaFullWidth extends TopLevel[IrohaFullWidth with Double]
  
  /* 36 */ @js.native
  object JapaneseCounting extends TopLevel[JapaneseCounting with Double]
  
  /* 37 */ @js.native
  object JapaneseDigitalTenThousand extends TopLevel[JapaneseDigitalTenThousand with Double]
  
  /* 38 */ @js.native
  object JapaneseLegal extends TopLevel[JapaneseLegal with Double]
  
  /* 39 */ @js.native
  object KoreanCounting extends TopLevel[KoreanCounting with Double]
  
  /* 40 */ @js.native
  object KoreanDigital extends TopLevel[KoreanDigital with Double]
  
  /* 41 */ @js.native
  object KoreanDigital2 extends TopLevel[KoreanDigital2 with Double]
  
  /* 42 */ @js.native
  object KoreanLegal extends TopLevel[KoreanLegal with Double]
  
  /* 43 */ @js.native
  object LowerLetter extends TopLevel[LowerLetter with Double]
  
  /* 44 */ @js.native
  object LowerRoman extends TopLevel[LowerRoman with Double]
  
  /* 45 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 46 */ @js.native
  object NumberInDash extends TopLevel[NumberInDash with Double]
  
  /* 47 */ @js.native
  object Ordinal extends TopLevel[Ordinal with Double]
  
  /* 48 */ @js.native
  object OrdinalText extends TopLevel[OrdinalText with Double]
  
  /* 49 */ @js.native
  object RussianLower extends TopLevel[RussianLower with Double]
  
  /* 50 */ @js.native
  object RussianUpper extends TopLevel[RussianUpper with Double]
  
  /* 51 */ @js.native
  object TaiwaneseCounting extends TopLevel[TaiwaneseCounting with Double]
  
  /* 52 */ @js.native
  object TaiwaneseCountingThousand extends TopLevel[TaiwaneseCountingThousand with Double]
  
  /* 53 */ @js.native
  object TaiwaneseDigital extends TopLevel[TaiwaneseDigital with Double]
  
  /* 54 */ @js.native
  object ThaiDescriptive extends TopLevel[ThaiDescriptive with Double]
  
  /* 55 */ @js.native
  object ThaiLetters extends TopLevel[ThaiLetters with Double]
  
  /* 56 */ @js.native
  object ThaiNumbers extends TopLevel[ThaiNumbers with Double]
  
  /* 57 */ @js.native
  object UpperLetter extends TopLevel[UpperLetter with Double]
  
  /* 58 */ @js.native
  object UpperRoman extends TopLevel[UpperRoman with Double]
  
  /* 59 */ @js.native
  object VietnameseDescriptive extends TopLevel[VietnameseDescriptive with Double]
  
}

