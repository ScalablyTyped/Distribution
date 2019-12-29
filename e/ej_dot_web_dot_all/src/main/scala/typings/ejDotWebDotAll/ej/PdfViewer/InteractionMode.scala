package typings.ejDotWebDotAll.ej.PdfViewer

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait InteractionMode extends js.Object

@JSGlobal("ej.PdfViewer.InteractionMode")
@js.native
object InteractionMode extends js.Object {
  ///To set the panning mode to the PDF viewer control.
  @js.native
  sealed trait Pan extends InteractionMode
  
  ///To set the text selection mode to the PDF viewer control.
  @js.native
  sealed trait TextSelection extends InteractionMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[InteractionMode with Double] = js.native
  /* 1 */ @js.native
  object Pan extends TopLevel[Pan with Double]
  
  /* 0 */ @js.native
  object TextSelection extends TopLevel[TextSelection with Double]
  
}

