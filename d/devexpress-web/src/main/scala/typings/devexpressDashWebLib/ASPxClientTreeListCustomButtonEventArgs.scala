package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Provides data for the CustomButtonClick event.
 */

trait ASPxClientTreeListCustomButtonEventArgs extends ASPxClientEventArgs {
  /**
       * Gets the value which identifies the custom button.
       * Value: A String value that identifies the clicked custom button.
       */
  var buttonID: java.lang.String
  /**
       * Gets the button's index.
       * Value: An integer value that specifies the button's position within the CustomButtons collection.
       */
  var buttonIndex: scala.Double
  /**
       * Gets the key value of the node whose custom button has been clicked.
       * Value: A string value that uniquely identifies the node whose custom button has been clicked.
       */
  var nodeKey: java.lang.String
}

