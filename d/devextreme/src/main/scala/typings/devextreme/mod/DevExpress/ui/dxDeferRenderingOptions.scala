package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.Element
import typings.devextreme.mod.DevExpress.AnimationConfig
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxDeferRenderingOptions
  extends StObject
     with WidgetOptions[dxDeferRendering] {
  
  /**
    * Specifies the animation to be used to show the rendered content.
    */
  var animation: js.UndefOr[AnimationConfig] = js.undefined
  
  /**
    * A function that is executed when the content is rendered but not yet displayed.
    */
  var onRendered: js.UndefOr[js.Function1[/* e */ Element, Unit]] = js.undefined
  
  /**
    * A function that is executed when the content is displayed and animation is completed.
    */
  var onShown: js.UndefOr[js.Function1[/* e */ Element, Unit]] = js.undefined
  
  /**
    * Specifies when the UI component content is rendered.
    */
  var renderWhen: js.UndefOr[PromiseLike[Unit] | Boolean] = js.undefined
  
  /**
    * Indicates if a load indicator should be shown until the UI component&apos;s content is rendered.
    */
  var showLoadIndicator: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies a jQuery selector of items that should be rendered using a staggered animation.
    */
  var staggerItemSelector: js.UndefOr[String] = js.undefined
}
object dxDeferRenderingOptions {
  
  inline def apply(): dxDeferRenderingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxDeferRenderingOptions]
  }
  
  extension [Self <: dxDeferRenderingOptions](x: Self) {
    
    inline def setAnimation(value: AnimationConfig): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    inline def setOnRendered(value: /* e */ Element => Unit): Self = StObject.set(x, "onRendered", js.Any.fromFunction1(value))
    
    inline def setOnRenderedUndefined: Self = StObject.set(x, "onRendered", js.undefined)
    
    inline def setOnShown(value: /* e */ Element => Unit): Self = StObject.set(x, "onShown", js.Any.fromFunction1(value))
    
    inline def setOnShownUndefined: Self = StObject.set(x, "onShown", js.undefined)
    
    inline def setRenderWhen(value: PromiseLike[Unit] | Boolean): Self = StObject.set(x, "renderWhen", value.asInstanceOf[js.Any])
    
    inline def setRenderWhenUndefined: Self = StObject.set(x, "renderWhen", js.undefined)
    
    inline def setShowLoadIndicator(value: Boolean): Self = StObject.set(x, "showLoadIndicator", value.asInstanceOf[js.Any])
    
    inline def setShowLoadIndicatorUndefined: Self = StObject.set(x, "showLoadIndicator", js.undefined)
    
    inline def setStaggerItemSelector(value: String): Self = StObject.set(x, "staggerItemSelector", value.asInstanceOf[js.Any])
    
    inline def setStaggerItemSelectorUndefined: Self = StObject.set(x, "staggerItemSelector", js.undefined)
  }
}
