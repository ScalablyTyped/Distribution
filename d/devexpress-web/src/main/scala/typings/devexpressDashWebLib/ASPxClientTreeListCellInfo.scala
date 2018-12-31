package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains information on a tree list cell.
  */
trait ASPxClientTreeListCellInfo extends js.Object {
  /**
    * Gets the data column that contains the cell currently being processed.
    * Value: An ASPxClientTreeListColumn object that is the data column which contains the processed cell.
    */
  var column: ASPxClientTreeListColumn
  /**
    * Gets the processed node's key value.
    * Value: A String value that identifies the processed node.
    */
  var nodeKey: java.lang.String
}

