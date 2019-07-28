package typings.googleDashEarth.googleNs.earthNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.earth.KmlContainer")
@js.native
class KmlContainer () extends KmlFeature {
  /**
    * Get an element by ID.
    * This is functionally equivalent to getElementByUrl with an unspecified base URL.
    *
    * For example: getElementByUrl('#foo').
    *
    * Usage is when finding objects created with JavaScript, which have unspecified base URLs.
    * The object must be a descendant of the container before it can be found.
    */
  def getElementById(id: String): KmlObject = js.native
  /**
    * Get an element by URL. A URL consists of the base address and ID, joined with the # character. 
    *
    * For example: http://www.google.com/bar.kml#here_be_monsters 
    *
    * This applies to objects that are fetched.
    * In the case of plugin created objects, the URL is simply #foo.
    * The object must be a descendant of the container before it can be found.
    */
  def getElementByUrl(url: String): KmlObject = js.native
  /**
    * Get an element by type.
    */
  def getElementsByType(`type`: String): KmlObjectList[KmlObject] = js.native
  /**
    * A collection of features, such as name, description, and so on.
    */
  def getFeatures(): GEFeatureContainer = js.native
}

