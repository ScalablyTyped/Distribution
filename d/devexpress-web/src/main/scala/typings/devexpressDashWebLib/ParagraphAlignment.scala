package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ParagraphAlignment extends js.Object

@JSGlobal("ParagraphAlignment")
@js.native
object ParagraphAlignment extends js.Object {
  @js.native
  sealed trait Center
    extends devexpressDashWebLib.ParagraphAlignment
  
  @js.native
  sealed trait Justify
    extends devexpressDashWebLib.ParagraphAlignment
  
  @js.native
  sealed trait Left
    extends devexpressDashWebLib.ParagraphAlignment
  
  @js.native
  sealed trait Right
    extends devexpressDashWebLib.ParagraphAlignment
  
  /* 2 */ val Center: Center with scala.Double = js.native
  /* 3 */ val Justify: Justify with scala.Double = js.native
  /* 0 */ val Left: Left with scala.Double = js.native
  /* 1 */ val Right: Right with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[devexpressDashWebLib.ParagraphAlignment with scala.Double] = js.native
}

