package typings.flickity

import typings.flickity.anon.X
import typings.flickity.anon.X0
import typings.flickity.mod.global.JQuery
import typings.std.Element
import typings.std.Event
import typings.std.HTMLElement
import typings.std.NodeList
import typings.std.Touch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("flickity", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Flickity {
    /**
      * Initializes an new instance of Flickity .
      *
      * @param element Element selector string or container Element to initialize Flickity on
      * @param options (IOptions) Flickity options
      */
    def this(selector: String) = this()
    def this(selector: Element) = this()
    def this(selector: String, options: Options) = this()
    def this(selector: Element, options: Options) = this()
  }
  @JSImport("flickity", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // static methods
  /**
    * (static) Get the Flickity instance.
    *
    * @param element Element selector string
    */
  /* static member */
  inline def data(element: String): Flickity = ^.asInstanceOf[js.Dynamic].applyDynamic("data")(element.asInstanceOf[js.Any]).asInstanceOf[Flickity]
  inline def data(element: Element): Flickity = ^.asInstanceOf[js.Dynamic].applyDynamic("data")(element.asInstanceOf[js.Any]).asInstanceOf[Flickity]
  
  trait EventBindings extends StObject {
    
    /**
      * Triggered after a background image has been loaded with bgLazyLoad.
      */
    var bgLazyLoad: js.UndefOr[
        js.Function2[/* event */ js.UndefOr[Event], /* element */ js.UndefOr[Element], Unit]
      ] = js.undefined
    
    var cellSelect: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], Unit]] = js.undefined
    
    /**
      * Triggered when the selected slide is changed.
      */
    var change: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], Unit]] = js.undefined
    
    /**
      * Triggered when dragging ends.
      */
    var dragEnd: js.UndefOr[js.Function2[/* event */ Event, /* pointer */ js.UndefOr[Element | Touch], Unit]] = js.undefined
    
    /**
      * Triggered when dragging moves and the slider moves.
      */
    var dragMove: js.UndefOr[
        js.Function3[
          /* event */ js.UndefOr[Event], 
          /* pointer */ js.UndefOr[Element | Touch], 
          /* moveVector */ js.UndefOr[X], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Triggered when dragging starts and the slider starts moving.
      */
    var dragStart: js.UndefOr[
        js.Function2[/* event */ js.UndefOr[Event], /* pointer */ js.UndefOr[Element | Touch], Unit]
      ] = js.undefined
    
    /**
      * Triggered after entering or exiting fullscreen view.
      */
    var fullscreenChange: js.UndefOr[js.Function1[/* isFullscreen */ js.UndefOr[Boolean], Unit]] = js.undefined
    
    /**
      * Triggered after an image has been loaded with lazyLoad.
      */
    var lazyLoad: js.UndefOr[
        js.Function2[/* event */ js.UndefOr[Event], /* cellElement */ js.UndefOr[Element], Unit]
      ] = js.undefined
    
    /**
      * Triggered when the user's pointer (mouse, touch, pointer) presses down.
      */
    var pointerDown: js.UndefOr[js.Function2[/* event */ Event, /* pointer */ js.UndefOr[Element | Touch], Unit]] = js.undefined
    
    /**
      * Triggered when the user's pointer moves.
      */
    var pointerMove: js.UndefOr[
        js.Function3[
          /* event */ js.UndefOr[Event], 
          /* pointer */ js.UndefOr[Element | Touch], 
          /* moveVector */ js.UndefOr[X], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Triggered when the user's pointer unpresses.
      */
    var pointerUp: js.UndefOr[
        js.Function2[/* event */ js.UndefOr[Event], /* pointer */ js.UndefOr[Element | Touch], Unit]
      ] = js.undefined
    
    /**
      * Triggered after Flickity has been activated.
      */
    var ready: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Triggered when the slider moves.
      */
    var scroll: js.UndefOr[js.Function1[/* progress */ js.UndefOr[Double], Unit]] = js.undefined
    
    /**
      * Triggered when a slide is selected.
      * select is triggered any time a slide is selected, even on the same slide. change is triggered only when a different slide is selected.
      * This event was previously cellSelect in Flickity v1. cellSelect will continue to work in Flickity v2.
      */
    var select: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], Unit]] = js.undefined
    
    /**
      * Triggered when the slider is settled at its end position.
      */
    var settle: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], Unit]] = js.undefined
    
    /**
      * Triggered when the user's pointer is pressed and unpressed and has not moved enough to start dragging.
      * click events are hard to detect with draggable UI, as they are triggered whenever a user drags.
      * Flickity's staticClick event resolves this, as it is triggered when the user has not dragged.
      */
    var staticClick: js.UndefOr[
        js.Function4[
          /* event */ js.UndefOr[Event], 
          /* pointer */ js.UndefOr[Element | Touch], 
          /* cellElement */ js.UndefOr[Element], 
          /* cellIndex */ js.UndefOr[Double], 
          Unit
        ]
      ] = js.undefined
  }
  object EventBindings {
    
    inline def apply(): EventBindings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EventBindings]
    }
    
    extension [Self <: EventBindings](x: Self) {
      
      inline def setBgLazyLoad(value: (/* event */ js.UndefOr[Event], /* element */ js.UndefOr[Element]) => Unit): Self = StObject.set(x, "bgLazyLoad", js.Any.fromFunction2(value))
      
      inline def setBgLazyLoadUndefined: Self = StObject.set(x, "bgLazyLoad", js.undefined)
      
      inline def setCellSelect(value: /* index */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "cellSelect", js.Any.fromFunction1(value))
      
      inline def setCellSelectUndefined: Self = StObject.set(x, "cellSelect", js.undefined)
      
      inline def setChange(value: /* index */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
      
      inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
      
      inline def setDragEnd(value: (/* event */ Event, /* pointer */ js.UndefOr[Element | Touch]) => Unit): Self = StObject.set(x, "dragEnd", js.Any.fromFunction2(value))
      
      inline def setDragEndUndefined: Self = StObject.set(x, "dragEnd", js.undefined)
      
      inline def setDragMove(
        value: (/* event */ js.UndefOr[Event], /* pointer */ js.UndefOr[Element | Touch], /* moveVector */ js.UndefOr[X]) => Unit
      ): Self = StObject.set(x, "dragMove", js.Any.fromFunction3(value))
      
      inline def setDragMoveUndefined: Self = StObject.set(x, "dragMove", js.undefined)
      
      inline def setDragStart(value: (/* event */ js.UndefOr[Event], /* pointer */ js.UndefOr[Element | Touch]) => Unit): Self = StObject.set(x, "dragStart", js.Any.fromFunction2(value))
      
      inline def setDragStartUndefined: Self = StObject.set(x, "dragStart", js.undefined)
      
      inline def setFullscreenChange(value: /* isFullscreen */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "fullscreenChange", js.Any.fromFunction1(value))
      
      inline def setFullscreenChangeUndefined: Self = StObject.set(x, "fullscreenChange", js.undefined)
      
      inline def setLazyLoad(value: (/* event */ js.UndefOr[Event], /* cellElement */ js.UndefOr[Element]) => Unit): Self = StObject.set(x, "lazyLoad", js.Any.fromFunction2(value))
      
      inline def setLazyLoadUndefined: Self = StObject.set(x, "lazyLoad", js.undefined)
      
      inline def setPointerDown(value: (/* event */ Event, /* pointer */ js.UndefOr[Element | Touch]) => Unit): Self = StObject.set(x, "pointerDown", js.Any.fromFunction2(value))
      
      inline def setPointerDownUndefined: Self = StObject.set(x, "pointerDown", js.undefined)
      
      inline def setPointerMove(
        value: (/* event */ js.UndefOr[Event], /* pointer */ js.UndefOr[Element | Touch], /* moveVector */ js.UndefOr[X]) => Unit
      ): Self = StObject.set(x, "pointerMove", js.Any.fromFunction3(value))
      
      inline def setPointerMoveUndefined: Self = StObject.set(x, "pointerMove", js.undefined)
      
      inline def setPointerUp(value: (/* event */ js.UndefOr[Event], /* pointer */ js.UndefOr[Element | Touch]) => Unit): Self = StObject.set(x, "pointerUp", js.Any.fromFunction2(value))
      
      inline def setPointerUpUndefined: Self = StObject.set(x, "pointerUp", js.undefined)
      
      inline def setReady(value: () => Unit): Self = StObject.set(x, "ready", js.Any.fromFunction0(value))
      
      inline def setReadyUndefined: Self = StObject.set(x, "ready", js.undefined)
      
      inline def setScroll(value: /* progress */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "scroll", js.Any.fromFunction1(value))
      
      inline def setScrollUndefined: Self = StObject.set(x, "scroll", js.undefined)
      
      inline def setSelect(value: /* index */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
      
      inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
      
      inline def setSettle(value: /* index */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "settle", js.Any.fromFunction1(value))
      
      inline def setSettleUndefined: Self = StObject.set(x, "settle", js.undefined)
      
      inline def setStaticClick(
        value: (/* event */ js.UndefOr[Event], /* pointer */ js.UndefOr[Element | Touch], /* cellElement */ js.UndefOr[Element], /* cellIndex */ js.UndefOr[Double]) => Unit
      ): Self = StObject.set(x, "staticClick", js.Any.fromFunction4(value))
      
      inline def setStaticClickUndefined: Self = StObject.set(x, "staticClick", js.undefined)
    }
  }
  
  @js.native
  trait Flickity extends StObject {
    
    def append(elements: js.Array[Element]): Unit = js.native
    /**
      * Append elements and create cells to the end of the gallery.
      *
      * @param elements JQuery, Element[], Element, or NodeList
      */
    def append(elements: JQuery): Unit = js.native
    def append(elements: Element): Unit = js.native
    def append(elements: NodeList): Unit = js.native
    
    /**
      * The array of cells. Use cells.length for the total number of cells.
      */
    var cells: js.Array[Element] = js.native
    
    /**
      * Remove Flickity functionality completely. destroy will return the element back to its pre-initialized state.
      */
    def destroy(): Unit = js.native
    
    /**
      * Get the elements of the cells.
      * @returns  Element[]
      */
    def getCellElements(): js.Array[Element] = js.native
    
    def insert(elements: js.Array[Element], index: Double): Unit = js.native
    /**
      * Insert elements into the gallery and create cells.
      *
      * @param elements Element[], Element, or NodeList
      * @param index Integer: Zero-based index to insert elements.
      */
    def insert(elements: JQuery, index: Double): Unit = js.native
    def insert(elements: Element, index: Double): Unit = js.native
    def insert(elements: NodeList, index: Double): Unit = js.native
    
    // event listeners
    /**
      * Add new classic event listener
      */
    def listener(params: Any*): Unit = js.native
    
    /**
      * Select the next cell.
      * @param isWrapped (Optional) If true, the first cell will be selected if at the first cell.
      */
    def next(): Unit = js.native
    def next(isWrapped: Boolean): Unit = js.native
    
    /**
      * Remove event listener
      * @param eventName name of event  (@see Flickity.FlickityEvents class for flickity supported events)
      * @param callback callback funtion to execute when event fires
      */
    def off(eventname: FlickityEvents, callback: js.Function1[js.UndefOr[Boolean | Double], Any]): Unit = js.native
    /**
      * Remove event listener
      * @param eventName name of event  (@see Flickity.FlickityEvents class for flickity supported events)
      * @param callback callback funtion to execute when event fires
      */
    def off(
      eventname: FlickityEvents,
      callback: js.Function2[js.UndefOr[Event], js.UndefOr[Element | Touch], Any]
    ): Unit = js.native
    /**
      * Remove event listener
      * @param eventName name of event  (@see Flickity.FlickityEvents class for flickity supported events)
      * @param callback callback funtion to execute when event fires
      */
    def off(
      eventname: FlickityEvents,
      callback: js.Function3[
          /* event */ js.UndefOr[Event], 
          /* pointer */ js.UndefOr[Element | Touch], 
          /* moveVector */ js.UndefOr[js.Object], 
          Any
        ]
    ): Unit = js.native
    /**
      * Remove event listener
      * @param eventName name of event  (@see Flickity.FlickityEvents class for flickity supported events)
      * @param callback callback funtion to execute when event fires
      */
    def off(
      eventname: FlickityEvents,
      callback: js.Function4[
          /* event */ js.UndefOr[Event], 
          /* pointer */ js.UndefOr[Element | Touch], 
          /* cellElement */ js.UndefOr[Element], 
          /* cellIndex */ js.UndefOr[Double], 
          Any
        ]
    ): Unit = js.native
    
    /**
      * bind event listener
      * @param eventName name of event  (@see Flickity.FlickityEvents class for flickity supported events)
      * @param callback callback funtion to execute when event fires
      */
    def on(eventname: FlickityEvents, callback: js.Function1[js.UndefOr[Boolean | Double], Any]): Unit = js.native
    /**
      * bind event listener
      * @param eventName name of event  (@see Flickity.FlickityEvents class for flickity supported events)
      * @param callback callback funtion to execute when event fires
      */
    def on(
      eventname: FlickityEvents,
      callback: js.Function2[js.UndefOr[Event], js.UndefOr[Element | Touch], Any]
    ): Unit = js.native
    /**
      * bind event listener
      * @param eventName name of event  (@see Flickity.FlickityEvents class for flickity supported events)
      * @param callback callback funtion to execute when event fires
      */
    def on(
      eventname: FlickityEvents,
      callback: js.Function3[
          /* event */ js.UndefOr[Event], 
          /* pointer */ js.UndefOr[Element | Touch], 
          /* moveVector */ js.UndefOr[X], 
          Any
        ]
    ): Unit = js.native
    /**
      * bind event listener
      * @param eventName name of event  (@see Flickity.FlickityEvents class for flickity supported events)
      * @param callback callback funtion to execute when event fires
      */
    def on(
      eventname: FlickityEvents,
      callback: js.Function4[
          /* event */ js.UndefOr[Event], 
          /* pointer */ js.UndefOr[Element | Touch], 
          /* cellElement */ js.UndefOr[Element], 
          /* cellIndex */ js.UndefOr[Double], 
          Any
        ]
    ): Unit = js.native
    
    /**
      * one time event handler
      * @param eventName name of event  (@see Flickity.FlickityEvents class for flickity supported events)
      * @param callback callback funtion to execute when event fires
      */
    def once(eventname: String, callback: js.Function2[js.UndefOr[Event], js.UndefOr[Element | Touch], Any]): Unit = js.native
    /**
      * one time event handl`er
      * @param eventName name of event  (@see Flickity.FlickityEvents class for flickity supported events)
      * @param callback callback funtion to execute when event fires
      */
    def once(
      eventname: String,
      callback: js.Function3[
          /* event */ js.UndefOr[Event], 
          /* pointer */ js.UndefOr[Element | Touch], 
          /* moveVector */ js.UndefOr[js.Object], 
          Any
        ]
    ): Unit = js.native
    /**
      * one time event handler
      * @param eventName name of event  (@see Flickity.FlickityEvents class for flickity supported events)
      * @param callback callback funtion to execute when event fires
      */
    def once(
      eventname: String,
      callback: js.Function4[
          /* event */ js.UndefOr[Event], 
          /* pointer */ js.UndefOr[Element | Touch], 
          /* cellElement */ js.UndefOr[Element], 
          /* cellIndex */ js.UndefOr[Double], 
          Any
        ]
    ): Unit = js.native
    /**
      * one time event handler
      * @param eventName name of event  (@see Flickity.FlickityEvents class for flickity supported events)
      * @param callback callback funtion to execute when event fires
      */
    def once(eventname: FlickityEvents, callback: js.Function1[js.UndefOr[Boolean | Double], Any]): Unit = js.native
    
    /**
      * Pauses auto-play.
      */
    def pausePlayer(): Unit = js.native
    
    /**
      * Starts auto-play. Setting autoPlay will automatically start auto-play on initialization. You do not need to start auto-play with playPlayer.
      */
    def playPlayer(): Unit = js.native
    
    def prepend(elements: js.Array[Element]): Unit = js.native
    /**
      * Prepend elements and create cells to the beginning of the gallery.
      *
      * @param elements JQuery, Element[], Element, or NodeList
      */
    def prepend(elements: JQuery): Unit = js.native
    def prepend(elements: Element): Unit = js.native
    def prepend(elements: NodeList): Unit = js.native
    
    /**
      * Select the previous cell.
      *
      * @param isWrapped (Optional) If true, the first cell will be selected if at the last cell.
      */
    def previous(): Unit = js.native
    def previous(isWrapped: Boolean): Unit = js.native
    
    /**
      * Re-collect all cell elements in flickity-slider.
      */
    def reloadCells(): Unit = js.native
    
    def remove(elements: js.Array[Element]): Unit = js.native
    /**
      * Remove cells from gallery and remove elements from DOM.
      *
      * @param elements Element[], Element, or NodeList
      */
    def remove(elements: JQuery): Unit = js.native
    def remove(elements: Element): Unit = js.native
    def remove(elements: NodeList): Unit = js.native
    
    /**
      * Position cells at selected position.
      * Trigger reposition after the size of a cell has been changed.
      */
    def reposition(): Unit = js.native
    
    /**
      * Resize the gallery and re-position cells.
      */
    def resize(): Unit = js.native
    
    // instance methods
    /**
      * Select a cell.
      *
      * @param index Integer Zero-based index of the cell to select.
      * @param isWrapped (Optional) If true, the last cell will be selected if at the first cell.
      * @param isInstant (Optional) If true, immediately view the selected cell without animation.
      */
    def select(index: Double): Unit = js.native
    def select(index: Double, isWrapped: Boolean): Unit = js.native
    def select(index: Double, isWrapped: Boolean, isInstant: Boolean): Unit = js.native
    def select(index: Double, isWrapped: Unit, isInstant: Boolean): Unit = js.native
    
    def selectCell(index: String): Unit = js.native
    def selectCell(index: String, isWrapped: Boolean): Unit = js.native
    def selectCell(index: String, isWrapped: Boolean, isInstant: Boolean): Unit = js.native
    def selectCell(index: String, isWrapped: Unit, isInstant: Boolean): Unit = js.native
    /**
      * Select a slide of a cell. Useful for groupCells.
      *
      * @param index Zero-based index OR selector string of the cell to select.
      * @param isWrapped If true, the last slide will be selected if at the first slide.
      * @param isInstant If true, immediately view the selected slide without animation.
      */
    def selectCell(index: Double): Unit = js.native
    def selectCell(index: Double, isWrapped: Boolean): Unit = js.native
    def selectCell(index: Double, isWrapped: Boolean, isInstant: Boolean): Unit = js.native
    def selectCell(index: Double, isWrapped: Unit, isInstant: Boolean): Unit = js.native
    
    /**
      * The selected cell element.
      */
    var selectedElement: Element = js.native
    
    /**
      * An array of elements in the selected slide. Useful for groupCells.
      */
    var selectedElements: js.Array[Element] = js.native
    
    // properties
    /**
      * The selected cell index.
      */
    var selectedIndex: Double = js.native
    
    /**
      * The slider element
      */
    var slider: HTMLElement = js.native
    
    /**
      * The array of slides. Useful for groupCells. A slide contains multiple cells.
      * If groupCells is disabled, then each slide is a cell, so they are one in the same.
      */
    var slides: js.Array[Element] = js.native
    
    /**
      * Stops auto-play and cancels pause.
      */
    def stopPlayer(): Unit = js.native
    
    /**
      * Resumes auto-play if paused.
      */
    def unpausePlayer(): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.flickity.flickityStrings.select
    - typings.flickity.flickityStrings.cellSelect
    - typings.flickity.flickityStrings.settle
    - typings.flickity.flickityStrings.scroll
    - typings.flickity.flickityStrings.dragStart
    - typings.flickity.flickityStrings.dragMove
    - typings.flickity.flickityStrings.dragEnd
    - typings.flickity.flickityStrings.pointerDown
    - typings.flickity.flickityStrings.pointerMove
    - typings.flickity.flickityStrings.pointerUp
    - typings.flickity.flickityStrings.staticClick
    - typings.flickity.flickityStrings.lazyLoad
    - typings.flickity.flickityStrings.bgLazyLoad
    - typings.flickity.flickityStrings.fullscreenChange
    - typings.flickity.flickityStrings.change
  */
  trait FlickityEvents extends StObject
  object FlickityEvents {
    
    inline def bgLazyLoad: typings.flickity.flickityStrings.bgLazyLoad = "bgLazyLoad".asInstanceOf[typings.flickity.flickityStrings.bgLazyLoad]
    
    inline def cellSelect: typings.flickity.flickityStrings.cellSelect = "cellSelect".asInstanceOf[typings.flickity.flickityStrings.cellSelect]
    
    inline def change: typings.flickity.flickityStrings.change = "change".asInstanceOf[typings.flickity.flickityStrings.change]
    
    inline def dragEnd: typings.flickity.flickityStrings.dragEnd = "dragEnd".asInstanceOf[typings.flickity.flickityStrings.dragEnd]
    
    inline def dragMove: typings.flickity.flickityStrings.dragMove = "dragMove".asInstanceOf[typings.flickity.flickityStrings.dragMove]
    
    inline def dragStart: typings.flickity.flickityStrings.dragStart = "dragStart".asInstanceOf[typings.flickity.flickityStrings.dragStart]
    
    inline def fullscreenChange: typings.flickity.flickityStrings.fullscreenChange = "fullscreenChange".asInstanceOf[typings.flickity.flickityStrings.fullscreenChange]
    
    inline def lazyLoad: typings.flickity.flickityStrings.lazyLoad = "lazyLoad".asInstanceOf[typings.flickity.flickityStrings.lazyLoad]
    
    inline def pointerDown: typings.flickity.flickityStrings.pointerDown = "pointerDown".asInstanceOf[typings.flickity.flickityStrings.pointerDown]
    
    inline def pointerMove: typings.flickity.flickityStrings.pointerMove = "pointerMove".asInstanceOf[typings.flickity.flickityStrings.pointerMove]
    
    inline def pointerUp: typings.flickity.flickityStrings.pointerUp = "pointerUp".asInstanceOf[typings.flickity.flickityStrings.pointerUp]
    
    inline def scroll: typings.flickity.flickityStrings.scroll = "scroll".asInstanceOf[typings.flickity.flickityStrings.scroll]
    
    inline def select: typings.flickity.flickityStrings.select = "select".asInstanceOf[typings.flickity.flickityStrings.select]
    
    inline def settle: typings.flickity.flickityStrings.settle = "settle".asInstanceOf[typings.flickity.flickityStrings.settle]
    
    inline def staticClick: typings.flickity.flickityStrings.staticClick = "staticClick".asInstanceOf[typings.flickity.flickityStrings.staticClick]
  }
  
  trait Options extends StObject {
    
    /**
      * Enable keyboard navigation. Users can tab to a Flickity gallery, and pressing left & right keys to change cells.
      *
      * default: true
      */
    var accessibility: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Changes height of carousel to fit height of selected slide.
      */
    var adaptiveHeight: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Draws the shape of the arrows in the previous & next buttons.
      * javascript dictionary of points or path to SVG file
      */
    var arrowShape: js.UndefOr[String | X0] = js.undefined
    
    /**
      * Use one Flickity gallery as navigation for another.
      *
      * default: disabled
      */
    var asNavFor: js.UndefOr[String | HTMLElement] = js.undefined
    
    /**
      * Automatically advances to the next cell.
      *
      * default: false
      */
    var autoPlay: js.UndefOr[Boolean | Double] = js.undefined
    
    /**
      * Loads cell background image when a cell is selected.
      * Set the background image's URL to load with the `data-flickity-bg-lazyload` attribute.
      * If set to `true`, lazyloads background image in selected slide
      * If set to a number n, load background images in selected slide and next n slides and previous n slides.
      * bgLazyLoad requires the flickity-bg-lazyload package. This package is not included and must be installed separately.
      */
    var bgLazyLoad: js.UndefOr[Boolean | Double] = js.undefined
    
    /**
      * Align cells within the gallery element.
      * opttions: 'left', 'center', 'right'
      *
      * default: 'center'
      */
    var cellAlign: js.UndefOr[String] = js.undefined
    
    /**
      * Specify selector for cell elements. cellSelector is useful if you have other elements in your gallery elements that are not cells.
      *
      * default: '.gallery-cell'
      */
    var cellSelector: js.UndefOr[String] = js.undefined
    
    /**
      * Contains cells to gallery element to prevent excess scroll at beginning or end. Has no effect if wrapAround is enabled
      *
      * default: true
      */
    var contain: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The number of pixels a mouse or touch has to move before dragging begins. Increase dragThreshold to allow for more wiggle room for vertical page scrolling on touch devices.
      *
      * default: 3
      */
    var dragThreshold: js.UndefOr[Double] = js.undefined
    
    /**
      * Enables dragging and flicking
      *
      * default: true
      */
    var draggable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Enables content to be freely scrolled and flicked without aligning cells to an end position.
      * Enable freeScroll and wrapAround and you can flick forever, man.
      *
      * default: false
      */
    var freeScroll: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Slows movement of slider when freeScroll: true. Higher friction makes the slider feel stickier. Lower friction makes the slider feel looser.
      *
      * default: 0.075
      */
    var freeScrollFriction: js.UndefOr[Double] = js.undefined
    
    /**
      * Friction slows the movement of slider. Higher friction makes the slider feel stickier and less bouncy. Lower friction makes the slider feel looser and more wobbly.
      *
      * default: 0.28
      */
    var friction: js.UndefOr[Double] = js.undefined
    
    /**
      * Groups cells together in slides. Flicking, page dots, and previous/next buttons are mapped to group slides, not individual cells.
      * `is-selected` class is added to the multiple cells in the selected slide.
      * If set to true, group cells that fit in carousel viewport.
      * If set to a number, group cells by that number.
      * If set to a percent string, group cells that fit in the percent of the width of the carousel viewport.
      */
    var groupCells: js.UndefOr[Boolean | Double | String] = js.undefined
    
    /**
      * Enables hash navigation to select slides with links and URLs.
      * default: false
      */
    var hash: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Unloaded images have no size, which can throw off cell positions. To fix this, the imagesLoaded option re-positions cells once their images have loaded.
      *
      * default: true
      */
    var imagesLoaded: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Zero-based index or selector string of the initial selected cell.
      */
    var initialIndex: js.UndefOr[Double | String] = js.undefined
    
    /**
      * Loads cell images when a cell is selected.
      * Set the image's URL to load with the `data-flickity-lazyload` attribute.
      * If set to `true`, lazyloads image in selected slide
      * If set to a number n, load images in selected slide and next n slides and previous n slides.
      *
      * default: false
      */
    var lazyLoad: js.UndefOr[Boolean | Double] = js.undefined
    
    /**
      * Bind events within Flickity's options by setting on to an Object. The object's keys should match the event names. on is useful for capturing events as Flickity is initialized, like ready
      */
    var on: js.UndefOr[EventBindings] = js.undefined
    
    /**
      * Creates and enables paging dots.
      *
      * default: true
      */
    var pageDots: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Auto-playing will pause when the user hovers over the carousel. Set pauseAutoPlayOnHover: false to disable this behavior.
      */
    var pauseAutoPlayOnHover: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Sets positioning in percent values, rather than pixel values. If your cells do not have percent widths, we recommended percentPosition: false.
      *
      * default: false
      */
    var percentPosition: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Creates and enables previous & next buttons.
      *
      * default: true
      */
    var prevNextButtons: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Adjusts sizes and positions when window is resized.
      *
      * default: true
      */
    var resize: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Enables right-to-left layout.
      *
      * default: false
      */
    var rightToLeft: js.UndefOr[Boolean] = js.undefined
    
    /**
      * selectedAttraction attracts the position of the slider to the selected cell. Higher attraction makes the slider move faster. Lower makes it move slower.
      *
      * default: 0.025
      */
    var selectedAttraction: js.UndefOr[Double] = js.undefined
    
    /**
      * Sets the height of the gallery to the height of the tallest cell.  Set to  false if you prefer to size the gallery with CSS, rather than using the size of cells.
      *
      * default: true
      */
    var setGallerySize: js.UndefOr[Boolean] = js.undefined
    
    /**
      * You can enable and disable Flickity with CSS. watchCSS option watches the content of :after of the gallery element. Flickity is enabled if :after content is 'flickity'.
      * note: IE8 and Android 2.3 do not support watching :after. Flickity will be disabled when watchCSS: true. Set watchCSS: 'fallbackOn' to enable Flickity for these browsers.
      *
      * default: false
      */
    var watchCSS: js.UndefOr[Boolean | String] = js.undefined
    
    /**
      * At the end of cells, wrap-around to the other end for infinite scrolling.
      *
      * default: false
      */
    var wrapAround: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAccessibility(value: Boolean): Self = StObject.set(x, "accessibility", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityUndefined: Self = StObject.set(x, "accessibility", js.undefined)
      
      inline def setAdaptiveHeight(value: Boolean): Self = StObject.set(x, "adaptiveHeight", value.asInstanceOf[js.Any])
      
      inline def setAdaptiveHeightUndefined: Self = StObject.set(x, "adaptiveHeight", js.undefined)
      
      inline def setArrowShape(value: String | X0): Self = StObject.set(x, "arrowShape", value.asInstanceOf[js.Any])
      
      inline def setArrowShapeUndefined: Self = StObject.set(x, "arrowShape", js.undefined)
      
      inline def setAsNavFor(value: String | HTMLElement): Self = StObject.set(x, "asNavFor", value.asInstanceOf[js.Any])
      
      inline def setAsNavForUndefined: Self = StObject.set(x, "asNavFor", js.undefined)
      
      inline def setAutoPlay(value: Boolean | Double): Self = StObject.set(x, "autoPlay", value.asInstanceOf[js.Any])
      
      inline def setAutoPlayUndefined: Self = StObject.set(x, "autoPlay", js.undefined)
      
      inline def setBgLazyLoad(value: Boolean | Double): Self = StObject.set(x, "bgLazyLoad", value.asInstanceOf[js.Any])
      
      inline def setBgLazyLoadUndefined: Self = StObject.set(x, "bgLazyLoad", js.undefined)
      
      inline def setCellAlign(value: String): Self = StObject.set(x, "cellAlign", value.asInstanceOf[js.Any])
      
      inline def setCellAlignUndefined: Self = StObject.set(x, "cellAlign", js.undefined)
      
      inline def setCellSelector(value: String): Self = StObject.set(x, "cellSelector", value.asInstanceOf[js.Any])
      
      inline def setCellSelectorUndefined: Self = StObject.set(x, "cellSelector", js.undefined)
      
      inline def setContain(value: Boolean): Self = StObject.set(x, "contain", value.asInstanceOf[js.Any])
      
      inline def setContainUndefined: Self = StObject.set(x, "contain", js.undefined)
      
      inline def setDragThreshold(value: Double): Self = StObject.set(x, "dragThreshold", value.asInstanceOf[js.Any])
      
      inline def setDragThresholdUndefined: Self = StObject.set(x, "dragThreshold", js.undefined)
      
      inline def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      inline def setFreeScroll(value: Boolean): Self = StObject.set(x, "freeScroll", value.asInstanceOf[js.Any])
      
      inline def setFreeScrollFriction(value: Double): Self = StObject.set(x, "freeScrollFriction", value.asInstanceOf[js.Any])
      
      inline def setFreeScrollFrictionUndefined: Self = StObject.set(x, "freeScrollFriction", js.undefined)
      
      inline def setFreeScrollUndefined: Self = StObject.set(x, "freeScroll", js.undefined)
      
      inline def setFriction(value: Double): Self = StObject.set(x, "friction", value.asInstanceOf[js.Any])
      
      inline def setFrictionUndefined: Self = StObject.set(x, "friction", js.undefined)
      
      inline def setGroupCells(value: Boolean | Double | String): Self = StObject.set(x, "groupCells", value.asInstanceOf[js.Any])
      
      inline def setGroupCellsUndefined: Self = StObject.set(x, "groupCells", js.undefined)
      
      inline def setHash(value: Boolean): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
      
      inline def setImagesLoaded(value: Boolean): Self = StObject.set(x, "imagesLoaded", value.asInstanceOf[js.Any])
      
      inline def setImagesLoadedUndefined: Self = StObject.set(x, "imagesLoaded", js.undefined)
      
      inline def setInitialIndex(value: Double | String): Self = StObject.set(x, "initialIndex", value.asInstanceOf[js.Any])
      
      inline def setInitialIndexUndefined: Self = StObject.set(x, "initialIndex", js.undefined)
      
      inline def setLazyLoad(value: Boolean | Double): Self = StObject.set(x, "lazyLoad", value.asInstanceOf[js.Any])
      
      inline def setLazyLoadUndefined: Self = StObject.set(x, "lazyLoad", js.undefined)
      
      inline def setOn(value: EventBindings): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
      
      inline def setOnUndefined: Self = StObject.set(x, "on", js.undefined)
      
      inline def setPageDots(value: Boolean): Self = StObject.set(x, "pageDots", value.asInstanceOf[js.Any])
      
      inline def setPageDotsUndefined: Self = StObject.set(x, "pageDots", js.undefined)
      
      inline def setPauseAutoPlayOnHover(value: Boolean): Self = StObject.set(x, "pauseAutoPlayOnHover", value.asInstanceOf[js.Any])
      
      inline def setPauseAutoPlayOnHoverUndefined: Self = StObject.set(x, "pauseAutoPlayOnHover", js.undefined)
      
      inline def setPercentPosition(value: Boolean): Self = StObject.set(x, "percentPosition", value.asInstanceOf[js.Any])
      
      inline def setPercentPositionUndefined: Self = StObject.set(x, "percentPosition", js.undefined)
      
      inline def setPrevNextButtons(value: Boolean): Self = StObject.set(x, "prevNextButtons", value.asInstanceOf[js.Any])
      
      inline def setPrevNextButtonsUndefined: Self = StObject.set(x, "prevNextButtons", js.undefined)
      
      inline def setResize(value: Boolean): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
      
      inline def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
      
      inline def setRightToLeft(value: Boolean): Self = StObject.set(x, "rightToLeft", value.asInstanceOf[js.Any])
      
      inline def setRightToLeftUndefined: Self = StObject.set(x, "rightToLeft", js.undefined)
      
      inline def setSelectedAttraction(value: Double): Self = StObject.set(x, "selectedAttraction", value.asInstanceOf[js.Any])
      
      inline def setSelectedAttractionUndefined: Self = StObject.set(x, "selectedAttraction", js.undefined)
      
      inline def setSetGallerySize(value: Boolean): Self = StObject.set(x, "setGallerySize", value.asInstanceOf[js.Any])
      
      inline def setSetGallerySizeUndefined: Self = StObject.set(x, "setGallerySize", js.undefined)
      
      inline def setWatchCSS(value: Boolean | String): Self = StObject.set(x, "watchCSS", value.asInstanceOf[js.Any])
      
      inline def setWatchCSSUndefined: Self = StObject.set(x, "watchCSS", js.undefined)
      
      inline def setWrapAround(value: Boolean): Self = StObject.set(x, "wrapAround", value.asInstanceOf[js.Any])
      
      inline def setWrapAroundUndefined: Self = StObject.set(x, "wrapAround", js.undefined)
    }
  }
  
  object global {
    
    @js.native
    trait JQuery extends StObject {
      
      def flickity(): this.type = js.native
      def flickity(command: String, params: Any*): this.type = js.native
      def flickity(options: Options): this.type = js.native
    }
  }
}
