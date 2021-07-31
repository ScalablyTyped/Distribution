package typings.glidejsGlide

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Shortcut
import typings.glidejsGlide.anon.ActiveNav
import typings.glidejsGlide.anon.After
import typings.glidejsGlide.anon.Modify
import typings.glidejsGlide.anon.Mount
import typings.glidejsGlide.glidejsGlideBooleans.`false`
import typings.glidejsGlide.glidejsGlideStrings.ltr
import typings.glidejsGlide.glidejsGlideStrings.rtr
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@glidejs/glide", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with Static {
    // tslint:disable-next-line:no-misused-new
    def this(selector: String) = this()
    def this(selector: String, options: Options) = this()
  }
  @JSImport("@glidejs/glide", JSImport.Namespace)
  @js.native
  val ^ : js.Object & Static = js.native
  
  /**
    * The component is a simple function that returns an object. Each component
    * has a single responsibility and communicates with other components using
    * events.
    */
  type ComponentFunction = js.Function3[/* glide */ Static, /* components */ js.Object, /* events */ js.Any, Mount]
  
  /* Rewritten from type alias, can be one of: 
    - typings.glidejsGlide.glidejsGlideStrings.mountDotbefore
    - typings.glidejsGlide.glidejsGlideStrings.mountDotafter
    - typings.glidejsGlide.glidejsGlideStrings.update
    - typings.glidejsGlide.glidejsGlideStrings.play
    - typings.glidejsGlide.glidejsGlideStrings.pause
    - typings.glidejsGlide.glidejsGlideStrings.buildDotbefore
    - typings.glidejsGlide.glidejsGlideStrings.buildDotafter
    - typings.glidejsGlide.glidejsGlideStrings.runDotbefore
    - typings.glidejsGlide.glidejsGlideStrings.run
    - typings.glidejsGlide.glidejsGlideStrings.runDotafter
    - typings.glidejsGlide.glidejsGlideStrings.runDotoffset
    - typings.glidejsGlide.glidejsGlideStrings.runDotstart
    - typings.glidejsGlide.glidejsGlideStrings.runDotend
    - typings.glidejsGlide.glidejsGlideStrings.move
    - typings.glidejsGlide.glidejsGlideStrings.moveDotafter
    - typings.glidejsGlide.glidejsGlideStrings.resize
    - typings.glidejsGlide.glidejsGlideStrings.swipeDotstart
    - typings.glidejsGlide.glidejsGlideStrings.swipeDotmove
    - typings.glidejsGlide.glidejsGlideStrings.swipeDotend
    - typings.glidejsGlide.glidejsGlideStrings.translateDotjump
  */
  trait Events extends StObject
  object Events {
    
    @scala.inline
    def buildDotafter: typings.glidejsGlide.glidejsGlideStrings.buildDotafter = "build.after".asInstanceOf[typings.glidejsGlide.glidejsGlideStrings.buildDotafter]
    
    @scala.inline
    def buildDotbefore: typings.glidejsGlide.glidejsGlideStrings.buildDotbefore = "build.before".asInstanceOf[typings.glidejsGlide.glidejsGlideStrings.buildDotbefore]
    
    @scala.inline
    def mountDotafter: typings.glidejsGlide.glidejsGlideStrings.mountDotafter = "mount.after".asInstanceOf[typings.glidejsGlide.glidejsGlideStrings.mountDotafter]
    
    @scala.inline
    def mountDotbefore: typings.glidejsGlide.glidejsGlideStrings.mountDotbefore = "mount.before".asInstanceOf[typings.glidejsGlide.glidejsGlideStrings.mountDotbefore]
    
    @scala.inline
    def move: typings.glidejsGlide.glidejsGlideStrings.move = "move".asInstanceOf[typings.glidejsGlide.glidejsGlideStrings.move]
    
    @scala.inline
    def moveDotafter: typings.glidejsGlide.glidejsGlideStrings.moveDotafter = "move.after".asInstanceOf[typings.glidejsGlide.glidejsGlideStrings.moveDotafter]
    
    @scala.inline
    def pause: typings.glidejsGlide.glidejsGlideStrings.pause = "pause".asInstanceOf[typings.glidejsGlide.glidejsGlideStrings.pause]
    
    @scala.inline
    def play: typings.glidejsGlide.glidejsGlideStrings.play = "play".asInstanceOf[typings.glidejsGlide.glidejsGlideStrings.play]
    
    @scala.inline
    def resize: typings.glidejsGlide.glidejsGlideStrings.resize = "resize".asInstanceOf[typings.glidejsGlide.glidejsGlideStrings.resize]
    
    @scala.inline
    def run: typings.glidejsGlide.glidejsGlideStrings.run = "run".asInstanceOf[typings.glidejsGlide.glidejsGlideStrings.run]
    
    @scala.inline
    def runDotafter: typings.glidejsGlide.glidejsGlideStrings.runDotafter = "run.after".asInstanceOf[typings.glidejsGlide.glidejsGlideStrings.runDotafter]
    
    @scala.inline
    def runDotbefore: typings.glidejsGlide.glidejsGlideStrings.runDotbefore = "run.before".asInstanceOf[typings.glidejsGlide.glidejsGlideStrings.runDotbefore]
    
    @scala.inline
    def runDotend: typings.glidejsGlide.glidejsGlideStrings.runDotend = "run.end".asInstanceOf[typings.glidejsGlide.glidejsGlideStrings.runDotend]
    
    @scala.inline
    def runDotoffset: typings.glidejsGlide.glidejsGlideStrings.runDotoffset = "run.offset".asInstanceOf[typings.glidejsGlide.glidejsGlideStrings.runDotoffset]
    
    @scala.inline
    def runDotstart: typings.glidejsGlide.glidejsGlideStrings.runDotstart = "run.start".asInstanceOf[typings.glidejsGlide.glidejsGlideStrings.runDotstart]
    
    @scala.inline
    def swipeDotend: typings.glidejsGlide.glidejsGlideStrings.swipeDotend = "swipe.end".asInstanceOf[typings.glidejsGlide.glidejsGlideStrings.swipeDotend]
    
    @scala.inline
    def swipeDotmove: typings.glidejsGlide.glidejsGlideStrings.swipeDotmove = "swipe.move".asInstanceOf[typings.glidejsGlide.glidejsGlideStrings.swipeDotmove]
    
    @scala.inline
    def swipeDotstart: typings.glidejsGlide.glidejsGlideStrings.swipeDotstart = "swipe.start".asInstanceOf[typings.glidejsGlide.glidejsGlideStrings.swipeDotstart]
    
    @scala.inline
    def translateDotjump: typings.glidejsGlide.glidejsGlideStrings.translateDotjump = "translate.jump".asInstanceOf[typings.glidejsGlide.glidejsGlideStrings.translateDotjump]
    
    @scala.inline
    def update: typings.glidejsGlide.glidejsGlideStrings.update = "update".asInstanceOf[typings.glidejsGlide.glidejsGlideStrings.update]
  }
  
  trait Options extends StObject {
    
    /**
      * Duration of the animation
      *
      * @default 400
      */
    var animationDuration: js.UndefOr[Double] = js.undefined
    
    /**
      * Easing function for the animation
      *
      * @default 'cubic-bezier(0.165, 0.840, 0.440, 1.000)
      */
    var animationTimingFunc: js.UndefOr[String] = js.undefined
    
    /**
      * Change slides after a specified interval
      *
      * @default false
      */
    var autoplay: js.UndefOr[`false` | Double] = js.undefined
    
    /**
      * Stop running perView number of slides from the end
      *
      * @default false
      */
    var bound: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Collection of options applied at specified media breakpoints
      *
      * @default {}
      */
    var breakpoints: js.UndefOr[Record[Double, Options]] = js.undefined
    
    /**
      * Collection of used HTML classes
      */
    var classes: js.UndefOr[ActiveNav] = js.undefined
    
    /**
      * Moving direction mode
      *
      * @default 'ltr'
      */
    var direction: js.UndefOr[ltr | rtr] = js.undefined
    
    /**
      * Minimal mousedrag distance needed to change the slide
      *
      * @default 120
      */
    var dragThreshold: js.UndefOr[Double | `false`] = js.undefined
    
    /**
      * Focus currently active slide at a specified position
      *
      * @default 0
      */
    var focusAt: js.UndefOr[Double | String] = js.undefined
    
    /**
      * A size of the space between slides
      *
      * @default 10
      */
    var gap: js.UndefOr[Double] = js.undefined
    
    /**
      * Stop autoplay on mouseover
      *
      * @default true
      */
    var hoverpause: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Change slides with keyboard arrows
      *
      * @default true
      */
    var keyboard: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The value of the future viewports which have to be visible in the
      * current view
      *
      * @default 0
      */
    var peek: js.UndefOr[Double | After] = js.undefined
    
    /**
      * A maximum number of slides moved per single swipe or drag
      *
      * @default false
      */
    var perTouch: js.UndefOr[Double | `false`] = js.undefined
    
    /**
      * A number of visible slides
      *
      * @default 1
      */
    var perView: js.UndefOr[Double] = js.undefined
    
    /**
      * Allow looping the slider type
      *
      * @default true
      */
    var rewind: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Duration of the rewinding animation
      *
      * @default 800
      */
    var rewindDuration: js.UndefOr[Double] = js.undefined
    
    /**
      * Start at specific slide number
      *
      * @default 0
      */
    var startAt: js.UndefOr[Double] = js.undefined
    
    /**
      * Minimal swipe distance needed to change the slide
      *
      * @default 80
      */
    var swipeThreshold: js.UndefOr[Double | `false`] = js.undefined
    
    /**
      * Throttle costly events
      *
      * @default 25
      */
    var throttle: js.UndefOr[Double] = js.undefined
    
    /**
      * Angle required to activate slides moving
      *
      * @default 45
      */
    var touchAngle: js.UndefOr[Double] = js.undefined
    
    /**
      * Alternate moving distance ratio of swiping and dragging
      *
      * @default 0.5
      */
    var touchRatio: js.UndefOr[Double] = js.undefined
    
    /**
      * Type of the movement
      *
      * @default 'slider'
      */
    var `type`: js.UndefOr[Type] = js.undefined
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
      def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
      
      @scala.inline
      def setAnimationTimingFunc(value: String): Self = StObject.set(x, "animationTimingFunc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationTimingFuncUndefined: Self = StObject.set(x, "animationTimingFunc", js.undefined)
      
      @scala.inline
      def setAutoplay(value: `false` | Double): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
      
      @scala.inline
      def setBound(value: Boolean): Self = StObject.set(x, "bound", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoundUndefined: Self = StObject.set(x, "bound", js.undefined)
      
      @scala.inline
      def setBreakpoints(value: Record[Double, Options]): Self = StObject.set(x, "breakpoints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBreakpointsUndefined: Self = StObject.set(x, "breakpoints", js.undefined)
      
      @scala.inline
      def setClasses(value: ActiveNav): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
      
      @scala.inline
      def setDirection(value: ltr | rtr): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setDragThreshold(value: Double | `false`): Self = StObject.set(x, "dragThreshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragThresholdUndefined: Self = StObject.set(x, "dragThreshold", js.undefined)
      
      @scala.inline
      def setFocusAt(value: Double | String): Self = StObject.set(x, "focusAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusAtUndefined: Self = StObject.set(x, "focusAt", js.undefined)
      
      @scala.inline
      def setGap(value: Double): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGapUndefined: Self = StObject.set(x, "gap", js.undefined)
      
      @scala.inline
      def setHoverpause(value: Boolean): Self = StObject.set(x, "hoverpause", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHoverpauseUndefined: Self = StObject.set(x, "hoverpause", js.undefined)
      
      @scala.inline
      def setKeyboard(value: Boolean): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyboardUndefined: Self = StObject.set(x, "keyboard", js.undefined)
      
      @scala.inline
      def setPeek(value: Double | After): Self = StObject.set(x, "peek", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPeekUndefined: Self = StObject.set(x, "peek", js.undefined)
      
      @scala.inline
      def setPerTouch(value: Double | `false`): Self = StObject.set(x, "perTouch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPerTouchUndefined: Self = StObject.set(x, "perTouch", js.undefined)
      
      @scala.inline
      def setPerView(value: Double): Self = StObject.set(x, "perView", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPerViewUndefined: Self = StObject.set(x, "perView", js.undefined)
      
      @scala.inline
      def setRewind(value: Boolean): Self = StObject.set(x, "rewind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRewindDuration(value: Double): Self = StObject.set(x, "rewindDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRewindDurationUndefined: Self = StObject.set(x, "rewindDuration", js.undefined)
      
      @scala.inline
      def setRewindUndefined: Self = StObject.set(x, "rewind", js.undefined)
      
      @scala.inline
      def setStartAt(value: Double): Self = StObject.set(x, "startAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartAtUndefined: Self = StObject.set(x, "startAt", js.undefined)
      
      @scala.inline
      def setSwipeThreshold(value: Double | `false`): Self = StObject.set(x, "swipeThreshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwipeThresholdUndefined: Self = StObject.set(x, "swipeThreshold", js.undefined)
      
      @scala.inline
      def setThrottle(value: Double): Self = StObject.set(x, "throttle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThrottleUndefined: Self = StObject.set(x, "throttle", js.undefined)
      
      @scala.inline
      def setTouchAngle(value: Double): Self = StObject.set(x, "touchAngle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchAngleUndefined: Self = StObject.set(x, "touchAngle", js.undefined)
      
      @scala.inline
      def setTouchRatio(value: Double): Self = StObject.set(x, "touchRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchRatioUndefined: Self = StObject.set(x, "touchRatio", js.undefined)
      
      @scala.inline
      def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.glidejsGlide.glidejsGlideStrings.Greaterthansign
    - typings.glidejsGlide.glidejsGlideStrings.Lessthansign
    - typings.glidejsGlide.glidejsGlideStrings.GreaterthansignGreaterthansign
    - typings.glidejsGlide.glidejsGlideStrings.LessthansignLessthansign
    - java.lang.String
  */
  type Pattern = _Pattern | String
  
  @js.native
  trait Properties extends StObject {
    
    /**
      * Destroy instance and undo all modifications which have been made to
      * the DOM. It also unbinds added event listeners.
      */
    def destroy(): Unit = js.native
    
    /**
      * Disable instance interaction. Blocks ability to manually change
      * slides via controls or API.
      */
    def disable(): Unit = js.native
    
    /**
      * Holds state of the ability to interact.
      */
    var disabled: Boolean = js.native
    
    /**
      * Enable previously disabled instance. Start responding to interaction.
      */
    def enable(): Unit = js.native
    
    /**
      * Make movement based on the defined pattern. A pattern must be in the
      * special format
      */
    def go(pattern: Pattern): Unit = js.native
    
    /**
      * Holds currently active zero-based slide index.
      */
    var index: Double = js.native
    
    /**
      * Verify the type of a Glide instance.
      */
    def isType(`type`: Type): Boolean = js.native
    
    /**
      * Stop auto-playing. Hold changing slides after a defined interval.
      */
    def pause(): Unit = js.native
    
    /**
      * Force to run auto-playing with passed interval
      */
    def play(): Unit = js.native
    def play(force: Double): Unit = js.native
    
    /**
      * Holds instance initialization settings.
      */
    var settings: Options = js.native
    
    /**
      * Holds type of the Glide instance.
      */
    var `type`: Type = js.native
    
    /**
      * Update settings for the Glide instance.
      */
    def update(settings: Options): Unit = js.native
  }
  
  @js.native
  trait Static
    extends StObject
       with // tslint:disable-next-line:no-misused-new
  Instantiable1[/* selector */ String, Static]
       with Instantiable2[/* selector */ String, /* options */ Options, Static] {
    
    /**
      * A Glide instance is in "uninitialized" mode until a mount() method
      * call. It starts an entire building process.
      */
    def mount(): Properties = js.native
    def mount(components: Record[String, ComponentFunction]): Properties = js.native
    
    /**
      * Registering Transformers
      */
    def mutate(transformers: js.Array[TransformerFunction]): Static = js.native
    
    def on(event: js.Array[Events], definition: js.Function0[Unit]): Unit = js.native
    /**
      * Register callback which will be called at the specified events.
      */
    def on(event: Events, definition: js.Function0[Unit]): Unit = js.native
  }
  
  type TransformerFunction = js.Function3[/* glide */ Static, /* components */ js.Object, /* events */ js.Any, Modify]
  
  /* Rewritten from type alias, can be one of: 
    - typings.glidejsGlide.glidejsGlideStrings.slider
    - typings.glidejsGlide.glidejsGlideStrings.carousel
  */
  trait Type extends StObject
  object Type {
    
    @scala.inline
    def carousel: typings.glidejsGlide.glidejsGlideStrings.carousel = "carousel".asInstanceOf[typings.glidejsGlide.glidejsGlideStrings.carousel]
    
    @scala.inline
    def slider: typings.glidejsGlide.glidejsGlideStrings.slider = "slider".asInstanceOf[typings.glidejsGlide.glidejsGlideStrings.slider]
  }
  
  trait _Pattern extends StObject
  
  type _To = js.Object & Static
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Object & Static = ^
}
