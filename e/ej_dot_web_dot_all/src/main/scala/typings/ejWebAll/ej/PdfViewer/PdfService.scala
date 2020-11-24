package typings.ejWebAll.ej.PdfViewer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
