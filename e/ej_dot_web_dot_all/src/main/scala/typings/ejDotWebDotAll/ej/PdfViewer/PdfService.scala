package typings.ejDotWebDotAll.ej.PdfViewer

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.PdfViewer.PdfService.Local
import typings.ejDotWebDotAll.ej.PdfViewer.PdfService.Remote
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PdfService with Double] = js.native
  /* 0 */ @js.native
  object Local extends TopLevel[Local with Double]
  
  /* 1 */ @js.native
  object Remote extends TopLevel[Remote with Double]
  
}

