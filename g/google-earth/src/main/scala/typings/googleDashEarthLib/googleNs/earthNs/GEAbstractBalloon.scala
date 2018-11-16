package typings
package googleDashEarthLib.googleNs.earthNs

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
  def getCloseButtonEnabled(): scala.Boolean = js.native
  /**
       * Determines what the balloon is attached to.
       */
  def getFeature(): KmlFeature = js.native
  /**
       * The ID of the balloon.
       */
  def getId(): java.lang.String = js.native
  /**
       * Maximum height of the balloon.
       */
  def getMaxHeight(): scala.Double = js.native
  /**
       * Maximum width of the balloon.
       */
  def getMaxWidth(): scala.Double = js.native
  /**
       * Minimum height of the balloon.
       */
  def getMinHeight(): scala.Double = js.native
  /**
       * Minimum width of the balloon.
       */
  def getMinWidth(): scala.Double = js.native
  /**
       * When true, the balloon frame is displayed with a button that the user
       * can click to close the balloon. When false, the balloon frame is just 
       * a plain frame.  
       *
       * Default is true.
       */
  def setCloseButtonEnabled(closeButtonEnabled: scala.Boolean): scala.Unit = js.native
  /**
       * Determines what the balloon is attached to.
       */
  def setFeature(feature: KmlFeature): scala.Unit = js.native
  /**
       * The ID of the balloon.
       */
  def setId(id: java.lang.String): scala.Unit = js.native
  /**
       * Maximum height of the balloon.
       */
  def setMaxHeight(maxHeight: scala.Double): scala.Unit = js.native
  /**
       * Maximum width of the balloon.
       */
  def setMaxWidth(maxWidth: scala.Double): scala.Unit = js.native
  /**
       * Minimum height of the balloon.
       */
  def setMinHeight(minHeight: scala.Double): scala.Unit = js.native
  /**
       * Minimum width of the balloon.
       */
  def setMinWidth(minWidth: scala.Double): scala.Unit = js.native
}

