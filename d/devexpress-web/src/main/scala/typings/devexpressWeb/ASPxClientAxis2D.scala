package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the Axis2D class.
  */
@JSGlobal("ASPxClientAxis2D")
@js.native
class ASPxClientAxis2D () extends ASPxClientAxisBase {
  /**
    * Provides access to an axis title object.
    */
  var axisTitle: ASPxClientAxisTitle = js.native
  /**
    * Provides access to the collection of the axis constant lines.
    */
  var constantLines: js.Array[ASPxClientConstantLine] = js.native
  /**
    * Provides access to the axis strips collection.
    */
  var strips: js.Array[ASPxClientStrip] = js.native
}

