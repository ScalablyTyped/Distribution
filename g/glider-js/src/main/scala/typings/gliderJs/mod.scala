package typings.gliderJs

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Shortcut
import typings.gliderJs.anon.Next
import typings.gliderJs.anon.Scroll
import typings.gliderJs.anon.Slide
import typings.gliderJs.anon.Type
import typings.gliderJs.gliderJsStrings.`glider-add`
import typings.gliderJs.gliderJsStrings.`glider-animated`
import typings.gliderJs.gliderJsStrings.`glider-destroy`
import typings.gliderJs.gliderJsStrings.`glider-loaded`
import typings.gliderJs.gliderJsStrings.`glider-refresh`
import typings.gliderJs.gliderJsStrings.`glider-remove`
import typings.gliderJs.gliderJsStrings.`glider-slide-hidden`
import typings.gliderJs.gliderJsStrings.`glider-slide-visible`
import typings.gliderJs.gliderJsStrings.auto
import typings.gliderJs.mod.global.Element
import typings.std.AddEventListenerOptions
import typings.std.HTMLCollection
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("glider-js", JSImport.Namespace)
  @js.native
  class ^[T /* <: HTMLElement */] protected () extends Static[T] {
    // tslint:disable-next-line no-misused-new
    def this(ref: T, options: Options) = this()
  }
  @JSImport("glider-js", JSImport.Namespace)
  @js.native
  val ^ : Static[HTMLDivElement] = js.native
  
  @js.native
  trait Breakpoint extends StObject {
    
    var breakpoint: Double = js.native
    
    var settings: Options = js.native
  }
  object Breakpoint {
    
    @scala.inline
    def apply(breakpoint: Double, settings: Options): Breakpoint = {
      val __obj = js.Dynamic.literal(breakpoint = breakpoint.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any])
      __obj.asInstanceOf[Breakpoint]
    }
    
    @scala.inline
    implicit class BreakpointMutableBuilder[Self <: Breakpoint] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBreakpoint(value: Double): Self = StObject.set(x, "breakpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSettings(value: Options): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    }
  }
  
  type EasingFunction = js.Function5[/* x */ Double, /* t */ Double, /* b */ Double, /* c */ Double, /* d */ Double, Double]
  
  @js.native
  trait GliderEvent[T] extends StObject {
    
    var bubbles: Boolean = js.native
    
    var detail: T = js.native
  }
  object GliderEvent {
    
    @scala.inline
    def apply[T](bubbles: Boolean, detail: T): GliderEvent[T] = {
      val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any])
      __obj.asInstanceOf[GliderEvent[T]]
    }
    
    @scala.inline
    implicit class GliderEventMutableBuilder[Self <: GliderEvent[_], T] (val x: Self with GliderEvent[T]) extends AnyVal {
      
      @scala.inline
      def setBubbles(value: Boolean): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetail(value: T): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GliderEventMap extends StObject {
    
    /**
      * Called whenever an item is added to Glider.js
      */
    var `glider-add`: Scroll = js.native
    
    /**
      * Called whenever a Glider.js paging animation is complete
      */
    var `glider-animated`: Type = js.native
    
    /**
      * Called whenever a Glider.js is destroyed
      */
    var `glider-destroy`: js.UndefOr[scala.Nothing] = js.native
    
    /**
      * Called after Glider.js is first initialized
      */
    var `glider-loaded`: js.UndefOr[scala.Nothing] = js.native
    
    /**
      * Called whenever Glider.js refreshes its elements or settings
      */
    var `glider-refresh`: js.UndefOr[scala.Nothing] = js.native
    
    /**
      * Called whenever a Glider.js animation is complete
      */
    var `glider-remove`: js.UndefOr[scala.Nothing] = js.native
    
    /**
      * Called whenever a slide is hidden. Passed an object containing the slide index
      */
    var `glider-slide-hidden`: Slide = js.native
    
    /**
      * Called whenever a slide is shown. Passed an object containing the slide index
      */
    var `glider-slide-visible`: Slide = js.native
  }
  object GliderEventMap {
    
    @scala.inline
    def apply(
      `glider-add`: Scroll,
      `glider-animated`: Type,
      `glider-slide-hidden`: Slide,
      `glider-slide-visible`: Slide
    ): GliderEventMap = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("glider-add")(`glider-add`.asInstanceOf[js.Any])
      __obj.updateDynamic("glider-animated")(`glider-animated`.asInstanceOf[js.Any])
      __obj.updateDynamic("glider-slide-hidden")(`glider-slide-hidden`.asInstanceOf[js.Any])
      __obj.updateDynamic("glider-slide-visible")(`glider-slide-visible`.asInstanceOf[js.Any])
      __obj.asInstanceOf[GliderEventMap]
    }
    
    @scala.inline
    implicit class GliderEventMapMutableBuilder[Self <: GliderEventMap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def `setGlider-add`(value: Scroll): Self = StObject.set(x, "glider-add", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGlider-animated`(value: Type): Self = StObject.set(x, "glider-animated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGlider-slide-hidden`(value: Slide): Self = StObject.set(x, "glider-slide-hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGlider-slide-visible`(value: Slide): Self = StObject.set(x, "glider-slide-visible", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    /**
      * An object containing the prev/next arrow settings
      */
    var arrows: js.UndefOr[Next] = js.native
    
    /**
      * An HTML element or selector containing the dot container
      */
    var dots: js.UndefOr[Selector | Null] = js.native
    
    /**
      * How much to aggravate the velocity of the mouse dragging
      */
    var dragVelocity: js.UndefOr[Double] = js.native
    
    /**
      * If true, the list can be scrolled by click and dragging with the
      * mouse
      */
    var draggable: js.UndefOr[Boolean] = js.native
    
    /**
      * An aggravator used to control animation speed. Higher is slower!
      */
    var duration: js.UndefOr[Double] = js.native
    
    /**
      * Use any custom easing function, compatible with most easing
      * plugins
      */
    var easing: js.UndefOr[EasingFunction] = js.native
    
    /**
      * Whether or not the event bubbles up from the container
      * @default true
      */
    var eventPropagate: js.UndefOr[Boolean] = js.native
    
    /**
      * This prevents resizing items to fit when `slidesToShow` is set to
      * auto.
      */
    var exactWidth: js.UndefOr[Boolean] = js.native
    
    /**
      * This value is ignored unless `slidesToShow` is set to `auto`, in
      * which it is then required.
      */
    var itemWidth: js.UndefOr[Double] = js.native
    
    /**
      * If true, Glider.js will lock to the nearest slide on resizing of
      * the window
      */
    var resizeLock: js.UndefOr[Boolean] = js.native
    
    /**
      * An object containing custom settings per provided breakpoint. See
      * demo for details.
      */
    var responsive: js.UndefOr[js.Array[Breakpoint]] = js.native
    
    /**
      * If true, Glider.js will scroll to the beginning/end when its
      * respective endpoint is reached
      */
    var rewind: js.UndefOr[Boolean] = js.native
    
    /**
      * If true, Glider.js will scroll to the nearest slide after any
      * scroll interactions
      */
    var scrollLock: js.UndefOr[Boolean] = js.native
    
    /**
      * When `scrollLock` is set, this is the delay in milliseconds to
      * wait before the scroll happens
      */
    var scrollLockDelay: js.UndefOr[Double] = js.native
    
    /**
      * Whether or not to release the scroll events from the container
      */
    var scrollPropagate: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether or not Glider.js should skip wrapping its children with a
      * 'glider-track' <div>.
      */
    var skipTrack: js.UndefOr[Boolean] = js.native
    
    /**
      * The number of slides to scroll when arrow navigation is used If
      * this value is set to `auto`, it will match the value of
      * `slidesToScroll`.
      */
    var slidesToScroll: js.UndefOr[Double | auto] = js.native
    
    /**
      * The number of slides to show in container. If this value is set
      * to `auto`, it will be automatially calcuated based upon the
      * number of items able to fit within the container viewport. This
      * requires setting the `itemWidth` option.
      */
    var slidesToShow: js.UndefOr[Double | auto] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArrows(value: Next): Self = StObject.set(x, "arrows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrowsUndefined: Self = StObject.set(x, "arrows", js.undefined)
      
      @scala.inline
      def setDots(value: Selector): Self = StObject.set(x, "dots", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDotsNull: Self = StObject.set(x, "dots", null)
      
      @scala.inline
      def setDotsUndefined: Self = StObject.set(x, "dots", js.undefined)
      
      @scala.inline
      def setDragVelocity(value: Double): Self = StObject.set(x, "dragVelocity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragVelocityUndefined: Self = StObject.set(x, "dragVelocity", js.undefined)
      
      @scala.inline
      def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setEasing(value: (/* x */ Double, /* t */ Double, /* b */ Double, /* c */ Double, /* d */ Double) => Double): Self = StObject.set(x, "easing", js.Any.fromFunction5(value))
      
      @scala.inline
      def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      @scala.inline
      def setEventPropagate(value: Boolean): Self = StObject.set(x, "eventPropagate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventPropagateUndefined: Self = StObject.set(x, "eventPropagate", js.undefined)
      
      @scala.inline
      def setExactWidth(value: Boolean): Self = StObject.set(x, "exactWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExactWidthUndefined: Self = StObject.set(x, "exactWidth", js.undefined)
      
      @scala.inline
      def setItemWidth(value: Double): Self = StObject.set(x, "itemWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemWidthUndefined: Self = StObject.set(x, "itemWidth", js.undefined)
      
      @scala.inline
      def setResizeLock(value: Boolean): Self = StObject.set(x, "resizeLock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizeLockUndefined: Self = StObject.set(x, "resizeLock", js.undefined)
      
      @scala.inline
      def setResponsive(value: js.Array[Breakpoint]): Self = StObject.set(x, "responsive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponsiveUndefined: Self = StObject.set(x, "responsive", js.undefined)
      
      @scala.inline
      def setResponsiveVarargs(value: Breakpoint*): Self = StObject.set(x, "responsive", js.Array(value :_*))
      
      @scala.inline
      def setRewind(value: Boolean): Self = StObject.set(x, "rewind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRewindUndefined: Self = StObject.set(x, "rewind", js.undefined)
      
      @scala.inline
      def setScrollLock(value: Boolean): Self = StObject.set(x, "scrollLock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollLockDelay(value: Double): Self = StObject.set(x, "scrollLockDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollLockDelayUndefined: Self = StObject.set(x, "scrollLockDelay", js.undefined)
      
      @scala.inline
      def setScrollLockUndefined: Self = StObject.set(x, "scrollLock", js.undefined)
      
      @scala.inline
      def setScrollPropagate(value: Boolean): Self = StObject.set(x, "scrollPropagate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollPropagateUndefined: Self = StObject.set(x, "scrollPropagate", js.undefined)
      
      @scala.inline
      def setSkipTrack(value: Boolean): Self = StObject.set(x, "skipTrack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipTrackUndefined: Self = StObject.set(x, "skipTrack", js.undefined)
      
      @scala.inline
      def setSlidesToScroll(value: Double | auto): Self = StObject.set(x, "slidesToScroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlidesToScrollUndefined: Self = StObject.set(x, "slidesToScroll", js.undefined)
      
      @scala.inline
      def setSlidesToShow(value: Double | auto): Self = StObject.set(x, "slidesToShow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlidesToShowUndefined: Self = StObject.set(x, "slidesToShow", js.undefined)
    }
  }
  
  // Selectors are either results of querying document DOM or a string
  // Let's default to nullable Element to allow friction free migration
  // from JS to TS
  type Selector = Element | String
  
  @js.native
  trait Static[T /* <: HTMLElement */] extends // tslint:disable-next-line no-misused-new
  Instantiable2[/* ref */ HTMLElement, /* options */ Options, Static[HTMLElement]] {
    
    /**
      * Add an item to the list
      * @param element HTMLElement
      */
    def addItem(element: HTMLElement): Unit = js.native
    
    var animate_id: Double = js.native
    
    var arrows: js.Object = js.native
    
    var breakpoint: Double = js.native
    
    var containerWidth: Double = js.native
    
    /**
      * Destroy Glider.js.
      */
    def destroy(): Unit = js.native
    
    var dots: HTMLElement = js.native
    
    var ele: T = js.native
    
    var isDrag: Boolean = js.native
    
    var itemWidth: Double = js.native
    
    var opt: Options = js.native
    
    var page: Double = js.native
    
    var preventClick: Boolean = js.native
    
    /**
      * Force a refresh of Glider.js. If rebuildPaging is true, paging
      * controls will force a rebuild as well. This arument must be true
      * if any options affecting paging controls (dots/arrows) are
      * modified.
      * @param rebuildPaging boolean
      */
    def refresh(rebuildPaging: Boolean): Unit = js.native
    
    /**
      * Remove an item from the list
      * @param itemIndex number
      */
    def removeItem(itemIndex: Double): Unit = js.native
    
    /**
      * Scroll to any slide or page. If second argument is explicitly
      * true, then the first argument will refer to the page to scroll
      * to, as opposed to the slide.
      * @param slideIndexs string | number
      * @param isActuallyDotIndex boolean
      */
    def scrollItem(slideIndex: String, isActuallyDotIndex: Boolean): Unit = js.native
    def scrollItem(slideIndex: Double, isActuallyDotIndex: Boolean): Unit = js.native
    
    /**
      * Scroll directly to supplied scroll position in pixels
      * @param pixelOffset number
      */
    def scrollTo(pixelOffset: Double): Unit = js.native
    
    /**
      * Overrides options set during initialization. If called when a
      * breakpoint is active, the settings for the active breakpoint are
      * updated. If second argument is true, the global settings are
      * updated regardless of active breakpoint. Required for overriding
      * `responsive` setting itself
      * @param arguments Glider.Options
      * @param global Boolean
      */
    def setOption(arguments: Options): Unit = js.native
    def setOption(arguments: Options, global: Boolean): Unit = js.native
    
    var slide: Double = js.native
    
    var slides: HTMLCollection = js.native
    
    var track: HTMLElement = js.native
    
    var trackWidth: Double = js.native
    
    /**
      * Force a refresh of Glider.js navigation controls
      */
    def updateControls(): Unit = js.native
  }
  
  type _To = Static[HTMLDivElement]
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Static[HTMLDivElement] = ^
  
  object global {
    
    @js.native
    trait Element extends StObject {
      
      @JSName("addEventListener")
      def addEventListener_glideradd(`type`: `glider-add`, listener: js.Function1[/* event */ GliderEvent[Scroll], Unit]): Unit = js.native
      @JSName("addEventListener")
      def addEventListener_glideradd(
        `type`: `glider-add`,
        listener: js.Function1[/* event */ GliderEvent[Scroll], Unit],
        options: Boolean
      ): Unit = js.native
      @JSName("addEventListener")
      def addEventListener_glideradd(
        `type`: `glider-add`,
        listener: js.Function1[/* event */ GliderEvent[Scroll], Unit],
        options: AddEventListenerOptions
      ): Unit = js.native
      @JSName("addEventListener")
      def addEventListener_glideranimated(`type`: `glider-animated`, listener: js.Function1[/* event */ GliderEvent[Type], Unit]): Unit = js.native
      @JSName("addEventListener")
      def addEventListener_glideranimated(
        `type`: `glider-animated`,
        listener: js.Function1[/* event */ GliderEvent[Type], Unit],
        options: Boolean
      ): Unit = js.native
      @JSName("addEventListener")
      def addEventListener_glideranimated(
        `type`: `glider-animated`,
        listener: js.Function1[/* event */ GliderEvent[Type], Unit],
        options: AddEventListenerOptions
      ): Unit = js.native
      @JSName("addEventListener")
      def addEventListener_gliderdestroy(
        `type`: `glider-destroy`,
        listener: js.Function1[/* event */ GliderEvent[js.UndefOr[scala.Nothing]], Unit]
      ): Unit = js.native
      @JSName("addEventListener")
      def addEventListener_gliderdestroy(
        `type`: `glider-destroy`,
        listener: js.Function1[/* event */ GliderEvent[js.UndefOr[scala.Nothing]], Unit],
        options: Boolean
      ): Unit = js.native
      @JSName("addEventListener")
      def addEventListener_gliderdestroy(
        `type`: `glider-destroy`,
        listener: js.Function1[/* event */ GliderEvent[js.UndefOr[scala.Nothing]], Unit],
        options: AddEventListenerOptions
      ): Unit = js.native
      @JSName("addEventListener")
      def addEventListener_gliderloaded(
        `type`: `glider-loaded`,
        listener: js.Function1[/* event */ GliderEvent[js.UndefOr[scala.Nothing]], Unit]
      ): Unit = js.native
      @JSName("addEventListener")
      def addEventListener_gliderloaded(
        `type`: `glider-loaded`,
        listener: js.Function1[/* event */ GliderEvent[js.UndefOr[scala.Nothing]], Unit],
        options: Boolean
      ): Unit = js.native
      @JSName("addEventListener")
      def addEventListener_gliderloaded(
        `type`: `glider-loaded`,
        listener: js.Function1[/* event */ GliderEvent[js.UndefOr[scala.Nothing]], Unit],
        options: AddEventListenerOptions
      ): Unit = js.native
      @JSName("addEventListener")
      def addEventListener_gliderrefresh(
        `type`: `glider-refresh`,
        listener: js.Function1[/* event */ GliderEvent[js.UndefOr[scala.Nothing]], Unit]
      ): Unit = js.native
      @JSName("addEventListener")
      def addEventListener_gliderrefresh(
        `type`: `glider-refresh`,
        listener: js.Function1[/* event */ GliderEvent[js.UndefOr[scala.Nothing]], Unit],
        options: Boolean
      ): Unit = js.native
      @JSName("addEventListener")
      def addEventListener_gliderrefresh(
        `type`: `glider-refresh`,
        listener: js.Function1[/* event */ GliderEvent[js.UndefOr[scala.Nothing]], Unit],
        options: AddEventListenerOptions
      ): Unit = js.native
      @JSName("addEventListener")
      def addEventListener_gliderremove(
        `type`: `glider-remove`,
        listener: js.Function1[/* event */ GliderEvent[js.UndefOr[scala.Nothing]], Unit]
      ): Unit = js.native
      @JSName("addEventListener")
      def addEventListener_gliderremove(
        `type`: `glider-remove`,
        listener: js.Function1[/* event */ GliderEvent[js.UndefOr[scala.Nothing]], Unit],
        options: Boolean
      ): Unit = js.native
      @JSName("addEventListener")
      def addEventListener_gliderremove(
        `type`: `glider-remove`,
        listener: js.Function1[/* event */ GliderEvent[js.UndefOr[scala.Nothing]], Unit],
        options: AddEventListenerOptions
      ): Unit = js.native
      @JSName("addEventListener")
      def addEventListener_gliderslidehidden(`type`: `glider-slide-hidden`, listener: js.Function1[/* event */ GliderEvent[Slide], Unit]): Unit = js.native
      @JSName("addEventListener")
      def addEventListener_gliderslidehidden(
        `type`: `glider-slide-hidden`,
        listener: js.Function1[/* event */ GliderEvent[Slide], Unit],
        options: Boolean
      ): Unit = js.native
      @JSName("addEventListener")
      def addEventListener_gliderslidehidden(
        `type`: `glider-slide-hidden`,
        listener: js.Function1[/* event */ GliderEvent[Slide], Unit],
        options: AddEventListenerOptions
      ): Unit = js.native
      @JSName("addEventListener")
      def addEventListener_gliderslidevisible(`type`: `glider-slide-visible`, listener: js.Function1[/* event */ GliderEvent[Slide], Unit]): Unit = js.native
      @JSName("addEventListener")
      def addEventListener_gliderslidevisible(
        `type`: `glider-slide-visible`,
        listener: js.Function1[/* event */ GliderEvent[Slide], Unit],
        options: Boolean
      ): Unit = js.native
      @JSName("addEventListener")
      def addEventListener_gliderslidevisible(
        `type`: `glider-slide-visible`,
        listener: js.Function1[/* event */ GliderEvent[Slide], Unit],
        options: AddEventListenerOptions
      ): Unit = js.native
    }
  }
}
