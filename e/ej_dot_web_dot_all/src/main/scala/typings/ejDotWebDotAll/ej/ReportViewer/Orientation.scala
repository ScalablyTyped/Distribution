package typings.ejDotWebDotAll.ej.ReportViewer

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
    extends typings.ejDotWebDotAll.ej.ReportViewer.Orientation
  
  ///Specifies the portrait property in pageSettings.orientation to get specified layout.
  @js.native
  sealed trait Portrait
    extends typings.ejDotWebDotAll.ej.ReportViewer.Orientation
  
  /* 0 */ val Landscape: typings.ejDotWebDotAll.ej.ReportViewer.Orientation.Landscape with Double = js.native
  /* 1 */ val Portrait: typings.ejDotWebDotAll.ej.ReportViewer.Orientation.Portrait with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.ejDotWebDotAll.ej.ReportViewer.Orientation with Double] = js.native
}

