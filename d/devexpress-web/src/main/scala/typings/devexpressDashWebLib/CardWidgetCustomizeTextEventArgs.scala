package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Provides data for the onCustomizeText handler.
 */

trait CardWidgetCustomizeTextEventArgs extends js.Object {
  /**
       * Gets a formatted value displayed within the card.
       */
  def getDefaultText(): java.lang.String
  /**
       * Gets a dimension/measure value to be displayed within the card.
       */
  def getValue(): js.Object
}

