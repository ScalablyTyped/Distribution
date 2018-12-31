package typings
package googleDashEarthLib.googleNs.earthNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.earth.KmlRegion")
@js.native
class KmlRegion () extends KmlObject {
  /**
    * A bounding box that describes an area of interest defined by geographic coordinates and altitudes.
    */
  def getLatLonAltBox(): KmlLatLonAltBox = js.native
  /**
    * LOD is an abbreviation for Level of Detail.
    * Lod describes the size of the projected region on the screen that is required in order for the region to be considered "active.
    * " Also specifies the size of the pixel ramp used for fading in (from transparent to opaque) and fading out (from opaque to transparent).
    */
  def getLod(): KmlLod = js.native
  /**
    * Sets the latLonAltBox and lod for the region.
    */
  def set(latLonAltBox: KmlLatLonAltBox, lod: KmlLod): scala.Unit = js.native
  /**
    * A bounding box that describes an area of interest defined by geographic coordinates and altitudes.
    */
  def setLatLonAltBox(latLonAltBox: KmlLatLonAltBox): scala.Unit = js.native
  /**
    * LOD is an abbreviation for Level of Detail.
    * Lod describes the size of the projected region on the screen that is required in order for the region to be considered "active.
    * " Also specifies the size of the pixel ramp used for fading in (from transparent to opaque) and fading out (from opaque to transparent).
    */
  def setLod(lod: KmlLod): scala.Unit = js.native
}

