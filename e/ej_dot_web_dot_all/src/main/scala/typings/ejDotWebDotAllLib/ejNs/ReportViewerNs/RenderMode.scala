package typings
package ejDotWebDotAllLib.ejNs.ReportViewerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RenderMode extends js.Object

@JSGlobal("ej.ReportViewer.RenderMode")
@js.native
object RenderMode extends js.Object {
  ///Specifies the Default property in RenderMode to get default output.
  @js.native
  sealed trait Default
    extends ejDotWebDotAllLib.ejNs.ReportViewerNs.RenderMode
  
  ///Specifies the Desktop property in RenderMode to get specified output.
  @js.native
  sealed trait Desktop
    extends ejDotWebDotAllLib.ejNs.ReportViewerNs.RenderMode
  
  ///Specifies the Mobile property in RenderMode to get specified output.
  @js.native
  sealed trait Mobile
    extends ejDotWebDotAllLib.ejNs.ReportViewerNs.RenderMode
  
  /* 0 */ val Default: Default with scala.Double = js.native
  /* 2 */ val Desktop: Desktop with scala.Double = js.native
  /* 1 */ val Mobile: Mobile with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.ReportViewerNs.RenderMode with scala.Double] = js.native
}

