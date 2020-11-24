package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.ActionElement
import typings.devextreme.anon.ActionElementComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxSpeedDialActionOptions extends WidgetOptions[dxSpeedDialAction] {
  
  /**
    * [descr:dxSpeedDialAction.Options.icon]
    */
  var icon: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxSpeedDialAction.Options.index]
    */
  var index: js.UndefOr[Double] = js.native
  
  /**
    * [descr:dxSpeedDialAction.Options.label]
    */
  var label: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxSpeedDialAction.Options.onClick]
    */
  var onClick: js.UndefOr[js.Function1[/* e */ ActionElement, _]] = js.native
  
  /**
    * [descr:dxSpeedDialAction.Options.onContentReady]
    */
  @JSName("onContentReady")
  var onContentReady_dxSpeedDialActionOptions: js.UndefOr[js.Function1[/* e */ ActionElementComponent, _]] = js.native
}
object dxSpeedDialActionOptions {
  
  @scala.inline
  def apply(): dxSpeedDialActionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxSpeedDialActionOptions]
  }
  
  @scala.inline
  implicit class dxSpeedDialActionOptionsOps[Self <: dxSpeedDialActionOptions] (val x: Self) extends AnyVal {
    
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
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setOnClick(value: /* e */ ActionElement => _): Self = this.set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    
    @scala.inline
    def setOnContentReady(value: /* e */ ActionElementComponent => _): Self = this.set("onContentReady", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnContentReady: Self = this.set("onContentReady", js.undefined)
  }
}
