package typings.googleEarth.google.earth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KmlScale extends KmlObject {
  /**
    * Indicates the x coordinate.
    */
  def getX(): Double
  /**
    * Indicates the y coordinate.
    */
  def getY(): Double
  /**
    * Indicates the z coordinate.
    */
  def getZ(): Double
  /**
    * Sets the x, y, and z coordinates for a model.
    */
  def set(x: Double, y: Double, z: Double): Unit
  /**
    * Indicates the x coordinate.
    */
  def setX(x: Double): Unit
  /**
    * Indicates the y coordinate.
    */
  def setY(y: Double): Unit
  /**
    * Indicates the z coordinate.
    */
  def setZ(z: Double): Unit
}

object KmlScale {
  @scala.inline
  def apply(
    click: KmlMouseEvent => Unit,
    dblclick: KmlMouseEvent => Unit,
    equals: KmlObject => Boolean,
    getId: () => String,
    getOwnerDocument: () => KmlDocument,
    getParentNode: () => KmlObject,
    getType: () => String,
    getUrl: () => String,
    getX: () => Double,
    getY: () => Double,
    getZ: () => Double,
    mousedown: KmlMouseEvent => Unit,
    mousemove: KmlMouseEvent => Unit,
    mouseout: KmlMouseEvent => Unit,
    mouseover: KmlMouseEvent => Unit,
    mouseup: KmlMouseEvent => Unit,
    release: () => Unit,
    set: (Double, Double, Double) => Unit,
    setX: Double => Unit,
    setY: Double => Unit,
    setZ: Double => Unit
  ): KmlScale = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction1(click), dblclick = js.Any.fromFunction1(dblclick), equals = js.Any.fromFunction1(equals), getId = js.Any.fromFunction0(getId), getOwnerDocument = js.Any.fromFunction0(getOwnerDocument), getParentNode = js.Any.fromFunction0(getParentNode), getType = js.Any.fromFunction0(getType), getUrl = js.Any.fromFunction0(getUrl), getX = js.Any.fromFunction0(getX), getY = js.Any.fromFunction0(getY), getZ = js.Any.fromFunction0(getZ), mousedown = js.Any.fromFunction1(mousedown), mousemove = js.Any.fromFunction1(mousemove), mouseout = js.Any.fromFunction1(mouseout), mouseover = js.Any.fromFunction1(mouseover), mouseup = js.Any.fromFunction1(mouseup), release = js.Any.fromFunction0(release), set = js.Any.fromFunction3(set), setX = js.Any.fromFunction1(setX), setY = js.Any.fromFunction1(setY), setZ = js.Any.fromFunction1(setZ))
    __obj.asInstanceOf[KmlScale]
  }
}

