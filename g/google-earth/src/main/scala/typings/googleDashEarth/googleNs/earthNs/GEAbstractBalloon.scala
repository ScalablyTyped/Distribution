package typings.googleDashEarth.googleNs.earthNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.earth.GEAbstractBalloon")
@js.native
class GEAbstractBalloon () extends js.Object {
  /**
    * When true, the balloon frame is displayed with a button that the user
    * can click to close the balloon. When false, the balloon frame is just 
    * a plain frame.  
    *
    * Default is true.
    */
  def getCloseButtonEnabled(): Boolean = js.native
  /**
    * Determines what the balloon is attached to.
    */
  def getFeature(): KmlFeature = js.native
  /**
    * The ID of the balloon.
    */
  def getId(): String = js.native
  /**
    * Maximum height of the balloon.
    */
  def getMaxHeight(): Double = js.native
  /**
    * Maximum width of the balloon.
    */
  def getMaxWidth(): Double = js.native
  /**
    * Minimum height of the balloon.
    */
  def getMinHeight(): Double = js.native
  /**
    * Minimum width of the balloon.
    */
  def getMinWidth(): Double = js.native
  /**
    * When true, the balloon frame is displayed with a button that the user
    * can click to close the balloon. When false, the balloon frame is just 
    * a plain frame.  
    *
    * Default is true.
    */
  def setCloseButtonEnabled(closeButtonEnabled: Boolean): Unit = js.native
  /**
    * Determines what the balloon is attached to.
    */
  def setFeature(feature: KmlFeature): Unit = js.native
  /**
    * The ID of the balloon.
    */
  def setId(id: String): Unit = js.native
  /**
    * Maximum height of the balloon.
    */
  def setMaxHeight(maxHeight: Double): Unit = js.native
  /**
    * Maximum width of the balloon.
    */
  def setMaxWidth(maxWidth: Double): Unit = js.native
  /**
    * Minimum height of the balloon.
    */
  def setMinHeight(minHeight: Double): Unit = js.native
  /**
    * Minimum width of the balloon.
    */
  def setMinWidth(minWidth: Double): Unit = js.native
}

