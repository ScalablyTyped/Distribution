package typings.googleEarth.google.earth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.earth.KmlStyleMap")
@js.native
class KmlStyleMap () extends KmlObject {
  /**
    * Defines highlighted styles for a placemark, so that the highlighted version appears when the user mouses over the icon in Google Earth.
    */
  def getHighlightStyle(): KmlStyle = js.native
  /**
    * Defines highlighted styles for a placemark, so that the highlighted version appears when the user mouses over the icon in Google Earth.
    */
  def getHighlightStyleUrl(): String = js.native
  /**
    * Defines a normal style for a placemark.
    */
  def getNormalStyle(): KmlStyle = js.native
  /**
    * Defines a normal style for a placemark.
    */
  def getNormalStyleUrl(): String = js.native
  /**
    * Defines highlighted styles for a placemark, so that the highlighted version appears when the user mouses over the icon in Google Earth.
    */
  def setHighlightStyle(highlightStyle: KmlStyle): Unit = js.native
  /**
    * Defines highlighted styles for a placemark, so that the highlighted version appears when the user mouses over the icon in Google Earth.
    */
  def setHighlightStyleUrl(highlightStyleUrl: String): Unit = js.native
  /**
    * Defines a normal style for a placemark.
    */
  def setNormalStyle(normalStyle: KmlStyle): Unit = js.native
  /**
    * Defines a normal style for a placemark.
    */
  def setNormalStyleUrl(normalStyleUrl: String): Unit = js.native
  /**
    * Sets both placemark styles.
    */
  def setStyle(normalStyle: KmlStyle, highlightStyle: KmlStyle): Unit = js.native
  /**
    * Sets both URLs for the placemark style.
    */
  def setUrl(normalStyleUrl: String, highlightStyleUrl: String): Unit = js.native
}

