package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client rectangle object.
  */
@js.native
trait ASPxClientRect extends js.Object {
  /**
    * Gets the Y-coordinate of the rectangle's bottom edge.
    */
  def GetBottom(): Double = js.native
  /**
    * Gets the rectangle's height.
    */
  def GetHeight(): Double = js.native
  /**
    * Gets the X-coordinate of the rectangle's left edge.
    */
  def GetLeft(): Double = js.native
  /**
    * Gets the X-coordinate of the rectangle's right edge.
    */
  def GetRight(): Double = js.native
  /**
    * Gets the Y-coordinate of the rectangle's top edge.
    */
  def GetTop(): Double = js.native
  /**
    * Gets the rectangle's width.
    */
  def GetWidth(): Double = js.native
}

object ASPxClientRect {
  @scala.inline
  def apply(
    GetBottom: () => Double,
    GetHeight: () => Double,
    GetLeft: () => Double,
    GetRight: () => Double,
    GetTop: () => Double,
    GetWidth: () => Double
  ): ASPxClientRect = {
    val __obj = js.Dynamic.literal(GetBottom = js.Any.fromFunction0(GetBottom), GetHeight = js.Any.fromFunction0(GetHeight), GetLeft = js.Any.fromFunction0(GetLeft), GetRight = js.Any.fromFunction0(GetRight), GetTop = js.Any.fromFunction0(GetTop), GetWidth = js.Any.fromFunction0(GetWidth))
    __obj.asInstanceOf[ASPxClientRect]
  }
  @scala.inline
  implicit class ASPxClientRectOps[Self <: ASPxClientRect] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetBottom(value: () => Double): Self = this.set("GetBottom", js.Any.fromFunction0(value))
    @scala.inline
    def setGetHeight(value: () => Double): Self = this.set("GetHeight", js.Any.fromFunction0(value))
    @scala.inline
    def setGetLeft(value: () => Double): Self = this.set("GetLeft", js.Any.fromFunction0(value))
    @scala.inline
    def setGetRight(value: () => Double): Self = this.set("GetRight", js.Any.fromFunction0(value))
    @scala.inline
    def setGetTop(value: () => Double): Self = this.set("GetTop", js.Any.fromFunction0(value))
    @scala.inline
    def setGetWidth(value: () => Double): Self = this.set("GetWidth", js.Any.fromFunction0(value))
  }
  
}

