package typings.devextreme.anon

import typings.devextreme.devextremeStrings.instantly
import typings.devextreme.devextremeStrings.onDemand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplyChangesMode extends StObject {
  
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
  implicit class ApplyChangesModeMutableBuilder[Self <: ApplyChangesMode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowSearch(value: Boolean): Self = StObject.set(x, "allowSearch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowSearchUndefined: Self = StObject.set(x, "allowSearch", js.undefined)
    
    @scala.inline
    def setApplyChangesMode(value: instantly | onDemand): Self = StObject.set(x, "applyChangesMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplyChangesModeUndefined: Self = StObject.set(x, "applyChangesMode", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setLayout(
      value: typings.devextreme.devextremeNumbers.`0` | typings.devextreme.devextremeNumbers.`1` | typings.devextreme.devextremeNumbers.`2`
    ): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    @scala.inline
    def setSearchTimeout(value: Double): Self = StObject.set(x, "searchTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchTimeoutUndefined: Self = StObject.set(x, "searchTimeout", js.undefined)
    
    @scala.inline
    def setTexts(value: AllFields): Self = StObject.set(x, "texts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextsUndefined: Self = StObject.set(x, "texts", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
