package typings
package googleDashEarthLib.googleNs.earthNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.earth.KmlStyleMap")
@js.native
class KmlStyleMap () extends KmlStyleSelector {
  /**
       * Defines highlighted styles for a placemark, so that the highlighted version appears when the user mouses over the icon in Google Earth.
       */
  def getHighlightStyle(): KmlStyle = js.native
  /**
       * Defines highlighted styles for a placemark, so that the highlighted version appears when the user mouses over the icon in Google Earth.
       */
  def getHighlightStyleUrl(): java.lang.String = js.native
  /**
       * Defines a normal style for a placemark.
       */
  def getNormalStyle(): KmlStyle = js.native
  /**
       * Defines a normal style for a placemark.
       */
  def getNormalStyleUrl(): java.lang.String = js.native
  /**
       * Defines highlighted styles for a placemark, so that the highlighted version appears when the user mouses over the icon in Google Earth.
       */
  def setHighlightStyle(highlightStyle: KmlStyle): scala.Unit = js.native
  /**
       * Defines highlighted styles for a placemark, so that the highlighted version appears when the user mouses over the icon in Google Earth.
       */
  def setHighlightStyleUrl(highlightStyleUrl: java.lang.String): scala.Unit = js.native
  /**
       * Defines a normal style for a placemark.
       */
  def setNormalStyle(normalStyle: KmlStyle): scala.Unit = js.native
  /**
       * Defines a normal style for a placemark.
       */
  def setNormalStyleUrl(normalStyleUrl: java.lang.String): scala.Unit = js.native
  /**
       * Sets both placemark styles.
       */
  def setStyle(normalStyle: KmlStyle, highlightStyle: KmlStyle): scala.Unit = js.native
  /**
       * Sets both URLs for the placemark style.
       */
  def setUrl(normalStyleUrl: java.lang.String, highlightStyleUrl: java.lang.String): scala.Unit = js.native
}

