package typings.devexpressDashWeb

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ParagraphLineSpacingType extends js.Object

/**
  * Lists values specifying the type of paragraph line spacing.
  */
@JSGlobal("ParagraphLineSpacingType")
@js.native
object ParagraphLineSpacingType extends js.Object {
  /**
    * The line spacing can be greater than or equal to, but never less than, the specified ParagraphFormattingSettings.lineSpacing value.
    */
  @js.native
  sealed trait AtLeast extends ParagraphLineSpacingType
  
  /**
    * This option is twice that of single line spacing.
    */
  @js.native
  sealed trait Double extends ParagraphLineSpacingType
  
  /**
    * This option sets fixed line spacing, specified by the ParagraphFormattingSettings.lineSpacing property.
    */
  @js.native
  sealed trait Exactly extends ParagraphLineSpacingType
  
  /**
    * This option sets line spacing that can be expressed in numbers greater than 1. For example, setting line spacing to 1.15 will increase the space by 15 percent, and setting line spacing to 3 increases the space by 300 percent (triple spacing). The multiplication value is specified by the lineSpacing property.
    */
  @js.native
  sealed trait Multiple extends ParagraphLineSpacingType
  
  /**
    * This option is one-and-one-half times that of single line spacing.
    */
  @js.native
  sealed trait Sesquialteral extends ParagraphLineSpacingType
  
  /**
    * This option accommodates the largest font in that line, plus a small amount of extra space. The amount of extra space varies depending on the font that is used.
    */
  @js.native
  sealed trait Single extends ParagraphLineSpacingType
  
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ParagraphLineSpacingType with scala.Double] = js.native
  /* 5 */ @js.native
  object AtLeast
    extends TopLevel[AtLeast with scala.Double]
  
  /* 2 */ @js.native
  object Double
    extends TopLevel[Double with scala.Double]
  
  /* 4 */ @js.native
  object Exactly
    extends TopLevel[Exactly with scala.Double]
  
  /* 3 */ @js.native
  object Multiple
    extends TopLevel[Multiple with scala.Double]
  
  /* 1 */ @js.native
  object Sesquialteral
    extends TopLevel[Sesquialteral with scala.Double]
  
  /* 0 */ @js.native
  object Single
    extends TopLevel[Single with scala.Double]
  
}

