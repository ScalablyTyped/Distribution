package typings.ejWebAll.ej

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReportViewer extends Widget_ {
  
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
    sealed trait Excel2007 extends ExcelFormats
    
    ///Specifies the Excel2010 property in ExcelFormats to get specified version of exported format.
    @js.native
    sealed trait Excel2010 extends ExcelFormats
    
    ///Specifies the Excel2013 property in ExcelFormats to get specified version of exported format.
    @js.native
    sealed trait Excel2013 extends ExcelFormats
    
    ///Specifies the Excel97to2003 property in ExcelFormats to get specified version of exported format.
    @js.native
    sealed trait Excel97to2003 extends ExcelFormats
  }
  
  @js.native
  sealed trait ExportOptions extends StObject
  @JSGlobal("ej.ReportViewer.ExportOptions")
  @js.native
  object ExportOptions extends StObject {
    
    ///Specifies the All property in ExportOptions to get all available options.
    @js.native
    sealed trait All extends ExportOptions
    
    ///Specifies the CSV property in ExportOptions to get CSV option.
    @js.native
    sealed trait CSV extends ExportOptions
    
    ///Specifies the customItems property in ExportOptions to get customItems option.
    @js.native
    sealed trait CustomItems extends ExportOptions
    
    ///Specifies the Excel property in ExportOptions to get Excel option.
    @js.native
    sealed trait Excel extends ExportOptions
    
    ///Specifies the Html property in ExportOptions to get Html option.
    @js.native
    sealed trait Html extends ExportOptions
    
    ///Specifies the PPT property in ExportOptions to get PPT option.
    @js.native
    sealed trait PPT extends ExportOptions
    
    ///Specifies the Pdf property in ExportOptions to get Pdf option.
    @js.native
    sealed trait Pdf extends ExportOptions
    
    ///Specifies the Word property in ExportOptions to get Word option.
    @js.native
    sealed trait Word extends ExportOptions
  }
  
  @js.native
  sealed trait Orientation extends StObject
  @JSGlobal("ej.ReportViewer.Orientation")
  @js.native
  object Orientation extends StObject {
    
    ///Specifies the Landscape property in pageSettings.orientation to get specified layout.
    @js.native
    sealed trait Landscape
      extends typings.ejWebAll.ej.ReportViewer.Orientation
    
    ///Specifies the portrait property in pageSettings.orientation to get specified layout.
    @js.native
    sealed trait Portrait
      extends typings.ejWebAll.ej.ReportViewer.Orientation
  }
  
  @js.native
  sealed trait PPTFormats extends StObject
  @JSGlobal("ej.ReportViewer.PPTFormats")
  @js.native
  object PPTFormats extends StObject {
    
    ///Represents PowerPoint2007 version.
    @js.native
    sealed trait PowerPoint2007 extends PPTFormats
    
    ///Represents PowerPoint2010 version.
    @js.native
    sealed trait PowerPoint2010 extends PPTFormats
    
    ///Represents PowerPoint2013 version.
    @js.native
    sealed trait PowerPoint2013 extends PPTFormats
    
    ///Represents PowerPoint97to2003 version.
    @js.native
    sealed trait PowerPoint97to2003 extends PPTFormats
  }
  
  @js.native
  sealed trait PaperSize extends StObject
  @JSGlobal("ej.ReportViewer.PaperSize")
  @js.native
  object PaperSize extends StObject {
    
    ///Specifies the A3 as value in pageSettings.paperSize to get specified size.
    @js.native
    sealed trait A3 extends PaperSize
    
    ///Specifies the B4(JIS) as value in pageSettings.paperSize to get specified size.
    @js.native
    sealed trait B4_JIS extends PaperSize
    
    ///Specifies the B5(JIS) as value in pageSettings.paperSize to get specified size.
    @js.native
    sealed trait B5_JIS extends PaperSize
    
    ///Specifies the Custom as value in pageSettings.paperSize to get specified size.
    @js.native
    sealed trait Custom extends PaperSize
    
    ///Specifies the Envelope #10 as value in pageSettings.paperSize to get specified size.
    @js.native
    sealed trait Envelope_10 extends PaperSize
    
    ///Specifies the Envelope as value in pageSettings.paperSize to get specified size.
    @js.native
    sealed trait Envelope_Monarch extends PaperSize
    
    ///Specifies the Executive as value in pageSettings.paperSize to get specified size.
    @js.native
    sealed trait Executive extends PaperSize
    
    ///Specifies the Legal as value in pageSettings.paperSize to get specified size.
    @js.native
    sealed trait Legal extends PaperSize
    
    ///Specifies the Letter as value in pageSettings.paperSize to get specified size.
    @js.native
    sealed trait Letter extends PaperSize
    
    ///Specifies the A4 as value in pageSettings.paperSize to get specified size.
    @js.native
    sealed trait Portrait extends PaperSize
    
    ///Specifies the Tabloid as value in pageSettings.paperSize to get specified size.
    @js.native
    sealed trait Tabloid extends PaperSize
  }
  
  @js.native
  sealed trait PrintOptions extends StObject
  @JSGlobal("ej.ReportViewer.PrintOptions")
  @js.native
  object PrintOptions extends StObject {
    
    ///Specifies the Default property in printOptions.
    @js.native
    sealed trait Default extends PrintOptions
    
    ///Specifies the NewTab property in printOptions.
    @js.native
    sealed trait NewTab extends PrintOptions
    
    ///Specifies the None property in printOptions.
    @js.native
    sealed trait None extends PrintOptions
  }
  
  @js.native
  sealed trait ProcessingMode extends StObject
  @JSGlobal("ej.ReportViewer.ProcessingMode")
  @js.native
  object ProcessingMode extends StObject {
    
    ///Specifies the Local property in processingMode.
    @js.native
    sealed trait Local extends ProcessingMode
    
    ///Specifies the Remote property in processingMode.
    @js.native
    sealed trait Remote extends ProcessingMode
  }
  
  @js.native
  sealed trait RenderMode extends StObject
  @JSGlobal("ej.ReportViewer.RenderMode")
  @js.native
  object RenderMode extends StObject {
    
    ///Specifies the Default property in RenderMode to get default output.
    @js.native
    sealed trait Default extends RenderMode
    
    ///Specifies the Desktop property in RenderMode to get specified output.
    @js.native
    sealed trait Desktop extends RenderMode
    
    ///Specifies the Mobile property in RenderMode to get specified output.
    @js.native
    sealed trait Mobile extends RenderMode
  }
  
  @js.native
  sealed trait ToolbarItems extends StObject
  @JSGlobal("ej.ReportViewer.ToolbarItems")
  @js.native
  object ToolbarItems extends StObject {
    
    ///Specifies the Export as value in ToolbarItems to get specified item.
    @js.native
    sealed trait Export extends ToolbarItems
    
    ///Specifies the FittoPage as value in ToolbarItems to get specified item.
    @js.native
    sealed trait FittoPage extends ToolbarItems
    
    ///Specifies the PageNavigation as value in ToolbarItems to get specified item.
    @js.native
    sealed trait PageNavigation extends ToolbarItems
    
    ///Specifies the PageSetup as value in ToolbarItems to get specified item.
    @js.native
    sealed trait PageSetup extends ToolbarItems
    
    ///Specifies the Parameters as value in ToolbarItems to get specified item.
    @js.native
    sealed trait Parameters extends ToolbarItems
    
    ///Specifies the Print as value in ToolbarItems to get specified item.
    @js.native
    sealed trait Print extends ToolbarItems
    
    ///Specifies the PrintLayout as value in ToolbarItems to get specified item.
    @js.native
    sealed trait PrintLayout extends ToolbarItems
    
    ///Specifies the Refresh as value in ToolbarItems to get specified item.
    @js.native
    sealed trait Refresh extends ToolbarItems
    
    ///Specifies the Zoom as value in ToolbarItems to get specified item.
    @js.native
    sealed trait Zoom extends ToolbarItems
  }
  
  @js.native
  sealed trait WordFormats extends StObject
  @JSGlobal("ej.ReportViewer.WordFormats")
  @js.native
  object WordFormats extends StObject {
    
    ///Specifies the Automatic property in WordFormats to get specified version of exported format.
    @js.native
    sealed trait Automatic extends WordFormats
    
    ///Specifies the DOCX property in WordFormats to get specified version of exported format.
    @js.native
    sealed trait DOCX extends WordFormats
    
    ///Specifies the Doc property in WordFormats to get specified version of exported format.
    @js.native
    sealed trait Doc extends WordFormats
    
    ///Specifies the Dot property in WordFormats to get specified version of exported format.
    @js.native
    sealed trait Dot extends WordFormats
    
    ///Specifies the EPUB property in WordFormats to get specified version of exported format.
    @js.native
    sealed trait EPUB extends WordFormats
    
    ///Specifies the HTML property in WordFormats to get specified version of exported format.
    @js.native
    sealed trait HTML extends WordFormats
    
    ///Specifies the RTF property in WordFormats to get specified version of exported format.
    @js.native
    sealed trait RTF extends WordFormats
    
    ///Specifies the Txt property in WordFormats to get specified version of exported format.
    @js.native
    sealed trait Txt extends WordFormats
    
    ///Specifies the Word2007 property in WordFormats to get specified version of exported format.
    @js.native
    sealed trait Word2007 extends WordFormats
    
    ///Specifies the Word2007Docm property in WordFormats to get specified version of exported format.
    @js.native
    sealed trait Word2007Docm extends WordFormats
    
    ///Specifies the Word2007Dotm property in WordFormats to get specified version of exported format.
    @js.native
    sealed trait Word2007Dotm extends WordFormats
    
    ///Specifies the Word2007Dotx property in WordFormats to get specified version of exported format.
    @js.native
    sealed trait Word2007Dotx extends WordFormats
    
    ///Specifies the Word2010 property in WordFormats to get specified version of exported format.
    @js.native
    sealed trait Word2010 extends WordFormats
    
    ///Specifies the Word2010Docm property in WordFormats to get specified version of exported format.
    @js.native
    sealed trait Word2010Docm extends WordFormats
    
    ///Specifies the Word2010Dotm property in WordFormats to get specified version of exported format.
    @js.native
    sealed trait Word2010Dotm extends WordFormats
    
    ///Specifies the Word2010Dotx property in WordFormats to get specified version of exported format.
    @js.native
    sealed trait Word2010Dotx extends WordFormats
    
    ///Specifies the Word2013 property in WordFormats to get specified version of exported format.
    @js.native
    sealed trait Word2013 extends WordFormats
    
    ///Specifies the Word2013Docm property in WordFormats to get specified version of exported format.
    @js.native
    sealed trait Word2013Docm extends WordFormats
    
    ///Specifies the Word2013Dotm property in WordFormats to get specified version of exported format.
    @js.native
    sealed trait Word2013Dotm extends WordFormats
    
    ///Specifies the Word2013Dotx property in WordFormats to get specified version of exported format.
    @js.native
    sealed trait Word2013Dotx extends WordFormats
    
    ///Specifies the XML property in WordFormats to get specified version of exported format.
    @js.native
    sealed trait XML extends WordFormats
  }
  
  @js.native
  trait AjaxBeforeLoadEventArgs extends StObject {
    
    /** Send the custom data.
      */
    var data: js.UndefOr[String] = js.native
    
    /** Send the headerReq collection.
      */
    var headerReq: js.UndefOr[js.Any] = js.native
    
    /** Send the headers collection.
      */
    var headers: js.UndefOr[js.Any] = js.native
    
    /** returns the reportViewerToken.
      */
    var reportViewerToken: js.UndefOr[String] = js.native
    
    /** returns the serviceAuthorizationToken.
      */
    var serviceAuthorizationToken: js.UndefOr[String] = js.native
  }
  object AjaxBeforeLoadEventArgs {
    
    @scala.inline
    def apply(): AjaxBeforeLoadEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AjaxBeforeLoadEventArgs]
    }
    
    @scala.inline
    implicit class AjaxBeforeLoadEventArgsMutableBuilder[Self <: AjaxBeforeLoadEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setHeaderReq(value: js.Any): Self = StObject.set(x, "headerReq", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderReqUndefined: Self = StObject.set(x, "headerReq", js.undefined)
      
      @scala.inline
      def setHeaders(value: js.Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setReportViewerToken(value: String): Self = StObject.set(x, "reportViewerToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReportViewerTokenUndefined: Self = StObject.set(x, "reportViewerToken", js.undefined)
      
      @scala.inline
      def setServiceAuthorizationToken(value: String): Self = StObject.set(x, "serviceAuthorizationToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceAuthorizationTokenUndefined: Self = StObject.set(x, "serviceAuthorizationToken", js.undefined)
    }
  }
  
  @js.native
  trait AjaxErrorEventArgs extends StObject {
    
    /** returns the error details
      */
    var msg: js.UndefOr[String] = js.native
  }
  object AjaxErrorEventArgs {
    
    @scala.inline
    def apply(): AjaxErrorEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AjaxErrorEventArgs]
    }
    
    @scala.inline
    implicit class AjaxErrorEventArgsMutableBuilder[Self <: AjaxErrorEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMsg(value: String): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsgUndefined: Self = StObject.set(x, "msg", js.undefined)
    }
  }
  
  @js.native
  trait AjaxSuccessEventArgs extends StObject {
    
    /** returns the success data.
      */
    var data: js.UndefOr[js.Any] = js.native
  }
  object AjaxSuccessEventArgs {
    
    @scala.inline
    def apply(): AjaxSuccessEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AjaxSuccessEventArgs]
    }
    
    @scala.inline
    implicit class AjaxSuccessEventArgsMutableBuilder[Self <: AjaxSuccessEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    }
  }
  
  @js.native
  trait DataSource extends StObject {
    
    /** Gets or sets the name of the data source.
      * @Default {empty}
      */
    var name: js.UndefOr[String] = js.native
    
    /** Gets or sets the values of data source.
      * @Default {[]}
      */
    var value: js.UndefOr[js.Array[_]] = js.native
  }
  object DataSource {
    
    @scala.inline
    def apply(): DataSource = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataSource]
    }
    
    @scala.inline
    implicit class DataSourceMutableBuilder[Self <: DataSource] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setValue(value: js.Array[_]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setValueVarargs(value: js.Any*): Self = StObject.set(x, "value", js.Array(value :_*))
    }
  }
  
  @js.native
  trait DestroyEventArgs extends StObject {
    
    /** true if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the report model.
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object DestroyEventArgs {
    
    @scala.inline
    def apply(): DestroyEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DestroyEventArgs]
    }
    
    @scala.inline
    implicit class DestroyEventArgsMutableBuilder[Self <: DestroyEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait DrillThroughEventArgs extends StObject {
    
    /** returns the actionInfo's parameters bookmarkLink, reportName, parameters.
      */
    var actionInfo: js.UndefOr[js.Any] = js.native
    
    /** true if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the report model.
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object DrillThroughEventArgs {
    
    @scala.inline
    def apply(): DrillThroughEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DrillThroughEventArgs]
    }
    
    @scala.inline
    implicit class DrillThroughEventArgsMutableBuilder[Self <: DrillThroughEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActionInfo(value: js.Any): Self = StObject.set(x, "actionInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionInfoUndefined: Self = StObject.set(x, "actionInfo", js.undefined)
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait ExportItemClickEventArgs extends StObject {
    
    /** returns the export format value.
      */
    var value: js.UndefOr[String] = js.native
  }
  object ExportItemClickEventArgs {
    
    @scala.inline
    def apply(): ExportItemClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExportItemClickEventArgs]
    }
    
    @scala.inline
    implicit class ExportItemClickEventArgsMutableBuilder[Self <: ExportItemClickEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait ExportProgressChangedEventArgs extends StObject {
    
    /** returns ReportViewer container Id.
      */
    var containerId: js.UndefOr[String] = js.native
    
    /** returns the export format
      */
    var format: js.UndefOr[String] = js.native
    
    /** true if the event should be handled; otherwise, false.
      */
    var handled: js.UndefOr[Boolean] = js.native
    
    /** returns the stage of export processing.
      */
    var stage: js.UndefOr[String] = js.native
  }
  object ExportProgressChangedEventArgs {
    
    @scala.inline
    def apply(): ExportProgressChangedEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExportProgressChangedEventArgs]
    }
    
    @scala.inline
    implicit class ExportProgressChangedEventArgsMutableBuilder[Self <: ExportProgressChangedEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContainerId(value: String): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerIdUndefined: Self = StObject.set(x, "containerId", js.undefined)
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setHandled(value: Boolean): Self = StObject.set(x, "handled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandledUndefined: Self = StObject.set(x, "handled", js.undefined)
      
      @scala.inline
      def setStage(value: String): Self = StObject.set(x, "stage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStageUndefined: Self = StObject.set(x, "stage", js.undefined)
    }
  }
  
  @js.native
  trait ExportSettings extends StObject {
    
    /** Add the custom icon item to the export options.
      * @Default {empty}
      */
    var customItems: js.UndefOr[js.Array[_]] = js.native
    
    /** Specifies the excel export format.
      * @Default {ej.ReportViewer.ExcelFormats.Excel97to2003}
      */
    var excelFormat: js.UndefOr[ExcelFormats | String] = js.native
    
    /** Specifies the export formats.
      * @Default {ej.ReportViewer.ExportOptions.All}
      */
    var exportOptions: js.UndefOr[ExportOptions | String] = js.native
    
    /** Specifies the ppt export format.
      * @Default {ej.ReportViewer.PPTFormats.PowerPoint97to2003}
      */
    var pptFormat: js.UndefOr[PPTFormats | String] = js.native
    
    /** Specifies the word export format.
      * @Default {ej.ReportViewer.WordFormats.Doc}
      */
    var wordFormat: js.UndefOr[WordFormats | String] = js.native
  }
  object ExportSettings {
    
    @scala.inline
    def apply(): ExportSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExportSettings]
    }
    
    @scala.inline
    implicit class ExportSettingsMutableBuilder[Self <: ExportSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustomItems(value: js.Array[_]): Self = StObject.set(x, "customItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomItemsUndefined: Self = StObject.set(x, "customItems", js.undefined)
      
      @scala.inline
      def setCustomItemsVarargs(value: js.Any*): Self = StObject.set(x, "customItems", js.Array(value :_*))
      
      @scala.inline
      def setExcelFormat(value: ExcelFormats | String): Self = StObject.set(x, "excelFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcelFormatUndefined: Self = StObject.set(x, "excelFormat", js.undefined)
      
      @scala.inline
      def setExportOptions(value: ExportOptions | String): Self = StObject.set(x, "exportOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExportOptionsUndefined: Self = StObject.set(x, "exportOptions", js.undefined)
      
      @scala.inline
      def setPptFormat(value: PPTFormats | String): Self = StObject.set(x, "pptFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPptFormatUndefined: Self = StObject.set(x, "pptFormat", js.undefined)
      
      @scala.inline
      def setWordFormat(value: WordFormats | String): Self = StObject.set(x, "wordFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWordFormatUndefined: Self = StObject.set(x, "wordFormat", js.undefined)
    }
  }
  
  @js.native
  trait HyperlinkEventArgs extends StObject {
    
    /** returns the actionInfo's hyperLink detail
      */
    var actionInfo: js.UndefOr[js.Any] = js.native
    
    /** true if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the report model.
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object HyperlinkEventArgs {
    
    @scala.inline
    def apply(): HyperlinkEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HyperlinkEventArgs]
    }
    
    @scala.inline
    implicit class HyperlinkEventArgsMutableBuilder[Self <: HyperlinkEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActionInfo(value: js.Any): Self = StObject.set(x, "actionInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionInfoUndefined: Self = StObject.set(x, "actionInfo", js.undefined)
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait Model extends StObject {
    
    /** Fires before the ajax request process started.
      */
    var ajaxBeforeLoad: js.UndefOr[js.Function1[/* e */ AjaxBeforeLoadEventArgs, Unit]] = js.native
    
    /** Fires when ajax request failed.
      */
    var ajaxError: js.UndefOr[js.Function1[/* e */ AjaxErrorEventArgs, Unit]] = js.native
    
    /** Fires when ajax post call succeed.
      */
    var ajaxSuccess: js.UndefOr[js.Function1[/* e */ AjaxSuccessEventArgs, Unit]] = js.native
    
    /** Enables and disables the rendering of Viewer when default values are specified for the parameters.
      * @Default {true}
      */
    var autoRender: js.UndefOr[Boolean] = js.native
    
    /** Gets or sets the list of data sources for the RDLC report.
      * @Default {[]}
      */
    var dataSources: js.UndefOr[js.Array[DataSource]] = js.native
    
    /** Fires when the report viewer is destroyed successfully.If you want to perform any operation after destroying the reportviewer control,you can make use of the destroy event.
      */
    var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.native
    
    /** Fires during drill through action done in report.If you want to perform any operation when a drill through action is performed, you can make use of the drillThrough event.
      */
    var drillThrough: js.UndefOr[js.Function1[/* e */ DrillThroughEventArgs, Unit]] = js.native
    
    /** Enables and disables the data source credential block scroller.
      * @Default {true}
      */
    var enableDatasourceBlockScroller: js.UndefOr[Boolean] = js.native
    
    /** Enables and disables the drop-down parameter search.
      * @Default {false}
      */
    var enableDropDownSearch: js.UndefOr[Boolean] = js.native
    
    /** Enables and disables the Error Notification bar.
      * @Default {true}
      */
    var enableNotificationBar: js.UndefOr[Boolean] = js.native
    
    /** Enables or disables the page cache of report.
      * @Default {false}
      */
    var enablePageCache: js.UndefOr[Boolean] = js.native
    
    /** Enables and disables the PageVirtualization.
      * @Default {false}
      */
    var enablePageVirtualization: js.UndefOr[Boolean] = js.native
    
    /** Enables and disables the parameter block scroller.
      * @Default {true}
      */
    var enableParameterBlockScroller: js.UndefOr[Boolean] = js.native
    
    /** Fires when the export items are clicked. To perform any operation when the export items are clicked, use the exportItemClick event.
      */
    var exportItemClick: js.UndefOr[js.Function1[/* e */ ExportItemClickEventArgs, Unit]] = js.native
    
    /** Fires when the export progress is changed. To perform any operation when the export progress is changed, use the exportProgressChanged event.
      */
    var exportProgressChanged: js.UndefOr[js.Function1[/* e */ ExportProgressChangedEventArgs, Unit]] = js.native
    
    /** Specifies the export settings.
      */
    var exportSettings: js.UndefOr[ExportSettings] = js.native
    
    /** Fires when the hyperlink action is performed in the report. To perform any operation during the hyperlink action, use the hyperlink event.
      */
    var hyperlink: js.UndefOr[js.Function1[/* e */ HyperlinkEventArgs, Unit]] = js.native
    
    /** When set to true, adapts the report layout to fit the screen size of devices on which it renders.
      * @Default {true}
      */
    var isResponsive: js.UndefOr[Boolean] = js.native
    
    /** Specifies the locale for report viewer.
      * @Default {en-US}
      */
    var locale: js.UndefOr[String] = js.native
    
    /** Specifies the page settings.
      */
    var pageSettings: js.UndefOr[PageSettings] = js.native
    
    /** Specifies the parameter settings.
      */
    var parameterSettings: js.UndefOr[ParameterSettings] = js.native
    
    /** Fires when the dependent parameter value is the parameter block. You can add custom user interface, loading indicator and modify the default progress text, using the
      * ParameterUpdateStateChange event.
      */
    var parameterUpdateStateChange: js.UndefOr[js.Function1[/* e */ ParameterUpdateStateChangeEventArgs, Unit]] = js.native
    
    /** Gets or sets the list of parameters associated with the report.
      * @Default {[]}
      */
    var parameters: js.UndefOr[js.Array[Parameter]] = js.native
    
    /** Enables and disables the print mode.
      * @Default {false}
      */
    var printMode: js.UndefOr[Boolean] = js.native
    
    /** Specifies the print option of the report.
      * @Default {ej.ReportViewer.PrintOptions.Default}
      */
    var printOption: js.UndefOr[PrintOptions | String] = js.native
    
    /** Fires when the print progress is changed. To perform any operation when the print progress is changed, use the printProgressChanged event.
      */
    var printProgressChanged: js.UndefOr[js.Function1[/* e */ PrintProgressChangedEventArgs, Unit]] = js.native
    
    /** Specifies the processing mode of the report.
      * @Default {ej.ReportViewer.ProcessingMode.Remote}
      */
    var processingMode: js.UndefOr[ProcessingMode | String] = js.native
    
    /** Specifies the render layout.
      * @Default {ej.ReportViewer.RenderMode.Default}
      */
    var renderMode: js.UndefOr[RenderMode | String] = js.native
    
    /** Fires before report rendering is completed.If you want to perform any operation before the rendering of report,you can make use of the renderingBegin event.
      */
    var renderingBegin: js.UndefOr[js.Function1[/* e */ RenderingBeginEventArgs, Unit]] = js.native
    
    /** Fires after report rendering completed.If you want to perform any operation after the rendering of report,you can make use of this renderingComplete event.
      */
    var renderingComplete: js.UndefOr[js.Function1[/* e */ RenderingCompleteEventArgs, Unit]] = js.native
    
    /** Fires when any error occurred while rendering the report.If you want to perform any operation when an error occurs in the report, you can make use of the reportError event.
      */
    var reportError: js.UndefOr[js.Function1[/* e */ ReportErrorEventArgs, Unit]] = js.native
    
    /** Fires when the report is being exported.If you want to perform any operation before exporting of report, you can make use of the reportExport event.
      */
    var reportExport: js.UndefOr[js.Function1[/* e */ ReportExportEventArgs, Unit]] = js.native
    
    /** Fires when the report is loaded.If you want to perform any operation after the successful loading of report, you can make use of the reportLoaded event.
      */
    var reportLoaded: js.UndefOr[js.Function1[/* e */ ReportLoadedEventArgs, Unit]] = js.native
    
    /** Gets or sets the path of the report file.
      * @Default {empty}
      */
    var reportPath: js.UndefOr[String] = js.native
    
    /** Fires when the report print action is performed in the report. To perform any operation during the report print action, use the ReportPrint event.
      */
    var reportPrint: js.UndefOr[js.Function1[/* e */ ReportPrintEventArgs, Unit]] = js.native
    
    /** Gets or sets the reports server URL.
      * @Default {empty}
      */
    var reportServerUrl: js.UndefOr[String] = js.native
    
    /** Specifies the report Web API service URL.
      * @Default {empty}
      */
    var reportServiceUrl: js.UndefOr[String] = js.native
    
    /** Specifies the token for authorizing reporting service url to process the reports.
      * @Default {empty}
      */
    var serviceAuthorizationToken: js.UndefOr[String] = js.native
    
    /** Fires when user clicks on a failed report item in the rendered report, before displaying error details dialog. If you want to show custom error detail or perform any action before
      * viewing error detail, you can make use of the showError event.
      */
    var showError: js.UndefOr[js.Function1[/* e */ ShowErrorEventArgs, Unit]] = js.native
    
    /** Gets or sets the showExceptionsInDialog for report viewer.
      * @Default {false}
      */
    var showExceptionsInDialog: js.UndefOr[Boolean] = js.native
    
    /** Render the ReportViewer height based on the report content size.
      * @Default {false}
      */
    var sizeToReportContent: js.UndefOr[Boolean] = js.native
    
    /** Fires when the toolbar items are clicked. To perform any operation when the toolbar items are clicked, use the toolBarItemClick event.
      */
    var toolBarItemClick: js.UndefOr[js.Function1[/* e */ ToolBarItemClickEventArgs, Unit]] = js.native
    
    /** This event will be triggered on rendering the Report Viewer toolbar.
      */
    var toolbarRendering: js.UndefOr[js.Function1[/* e */ ToolbarRenderingEventArgs, Unit]] = js.native
    
    /** Specifies the toolbar settings.
      */
    var toolbarSettings: js.UndefOr[ToolbarSettings] = js.native
    
    /** Fires when click the View Report Button.
      */
    var viewReportClick: js.UndefOr[js.Function1[/* e */ ViewReportClickEventArgs, Unit]] = js.native
    
    /** Gets or sets the zoom factor for report viewer.
      * @Default {1}
      */
    var zoomFactor: js.UndefOr[Double] = js.native
  }
  object Model {
    
    @scala.inline
    def apply(): typings.ejWebAll.ej.ReportViewer.Model = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.ejWebAll.ej.ReportViewer.Model]
    }
    
    @scala.inline
    implicit class ModelMutableBuilder[Self <: typings.ejWebAll.ej.ReportViewer.Model] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAjaxBeforeLoad(value: /* e */ AjaxBeforeLoadEventArgs => Unit): Self = StObject.set(x, "ajaxBeforeLoad", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAjaxBeforeLoadUndefined: Self = StObject.set(x, "ajaxBeforeLoad", js.undefined)
      
      @scala.inline
      def setAjaxError(value: /* e */ AjaxErrorEventArgs => Unit): Self = StObject.set(x, "ajaxError", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAjaxErrorUndefined: Self = StObject.set(x, "ajaxError", js.undefined)
      
      @scala.inline
      def setAjaxSuccess(value: /* e */ AjaxSuccessEventArgs => Unit): Self = StObject.set(x, "ajaxSuccess", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAjaxSuccessUndefined: Self = StObject.set(x, "ajaxSuccess", js.undefined)
      
      @scala.inline
      def setAutoRender(value: Boolean): Self = StObject.set(x, "autoRender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoRenderUndefined: Self = StObject.set(x, "autoRender", js.undefined)
      
      @scala.inline
      def setDataSources(value: js.Array[DataSource]): Self = StObject.set(x, "dataSources", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataSourcesUndefined: Self = StObject.set(x, "dataSources", js.undefined)
      
      @scala.inline
      def setDataSourcesVarargs(value: DataSource*): Self = StObject.set(x, "dataSources", js.Array(value :_*))
      
      @scala.inline
      def setDestroy(value: /* e */ DestroyEventArgs => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      @scala.inline
      def setDrillThrough(value: /* e */ DrillThroughEventArgs => Unit): Self = StObject.set(x, "drillThrough", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDrillThroughUndefined: Self = StObject.set(x, "drillThrough", js.undefined)
      
      @scala.inline
      def setEnableDatasourceBlockScroller(value: Boolean): Self = StObject.set(x, "enableDatasourceBlockScroller", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableDatasourceBlockScrollerUndefined: Self = StObject.set(x, "enableDatasourceBlockScroller", js.undefined)
      
      @scala.inline
      def setEnableDropDownSearch(value: Boolean): Self = StObject.set(x, "enableDropDownSearch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableDropDownSearchUndefined: Self = StObject.set(x, "enableDropDownSearch", js.undefined)
      
      @scala.inline
      def setEnableNotificationBar(value: Boolean): Self = StObject.set(x, "enableNotificationBar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableNotificationBarUndefined: Self = StObject.set(x, "enableNotificationBar", js.undefined)
      
      @scala.inline
      def setEnablePageCache(value: Boolean): Self = StObject.set(x, "enablePageCache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnablePageCacheUndefined: Self = StObject.set(x, "enablePageCache", js.undefined)
      
      @scala.inline
      def setEnablePageVirtualization(value: Boolean): Self = StObject.set(x, "enablePageVirtualization", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnablePageVirtualizationUndefined: Self = StObject.set(x, "enablePageVirtualization", js.undefined)
      
      @scala.inline
      def setEnableParameterBlockScroller(value: Boolean): Self = StObject.set(x, "enableParameterBlockScroller", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableParameterBlockScrollerUndefined: Self = StObject.set(x, "enableParameterBlockScroller", js.undefined)
      
      @scala.inline
      def setExportItemClick(value: /* e */ ExportItemClickEventArgs => Unit): Self = StObject.set(x, "exportItemClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setExportItemClickUndefined: Self = StObject.set(x, "exportItemClick", js.undefined)
      
      @scala.inline
      def setExportProgressChanged(value: /* e */ ExportProgressChangedEventArgs => Unit): Self = StObject.set(x, "exportProgressChanged", js.Any.fromFunction1(value))
      
      @scala.inline
      def setExportProgressChangedUndefined: Self = StObject.set(x, "exportProgressChanged", js.undefined)
      
      @scala.inline
      def setExportSettings(value: ExportSettings): Self = StObject.set(x, "exportSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExportSettingsUndefined: Self = StObject.set(x, "exportSettings", js.undefined)
      
      @scala.inline
      def setHyperlink(value: /* e */ HyperlinkEventArgs => Unit): Self = StObject.set(x, "hyperlink", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHyperlinkUndefined: Self = StObject.set(x, "hyperlink", js.undefined)
      
      @scala.inline
      def setIsResponsive(value: Boolean): Self = StObject.set(x, "isResponsive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsResponsiveUndefined: Self = StObject.set(x, "isResponsive", js.undefined)
      
      @scala.inline
      def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setPageSettings(value: PageSettings): Self = StObject.set(x, "pageSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageSettingsUndefined: Self = StObject.set(x, "pageSettings", js.undefined)
      
      @scala.inline
      def setParameterSettings(value: ParameterSettings): Self = StObject.set(x, "parameterSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParameterSettingsUndefined: Self = StObject.set(x, "parameterSettings", js.undefined)
      
      @scala.inline
      def setParameterUpdateStateChange(value: /* e */ ParameterUpdateStateChangeEventArgs => Unit): Self = StObject.set(x, "parameterUpdateStateChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setParameterUpdateStateChangeUndefined: Self = StObject.set(x, "parameterUpdateStateChange", js.undefined)
      
      @scala.inline
      def setParameters(value: js.Array[Parameter]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
      
      @scala.inline
      def setParametersVarargs(value: Parameter*): Self = StObject.set(x, "parameters", js.Array(value :_*))
      
      @scala.inline
      def setPrintMode(value: Boolean): Self = StObject.set(x, "printMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrintModeUndefined: Self = StObject.set(x, "printMode", js.undefined)
      
      @scala.inline
      def setPrintOption(value: PrintOptions | String): Self = StObject.set(x, "printOption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrintOptionUndefined: Self = StObject.set(x, "printOption", js.undefined)
      
      @scala.inline
      def setPrintProgressChanged(value: /* e */ PrintProgressChangedEventArgs => Unit): Self = StObject.set(x, "printProgressChanged", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPrintProgressChangedUndefined: Self = StObject.set(x, "printProgressChanged", js.undefined)
      
      @scala.inline
      def setProcessingMode(value: ProcessingMode | String): Self = StObject.set(x, "processingMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProcessingModeUndefined: Self = StObject.set(x, "processingMode", js.undefined)
      
      @scala.inline
      def setRenderMode(value: RenderMode | String): Self = StObject.set(x, "renderMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderModeUndefined: Self = StObject.set(x, "renderMode", js.undefined)
      
      @scala.inline
      def setRenderingBegin(value: /* e */ RenderingBeginEventArgs => Unit): Self = StObject.set(x, "renderingBegin", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderingBeginUndefined: Self = StObject.set(x, "renderingBegin", js.undefined)
      
      @scala.inline
      def setRenderingComplete(value: /* e */ RenderingCompleteEventArgs => Unit): Self = StObject.set(x, "renderingComplete", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderingCompleteUndefined: Self = StObject.set(x, "renderingComplete", js.undefined)
      
      @scala.inline
      def setReportError(value: /* e */ ReportErrorEventArgs => Unit): Self = StObject.set(x, "reportError", js.Any.fromFunction1(value))
      
      @scala.inline
      def setReportErrorUndefined: Self = StObject.set(x, "reportError", js.undefined)
      
      @scala.inline
      def setReportExport(value: /* e */ ReportExportEventArgs => Unit): Self = StObject.set(x, "reportExport", js.Any.fromFunction1(value))
      
      @scala.inline
      def setReportExportUndefined: Self = StObject.set(x, "reportExport", js.undefined)
      
      @scala.inline
      def setReportLoaded(value: /* e */ ReportLoadedEventArgs => Unit): Self = StObject.set(x, "reportLoaded", js.Any.fromFunction1(value))
      
      @scala.inline
      def setReportLoadedUndefined: Self = StObject.set(x, "reportLoaded", js.undefined)
      
      @scala.inline
      def setReportPath(value: String): Self = StObject.set(x, "reportPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReportPathUndefined: Self = StObject.set(x, "reportPath", js.undefined)
      
      @scala.inline
      def setReportPrint(value: /* e */ ReportPrintEventArgs => Unit): Self = StObject.set(x, "reportPrint", js.Any.fromFunction1(value))
      
      @scala.inline
      def setReportPrintUndefined: Self = StObject.set(x, "reportPrint", js.undefined)
      
      @scala.inline
      def setReportServerUrl(value: String): Self = StObject.set(x, "reportServerUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReportServerUrlUndefined: Self = StObject.set(x, "reportServerUrl", js.undefined)
      
      @scala.inline
      def setReportServiceUrl(value: String): Self = StObject.set(x, "reportServiceUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReportServiceUrlUndefined: Self = StObject.set(x, "reportServiceUrl", js.undefined)
      
      @scala.inline
      def setServiceAuthorizationToken(value: String): Self = StObject.set(x, "serviceAuthorizationToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceAuthorizationTokenUndefined: Self = StObject.set(x, "serviceAuthorizationToken", js.undefined)
      
      @scala.inline
      def setShowError(value: /* e */ ShowErrorEventArgs => Unit): Self = StObject.set(x, "showError", js.Any.fromFunction1(value))
      
      @scala.inline
      def setShowErrorUndefined: Self = StObject.set(x, "showError", js.undefined)
      
      @scala.inline
      def setShowExceptionsInDialog(value: Boolean): Self = StObject.set(x, "showExceptionsInDialog", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowExceptionsInDialogUndefined: Self = StObject.set(x, "showExceptionsInDialog", js.undefined)
      
      @scala.inline
      def setSizeToReportContent(value: Boolean): Self = StObject.set(x, "sizeToReportContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeToReportContentUndefined: Self = StObject.set(x, "sizeToReportContent", js.undefined)
      
      @scala.inline
      def setToolBarItemClick(value: /* e */ ToolBarItemClickEventArgs => Unit): Self = StObject.set(x, "toolBarItemClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setToolBarItemClickUndefined: Self = StObject.set(x, "toolBarItemClick", js.undefined)
      
      @scala.inline
      def setToolbarRendering(value: /* e */ ToolbarRenderingEventArgs => Unit): Self = StObject.set(x, "toolbarRendering", js.Any.fromFunction1(value))
      
      @scala.inline
      def setToolbarRenderingUndefined: Self = StObject.set(x, "toolbarRendering", js.undefined)
      
      @scala.inline
      def setToolbarSettings(value: ToolbarSettings): Self = StObject.set(x, "toolbarSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToolbarSettingsUndefined: Self = StObject.set(x, "toolbarSettings", js.undefined)
      
      @scala.inline
      def setViewReportClick(value: /* e */ ViewReportClickEventArgs => Unit): Self = StObject.set(x, "viewReportClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setViewReportClickUndefined: Self = StObject.set(x, "viewReportClick", js.undefined)
      
      @scala.inline
      def setZoomFactor(value: Double): Self = StObject.set(x, "zoomFactor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomFactorUndefined: Self = StObject.set(x, "zoomFactor", js.undefined)
    }
  }
  
  @js.native
  trait PageSettings extends StObject {
    
    /** Specifies the print layout orientation.
      * @Default {null}
      */
    var orientation: js.UndefOr[typings.ejWebAll.ej.Orientation | String] = js.native
    
    /** Specifies the paper size of print layout.
      * @Default {null}
      */
    var paperSize: js.UndefOr[PaperSize | String] = js.native
  }
  object PageSettings {
    
    @scala.inline
    def apply(): PageSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PageSettings]
    }
    
    @scala.inline
    implicit class PageSettingsMutableBuilder[Self <: PageSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOrientation(value: typings.ejWebAll.ej.Orientation | String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      @scala.inline
      def setPaperSize(value: PaperSize | String): Self = StObject.set(x, "paperSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaperSizeUndefined: Self = StObject.set(x, "paperSize", js.undefined)
    }
  }
  
  @js.native
  trait Parameter extends StObject {
    
    /** Gets or sets the parameter labels.
      * @Default {null}
      */
    var labels: js.UndefOr[js.Array[_]] = js.native
    
    /** Gets or sets the name of the parameter.
      * @Default {empty}
      */
    var name: js.UndefOr[String] = js.native
    
    /** Gets or sets whether the parameter allows nullable value or not.
      * @Default {false}
      */
    var nullable: js.UndefOr[Boolean] = js.native
    
    /** Gets or sets the prompt message associated with the specified parameter.
      * @Default {empty}
      */
    var prompt: js.UndefOr[String] = js.native
    
    /** Gets or sets the parameter values.
      * @Default {[]}
      */
    var values: js.UndefOr[js.Array[_]] = js.native
  }
  object Parameter {
    
    @scala.inline
    def apply(): Parameter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Parameter]
    }
    
    @scala.inline
    implicit class ParameterMutableBuilder[Self <: Parameter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLabels(value: js.Array[_]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
      
      @scala.inline
      def setLabelsVarargs(value: js.Any*): Self = StObject.set(x, "labels", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setNullable(value: Boolean): Self = StObject.set(x, "nullable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNullableUndefined: Self = StObject.set(x, "nullable", js.undefined)
      
      @scala.inline
      def setPrompt(value: String): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPromptUndefined: Self = StObject.set(x, "prompt", js.undefined)
      
      @scala.inline
      def setValues(value: js.Array[_]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
      
      @scala.inline
      def setValuesVarargs(value: js.Any*): Self = StObject.set(x, "values", js.Array(value :_*))
    }
  }
  
  @js.native
  trait ParameterSettings extends StObject {
    
    /** Sets the separator when the multiSelectMode with delimiter option or checkbox is enabled with the dropdown. When you enter the delimiter value, the texts after the delimiter are
      * considered as a separate word or query. The delimiter string is a single character and must be a symbol. Mostly, the delimiter symbol is used as comma (,) or semi-colon (;) or
      * any other special character.
      * @Default {,}
      */
    var delimiterChar: js.UndefOr[String] = js.native
    
    /** Specifies the width of the parameter item. By default, the item width value is set as &quot;185px&quot;.
      * @Default {185px}
      */
    var itemWidth: js.UndefOr[String] = js.native
    
    /** Specifies the width of the parameter label. By default, the parameter label width value is set as &quot;110px&quot;.
      * @Default {110px}
      */
    var labelWidth: js.UndefOr[String] = js.native
    
    /** Specifies the height of the combobox parameter popup list. By default, the popup height value is &quot;152px&quot;.
      * @Default {152px}
      */
    var popupHeight: js.UndefOr[String] = js.native
    
    /** Specifies the width of the combobox parameter popup list. By default, the popup width sets based on the width of the component.
      * @Default {auto}
      */
    var popupWidth: js.UndefOr[String] = js.native
  }
  object ParameterSettings {
    
    @scala.inline
    def apply(): ParameterSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParameterSettings]
    }
    
    @scala.inline
    implicit class ParameterSettingsMutableBuilder[Self <: ParameterSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelimiterChar(value: String): Self = StObject.set(x, "delimiterChar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelimiterCharUndefined: Self = StObject.set(x, "delimiterChar", js.undefined)
      
      @scala.inline
      def setItemWidth(value: String): Self = StObject.set(x, "itemWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemWidthUndefined: Self = StObject.set(x, "itemWidth", js.undefined)
      
      @scala.inline
      def setLabelWidth(value: String): Self = StObject.set(x, "labelWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelWidthUndefined: Self = StObject.set(x, "labelWidth", js.undefined)
      
      @scala.inline
      def setPopupHeight(value: String): Self = StObject.set(x, "popupHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopupHeightUndefined: Self = StObject.set(x, "popupHeight", js.undefined)
      
      @scala.inline
      def setPopupWidth(value: String): Self = StObject.set(x, "popupWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopupWidthUndefined: Self = StObject.set(x, "popupWidth", js.undefined)
    }
  }
  
  @js.native
  trait ParameterUpdateStateChangeEventArgs extends StObject {
    
    /** true if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** The parameter block id.
      */
    var containerId: js.UndefOr[String] = js.native
    
    /** true, if the event handled by user; otherwise, false.
      */
    var handled: js.UndefOr[Boolean] = js.native
    
    /** returns the report model
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Its only to notify the the current parameter.
      */
    var name: js.UndefOr[String] = js.native
    
    /** The progress text that is displayed on the loading indicator.
      */
    var progressText: js.UndefOr[String] = js.native
    
    /** Its only to notify the current parameter prompt value.
      */
    var prompt: js.UndefOr[String] = js.native
    
    /** The processing state.
      */
    var state: js.UndefOr[String] = js.native
  }
  object ParameterUpdateStateChangeEventArgs {
    
    @scala.inline
    def apply(): ParameterUpdateStateChangeEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParameterUpdateStateChangeEventArgs]
    }
    
    @scala.inline
    implicit class ParameterUpdateStateChangeEventArgsMutableBuilder[Self <: ParameterUpdateStateChangeEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setContainerId(value: String): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerIdUndefined: Self = StObject.set(x, "containerId", js.undefined)
      
      @scala.inline
      def setHandled(value: Boolean): Self = StObject.set(x, "handled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandledUndefined: Self = StObject.set(x, "handled", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setProgressText(value: String): Self = StObject.set(x, "progressText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgressTextUndefined: Self = StObject.set(x, "progressText", js.undefined)
      
      @scala.inline
      def setPrompt(value: String): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPromptUndefined: Self = StObject.set(x, "prompt", js.undefined)
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    }
  }
  
  @js.native
  trait PrintProgressChangedEventArgs extends StObject {
    
    /** returns ReportViewer container Id.
      */
    var containerId: js.UndefOr[String] = js.native
    
    /** returns the currentPage value
      */
    var currentPage: js.UndefOr[String] = js.native
    
    /** true if the event should be handled; otherwise, false.
      */
    var handled: js.UndefOr[Boolean] = js.native
    
    /** returns the stage of export processing.
      */
    var stage: js.UndefOr[String] = js.native
    
    /** returns the totalPages value
      */
    var totalPages: js.UndefOr[String] = js.native
  }
  object PrintProgressChangedEventArgs {
    
    @scala.inline
    def apply(): PrintProgressChangedEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrintProgressChangedEventArgs]
    }
    
    @scala.inline
    implicit class PrintProgressChangedEventArgsMutableBuilder[Self <: PrintProgressChangedEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContainerId(value: String): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerIdUndefined: Self = StObject.set(x, "containerId", js.undefined)
      
      @scala.inline
      def setCurrentPage(value: String): Self = StObject.set(x, "currentPage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentPageUndefined: Self = StObject.set(x, "currentPage", js.undefined)
      
      @scala.inline
      def setHandled(value: Boolean): Self = StObject.set(x, "handled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandledUndefined: Self = StObject.set(x, "handled", js.undefined)
      
      @scala.inline
      def setStage(value: String): Self = StObject.set(x, "stage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStageUndefined: Self = StObject.set(x, "stage", js.undefined)
      
      @scala.inline
      def setTotalPages(value: String): Self = StObject.set(x, "totalPages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalPagesUndefined: Self = StObject.set(x, "totalPages", js.undefined)
    }
  }
  
  @js.native
  trait RenderingBeginEventArgs extends StObject {
    
    /** true if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the report model.
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object RenderingBeginEventArgs {
    
    @scala.inline
    def apply(): RenderingBeginEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RenderingBeginEventArgs]
    }
    
    @scala.inline
    implicit class RenderingBeginEventArgsMutableBuilder[Self <: RenderingBeginEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait RenderingCompleteEventArgs extends StObject {
    
    /** true if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the report model.
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** returns the collection of parameters.
      */
    var reportParameters: js.UndefOr[js.Any] = js.native
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object RenderingCompleteEventArgs {
    
    @scala.inline
    def apply(): RenderingCompleteEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RenderingCompleteEventArgs]
    }
    
    @scala.inline
    implicit class RenderingCompleteEventArgsMutableBuilder[Self <: RenderingCompleteEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setReportParameters(value: js.Any): Self = StObject.set(x, "reportParameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReportParametersUndefined: Self = StObject.set(x, "reportParameters", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait ReportErrorEventArgs extends StObject {
    
    /** true if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the error details.
      */
    var error: js.UndefOr[String] = js.native
    
    /** returns the report model.
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object ReportErrorEventArgs {
    
    @scala.inline
    def apply(): ReportErrorEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReportErrorEventArgs]
    }
    
    @scala.inline
    implicit class ReportErrorEventArgsMutableBuilder[Self <: ReportErrorEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait ReportExportEventArgs extends StObject {
    
    /** true if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the report model.
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object ReportExportEventArgs {
    
    @scala.inline
    def apply(): ReportExportEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReportExportEventArgs]
    }
    
    @scala.inline
    implicit class ReportExportEventArgsMutableBuilder[Self <: ReportExportEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait ReportLoadedEventArgs extends StObject {
    
    /** true if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the report model.
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object ReportLoadedEventArgs {
    
    @scala.inline
    def apply(): ReportLoadedEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReportLoadedEventArgs]
    }
    
    @scala.inline
    implicit class ReportLoadedEventArgsMutableBuilder[Self <: ReportLoadedEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait ReportPrintEventArgs extends StObject {
    
    /** true if you have to load the external style file; otherwise, false.
      */
    var isStyleLoad: js.UndefOr[Boolean] = js.native
  }
  object ReportPrintEventArgs {
    
    @scala.inline
    def apply(): ReportPrintEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReportPrintEventArgs]
    }
    
    @scala.inline
    implicit class ReportPrintEventArgsMutableBuilder[Self <: ReportPrintEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsStyleLoad(value: Boolean): Self = StObject.set(x, "isStyleLoad", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsStyleLoadUndefined: Self = StObject.set(x, "isStyleLoad", js.undefined)
    }
  }
  
  @js.native
  trait ShowErrorEventArgs extends StObject {
    
    /** true if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the detailed error information.
      */
    var detail: js.UndefOr[String] = js.native
    
    /** returns the error code.
      */
    var errorCode: js.UndefOr[String] = js.native
    
    /** returns the error message.
      */
    var message: js.UndefOr[String] = js.native
  }
  object ShowErrorEventArgs {
    
    @scala.inline
    def apply(): ShowErrorEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShowErrorEventArgs]
    }
    
    @scala.inline
    implicit class ShowErrorEventArgsMutableBuilder[Self <: ShowErrorEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setDetail(value: String): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
      
      @scala.inline
      def setErrorCode(value: String): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
  
  @js.native
  trait ToolBarItemClickEventArgs extends StObject {
    
    /** returns the Toolbar item rendered index
      */
    var Index: js.UndefOr[String] = js.native
    
    /** returns the CSS class name specified for the toolbar item
      */
    var cssClass: js.UndefOr[String] = js.native
    
    /** returns the Toolbar item rendered group index
      */
    var groupIndex: js.UndefOr[String] = js.native
    
    /** returns the toolbar clicked item name .
      */
    var target: js.UndefOr[String] = js.native
    
    /** returns the Toolbar item value.
      */
    var value: js.UndefOr[String] = js.native
  }
  object ToolBarItemClickEventArgs {
    
    @scala.inline
    def apply(): ToolBarItemClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToolBarItemClickEventArgs]
    }
    
    @scala.inline
    implicit class ToolBarItemClickEventArgsMutableBuilder[Self <: ToolBarItemClickEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      @scala.inline
      def setGroupIndex(value: String): Self = StObject.set(x, "groupIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupIndexUndefined: Self = StObject.set(x, "groupIndex", js.undefined)
      
      @scala.inline
      def setIndex(value: String): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexUndefined: Self = StObject.set(x, "Index", js.undefined)
      
      @scala.inline
      def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait ToolbarRenderingEventArgs extends StObject
  
  @js.native
  trait ToolbarSettings extends StObject {
    
    /** Fires when user click on toolbar item in the toolbar.
      * @Default {empty}
      */
    var click: js.UndefOr[String] = js.native
    
    /** Add the custom icon groups to the toolbar.
      * @Default {empty}
      */
    var customGroups: js.UndefOr[js.Array[_]] = js.native
    
    /** Add the custom icon item to the toolbar.
      * @Default {empty}
      */
    var customItems: js.UndefOr[js.Array[_]] = js.native
    
    /** Specifies the toolbar items.
      * @Default {ej.ReportViewer.ToolbarItems.All}
      */
    var items: js.UndefOr[ToolbarItems | String] = js.native
    
    /** Shows or hides the toolbar.
      * @Default {true}
      */
    var showToolbar: js.UndefOr[Boolean] = js.native
    
    /** Shows or hides the tooltip of toolbar items.
      * @Default {true}
      */
    var showTooltip: js.UndefOr[Boolean] = js.native
    
    /** Specifies the toolbar template ID.
      * @Default {empty}
      */
    var templateId: js.UndefOr[String] = js.native
  }
  object ToolbarSettings {
    
    @scala.inline
    def apply(): ToolbarSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToolbarSettings]
    }
    
    @scala.inline
    implicit class ToolbarSettingsMutableBuilder[Self <: ToolbarSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClick(value: String): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
      
      @scala.inline
      def setCustomGroups(value: js.Array[_]): Self = StObject.set(x, "customGroups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomGroupsUndefined: Self = StObject.set(x, "customGroups", js.undefined)
      
      @scala.inline
      def setCustomGroupsVarargs(value: js.Any*): Self = StObject.set(x, "customGroups", js.Array(value :_*))
      
      @scala.inline
      def setCustomItems(value: js.Array[_]): Self = StObject.set(x, "customItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomItemsUndefined: Self = StObject.set(x, "customItems", js.undefined)
      
      @scala.inline
      def setCustomItemsVarargs(value: js.Any*): Self = StObject.set(x, "customItems", js.Array(value :_*))
      
      @scala.inline
      def setItems(value: ToolbarItems | String): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      @scala.inline
      def setShowToolbar(value: Boolean): Self = StObject.set(x, "showToolbar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowToolbarUndefined: Self = StObject.set(x, "showToolbar", js.undefined)
      
      @scala.inline
      def setShowTooltip(value: Boolean): Self = StObject.set(x, "showTooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowTooltipUndefined: Self = StObject.set(x, "showTooltip", js.undefined)
      
      @scala.inline
      def setTemplateId(value: String): Self = StObject.set(x, "templateId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateIdUndefined: Self = StObject.set(x, "templateId", js.undefined)
    }
  }
  
  @js.native
  trait ViewReportClickEventArgs extends StObject {
    
    /** true if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the report model.
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** returns the parameter collection.
      */
    var parameters: js.UndefOr[js.Any] = js.native
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object ViewReportClickEventArgs {
    
    @scala.inline
    def apply(): ViewReportClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ViewReportClickEventArgs]
    }
    
    @scala.inline
    implicit class ViewReportClickEventArgsMutableBuilder[Self <: ViewReportClickEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setParameters(value: js.Any): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
