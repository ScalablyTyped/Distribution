package typings.ejDotWebDotAll.ejNs.ReportViewerNs

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
  sealed trait Default extends RenderMode
  
  ///Specifies the Desktop property in RenderMode to get specified output.
  @js.native
  sealed trait Desktop extends RenderMode
  
  ///Specifies the Mobile property in RenderMode to get specified output.
  @js.native
  sealed trait Mobile extends RenderMode
  
  /* 0 */ val Default: typings.ejDotWebDotAll.ejNs.ReportViewerNs.RenderMode.Default with Double = js.native
  /* 2 */ val Desktop: typings.ejDotWebDotAll.ejNs.ReportViewerNs.RenderMode.Desktop with Double = js.native
  /* 1 */ val Mobile: typings.ejDotWebDotAll.ejNs.ReportViewerNs.RenderMode.Mobile with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RenderMode with Double] = js.native
}

