package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TouchBarScrubberConstructorOptions extends js.Object {
  /**
    * Defaults to true.
    */
  var continuous: scala.Boolean
  /**
    * An array of items to place in this scrubber.
    */
  var items: js.Array[ScrubberItem]
  /**
    * Defaults to free.
    */
  var mode: java.lang.String
  /**
    * Selected overlay item style. Defaults to null.
    */
  var overlayStyle: java.lang.String
  /**
    * Selected item style. Defaults to null.
    */
  var selectedStyle: java.lang.String
  /**
    * Defaults to false.
    */
  var showArrowButtons: scala.Boolean
  /**
    * Called when the user taps any item.
    */
  def highlight(highlightedIndex: scala.Double): scala.Unit
  /**
    * Called when the user taps an item that was not the last tapped item.
    */
  def select(selectedIndex: scala.Double): scala.Unit
}

object TouchBarScrubberConstructorOptions {
  @scala.inline
  def apply(
    continuous: scala.Boolean,
    highlight: js.Function1[scala.Double, scala.Unit],
    items: js.Array[ScrubberItem],
    mode: java.lang.String,
    overlayStyle: java.lang.String,
    select: js.Function1[scala.Double, scala.Unit],
    selectedStyle: java.lang.String,
    showArrowButtons: scala.Boolean
  ): TouchBarScrubberConstructorOptions = {
    val __obj = js.Dynamic.literal(continuous = continuous, highlight = highlight, items = items, mode = mode, overlayStyle = overlayStyle, select = select, selectedStyle = selectedStyle, showArrowButtons = showArrowButtons)
  
    __obj.asInstanceOf[TouchBarScrubberConstructorOptions]
  }
}

