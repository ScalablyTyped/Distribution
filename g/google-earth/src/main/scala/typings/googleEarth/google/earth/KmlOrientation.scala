package typings.googleEarth.google.earth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KmlOrientation extends KmlObject {
  /**
    * Rotation about the z axis (normal to the Earth's surface).
    * A value of 0 (the default) equals North.
    * A positive rotation is clockwise around the z axis and specified in degrees from 0 to 360.
    */
  def getHeading(): Double = js.native
  /**
    * Rotation about the y axis.
    * A positive rotation is clockwise around the y axis and specified in degrees from 0 to 360.
    */
  def getRoll(): Double = js.native
  /**
    * Rotation about the x axis.
    * A positive rotation is clockwise around the x axis and specified in degrees from 0 to 360.
    */
  def getTilt(): Double = js.native
  /**
    * Sets the heading, tilt, and roll of a model.
    */
  def set(heading: Double, tilt: Double, roll: Double): Unit = js.native
  /**
    * Rotation about the z axis (normal to the Earth's surface).
    * A value of 0 (the default) equals North.
    * A positive rotation is clockwise around the z axis and specified in degrees from 0 to 360.
    */
  def setHeading(heading: Double): Unit = js.native
  /**
    * Rotation about the y axis.
    * A positive rotation is clockwise around the y axis and specified in degrees from 0 to 360.
    */
  def setRoll(roll: Double): Unit = js.native
  /**
    * Rotation about the x axis.
    * A positive rotation is clockwise around the x axis and specified in degrees from 0 to 360.
    */
  def setTilt(tilt: Double): Unit = js.native
}

object KmlOrientation {
  @scala.inline
  def apply(
    click: KmlMouseEvent => Unit,
    dblclick: KmlMouseEvent => Unit,
    equals: KmlObject => Boolean,
    getHeading: () => Double,
    getId: () => String,
    getOwnerDocument: () => KmlDocument,
    getParentNode: () => KmlObject,
    getRoll: () => Double,
    getTilt: () => Double,
    getType: () => String,
    getUrl: () => String,
    mousedown: KmlMouseEvent => Unit,
    mousemove: KmlMouseEvent => Unit,
    mouseout: KmlMouseEvent => Unit,
    mouseover: KmlMouseEvent => Unit,
    mouseup: KmlMouseEvent => Unit,
    release: () => Unit,
    set: (Double, Double, Double) => Unit,
    setHeading: Double => Unit,
    setRoll: Double => Unit,
    setTilt: Double => Unit
  ): KmlOrientation = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction1(click), dblclick = js.Any.fromFunction1(dblclick), equals = js.Any.fromFunction1(equals), getHeading = js.Any.fromFunction0(getHeading), getId = js.Any.fromFunction0(getId), getOwnerDocument = js.Any.fromFunction0(getOwnerDocument), getParentNode = js.Any.fromFunction0(getParentNode), getRoll = js.Any.fromFunction0(getRoll), getTilt = js.Any.fromFunction0(getTilt), getType = js.Any.fromFunction0(getType), getUrl = js.Any.fromFunction0(getUrl), mousedown = js.Any.fromFunction1(mousedown), mousemove = js.Any.fromFunction1(mousemove), mouseout = js.Any.fromFunction1(mouseout), mouseover = js.Any.fromFunction1(mouseover), mouseup = js.Any.fromFunction1(mouseup), release = js.Any.fromFunction0(release), set = js.Any.fromFunction3(set), setHeading = js.Any.fromFunction1(setHeading), setRoll = js.Any.fromFunction1(setRoll), setTilt = js.Any.fromFunction1(setTilt))
    __obj.asInstanceOf[KmlOrientation]
  }
  @scala.inline
  implicit class KmlOrientationOps[Self <: KmlOrientation] (val x: Self) extends AnyVal {
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
    def setGetHeading(value: () => Double): Self = this.set("getHeading", js.Any.fromFunction0(value))
    @scala.inline
    def setGetRoll(value: () => Double): Self = this.set("getRoll", js.Any.fromFunction0(value))
    @scala.inline
    def setGetTilt(value: () => Double): Self = this.set("getTilt", js.Any.fromFunction0(value))
    @scala.inline
    def setSet(value: (Double, Double, Double) => Unit): Self = this.set("set", js.Any.fromFunction3(value))
    @scala.inline
    def setSetHeading(value: Double => Unit): Self = this.set("setHeading", js.Any.fromFunction1(value))
    @scala.inline
    def setSetRoll(value: Double => Unit): Self = this.set("setRoll", js.Any.fromFunction1(value))
    @scala.inline
    def setSetTilt(value: Double => Unit): Self = this.set("setTilt", js.Any.fromFunction1(value))
  }
  
}

