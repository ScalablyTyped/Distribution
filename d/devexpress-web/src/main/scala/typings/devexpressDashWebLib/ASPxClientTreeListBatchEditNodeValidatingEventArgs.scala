package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the BatchEditNodeValidating event.
  */
trait ASPxClientTreeListBatchEditNodeValidatingEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the node's key value.
    * Value: A String value that identifies the processed node.
    */
  var nodeKey: java.lang.String
  /**
    * Provides validation information of a validated node.
    * Value: An object that is a hashtable containing validation information.
    */
  var validationInfo: js.Object
}

