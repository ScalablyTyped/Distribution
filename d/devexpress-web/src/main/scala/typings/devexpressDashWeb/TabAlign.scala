package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TabAlign extends js.Object

@JSGlobal("TabAlign")
@js.native
object TabAlign extends js.Object {
  @js.native
  sealed trait Center extends TabAlign
  
  @js.native
  sealed trait Decimal extends TabAlign
  
  @js.native
  sealed trait Left extends TabAlign
  
  @js.native
  sealed trait Right extends TabAlign
  
  /* 1 */ val Center: typings.devexpressDashWeb.TabAlign.Center with Double = js.native
  /* 3 */ val Decimal: typings.devexpressDashWeb.TabAlign.Decimal with Double = js.native
  /* 0 */ val Left: typings.devexpressDashWeb.TabAlign.Left with Double = js.native
  /* 2 */ val Right: typings.devexpressDashWeb.TabAlign.Right with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TabAlign with Double] = js.native
}

