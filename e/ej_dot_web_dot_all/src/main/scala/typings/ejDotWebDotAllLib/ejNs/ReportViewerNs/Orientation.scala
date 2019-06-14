package typings
package ejDotWebDotAllLib.ejNs.ReportViewerNs

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
    extends ejDotWebDotAllLib.ejNs.ReportViewerNs.Orientation
  
  ///Specifies the portrait property in pageSettings.orientation to get specified layout.
  @js.native
  sealed trait Portrait
    extends ejDotWebDotAllLib.ejNs.ReportViewerNs.Orientation
  
  /* 0 */ val Landscape: Landscape with scala.Double = js.native
  /* 1 */ val Portrait: Portrait with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.ReportViewerNs.Orientation with scala.Double] = js.native
}

