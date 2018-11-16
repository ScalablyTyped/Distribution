package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * A Card widget that visualizes a Card dashboard item's data.
 */

trait CardWidget extends js.Object {
  /**
       * Gets or sets the background color for a card.
       * Value: A string that specifies the <a href="https://www.w3schools.com/html/html_colors.asp">HTML color</a> used to paint a card's background.
       */
  var cardBackColor: java.lang.String
  /**
       * Allows you to customize texts displayed within individual cards.
       * Value: A handler used customize texts displayed within individual cards.
       */
  var onCustomizeText: js.Object
  /**
       * Gets the root element of the widget.
       */
  def element(): js.Object
}

