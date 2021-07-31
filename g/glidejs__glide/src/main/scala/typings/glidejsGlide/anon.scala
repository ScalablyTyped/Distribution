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
    
    @scala.inline
    def apply(): ActiveNav = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ActiveNav]
    }
    
    @scala.inline
    implicit class ActiveNavMutableBuilder[Self <: ActiveNav] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveNav(value: String): Self = StObject.set(x, "activeNav", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveNavUndefined: Self = StObject.set(x, "activeNav", js.undefined)
      
      @scala.inline
      def setActiveSlide(value: String): Self = StObject.set(x, "activeSlide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveSlideUndefined: Self = StObject.set(x, "activeSlide", js.undefined)
      
      @scala.inline
      def setCarousel(value: String): Self = StObject.set(x, "carousel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCarouselUndefined: Self = StObject.set(x, "carousel", js.undefined)
      
      @scala.inline
      def setCloneSlide(value: String): Self = StObject.set(x, "cloneSlide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloneSlideUndefined: Self = StObject.set(x, "cloneSlide", js.undefined)
      
      @scala.inline
      def setDirection(value: Ltr): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setDisabledArrow(value: String): Self = StObject.set(x, "disabledArrow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledArrowUndefined: Self = StObject.set(x, "disabledArrow", js.undefined)
      
      @scala.inline
      def setDragging(value: String): Self = StObject.set(x, "dragging", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggingUndefined: Self = StObject.set(x, "dragging", js.undefined)
      
      @scala.inline
      def setSlider(value: String): Self = StObject.set(x, "slider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSliderUndefined: Self = StObject.set(x, "slider", js.undefined)
      
      @scala.inline
      def setSwipeable(value: String): Self = StObject.set(x, "swipeable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwipeableUndefined: Self = StObject.set(x, "swipeable", js.undefined)
    }
  }
  
  trait After extends StObject {
    
    var after: js.UndefOr[Double] = js.undefined
    
    var before: js.UndefOr[Double] = js.undefined
  }
  object After {
    
    @scala.inline
    def apply(): After = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[After]
    }
    
    @scala.inline
    implicit class AfterMutableBuilder[Self <: After] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfter(value: Double): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
      
      @scala.inline
      def setBefore(value: Double): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
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
    
    @scala.inline
    def apply(): Ltr = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Ltr]
    }
    
    @scala.inline
    implicit class LtrMutableBuilder[Self <: Ltr] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLtr(value: String): Self = StObject.set(x, "ltr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLtrUndefined: Self = StObject.set(x, "ltr", js.undefined)
      
      @scala.inline
      def setRtl(value: String): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
    }
  }
  
  trait Modify extends StObject {
    
    /**
      * Modifies passed translate value by 100 pixels.
      */
    def modify(translate: Double): Double
  }
  object Modify {
    
    @scala.inline
    def apply(modify: Double => Double): Modify = {
      val __obj = js.Dynamic.literal(modify = js.Any.fromFunction1(modify))
      __obj.asInstanceOf[Modify]
    }
    
    @scala.inline
    implicit class ModifyMutableBuilder[Self <: Modify] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setModify(value: Double => Double): Self = StObject.set(x, "modify", js.Any.fromFunction1(value))
    }
  }
  
  trait Mount extends StObject {
    
    def mount(): Unit
  }
  object Mount {
    
    @scala.inline
    def apply(mount: () => Unit): Mount = {
      val __obj = js.Dynamic.literal(mount = js.Any.fromFunction0(mount))
      __obj.asInstanceOf[Mount]
    }
    
    @scala.inline
    implicit class MountMutableBuilder[Self <: Mount] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMount(value: () => Unit): Self = StObject.set(x, "mount", js.Any.fromFunction0(value))
    }
  }
}
