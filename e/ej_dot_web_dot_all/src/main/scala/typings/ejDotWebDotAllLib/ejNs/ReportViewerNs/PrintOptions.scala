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
  
  val Default: Default with java.lang.String = js.native
  val NewTab: NewTab with java.lang.String = js.native
  val None: None with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.ReportViewerNs.PrintOptions with java.lang.String] = js.native
}

