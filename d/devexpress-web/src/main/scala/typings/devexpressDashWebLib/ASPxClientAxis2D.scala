package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the Axis2D class.
  */
trait ASPxClientAxis2D extends ASPxClientAxisBase {
  /**
    * Provides access to an axis title object.
    * Value: An ASPxClientAxisTitle object which represents the axis title.
    */
  var axisTitle: ASPxClientAxisTitle
  /**
    * Provides access to the collection of the axis constant lines.
    * Value: An array of ASPxClientConstantLine objects which represent constant lines that belong to this axis.
    */
  var constantLines: js.Array[ASPxClientConstantLine]
  /**
    * Provides access to the axis strips collection.
    * Value: An array of ASPxClientStrip objects.
    */
  var strips: js.Array[ASPxClientStrip]
}

