package typings.googleDashEarth.googleNs.earthNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.earth.KmlOverlay")
@js.native
class KmlOverlay () extends KmlFeature {
  /**
    * Specifies the color values.
    */
  def getColor(): KmlColor = js.native
  /**
    * Defines the stacking order for the images in overlapping overlays.
    * Overlays with higher drawOrder values are drawn on top of overlays with lower drawOrder values.
    */
  def getDrawOrder(): Double = js.native
  /**
    * Defines the image associated with the Overlay.
    */
  def getIcon(): KmlIcon = js.native
  /**
    * Defines the stacking order for the images in overlapping overlays.
    * Overlays with higher drawOrder values are drawn on top of overlays with lower drawOrder values.
    */
  def setDrawOrder(drawOrder: Double): Unit = js.native
  /**
    * Defines the image associated with the Overlay.
    */
  def setIcon(icon: KmlIcon): Unit = js.native
}

