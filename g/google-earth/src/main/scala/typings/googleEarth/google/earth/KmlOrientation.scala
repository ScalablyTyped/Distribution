package typings.googleEarth.google.earth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KmlOrientation extends KmlObject {
  /**
    * Rotation about the z axis (normal to the Earth's surface).
    * A value of 0 (the default) equals North.
    * A positive rotation is clockwise around the z axis and specified in degrees from 0 to 360.
    */
  def getHeading(): Double
  /**
    * Rotation about the y axis.
    * A positive rotation is clockwise around the y axis and specified in degrees from 0 to 360.
    */
  def getRoll(): Double
  /**
    * Rotation about the x axis.
    * A positive rotation is clockwise around the x axis and specified in degrees from 0 to 360.
    */
  def getTilt(): Double
  /**
    * Sets the heading, tilt, and roll of a model.
    */
  def set(heading: Double, tilt: Double, roll: Double): Unit
  /**
    * Rotation about the z axis (normal to the Earth's surface).
    * A value of 0 (the default) equals North.
    * A positive rotation is clockwise around the z axis and specified in degrees from 0 to 360.
    */
  def setHeading(heading: Double): Unit
  /**
    * Rotation about the y axis.
    * A positive rotation is clockwise around the y axis and specified in degrees from 0 to 360.
    */
  def setRoll(roll: Double): Unit
  /**
    * Rotation about the x axis.
    * A positive rotation is clockwise around the x axis and specified in degrees from 0 to 360.
    */
  def setTilt(tilt: Double): Unit
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
}

