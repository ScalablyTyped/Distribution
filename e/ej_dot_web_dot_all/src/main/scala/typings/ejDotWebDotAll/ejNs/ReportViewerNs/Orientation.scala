package typings.ejDotWebDotAll.ejNs.ReportViewerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Orientation extends js.Object

@JSGlobal("ej.ReportViewer.Orientation")
@js.native
object Orientation extends js.Object {
  ///Specifies the Landscape property in pageSettings.orientation to get specified layout.
  @js.native
  sealed trait Landscape
    extends typings.ejDotWebDotAll.ejNs.ReportViewerNs.Orientation
  
  ///Specifies the portrait property in pageSettings.orientation to get specified layout.
  @js.native
  sealed trait Portrait
    extends typings.ejDotWebDotAll.ejNs.ReportViewerNs.Orientation
  
  /* 0 */ val Landscape: typings.ejDotWebDotAll.ejNs.ReportViewerNs.Orientation.Landscape with Double = js.native
  /* 1 */ val Portrait: typings.ejDotWebDotAll.ejNs.ReportViewerNs.Orientation.Portrait with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.ejDotWebDotAll.ejNs.ReportViewerNs.Orientation with Double] = js.native
}

