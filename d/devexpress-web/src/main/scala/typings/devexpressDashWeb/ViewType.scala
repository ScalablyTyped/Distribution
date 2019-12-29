package typings.devexpressDashWeb

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ViewType extends js.Object

/**
  * Lists values specifying the Rich Edit's document view type.
  */
@JSGlobal("ViewType")
@js.native
object ViewType extends js.Object {
  /**
    * The print layout is enabled.
    */
  @js.native
  sealed trait PrintLayout extends ViewType
  
  /**
    * The simple view is enabled.
    */
  @js.native
  sealed trait Simple extends ViewType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ViewType with Double] = js.native
  /* 1 */ @js.native
  object PrintLayout extends TopLevel[PrintLayout with Double]
  
  /* 0 */ @js.native
  object Simple extends TopLevel[Simple with Double]
  
}

