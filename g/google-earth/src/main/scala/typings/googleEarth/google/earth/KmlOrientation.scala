package typings.googleEarth.google.earth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KmlOrientation
  extends StObject
     with KmlObject {
  
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
  
  inline def apply(
    click: KmlMouseEvent => Unit,
    dblclick: KmlMouseEvent => Unit,
    equals_ : KmlObject => Boolean,
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
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction1(click), dblclick = js.Any.fromFunction1(dblclick), getHeading = js.Any.fromFunction0(getHeading), getId = js.Any.fromFunction0(getId), getOwnerDocument = js.Any.fromFunction0(getOwnerDocument), getParentNode = js.Any.fromFunction0(getParentNode), getRoll = js.Any.fromFunction0(getRoll), getTilt = js.Any.fromFunction0(getTilt), getType = js.Any.fromFunction0(getType), getUrl = js.Any.fromFunction0(getUrl), mousedown = js.Any.fromFunction1(mousedown), mousemove = js.Any.fromFunction1(mousemove), mouseout = js.Any.fromFunction1(mouseout), mouseover = js.Any.fromFunction1(mouseover), mouseup = js.Any.fromFunction1(mouseup), release = js.Any.fromFunction0(release), set = js.Any.fromFunction3(set), setHeading = js.Any.fromFunction1(setHeading), setRoll = js.Any.fromFunction1(setRoll), setTilt = js.Any.fromFunction1(setTilt))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[KmlOrientation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KmlOrientation] (val x: Self) extends AnyVal {
    
    inline def setGetHeading(value: () => Double): Self = StObject.set(x, "getHeading", js.Any.fromFunction0(value))
    
    inline def setGetRoll(value: () => Double): Self = StObject.set(x, "getRoll", js.Any.fromFunction0(value))
    
    inline def setGetTilt(value: () => Double): Self = StObject.set(x, "getTilt", js.Any.fromFunction0(value))
    
    inline def setSet(value: (Double, Double, Double) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction3(value))
    
    inline def setSetHeading(value: Double => Unit): Self = StObject.set(x, "setHeading", js.Any.fromFunction1(value))
    
    inline def setSetRoll(value: Double => Unit): Self = StObject.set(x, "setRoll", js.Any.fromFunction1(value))
    
    inline def setSetTilt(value: Double => Unit): Self = StObject.set(x, "setTilt", js.Any.fromFunction1(value))
  }
}
