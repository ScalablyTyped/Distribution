package typings.ejWebAll.ej.PdfViewer

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
  
}

