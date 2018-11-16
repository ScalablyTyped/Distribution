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

