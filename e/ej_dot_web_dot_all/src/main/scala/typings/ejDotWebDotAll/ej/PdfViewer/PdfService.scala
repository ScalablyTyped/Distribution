package typings.ejDotWebDotAll.ej.PdfViewer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PdfService extends js.Object

@JSGlobal("ej.PdfViewer.PdfService")
@js.native
object PdfService extends js.Object {
  ///Denotes that the service is located in the local project
  @js.native
  sealed trait Local extends PdfService
  
  ///Denotes that the service is hosted in the remote server
  @js.native
  sealed trait Remote extends PdfService
  
  /* 0 */ val Local: typings.ejDotWebDotAll.ej.PdfViewer.PdfService.Local with Double = js.native
  /* 1 */ val Remote: typings.ejDotWebDotAll.ej.PdfViewer.PdfService.Remote with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PdfService with Double] = js.native
}

