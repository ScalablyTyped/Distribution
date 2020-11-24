package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.anon.Bottom
import typings.devextreme.anon.FontOffset
import typings.devextreme.devextremeStrings.bottom
import typings.devextreme.devextremeStrings.breakWord
import typings.devextreme.devextremeStrings.center
import typings.devextreme.devextremeStrings.ellipsis
import typings.devextreme.devextremeStrings.hide
import typings.devextreme.devextremeStrings.left
import typings.devextreme.devextremeStrings.none
import typings.devextreme.devextremeStrings.normal
import typings.devextreme.devextremeStrings.right
import typings.devextreme.devextremeStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * [descr:BaseWidget.Options.title]
  */
@js.native
trait BaseWidgetTitle extends js.Object {
  
  /**
    * [descr:BaseWidget.Options.title.font]
    */
  var font: js.UndefOr[Font] = js.native
  
  /**
    * [descr:BaseWidget.Options.title.horizontalAlignment]
    */
  var horizontalAlignment: js.UndefOr[center | left | right] = js.native
  
  /**
    * [descr:BaseWidget.Options.title.margin]
    */
  var margin: js.UndefOr[Double | Bottom] = js.native
  
  /**
    * [descr:BaseWidget.Options.title.placeholderSize]
    */
  var placeholderSize: js.UndefOr[Double] = js.native
  
  /**
    * [descr:BaseWidget.Options.title.subtitle]
    */
  var subtitle: js.UndefOr[FontOffset | String] = js.native
  
  /**
    * [descr:BaseWidget.Options.title.text]
    */
  var text: js.UndefOr[String] = js.native
  
  /**
    * [descr:BaseWidget.Options.title.textOverflow]
    */
  var textOverflow: js.UndefOr[ellipsis | hide | none] = js.native
  
  /**
    * [descr:BaseWidget.Options.title.verticalAlignment]
    */
  var verticalAlignment: js.UndefOr[bottom | top] = js.native
  
  /**
    * [descr:BaseWidget.Options.title.wordWrap]
    */
  var wordWrap: js.UndefOr[normal | breakWord | none] = js.native
}
object BaseWidgetTitle {
  
  @scala.inline
  def apply(): BaseWidgetTitle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseWidgetTitle]
  }
  
  @scala.inline
  implicit class BaseWidgetTitleOps[Self <: BaseWidgetTitle] (val x: Self) extends AnyVal {
    
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
    def setFont(value: Font): Self = this.set("font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    
    @scala.inline
    def setHorizontalAlignment(value: center | left | right): Self = this.set("horizontalAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHorizontalAlignment: Self = this.set("horizontalAlignment", js.undefined)
    
    @scala.inline
    def setMargin(value: Double | Bottom): Self = this.set("margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    
    @scala.inline
    def setPlaceholderSize(value: Double): Self = this.set("placeholderSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholderSize: Self = this.set("placeholderSize", js.undefined)
    
    @scala.inline
    def setSubtitle(value: FontOffset | String): Self = this.set("subtitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubtitle: Self = this.set("subtitle", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setTextOverflow(value: ellipsis | hide | none): Self = this.set("textOverflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextOverflow: Self = this.set("textOverflow", js.undefined)
    
    @scala.inline
    def setVerticalAlignment(value: bottom | top): Self = this.set("verticalAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerticalAlignment: Self = this.set("verticalAlignment", js.undefined)
    
    @scala.inline
    def setWordWrap(value: normal | breakWord | none): Self = this.set("wordWrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWordWrap: Self = this.set("wordWrap", js.undefined)
  }
}
