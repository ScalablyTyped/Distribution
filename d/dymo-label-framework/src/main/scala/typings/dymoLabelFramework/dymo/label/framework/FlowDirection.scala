package typings.dymoLabelFramework.dymo.label.framework

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FlowDirection extends js.Object
/**
  * Emuneration that specifies the direction in which objects and object text are laid out on the label.
  * For Middle East labels/content specify "RightToLeft", otherwise specify "LeftToRight" (default).
  */
@JSGlobal("dymo.label.framework.FlowDirection")
@js.native
object FlowDirection extends js.Object {
  
  /** Indicates that the content flows from left to right. */
  @js.native
  sealed trait LeftToRight extends FlowDirection
  
  /** Indicates that the content flows from right to left. */
  @js.native
  sealed trait RightToLeft extends FlowDirection
}
