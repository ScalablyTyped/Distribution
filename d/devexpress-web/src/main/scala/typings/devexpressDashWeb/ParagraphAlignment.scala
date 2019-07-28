package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ParagraphAlignment extends js.Object

@JSGlobal("ParagraphAlignment")
@js.native
object ParagraphAlignment extends js.Object {
  @js.native
  sealed trait Center extends ParagraphAlignment
  
  @js.native
  sealed trait Justify extends ParagraphAlignment
  
  @js.native
  sealed trait Left extends ParagraphAlignment
  
  @js.native
  sealed trait Right extends ParagraphAlignment
  
  /* 2 */ val Center: typings.devexpressDashWeb.ParagraphAlignment.Center with Double = js.native
  /* 3 */ val Justify: typings.devexpressDashWeb.ParagraphAlignment.Justify with Double = js.native
  /* 0 */ val Left: typings.devexpressDashWeb.ParagraphAlignment.Left with Double = js.native
  /* 1 */ val Right: typings.devexpressDashWeb.ParagraphAlignment.Right with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ParagraphAlignment with Double] = js.native
}

