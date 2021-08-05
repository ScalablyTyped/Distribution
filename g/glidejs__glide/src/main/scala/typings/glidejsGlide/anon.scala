package typings.glidejsGlide

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ActiveNav extends StObject {
    
    /**
      * @default 'glide__bullet--active'
      */
    var activeNav: js.UndefOr[String] = js.undefined
    
    /**
      * @default 'glide__slide--active'
      */
    var activeSlide: js.UndefOr[String] = js.undefined
    
    /**
      * @default 'glide--carousel'
      */
    var carousel: js.UndefOr[String] = js.undefined
    
    /**
      * @default 'glide__slide--clone'
      */
    var cloneSlide: js.UndefOr[String] = js.undefined
    
    var direction: js.UndefOr[Ltr] = js.undefined
    
    /**
      * @default 'glide__arrow--disabled'
      */
    var disabledArrow: js.UndefOr[String] = js.undefined
    
    /**
      * @default 'glide--dragging'
      */
    var dragging: js.UndefOr[String] = js.undefined
    
    /**
      * @default 'glide--slider'
      */
    var slider: js.UndefOr[String] = js.undefined
    
    /**
      * @default 'glide--swipeable'
      */
    var swipeable: js.UndefOr[String] = js.undefined
  }
  object ActiveNav {
    
    inline def apply(): ActiveNav = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ActiveNav]
    }
    
    extension [Self <: ActiveNav](x: Self) {
      
      inline def setActiveNav(value: String): Self = StObject.set(x, "activeNav", value.asInstanceOf[js.Any])
      
      inline def setActiveNavUndefined: Self = StObject.set(x, "activeNav", js.undefined)
      
      inline def setActiveSlide(value: String): Self = StObject.set(x, "activeSlide", value.asInstanceOf[js.Any])
      
      inline def setActiveSlideUndefined: Self = StObject.set(x, "activeSlide", js.undefined)
      
      inline def setCarousel(value: String): Self = StObject.set(x, "carousel", value.asInstanceOf[js.Any])
      
      inline def setCarouselUndefined: Self = StObject.set(x, "carousel", js.undefined)
      
      inline def setCloneSlide(value: String): Self = StObject.set(x, "cloneSlide", value.asInstanceOf[js.Any])
      
      inline def setCloneSlideUndefined: Self = StObject.set(x, "cloneSlide", js.undefined)
      
      inline def setDirection(value: Ltr): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setDisabledArrow(value: String): Self = StObject.set(x, "disabledArrow", value.asInstanceOf[js.Any])
      
      inline def setDisabledArrowUndefined: Self = StObject.set(x, "disabledArrow", js.undefined)
      
      inline def setDragging(value: String): Self = StObject.set(x, "dragging", value.asInstanceOf[js.Any])
      
      inline def setDraggingUndefined: Self = StObject.set(x, "dragging", js.undefined)
      
      inline def setSlider(value: String): Self = StObject.set(x, "slider", value.asInstanceOf[js.Any])
      
      inline def setSliderUndefined: Self = StObject.set(x, "slider", js.undefined)
      
      inline def setSwipeable(value: String): Self = StObject.set(x, "swipeable", value.asInstanceOf[js.Any])
      
      inline def setSwipeableUndefined: Self = StObject.set(x, "swipeable", js.undefined)
    }
  }
  
  trait After extends StObject {
    
    var after: js.UndefOr[Double] = js.undefined
    
    var before: js.UndefOr[Double] = js.undefined
  }
  object After {
    
    inline def apply(): After = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[After]
    }
    
    extension [Self <: After](x: Self) {
      
      inline def setAfter(value: Double): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
      
      inline def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
      
      inline def setBefore(value: Double): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
      
      inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
    }
  }
  
  trait Ltr extends StObject {
    
    /**
      * @default 'glide--ltr'
      */
    var ltr: js.UndefOr[String] = js.undefined
    
    /**
      * @default 'glide--rtl'
      */
    var rtl: js.UndefOr[String] = js.undefined
  }
  object Ltr {
    
    inline def apply(): Ltr = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Ltr]
    }
    
    extension [Self <: Ltr](x: Self) {
      
      inline def setLtr(value: String): Self = StObject.set(x, "ltr", value.asInstanceOf[js.Any])
      
      inline def setLtrUndefined: Self = StObject.set(x, "ltr", js.undefined)
      
      inline def setRtl(value: String): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
      
      inline def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
    }
  }
  
  trait Modify extends StObject {
    
    /**
      * Modifies passed translate value by 100 pixels.
      */
    def modify(translate: Double): Double
  }
  object Modify {
    
    inline def apply(modify: Double => Double): Modify = {
      val __obj = js.Dynamic.literal(modify = js.Any.fromFunction1(modify))
      __obj.asInstanceOf[Modify]
    }
    
    extension [Self <: Modify](x: Self) {
      
      inline def setModify(value: Double => Double): Self = StObject.set(x, "modify", js.Any.fromFunction1(value))
    }
  }
  
  trait Mount extends StObject {
    
    def mount(): Unit
  }
  object Mount {
    
    inline def apply(mount: () => Unit): Mount = {
      val __obj = js.Dynamic.literal(mount = js.Any.fromFunction0(mount))
      __obj.asInstanceOf[Mount]
    }
    
    extension [Self <: Mount](x: Self) {
      
      inline def setMount(value: () => Unit): Self = StObject.set(x, "mount", js.Any.fromFunction0(value))
    }
  }
}
