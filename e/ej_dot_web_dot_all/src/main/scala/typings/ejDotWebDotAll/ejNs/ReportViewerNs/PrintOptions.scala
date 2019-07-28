package typings.ejDotWebDotAll.ejNs.ReportViewerNs

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
  sealed trait Default extends PrintOptions
  
  ///Specifies the NewTab property in printOptions.
  @js.native
  sealed trait NewTab extends PrintOptions
  
  ///Specifies the None property in printOptions.
  @js.native
  sealed trait None extends PrintOptions
  
  /* 0 */ val Default: typings.ejDotWebDotAll.ejNs.ReportViewerNs.PrintOptions.Default with Double = js.native
  /* 1 */ val NewTab: typings.ejDotWebDotAll.ejNs.ReportViewerNs.PrintOptions.NewTab with Double = js.native
  /* 2 */ val None: typings.ejDotWebDotAll.ejNs.ReportViewerNs.PrintOptions.None with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PrintOptions with Double] = js.native
}

