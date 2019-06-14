package typings
package ejDotWebDotAllLib.ejNs.PdfViewerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BufferingMode extends js.Object

@JSGlobal("ej.PdfViewer.BufferingMode")
@js.native
object BufferingMode extends js.Object {
  ///Retrieves complete details to render all the pages in a single request.
  @js.native
  sealed trait Complete
    extends ejDotWebDotAllLib.ejNs.PdfViewerNs.BufferingMode
  
  ///Retrieves details to render first two pages in a request and rest of the pages in other request.
  @js.native
  sealed trait Default
    extends ejDotWebDotAllLib.ejNs.PdfViewerNs.BufferingMode
  
  /* 1 */ val Complete: Complete with scala.Double = js.native
  /* 0 */ val Default: Default with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.PdfViewerNs.BufferingMode with scala.Double] = js.native
}

