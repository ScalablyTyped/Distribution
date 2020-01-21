package typings.devexpressWeb

import typings.jquery.JQueryPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ASPxClientSidePreviewModel")
@js.native
class ASPxClientSidePreviewModel () extends js.Object {
  var reportPreview: ASPxClientReportPreview = js.native
  var tabPanel: ASPxClientDocumentPreviewTabPanel = js.native
  def Close(): Unit = js.native
  def ExportTo(): Unit = js.native
  def ExportTo(format: String): Unit = js.native
  def ExportTo(format: String, inlineResult: Boolean): Unit = js.native
  def GetCurrentPageIndex(): Double = js.native
  def GetParametersModel(): ASPxClientSideParametersModel = js.native
  def GoToPage(pageIndex: Double): Unit = js.native
  def OpenReport(url: String): JQueryPromise[_] = js.native
  def Print(): Unit = js.native
  def Print(pageIndex: Double): Unit = js.native
  def ResetParameters(): Unit = js.native
  def StartBuild(): Unit = js.native
}

