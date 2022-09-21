package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.ui.dxScrollView.PullDownEvent
import typings.devextreme.mod.DevExpress.ui.dxScrollView.ReachBottomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxScrollViewOptions
  extends StObject
     with dxScrollableOptions[dxScrollView] {
  
  /**
    * A function that is executed when the &apos;pull to refresh&apos; gesture is performed. Supported on mobile devices only.
    */
  var onPullDown: js.UndefOr[js.Function1[/* e */ PullDownEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed when the content is scrolled down to the bottom.
    */
  var onReachBottom: js.UndefOr[js.Function1[/* e */ ReachBottomEvent, Unit]] = js.undefined
  
  /**
    * Specifies the text shown in the pullDown panel when pulling the content down lowers the refresh threshold.
    */
  var pulledDownText: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the text shown in the pullDown panel while pulling the content down to the refresh threshold.
    */
  var pullingDownText: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the text shown in the pullDown panel displayed when content is scrolled to the bottom.
    */
  var reachBottomText: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the text shown in the pullDown panel displayed when the content is being refreshed.
    */
  var refreshingText: js.UndefOr[String] = js.undefined
}
object dxScrollViewOptions {
  
  inline def apply(): dxScrollViewOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxScrollViewOptions]
  }
  
  extension [Self <: dxScrollViewOptions](x: Self) {
    
    inline def setOnPullDown(value: /* e */ PullDownEvent => Unit): Self = StObject.set(x, "onPullDown", js.Any.fromFunction1(value))
    
    inline def setOnPullDownUndefined: Self = StObject.set(x, "onPullDown", js.undefined)
    
    inline def setOnReachBottom(value: /* e */ ReachBottomEvent => Unit): Self = StObject.set(x, "onReachBottom", js.Any.fromFunction1(value))
    
    inline def setOnReachBottomUndefined: Self = StObject.set(x, "onReachBottom", js.undefined)
    
    inline def setPulledDownText(value: String): Self = StObject.set(x, "pulledDownText", value.asInstanceOf[js.Any])
    
    inline def setPulledDownTextUndefined: Self = StObject.set(x, "pulledDownText", js.undefined)
    
    inline def setPullingDownText(value: String): Self = StObject.set(x, "pullingDownText", value.asInstanceOf[js.Any])
    
    inline def setPullingDownTextUndefined: Self = StObject.set(x, "pullingDownText", js.undefined)
    
    inline def setReachBottomText(value: String): Self = StObject.set(x, "reachBottomText", value.asInstanceOf[js.Any])
    
    inline def setReachBottomTextUndefined: Self = StObject.set(x, "reachBottomText", js.undefined)
    
    inline def setRefreshingText(value: String): Self = StObject.set(x, "refreshingText", value.asInstanceOf[js.Any])
    
    inline def setRefreshingTextUndefined: Self = StObject.set(x, "refreshingText", js.undefined)
  }
}
