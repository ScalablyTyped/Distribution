package typings.devexpressWeb

import typings.jquery.JQueryPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ASPxClientSidePreviewModel extends StObject {
  
  def Close(): Unit = js.native
  
  def ExportTo(): Unit = js.native
  def ExportTo(format: String): Unit = js.native
  def ExportTo(format: String, inlineResult: Boolean): Unit = js.native
  def ExportTo(format: Unit, inlineResult: Boolean): Unit = js.native
  
  def GetCurrentPageIndex(): Double = js.native
  
  def GetParametersModel(): ASPxClientSideParametersModel = js.native
  
  def GoToPage(pageIndex: Double): Unit = js.native
  
  def OpenReport(url: String): JQueryPromise[Any] = js.native
  
  def Print(): Unit = js.native
  def Print(pageIndex: Double): Unit = js.native
  
  def ResetParameters(): Unit = js.native
  
  def StartBuild(): Unit = js.native
  
  var reportPreview: ASPxClientReportPreview = js.native
  
  var tabPanel: ASPxClientDocumentPreviewTabPanel = js.native
}
