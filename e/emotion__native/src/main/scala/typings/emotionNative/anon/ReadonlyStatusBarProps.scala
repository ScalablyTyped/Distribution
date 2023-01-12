package typings.emotionNative.anon

import typings.emotionNative.emotionNativeStrings.fade
import typings.emotionNative.emotionNativeStrings.none
import typings.emotionNative.emotionNativeStrings.slide
import typings.reactNative.mod.ColorValue
import typings.reactNative.mod.StatusBarStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<react-native.react-native.StatusBarProps> */
trait ReadonlyStatusBarProps extends StObject {
  
  val animated: js.UndefOr[Boolean] = js.undefined
  
  val backgroundColor: js.UndefOr[ColorValue] = js.undefined
  
  val barStyle: js.UndefOr[Null | StatusBarStyle] = js.undefined
  
  val hidden: js.UndefOr[Boolean] = js.undefined
  
  val networkActivityIndicatorVisible: js.UndefOr[Boolean] = js.undefined
  
  val showHideTransition: js.UndefOr[Null | fade | slide | none] = js.undefined
  
  val translucent: js.UndefOr[Boolean] = js.undefined
}
object ReadonlyStatusBarProps {
  
  inline def apply(): ReadonlyStatusBarProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadonlyStatusBarProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadonlyStatusBarProps] (val x: Self) extends AnyVal {
    
    inline def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
    
    inline def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
    
    inline def setBackgroundColor(value: ColorValue): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setBarStyle(value: StatusBarStyle): Self = StObject.set(x, "barStyle", value.asInstanceOf[js.Any])
    
    inline def setBarStyleNull: Self = StObject.set(x, "barStyle", null)
    
    inline def setBarStyleUndefined: Self = StObject.set(x, "barStyle", js.undefined)
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    inline def setNetworkActivityIndicatorVisible(value: Boolean): Self = StObject.set(x, "networkActivityIndicatorVisible", value.asInstanceOf[js.Any])
    
    inline def setNetworkActivityIndicatorVisibleUndefined: Self = StObject.set(x, "networkActivityIndicatorVisible", js.undefined)
    
    inline def setShowHideTransition(value: fade | slide | none): Self = StObject.set(x, "showHideTransition", value.asInstanceOf[js.Any])
    
    inline def setShowHideTransitionNull: Self = StObject.set(x, "showHideTransition", null)
    
    inline def setShowHideTransitionUndefined: Self = StObject.set(x, "showHideTransition", js.undefined)
    
    inline def setTranslucent(value: Boolean): Self = StObject.set(x, "translucent", value.asInstanceOf[js.Any])
    
    inline def setTranslucentUndefined: Self = StObject.set(x, "translucent", js.undefined)
  }
}
