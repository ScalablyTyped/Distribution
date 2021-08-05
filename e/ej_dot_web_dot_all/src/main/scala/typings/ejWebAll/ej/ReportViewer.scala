package typings.ejWebAll.ej

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReportViewer
  extends StObject
     with Widget_ {
  
  var defaults: Model = js.native
  
  /** Export the report to the specified format.
    * @returns {void}
    */
  def exportReport(): Unit = js.native
  
  /** Fit the report page to the container.
    * @returns {void}
    */
  def fitToPage(): Unit = js.native
  
  /** Fit the report page height to the container.
    * @returns {void}
    */
  def fitToPageHeight(): Unit = js.native
  
  /** Fit the report page width to the container.
    * @returns {void}
    */
  def fitToPageWidth(): Unit = js.native
  
  /** Get the available datasets name of the rdlc report.
    * @returns {void}
    */
  def getDataSetNames(): Unit = js.native
  
  /** Get the available parameters of the report.
    * @returns {void}
    */
  def getParameters(): Unit = js.native
  
  /** Navigate to first page of report.
    * @returns {void}
    */
  def gotoFirstPage(): Unit = js.native
  
  /** Navigate to last page of the report.
    * @returns {void}
    */
  def gotoLastPage(): Unit = js.native
  
  /** Navigate to next page from the current page.
    * @returns {void}
    */
  def gotoNextPage(): Unit = js.native
  
  /** Go to specific page index of the report.
    * @returns {void}
    */
  def gotoPageIndex(): Unit = js.native
  
  /** Navigate to previous page from the current page.
    * @returns {void}
    */
  def gotoPreviousPage(): Unit = js.native
  
  @JSName("model")
  var model_ReportViewer: Model = js.native
  
  /** Print the report.
    * @returns {void}
    */
  def print(): Unit = js.native
  
  /** Apply print layout to the report.
    * @returns {void}
    */
  def printLayout(): Unit = js.native
  
  /** Refresh the report.
    * @returns {void}
    */
  def refresh(): Unit = js.native
}
object ReportViewer {
  
  @js.native
  sealed trait ExcelFormats extends StObject
  @JSGlobal("ej.ReportViewer.ExcelFormats")
  @js.native
  object ExcelFormats extends StObject {
    
    ///Specifies the Excel2007 property in ExcelFormats to get specified version of exported format.
    @js.native
    sealed trait Excel2007
      extends StObject
         with ExcelFormats
    
    ///Specifies the Excel2010 property in ExcelFormats to get specified version of exported format.
    @js.native
    sealed trait Excel2010
      extends StObject
         with ExcelFormats
    
    ///Specifies the Excel2013 property in ExcelFormats to get specified version of exported format.
    @js.native
    sealed trait Excel2013
      extends StObject
         with ExcelFormats
    
    ///Specifies the Excel97to2003 property in ExcelFormats to get specified version of exported format.
    @js.native
    sealed trait Excel97to2003
      extends StObject
         with ExcelFormats
  }
  
  @js.native
  sealed trait ExportOptions extends StObject
  @JSGlobal("ej.ReportViewer.ExportOptions")
  @js.native
  object ExportOptions extends StObject {
    
    ///Specifies the All property in ExportOptions to get all available options.
    @js.native
    sealed trait All
      extends StObject
         with ExportOptions
    
    ///Specifies the CSV property in ExportOptions to get CSV option.
    @js.native
    sealed trait CSV
      extends StObject
         with ExportOptions
    
    ///Specifies the customItems property in ExportOptions to get customItems option.
    @js.native
    sealed trait CustomItems
      extends StObject
         with ExportOptions
    
    ///Specifies the Excel property in ExportOptions to get Excel option.
    @js.native
    sealed trait Excel
      extends StObject
         with ExportOptions
    
    ///Specifies the Html property in ExportOptions to get Html option.
    @js.native
    sealed trait Html
      extends StObject
         with ExportOptions
    
    ///Specifies the PPT property in ExportOptions to get PPT option.
    @js.native
    sealed trait PPT
      extends StObject
         with ExportOptions
    
    ///Specifies the Pdf property in ExportOptions to get Pdf option.
    @js.native
    sealed trait Pdf
      extends StObject
         with ExportOptions
    
    ///Specifies the Word property in ExportOptions to get Word option.
    @js.native
    sealed trait Word
      extends StObject
         with ExportOptions
  }
  
  @js.native
  sealed trait Orientation extends StObject
  @JSGlobal("ej.ReportViewer.Orientation")
  @js.native
  object Orientation extends StObject {
    
    ///Specifies the Landscape property in pageSettings.orientation to get specified layout.
    @js.native
    sealed trait Landscape
      extends StObject
         with typings.ejWebAll.ej.ReportViewer.Orientation
    
    ///Specifies the portrait property in pageSettings.orientation to get specified layout.
    @js.native
    sealed trait Portrait
      extends StObject
         with typings.ejWebAll.ej.ReportViewer.Orientation
  }
  
  @js.native
  sealed trait PPTFormats extends StObject
  @JSGlobal("ej.ReportViewer.PPTFormats")
  @js.native
  object PPTFormats extends StObject {
    
    ///Represents PowerPoint2007 version.
    @js.native
    sealed trait PowerPoint2007
      extends StObject
         with PPTFormats
    
    ///Represents PowerPoint2010 version.
    @js.native
    sealed trait PowerPoint2010
      extends StObject
         with PPTFormats
    
    ///Represents PowerPoint2013 version.
    @js.native
    sealed trait PowerPoint2013
      extends StObject
         with PPTFormats
    
    ///Represents PowerPoint97to2003 version.
    @js.native
    sealed trait PowerPoint97to2003
      extends StObject
         with PPTFormats
  }
  
  @js.native
  sealed trait PaperSize extends StObject
  @JSGlobal("ej.ReportViewer.PaperSize")
  @js.native
  object PaperSize extends StObject {
    
    ///Specifies the A3 as value in pageSettings.paperSize to get specified size.
    @js.native
    sealed trait A3
      extends StObject
         with PaperSize
    
    ///Specifies the B4(JIS) as value in pageSettings.paperSize to get specified size.
    @js.native
    sealed trait B4_JIS
      extends StObject
         with PaperSize
    
    ///Specifies the B5(JIS) as value in pageSettings.paperSize to get specified size.
    @js.native
    sealed trait B5_JIS
      extends StObject
         with PaperSize
    
    ///Specifies the Custom as value in pageSettings.paperSize to get specified size.
    @js.native
    sealed trait Custom
      extends StObject
         with PaperSize
    
    ///Specifies the Envelope #10 as value in pageSettings.paperSize to get specified size.
    @js.native
    sealed trait Envelope_10
      extends StObject
         with PaperSize
    
    ///Specifies the Envelope as value in pageSettings.paperSize to get specified size.
    @js.native
    sealed trait Envelope_Monarch
      extends StObject
         with PaperSize
    
    ///Specifies the Executive as value in pageSettings.paperSize to get specified size.
    @js.native
    sealed trait Executive
      extends StObject
         with PaperSize
    
    ///Specifies the Legal as value in pageSettings.paperSize to get specified size.
    @js.native
    sealed trait Legal
      extends StObject
         with PaperSize
    
    ///Specifies the Letter as value in pageSettings.paperSize to get specified size.
    @js.native
    sealed trait Letter
      extends StObject
         with PaperSize
    
    ///Specifies the A4 as value in pageSettings.paperSize to get specified size.
    @js.native
    sealed trait Portrait
      extends StObject
         with PaperSize
    
    ///Specifies the Tabloid as value in pageSettings.paperSize to get specified size.
    @js.native
    sealed trait Tabloid
      extends StObject
         with PaperSize
  }
  
  @js.native
  sealed trait PrintOptions extends StObject
  @JSGlobal("ej.ReportViewer.PrintOptions")
  @js.native
  object PrintOptions extends StObject {
    
    ///Specifies the Default property in printOptions.
    @js.native
    sealed trait Default
      extends StObject
         with PrintOptions
    
    ///Specifies the NewTab property in printOptions.
    @js.native
    sealed trait NewTab
      extends StObject
         with PrintOptions
    
    ///Specifies the None property in printOptions.
    @js.native
    sealed trait None
      extends StObject
         with PrintOptions
  }
  
  @js.native
  sealed trait ProcessingMode extends StObject
  @JSGlobal("ej.ReportViewer.ProcessingMode")
  @js.native
  object ProcessingMode extends StObject {
    
    ///Specifies the Local property in processingMode.
    @js.native
    sealed trait Local
      extends StObject
         with ProcessingMode
    
    ///Specifies the Remote property in processingMode.
    @js.native
    sealed trait Remote
      extends StObject
         with ProcessingMode
  }
  
  @js.native
  sealed trait RenderMode extends StObject
  @JSGlobal("ej.ReportViewer.RenderMode")
  @js.native
  object RenderMode extends StObject {
    
    ///Specifies the Default property in RenderMode to get default output.
    @js.native
    sealed trait Default
      extends StObject
         with RenderMode
    
    ///Specifies the Desktop property in RenderMode to get specified output.
    @js.native
    sealed trait Desktop
      extends StObject
         with RenderMode
    
    ///Specifies the Mobile property in RenderMode to get specified output.
    @js.native
    sealed trait Mobile
      extends StObject
         with RenderMode
  }
  
  @js.native
  sealed trait ToolbarItems extends StObject
  @JSGlobal("ej.ReportViewer.ToolbarItems")
  @js.native
  object ToolbarItems extends StObject {
    
    ///Specifies the Export as value in ToolbarItems to get specified item.
    @js.native
    sealed trait Export
      extends StObject
         with ToolbarItems
    
    ///Specifies the FittoPage as value in ToolbarItems to get specified item.
    @js.native
    sealed trait FittoPage
      extends StObject
         with ToolbarItems
    
    ///Specifies the PageNavigation as value in ToolbarItems to get specified item.
    @js.native
    sealed trait PageNavigation
      extends StObject
         with ToolbarItems
    
    ///Specifies the PageSetup as value in ToolbarItems to get specified item.
    @js.native
    sealed trait PageSetup
      extends StObject
         with ToolbarItems
    
    ///Specifies the Parameters as value in ToolbarItems to get specified item.
    @js.native
    sealed trait Parameters
      extends StObject
         with ToolbarItems
    
    ///Specifies the Print as value in ToolbarItems to get specified item.
    @js.native
    sealed trait Print
      extends StObject
         with ToolbarItems
    
    ///Specifies the PrintLayout as value in ToolbarItems to get specified item.
    @js.native
    sealed trait PrintLayout
      extends StObject
         with ToolbarItems
    
    ///Specifies the Refresh as value in ToolbarItems to get specified item.
    @js.native
    sealed trait Refresh
      extends StObject
         with ToolbarItems
    
    ///Specifies the Zoom as value in ToolbarItems to get specified item.
    @js.native
    sealed trait Zoom
      extends StObject
         with ToolbarItems
  }
  
  @js.native
  sealed trait WordFormats extends StObject
  @JSGlobal("ej.ReportViewer.WordFormats")
  @js.native
  object WordFormats extends StObject {
    
    ///Specifies the Automatic property in WordFormats to get specified version of exported format.
    @js.native
    sealed trait Automatic
      extends StObject
         with WordFormats
    
    ///Specifies the DOCX property in WordFormats to get specified version of exported format.
    @js.native
    sealed trait DOCX
      extends StObject
         with WordFormats
    
    ///Specifies the Doc property in WordFormats to get specified version of exported format.
    @js.native
    sealed trait Doc
      extends StObject
         with WordFormats
    
    ///Specifies the Dot property in WordFormats to get specified version of exported format.
    @js.native
    sealed trait Dot
      extends StObject
         with WordFormats
    
    ///Specifies the EPUB property in WordFormats to get specified version of exported format.
    @js.native
    sealed trait EPUB
      extends StObject
         with WordFormats
    
    ///Specifies the HTML property in WordFormats to get specified version of exported format.
    @js.native
    sealed trait HTML
      extends StObject
         with WordFormats
    
    ///Specifies the RTF property in WordFormats to get specified version of exported format.
    @js.native
    sealed trait RTF
      extends StObject
         with WordFormats
    
    ///Specifies the Txt property in WordFormats to get specified version of exported format.
    @js.native
    sealed trait Txt
      extends StObject
         with WordFormats
    
    ///Specifies the Word2007 property in WordFormats to get specified version of exported format.
    @js.native
    sealed trait Word2007
      extends StObject
         with WordFormats
    
    ///Specifies the Word2007Docm property in WordFormats to get specified version of exported format.
    @js.native
    sealed trait Word2007Docm
      extends StObject
         with WordFormats
    
    ///Specifies the Word2007Dotm property in WordFormats to get specified version of exported format.
    @js.native
    sealed trait Word2007Dotm
      extends StObject
         with WordFormats
    
    ///Specifies the Word2007Dotx property in WordFormats to get specified version of exported format.
    @js.native
    sealed trait Word2007Dotx
      extends StObject
         with WordFormats
    
    ///Specifies the Word2010 property in WordFormats to get specified version of exported format.
    @js.native
    sealed trait Word2010
      extends StObject
         with WordFormats
    
    ///Specifies the Word2010Docm property in WordFormats to get specified version of exported format.
    @js.native
    sealed trait Word2010Docm
      extends StObject
         with WordFormats
    
    ///Specifies the Word2010Dotm property in WordFormats to get specified version of exported format.
    @js.native
    sealed trait Word2010Dotm
      extends StObject
         with WordFormats
    
    ///Specifies the Word2010Dotx property in WordFormats to get specified version of exported format.
    @js.native
    sealed trait Word2010Dotx
      extends StObject
         with WordFormats
    
    ///Specifies the Word2013 property in WordFormats to get specified version of exported format.
    @js.native
    sealed trait Word2013
      extends StObject
         with WordFormats
    
    ///Specifies the Word2013Docm property in WordFormats to get specified version of exported format.
    @js.native
    sealed trait Word2013Docm
      extends StObject
         with WordFormats
    
    ///Specifies the Word2013Dotm property in WordFormats to get specified version of exported format.
    @js.native
    sealed trait Word2013Dotm
      extends StObject
         with WordFormats
    
    ///Specifies the Word2013Dotx property in WordFormats to get specified version of exported format.
    @js.native
    sealed trait Word2013Dotx
      extends StObject
         with WordFormats
    
    ///Specifies the XML property in WordFormats to get specified version of exported format.
    @js.native
    sealed trait XML
      extends StObject
         with WordFormats
  }
  
  trait AjaxBeforeLoadEventArgs extends StObject {
    
    /** Send the custom data.
      */
    var data: js.UndefOr[String] = js.undefined
    
    /** Send the headerReq collection.
      */
    var headerReq: js.UndefOr[js.Any] = js.undefined
    
    /** Send the headers collection.
      */
    var headers: js.UndefOr[js.Any] = js.undefined
    
    /** returns the reportViewerToken.
      */
    var reportViewerToken: js.UndefOr[String] = js.undefined
    
    /** returns the serviceAuthorizationToken.
      */
    var serviceAuthorizationToken: js.UndefOr[String] = js.undefined
  }
  object AjaxBeforeLoadEventArgs {
    
    inline def apply(): AjaxBeforeLoadEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AjaxBeforeLoadEventArgs]
    }
    
    extension [Self <: AjaxBeforeLoadEventArgs](x: Self) {
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setHeaderReq(value: js.Any): Self = StObject.set(x, "headerReq", value.asInstanceOf[js.Any])
      
      inline def setHeaderReqUndefined: Self = StObject.set(x, "headerReq", js.undefined)
      
      inline def setHeaders(value: js.Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setReportViewerToken(value: String): Self = StObject.set(x, "reportViewerToken", value.asInstanceOf[js.Any])
      
      inline def setReportViewerTokenUndefined: Self = StObject.set(x, "reportViewerToken", js.undefined)
      
      inline def setServiceAuthorizationToken(value: String): Self = StObject.set(x, "serviceAuthorizationToken", value.asInstanceOf[js.Any])
      
      inline def setServiceAuthorizationTokenUndefined: Self = StObject.set(x, "serviceAuthorizationToken", js.undefined)
    }
  }
  
  trait AjaxErrorEventArgs extends StObject {
    
    /** returns the error details
      */
    var msg: js.UndefOr[String] = js.undefined
  }
  object AjaxErrorEventArgs {
    
    inline def apply(): AjaxErrorEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AjaxErrorEventArgs]
    }
    
    extension [Self <: AjaxErrorEventArgs](x: Self) {
      
      inline def setMsg(value: String): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
      
      inline def setMsgUndefined: Self = StObject.set(x, "msg", js.undefined)
    }
  }
  
  trait AjaxSuccessEventArgs extends StObject {
    
    /** returns the success data.
      */
    var data: js.UndefOr[js.Any] = js.undefined
  }
  object AjaxSuccessEventArgs {
    
    inline def apply(): AjaxSuccessEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AjaxSuccessEventArgs]
    }
    
    extension [Self <: AjaxSuccessEventArgs](x: Self) {
      
      inline def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    }
  }
  
  trait DataSource extends StObject {
    
    /** Gets or sets the name of the data source.
      * @Default {empty}
      */
    var name: js.UndefOr[String] = js.undefined
    
    /** Gets or sets the values of data source.
      * @Default {[]}
      */
    var value: js.UndefOr[js.Array[js.Any]] = js.undefined
  }
  object DataSource {
    
    inline def apply(): DataSource = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataSource]
    }
    
    extension [Self <: DataSource](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setValue(value: js.Array[js.Any]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setValueVarargs(value: js.Any*): Self = StObject.set(x, "value", js.Array(value :_*))
    }
  }
  
  trait DestroyEventArgs extends StObject {
    
    /** true if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the report model.
      */
    var model: js.UndefOr[js.Any] = js.undefined
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object DestroyEventArgs {
    
    inline def apply(): DestroyEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DestroyEventArgs]
    }
    
    extension [Self <: DestroyEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait DrillThroughEventArgs extends StObject {
    
    /** returns the actionInfo's parameters bookmarkLink, reportName, parameters.
      */
    var actionInfo: js.UndefOr[js.Any] = js.undefined
    
    /** true if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the report model.
      */
    var model: js.UndefOr[js.Any] = js.undefined
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object DrillThroughEventArgs {
    
    inline def apply(): DrillThroughEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DrillThroughEventArgs]
    }
    
    extension [Self <: DrillThroughEventArgs](x: Self) {
      
      inline def setActionInfo(value: js.Any): Self = StObject.set(x, "actionInfo", value.asInstanceOf[js.Any])
      
      inline def setActionInfoUndefined: Self = StObject.set(x, "actionInfo", js.undefined)
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ExportItemClickEventArgs extends StObject {
    
    /** returns the export format value.
      */
    var value: js.UndefOr[String] = js.undefined
  }
  object ExportItemClickEventArgs {
    
    inline def apply(): ExportItemClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExportItemClickEventArgs]
    }
    
    extension [Self <: ExportItemClickEventArgs](x: Self) {
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait ExportProgressChangedEventArgs extends StObject {
    
    /** returns ReportViewer container Id.
      */
    var containerId: js.UndefOr[String] = js.undefined
    
    /** returns the export format
      */
    var format: js.UndefOr[String] = js.undefined
    
    /** true if the event should be handled; otherwise, false.
      */
    var handled: js.UndefOr[Boolean] = js.undefined
    
    /** returns the stage of export processing.
      */
    var stage: js.UndefOr[String] = js.undefined
  }
  object ExportProgressChangedEventArgs {
    
    inline def apply(): ExportProgressChangedEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExportProgressChangedEventArgs]
    }
    
    extension [Self <: ExportProgressChangedEventArgs](x: Self) {
      
      inline def setContainerId(value: String): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
      
      inline def setContainerIdUndefined: Self = StObject.set(x, "containerId", js.undefined)
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setHandled(value: Boolean): Self = StObject.set(x, "handled", value.asInstanceOf[js.Any])
      
      inline def setHandledUndefined: Self = StObject.set(x, "handled", js.undefined)
      
      inline def setStage(value: String): Self = StObject.set(x, "stage", value.asInstanceOf[js.Any])
      
      inline def setStageUndefined: Self = StObject.set(x, "stage", js.undefined)
    }
  }
  
  trait ExportSettings extends StObject {
    
    /** Add the custom icon item to the export options.
      * @Default {empty}
      */
    var customItems: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    /** Specifies the excel export format.
      * @Default {ej.ReportViewer.ExcelFormats.Excel97to2003}
      */
    var excelFormat: js.UndefOr[ExcelFormats | String] = js.undefined
    
    /** Specifies the export formats.
      * @Default {ej.ReportViewer.ExportOptions.All}
      */
    var exportOptions: js.UndefOr[ExportOptions | String] = js.undefined
    
    /** Specifies the ppt export format.
      * @Default {ej.ReportViewer.PPTFormats.PowerPoint97to2003}
      */
    var pptFormat: js.UndefOr[PPTFormats | String] = js.undefined
    
    /** Specifies the word export format.
      * @Default {ej.ReportViewer.WordFormats.Doc}
      */
    var wordFormat: js.UndefOr[WordFormats | String] = js.undefined
  }
  object ExportSettings {
    
    inline def apply(): ExportSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExportSettings]
    }
    
    extension [Self <: ExportSettings](x: Self) {
      
      inline def setCustomItems(value: js.Array[js.Any]): Self = StObject.set(x, "customItems", value.asInstanceOf[js.Any])
      
      inline def setCustomItemsUndefined: Self = StObject.set(x, "customItems", js.undefined)
      
      inline def setCustomItemsVarargs(value: js.Any*): Self = StObject.set(x, "customItems", js.Array(value :_*))
      
      inline def setExcelFormat(value: ExcelFormats | String): Self = StObject.set(x, "excelFormat", value.asInstanceOf[js.Any])
      
      inline def setExcelFormatUndefined: Self = StObject.set(x, "excelFormat", js.undefined)
      
      inline def setExportOptions(value: ExportOptions | String): Self = StObject.set(x, "exportOptions", value.asInstanceOf[js.Any])
      
      inline def setExportOptionsUndefined: Self = StObject.set(x, "exportOptions", js.undefined)
      
      inline def setPptFormat(value: PPTFormats | String): Self = StObject.set(x, "pptFormat", value.asInstanceOf[js.Any])
      
      inline def setPptFormatUndefined: Self = StObject.set(x, "pptFormat", js.undefined)
      
      inline def setWordFormat(value: WordFormats | String): Self = StObject.set(x, "wordFormat", value.asInstanceOf[js.Any])
      
      inline def setWordFormatUndefined: Self = StObject.set(x, "wordFormat", js.undefined)
    }
  }
  
  trait HyperlinkEventArgs extends StObject {
    
    /** returns the actionInfo's hyperLink detail
      */
    var actionInfo: js.UndefOr[js.Any] = js.undefined
    
    /** true if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the report model.
      */
    var model: js.UndefOr[js.Any] = js.undefined
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object HyperlinkEventArgs {
    
    inline def apply(): HyperlinkEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HyperlinkEventArgs]
    }
    
    extension [Self <: HyperlinkEventArgs](x: Self) {
      
      inline def setActionInfo(value: js.Any): Self = StObject.set(x, "actionInfo", value.asInstanceOf[js.Any])
      
      inline def setActionInfoUndefined: Self = StObject.set(x, "actionInfo", js.undefined)
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Model extends StObject {
    
    /** Fires before the ajax request process started.
      */
    var ajaxBeforeLoad: js.UndefOr[js.Function1[/* e */ AjaxBeforeLoadEventArgs, Unit]] = js.undefined
    
    /** Fires when ajax request failed.
      */
    var ajaxError: js.UndefOr[js.Function1[/* e */ AjaxErrorEventArgs, Unit]] = js.undefined
    
    /** Fires when ajax post call succeed.
      */
    var ajaxSuccess: js.UndefOr[js.Function1[/* e */ AjaxSuccessEventArgs, Unit]] = js.undefined
    
    /** Enables and disables the rendering of Viewer when default values are specified for the parameters.
      * @Default {true}
      */
    var autoRender: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets the list of data sources for the RDLC report.
      * @Default {[]}
      */
    var dataSources: js.UndefOr[js.Array[DataSource]] = js.undefined
    
    /** Fires when the report viewer is destroyed successfully.If you want to perform any operation after destroying the reportviewer control,you can make use of the destroy event.
      */
    var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.undefined
    
    /** Fires during drill through action done in report.If you want to perform any operation when a drill through action is performed, you can make use of the drillThrough event.
      */
    var drillThrough: js.UndefOr[js.Function1[/* e */ DrillThroughEventArgs, Unit]] = js.undefined
    
    /** Enables and disables the data source credential block scroller.
      * @Default {true}
      */
    var enableDatasourceBlockScroller: js.UndefOr[Boolean] = js.undefined
    
    /** Enables and disables the drop-down parameter search.
      * @Default {false}
      */
    var enableDropDownSearch: js.UndefOr[Boolean] = js.undefined
    
    /** Enables and disables the Error Notification bar.
      * @Default {true}
      */
    var enableNotificationBar: js.UndefOr[Boolean] = js.undefined
    
    /** Enables or disables the page cache of report.
      * @Default {false}
      */
    var enablePageCache: js.UndefOr[Boolean] = js.undefined
    
    /** Enables and disables the PageVirtualization.
      * @Default {false}
      */
    var enablePageVirtualization: js.UndefOr[Boolean] = js.undefined
    
    /** Enables and disables the parameter block scroller.
      * @Default {true}
      */
    var enableParameterBlockScroller: js.UndefOr[Boolean] = js.undefined
    
    /** Fires when the export items are clicked. To perform any operation when the export items are clicked, use the exportItemClick event.
      */
    var exportItemClick: js.UndefOr[js.Function1[/* e */ ExportItemClickEventArgs, Unit]] = js.undefined
    
    /** Fires when the export progress is changed. To perform any operation when the export progress is changed, use the exportProgressChanged event.
      */
    var exportProgressChanged: js.UndefOr[js.Function1[/* e */ ExportProgressChangedEventArgs, Unit]] = js.undefined
    
    /** Specifies the export settings.
      */
    var exportSettings: js.UndefOr[ExportSettings] = js.undefined
    
    /** Fires when the hyperlink action is performed in the report. To perform any operation during the hyperlink action, use the hyperlink event.
      */
    var hyperlink: js.UndefOr[js.Function1[/* e */ HyperlinkEventArgs, Unit]] = js.undefined
    
    /** When set to true, adapts the report layout to fit the screen size of devices on which it renders.
      * @Default {true}
      */
    var isResponsive: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the locale for report viewer.
      * @Default {en-US}
      */
    var locale: js.UndefOr[String] = js.undefined
    
    /** Specifies the page settings.
      */
    var pageSettings: js.UndefOr[PageSettings] = js.undefined
    
    /** Specifies the parameter settings.
      */
    var parameterSettings: js.UndefOr[ParameterSettings] = js.undefined
    
    /** Fires when the dependent parameter value is the parameter block. You can add custom user interface, loading indicator and modify the default progress text, using the
      * ParameterUpdateStateChange event.
      */
    var parameterUpdateStateChange: js.UndefOr[js.Function1[/* e */ ParameterUpdateStateChangeEventArgs, Unit]] = js.undefined
    
    /** Gets or sets the list of parameters associated with the report.
      * @Default {[]}
      */
    var parameters: js.UndefOr[js.Array[Parameter]] = js.undefined
    
    /** Enables and disables the print mode.
      * @Default {false}
      */
    var printMode: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the print option of the report.
      * @Default {ej.ReportViewer.PrintOptions.Default}
      */
    var printOption: js.UndefOr[PrintOptions | String] = js.undefined
    
    /** Fires when the print progress is changed. To perform any operation when the print progress is changed, use the printProgressChanged event.
      */
    var printProgressChanged: js.UndefOr[js.Function1[/* e */ PrintProgressChangedEventArgs, Unit]] = js.undefined
    
    /** Specifies the processing mode of the report.
      * @Default {ej.ReportViewer.ProcessingMode.Remote}
      */
    var processingMode: js.UndefOr[ProcessingMode | String] = js.undefined
    
    /** Specifies the render layout.
      * @Default {ej.ReportViewer.RenderMode.Default}
      */
    var renderMode: js.UndefOr[RenderMode | String] = js.undefined
    
    /** Fires before report rendering is completed.If you want to perform any operation before the rendering of report,you can make use of the renderingBegin event.
      */
    var renderingBegin: js.UndefOr[js.Function1[/* e */ RenderingBeginEventArgs, Unit]] = js.undefined
    
    /** Fires after report rendering completed.If you want to perform any operation after the rendering of report,you can make use of this renderingComplete event.
      */
    var renderingComplete: js.UndefOr[js.Function1[/* e */ RenderingCompleteEventArgs, Unit]] = js.undefined
    
    /** Fires when any error occurred while rendering the report.If you want to perform any operation when an error occurs in the report, you can make use of the reportError event.
      */
    var reportError: js.UndefOr[js.Function1[/* e */ ReportErrorEventArgs, Unit]] = js.undefined
    
    /** Fires when the report is being exported.If you want to perform any operation before exporting of report, you can make use of the reportExport event.
      */
    var reportExport: js.UndefOr[js.Function1[/* e */ ReportExportEventArgs, Unit]] = js.undefined
    
    /** Fires when the report is loaded.If you want to perform any operation after the successful loading of report, you can make use of the reportLoaded event.
      */
    var reportLoaded: js.UndefOr[js.Function1[/* e */ ReportLoadedEventArgs, Unit]] = js.undefined
    
    /** Gets or sets the path of the report file.
      * @Default {empty}
      */
    var reportPath: js.UndefOr[String] = js.undefined
    
    /** Fires when the report print action is performed in the report. To perform any operation during the report print action, use the ReportPrint event.
      */
    var reportPrint: js.UndefOr[js.Function1[/* e */ ReportPrintEventArgs, Unit]] = js.undefined
    
    /** Gets or sets the reports server URL.
      * @Default {empty}
      */
    var reportServerUrl: js.UndefOr[String] = js.undefined
    
    /** Specifies the report Web API service URL.
      * @Default {empty}
      */
    var reportServiceUrl: js.UndefOr[String] = js.undefined
    
    /** Specifies the token for authorizing reporting service url to process the reports.
      * @Default {empty}
      */
    var serviceAuthorizationToken: js.UndefOr[String] = js.undefined
    
    /** Fires when user clicks on a failed report item in the rendered report, before displaying error details dialog. If you want to show custom error detail or perform any action before
      * viewing error detail, you can make use of the showError event.
      */
    var showError: js.UndefOr[js.Function1[/* e */ ShowErrorEventArgs, Unit]] = js.undefined
    
    /** Gets or sets the showExceptionsInDialog for report viewer.
      * @Default {false}
      */
    var showExceptionsInDialog: js.UndefOr[Boolean] = js.undefined
    
    /** Render the ReportViewer height based on the report content size.
      * @Default {false}
      */
    var sizeToReportContent: js.UndefOr[Boolean] = js.undefined
    
    /** Fires when the toolbar items are clicked. To perform any operation when the toolbar items are clicked, use the toolBarItemClick event.
      */
    var toolBarItemClick: js.UndefOr[js.Function1[/* e */ ToolBarItemClickEventArgs, Unit]] = js.undefined
    
    /** This event will be triggered on rendering the Report Viewer toolbar.
      */
    var toolbarRendering: js.UndefOr[js.Function1[/* e */ ToolbarRenderingEventArgs, Unit]] = js.undefined
    
    /** Specifies the toolbar settings.
      */
    var toolbarSettings: js.UndefOr[ToolbarSettings] = js.undefined
    
    /** Fires when click the View Report Button.
      */
    var viewReportClick: js.UndefOr[js.Function1[/* e */ ViewReportClickEventArgs, Unit]] = js.undefined
    
    /** Gets or sets the zoom factor for report viewer.
      * @Default {1}
      */
    var zoomFactor: js.UndefOr[Double] = js.undefined
  }
  object Model {
    
    inline def apply(): typings.ejWebAll.ej.ReportViewer.Model = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.ejWebAll.ej.ReportViewer.Model]
    }
    
    extension [Self <: typings.ejWebAll.ej.ReportViewer.Model](x: Self) {
      
      inline def setAjaxBeforeLoad(value: /* e */ AjaxBeforeLoadEventArgs => Unit): Self = StObject.set(x, "ajaxBeforeLoad", js.Any.fromFunction1(value))
      
      inline def setAjaxBeforeLoadUndefined: Self = StObject.set(x, "ajaxBeforeLoad", js.undefined)
      
      inline def setAjaxError(value: /* e */ AjaxErrorEventArgs => Unit): Self = StObject.set(x, "ajaxError", js.Any.fromFunction1(value))
      
      inline def setAjaxErrorUndefined: Self = StObject.set(x, "ajaxError", js.undefined)
      
      inline def setAjaxSuccess(value: /* e */ AjaxSuccessEventArgs => Unit): Self = StObject.set(x, "ajaxSuccess", js.Any.fromFunction1(value))
      
      inline def setAjaxSuccessUndefined: Self = StObject.set(x, "ajaxSuccess", js.undefined)
      
      inline def setAutoRender(value: Boolean): Self = StObject.set(x, "autoRender", value.asInstanceOf[js.Any])
      
      inline def setAutoRenderUndefined: Self = StObject.set(x, "autoRender", js.undefined)
      
      inline def setDataSources(value: js.Array[DataSource]): Self = StObject.set(x, "dataSources", value.asInstanceOf[js.Any])
      
      inline def setDataSourcesUndefined: Self = StObject.set(x, "dataSources", js.undefined)
      
      inline def setDataSourcesVarargs(value: DataSource*): Self = StObject.set(x, "dataSources", js.Array(value :_*))
      
      inline def setDestroy(value: /* e */ DestroyEventArgs => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction1(value))
      
      inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      inline def setDrillThrough(value: /* e */ DrillThroughEventArgs => Unit): Self = StObject.set(x, "drillThrough", js.Any.fromFunction1(value))
      
      inline def setDrillThroughUndefined: Self = StObject.set(x, "drillThrough", js.undefined)
      
      inline def setEnableDatasourceBlockScroller(value: Boolean): Self = StObject.set(x, "enableDatasourceBlockScroller", value.asInstanceOf[js.Any])
      
      inline def setEnableDatasourceBlockScrollerUndefined: Self = StObject.set(x, "enableDatasourceBlockScroller", js.undefined)
      
      inline def setEnableDropDownSearch(value: Boolean): Self = StObject.set(x, "enableDropDownSearch", value.asInstanceOf[js.Any])
      
      inline def setEnableDropDownSearchUndefined: Self = StObject.set(x, "enableDropDownSearch", js.undefined)
      
      inline def setEnableNotificationBar(value: Boolean): Self = StObject.set(x, "enableNotificationBar", value.asInstanceOf[js.Any])
      
      inline def setEnableNotificationBarUndefined: Self = StObject.set(x, "enableNotificationBar", js.undefined)
      
      inline def setEnablePageCache(value: Boolean): Self = StObject.set(x, "enablePageCache", value.asInstanceOf[js.Any])
      
      inline def setEnablePageCacheUndefined: Self = StObject.set(x, "enablePageCache", js.undefined)
      
      inline def setEnablePageVirtualization(value: Boolean): Self = StObject.set(x, "enablePageVirtualization", value.asInstanceOf[js.Any])
      
      inline def setEnablePageVirtualizationUndefined: Self = StObject.set(x, "enablePageVirtualization", js.undefined)
      
      inline def setEnableParameterBlockScroller(value: Boolean): Self = StObject.set(x, "enableParameterBlockScroller", value.asInstanceOf[js.Any])
      
      inline def setEnableParameterBlockScrollerUndefined: Self = StObject.set(x, "enableParameterBlockScroller", js.undefined)
      
      inline def setExportItemClick(value: /* e */ ExportItemClickEventArgs => Unit): Self = StObject.set(x, "exportItemClick", js.Any.fromFunction1(value))
      
      inline def setExportItemClickUndefined: Self = StObject.set(x, "exportItemClick", js.undefined)
      
      inline def setExportProgressChanged(value: /* e */ ExportProgressChangedEventArgs => Unit): Self = StObject.set(x, "exportProgressChanged", js.Any.fromFunction1(value))
      
      inline def setExportProgressChangedUndefined: Self = StObject.set(x, "exportProgressChanged", js.undefined)
      
      inline def setExportSettings(value: ExportSettings): Self = StObject.set(x, "exportSettings", value.asInstanceOf[js.Any])
      
      inline def setExportSettingsUndefined: Self = StObject.set(x, "exportSettings", js.undefined)
      
      inline def setHyperlink(value: /* e */ HyperlinkEventArgs => Unit): Self = StObject.set(x, "hyperlink", js.Any.fromFunction1(value))
      
      inline def setHyperlinkUndefined: Self = StObject.set(x, "hyperlink", js.undefined)
      
      inline def setIsResponsive(value: Boolean): Self = StObject.set(x, "isResponsive", value.asInstanceOf[js.Any])
      
      inline def setIsResponsiveUndefined: Self = StObject.set(x, "isResponsive", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setPageSettings(value: PageSettings): Self = StObject.set(x, "pageSettings", value.asInstanceOf[js.Any])
      
      inline def setPageSettingsUndefined: Self = StObject.set(x, "pageSettings", js.undefined)
      
      inline def setParameterSettings(value: ParameterSettings): Self = StObject.set(x, "parameterSettings", value.asInstanceOf[js.Any])
      
      inline def setParameterSettingsUndefined: Self = StObject.set(x, "parameterSettings", js.undefined)
      
      inline def setParameterUpdateStateChange(value: /* e */ ParameterUpdateStateChangeEventArgs => Unit): Self = StObject.set(x, "parameterUpdateStateChange", js.Any.fromFunction1(value))
      
      inline def setParameterUpdateStateChangeUndefined: Self = StObject.set(x, "parameterUpdateStateChange", js.undefined)
      
      inline def setParameters(value: js.Array[Parameter]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
      
      inline def setParametersVarargs(value: Parameter*): Self = StObject.set(x, "parameters", js.Array(value :_*))
      
      inline def setPrintMode(value: Boolean): Self = StObject.set(x, "printMode", value.asInstanceOf[js.Any])
      
      inline def setPrintModeUndefined: Self = StObject.set(x, "printMode", js.undefined)
      
      inline def setPrintOption(value: PrintOptions | String): Self = StObject.set(x, "printOption", value.asInstanceOf[js.Any])
      
      inline def setPrintOptionUndefined: Self = StObject.set(x, "printOption", js.undefined)
      
      inline def setPrintProgressChanged(value: /* e */ PrintProgressChangedEventArgs => Unit): Self = StObject.set(x, "printProgressChanged", js.Any.fromFunction1(value))
      
      inline def setPrintProgressChangedUndefined: Self = StObject.set(x, "printProgressChanged", js.undefined)
      
      inline def setProcessingMode(value: ProcessingMode | String): Self = StObject.set(x, "processingMode", value.asInstanceOf[js.Any])
      
      inline def setProcessingModeUndefined: Self = StObject.set(x, "processingMode", js.undefined)
      
      inline def setRenderMode(value: RenderMode | String): Self = StObject.set(x, "renderMode", value.asInstanceOf[js.Any])
      
      inline def setRenderModeUndefined: Self = StObject.set(x, "renderMode", js.undefined)
      
      inline def setRenderingBegin(value: /* e */ RenderingBeginEventArgs => Unit): Self = StObject.set(x, "renderingBegin", js.Any.fromFunction1(value))
      
      inline def setRenderingBeginUndefined: Self = StObject.set(x, "renderingBegin", js.undefined)
      
      inline def setRenderingComplete(value: /* e */ RenderingCompleteEventArgs => Unit): Self = StObject.set(x, "renderingComplete", js.Any.fromFunction1(value))
      
      inline def setRenderingCompleteUndefined: Self = StObject.set(x, "renderingComplete", js.undefined)
      
      inline def setReportError(value: /* e */ ReportErrorEventArgs => Unit): Self = StObject.set(x, "reportError", js.Any.fromFunction1(value))
      
      inline def setReportErrorUndefined: Self = StObject.set(x, "reportError", js.undefined)
      
      inline def setReportExport(value: /* e */ ReportExportEventArgs => Unit): Self = StObject.set(x, "reportExport", js.Any.fromFunction1(value))
      
      inline def setReportExportUndefined: Self = StObject.set(x, "reportExport", js.undefined)
      
      inline def setReportLoaded(value: /* e */ ReportLoadedEventArgs => Unit): Self = StObject.set(x, "reportLoaded", js.Any.fromFunction1(value))
      
      inline def setReportLoadedUndefined: Self = StObject.set(x, "reportLoaded", js.undefined)
      
      inline def setReportPath(value: String): Self = StObject.set(x, "reportPath", value.asInstanceOf[js.Any])
      
      inline def setReportPathUndefined: Self = StObject.set(x, "reportPath", js.undefined)
      
      inline def setReportPrint(value: /* e */ ReportPrintEventArgs => Unit): Self = StObject.set(x, "reportPrint", js.Any.fromFunction1(value))
      
      inline def setReportPrintUndefined: Self = StObject.set(x, "reportPrint", js.undefined)
      
      inline def setReportServerUrl(value: String): Self = StObject.set(x, "reportServerUrl", value.asInstanceOf[js.Any])
      
      inline def setReportServerUrlUndefined: Self = StObject.set(x, "reportServerUrl", js.undefined)
      
      inline def setReportServiceUrl(value: String): Self = StObject.set(x, "reportServiceUrl", value.asInstanceOf[js.Any])
      
      inline def setReportServiceUrlUndefined: Self = StObject.set(x, "reportServiceUrl", js.undefined)
      
      inline def setServiceAuthorizationToken(value: String): Self = StObject.set(x, "serviceAuthorizationToken", value.asInstanceOf[js.Any])
      
      inline def setServiceAuthorizationTokenUndefined: Self = StObject.set(x, "serviceAuthorizationToken", js.undefined)
      
      inline def setShowError(value: /* e */ ShowErrorEventArgs => Unit): Self = StObject.set(x, "showError", js.Any.fromFunction1(value))
      
      inline def setShowErrorUndefined: Self = StObject.set(x, "showError", js.undefined)
      
      inline def setShowExceptionsInDialog(value: Boolean): Self = StObject.set(x, "showExceptionsInDialog", value.asInstanceOf[js.Any])
      
      inline def setShowExceptionsInDialogUndefined: Self = StObject.set(x, "showExceptionsInDialog", js.undefined)
      
      inline def setSizeToReportContent(value: Boolean): Self = StObject.set(x, "sizeToReportContent", value.asInstanceOf[js.Any])
      
      inline def setSizeToReportContentUndefined: Self = StObject.set(x, "sizeToReportContent", js.undefined)
      
      inline def setToolBarItemClick(value: /* e */ ToolBarItemClickEventArgs => Unit): Self = StObject.set(x, "toolBarItemClick", js.Any.fromFunction1(value))
      
      inline def setToolBarItemClickUndefined: Self = StObject.set(x, "toolBarItemClick", js.undefined)
      
      inline def setToolbarRendering(value: /* e */ ToolbarRenderingEventArgs => Unit): Self = StObject.set(x, "toolbarRendering", js.Any.fromFunction1(value))
      
      inline def setToolbarRenderingUndefined: Self = StObject.set(x, "toolbarRendering", js.undefined)
      
      inline def setToolbarSettings(value: ToolbarSettings): Self = StObject.set(x, "toolbarSettings", value.asInstanceOf[js.Any])
      
      inline def setToolbarSettingsUndefined: Self = StObject.set(x, "toolbarSettings", js.undefined)
      
      inline def setViewReportClick(value: /* e */ ViewReportClickEventArgs => Unit): Self = StObject.set(x, "viewReportClick", js.Any.fromFunction1(value))
      
      inline def setViewReportClickUndefined: Self = StObject.set(x, "viewReportClick", js.undefined)
      
      inline def setZoomFactor(value: Double): Self = StObject.set(x, "zoomFactor", value.asInstanceOf[js.Any])
      
      inline def setZoomFactorUndefined: Self = StObject.set(x, "zoomFactor", js.undefined)
    }
  }
  
  trait PageSettings extends StObject {
    
    /** Specifies the print layout orientation.
      * @Default {null}
      */
    var orientation: js.UndefOr[typings.ejWebAll.ej.Orientation | String] = js.undefined
    
    /** Specifies the paper size of print layout.
      * @Default {null}
      */
    var paperSize: js.UndefOr[PaperSize | String] = js.undefined
  }
  object PageSettings {
    
    inline def apply(): PageSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PageSettings]
    }
    
    extension [Self <: PageSettings](x: Self) {
      
      inline def setOrientation(value: typings.ejWebAll.ej.Orientation | String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      inline def setPaperSize(value: PaperSize | String): Self = StObject.set(x, "paperSize", value.asInstanceOf[js.Any])
      
      inline def setPaperSizeUndefined: Self = StObject.set(x, "paperSize", js.undefined)
    }
  }
  
  trait Parameter extends StObject {
    
    /** Gets or sets the parameter labels.
      * @Default {null}
      */
    var labels: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    /** Gets or sets the name of the parameter.
      * @Default {empty}
      */
    var name: js.UndefOr[String] = js.undefined
    
    /** Gets or sets whether the parameter allows nullable value or not.
      * @Default {false}
      */
    var nullable: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets the prompt message associated with the specified parameter.
      * @Default {empty}
      */
    var prompt: js.UndefOr[String] = js.undefined
    
    /** Gets or sets the parameter values.
      * @Default {[]}
      */
    var values: js.UndefOr[js.Array[js.Any]] = js.undefined
  }
  object Parameter {
    
    inline def apply(): Parameter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Parameter]
    }
    
    extension [Self <: Parameter](x: Self) {
      
      inline def setLabels(value: js.Array[js.Any]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
      
      inline def setLabelsVarargs(value: js.Any*): Self = StObject.set(x, "labels", js.Array(value :_*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNullable(value: Boolean): Self = StObject.set(x, "nullable", value.asInstanceOf[js.Any])
      
      inline def setNullableUndefined: Self = StObject.set(x, "nullable", js.undefined)
      
      inline def setPrompt(value: String): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
      
      inline def setPromptUndefined: Self = StObject.set(x, "prompt", js.undefined)
      
      inline def setValues(value: js.Array[js.Any]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
      
      inline def setValuesVarargs(value: js.Any*): Self = StObject.set(x, "values", js.Array(value :_*))
    }
  }
  
  trait ParameterSettings extends StObject {
    
    /** Sets the separator when the multiSelectMode with delimiter option or checkbox is enabled with the dropdown. When you enter the delimiter value, the texts after the delimiter are
      * considered as a separate word or query. The delimiter string is a single character and must be a symbol. Mostly, the delimiter symbol is used as comma (,) or semi-colon (;) or
      * any other special character.
      * @Default {,}
      */
    var delimiterChar: js.UndefOr[String] = js.undefined
    
    /** Specifies the width of the parameter item. By default, the item width value is set as &quot;185px&quot;.
      * @Default {185px}
      */
    var itemWidth: js.UndefOr[String] = js.undefined
    
    /** Specifies the width of the parameter label. By default, the parameter label width value is set as &quot;110px&quot;.
      * @Default {110px}
      */
    var labelWidth: js.UndefOr[String] = js.undefined
    
    /** Specifies the height of the combobox parameter popup list. By default, the popup height value is &quot;152px&quot;.
      * @Default {152px}
      */
    var popupHeight: js.UndefOr[String] = js.undefined
    
    /** Specifies the width of the combobox parameter popup list. By default, the popup width sets based on the width of the component.
      * @Default {auto}
      */
    var popupWidth: js.UndefOr[String] = js.undefined
  }
  object ParameterSettings {
    
    inline def apply(): ParameterSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParameterSettings]
    }
    
    extension [Self <: ParameterSettings](x: Self) {
      
      inline def setDelimiterChar(value: String): Self = StObject.set(x, "delimiterChar", value.asInstanceOf[js.Any])
      
      inline def setDelimiterCharUndefined: Self = StObject.set(x, "delimiterChar", js.undefined)
      
      inline def setItemWidth(value: String): Self = StObject.set(x, "itemWidth", value.asInstanceOf[js.Any])
      
      inline def setItemWidthUndefined: Self = StObject.set(x, "itemWidth", js.undefined)
      
      inline def setLabelWidth(value: String): Self = StObject.set(x, "labelWidth", value.asInstanceOf[js.Any])
      
      inline def setLabelWidthUndefined: Self = StObject.set(x, "labelWidth", js.undefined)
      
      inline def setPopupHeight(value: String): Self = StObject.set(x, "popupHeight", value.asInstanceOf[js.Any])
      
      inline def setPopupHeightUndefined: Self = StObject.set(x, "popupHeight", js.undefined)
      
      inline def setPopupWidth(value: String): Self = StObject.set(x, "popupWidth", value.asInstanceOf[js.Any])
      
      inline def setPopupWidthUndefined: Self = StObject.set(x, "popupWidth", js.undefined)
    }
  }
  
  trait ParameterUpdateStateChangeEventArgs extends StObject {
    
    /** true if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** The parameter block id.
      */
    var containerId: js.UndefOr[String] = js.undefined
    
    /** true, if the event handled by user; otherwise, false.
      */
    var handled: js.UndefOr[Boolean] = js.undefined
    
    /** returns the report model
      */
    var model: js.UndefOr[js.Any] = js.undefined
    
    /** Its only to notify the the current parameter.
      */
    var name: js.UndefOr[String] = js.undefined
    
    /** The progress text that is displayed on the loading indicator.
      */
    var progressText: js.UndefOr[String] = js.undefined
    
    /** Its only to notify the current parameter prompt value.
      */
    var prompt: js.UndefOr[String] = js.undefined
    
    /** The processing state.
      */
    var state: js.UndefOr[String] = js.undefined
  }
  object ParameterUpdateStateChangeEventArgs {
    
    inline def apply(): ParameterUpdateStateChangeEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParameterUpdateStateChangeEventArgs]
    }
    
    extension [Self <: ParameterUpdateStateChangeEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setContainerId(value: String): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
      
      inline def setContainerIdUndefined: Self = StObject.set(x, "containerId", js.undefined)
      
      inline def setHandled(value: Boolean): Self = StObject.set(x, "handled", value.asInstanceOf[js.Any])
      
      inline def setHandledUndefined: Self = StObject.set(x, "handled", js.undefined)
      
      inline def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setProgressText(value: String): Self = StObject.set(x, "progressText", value.asInstanceOf[js.Any])
      
      inline def setProgressTextUndefined: Self = StObject.set(x, "progressText", js.undefined)
      
      inline def setPrompt(value: String): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
      
      inline def setPromptUndefined: Self = StObject.set(x, "prompt", js.undefined)
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    }
  }
  
  trait PrintProgressChangedEventArgs extends StObject {
    
    /** returns ReportViewer container Id.
      */
    var containerId: js.UndefOr[String] = js.undefined
    
    /** returns the currentPage value
      */
    var currentPage: js.UndefOr[String] = js.undefined
    
    /** true if the event should be handled; otherwise, false.
      */
    var handled: js.UndefOr[Boolean] = js.undefined
    
    /** returns the stage of export processing.
      */
    var stage: js.UndefOr[String] = js.undefined
    
    /** returns the totalPages value
      */
    var totalPages: js.UndefOr[String] = js.undefined
  }
  object PrintProgressChangedEventArgs {
    
    inline def apply(): PrintProgressChangedEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrintProgressChangedEventArgs]
    }
    
    extension [Self <: PrintProgressChangedEventArgs](x: Self) {
      
      inline def setContainerId(value: String): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
      
      inline def setContainerIdUndefined: Self = StObject.set(x, "containerId", js.undefined)
      
      inline def setCurrentPage(value: String): Self = StObject.set(x, "currentPage", value.asInstanceOf[js.Any])
      
      inline def setCurrentPageUndefined: Self = StObject.set(x, "currentPage", js.undefined)
      
      inline def setHandled(value: Boolean): Self = StObject.set(x, "handled", value.asInstanceOf[js.Any])
      
      inline def setHandledUndefined: Self = StObject.set(x, "handled", js.undefined)
      
      inline def setStage(value: String): Self = StObject.set(x, "stage", value.asInstanceOf[js.Any])
      
      inline def setStageUndefined: Self = StObject.set(x, "stage", js.undefined)
      
      inline def setTotalPages(value: String): Self = StObject.set(x, "totalPages", value.asInstanceOf[js.Any])
      
      inline def setTotalPagesUndefined: Self = StObject.set(x, "totalPages", js.undefined)
    }
  }
  
  trait RenderingBeginEventArgs extends StObject {
    
    /** true if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the report model.
      */
    var model: js.UndefOr[js.Any] = js.undefined
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object RenderingBeginEventArgs {
    
    inline def apply(): RenderingBeginEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RenderingBeginEventArgs]
    }
    
    extension [Self <: RenderingBeginEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait RenderingCompleteEventArgs extends StObject {
    
    /** true if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the report model.
      */
    var model: js.UndefOr[js.Any] = js.undefined
    
    /** returns the collection of parameters.
      */
    var reportParameters: js.UndefOr[js.Any] = js.undefined
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object RenderingCompleteEventArgs {
    
    inline def apply(): RenderingCompleteEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RenderingCompleteEventArgs]
    }
    
    extension [Self <: RenderingCompleteEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setReportParameters(value: js.Any): Self = StObject.set(x, "reportParameters", value.asInstanceOf[js.Any])
      
      inline def setReportParametersUndefined: Self = StObject.set(x, "reportParameters", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ReportErrorEventArgs extends StObject {
    
    /** true if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the error details.
      */
    var error: js.UndefOr[String] = js.undefined
    
    /** returns the report model.
      */
    var model: js.UndefOr[js.Any] = js.undefined
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ReportErrorEventArgs {
    
    inline def apply(): ReportErrorEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReportErrorEventArgs]
    }
    
    extension [Self <: ReportErrorEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ReportExportEventArgs extends StObject {
    
    /** true if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the report model.
      */
    var model: js.UndefOr[js.Any] = js.undefined
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ReportExportEventArgs {
    
    inline def apply(): ReportExportEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReportExportEventArgs]
    }
    
    extension [Self <: ReportExportEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ReportLoadedEventArgs extends StObject {
    
    /** true if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the report model.
      */
    var model: js.UndefOr[js.Any] = js.undefined
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ReportLoadedEventArgs {
    
    inline def apply(): ReportLoadedEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReportLoadedEventArgs]
    }
    
    extension [Self <: ReportLoadedEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ReportPrintEventArgs extends StObject {
    
    /** true if you have to load the external style file; otherwise, false.
      */
    var isStyleLoad: js.UndefOr[Boolean] = js.undefined
  }
  object ReportPrintEventArgs {
    
    inline def apply(): ReportPrintEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReportPrintEventArgs]
    }
    
    extension [Self <: ReportPrintEventArgs](x: Self) {
      
      inline def setIsStyleLoad(value: Boolean): Self = StObject.set(x, "isStyleLoad", value.asInstanceOf[js.Any])
      
      inline def setIsStyleLoadUndefined: Self = StObject.set(x, "isStyleLoad", js.undefined)
    }
  }
  
  trait ShowErrorEventArgs extends StObject {
    
    /** true if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the detailed error information.
      */
    var detail: js.UndefOr[String] = js.undefined
    
    /** returns the error code.
      */
    var errorCode: js.UndefOr[String] = js.undefined
    
    /** returns the error message.
      */
    var message: js.UndefOr[String] = js.undefined
  }
  object ShowErrorEventArgs {
    
    inline def apply(): ShowErrorEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShowErrorEventArgs]
    }
    
    extension [Self <: ShowErrorEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setDetail(value: String): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
      
      inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
      
      inline def setErrorCode(value: String): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
      
      inline def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
  
  trait ToolBarItemClickEventArgs extends StObject {
    
    /** returns the Toolbar item rendered index
      */
    var Index: js.UndefOr[String] = js.undefined
    
    /** returns the CSS class name specified for the toolbar item
      */
    var cssClass: js.UndefOr[String] = js.undefined
    
    /** returns the Toolbar item rendered group index
      */
    var groupIndex: js.UndefOr[String] = js.undefined
    
    /** returns the toolbar clicked item name .
      */
    var target: js.UndefOr[String] = js.undefined
    
    /** returns the Toolbar item value.
      */
    var value: js.UndefOr[String] = js.undefined
  }
  object ToolBarItemClickEventArgs {
    
    inline def apply(): ToolBarItemClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToolBarItemClickEventArgs]
    }
    
    extension [Self <: ToolBarItemClickEventArgs](x: Self) {
      
      inline def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      inline def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      inline def setGroupIndex(value: String): Self = StObject.set(x, "groupIndex", value.asInstanceOf[js.Any])
      
      inline def setGroupIndexUndefined: Self = StObject.set(x, "groupIndex", js.undefined)
      
      inline def setIndex(value: String): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "Index", js.undefined)
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait ToolbarRenderingEventArgs extends StObject
  
  trait ToolbarSettings extends StObject {
    
    /** Fires when user click on toolbar item in the toolbar.
      * @Default {empty}
      */
    var click: js.UndefOr[String] = js.undefined
    
    /** Add the custom icon groups to the toolbar.
      * @Default {empty}
      */
    var customGroups: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    /** Add the custom icon item to the toolbar.
      * @Default {empty}
      */
    var customItems: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    /** Specifies the toolbar items.
      * @Default {ej.ReportViewer.ToolbarItems.All}
      */
    var items: js.UndefOr[ToolbarItems | String] = js.undefined
    
    /** Shows or hides the toolbar.
      * @Default {true}
      */
    var showToolbar: js.UndefOr[Boolean] = js.undefined
    
    /** Shows or hides the tooltip of toolbar items.
      * @Default {true}
      */
    var showTooltip: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the toolbar template ID.
      * @Default {empty}
      */
    var templateId: js.UndefOr[String] = js.undefined
  }
  object ToolbarSettings {
    
    inline def apply(): ToolbarSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToolbarSettings]
    }
    
    extension [Self <: ToolbarSettings](x: Self) {
      
      inline def setClick(value: String): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
      
      inline def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
      
      inline def setCustomGroups(value: js.Array[js.Any]): Self = StObject.set(x, "customGroups", value.asInstanceOf[js.Any])
      
      inline def setCustomGroupsUndefined: Self = StObject.set(x, "customGroups", js.undefined)
      
      inline def setCustomGroupsVarargs(value: js.Any*): Self = StObject.set(x, "customGroups", js.Array(value :_*))
      
      inline def setCustomItems(value: js.Array[js.Any]): Self = StObject.set(x, "customItems", value.asInstanceOf[js.Any])
      
      inline def setCustomItemsUndefined: Self = StObject.set(x, "customItems", js.undefined)
      
      inline def setCustomItemsVarargs(value: js.Any*): Self = StObject.set(x, "customItems", js.Array(value :_*))
      
      inline def setItems(value: ToolbarItems | String): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setShowToolbar(value: Boolean): Self = StObject.set(x, "showToolbar", value.asInstanceOf[js.Any])
      
      inline def setShowToolbarUndefined: Self = StObject.set(x, "showToolbar", js.undefined)
      
      inline def setShowTooltip(value: Boolean): Self = StObject.set(x, "showTooltip", value.asInstanceOf[js.Any])
      
      inline def setShowTooltipUndefined: Self = StObject.set(x, "showTooltip", js.undefined)
      
      inline def setTemplateId(value: String): Self = StObject.set(x, "templateId", value.asInstanceOf[js.Any])
      
      inline def setTemplateIdUndefined: Self = StObject.set(x, "templateId", js.undefined)
    }
  }
  
  trait ViewReportClickEventArgs extends StObject {
    
    /** true if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the report model.
      */
    var model: js.UndefOr[js.Any] = js.undefined
    
    /** returns the parameter collection.
      */
    var parameters: js.UndefOr[js.Any] = js.undefined
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ViewReportClickEventArgs {
    
    inline def apply(): ViewReportClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ViewReportClickEventArgs]
    }
    
    extension [Self <: ViewReportClickEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setParameters(value: js.Any): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
