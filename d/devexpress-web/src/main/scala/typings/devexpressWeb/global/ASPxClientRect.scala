package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client rectangle object.
  */
@JSGlobal("ASPxClientRect")
@js.native
class ASPxClientRect protected ()
  extends typings.devexpressWeb.ASPxClientRect {
  /**
    * Initializes a new instance of the ASPxClientRect object. For internal use only.
    * @param x An integer value specifying the x-coordinate of the upper-left corner of the rectangle.
    * @param y An integer value specifying the y-coordinate of the upper-left corner of the rectangle.
    * @param width An integer value specifying the rectangle width.
    * @param height An integer value specifying the rectangle height.
    */
  def this(x: Double, y: Double, width: Double, height: Double) = this()
  /**
    * Gets the Y-coordinate of the rectangle's bottom edge.
    */
  /* CompleteClass */
  override def GetBottom(): Double = js.native
  /**
    * Gets the rectangle's height.
    */
  /* CompleteClass */
  override def GetHeight(): Double = js.native
  /**
    * Gets the X-coordinate of the rectangle's left edge.
    */
  /* CompleteClass */
  override def GetLeft(): Double = js.native
  /**
    * Gets the X-coordinate of the rectangle's right edge.
    */
  /* CompleteClass */
  override def GetRight(): Double = js.native
  /**
    * Gets the Y-coordinate of the rectangle's top edge.
    */
  /* CompleteClass */
  override def GetTop(): Double = js.native
  /**
    * Gets the rectangle's width.
    */
  /* CompleteClass */
  override def GetWidth(): Double = js.native
}

