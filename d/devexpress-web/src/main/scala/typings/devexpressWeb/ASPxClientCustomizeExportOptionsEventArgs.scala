package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientWebDocumentViewer.CustomizeExportOptions and ASPxClientReportDesigner.PreviewCustomizeExportOptions events.
  */
@js.native
trait ASPxClientCustomizeExportOptionsEventArgs extends ASPxClientEventArgs {
  /**
    * Returns the export options model for the specified export format. An export options model.
    * @param format An object that specifies the export format whose model should be returned.
    */
  def GetExportOptionsModel(format: js.Any): js.Any = js.native
  /**
    * Hides the entire <a href="https://devexpress.github.io/dotnet-eud/interface-elements-for-web/articles/document-viewer/exporting/export-a-document.html">Export Options</a> panel from the Web Document Viewer.
    */
  def HideExportOptionsPanel(): Unit = js.native
  /**
    * Hides the specified export format from the Export To drop-down list and the corresponding category from the <a href="https://devexpress.github.io/dotnet-eud/interface-elements-for-web/articles/document-viewer/exporting/export-a-document.html">Export Options</a> panel.
    * @param format An object that specifies the export format to hide.
    */
  def HideFormat(format: js.Any): Unit = js.native
  /**
    * Hides the specified options for the specified export format from the <a href="https://devexpress.github.io/dotnet-eud/interface-elements-for-web/articles/document-viewer/exporting/export-a-document.html">Export Options</a> panel.
    * @param format An object that specifies the export format whose options should be hidden.
    * @param properties An array of properties to hide.
    */
  def HideProperties(format: js.Any, properties: js.Any*): Unit = js.native
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
  implicit class ASPxClientCustomizeExportOptionsEventArgsOps[Self <: ASPxClientCustomizeExportOptionsEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetExportOptionsModel(value: js.Any => js.Any): Self = this.set("GetExportOptionsModel", js.Any.fromFunction1(value))
    @scala.inline
    def setHideExportOptionsPanel(value: () => Unit): Self = this.set("HideExportOptionsPanel", js.Any.fromFunction0(value))
    @scala.inline
    def setHideFormat(value: js.Any => Unit): Self = this.set("HideFormat", js.Any.fromFunction1(value))
    @scala.inline
    def setHideProperties(value: (js.Any, /* repeated */ js.Any) => Unit): Self = this.set("HideProperties", js.Any.fromFunction2(value))
  }
  
}

