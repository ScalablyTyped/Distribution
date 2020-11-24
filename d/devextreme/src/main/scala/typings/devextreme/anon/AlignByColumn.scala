package typings.devextreme.anon

import typings.devextreme.devextremeStrings.avg
import typings.devextreme.devextremeStrings.count
import typings.devextreme.devextremeStrings.custom
import typings.devextreme.devextremeStrings.max
import typings.devextreme.devextremeStrings.min
import typings.devextreme.devextremeStrings.sum
import typings.devextreme.mod.DevExpress.ui.format
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlignByColumn extends js.Object {
  
  var alignByColumn: js.UndefOr[Boolean] = js.native
  
  var column: js.UndefOr[String] = js.native
  
  var customizeText: js.UndefOr[js.Function1[/* itemInfo */ Value, String]] = js.native
  
  var displayFormat: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var showInColumn: js.UndefOr[String] = js.native
  
  var showInGroupFooter: js.UndefOr[Boolean] = js.native
  
  var skipEmptyValues: js.UndefOr[Boolean] = js.native
  
  var summaryType: js.UndefOr[avg | count | custom | max | min | sum | String] = js.native
  
  var valueFormat: js.UndefOr[format] = js.native
}
object AlignByColumn {
  
  @scala.inline
  def apply(): AlignByColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlignByColumn]
  }
  
  @scala.inline
  implicit class AlignByColumnOps[Self <: AlignByColumn] (val x: Self) extends AnyVal {
    
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
    def setAlignByColumn(value: Boolean): Self = this.set("alignByColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlignByColumn: Self = this.set("alignByColumn", js.undefined)
    
    @scala.inline
    def setColumn(value: String): Self = this.set("column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumn: Self = this.set("column", js.undefined)
    
    @scala.inline
    def setCustomizeText(value: /* itemInfo */ Value => String): Self = this.set("customizeText", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCustomizeText: Self = this.set("customizeText", js.undefined)
    
    @scala.inline
    def setDisplayFormat(value: String): Self = this.set("displayFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayFormat: Self = this.set("displayFormat", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setShowInColumn(value: String): Self = this.set("showInColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowInColumn: Self = this.set("showInColumn", js.undefined)
    
    @scala.inline
    def setShowInGroupFooter(value: Boolean): Self = this.set("showInGroupFooter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowInGroupFooter: Self = this.set("showInGroupFooter", js.undefined)
    
    @scala.inline
    def setSkipEmptyValues(value: Boolean): Self = this.set("skipEmptyValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipEmptyValues: Self = this.set("skipEmptyValues", js.undefined)
    
    @scala.inline
    def setSummaryType(value: avg | count | custom | max | min | sum | String): Self = this.set("summaryType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSummaryType: Self = this.set("summaryType", js.undefined)
    
    @scala.inline
    def setValueFormatFunction1(value: /* value */ Double | typings.std.Date => String): Self = this.set("valueFormat", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValueFormat(value: format): Self = this.set("valueFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueFormat: Self = this.set("valueFormat", js.undefined)
  }
}
