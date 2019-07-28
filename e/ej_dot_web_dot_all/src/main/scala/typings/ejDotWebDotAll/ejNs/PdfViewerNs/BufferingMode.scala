package typings.ejDotWebDotAll.ejNs.PdfViewerNs

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
  sealed trait Complete extends BufferingMode
  
  ///Retrieves details to render first two pages in a request and rest of the pages in other request.
  @js.native
  sealed trait Default extends BufferingMode
  
  /* 1 */ val Complete: typings.ejDotWebDotAll.ejNs.PdfViewerNs.BufferingMode.Complete with Double = js.native
  /* 0 */ val Default: typings.ejDotWebDotAll.ejNs.PdfViewerNs.BufferingMode.Default with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BufferingMode with Double] = js.native
}

