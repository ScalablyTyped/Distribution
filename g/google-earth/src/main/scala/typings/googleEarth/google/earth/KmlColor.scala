package typings.googleEarth.google.earth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KmlColor extends js.Object {
  /**
    * Returns the color of an object.
    */
  def get(): String = js.native
  /**
    * opacity value
    */
  def getA(): Double = js.native
  /**
    * blue numerical value
    */
  def getB(): Double = js.native
  /**
    * green numerical value
    */
  def getG(): Double = js.native
  /**
    * red numerical value
    */
  def getR(): Double = js.native
  /**
    * Set the color of an object.
    */
  def set(color: String): Unit = js.native
  /**
    * opacity value
    */
  def setA(a: Double): Unit = js.native
  /**
    * blue numerical value
    */
  def setB(b: Double): Unit = js.native
  /**
    * green numerical value
    */
  def setG(g: Double): Unit = js.native
  /**
    * red numerical value
    */
  def setR(r: Double): Unit = js.native
}

object KmlColor {
  @scala.inline
  def apply(
    get: () => String,
    getA: () => Double,
    getB: () => Double,
    getG: () => Double,
    getR: () => Double,
    set: String => Unit,
    setA: Double => Unit,
    setB: Double => Unit,
    setG: Double => Unit,
    setR: Double => Unit
  ): KmlColor = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get), getA = js.Any.fromFunction0(getA), getB = js.Any.fromFunction0(getB), getG = js.Any.fromFunction0(getG), getR = js.Any.fromFunction0(getR), set = js.Any.fromFunction1(set), setA = js.Any.fromFunction1(setA), setB = js.Any.fromFunction1(setB), setG = js.Any.fromFunction1(setG), setR = js.Any.fromFunction1(setR))
    __obj.asInstanceOf[KmlColor]
  }
  @scala.inline
  implicit class KmlColorOps[Self <: KmlColor] (val x: Self) extends AnyVal {
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
    def setGet(value: () => String): Self = this.set("get", js.Any.fromFunction0(value))
    @scala.inline
    def setGetA(value: () => Double): Self = this.set("getA", js.Any.fromFunction0(value))
    @scala.inline
    def setGetB(value: () => Double): Self = this.set("getB", js.Any.fromFunction0(value))
    @scala.inline
    def setGetG(value: () => Double): Self = this.set("getG", js.Any.fromFunction0(value))
    @scala.inline
    def setGetR(value: () => Double): Self = this.set("getR", js.Any.fromFunction0(value))
    @scala.inline
    def setSet(value: String => Unit): Self = this.set("set", js.Any.fromFunction1(value))
    @scala.inline
    def setSetA(value: Double => Unit): Self = this.set("setA", js.Any.fromFunction1(value))
    @scala.inline
    def setSetB(value: Double => Unit): Self = this.set("setB", js.Any.fromFunction1(value))
    @scala.inline
    def setSetG(value: Double => Unit): Self = this.set("setG", js.Any.fromFunction1(value))
    @scala.inline
    def setSetR(value: Double => Unit): Self = this.set("setR", js.Any.fromFunction1(value))
  }
  
}

