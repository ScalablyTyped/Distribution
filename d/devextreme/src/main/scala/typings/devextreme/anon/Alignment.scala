package typings.devextreme.anon

import typings.devextreme.devextremeStrings.avg
import typings.devextreme.devextremeStrings.center
import typings.devextreme.devextremeStrings.count
import typings.devextreme.devextremeStrings.custom
import typings.devextreme.devextremeStrings.left
import typings.devextreme.devextremeStrings.max
import typings.devextreme.devextremeStrings.min
import typings.devextreme.devextremeStrings.right
import typings.devextreme.devextremeStrings.sum
import typings.devextreme.mod.DevExpress.ui.format
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Alignment extends js.Object {
  var alignment: js.UndefOr[center | left | right] = js.native
  var column: js.UndefOr[String] = js.native
  var cssClass: js.UndefOr[String] = js.native
  var customizeText: js.UndefOr[js.Function1[/* itemInfo */ Value, String]] = js.native
  var displayFormat: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  var showInColumn: js.UndefOr[String] = js.native
  var skipEmptyValues: js.UndefOr[Boolean] = js.native
  var summaryType: js.UndefOr[avg | count | custom | max | min | sum | String] = js.native
  var valueFormat: js.UndefOr[format] = js.native
}

object Alignment {
  @scala.inline
  def apply(): Alignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Alignment]
  }
  @scala.inline
  implicit class AlignmentOps[Self <: Alignment] (val x: Self) extends AnyVal {
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
    def setAlignment(value: center | left | right): Self = this.set("alignment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlignment: Self = this.set("alignment", js.undefined)
    @scala.inline
    def setColumn(value: String): Self = this.set("column", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumn: Self = this.set("column", js.undefined)
    @scala.inline
    def setCssClass(value: String): Self = this.set("cssClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCssClass: Self = this.set("cssClass", js.undefined)
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

