package typings
package ejDotWebDotAllLib.ejNs.ReportViewerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PrintOptions extends js.Object

@JSGlobal("ej.ReportViewer.PrintOptions")
@js.native
object PrintOptions extends js.Object {
  ///Specifies the Default property in printOptions.
  @js.native
  sealed trait Default
    extends ejDotWebDotAllLib.ejNs.ReportViewerNs.PrintOptions
  
  ///Specifies the NewTab property in printOptions.
  @js.native
  sealed trait NewTab
    extends ejDotWebDotAllLib.ejNs.ReportViewerNs.PrintOptions
  
  ///Specifies the None property in printOptions.
  @js.native
  sealed trait None
    extends ejDotWebDotAllLib.ejNs.ReportViewerNs.PrintOptions
  
  /* 0 */ val Default: Default with scala.Double = js.native
  /* 1 */ val NewTab: NewTab with scala.Double = js.native
  /* 2 */ val None: None with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.ReportViewerNs.PrintOptions with scala.Double] = js.native
}

