package typings.ejDotWebDotAll.ej.PdfViewer

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.PdfViewer.BufferingMode.Complete
import typings.ejDotWebDotAll.ej.PdfViewer.BufferingMode.Default
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BufferingMode with Double] = js.native
  /* 1 */ @js.native
  object Complete extends TopLevel[Complete with Double]
  
  /* 0 */ @js.native
  object Default extends TopLevel[Default with Double]
  
}

