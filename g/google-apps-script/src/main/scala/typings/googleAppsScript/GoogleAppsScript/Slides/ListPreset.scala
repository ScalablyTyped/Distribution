package typings.googleAppsScript.GoogleAppsScript.Slides

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ListPreset extends js.Object

/**
  * Preset patterns of glyphs for lists in text.
  *
  * These presets use these glyphs:
  *
  * ARROW: An arrow, ➔, corresponding to a Unicode U+2794 code point
  *
  * ARROW3D: An arrow with 3D shading, ➢, corresponding to a Unicode U+27a2 code point
  *
  * CHECKBOX: A hollow square, ❏, corresponding to a Unicode U+274f code point
  *
  * CIRCLE: A hollow circle, ○, corresponding to a Unicode U+25cb code point
  *
  * DIAMOND: A solid diamond, ◆, corresponding to a Unicode U+25c6 code point
  *
  * `DIAMONDX: A diamond with an 'x', ❖, corresponding to a Unicode U+2756 code point
  *
  * HOLLOWDIAMOND: A hollow diamond, ◇, corresponding to a Unicode U+25c7 code point
  *
  * DISC: A solid circle, ●, corresponding to a Unicode U+25cf code point
  *
  * SQUARE: A solid square, ■, corresponding to a Unicode U+25a0 code point
  *
  * STAR: A star, ★, corresponding to a Unicode U+2605 code point
  *
  * ALPHA: A lowercase letter, like 'a', 'b', or 'c'.
  *
  * UPPERALPHA: An uppercase letter, like 'A', 'B', or 'C'.
  *
  * DIGIT: A number, like '1', '2', or '3'.
  *
  * ZERODIGIT: A number where single digit numbers are prefixed with a zero, like '01', '02',
  *       or '03'. Numbers with more than one digit are not prefixed a zero.
  *
  * ROMAN: A lowercase roman numeral, like 'i', 'ii', or 'iii'.
  *
  * UPPERROMAN: A uppercase roman numeral, like 'I', 'II', or 'III'.
  *
  * LEFTTRIANGLE: A triangle pointing left, ◄, corresponding to a Unicode U+25c4 code
  *       point
  */
@JSGlobal("GoogleAppsScript.Slides.ListPreset")
@js.native
object ListPreset extends js.Object {
  @js.native
  sealed trait ARROW3D_CIRCLE_SQUARE extends ListPreset
  
  @js.native
  sealed trait ARROW_DIAMOND_DISC extends ListPreset
  
  @js.native
  sealed trait CHECKBOX extends ListPreset
  
  @js.native
  sealed trait DIAMONDX_ARROW3D_SQUARE extends ListPreset
  
  @js.native
  sealed trait DIAMONDX_HOLLOWDIAMOND_SQUARE extends ListPreset
  
  @js.native
  sealed trait DIAMOND_CIRCLE_SQUARE extends ListPreset
  
  @js.native
  sealed trait DIGIT_ALPHA_ROMAN extends ListPreset
  
  @js.native
  sealed trait DIGIT_ALPHA_ROMAN_PARENS extends ListPreset
  
  @js.native
  sealed trait DIGIT_NESTED extends ListPreset
  
  @js.native
  sealed trait DISC_CIRCLE_SQUARE extends ListPreset
  
  @js.native
  sealed trait LEFTTRIANGLE_DIAMOND_DISC extends ListPreset
  
  @js.native
  sealed trait STAR_CIRCLE_SQUARE extends ListPreset
  
  @js.native
  sealed trait UPPERALPHA_ALPHA_ROMAN extends ListPreset
  
  @js.native
  sealed trait UPPERROMAN_UPPERALPHA_DIGIT extends ListPreset
  
  @js.native
  sealed trait ZERODIGIT_ALPHA_ROMAN extends ListPreset
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ListPreset with Double] = js.native
  /* 5 */ @js.native
  object ARROW3D_CIRCLE_SQUARE extends TopLevel[ARROW3D_CIRCLE_SQUARE with Double]
  
  /* 3 */ @js.native
  object ARROW_DIAMOND_DISC extends TopLevel[ARROW_DIAMOND_DISC with Double]
  
  /* 2 */ @js.native
  object CHECKBOX extends TopLevel[CHECKBOX with Double]
  
  /* 1 */ @js.native
  object DIAMONDX_ARROW3D_SQUARE extends TopLevel[DIAMONDX_ARROW3D_SQUARE with Double]
  
  /* 7 */ @js.native
  object DIAMONDX_HOLLOWDIAMOND_SQUARE extends TopLevel[DIAMONDX_HOLLOWDIAMOND_SQUARE with Double]
  
  /* 8 */ @js.native
  object DIAMOND_CIRCLE_SQUARE extends TopLevel[DIAMOND_CIRCLE_SQUARE with Double]
  
  /* 9 */ @js.native
  object DIGIT_ALPHA_ROMAN extends TopLevel[DIGIT_ALPHA_ROMAN with Double]
  
  /* 10 */ @js.native
  object DIGIT_ALPHA_ROMAN_PARENS extends TopLevel[DIGIT_ALPHA_ROMAN_PARENS with Double]
  
  /* 11 */ @js.native
  object DIGIT_NESTED extends TopLevel[DIGIT_NESTED with Double]
  
  /* 0 */ @js.native
  object DISC_CIRCLE_SQUARE extends TopLevel[DISC_CIRCLE_SQUARE with Double]
  
  /* 6 */ @js.native
  object LEFTTRIANGLE_DIAMOND_DISC extends TopLevel[LEFTTRIANGLE_DIAMOND_DISC with Double]
  
  /* 4 */ @js.native
  object STAR_CIRCLE_SQUARE extends TopLevel[STAR_CIRCLE_SQUARE with Double]
  
  /* 12 */ @js.native
  object UPPERALPHA_ALPHA_ROMAN extends TopLevel[UPPERALPHA_ALPHA_ROMAN with Double]
  
  /* 13 */ @js.native
  object UPPERROMAN_UPPERALPHA_DIGIT extends TopLevel[UPPERROMAN_UPPERALPHA_DIGIT with Double]
  
  /* 14 */ @js.native
  object ZERODIGIT_ALPHA_ROMAN extends TopLevel[ZERODIGIT_ALPHA_ROMAN with Double]
  
}

