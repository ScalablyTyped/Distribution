package typings
package ejDotWebDotAllLib.ejNs.ReportViewerNs

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
  sealed trait Local
    extends ejDotWebDotAllLib.ejNs.ReportViewerNs.ProcessingMode
  
  ///Specifies the Remote property in processingMode.
  @js.native
  sealed trait Remote
    extends ejDotWebDotAllLib.ejNs.ReportViewerNs.ProcessingMode
  
  /* 1 */ val Local: Local with scala.Double = js.native
  /* 0 */ val Remote: Remote with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.ReportViewerNs.ProcessingMode with scala.Double] = js.native
}

