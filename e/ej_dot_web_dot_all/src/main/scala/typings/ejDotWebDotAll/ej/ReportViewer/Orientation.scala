package typings.ejDotWebDotAll.ej.ReportViewer

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.ReportViewer.Orientation.Landscape
import typings.ejDotWebDotAll.ej.ReportViewer.Orientation.Portrait
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.ejDotWebDotAll.ej.ReportViewer.Orientation with Double] = js.native
  /* 0 */ @js.native
  object Landscape extends TopLevel[Landscape with Double]
  
  /* 1 */ @js.native
  object Portrait extends TopLevel[Portrait with Double]
  
}

