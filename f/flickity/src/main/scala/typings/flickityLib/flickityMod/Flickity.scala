package typings
package flickityLib.flickityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Flickity extends js.Object {
  /**
    * The array of cells. Use cells.length for the total number of cells.
    */
  var cells: js.Array[stdLib.Element] = js.native
  /**
    * The selected cell element.
    */
  var selectedElement: stdLib.Element = js.native
  /**
    * An array of elements in the selected slide. Useful for groupCells.
    */
  var selectedElements: js.Array[stdLib.Element] = js.native
  // properties
  /**
    * The selected cell index.
    */
  var selectedIndex: scala.Double = js.native
  /**
    * The array of slides. Useful for groupCells. A slide contains multiple cells.
    * If groupCells is disabled, then each slide is a cell, so they are one in the same.
    */
  var slides: js.Array[stdLib.Element] = js.native
  /**
    * Append elements and create cells to the end of the gallery.
    *
    * @param elements JQuery, Element[], Element, or NodeList
    */
  def append(elements: flickityLib.flickityMod.Global.JQuery): scala.Unit = js.native
  def append(elements: js.Array[stdLib.Element]): scala.Unit = js.native
  def append(elements: stdLib.Element): scala.Unit = js.native
  def append(elements: stdLib.NodeList): scala.Unit = js.native
  /**
    * Remove Flickity functionality completely. destroy will return the element back to its pre-initialized state.
    */
  def destroy(): scala.Unit = js.native
  /**
    * Get the elements of the cells.
    * @returns  Element[]
    */
  def getCellElements(): js.Array[stdLib.Element] = js.native
  /**
    * Insert elements into the gallery and create cells.
    *
    * @param elements Element[], Element, or NodeList
    * @param index Integer: Zero-based index to insert elements.
    */
  def insert(elements: flickityLib.flickityMod.Global.JQuery, index: scala.Double): scala.Unit = js.native
  def insert(elements: js.Array[stdLib.Element], index: scala.Double): scala.Unit = js.native
  def insert(elements: stdLib.Element, index: scala.Double): scala.Unit = js.native
  def insert(elements: stdLib.NodeList, index: scala.Double): scala.Unit = js.native
  // event listeners
  /**
    * Add new classic event listener
    */
  def listener(params: js.Any*): scala.Unit = js.native
  /**
    * Select the next cell.
    * @param isWrapped (Optional) If true, the first cell will be selected if at the first cell.
    */
  def next(): scala.Unit = js.native
  def next(isWrapped: scala.Boolean): scala.Unit = js.native
  /**
    * Remove event listener
    * @param eventName name of event  (@see Flickity.FlickityEvents class for filckity supported events)
    * @param callback callback funtion to execute when event fires
    */
  def off(
    eventname: FlickityEvents,
    callback: js.Function2[
      /* event */ js.UndefOr[stdLib.Event], 
      /* cellElement */ /* pointer */ js.UndefOr[stdLib.Element | stdLib.Touch], 
      _
    ]
  ): scala.Unit = js.native
  /**
    * Remove event listener
    * @param eventName name of event  (@see Flickity.FlickityEvents class for filckity supported events)
    * @param callback callback funtion to execute when event fires
    */
  def off(
    eventname: FlickityEvents,
    callback: js.Function3[
      /* event */ js.UndefOr[stdLib.Event], 
      /* pointer */ js.UndefOr[stdLib.Element | stdLib.Touch], 
      /* moveVector */ js.UndefOr[js.Object], 
      _
    ]
  ): scala.Unit = js.native
  /**
    * Remove event listener
    * @param eventName name of event  (@see Flickity.FlickityEvents class for filckity supported events)
    * @param callback callback funtion to execute when event fires
    */
  def off(
    eventname: FlickityEvents,
    callback: js.Function4[
      /* event */ js.UndefOr[stdLib.Event], 
      /* pointer */ js.UndefOr[stdLib.Element | stdLib.Touch], 
      /* cellElement */ js.UndefOr[stdLib.Element], 
      /* cellIndex */ js.UndefOr[scala.Double], 
      _
    ]
  ): scala.Unit = js.native
  /**
    * bind event listener
    * @param eventName name of event  (@see Flickity.FlickityEvents class for filckity supported events)
    * @param callback callback funtion to execute when event fires
    */
  def on(
    eventname: FlickityEvents,
    callback: js.Function2[
      /* event */ js.UndefOr[stdLib.Event], 
      /* cellElement */ /* pointer */ js.UndefOr[stdLib.Element | stdLib.Touch], 
      _
    ]
  ): scala.Unit = js.native
  /**
    * bind event listener
    * @param eventName name of event  (@see Flickity.FlickityEvents class for filckity supported events)
    * @param callback callback funtion to execute when event fires
    */
  def on(
    eventname: FlickityEvents,
    callback: js.Function3[
      /* event */ js.UndefOr[stdLib.Event], 
      /* pointer */ js.UndefOr[stdLib.Element | stdLib.Touch], 
      /* moveVector */ js.UndefOr[flickityLib.Anon_X], 
      _
    ]
  ): scala.Unit = js.native
  /**
    * bind event listener
    * @param eventName name of event  (@see Flickity.FlickityEvents class for filckity supported events)
    * @param callback callback funtion to execute when event fires
    */
  def on(
    eventname: FlickityEvents,
    callback: js.Function4[
      /* event */ js.UndefOr[stdLib.Event], 
      /* pointer */ js.UndefOr[stdLib.Element | stdLib.Touch], 
      /* cellElement */ js.UndefOr[stdLib.Element], 
      /* cellIndex */ js.UndefOr[scala.Double], 
      _
    ]
  ): scala.Unit = js.native
  /**
    * one time event handler
    * @param eventName name of event  (@see Flickity.FlickityEvents class for filckity supported events)
    * @param callback callback funtion to execute when event fires
    */
  def once(
    eventname: java.lang.String,
    callback: js.Function2[
      /* event */ js.UndefOr[stdLib.Event], 
      /* cellElement */ /* pointer */ js.UndefOr[stdLib.Element | stdLib.Touch], 
      _
    ]
  ): scala.Unit = js.native
  /**
    * one time event handl`er
    * @param eventName name of event  (@see Flickity.FlickityEvents class for filckity supported events)
    * @param callback callback funtion to execute when event fires
    */
  def once(
    eventname: java.lang.String,
    callback: js.Function3[
      /* event */ js.UndefOr[stdLib.Event], 
      /* pointer */ js.UndefOr[stdLib.Element | stdLib.Touch], 
      /* moveVector */ js.UndefOr[js.Object], 
      _
    ]
  ): scala.Unit = js.native
  /**
    * one time event handler
    * @param eventName name of event  (@see Flickity.FlickityEvents class for filckity supported events)
    * @param callback callback funtion to execute when event fires
    */
  def once(
    eventname: java.lang.String,
    callback: js.Function4[
      /* event */ js.UndefOr[stdLib.Event], 
      /* pointer */ js.UndefOr[stdLib.Element | stdLib.Touch], 
      /* cellElement */ js.UndefOr[stdLib.Element], 
      /* cellIndex */ js.UndefOr[scala.Double], 
      _
    ]
  ): scala.Unit = js.native
  /**
    * Pauses auto-play.
    */
  def pausePlayer(): scala.Unit = js.native
  /**
    * Starts auto-play. Setting autoPlay will automatically start auto-play on initialization. You do not need to start auto-play with playPlayer.
    */
  def playPlayer(): scala.Unit = js.native
  /**
    * Prepend elements and create cells to the beginning of the gallery.
    *
    * @param elements JQuery, Element[], Element, or NodeList
    */
  def prepend(elements: flickityLib.flickityMod.Global.JQuery): scala.Unit = js.native
  def prepend(elements: js.Array[stdLib.Element]): scala.Unit = js.native
  def prepend(elements: stdLib.Element): scala.Unit = js.native
  def prepend(elements: stdLib.NodeList): scala.Unit = js.native
  /**
    * Select the previous cell.
    *
    * @param isWrapped (Optional) If true, the first cell will be selected if at the last cell.
    */
  def previous(): scala.Unit = js.native
  def previous(isWrapped: scala.Boolean): scala.Unit = js.native
  /**
    * Re-collect all cell elements in flickity-slider.
    */
  def reloadCells(): scala.Unit = js.native
  /**
    * Remove cells from gallery and remove elements from DOM.
    *
    * @param elements Element[], Element, or NodeList
    */
  def remove(elements: flickityLib.flickityMod.Global.JQuery): scala.Unit = js.native
  def remove(elements: js.Array[stdLib.Element]): scala.Unit = js.native
  def remove(elements: stdLib.Element): scala.Unit = js.native
  def remove(elements: stdLib.NodeList): scala.Unit = js.native
  /**
    * Position cells at selected position.
    * Trigger reposition after the size of a cell has been changed.
    */
  def reposition(): scala.Unit = js.native
  /**
    * Resize the gallery and re-position cells.
    */
  def resize(): scala.Unit = js.native
  // instance methods
  /**
    * Select a cell.
    *
    * @param index Integer Zero-based index of the cell to select.
    * @param isWrapped (Optional) If true, the last cell will be selected if at the first cell.
    * @param isInstant (Optional) If true, immediately view the selected cell without animation.
    */
  def select(index: scala.Double): scala.Unit = js.native
  def select(index: scala.Double, isWrapped: scala.Boolean): scala.Unit = js.native
  def select(index: scala.Double, isWrapped: scala.Boolean, isInstant: scala.Boolean): scala.Unit = js.native
  def selectCell(index: java.lang.String): scala.Unit = js.native
  def selectCell(index: java.lang.String, isWrapped: scala.Boolean): scala.Unit = js.native
  def selectCell(index: java.lang.String, isWrapped: scala.Boolean, isInstant: scala.Boolean): scala.Unit = js.native
  /**
    * Select a slide of a cell. Useful for groupCells.
    *
    * @param index Zero-based index OR selector string of the cell to select.
    * @param isWrapped If true, the last slide will be selected if at the first slide.
    * @param isInstant If true, immediately view the selected slide without animation.
    */
  def selectCell(index: scala.Double): scala.Unit = js.native
  def selectCell(index: scala.Double, isWrapped: scala.Boolean): scala.Unit = js.native
  def selectCell(index: scala.Double, isWrapped: scala.Boolean, isInstant: scala.Boolean): scala.Unit = js.native
  /**
    * Stops auto-play and cancels pause.
    */
  def stopPlayer(): scala.Unit = js.native
  /**
    * Resumes auto-play if paused.
    */
  def unpausePlayer(): scala.Unit = js.native
}

