package typings.googleDashEarth.googleNs.earthNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.earth.KmlOrientation")
@js.native
class KmlOrientation () extends KmlObject {
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

