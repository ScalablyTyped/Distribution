package typings.devextreme.mod.DevExpress

import typings.devextreme.anon.Model
import typings.devextreme.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DOMComponentOptions[T] extends ComponentOptions[T] {
  
  /**
    * [descr:DOMComponent.Options.bindingOptions]
    */
  var bindingOptions: js.UndefOr[js.Any] = js.native
  
  /**
    * [descr:DOMComponent.Options.elementAttr]
    */
  var elementAttr: js.UndefOr[js.Any] = js.native
  
  /**
    * [descr:DOMComponent.Options.height]
    */
  var height: js.UndefOr[Double | String | (js.Function0[Double | String])] = js.native
  
  /**
    * [descr:DOMComponent.Options.onDisposing]
    */
  @JSName("onDisposing")
  var onDisposing_DOMComponentOptions: js.UndefOr[js.Function1[/* e */ Model[T], _]] = js.native
  
  /**
    * [descr:DOMComponent.Options.onOptionChanged]
    */
  @JSName("onOptionChanged")
  var onOptionChanged_DOMComponentOptions: js.UndefOr[js.Function1[/* e */ Name[T], _]] = js.native
  
  /**
    * [descr:DOMComponent.Options.rtlEnabled]
    */
  var rtlEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:DOMComponent.Options.width]
    */
  var width: js.UndefOr[Double | String | (js.Function0[Double | String])] = js.native
}
object DOMComponentOptions {
  
  @scala.inline
  def apply[T](): DOMComponentOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DOMComponentOptions[T]]
  }
  
  @scala.inline
  implicit class DOMComponentOptionsOps[Self <: DOMComponentOptions[_], T] (val x: Self with DOMComponentOptions[T]) extends AnyVal {
    
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
    def setBindingOptions(value: js.Any): Self = this.set("bindingOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBindingOptions: Self = this.set("bindingOptions", js.undefined)
    
    @scala.inline
    def setElementAttr(value: js.Any): Self = this.set("elementAttr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElementAttr: Self = this.set("elementAttr", js.undefined)
    
    @scala.inline
    def setHeightFunction0(value: () => Double | String): Self = this.set("height", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHeight(value: Double | String | (js.Function0[Double | String])): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setOnDisposing(value: /* e */ Model[T] => _): Self = this.set("onDisposing", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDisposing: Self = this.set("onDisposing", js.undefined)
    
    @scala.inline
    def setOnOptionChanged(value: /* e */ Name[T] => _): Self = this.set("onOptionChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnOptionChanged: Self = this.set("onOptionChanged", js.undefined)
    
    @scala.inline
    def setRtlEnabled(value: Boolean): Self = this.set("rtlEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRtlEnabled: Self = this.set("rtlEnabled", js.undefined)
    
    @scala.inline
    def setWidthFunction0(value: () => Double | String): Self = this.set("width", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWidth(value: Double | String | (js.Function0[Double | String])): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
