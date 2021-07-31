package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientWebDocumentViewer.CustomizeExportOptions and ASPxClientReportDesigner.PreviewCustomizeExportOptions events.
  */
trait ASPxClientCustomizeExportOptionsEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Returns the export options model for the specified export format. An export options model.
    * @param format An object that specifies the export format whose model should be returned.
    */
  def GetExportOptionsModel(format: js.Any): js.Any
  
  /**
    * Hides the entire <a href="https://devexpress.github.io/dotnet-eud/interface-elements-for-web/articles/document-viewer/exporting/export-a-document.html">Export Options</a> panel from the Web Document Viewer.
    */
  def HideExportOptionsPanel(): Unit
  
  /**
    * Hides the specified export format from the Export To drop-down list and the corresponding category from the <a href="https://devexpress.github.io/dotnet-eud/interface-elements-for-web/articles/document-viewer/exporting/export-a-document.html">Export Options</a> panel.
    * @param format An object that specifies the export format to hide.
    */
  def HideFormat(format: js.Any): Unit
  
  /**
    * Hides the specified options for the specified export format from the <a href="https://devexpress.github.io/dotnet-eud/interface-elements-for-web/articles/document-viewer/exporting/export-a-document.html">Export Options</a> panel.
    * @param format An object that specifies the export format whose options should be hidden.
    * @param properties An array of properties to hide.
    */
  def HideProperties(format: js.Any, properties: js.Any*): Unit
}
object ASPxClientCustomizeExportOptionsEventArgs {
  
  @scala.inline
  def apply(
    GetExportOptionsModel: js.Any => js.Any,
    HideExportOptionsPanel: () => Unit,
    HideFormat: js.Any => Unit,
    HideProperties: (js.Any, /* repeated */ js.Any) => Unit
  ): ASPxClientCustomizeExportOptionsEventArgs = {
    val __obj = js.Dynamic.literal(GetExportOptionsModel = js.Any.fromFunction1(GetExportOptionsModel), HideExportOptionsPanel = js.Any.fromFunction0(HideExportOptionsPanel), HideFormat = js.Any.fromFunction1(HideFormat), HideProperties = js.Any.fromFunction2(HideProperties))
    __obj.asInstanceOf[ASPxClientCustomizeExportOptionsEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientCustomizeExportOptionsEventArgsMutableBuilder[Self <: ASPxClientCustomizeExportOptionsEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetExportOptionsModel(value: js.Any => js.Any): Self = StObject.set(x, "GetExportOptionsModel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHideExportOptionsPanel(value: () => Unit): Self = StObject.set(x, "HideExportOptionsPanel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHideFormat(value: js.Any => Unit): Self = StObject.set(x, "HideFormat", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHideProperties(value: (js.Any, /* repeated */ js.Any) => Unit): Self = StObject.set(x, "HideProperties", js.Any.fromFunction2(value))
  }
}
