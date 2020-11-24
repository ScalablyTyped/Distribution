package typings.ejWebAll.ej.ReportViewer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ProcessingMode extends js.Object
@JSGlobal("ej.ReportViewer.ProcessingMode")
@js.native
object ProcessingMode extends js.Object {
  
  ///Specifies the Local property in processingMode.
  @js.native
  sealed trait Local extends ProcessingMode
  
  ///Specifies the Remote property in processingMode.
  @js.native
  sealed trait Remote extends ProcessingMode
}
