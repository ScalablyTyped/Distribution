package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client point object.
  */
@js.native
trait ASPxClientPoint extends js.Object {
  /**
    * Gets the point's X-coordinate.
    */
  def GetX(): Double = js.native
  /**
    * Gets the point's Y-coordinate.
    */
  def GetY(): Double = js.native
}

object ASPxClientPoint {
  @scala.inline
  def apply(GetX: () => Double, GetY: () => Double): ASPxClientPoint = {
    val __obj = js.Dynamic.literal(GetX = js.Any.fromFunction0(GetX), GetY = js.Any.fromFunction0(GetY))
    __obj.asInstanceOf[ASPxClientPoint]
  }
  @scala.inline
  implicit class ASPxClientPointOps[Self <: ASPxClientPoint] (val x: Self) extends AnyVal {
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
    def setGetX(value: () => Double): Self = this.set("GetX", js.Any.fromFunction0(value))
    @scala.inline
    def setGetY(value: () => Double): Self = this.set("GetY", js.Any.fromFunction0(value))
  }
  
}

