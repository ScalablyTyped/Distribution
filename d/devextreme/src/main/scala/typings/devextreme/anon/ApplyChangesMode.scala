package typings.devextreme.anon

import typings.devextreme.devextremeStrings.instantly
import typings.devextreme.devextremeStrings.onDemand
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplyChangesMode extends js.Object {
  
  var allowSearch: js.UndefOr[Boolean] = js.native
  
  var applyChangesMode: js.UndefOr[instantly | onDemand] = js.native
  
  var enabled: js.UndefOr[Boolean] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var layout: js.UndefOr[
    typings.devextreme.devextremeNumbers.`0` | typings.devextreme.devextremeNumbers.`1` | typings.devextreme.devextremeNumbers.`2`
  ] = js.native
  
  var searchTimeout: js.UndefOr[Double] = js.native
  
  var texts: js.UndefOr[AllFields] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object ApplyChangesMode {
  
  @scala.inline
  def apply(): ApplyChangesMode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplyChangesMode]
  }
  
  @scala.inline
  implicit class ApplyChangesModeOps[Self <: ApplyChangesMode] (val x: Self) extends AnyVal {
    
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
    def setAllowSearch(value: Boolean): Self = this.set("allowSearch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowSearch: Self = this.set("allowSearch", js.undefined)
    
    @scala.inline
    def setApplyChangesMode(value: instantly | onDemand): Self = this.set("applyChangesMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplyChangesMode: Self = this.set("applyChangesMode", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setLayout(
      value: typings.devextreme.devextremeNumbers.`0` | typings.devextreme.devextremeNumbers.`1` | typings.devextreme.devextremeNumbers.`2`
    ): Self = this.set("layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    
    @scala.inline
    def setSearchTimeout(value: Double): Self = this.set("searchTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchTimeout: Self = this.set("searchTimeout", js.undefined)
    
    @scala.inline
    def setTexts(value: AllFields): Self = this.set("texts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTexts: Self = this.set("texts", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
