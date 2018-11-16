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
  
  val Default: Default with java.lang.String = js.native
  val Desktop: Desktop with java.lang.String = js.native
  val Mobile: Mobile with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.ReportViewerNs.RenderMode with java.lang.String] = js.native
}

