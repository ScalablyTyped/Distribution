package typings.ejDotWebDotAll.ejNs.ReportViewerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ExportOptions extends js.Object

@JSGlobal("ej.ReportViewer.ExportOptions")
@js.native
object ExportOptions extends js.Object {
  ///Specifies the All property in ExportOptions to get all available options.
  @js.native
  sealed trait All extends ExportOptions
  
  ///Specifies the Excel property in ExportOptions to get Excel option.
  @js.native
  sealed trait Excel extends ExportOptions
  
  ///Specifies the HTML property in ExportOptions to get HTML option.
  @js.native
  sealed trait HTML extends ExportOptions
  
  ///Specifies the PDF property in ExportOptions to get PDF option.
  @js.native
  sealed trait PDF extends ExportOptions
  
  ///Specifies the Word property in ExportOptions to get Word option.
  @js.native
  sealed trait Word extends ExportOptions
  
  /* 0 */ val All: typings.ejDotWebDotAll.ejNs.ReportViewerNs.ExportOptions.All with Double = js.native
  /* 3 */ val Excel: typings.ejDotWebDotAll.ejNs.ReportViewerNs.ExportOptions.Excel with Double = js.native
  /* 4 */ val HTML: typings.ejDotWebDotAll.ejNs.ReportViewerNs.ExportOptions.HTML with Double = js.native
  /* 1 */ val PDF: typings.ejDotWebDotAll.ejNs.ReportViewerNs.ExportOptions.PDF with Double = js.native
  /* 2 */ val Word: typings.ejDotWebDotAll.ejNs.ReportViewerNs.ExportOptions.Word with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExportOptions with Double] = js.native
}

