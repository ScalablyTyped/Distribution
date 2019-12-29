package typings.ejDotWebDotAll.ej.datavisualization.Diagram

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TextWrapping extends js.Object

@JSGlobal("ej.datavisualization.Diagram.TextWrapping")
@js.native
object TextWrapping extends js.Object {
  //Disables wrapping
  @js.native
  sealed trait NoWrap extends TextWrapping
  
  //Enables Line-break at normal word break points
  @js.native
  sealed trait Wrap extends TextWrapping
  
  //Enables Line-break at normal word break points with longer word overflows
  @js.native
  sealed trait WrapWithOverflow extends TextWrapping
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TextWrapping with Double] = js.native
  /* 0 */ @js.native
  object NoWrap extends TopLevel[NoWrap with Double]
  
  /* 1 */ @js.native
  object Wrap extends TopLevel[Wrap with Double]
  
  /* 2 */ @js.native
  object WrapWithOverflow extends TopLevel[WrapWithOverflow with Double]
  
}

