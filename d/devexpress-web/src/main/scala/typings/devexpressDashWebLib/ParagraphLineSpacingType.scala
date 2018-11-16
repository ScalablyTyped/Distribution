package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ParagraphLineSpacingType extends js.Object

@JSGlobal("ParagraphLineSpacingType")
@js.native
object ParagraphLineSpacingType extends js.Object {
  @js.native
  sealed trait AtLeast
    extends devexpressDashWebLib.ParagraphLineSpacingType
  
  @js.native
  sealed trait Double
    extends devexpressDashWebLib.ParagraphLineSpacingType
  
  @js.native
  sealed trait Exactly
    extends devexpressDashWebLib.ParagraphLineSpacingType
  
  @js.native
  sealed trait Multiple
    extends devexpressDashWebLib.ParagraphLineSpacingType
  
  @js.native
  sealed trait Sesquialteral
    extends devexpressDashWebLib.ParagraphLineSpacingType
  
  @js.native
  sealed trait Single
    extends devexpressDashWebLib.ParagraphLineSpacingType
  
  /* 5 */ val AtLeast: AtLeast with scala.Double = js.native
  /* 2 */ val Double: Double with scala.Double = js.native
  /* 4 */ val Exactly: Exactly with scala.Double = js.native
  /* 3 */ val Multiple: Multiple with scala.Double = js.native
  /* 1 */ val Sesquialteral: Sesquialteral with scala.Double = js.native
  /* 0 */ val Single: Single with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[devexpressDashWebLib.ParagraphLineSpacingType with scala.Double] = js.native
}

