package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ViewType extends js.Object

@JSGlobal("ViewType")
@js.native
object ViewType extends js.Object {
  @js.native
  sealed trait PrintLayout extends ViewType
  
  @js.native
  sealed trait Simple extends ViewType
  
  /* 1 */ val PrintLayout: typings.devexpressDashWeb.ViewType.PrintLayout with Double = js.native
  /* 0 */ val Simple: typings.devexpressDashWeb.ViewType.Simple with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ViewType with Double] = js.native
}

