package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ParagraphLineSpacingType extends js.Object

@JSGlobal("ParagraphLineSpacingType")
@js.native
object ParagraphLineSpacingType extends js.Object {
  @js.native
  sealed trait AtLeast extends ParagraphLineSpacingType
  
  @js.native
  sealed trait Double extends ParagraphLineSpacingType
  
  @js.native
  sealed trait Exactly extends ParagraphLineSpacingType
  
  @js.native
  sealed trait Multiple extends ParagraphLineSpacingType
  
  @js.native
  sealed trait Sesquialteral extends ParagraphLineSpacingType
  
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

