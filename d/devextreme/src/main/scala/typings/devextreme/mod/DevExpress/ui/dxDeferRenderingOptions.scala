package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.`1`
import typings.devextreme.mod.DevExpress.animationConfig
import typings.devextreme.mod.global.JQueryPromise
import typings.devextreme.mod.global.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxDeferRenderingOptions extends WidgetOptions[dxDeferRendering] {
  
  /**
    * [descr:dxDeferRendering.Options.animation]
    */
  var animation: js.UndefOr[animationConfig] = js.native
  
  /**
    * [descr:dxDeferRendering.Options.onRendered]
    */
  var onRendered: js.UndefOr[js.Function1[/* e */ `1`, _]] = js.native
  
  /**
    * [descr:dxDeferRendering.Options.onShown]
    */
  var onShown: js.UndefOr[js.Function1[/* e */ `1`, _]] = js.native
  
  /**
    * [descr:dxDeferRendering.Options.renderWhen]
    */
  var renderWhen: js.UndefOr[Promise[Unit] | JQueryPromise[Unit] | Boolean] = js.native
  
  /**
    * [descr:dxDeferRendering.Options.showLoadIndicator]
    */
  var showLoadIndicator: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxDeferRendering.Options.staggerItemSelector]
    */
  var staggerItemSelector: js.UndefOr[String] = js.native
}
object dxDeferRenderingOptions {
  
  @scala.inline
  def apply(): dxDeferRenderingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxDeferRenderingOptions]
  }
  
  @scala.inline
  implicit class dxDeferRenderingOptionsOps[Self <: dxDeferRenderingOptions] (val x: Self) extends AnyVal {
    
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
    def setAnimation(value: animationConfig): Self = this.set("animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    
    @scala.inline
    def setOnRendered(value: /* e */ `1` => _): Self = this.set("onRendered", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnRendered: Self = this.set("onRendered", js.undefined)
    
    @scala.inline
    def setOnShown(value: /* e */ `1` => _): Self = this.set("onShown", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnShown: Self = this.set("onShown", js.undefined)
    
    @scala.inline
    def setRenderWhen(value: Promise[Unit] | JQueryPromise[Unit] | Boolean): Self = this.set("renderWhen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderWhen: Self = this.set("renderWhen", js.undefined)
    
    @scala.inline
    def setShowLoadIndicator(value: Boolean): Self = this.set("showLoadIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowLoadIndicator: Self = this.set("showLoadIndicator", js.undefined)
    
    @scala.inline
    def setStaggerItemSelector(value: String): Self = this.set("staggerItemSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStaggerItemSelector: Self = this.set("staggerItemSelector", js.undefined)
  }
}
