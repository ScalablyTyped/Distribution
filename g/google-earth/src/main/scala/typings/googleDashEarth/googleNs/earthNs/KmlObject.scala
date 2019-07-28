package typings.googleDashEarth.googleNs.earthNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.earth.KmlObject")
@js.native
class KmlObject () extends GEEventEmitter {
  /**
    * Test whether this object is the same as another object.
    * Useful for Chrome and Safari, where the comparison a==b sometimes fails for plugin objects.
    */
  def equals(compareTo: KmlObject): Boolean = js.native
  /**
    * The unique ID of the KML object.
    */
  def getId(): String = js.native
  /**
    * The document that owns the KML object.
    */
  def getOwnerDocument(): KmlDocument = js.native
  /**
    * The parent node of the KML object.
    */
  def getParentNode(): KmlObject = js.native
  /**
    * The interface name (i.e. 'KmlPlacemark') of the object.
    */
  def getType(): String = js.native
  /**
    * The unique URL of the KML object.
    * This is the base address joined with the ID using the # character.
    *
    * For example: http://www.google.com/bar.kml#atlantis
    */
  def getUrl(): String = js.native
  /**
    * Permanently deletes an object, allowing its ID to be reused.
    * Attempting to access the object once it is released will result in an error.
    */
  def release(): Unit = js.native
}

