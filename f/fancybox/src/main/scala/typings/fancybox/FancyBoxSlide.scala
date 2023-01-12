package typings.fancybox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FancyBoxSlide
  extends StObject
     with FancyBoxGroupItemWithFilledProps {
  
  @JSName("$content")
  var $content: js.UndefOr[JQuery] = js.undefined
  
  @JSName("$iframe")
  var $iframe: js.UndefOr[JQuery] = js.undefined
  
  @JSName("$image")
  var $image: js.UndefOr[JQuery] = js.undefined
  
  @JSName("$slide")
  var $slide: js.UndefOr[JQuery] = js.undefined
  
  @JSName("$spinner")
  var $spinner: js.UndefOr[JQuery] = js.undefined
  
  var contentSource: js.UndefOr[String] = js.undefined
  
  var forcedDuration: js.UndefOr[Double] = js.undefined
  
  var height: Double
  
  var isComplete: Boolean
  
  var isLoaded: Boolean
  
  var isLoading: Boolean
  
  var isRevealed: Boolean
  
  var pos: Double
  
  var width: Double
}
object FancyBoxSlide {
  
  inline def apply(
    height: Double,
    isComplete: Boolean,
    isLoaded: Boolean,
    isLoading: Boolean,
    isRevealed: Boolean,
    pos: Double,
    src: String,
    width: Double
  ): FancyBoxSlide = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], isComplete = isComplete.asInstanceOf[js.Any], isLoaded = isLoaded.asInstanceOf[js.Any], isLoading = isLoading.asInstanceOf[js.Any], isRevealed = isRevealed.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[FancyBoxSlide]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FancyBoxSlide] (val x: Self) extends AnyVal {
    
    inline def set$content(value: JQuery): Self = StObject.set(x, "$content", value.asInstanceOf[js.Any])
    
    inline def set$contentUndefined: Self = StObject.set(x, "$content", js.undefined)
    
    inline def set$iframe(value: JQuery): Self = StObject.set(x, "$iframe", value.asInstanceOf[js.Any])
    
    inline def set$iframeUndefined: Self = StObject.set(x, "$iframe", js.undefined)
    
    inline def set$image(value: JQuery): Self = StObject.set(x, "$image", value.asInstanceOf[js.Any])
    
    inline def set$imageUndefined: Self = StObject.set(x, "$image", js.undefined)
    
    inline def set$slide(value: JQuery): Self = StObject.set(x, "$slide", value.asInstanceOf[js.Any])
    
    inline def set$slideUndefined: Self = StObject.set(x, "$slide", js.undefined)
    
    inline def set$spinner(value: JQuery): Self = StObject.set(x, "$spinner", value.asInstanceOf[js.Any])
    
    inline def set$spinnerUndefined: Self = StObject.set(x, "$spinner", js.undefined)
    
    inline def setContentSource(value: String): Self = StObject.set(x, "contentSource", value.asInstanceOf[js.Any])
    
    inline def setContentSourceUndefined: Self = StObject.set(x, "contentSource", js.undefined)
    
    inline def setForcedDuration(value: Double): Self = StObject.set(x, "forcedDuration", value.asInstanceOf[js.Any])
    
    inline def setForcedDurationUndefined: Self = StObject.set(x, "forcedDuration", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setIsComplete(value: Boolean): Self = StObject.set(x, "isComplete", value.asInstanceOf[js.Any])
    
    inline def setIsLoaded(value: Boolean): Self = StObject.set(x, "isLoaded", value.asInstanceOf[js.Any])
    
    inline def setIsLoading(value: Boolean): Self = StObject.set(x, "isLoading", value.asInstanceOf[js.Any])
    
    inline def setIsRevealed(value: Boolean): Self = StObject.set(x, "isRevealed", value.asInstanceOf[js.Any])
    
    inline def setPos(value: Double): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
