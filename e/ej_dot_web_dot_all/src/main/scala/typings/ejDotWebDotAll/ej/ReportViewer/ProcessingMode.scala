package typings.ejDotWebDotAll.ej.ReportViewer

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.ReportViewer.ProcessingMode.Local
import typings.ejDotWebDotAll.ej.ReportViewer.ProcessingMode.Remote
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ProcessingMode with Double] = js.native
  /* 1 */ @js.native
  object Local extends TopLevel[Local with Double]
  
  /* 0 */ @js.native
  object Remote extends TopLevel[Remote with Double]
  
}

