package typings.ejWebAll.ej.PdfViewer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
