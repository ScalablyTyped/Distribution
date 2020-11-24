package typings.devextreme.mod.DevExpress.excelExporter

import typings.devextreme.anon.PivotCell
import typings.devextreme.mod.DevExpress.ui.dxPivotGrid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExcelExportPivotGridProps extends ExcelExportBaseProps {
  
  /**
    * [descr:ExcelExportPivotGridProps.component]
    */
  var component: js.UndefOr[dxPivotGrid] = js.native
  
  /**
    * [descr:ExcelExportPivotGridProps.customizeCell]
    */
  var customizeCell: js.UndefOr[js.Function1[/* options */ PivotCell, _]] = js.native
}
object ExcelExportPivotGridProps {
  
  @scala.inline
  def apply(): ExcelExportPivotGridProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExcelExportPivotGridProps]
  }
  
  @scala.inline
  implicit class ExcelExportPivotGridPropsOps[Self <: ExcelExportPivotGridProps] (val x: Self) extends AnyVal {
    
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
    def setComponent(value: dxPivotGrid): Self = this.set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
    
    @scala.inline
    def setCustomizeCell(value: /* options */ PivotCell => _): Self = this.set("customizeCell", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCustomizeCell: Self = this.set("customizeCell", js.undefined)
  }
}
