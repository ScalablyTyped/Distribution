package typings.googleAppsScript.GoogleAppsScript.Slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes the border around an element.
  */
@js.native
trait Border extends js.Object {
  def getDashStyle(): DashStyle = js.native
  def getLineFill(): LineFill = js.native
  def getWeight(): Double = js.native
  def isVisible(): Boolean = js.native
  def setDashStyle(style: DashStyle): Border = js.native
  def setTransparent(): Border = js.native
  def setWeight(points: Double): Border = js.native
}

object Border {
  @scala.inline
  def apply(
    getDashStyle: () => DashStyle,
    getLineFill: () => LineFill,
    getWeight: () => Double,
    isVisible: () => Boolean,
    setDashStyle: DashStyle => Border,
    setTransparent: () => Border,
    setWeight: Double => Border
  ): Border = {
    val __obj = js.Dynamic.literal(getDashStyle = js.Any.fromFunction0(getDashStyle), getLineFill = js.Any.fromFunction0(getLineFill), getWeight = js.Any.fromFunction0(getWeight), isVisible = js.Any.fromFunction0(isVisible), setDashStyle = js.Any.fromFunction1(setDashStyle), setTransparent = js.Any.fromFunction0(setTransparent), setWeight = js.Any.fromFunction1(setWeight))
    __obj.asInstanceOf[Border]
  }
  @scala.inline
  implicit class BorderOps[Self <: Border] (val x: Self) extends AnyVal {
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
    def setGetDashStyle(value: () => DashStyle): Self = this.set("getDashStyle", js.Any.fromFunction0(value))
    @scala.inline
    def setGetLineFill(value: () => LineFill): Self = this.set("getLineFill", js.Any.fromFunction0(value))
    @scala.inline
    def setGetWeight(value: () => Double): Self = this.set("getWeight", js.Any.fromFunction0(value))
    @scala.inline
    def setIsVisible(value: () => Boolean): Self = this.set("isVisible", js.Any.fromFunction0(value))
    @scala.inline
    def setSetDashStyle(value: DashStyle => Border): Self = this.set("setDashStyle", js.Any.fromFunction1(value))
    @scala.inline
    def setSetTransparent(value: () => Border): Self = this.set("setTransparent", js.Any.fromFunction0(value))
    @scala.inline
    def setSetWeight(value: Double => Border): Self = this.set("setWeight", js.Any.fromFunction1(value))
  }
  
}

