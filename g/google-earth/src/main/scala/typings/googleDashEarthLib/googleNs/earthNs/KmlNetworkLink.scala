package typings
package googleDashEarthLib.googleNs.earthNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.earth.KmlNetworkLink")
@js.native
class KmlNetworkLink () extends KmlFeature {
  /**
       * A value of 1 causes Google Earth to fly to the view of the LookAt or Camera in the NetworkLinkControl (if it exists).
       */
  def getFlyToView(): scala.Boolean = js.native
  /**
       * Specifies the location of any of the following:
       *
       * * KML files fetched by network links
       * * Image files used by icons in icon styles, ground overlays, and screen overlays
       * * Model files used in the Model object
       */
  def getLink(): KmlLink = js.native
  /**
       * A value of 0 leaves the visibility of features within the control of the Google Earth user.
       * Set the value to 1 to reset the visibility of features each time the NetworkLink is refreshed.
       * For example, suppose a Placemark within the linked KML file has visibility set to 1 and the NetworkLink has refreshVisibility set to 1.
       * When the file is first loaded into Google Earth, the user can clear the check box next to the item to turn off display in the 3D viewer.
       * However, when the NetworkLink is refreshed, the Placemark will be made visible again, since its original visibility state was TRUE.
       */
  def getRefreshVisibility(): scala.Boolean = js.native
  /**
       * Sets the link, refreshVisibility, and flyToView for the network link.
       */
  def set(link: KmlLink, refreshVisibility: scala.Boolean, flyToView: scala.Boolean): scala.Unit = js.native
  /**
       * A value of 1 causes Google Earth to fly to the view of the LookAt or Camera in the NetworkLinkControl (if it exists).
       */
  def setFlyToView(flyToView: scala.Boolean): scala.Unit = js.native
  /**
       * Specifies the location of any of the following:
       *
       * * KML files fetched by network links
       * * Image files used by icons in icon styles, ground overlays, and screen overlays
       * * Model files used in the Model object
       */
  def setLink(link: KmlLink): scala.Unit = js.native
  /**
       * A value of 0 leaves the visibility of features within the control of the Google Earth user.
       * Set the value to 1 to reset the visibility of features each time the NetworkLink is refreshed.
       * For example, suppose a Placemark within the linked KML file has visibility set to 1 and the NetworkLink has refreshVisibility set to 1.
       * When the file is first loaded into Google Earth, the user can clear the check box next to the item to turn off display in the 3D viewer.
       * However, when the NetworkLink is refreshed, the Placemark will be made visible again, since its original visibility state was TRUE.
       */
  def setRefreshVisibility(refreshVisibility: scala.Boolean): scala.Unit = js.native
}

