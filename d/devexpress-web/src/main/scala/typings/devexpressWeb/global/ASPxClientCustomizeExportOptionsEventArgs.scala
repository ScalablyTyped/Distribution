package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientWebDocumentViewer.CustomizeExportOptions and ASPxClientReportDesigner.PreviewCustomizeExportOptions events.
  */
@JSGlobal("ASPxClientCustomizeExportOptionsEventArgs")
@js.native
class ASPxClientCustomizeExportOptionsEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientCustomizeExportOptionsEventArgs {
  /**
    * Initializes a new instance of the ASPxClientCustomizeExportOptionsEventArgs class with the specified export options.
    * @param options An object that stores export options.
    */
  def this(options: js.Any) = this()
  
  /**
    * Returns the export options model for the specified export format. An export options model.
    * @param format An object that specifies the export format whose model should be returned.
    */
  /* CompleteClass */
  override def GetExportOptionsModel(format: js.Any): js.Any = js.native
  
  /**
    * Hides the entire <a href="https://devexpress.github.io/dotnet-eud/interface-elements-for-web/articles/document-viewer/exporting/export-a-document.html">Export Options</a> panel from the Web Document Viewer.
    */
  /* CompleteClass */
  override def HideExportOptionsPanel(): Unit = js.native
  
  /**
    * Hides the specified export format from the Export To drop-down list and the corresponding category from the <a href="https://devexpress.github.io/dotnet-eud/interface-elements-for-web/articles/document-viewer/exporting/export-a-document.html">Export Options</a> panel.
    * @param format An object that specifies the export format to hide.
    */
  /* CompleteClass */
  override def HideFormat(format: js.Any): Unit = js.native
  
  /**
    * Hides the specified options for the specified export format from the <a href="https://devexpress.github.io/dotnet-eud/interface-elements-for-web/articles/document-viewer/exporting/export-a-document.html">Export Options</a> panel.
    * @param format An object that specifies the export format whose options should be hidden.
    * @param properties An array of properties to hide.
    */
  /* CompleteClass */
  override def HideProperties(format: js.Any, properties: js.Any*): Unit = js.native
}
