package typings.flickity.flickityMod

import typings.flickity.Anon_X
import typings.flickity.flickityMod.Global.JQuery
import typings.std.Element
import typings.std.Event
import typings.std.HTMLElement
import typings.std.NodeList
import typings.std.Touch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Flickity extends js.Object {
  /**
    * The array of cells. Use cells.length for the total number of cells.
    */
  var cells: js.Array[Element] = js.native
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
  def listener(params: js.Any*): Unit = js.native
  /**
    * Select the next cell.
    * @param isWrapped (Optional) If true, the first cell will be selected if at the first cell.
    */
  def next(): Unit = js.native
  def next(isWrapped: Boolean): Unit = js.native
  /**
    * Remove event listener
    * @param eventName name of event  (@see Flickity.FlickityEvents class for filckity supported events)
    * @param callback callback funtion to execute when event fires
    */
  def off(eventname: FlickityEvents, callback: js.Function1[js.UndefOr[Boolean | Double], _]): Unit = js.native
  /**
    * Remove event listener
    * @param eventName name of event  (@see Flickity.FlickityEvents class for filckity supported events)
    * @param callback callback funtion to execute when event fires
    */
  def off(
    eventname: FlickityEvents,
    callback: js.Function2[js.UndefOr[Event], js.UndefOr[Element | Touch], _]
  ): Unit = js.native
  /**
    * Remove event listener
    * @param eventName name of event  (@see Flickity.FlickityEvents class for filckity supported events)
    * @param callback callback funtion to execute when event fires
    */
  def off(
    eventname: FlickityEvents,
    callback: js.Function3[
      /* event */ js.UndefOr[Event], 
      /* pointer */ js.UndefOr[Element | Touch], 
      /* moveVector */ js.UndefOr[js.Object], 
      _
    ]
  ): Unit = js.native
  /**
    * Remove event listener
    * @param eventName name of event  (@see Flickity.FlickityEvents class for filckity supported events)
    * @param callback callback funtion to execute when event fires
    */
  def off(
    eventname: FlickityEvents,
    callback: js.Function4[
      /* event */ js.UndefOr[Event], 
      /* pointer */ js.UndefOr[Element | Touch], 
      /* cellElement */ js.UndefOr[Element], 
      /* cellIndex */ js.UndefOr[Double], 
      _
    ]
  ): Unit = js.native
  /**
    * bind event listener
    * @param eventName name of event  (@see Flickity.FlickityEvents class for filckity supported events)
    * @param callback callback funtion to execute when event fires
    */
  def on(eventname: FlickityEvents, callback: js.Function1[js.UndefOr[Boolean | Double], _]): Unit = js.native
  /**
    * bind event listener
    * @param eventName name of event  (@see Flickity.FlickityEvents class for filckity supported events)
    * @param callback callback funtion to execute when event fires
    */
  def on(
    eventname: FlickityEvents,
    callback: js.Function2[js.UndefOr[Event], js.UndefOr[Element | Touch], _]
  ): Unit = js.native
  /**
    * bind event listener
    * @param eventName name of event  (@see Flickity.FlickityEvents class for filckity supported events)
    * @param callback callback funtion to execute when event fires
    */
  def on(
    eventname: FlickityEvents,
    callback: js.Function3[
      /* event */ js.UndefOr[Event], 
      /* pointer */ js.UndefOr[Element | Touch], 
      /* moveVector */ js.UndefOr[Anon_X], 
      _
    ]
  ): Unit = js.native
  /**
    * bind event listener
    * @param eventName name of event  (@see Flickity.FlickityEvents class for filckity supported events)
    * @param callback callback funtion to execute when event fires
    */
  def on(
    eventname: FlickityEvents,
    callback: js.Function4[
      /* event */ js.UndefOr[Event], 
      /* pointer */ js.UndefOr[Element | Touch], 
      /* cellElement */ js.UndefOr[Element], 
      /* cellIndex */ js.UndefOr[Double], 
      _
    ]
  ): Unit = js.native
  /**
    * one time event handler
    * @param eventName name of event  (@see Flickity.FlickityEvents class for filckity supported events)
    * @param callback callback funtion to execute when event fires
    */
  def once(eventname: String, callback: js.Function2[js.UndefOr[Event], js.UndefOr[Element | Touch], _]): Unit = js.native
  /**
    * one time event handl`er
    * @param eventName name of event  (@see Flickity.FlickityEvents class for filckity supported events)
    * @param callback callback funtion to execute when event fires
    */
  def once(
    eventname: String,
    callback: js.Function3[
      /* event */ js.UndefOr[Event], 
      /* pointer */ js.UndefOr[Element | Touch], 
      /* moveVector */ js.UndefOr[js.Object], 
      _
    ]
  ): Unit = js.native
  /**
    * one time event handler
    * @param eventName name of event  (@see Flickity.FlickityEvents class for filckity supported events)
    * @param callback callback funtion to execute when event fires
    */
  def once(
    eventname: String,
    callback: js.Function4[
      /* event */ js.UndefOr[Event], 
      /* pointer */ js.UndefOr[Element | Touch], 
      /* cellElement */ js.UndefOr[Element], 
      /* cellIndex */ js.UndefOr[Double], 
      _
    ]
  ): Unit = js.native
  /**
    * one time event handler
    * @param eventName name of event  (@see Flickity.FlickityEvents class for filckity supported events)
    * @param callback callback funtion to execute when event fires
    */
  def once(eventname: FlickityEvents, callback: js.Function1[js.UndefOr[Boolean | Double], _]): Unit = js.native
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
  def selectCell(index: String): Unit = js.native
  def selectCell(index: String, isWrapped: Boolean): Unit = js.native
  def selectCell(index: String, isWrapped: Boolean, isInstant: Boolean): Unit = js.native
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
  /**
    * Stops auto-play and cancels pause.
    */
  def stopPlayer(): Unit = js.native
  /**
    * Resumes auto-play if paused.
    */
  def unpausePlayer(): Unit = js.native
}

