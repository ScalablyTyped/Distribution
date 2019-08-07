package typings.devexpressDashWeb

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
  
  /* 5 */ val AtLeast: typings.devexpressDashWeb.ParagraphLineSpacingType.AtLeast with scala.Double = js.native
  /* 2 */ val Double: typings.devexpressDashWeb.ParagraphLineSpacingType.Double with scala.Double = js.native
  /* 4 */ val Exactly: typings.devexpressDashWeb.ParagraphLineSpacingType.Exactly with scala.Double = js.native
  /* 3 */ val Multiple: typings.devexpressDashWeb.ParagraphLineSpacingType.Multiple with scala.Double = js.native
  /* 1 */ val Sesquialteral: typings.devexpressDashWeb.ParagraphLineSpacingType.Sesquialteral with scala.Double = js.native
  /* 0 */ val Single: typings.devexpressDashWeb.ParagraphLineSpacingType.Single with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ParagraphLineSpacingType with scala.Double] = js.native
}

