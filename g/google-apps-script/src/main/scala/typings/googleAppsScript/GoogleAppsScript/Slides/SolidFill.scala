package typings.googleAppsScript.GoogleAppsScript.Slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A solid color fill.
  *
  * SolidFill objects are detached and immutable, so do not reflect changes made after
  * they have been created.
  */
@js.native
trait SolidFill extends js.Object {
  def getAlpha(): Double = js.native
  def getColor(): Color = js.native
}

object SolidFill {
  @scala.inline
  def apply(getAlpha: () => Double, getColor: () => Color): SolidFill = {
    val __obj = js.Dynamic.literal(getAlpha = js.Any.fromFunction0(getAlpha), getColor = js.Any.fromFunction0(getColor))
    __obj.asInstanceOf[SolidFill]
  }
  @scala.inline
  implicit class SolidFillOps[Self <: SolidFill] (val x: Self) extends AnyVal {
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
    def setGetAlpha(value: () => Double): Self = this.set("getAlpha", js.Any.fromFunction0(value))
    @scala.inline
    def setGetColor(value: () => Color): Self = this.set("getColor", js.Any.fromFunction0(value))
  }
  
}

