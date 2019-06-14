package typings
package ejDotWebDotAllLib.ejNs.PdfViewerNs

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
  sealed trait Local
    extends ejDotWebDotAllLib.ejNs.PdfViewerNs.PdfService
  
  ///Denotes that the service is hosted in the remote server
  @js.native
  sealed trait Remote
    extends ejDotWebDotAllLib.ejNs.PdfViewerNs.PdfService
  
  /* 0 */ val Local: Local with scala.Double = js.native
  /* 1 */ val Remote: Remote with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.PdfViewerNs.PdfService with scala.Double] = js.native
}

