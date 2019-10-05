package typings.ejDotWebDotAll.ej.ReportViewer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  
  /* 1 */ val Local: typings.ejDotWebDotAll.ej.ReportViewer.ProcessingMode.Local with Double = js.native
  /* 0 */ val Remote: typings.ejDotWebDotAll.ej.ReportViewer.ProcessingMode.Remote with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ProcessingMode with Double] = js.native
}

