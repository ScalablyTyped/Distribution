package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client point object.
  */
@JSGlobal("ASPxClientPoint")
@js.native
class ASPxClientPoint protected () extends js.Object {
  /**
    * Initializes a new instance of the ASPxClientPoint object. For internal use only.
    * @param x An integer value specifying the x-coordinate of the point.
    * @param y An integer value specifying the y-coordinate of the point.
    */
  def this(x: Double, y: Double) = this()
  /**
    * Gets the point's X-coordinate.
    */
  def GetX(): Double = js.native
  /**
    * Gets the point's Y-coordinate.
    */
  def GetY(): Double = js.native
}

