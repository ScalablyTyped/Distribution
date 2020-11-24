package typings.ejWebAll.ej.DocumentEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Model extends js.Object {
  
  /** Gets or sets an object that indicates initialization of importing and exporting documents in document editor.
    */
  var importExportSettings: js.UndefOr[ImportExportSettings] = js.native
  
  /** Triggers when the document changes.
    */
  var onDocumentChange: js.UndefOr[js.Function1[/* e */ OnDocumentChangeEventArgs, Unit]] = js.native
  
  /** Triggers when the hyperlink is clicked.
    */
  var onRequestNavigate: js.UndefOr[js.Function1[/* e */ OnRequestNavigateEventArgs, Unit]] = js.native
  
  /** Triggers when the selection changes.
    */
  var onSelectionChange: js.UndefOr[js.Function1[/* e */ OnSelectionChangeEventArgs, Unit]] = js.native
  
  /** Triggers when the zoom factor changes.
    */
  var onZoomFactorChange: js.UndefOr[js.Function1[/* e */ OnZoomFactorChangeEventArgs, Unit]] = js.native
}
object Model {
  
  @scala.inline
  def apply(): Model = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Model]
  }
  
  @scala.inline
  implicit class ModelOps[Self <: Model] (val x: Self) extends AnyVal {
    
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
    def setImportExportSettings(value: ImportExportSettings): Self = this.set("importExportSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImportExportSettings: Self = this.set("importExportSettings", js.undefined)
    
    @scala.inline
    def setOnDocumentChange(value: /* e */ OnDocumentChangeEventArgs => Unit): Self = this.set("onDocumentChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDocumentChange: Self = this.set("onDocumentChange", js.undefined)
    
    @scala.inline
    def setOnRequestNavigate(value: /* e */ OnRequestNavigateEventArgs => Unit): Self = this.set("onRequestNavigate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnRequestNavigate: Self = this.set("onRequestNavigate", js.undefined)
    
    @scala.inline
    def setOnSelectionChange(value: /* e */ OnSelectionChangeEventArgs => Unit): Self = this.set("onSelectionChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSelectionChange: Self = this.set("onSelectionChange", js.undefined)
    
    @scala.inline
    def setOnZoomFactorChange(value: /* e */ OnZoomFactorChangeEventArgs => Unit): Self = this.set("onZoomFactorChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnZoomFactorChange: Self = this.set("onZoomFactorChange", js.undefined)
  }
}
